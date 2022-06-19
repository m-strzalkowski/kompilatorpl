package pl.plpl.generatory;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import pl.plpl.bledy.SemanticOccurence;
import pl.plpl.generatory.klasyDanych.*;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektAutomatyczny;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektStatyczny;
import pl.plpl.parser.plplBaseListener;
import pl.plpl.parser.plplParser;

import java.lang.reflect.Method;
import java.util.Objects;

import static java.lang.System.exit;
import static pl.plpl.generatory.Tablice.typPoNazwie;
import static pl.plpl.generatory.Tablice.typy;

/*
Ten listener ma sie zająć ustaleniem struktur pamięci, aby przy generacji kodu znane były adresy/etykiety obiektów
żeby w generatorze można było napisać: dajSymbol(zakres, nazwa) albo reprezentacjaSymbolu(zakres, nazwa)
Jednak żeby to uzyskać, trzeba najpierw przetworzyć wszystkie deklaracje i porobić zakresy, a konkretnie:
 + wchodząc do procedury/instrukcji złożonej/
                                              *deklaracji typu? zrobić nowy zakres mający za rodzica aktualny
 + wychodząc z powyższych przestawić aktualny zakres na wyższy
                                               *wychodznie z deklaracji typu
 + Wchodząc do deklaracji w procedurze przetworzyć ją: dodać symbol do zakresu, kod do bss, * jakiś global; +ewentualnie zainicjalizować, ustawić etykietę, dodać kod do data/ *rodata.
 * Wchodząc do instrukcji wkroczenia przetworzyć liste parametrów
 + Sygalizować podwójną deklarację
 * Przetworzyc deklarację w deklaracji nowego typu, przetwarzać je inaczej niż w procedurach, zmienić gramatykę?
 * Wychodząc z deklaracji nowego typu podliczyć przesunięcia adresów dla składowych i zapisać
 * Wychodząc z deklaracji procedury przetrawić argumenty i zmienne lokalne i ustalić ramkę stosu.
 */
public class UstalaczStruktur extends plplBaseListener {

    public Zakres getAktualnyZakres() {return aktualnyZakres;}
    public UstalaczStruktur(plplParser parser) {this.parser = parser;}

    @Override public void enterProgram(plplParser.ProgramContext ctx) {
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "POCZĄTEK USTALANIA STRUKTUR"));
        aktualnyZakres = Tablice.zakres_globalny;
    }
    @Override public void exitProgram(plplParser.ProgramContext ctx) {
        if(Tablice.znaleziono_pkt_we_programu == false)
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.INFO, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Nie znaleziono punktu wejściowego do programu ('zacznij program')"
            ));
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                "KONIEC USTALANIA STRUKTUR"));
    }

    /**
     * Obsługuje wejście do procedury - zmienia aktualną proceurę i tworzy zakres
     */
    @Override public void enterProcedura(plplParser.ProceduraContext ctx) {
        Procedura p = new Procedura(ctx.getStart());
        Tablice.procedury.add(p);
        aktualnyZakres = new Zakres(aktualnyZakres, p, ctx.getStart());
        Tablice.dodajZakres(aktualnyZakres);
        p.najogolniejszy_zakres = aktualnyZakres;
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "dodano procedurę "+p.nr+" i zakres "+ aktualnyZakres.nr));
    }
    /**
     * Obsługuje wyjście z procedury - zmienia aktualną proceurę i zakres na nadrzędne
     * Wywołuje Procedura.przeliczStruktury() - ustala ramkę
     */
    @Override public void exitProcedura(plplParser.ProceduraContext ctx) {
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                "wyjście z procedury "+aktualnyZakres.procedura.nr+" i zakresu:"+aktualnyZakres.nr+"->"+aktualnyZakres.nadrzedny.nr));

        if(aktualnyZakres == null) {Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
                SemanticOccurence.Level.FATAL,
                ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                "Analizator semantyczny rozpozanł wyjście do wyższego zakresu, a jest już w globalnym"
        ));}
        //procedura musi sobie ustawić wszyskie deklaracje
        aktualnyZakres.procedura.przeliczStruktury();
        /*
        //TODO: SKASOWAĆ
        try {
            Object[] args = new Object[1]; args[0] = ctx;
            Tablice.debuger_kompilatora.zmuś=true;
            Tablice.debuger_kompilatora.krok(this, true, plplBaseListener.class.getMethod("exitProcedura", plplParser.ProceduraContext.class), args);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            exit(1);
        }
        */

        //co jeśli nie ma wejśc do procedury?
        if(aktualnyZakres.procedura.wejscia.size() < 1)
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Procedura bez punktów wejściowych, co to ma znaczyć?"
            ));

        //wyjście do wyższego zakresu
        aktualnyZakres = aktualnyZakres.nadrzedny;
    }
    /**
     * Obsługuje wejscie do nowego zakresu - tworzy go i ustawia jako aktualny
     */
    @Override public void enterInstrukcja_zlozona(plplParser.Instrukcja_zlozonaContext ctx) {
        aktualnyZakres = new Zakres(aktualnyZakres, aktualnyZakres.procedura, ctx.getStart());
        Tablice.dodajZakres(aktualnyZakres);
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "dodano zakres"+aktualnyZakres.toString()));
    }
    /**
     * Obsługuje wyjście z zakresu - zmienia na nadrzędny
     */
    @Override public void exitInstrukcja_zlozona(plplParser.Instrukcja_zlozonaContext ctx) {
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                "wyjście z zakresu:"+aktualnyZakres.nr+"->"+aktualnyZakres.nadrzedny.nr));

        if(aktualnyZakres == null) {Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
                SemanticOccurence.Level.FATAL,
                ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                "Analizator semantyczny rozpoznał wyjście do wyższego zakresu, a jest już w globalnym"
        ));}
        if(aktualnyZakres.procedura!=null){aktualnyZakres.procedura.zamknieta_zwroc=false;}
        aktualnyZakres = aktualnyZakres.nadrzedny;
    }



    /*
        MASZYNA ZAKRESÓW
     */
    ////////////
    //SKŁADOWE//
    ////////////
    plplParser parser;
    private Zakres aktualnyZakres;
    //Dwie rzeczy, które umożliwią, żeby odpowiednik for(int i;i<k;i++){i+=1;} miał rację bytu - coś innego mogło wcześniej zacząć odpowiedni zakres.
    ParserRuleContext ostatniTworcaZakresu=null;
    ParserRuleContext ostatniPominietyWasatyNawias=null;

    /*
        MASZYNA DEKLARACJI
     */
    private PelnyTyp aktualnyTyp=null;
    private PunktWejsciowy aktualnyPunkt=null;
    private Struktura aktualnaStruktura=null;
    int offset_w_hierarchii_zakresow = 0;//1 - symbole mają powstawać zakres wyżej niż powinny, na przykład nazwy punktów wejściowych. Uwaga, to nie jest jedyne źródło przesunięcia,  niektóre rzeczy powstają w najogólniejszym zakresie swoje procedury. (dlaczego dodawac jeszcze to? Bo aktualnyZakres nie jest częścią maszyny deklaracji, tylko maszyny zakresów. Stan maszyny zakresów nie powinien się zmieniać przy przetwarzaniu deklaracji, więc najlepiej go w ogóle nie ruszać)
    //powód powyższego: maszyna deklaracji nie powinna ruszać maszyny zakresów
    /** Zwraca ten sam zakres lub odpowiedniego przodka w drzewie zakresów, na podstawie stanu maszyny deklaracji.
     * @param z zakres od którego należy zacząć (uwaga:za przesunięcie w hierarchii bierze offset_w_hierarchii_zakresow maszyny deklaracji)
     * @return zakres ten sam/ przesunięty w hierarchii względem z
     */
    private Zakres przesunietyZakres(Zakres z){
        //System.err.println("\n\nOFS:"+offset_w_hierarchii_zakresow+"z.nr:"+z.nr);
        Zakres w = z;
        //składowe, nazwy punktów wejściowych i parametry formalne związane są z zakresem procedury/struktury a nie jakimś lokalnym potomnym
        if( aktualnaStruktura != null || aktualnyPunkt != null || aktualnyTyp.parametr_formalny){w = w.procedura.najogolniejszy_zakres;}
        //if(aktualnyTyp.typ == Typ.Pkt){w=w.procedura.najogolniejszy_zakres.nadrzedny;}
        //tyle, że należy uwzględnić ewentualne przesunięcie (dla nazw punktów wejściowych, ew. przez przydomek /publiczny/), które sprawi,że nazwa wyląduje zakres wyżej
        for(int i=offset_w_hierarchii_zakresow; i>0; i--)
        {
            w = w.nadrzedny;
        }
        //System.err.println("\n\nw.nr:"+w.nr);
        return w;
    }

    /**Ustawia zmienną stanową, aktualnaStruktura, by składowe były wpisywane jako składniki typu złożonego. Ustawia aktualnyZakres na zakres tej struktury
     */
    @Override public void enterDeklaracja_typu(plplParser.Deklaracja_typuContext ctx)
    {
        Typ tp =  typPoNazwie(ctx.ID().getText());//sam typ zostaje dodany przez
        Struktura s = new Struktura(ctx.getStart(), tp);
        //Procedura p = new Procedura(ctx.getStart());

        aktualnyZakres = new Zakres(aktualnyZakres, s, ctx.getStart());
        Tablice.dodajZakres(aktualnyZakres);
        s.najogolniejszy_zakres = aktualnyZakres;
        tp.struktura = s;
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "dodano strukturę "+tp.nazwa+" i zakres "+ aktualnyZakres.nr));

        if(tp==null)Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "Błąd wewnętrzny:natrafiono na deklarację typu o nazwie"+ctx.ID().getText()+" niezarejestrowanego w pierszym przebiegu"));
        aktualnaStruktura = tp.struktura;
    }

    /**Czyści aktualnąStrukturę - obecnie struktury nie mogą być zagnieżdżone.
     */
    @Override public void exitDeklaracja_typu(plplParser.Deklaracja_typuContext ctx){
        aktualnaStruktura.przeliczStruktury();
        aktualnaStruktura = null;
        skończ_deklarację();
        aktualnyZakres=Tablice.zakres_globalny;
    }

    /**Robi to, co trzeba na początku każdej deklaracji symbolu,
     * a właściwie procesu deklaracyjnego - składającego się ze zbierania wiedzy i emisji symboli i kodu w deklaratorach na podstawie tej wiedzy
     * Zgodnie z gramatyką, wejściami do procesu deklaracji są deklaracja_prosta i instrukcja_wkroczenia
     * aktualnaStruktura jest manipulowana poza procesem deklaracji (wyżej w gramatyce)
     */
    private void zacznij_deklarację()
    {
        aktualnyTyp = new PelnyTyp();
        //Domyślne przydomki typów:
        aktualnyTyp.modyfikowalonosc = PelnyTyp.Mod.ZMIENNA;//domyślnie zmienne są modyfikowalne
        //statyczne/automatyczne:
        if(aktualnyZakres.procedura.nr == Tablice.kod_globalny.nr)//w kodzie globalnym
        {
            aktualnyTyp.rodzaj_pamieci = PelnyTyp.RodzajPam.STATYCZNA;//domyślnie wszytko jest statyczne

        }
        else{//w kodzie każdej normalnej procedury
            aktualnyTyp.rodzaj_pamieci = PelnyTyp.RodzajPam.AUTOMATYCZNA;//zmienne są domyślnie automatyczne
        }
        offset_w_hierarchii_zakresow = 0;
    }
    /**Sprząta po deklaracji symbolu (po procesie deklaracyjnym)
     */
    private void skończ_deklarację()
    {
        aktualnyTyp = null;
        aktualnyPunkt = null;//instrukcja wkroczenia jest w istocie deklaracją na podobnej zasadzie, jak całk i,j,k (tyle, że typ moze byc inny dla każdej zmiennej)
        //aktualna struktura ustalana jest wcześniej
    }

    /*
        MASZYNA DEKLARACJI - ZBIERANIE INFORMACJI
    */

    /**Deklaracja prosta - deklaracja w kodzie, albo w deklaracji typu (strukturze)
     */
    @Override public void enterDeklaracja_prosta(plplParser.Deklaracja_prostaContext ctx) {
        zacznij_deklarację();
    }
    @Override public void exitDeklaracja_prosta(plplParser.Deklaracja_prostaContext ctx) {
        skończ_deklarację();
    }
    /**Dodaje wiedzę o własnościach typu: statyczny/automatyczny, stały
     */
    @Override public void enterPrzydomki(plplParser.PrzydomkiContext ctx) {
        if(ctx.AUTOMATYCZN() != null)
        {
            aktualnyTyp.rodzaj_pamieci = PelnyTyp.RodzajPam.AUTOMATYCZNA;
            if(aktualnyZakres.procedura.nr == Tablice.kod_globalny.nr)//Próba deklaracji zmiennej automatycznej w kodzie globalnym
            {
                Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
                        SemanticOccurence.Level.ERROR,
                        ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                        "Deklaracja zmiennej automatycznej w globalnym kodzie (w wypadku dalszej pracy potraktowana zostanie jako zmienna statyczna)"
                ));
            }
        }
        //zmienne są statyczne, jeśli się to napisze, chyba że w kodzie globalnym, tam są domyślnie statyczne
        if(ctx.STATYCZN()!=null || (aktualnyZakres.procedura.nr == Tablice.kod_globalny.nr)) {aktualnyTyp.rodzaj_pamieci = PelnyTyp.RodzajPam.STATYCZNA;}
        aktualnyTyp.modyfikowalonosc = (ctx.STAL() == null)?(PelnyTyp.Mod.ZMIENNA):(PelnyTyp.Mod.STALA);//zmienne domyślnie są zmienne, chyba, że jest napisane stal.
    }
    /**Ustawia własciwy typ, jako jeden z atomicznych
     */
    @Override public void enterNazwa_typu_atom(plplParser.Nazwa_typu_atomContext ctx) {
        aktualnyTyp.typ = Typ.zTokena(ctx.getStart());
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "Odczytano typ atomiczny:"+aktualnyTyp.typ.nazwa));
    }
    /**Ustawia własciwy typ, jako jeden ze zdefiniowanych przez użytkownika
     * * Wywala błąd, jeśli nie ma takiego zdefiniowaneo typu
     */
    @Override public void enterPelny_typ(plplParser.Pelny_typContext ctx) {
        //Określenie typu (podstawowego)
        String nzw=null;
        aktualnyTyp.typ = null;
        if(ctx.ID() != null)
        {nzw = ctx.ID().getText(); aktualnyTyp.typ = Tablice.typPoNazwie(nzw);}
        if(ctx.nazwa_typu_atom() != null)
        {nzw = ctx.nazwa_typu_atom().getStart().getText(); aktualnyTyp.typ = Typ.zTokena(ctx.nazwa_typu_atom().getStart());}
        if(aktualnyTyp.typ == null)
        {
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                    "Niezdefiniowany typ:"+nzw));
        }
        aktualnyTyp.dlugosc_tablicy = -1;//nie wiadomo
        aktualnyTyp.krotnosc_tablicowa =0;
        //Określanie pełnego typu
        aktualnyTyp.krotnosc_tablicowa += ctx.nieokreslony_deklarator_tablicowy().size();
        if(ctx.okreslony_deklarator_tablicowy() != null)
        {
            aktualnyTyp.krotnosc_tablicowa +=1;
            //TODO: ZAMIENIĆ NA WYRAŻENIE I UZYĆ WEWNĘTRZNEGO KALKULATORA (JAK SIE NIE UDA, TO FATAL)
            aktualnyTyp.dlugosc_tablicy = Integer.parseInt( ctx.okreslony_deklarator_tablicowy().CALK().getText());
        }

        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "Odczytano typ złożony:"+aktualnyTyp.typ.nazwa));

    }

    /*
        MASZYNA DEKLARACJI - DEKLARATORY: EMISJA SYMBOLI I KODU NA PODSTAWIE ZEBRANYCH INFORMACJI
    */

    /**Kawałek kodu wspólny wszystkim deklaratorom, powodujacy właściwe dodanie symbolu do właściwego zakresu (albo niedodanie w przypadku dozwolonej redeklaracji, albo zgon kompilatora w przypadku niedozwolonej)
     Potrzebuje nazwy, tokenu - do zaznaczenia miejsca pierwszego wystąpienia i kontekstu do generowania błędów
     Typ bierze z aktualnego typu, zakres z aktualnego zakresu i offsetu (używa przesuniętyZakres(aktualnyZakres))
     */
    Symbol dodanie_samego_symbolu(String nazwa, Token wystapienie, ParserRuleContext ctx)//???
    {
        //Do jakiego zakresu dodac symbol?
        //zmienne nie-parametry: do aktualnego, parametry i składowe struktur - do najogolniejszego zakresu procedury
        //składowe, nazwy punktów wejściowych i parametry formalne związane są z zakresem procedury/struktury a nie akimś lokalnym potomnym
        Zakres zakres_docelowy = przesunietyZakres(aktualnyZakres);

        //Czy nazwa się powtarza (albo jak, jeśli może), sprawdzenie zależne od stanu maszyny deklaracji, sprawdzenie zwraca jużi stniejacy symbol w razie redeklaracji
        Symbol sym =  sprawdzanie_redeklaracji_zaleznie_od_stanu(nazwa, aktualnyTyp, zakres_docelowy, ctx);
        if(sym==null)
        {
            //Tworzenie nowego symbolu i dodanie (jeśli zachowano reguły redeklaracji, bo inaczej powyższe sprawdzanie redeklaracji emituje błąd i ewentualnie ubija kompilator)
            //Każdy symbol dotaje swój klon obiektu PelnyTyp, dlatego można zmieniać stan aktualnegoTypu do woli, nie wpłynie to na wygenerowane już symbole
            sym = new Symbol(nazwa, wystapienie, zakres_docelowy, aktualnyTyp.clone());
            zakres_docelowy.dodajSymbol(sym);
        }

        //TODO Podpinanie do punktu wejściowego, jeśli to parametr formalny
        if(sym.pelnyTyp.parametr_formalny)
        {
            if(aktualnyPunkt == null)throw new RuntimeException("Błąd wewnętrzny: symbol"+sym.identyfikator+ "miał być parametrem formalnym, a aktualny punkt wejściowy == null");
            //TODO
            //punkt wejściowy potrafi przypiąć sobie symbol
            aktualnyPunkt.przypnijParametr(sym);
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                    "Próba przypięcia symbolu jako parametru:"+sym.toString()+" do punktu "+ aktualnyPunkt.nazwa));
        }
        return sym;
    }
    /**Ma:
     * + Wyprodukować symbol w odpowiednim zakresie
     * * Podpiąć symbol do punktu wejściowego, jeśli trzeba
     * * Wyemitować asembler do .bss: ETYKIETA: resb x; - jeśli symbol jest statyczny
     */
    @Override public void enterDeklarator_bez_przypisania(plplParser.Deklarator_bez_przypisaniaContext ctx) {
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "Deklarator bez przypisania:początek"));

        //sprawdzanie sensowności przydomków
        if( aktualnyTyp.modyfikowalonosc== PelnyTyp.Mod.STALA)
        {
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Atomiczna stała "+ctx.ID().getText()+" zadeklarowana bez przypisania (jak nadać jej jakąkolwiek wartość?)"));
        }

        //Jaką nazwę mamy dodać?
        String nazwa = ctx.ID().getText();
        //Jakie jest pierwsze wystąpienie?
        Token wystąpienie = ctx.ID().getSymbol();
        //Podstawowa część deklaracji
        Symbol sym =  dodanie_samego_symbolu(nazwa, wystąpienie, ctx);

        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "Deklarator bez przypisania:dodano symbol:"+sym.toString()));


        //Emisja kodu, jeśli symbol jest statyczny
        if(sym.pelnyTyp.rodzaj_pamieci == PelnyTyp.RodzajPam.STATYCZNA)
        {
            //@ASM
            //dodj niezainicjalizowane miejsce długie na ileś bajtów opatrzone etykietą
            aktualnyZakres.procedura.bss.append(sym.etykieta()).append(":   resb    ").append(sym.pelnyTyp.rozmiar_B()).append(";").append(sym.identyfikator).append("\n");
        }
        else {//automatyczna
            //nie następuje emisja żadnego kodu
        }
    }
    /**Deklarator atomiczny z przypisaniem ma:
     * * Wyprodukować symbol w odpowiednim zakresie
     * * Podpiąć symbol do punktu wejściowego, jeśli trzeba
     * (czyli to, co deklaracja bez przypisania w pierwszych 2 pkt)
     *
     * * Jeśli symbol jest statyczny:
     *   * Sprawdzić, czy da się obliczyć wartość przypisania podczas kompilacji
     *      *Jeśli nie - ustawić inicjalizowany=false i cos jeszcze, by powiadomić generator kodu o konieczności emisji instrukcji
     *      *Jeśli da się obliczyc podczas kompilacji:
     *          *Wyemitować odpowiedni asembler w .data : ETYKIETA: dd/db `ala`/12 więc:
     *              * Dla całk
     *              * Dla rzeczyw (zmiennoprzecinkowe)
     *              * Dla znak (dosłownych stałych znakowych)
     *
     * * (Jeśli symbol automatyczny:
     *      * Ustawić informacje dla generatora o konieczności emisji kodu)
     */
    @Override public void enterDeklarator_atomiczny_z_przypisaniem(plplParser.Deklarator_atomiczny_z_przypisaniemContext ctx) {
        //Jaką nazwę mamy dodać?
        String nazwa = ctx.ID().getText();
        //Jakie jest pierwsze wystąpienie?
        Token wystąpienie = ctx.ID().getSymbol();
        //Podstawowa część deklaracji
        Symbol sym =  dodanie_samego_symbolu(nazwa, wystąpienie, ctx);

        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "Deklarator z przypisaniem:dodano symbol:"+sym.toString()));
        //Ściana kodu dla inicjalizacji typów podstawowych
        if(aktualnyTyp.rodzaj_pamieci== PelnyTyp.RodzajPam.STATYCZNA && aktualnyTyp.krotnosc_tablicowa == 0)
        {
            sym.pelnyTyp.inicjalizowana = true;
            if(ctx.CALK()!=null)
            {
                if(aktualnyTyp.typ != Typ.Całk)Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
                        SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                        "Nie da sie zainicjalizować literałem całkowitym zmiennej o typie"+aktualnyTyp.typ
                ));else{
                    try{
                        Integer.parseInt(ctx.CALK().getText());
                    }
                    catch (NumberFormatException e)
                    {
                        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                                "Nieprawidłowa liczba całkowita:"+ctx.CALK().getText()));
                    }
                    //@ASM
                    //dodaj zainicjalizowaną liczbę całk. (int32)
                    aktualnyZakres.procedura.data.append(sym.etykieta()).append(":   dd    ").append(ctx.CALK().getText()).append(";").append(sym.identyfikator).append("\n");
                }

                //System.out.println("INICJ CALKOWITA"+ctx.CALK().getText());
            }
            if(ctx.ZMIENN()!=null)
            {
                if(aktualnyTyp.typ != Typ.Rzeczyw)Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
                        SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                        "Nie da sie zainicjalizować literałem zmiennoprzecinkowym zmiennej o typie"+aktualnyTyp.typ
                ));else{
                    try{
                        Double.parseDouble(ctx.ZMIENN().getText());
                    }
                    catch (NumberFormatException e)
                    {
                        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                                "Nieprawidłowa liczba zmiennopozycyjna:"+ctx.ZMIENN().getText()));
                    }
                    //@ASM
                    //dodaj zainicjalizowaną liczbę całk. (int32)
                    aktualnyZakres.procedura.data.append(sym.etykieta()).append(":   dd    ").append(ctx.ZMIENN().getText()).append(";").append(sym.identyfikator).append("\n");
                }

            }
            if(ctx.ZNAK_DOSL()!=null)
            {
                if(aktualnyTyp.typ != Typ.Znak)Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
                        SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                        "Nie da sie zainicjalizować znakiem dosłownym zmiennej o typie"+aktualnyTyp.typ
                ));else{
                    //@ASM
                    //dodaj zainicjalizowaną liczbę całk. (int32)
                    aktualnyZakres.procedura.data.append(sym.etykieta()).append(":   db    ").append(ctx.ZNAK_DOSL().getText()).append(";").append(sym.identyfikator).append("\n");
                }
                //System.out.println("INICJ ZNAK"+ctx.ZNAK_DOSL().getText());
            }

        }
        else//zmienna automatyczna - generator potem powinien wygenerowac kod
        {
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
                    SemanticOccurence.Level.FATAL, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                    "Deklaracje zmiennych automatycznych z przypisaniem jeszcze nie zaimplementowane..."
            ));
        }
    }

    /**Deklarator złożony z przypisaniem ma w skrócie wyprodukować symbol i powiązać referencję nim będącą z obiektem pamięci, czyli:
     * * Wyprodukować symbol w odpowiednim zakresie
     * * Podpiąć symbol do punktu wejściowego, jeśli trzeba
     * (czyli to, co deklaracja bez przypisania w pierwszych 2 pkt)
     *
     * * Jeśli symbol jest statyczny:
     *   * Sprawdzić, czy da się obliczyć wartość przypisania podczas kompilacji
     *      *Jeśli nie - ustawić inicjalizowany=false i cos jeszcze, by powiadomić generator kodu o konieczności emisji instrukcji
     *      *Jeśli da się obliczyc podczas kompilacji:
     *          *Dla dyrektywy statycznej alokacji (/coś/):
     *              * Wygenerować odpowiedni obiekt pamięci opatrzony zapamięaną etykietą
     *          *Wyemitować odpowiedni asembler w .data : ETYKIETA: dd INNA_ETYKIETA: (INNA_ETYKIETA z literału: nic/coś/inny symbol po nazwie)
     *
     * * (Jeśli symbol automatyczny:
     *      * Ustawić informacje dla generatora o konieczności emisji kodu)
     */
    @Override public void exitDeklarator_zlozony_z_przypisaniem(plplParser.Deklarator_zlozony_z_przypisaniemContext ctx) {
        //Jaką nazwę mamy dodać?
        String nazwa = ctx.ID().getText();
        //Jakie jest pierwsze wystąpienie?
        Token wystąpienie = ctx.ID().getSymbol();
        //Podstawowa część deklaracji
        Symbol sym =  dodanie_samego_symbolu(nazwa, wystąpienie, ctx);
        //Jeśli jest to jednowymiarowa statyczna tablica
        if(sym.pelnyTyp.rodzaj_pamieci== PelnyTyp.RodzajPam.STATYCZNA && sym.pelnyTyp.krotnosc_tablicowa == 1 && sym.pelnyTyp.dlugosc_tablicy == -1)
        {
            //jeśli to napis dosłowny
            if(ctx.stala_tablicowa().NAPIS_DOSL() != null)
            {

                Symbol literal =  aktualnyZakres.poTokenie(ctx.stala_tablicowa().NAPIS_DOSL().getSymbol());
                if(literal == null){return;}
                sym.pelnyTyp.inicjalizowana = true;
                //@ASM
                //dodaj zainicjalizowaną referencję
                aktualnyZakres.procedura.data.append(sym.etykieta()).append(":   dd    ").append(literal.etykieta()).append(";").append(sym.identyfikator).append("\n");
                //return;
            }
        }
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
                SemanticOccurence.Level.FATAL, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "Deklaracje zmiennych z przypisaniem jeszcze nie zaimplementowane... Użyj jawnego przypisania: "+nazwa+"=...;"
                //Zostawiłem tu fatalny błąd, bo kod po prawej stronie = się nie generuje potem, co prowadzi do strasznie cięąkich do rozpoznania efektów przy wywołaniu.
        ));
    }
    /*
        MASZYNA DEKLARACJI - ułomny proces deklaracyjny do dodawania typu zwracanego przez funkcję
     */
    @Override public void enterTyp_zwracany(plplParser.Typ_zwracanyContext ctx) {
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "POCZĄTEK ZBIERANIA TYPU ZWRACANEGO"));
        zacznij_deklarację();
    }
    /*Pełny typ jest opisany wyżej i ustawi aktualnyTyp*/
    @Override public void exitTyp_zwracany(plplParser.Typ_zwracanyContext ctx) {
        aktualnyZakres.procedura.typZwracany = aktualnyTyp;
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                "KONIEC ZBIERANIA TYPU ZWRACANEGO:"+aktualnyTyp));
        skończ_deklarację();
    }

    /*
        MASZYNA DEKLARACJI - różne inne rzeczy
     */

    /*
    SPRAWDZANIE REDEKLARACJI
    zwykłe zmienne: redeklaracja zabroniona
    zmienne - parametry: redeklaracja dozwolona na liście parametrów, o ile typy sie zgadzają (aktualnypunkt!=null), nie mile widziana wszędzie indziej
    składowe - redeklaracja zabroniona (chyba, żeby zrobić dziedziczenie)
     */

    /**funkcja wybierająca przypadek sprawdzania redeklaracji, zależnie od stanu maszyny deklaracji
     *
     * @param id  string nazwy, jaką sprawdzamy
     * @param aktualnyTyp   Typ nazwy (ewentualne dozwolone redeklaracje mogą zajść wyłącznie, gdy typ zgadza sę w obu miejscach)
     * @param zakres_docelowy - zakres w którym będzie sprawdzana redeklaracja
     * @param ctx Kontekst, potrzebny do informacji o linii, przy informowaniu o ewentualnych błędach
     * @return Redeklarowany symbol, jeśli jest to dozwolone, albo null, jeśli nie ma redeklaracji
     */
    private Symbol sprawdzanie_redeklaracji_zaleznie_od_stanu(String id, PelnyTyp aktualnyTyp,  Zakres zakres_docelowy, ParserRuleContext ctx)
    {
        //normalny kod w procedurze/na liście parametrów formalnych
        if( aktualnaStruktura == null && aktualnyTyp.typ != Typ.Pkt){return sprawdzanie_redeklaracji_w_kodzie(id,aktualnyTyp,zakres_docelowy, ctx);}
        //deklaracja punktu wejściowego
        if( aktualnaStruktura == null && aktualnyTyp.typ == Typ.Pkt){return sprawdzanie_redeklaracji_punktu_we(id, zakres_docelowy, ctx);}
        //deklaracja składowej
        if(aktualnyPunkt == null && aktualnaStruktura != null){return sprawdzanie_redeklaracji_skladowej(id,aktualnyTyp, zakres_docelowy, ctx);}
        throw new RuntimeException("Nie zaimplementowano tego scenariusza sprawdzania redeklaracji\n"+ this.piszStanMaszynyDeklaracyjnej());
    }

    /** Zwraca null, jeśli redeklaracja nie nastąpiła, albo odpowiedni symbol, jeśli zaszła. Jeśli nowe wystąpienie byłoby parametrem, promuje stary symbol do parametru.
     */
    private Symbol sprawdzanie_redeklaracji_w_kodzie(String id, PelnyTyp aktualnyTyp, Zakres zakres_docelowy,ParserRuleContext ctx) {

        //Drzewo decyzyjne redeklaracji symbolu
        Symbol s=null;
        s=zakres_docelowy.poNazwie_bez_nadrzednych(id);
        if(s != null)//nastąpiła redeklaacja
        {
            if(s.pelnyTyp.rodzaj_pamieci == PelnyTyp.RodzajPam.STATYCZNA)//redeklaracje statycznych w ogóle zabronione
            {
                Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                        "Redeklaracja statycznego symbolu'"+id+"'."
                ));
            }
            else//zmienne automatyczne - dozwolone w niektórych przypadkach
            {
                boolean st_param = s.pelnyTyp.parametr_formalny;//czy stare wystąpienie jest parametrem formalnym?
                boolean nw_param = aktualnyZakres != null;//czy nowe wystąpienie byłoby parametrem formalnym?
                boolean zg_typ = s.pelnyTyp.equalsOpróczByciaParametrem(aktualnyTyp);//czy zachodzi pełna zgodność typów pomiędzy wystąpieniami?
                Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                        "Być może dozwolona redeklaracja identyfikatora '"+id
                ));
                if(!zg_typ)//typy obu wystąpień nie są dokładnie identyczne
                {
                    Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                            "Redeklaracja identyfikatora:"+id+"typ się nie zgadza z poprzednim, nie można kontynuować"+"typy:\n"+ s.pelnyTyp.toString() + "\n"+aktualnyTyp.toString() ));
                }
                else{//typy obu wystąpień się zgadzają
                    if(!nw_param)//nowe wystąpienie poza listą parametrów formalnych
                    {
                        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                                "Redeklaracja identyfikatora '"+id+"' poza listą parametrów formalnych"
                        ));//błąd, ale nie koniecznie fatalny, w wypadku kontunuacji zwrócony zostanie poprzedni symbol do wykorzystania
                    }
                    else{//nowe wystąpienie na liście parametrów formalnych
                        if(!st_param)//stare wystąpienie nie jest parametrem formalnym
                        {
                            //promocja symbolu do parametru formalnego (stary zostaje zwrócony, ale w zmodyfikowanym stanie)
                            s.pelnyTyp.parametr_formalny = true;
                            aktualnyPunkt.przypnijParametr(s);
                            //System.exit(44);
                        }
                    }
                }
            }
        }

        return s;
    }
    private Symbol sprawdzanie_redeklaracji_skladowej(String id,PelnyTyp aktualnyTyp,Zakres zakres_docelowy,ParserRuleContext ctx)
    {
        return sprawdzanie_redeklaracji_w_kodzie(id, aktualnyTyp, zakres_docelowy, ctx);
        /*
        Symbol s=null;
        if((s=zakres_docelowy.poNazwie_bez_nadrzednych(id)) != null) {//całk a; {całk a;} ma wyprodukować dwie zmienne a
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.stop, ctx.stop.getLine(), ctx.stop.getCharPositionInLine(),
                    "Redeklaracja identyfikatora '" + id + "' poza listą parametrów formalnych"
            ));
        }
        return s;
        */
    }

    /** Deklaracja określonego - zwykłego punktu wejściowego
     * Trzeba:
     * Zrobić symbol na punkt wejściowy, dodac (ale do wyższego zakresu)
     * Zrobić sam punkt wejściowy
     * Ustawić aktualnyPunkt, by deklaracje z listy pareametrów doczepiły się jako parametry punktu wejściowego
     * @param ctx
     */
    @Override public void enterInstrukcja_wkroczenia(plplParser.Instrukcja_wkroczeniaContext ctx) {
        String nazwapkt = ctx.ID().getText();
        //rozpoznawanie początkowaej procedury....
        if(Objects.equals(nazwapkt, Tablice.WEJSCIE_PROG))
        {
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                    "Znaleziono punkt wejściowy programu"
            ));
            if(Tablice.znaleziono_pkt_we_programu)//nie może być dwóch mainów!
            {
                Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                        "Duplikat punktu wejściowego do programu ('zacznij program')"
                ));
            }
            Tablice.znaleziono_pkt_we_programu = true;
            aktualnyZakres.procedura.poczatkowa = true;
        }
        //dla wejść w procedurze startowej trzeba sprawdzić, czy argumenty są puste/ TODO argc argv
        if(aktualnyZakres.procedura.poczatkowa == true)
        {
            if(ctx.lista_parametrow_formalnych().deklaracja_parametru().size() > 0)
            {
                Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                        "Na razie program/punkt wejściowy procedury startowej nie może mieć argumentów ('zacznij program')"
                ));
            }
        }

        //dodawanie punktu wejściowego
        //sprawdzanie_redeklaracji_punktu_we(ctx.ID().getText(), );
        //sprawdzanie_redeklaracji_punktu_we(ctx.getText(), ctx);
        zacznij_deklarację();
        aktualnyTyp.typ = Typ.Pkt;
        aktualnyTyp.rodzaj_pamieci = PelnyTyp.RodzajPam.STATYCZNA;
        int of=offset_w_hierarchii_zakresow;offset_w_hierarchii_zakresow = 1; Zakres sz = aktualnyZakres; aktualnyZakres = aktualnyZakres.procedura.najogolniejszy_zakres;
        Zakres zakres_docelowy = przesunietyZakres(aktualnyZakres);

        PunktWejsciowy pkt = new PunktWejsciowy(nazwapkt, aktualnyZakres.procedura);
        sprawdzanie_redeklaracji_punktu_we(nazwapkt, zakres_docelowy, ctx);
        aktualnyZakres.procedura.wejscia.add(pkt);
        aktualnyZakres.procedura.zamknieta_zwroc=false;
        //dodawanie symbolu
        Symbol symPunktu =  dodanie_samego_symbolu(nazwapkt, ctx.getStart(), ctx);
        //powiazanie symbolu punktu z punktem wejściowym
        symPunktu.pktWe = pkt;
        offset_w_hierarchii_zakresow =of;
        aktualnyZakres = sz;
        skończ_deklarację();
        //deklaracje z listy parametrów można potraktować jako osobny proces deklaracyjny, tylko z ustawionym aktualnymPunktem i aktualnyTyp.parametr_formalny
        //zacznij i skończ deklaracje jest też wywoływane w eneter i exit deklaracja prosta odpowiednio
        zacznij_deklarację();
        aktualnyPunkt = pkt;
        aktualnyTyp.parametr_formalny = true;
    }

    /**
     * Musi posprzątać po deklaracji określonego punktu wejściowego - ustawić aktualnyPkt na null
     * @param ctx
     */
    @Override public void exitInstrukcja_wkroczenia(plplParser.Instrukcja_wkroczeniaContext ctx) {
        //deklaracje nieokreślonych punktów wejściowych mogłyby być zagnieżdżone i musiałyby posiadać jakiś stos, tu na zagnieżdżenie gramatyka nie pozwala
        aktualnyPunkt = null;//nadmiarowe
        skończ_deklarację();
    }


    private Symbol sprawdzanie_redeklaracji_punktu_we(String id, Zakres zakres_docelowy,ParserRuleContext ctx) {

        Symbol s=null;
        if((s=zakres_docelowy.poNazwie_bez_nadrzednych(id)) != null){//całk a; {całk a;} ma wyprodukować dwie zmienne a
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Redeklaracja identyfikatora '"+id+"' jako punktu wejściowego"
            ));
            //TODO lokalne punkty wejściowe?
        }
        return s;
    }
    @Override public void enterInstrukcja_powrotu(plplParser.Instrukcja_powrotuContext ctx) {
        aktualnyZakres.procedura.zamknieta_zwroc=true;//TODO - nie będzie działać, bo co jak będzie inna instrukcja potem
    }
    @Override public void enterInstrukcja_zakonczenia(plplParser.Instrukcja_zakonczeniaContext ctx) {
        aktualnyZakres.procedura.zamknieta_zwroc=true;//TODO - nie będzie działać, bo co jak będzie inna instrukcja potem
    }

    /** Stałe typu "string" {1,2,3}, na które będą wskazywać pary symbol-obiekt pamięci typu referenyjnego, muszą odpowiadać jakimś rzeczywistym obiektom, które trzeba zrobić...
     *
     */
    @Override public void enterStala_tablicowa(plplParser.Stala_tablicowaContext ctx) {
        if(ctx.NAPIS_DOSL() != null)
        {
            if(aktualnyZakres.poTokenie(ctx.NAPIS_DOSL().getSymbol()) != null){return;}//coś już symbol z tego tokenu, może deklaracja stałej
            ctx.NAPIS_DOSL().getText();
            ctx.NAPIS_DOSL().getSymbol();
            PelnyTyp t = new PelnyTyp();
            t.inicjalizowana = true;
            t.parametr_formalny = false;
            t.rodzaj_pamieci = PelnyTyp.RodzajPam.STATYCZNA;
            t.krotnosc_tablicowa = +1;//symbol jest referencją, z adresem na faktyczny obiekt
            t.modyfikowalonosc = PelnyTyp.Mod.STALA;//??
            t.dlugosc_tablicy = ctx.NAPIS_DOSL().getText().length()-2+1;//cudzysłowy, null
            t.typ = Typ.Znak;
            //zawsze dodanie nowego tokena...
            Symbol sym = new Symbol(ctx.NAPIS_DOSL().getSymbol(), aktualnyZakres, t);
            aktualnyZakres.dodajSymbol(sym);

            //...i obiektu pamięci z nim powiązanego
            //new ObiektStatyczny(sym);
            String wartosc = ctx.NAPIS_DOSL().getText().replaceAll("^\"|\"$", "");//usuwamy cudzysłowy z końca i początku
            //@ASM
            //dodaj zainicjalizowany string, zamknięty w kopniętych apostrofach `` (obsługuje \n\t itd) i z nullem (zerem) na końcu
            String etykieta_wartosci = sym.etykieta();
            aktualnyZakres.procedura.data.append(etykieta_wartosci+":   db    `"+wartosc+"`, 0  ;z linii "+ctx.NAPIS_DOSL().getSymbol().getLine()+"\n");
            sym.udawana_referencja = true;//symbol ma zwracać etykietę, pytany o wartość, a nie wartość pod tym adresem.
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "UDAWANA REFERENCJA:"+sym
            ));

            //aktualnyZakres.procedura.data.append(sym.etykieta()).append(":   db    `").append(wartosc).append("`, 0  ;z linii ").append(ctx.NAPIS_DOSL().getSymbol().getLine()).append("\n");
        }
    }

    public String piszStanMaszynyDeklaracyjnej()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\nSTAN MASZYNY DEKLARACYJNEJ:\n");
        sb.append("aktualnyTyp:").append(aktualnyTyp).append("\n")
        .append("aktualnyPunkt wejściowy:").append(aktualnyPunkt).append("\n")
        .append("aktualnaStruktura:").append(aktualnaStruktura).append("\n")
        .append("offset_w_hierarchii_zakresow:").append(offset_w_hierarchii_zakresow).append("\n")
        .append("aktualnyZakres:").append(aktualnyZakres.nr).append("\n");
        return sb.toString();
    }
}
