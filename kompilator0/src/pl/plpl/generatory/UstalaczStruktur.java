package pl.plpl.generatory;

import org.antlr.v4.runtime.ParserRuleContext;
import pl.plpl.bledy.SemanticOccurence;
import pl.plpl.generatory.klasyDanych.*;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektAutomatyczny;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektStatyczny;
import pl.plpl.parser.plplBaseListener;
import pl.plpl.parser.plplParser;

import static pl.plpl.generatory.Tablice.typy;

/*
Ten listener ma sie zająć ustaleniem struktur pamięci, aby przy generacji kodu znane były adresy/etykiety obiektów
żeby w generatorze można było napisać: dajSymbol(zakres, nazwa) albo reprezentacjaSymbolu(zakres, nazwa)
Jednak żeby to uzyskać, trzeba najpierw przetworzyć wszystkie deklaracje i porobić zakresy, a konkretnie:
 + wchodząc do procedury/instrukcji złożonej/
                                              *deklaracji typu? zrobić nowy zakres mający za rodzica aktualny
 + wychodząc z powyższych przestawić aktualny zakres na wyższy
                                               *wychodznie z deklaracji typu
 * Wchodząc do deklaracji w procedurze przetworzyć ją: dodać symbol do zakresu, kod do bss, jakiś global; ewentualnie zainicjalizować, ustawić etykietę, dodać kod do data/rodata.
 * Wchodząc do instrukcji wkroczenia przetworzyć liste parametrów
 * Sygalizować podwójną deklarację
 * Przetworzyc deklarację w deklaracji nowego typu
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
        aktualnyZakres = new Zakres(aktualnyZakres, aktualnyZakres.procedura);
        Tablice.zakresy.add(aktualnyZakres);
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
        Procedura p = new Procedura();
        Tablice.procedury.add(p);
        aktualnyZakres = new Zakres(aktualnyZakres, p);
        Tablice.zakresy.add(aktualnyZakres);
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
        if(aktualnyZakres.poNazwie(id) != null){
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

            }
        }
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
        aktualnyZakres = aktualnyZakres.nadrzedny;
    }

    @Override public void exitProgram(plplParser.ProgramContext ctx) {
        System.out.println("KONIEC USTALANIA STRUKTUR");
    }
}
