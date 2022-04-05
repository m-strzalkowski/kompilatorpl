package pl.plpl.generatory;

import org.antlr.v4.runtime.ParserRuleContext;
import pl.plpl.bledy.SemanticOccurence;
import pl.plpl.generatory.klasyDanych.*;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektAutomatyczny;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektStatyczny;
import pl.plpl.parser.plplBaseListener;
import pl.plpl.parser.plplParser;

import java.util.Objects;

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
    plplParser parser;
    private Zakres aktualnyZakres;
    public UstalaczStruktur(plplParser parser) {this.parser = parser;}
    @Override public void enterProgram(plplParser.ProgramContext ctx) {
        System.out.println("USTALANIE STRUKTUR\n");
        aktualnyZakres = Tablice.zakres_globalny;
    }
    @Override public void enterInstrukcja_zlozona(plplParser.Instrukcja_zlozonaContext ctx) {
        aktualnyZakres = new Zakres(aktualnyZakres, aktualnyZakres.procedura, ctx.getStart());
        Tablice.dodajZakres(aktualnyZakres);
        System.out.println("dodano zakres"+aktualnyZakres.toString());
    }
    @Override public void exitInstrukcja_zlozona(plplParser.Instrukcja_zlozonaContext ctx) {
        System.out.println("wyjście z zakresu:"+aktualnyZakres.nr+"->"+aktualnyZakres.nadrzedny.nr);

        if(aktualnyZakres == null) {Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
             SemanticOccurence.Level.FATAL,
             ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                "Analizator semantyczny rozpozanł wyjście do wyższego zakresu, a jest już w globalnym"
        ));}
        aktualnyZakres = aktualnyZakres.nadrzedny;
    }

    @Override public void enterProcedura(plplParser.ProceduraContext ctx) {
        Procedura p = new Procedura(ctx.getStart());
        Tablice.procedury.add(p);
        aktualnyZakres = new Zakres(aktualnyZakres, p, ctx.getStart());
        Tablice.dodajZakres(aktualnyZakres);
        p.najogolniejszy_zakres = aktualnyZakres;
        System.out.println("dodano procedurę "+p.nr+" i zakres "+ aktualnyZakres.nr);
    }
    /*
        Przetwarzanie deklaracji
     */
    @Override public void enterDeklaracja_atomiczna(plplParser.Deklaracja_atomicznaContext ctx) {
        PelnyTyp t = new PelnyTyp();
        //przydomki typów:
        if(aktualnyZakres.procedura.nr == Tablice.kod_globalny.nr)//w kodzie globalnym
        {
            t.rodzaj_pamieci = PelnyTyp.RodzajPam.STATYCZNA;//domyślnie wszytko jest statyczne
            if(ctx.przydomki().AUTOMATYCZN() != null)//a jeśli jest napisane, że nie są, to jest to błąd
            {
                Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
                        SemanticOccurence.Level.ERROR,
                        ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                        "Deklaracja zmiennej automatycznej w globalnym kodzie (w wypadku dalszej pracy potraktowana zostanie jako zmienna statyczna)"
                ));
            }
        }
        else{//w kodzie każdej normalnej procedury
            t.rodzaj_pamieci = PelnyTyp.RodzajPam.AUTOMATYCZNA;//zmienne są domyślnie automatyczne
            if(ctx.przydomki().STATYCZN() != null) {t.rodzaj_pamieci = PelnyTyp.RodzajPam.STATYCZNA;}//chyba, że jest napisane statyczn.
        }
        t.modyfikowalonosc = (ctx.przydomki().STAL() == null)?(PelnyTyp.Mod.ZMIENNA):(PelnyTyp.Mod.STALA);//zmienne domyślnie są zmienne, chyba, że jest napisane stal.

        System.out.println("deklaracja:"+ctx.getText()+"\n"+ctx.nazwa_typu_atom() + "" + ctx.deklarator_bez_przypisania()+""+ctx.przydomki().STAL());

        //określenie typu
        t.typ = Typ.zTokena(ctx.nazwa_typu_atom().getStart());
        System.out.println("Typ:"+t.typ.nazwa);
        //pętla po deklaracjach bez inicjalizacji
        t.inicjalizowana = false;
        for (var d:ctx.deklarator_bez_przypisania()) {
            //sprawdzanie sensowności przydomków
            if( t.modyfikowalonosc== PelnyTyp.Mod.STALA)
            {
                Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                        "Atomiczna stała "+d.ID().getText()+" zadeklarowana bez przypisania (jak nadać jej jakąkolwiek wartość?)"
                ));
            }
            System.out.println("deklaracja bez przypisania id:"+d.ID().getText()+" pamiec:"+t.rodzaj_pamieci);

            //sprawdzanie redeklaracji
            sprawdzanie_redeklaracji_w_kodzie(d.ID().getText(), t, ctx);
            //nowy symbol
            Symbol sym = new Symbol(d.ID().getText(), aktualnyZakres, t);
            aktualnyZakres.dodajSymbol(sym);
            if(t.rodzaj_pamieci== PelnyTyp.RodzajPam.STATYCZNA)
            {
                //@ASM
                //dodj niezainicjalizowane miejsce długie na ileś bajtów opatrzone etykietą
                aktualnyZakres.procedura.bss.append(sym.etykieta()).append(":   resb    ").append(t.typ.dlugosc_B).append(";").append(sym.identyfikator).append("\n");
                //dodanie obiektu pamięci
                new ObiektStatyczny(sym);
            }
            else{//automatyczna
                //nie następuje emisja żadnego kodu
                //dodanie obiektu pamięci
                new ObiektAutomatyczny(sym);
            }


        }
        //pętla po deklaracjach z inicjalizacją
        t = t.clone(); t.inicjalizowana=true;//to jest inny pełny typ (stąd clone - potrzebny drugi obiekt)
        for (var d:ctx.deklarator_atomiczny_z_przypisaniem()) {
            System.out.println("deklaracja z przypisaniem id:"+d.ID().getText());
            //sprawdzanie redeklaracji
            sprawdzanie_redeklaracji_w_kodzie(d.ID().getText(), t, ctx);
            //nowy symbol
            Symbol sym = new Symbol(d.ID().getText(), aktualnyZakres, t);
            aktualnyZakres.dodajSymbol(sym);
            if(t.rodzaj_pamieci== PelnyTyp.RodzajPam.STATYCZNA)
            {
                if(d.CALK()!=null)
                {
                    if(t.typ != Typ.Całk)Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
                            SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                            "Nie da sie zainicjalizować literałem całkowitym zmiennej o typie"+t.typ
                    ));else{
                        try{
                            Integer.parseInt(d.CALK().getText());
                        }
                        catch (NumberFormatException e)
                        {
                            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                                    "Nieprawidłowa liczba całkowita:"+d.CALK().getText()));
                        }
                        //@ASM
                        //dodaj zainicjalizowaną liczbę całk. (int32)
                        aktualnyZakres.procedura.data.append(sym.etykieta()).append(":   dd    ").append(d.CALK().getText()).append(";").append(sym.identyfikator).append("\n");
                    }

                    System.out.println("INICJ CALKOWITA"+d.CALK().getText());
                }
                if(d.ZMIENN()!=null)
                {
                    if(t.typ != Typ.Rzeczyw)Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
                            SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                            "Nie da sie zainicjalizować literałem zmiennoprzecinkowym zmiennej o typie"+t.typ
                    ));else{
                    try{
                        Double.parseDouble(d.ZMIENN().getText());
                    }
                    catch (NumberFormatException e)
                    {
                        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                                "Nieprawidłowa liczba zmiennopozycyjna:"+d.CALK().getText()));
                    }
                    //@ASM
                    //dodaj zainicjalizowaną liczbę całk. (int32)
                    aktualnyZakres.procedura.data.append(sym.etykieta()).append(":   dd    ").append(d.ZMIENN().getText()).append(";").append(sym.identyfikator).append("\n");
                }

                    System.out.println("INICJ ZMIENN"+d.ZMIENN().getText());
                }
                if(d.ZNAK_DOSL()!=null)
                {
                    if(t.typ != Typ.Znak)Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
                            SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                            "Nie da sie zainicjalizować znakiem dosłownym zmiennej o typie"+t.typ
                    ));else{
                        //String wartosc = d.ZNAK_DOSL().getText();
                        //if(wartosc.charAt(0) != '\'' || wartosc.charAt(wartosc.length()-1) != '\'')Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
                        //        SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                        //        "Wygląda, że przypisywany do znaku literał /"+wartosc+"/ nie jest literałem znakowym (w pojedynczych apostrofach)."));

                        //@ASM
                        //dodaj zainicjalizowaną liczbę całk. (int32)
                        aktualnyZakres.procedura.data.append(sym.etykieta()).append(":   db    ").append(d.ZNAK_DOSL().getText()).append(";").append(sym.identyfikator).append("\n");
                    }
                    System.out.println("INICJ ZNAK"+d.ZNAK_DOSL().getText());
                }

                //dodanie obiektu pamięci
                new ObiektStatyczny(sym);
            }
            else{//automatycznych już nie można inicjować, generator będzie musiał wstawić odpowiedni kod w procedurze
                //dodanie obiektu pamięci
                new ObiektAutomatyczny(sym);
            }

        }
    }

    private void sprawdzanie_redeklaracji_w_kodzie(String id, PelnyTyp t, ParserRuleContext ctx) {

        if(aktualnyZakres.poNazwie_bez_nadrzednych(id) != null){//całk a; {całk a;} ma wyprodukować dwie zmienne a
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Redeklaracja identyfikatora '"+id+"' poza listą parametrów formalnych"
            ));
            if(aktualnyZakres.poNazwie(id).pelnyTyp.equals(t)){
                Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.INFO, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                        "Redeklaracja identyfikatora '"+id+"':typ się zgadza z poprzednim, można kontynuować"
                ));
            }
            else {Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Redeklaracja identyfikatora:"+id+"typ się nie zgadza z poprzednim, nie można kontynuować"+"typy:\n"+ aktualnyZakres.poNazwie(id).pelnyTyp.toString() + "\n"+t.toString()
            ));
                Symbol ewentualny_parametr = aktualnyZakres.procedura.najogolniejszy_zakres.poNazwie_bez_nadrzednych(id);//coś w zakresie całej procedury...
                if(ewentualny_parametr.pelnyTyp.parametr_formalny)//...co jest parametrem formalnym
                {
                    Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.WARN, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                            "Redeklaracja identyfikatora '"+id+"': Istnieje już w tej procedurze parametr formalny o tej nazwie. Dodanie do podrzędnego zakresu symbolu o tej samej nazwie spowoduje zasłonięcie parametru formalnego, czy o to Ci chodziło?"
                    ));
                }

            }
        }
    }
    //deklaracje na listach parametrów
    @Override public void enterInstrukcja_wkroczenia(plplParser.Instrukcja_wkroczeniaContext ctx) {
        //rozpoznawanie początkowaej procedury....
        if(Objects.equals(ctx.ID().getText(), Tablice.WEJSCIE_PROG))
        {
            System.out.println("Znaleziono punkt wejściowy programu");
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
        sprawdzanie_redeklaracji_punktu_we(ctx.getText(), ctx);
        PunktWejsciowy pkt = new PunktWejsciowy(ctx.ID().getText());
        aktualnyZakres.procedura.wejscia.add(pkt);
        aktualnyZakres.procedura.zamknieta_zwroc=false;
        //dodawanie symbolu
        PelnyTyp t = new PelnyTyp();
        t.typ = Typ.Pkt;
        Symbol symPunktu = new Symbol(ctx.ID().getText(), Tablice.zakres_globalny, t);
        symPunktu.pktWe = pkt;
        Tablice.zakres_globalny.dodajSymbol(symPunktu);
    }

    private void sprawdzanie_redeklaracji_punktu_we(String id, ParserRuleContext ctx) {

        if(Tablice.zakres_globalny.poNazwie_bez_nadrzednych(id) != null){//całk a; {całk a;} ma wyprodukować dwie zmienne a
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Redeklaracja identyfikatora '"+id+"' jako punktu wejściowego"
            ));
            //TODO lokalne punkty wejściowe?
        }
    }
    @Override public void enterInstrukcja_powrotu(plplParser.Instrukcja_powrotuContext ctx) {
        aktualnyZakres.procedura.zamknieta_zwroc=true;
    }

    /**
     *
     *
     *
     */
    @Override public void exitProcedura(plplParser.ProceduraContext ctx) {
        System.out.println("wyjście z procedury "+aktualnyZakres.procedura.nr+" i zakresu:"+aktualnyZakres.nr+"->"+aktualnyZakres.nadrzedny.nr);

        if(aktualnyZakres == null) {Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
                SemanticOccurence.Level.FATAL,
                ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                "Analizator semantyczny rozpozanł wyjście do wyższego zakresu, a jest już w globalnym"
        ));}
        //procedura musi sobie ustawić wszyskie deklaracje
        //aktualnyZakres.procedura.przeliczStruktury()
        //co jeśli nie ma wejśc do procedury?
        if(aktualnyZakres.procedura.wejscia.size() < 1)
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                "Procedura bez punktów wejściowych, co to ma znaczyć?"
        ));

        //wyjście do wyższego zakresu
        aktualnyZakres = aktualnyZakres.nadrzedny;
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
            t.krotnosc_tablicowa = -1;//?? jako faktyczny obiekt??, nie referencja
            t.modyfikowalonosc = PelnyTyp.Mod.ZMIENNA;//??
            t.dlugosc_tablicy = ctx.NAPIS_DOSL().getText().length()-2+1;//cudzysłowy, null
            t.typ = Typ.Znak;
            //zawsze dodanie nowego tokena...
            Symbol sym = new Symbol(ctx.NAPIS_DOSL().getSymbol(), aktualnyZakres, t);
            aktualnyZakres.dodajSymbol(sym);

            //...i obiektu pamięci z nim powiązanego
            new ObiektStatyczny(sym);
            String wartosc = ctx.NAPIS_DOSL().getText().replaceAll("^\"|\"$", "");//usuwamy cudzysłowy z końca i początku
            //@ASM
            //dodaj zainicjalizowany string, zamknięty w kopniętych apostrofach `` (obsługuje \n\t itd) i z nullem (zerem) na końcu
            aktualnyZakres.procedura.data.append(sym.etykieta()).append(":   db    `").append(wartosc).append("`, 0  ;z linii ").append(ctx.NAPIS_DOSL().getSymbol().getLine()).append("\n");
        }
    }

    @Override public void exitProgram(plplParser.ProgramContext ctx) {
        if(Tablice.znaleziono_pkt_we_programu == false)
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.INFO, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                "Nie znaleziono punktu wejściowego do programu ('zacznij program')"
        ));
        System.out.println("KONIEC USTALANIA STRUKTUR");
    }
}
