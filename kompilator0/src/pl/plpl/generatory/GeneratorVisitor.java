package pl.plpl.generatory;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import pl.plpl.bledy.SemanticOccurence;
import pl.plpl.generatory.klasyDanych.*;
import pl.plpl.parser.plplBaseVisitor;
import pl.plpl.parser.plplParser;

import static pl.plpl.generatory.klasyDanych.Typ.*;

import java.util.Objects;
import java.util.Stack;

public class GeneratorVisitor extends plplBaseVisitor<String> {
    private Zakres aktualnyZakres;
    private Stack<PelnyTyp> stosTypów = new Stack<>();
    /*
        Nazwa przestrzeń odnosi się do przestrzeni nazw, którą można zdefiniować jako zbiór wszystkich symboli dostępnych w pewnym rejonie kodu źródłowego,
        zazwyczaj zasięgu/zakresie, czy procedurze, choć można by sobie wyobrazić generację przestrzeni nazw dla samego napisu identyfikatora/tokena w kodzie
         - będzie zawierać jedynie odpowiedni symbol, co właśnie jest realizowane przez poniższe funkcje.
     */
    Symbol przestrzeń(String identyfikator)
    {
        Symbol s = aktualnyZakres.poNazwie(identyfikator);//dodać jeszcze zawsze token - pozwoli spraedzać użycie przed deklaracją i pisać gdzie dokładnie ie znaleziono nazwy
        if(s==null)
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, 0,-1 ,-1,
                "Nie znaleziono w przestrzeni nazw nic o identyfikatorze" +identyfikator));
        return s;
    }
    Symbol przestrzeń(Token token)
    {
        Symbol s = aktualnyZakres.poTokenie(token);
        if(s==null)
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, 0,-1 ,-1,
                    "Nie znaleziono w przestrzeni nazw nic powiązanego z tokenem" +token));
        return s;
    }

    @Override public String visitProgram(plplParser.ProgramContext ctx) {
        System.out.println("Pragnę pojnformować, że rozpocząłem wizytacje programu.");
        visitChildren(ctx);
        System.out.println("Wizytacja programu zakończona.");
        return "koniec";
    }
    //@Override public String visitByt_globalny(plplParser.Byt_globalnyContext ctx) { return ctx.getText(); }
    @Override public String visitProcedura(plplParser.ProceduraContext ctx)
    {
        aktualnyZakres = Tablice.zakresPoPierwszymTokenie(ctx.getStart());
        if(aktualnyZakres==null){throw new RuntimeException("Zepsute połączenie między generatorem a analizatorem ssemantycznym");}
        Procedura proc = aktualnyZakres.procedura;//żeby krócej było
        System.out.println("wizytacja procedury "+aktualnyZakres.procedura.nr);

        //Prolog procedury - otwarcie
        //@ASM
        proc.text_prolog.append(proc.etykieta()).append(Procedura.PROLOG_LABEL_SUFFIX).append(":\n");
        proc.text_prolog.append(";coś tu może być...\n");
        //Epilog procedury - otwarcie
        //@ASM
        proc.text_epilog.append(proc.etykieta()).append(Procedura.EPILOG_LABEL_SUFFIX).append(":\n");
        proc.text_epilog.append(";coś tu może być...\n");
        //Odwiedzenie dzieci...
        var mid = proc.text; proc.text = new StringBuilder();

        mid.append(";mid\n");
        for(var instr:ctx.lista_instrukcji().children)
        {
            String zwr = visit(instr);
            mid.append(zwr);
            System.out.println("instrukcja:"+instr.getText()+"|"+zwr);
        }
        mid.append(";/mid\n");
        if(aktualnyZakres.procedura.zamknieta_zwroc == false)
        {
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
                    SemanticOccurence.Level.FATAL,
                    ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Procedura kończy się bez zwróć"
            ));
        }

        //Prolog procedury - zamknięcie
        //@ASM
        proc.text_prolog.append("ret\n");
        //Epilog procedury - zamknięcie
        //@ASM
        proc.text_epilog.append("ret\n");

        //System.err.println(kod);
        //mid.append(kod);

        //Składanie .text
        proc.text.append(proc.text_prolog);
        proc.text.append(mid);
        proc.text.append(proc.text_epilog);
        return "";
    }
    @Override public String visitInstrukcja_zlozona(plplParser.Instrukcja_zlozonaContext ctx) {
        aktualnyZakres = Tablice.zakresPoPierwszymTokenie(ctx.getStart());
        if(aktualnyZakres==null){throw new RuntimeException("Zepsute połączenie między generatorem a analizatorem ssemantycznym");}
        return "";
    }
    @Override public String visitWstawka_asemblerowa(plplParser.Wstawka_asemblerowaContext ctx) {
        return ctx.getText().substring(2);//bez$$
    }
    
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInstrukcja_wyboru(plplParser.Instrukcja_wyboruContext ctx) { return ""; }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInstrukcja_petli(plplParser.Instrukcja_petliContext ctx) { return ""; }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInstrukcja_powrotu(plplParser.Instrukcja_powrotuContext ctx) {

        StringBuilder sb = new StringBuilder();

            //@ASM
            //instrukcja powrotu
            sb.append(";instrukcja zwróć() w globalnej procedurze\n");
            sb.append("              call "+aktualnyZakres.procedura.etykieta()+Procedura.EPILOG_LABEL_SUFFIX+"\n");
            sb.append("                ;niszczenie ramki\n");
            sb.append("                mov esp, ebp\n");
            sb.append("                pop ebp\n");
            sb.append("                ;^niszczenie ramki stosu procedury\n");
            sb.append("                ret; wyjście z procedury\n");


        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInstrukcja_wkroczenia(plplParser.Instrukcja_wkroczeniaContext ctx) {
        Symbol s = przestrzeń(ctx.ID().getText());//aktualnyZakres.poNazwie(ctx.ID().getText());
        if(s.pktWe==null){throw new RuntimeException("Punkt wejściowy"+ctx.ID().getText()+"miał być zarejestrowany na etapie deklaracji!");}
        PunktWejsciowy pkt = s.pktWe;
        StringBuilder sb = new StringBuilder();
        if(Objects.equals(pkt.nazwa, Tablice.WEJSCIE_PROG))
        {
            //@ASM
            //instrukcja wkroczenia dla main
            sb.append(";punkt wejsciowy program\n");
            sb.append("              jmp after_main; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć\n");
            sb.append("_main:\n");
            sb.append(";robienie ramki\n");
            sb.append("              push ebp;\n");
            sb.append("              mov ebp, esp;\n");
            sb.append("              sub esp, "+(aktualnyZakres.procedura.rozmiar_B_zmiennych_automatycznych())+"\n");
            sb.append(";^robienie ramki stosu\n");
            sb.append("              call "+aktualnyZakres.procedura.etykieta()+Procedura.PROLOG_LABEL_SUFFIX+"\n");
            sb.append("              ;tu coś może być\n");
            sb.append("              after_main:\n");
        }
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInstrukcja_zakonczenia(plplParser.Instrukcja_zakonczeniaContext ctx) { return ""; }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInstrukcja_przerwania_petli(plplParser.Instrukcja_przerwania_petliContext ctx) { return ""; }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInstrukcja_kontynuacji_petli(plplParser.Instrukcja_kontynuacji_petliContext ctx) { return ""; }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitWypisanie(plplParser.WypisanieContext ctx) {
        if(ctx.stala_tablicowa() != null)
        {
            Symbol sym = przestrzeń(ctx.stala_tablicowa().NAPIS_DOSL().getSymbol());
            if(sym==null){throw new RuntimeException("Ten napis dosłowny miał zostac rozpoznany przy deklaracji, a podczas generacji go nie znaleziono w przestrzeni nazw!");}
            System.out.println("Wypisanie"+sym.etykieta());
            StringBuilder sb = new StringBuilder();
            //@ASM
            //wypisanie
            sb.append(";wypisanie\n");
            sb.append("                push dword "+sym.etykieta()+"\n");
            sb.append("                call _printf\n");
            sb.append("                add esp, byte 4\n");
            sb.append(";koniec wypisania\n");
            return sb.toString();
        }
        if(ctx.ID() != null)
        {
            Symbol sym = przestrzeń(ctx.ID().getText());
            if(sym.pelnyTyp.typ == Typ.Całk && sym.pelnyTyp.krotnosc_tablicowa == 0)
            {
                StringBuilder sb = new StringBuilder();
                //@ASM
                //wypisanie

                //statyczny:etykieta -> do akumulatora i dopiero push
                //adres -> do akumulatora i dopiero push/mov
                //automatyczny: od razu można [ebp-?]?
                //co z cholernymi bajtami?
                sb.append(";wypisanie całk\n");
                sb.append("                sub esp, 4\n");
                sb.append("                mov dword eax, ["+sym.etykieta()+"]\n");
                sb.append("                mov dword [esp], eax\n");
                sb.append("                push dword WYPISZ_CALK_FMT\n");
                sb.append("                call _printf\n");
                sb.append("                add esp, byte 8\n");
                sb.append(";koniec wypisania\n");
                return sb.toString();
            }
            else if(sym.pelnyTyp.typ == Typ.Znak && sym.pelnyTyp.krotnosc_tablicowa == 0)
            {
                StringBuilder sb = new StringBuilder();
                //@ASM
                //wypisanie
                sb.append(";wypisanie znak\n");
                //sb.append("                mov al ["+sym.etykieta()+"]\n");
                //sb.append("                push byte ["+sym.etykieta()+"]\n");
                sb.append("                sub esp, 1\n");
                sb.append("                mov byte al, ["+sym.etykieta()+"]\n");
                sb.append("                mov byte [esp], al\n");
                sb.append("                push dword WYPISZ_ZNAK_FMT\n");
                sb.append("                call _printf\n");
                sb.append("                add esp, byte 5\n");
                sb.append(";koniec wypisania\n");
                return sb.toString();
            }
            else {
                Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                        "Nie wypisuję w ten sposób nic, poza dosłownymi napisami, liczbami całkowitymi i pojedynczymi znakami."
                ));
                return "";
            }

        }
        return "";
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInstrukcja_prosta(plplParser.Instrukcja_prostaContext ctx) {
        StringBuilder sb = new StringBuilder();
        for(var c : ctx.children)
        {
            String s = visit(c);
            sb.append((s==null)?(""):(s));
        }
        if(stosTypów.size() > 1)
        {
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.WARN, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Po przetwarzaniu wyrażenia w instrukcji prostej, na wewnętrznym stosie kompilatora został więcej jak 1 element("+stosTypów.size()+").\n Prawdopodobnie w jakiejś regule generacji ktoś zapomniał gdzieś ściągnąć elementu z tegoż stosu. To wewnętrzny błąd kompilatora."
            ));
        }
        //trzeba zapewnić, że stos typów będzie pusty przed następnym wyrażeniem
        stosTypów.clear();
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDeklaracja_atomiczna(plplParser.Deklaracja_atomicznaContext ctx) { return ""; }
    @Override public String visitWyrazenieStala(plplParser.WyrazenieStalaContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        PelnyTyp t = new PelnyTyp();
        t.krotnosc_tablicowa = 0;
        if(ctx.stala_atomiczna().CALK()!=null)
        {
            t.typ = Typ.Całk;
            //@ASM
            //stała całkowita
            sb.append(";stała całkowita\n");
            sb.append("                mov eax,"+Integer.parseInt( ctx.stala_atomiczna().CALK().getText())+"\n");
            sb.append(";koniec stałej całkowitej\n");

        }
        if(ctx.stala_atomiczna().ZNAK_DOSL()!=null)
        {
            t.typ = Typ.Znak;
            String wartosc = ctx.stala_atomiczna().ZNAK_DOSL().getText().replaceAll("^\'|\'$", "");//usuwamy cudzysłowy z końca i początku
            //@ASM
            //stała całkowita
            sb.append(";stała znakowa\n");
            sb.append("                mov "+akumulator(DLUGOSC_SLOWA_B)+", 0\n");//tak dla pewności wyczyszczenie
            sb.append("                mov al,`"+wartosc+"`\n");
            sb.append(";koniec stałej znakowej\n");
        }
        if(ctx.stala_atomiczna().ZMIENN()!=null)
        {
            throw new RuntimeException("Jeszcze nie ma zmiennoprzecinkowych! (stała zmiennoprzecinkowa w wyrażeniu)");
        }
        stosTypów.push(t);
        return sb.toString();
    }
    @Override public String visitWyrazenieNawiasy(plplParser.WyrazenieNawiasyContext ctx) { return visit(ctx.wyrazenie()); }
    @Override public String visitWyrazenieLwartosc(plplParser.WyrazenieLwartoscContext ctx) { return visit(ctx.lwartosc()); }
    /*
    @Override public String visitLwartosc(plplParser.LwartoscContext ctx)
    {
        if(ctx.selektor_tablicowy().size() < 1 && ctx.selektor_typu_zlozonego().size() < 1)
        {
            Symbol sym = przestrzeń(ctx.ID().getText());
            StringBuilder sb = new StringBuilder();
            if(sym.pelnyTyp.typ == Typ.Całk )
            {

                //@ASM
                //lwartosc
                sb.append(";załadowanie ID z lwartości - typ całk\n");
                sb.append("                mov dword eax, ["+sym.etykieta()+"]\n");
                sb.append(";koniec ID z lwartosc\n");

            }
            else if(sym.pelnyTyp.typ == Typ.Znak && sym.pelnyTyp.krotnosc_tablicowa == 0)
            {
                //@ASM
                //lwartosc
                sb.append(";jeszcze nie ma!\n");

                return sb.toString();
            }
            else {
                Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                        "Jeszcze nie zaimplamentowane!."
                ));
                return "";
            }
            return sb.toString();
        }
        else{
            throw new RuntimeException("Nie mamy jeszcze Pańskich typów złożonych i co nam Pan zrobi?");
        }

    }
    */
    /**<b>lwartość</b>
     * Idąc mniej więcej tropem języka C - lwartość ma odnosić się do obiektu posiadającego adres.
     * Ale u nas może być albo wartością tego obiektu (ewentualnie referencji do obiektu) - normalnie,
     * albo adresem tegoż obiektu!(zwracac go w eax) - np. gdy stoi po lewej stronie operatora =
     * Dodatkowo, trzeba umieć zwracać adresy/wartości potworków typu: a.b[d+2][7][12+w].e
     * Dlatego finalna implementacja będzie jakimś koszmarem.
     */
    @Override public String visitLwartosc(plplParser.LwartoscContext ctx)
    {
        Symbol sym = przestrzeń(ctx.ID().getText());
        StringBuilder sb = new StringBuilder();
        //@ASM
        //lwartosc
        sb.append(";załadowanie lwartości:"+ctx.start.getLine() +"\n");
        String akum = akumulator(sym.pelnyTyp.typ.dlugosc_B);

        if(sym.pelnyTyp.typ.dlugosc_B < DLUGOSC_SLOWA_B)
        {
            sb.append("                mov "+akumulator(DLUGOSC_SLOWA_B)+", 0\n");//tak dla pewności wyczyszczenie
        }

        if(sym.pelnyTyp.rodzaj_pamieci == PelnyTyp.RodzajPam.AUTOMATYCZNA)
        {
            sb.append("                mov "+akum+", ["+sym.etykieta()+"]\n");
        }
        else
        {
            char zn_drugiego_rej = 'd';
            String drugirejestr = akumulator(DLUGOSC_SLOWA_B).replace('a', zn_drugiego_rej);//rejestr na adres - zawsze o długości słowa
            sb.append("                mov "+drugirejestr+", "+sym.etykieta()+"\n");
            sb.append("                mov "+akum+", ["+drugirejestr+"]\n");

        }
        sb.append(";koniec ładowania lwartosc\n");
        if(ctx.selektor_typu_zlozonego().size() >0 || ctx.selektor_tablicowy().size() > 0){throw new RuntimeException("Operatory [] i . jeszcze nie zaimplementowane dla lwartości");}
        stosTypów.push(sym.pelnyTyp);
        return sb.toString();
    }


    @Override public String visitWyrazeniePrzypisanie(plplParser.WyrazeniePrzypisanieContext ctx)
    {
        return visit(ctx.przypisanie());
    }
    @Override public String visitPrzypisanieZwykle(plplParser.PrzypisanieZwykleContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        String wyrazenie = visit(ctx.wyrazenie());
        PelnyTyp twyrazenie = stosTypów.pop();
        Symbol sym = przestrzeń(ctx.lwartosc().ID().getText());

        if(ctx.lwartosc().selektor_tablicowy().size() < 1 && ctx.lwartosc().selektor_typu_zlozonego().size() < 1)//co znaczy, że to pojedyncz nazwa an nie np. a[3][5]
        {

            if(!sym.pelnyTyp.equals(twyrazenie)){
                Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.WARN, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                        "Typy w przypisani się nie zgadzają!\n"+sym.pelnyTyp+"\n"+twyrazenie));
            }
            //@ASM
            sb.append(wyrazenie);
            sb.append(";wpisywanie wyrażenia do jakiegoś ID:"+ctx.start.getLine() +"\n");
            String akum = akumulator(twyrazenie.typ.dlugosc_B);
            if(sym.pelnyTyp.rodzaj_pamieci == PelnyTyp.RodzajPam.AUTOMATYCZNA)
            {
                sb.append("                mov ["+sym.etykieta()+"], "+akum+"\n");
            }
            else
            {
                char zn_drugiego_rej = 'd';
                String drugirejestr = akumulator(DLUGOSC_SLOWA_B).replace('a', zn_drugiego_rej);//rejestr na adres - zawsze o długości słowa

                sb.append("                mov "+drugirejestr+", "+sym.etykieta()+"\n");
                sb.append("                mov ["+drugirejestr+"], "+akum+"\n");

            }
            sb.append(";koniec wpisywanie wyrażenia do jakiegoś ID\n");

        }
        else {throw new RuntimeException("Operatory [] i . jeszcze nie zaimplementowane dla lewych stron przypisań");}
        stosTypów.push(sym.pelnyTyp);
        return sb.toString();
    }

    /**
     * Zwykłe dodawanie/odejmowanie
     * @param ctx
     * @return
     */
    @Override public String visitWyrazenieAddyt(plplParser.WyrazenieAddytContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        String wyrazenie2 = visit(ctx.wyrazenie().get(1));
        PelnyTyp twyrazenie2 = stosTypów.pop();
        String wyrazenie1 = visit(ctx.wyrazenie().get(0));
        PelnyTyp twyrazenie1 = stosTypów.peek();
        //@ASM
        sb.append(";dodawanie/odejmowanie:"+ctx.start.getLine() +"\n");
        sb.append(wyrazenie2);
        sb.append("                push eax\n");
        sb.append(wyrazenie1);
        sb.append("                pop ebx\n");
        if(ctx.addyt.getText().equals("+"))
        {
            sb.append("                add eax, ebx\n");
        }
        if(ctx.addyt.getText().equals("-"))
        {
            sb.append("                sub eax, ebx\n");
        }
        sb.append(";koniec dodawania/odejmowania:"+ctx.start.getLine() +"\n");

        return sb.toString();
    }

    @Override public String visitWyrazenieMult(plplParser.WyrazenieMultContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        String wyrazenie2 = visit(ctx.wyrazenie().get(1));
        PelnyTyp twyrazenie2 = stosTypów.pop();
        String wyrazenie1 = visit(ctx.wyrazenie().get(0));
        PelnyTyp twyrazenie1 = stosTypów.peek();
        //@ASM
        sb.append(";mnożenie/dzielenie/modulo:"+ctx.start.getLine() +"\n");
        sb.append(wyrazenie2);
        sb.append("                push eax\n");
        sb.append(wyrazenie1);
        sb.append("                pop ebx\n");
        if(ctx.mult.getText().equals("*"))
        {
            sb.append("                imul ebx\n");
        }
        if(ctx.mult.getText().equals("/"))
        {
            sb.append("                xor edx, edx\n");
            sb.append("                idiv ebx\n");
        }
        if(ctx.mult.getText().equals("%"))
        {
            sb.append("                xor edx, edx\n");
            sb.append("                idiv ebx\n");
            sb.append("                mov eax, edx\n");
        }
        sb.append(";koniec mnożenia/dzielenia/modulo:"+ctx.start.getLine() +"\n");

        return sb.toString();
    }

    @Override public String visitWyrazeniePoteg(plplParser.WyrazeniePotegContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        String wyrazenie2 = visit(ctx.wyrazenie().get(1));
        PelnyTyp twyrazenie2 = stosTypów.pop();
        String wyrazenie1 = visit(ctx.wyrazenie().get(0));
        PelnyTyp twyrazenie1 = stosTypów.peek();
        //@ASM
        sb.append(";potęgowanie:"+ctx.start.getLine() +"\n");
        sb.append(wyrazenie2);
        sb.append("                push eax\n");
        sb.append(wyrazenie1);
        sb.append("                pop ebx\n");
        sb.append("                sub esp, 16\n");
        sb.append("                cvtsi2sd xmm0, eax\n");
        sb.append("                cvtsi2sd xmm1, ebx\n");
        sb.append("                call _pow\n");
        sb.append("                add esp, byte 16\n");
        sb.append("                cvttsd2si eax, xmm0\n");
        sb.append(";koniec potęgowania:"+ctx.start.getLine() +"\n");
        return sb.toString();
    }

    @Override public String visitWyrazenieZnak(plplParser.WyrazenieZnakContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        String wyrazenie = visit(ctx.wyrazenie());
        PelnyTyp twyrazenie = stosTypów.peek();
        //@ASM
        sb.append(";znak:"+ctx.start.getLine() +"\n");
        sb.append(wyrazenie);
        sb.append("                push eax\n");
        if(ctx.znak.getText().equals("-"))
        {
            sb.append("                neg eax\n");
        }
        sb.append(";koniec znaku:"+ctx.start.getLine() +"\n");

        return sb.toString();
    }
}
