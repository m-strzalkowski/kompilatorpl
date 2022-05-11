package pl.plpl.generatory;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import pl.plpl.bledy.SemanticOccurence;
import pl.plpl.generatory.klasyDanych.*;
import pl.plpl.parser.plplBaseVisitor;
import pl.plpl.parser.plplParser;

import static pl.plpl.generatory.klasyDanych.Typ.*;

import java.util.List;
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
        proc.text_prolog.append(proc.etykieta()).append(Procedura.PRZYROSTEK_ETYKIETY_PROLOGU).append(":\n");
        proc.text_prolog.append(";coś tu może być(prolog)...\n");
        //Epilog procedury - otwarcie
        //@ASM
        proc.text_epilog.append(proc.etykieta()).append(Procedura.PRZYROSTEK_ETYKIETY_EPILOGU).append(":\n");
        proc.text_epilog.append(";coś tu może być(epilog)...\n");
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
        proc.text.append(";PROCEDURA Z LINII "+ctx.getStart().getLine()+" - "+ctx.getStop().getLine()+"\n");
        proc.text.append(";"+proc.infoORamce().replaceAll("\n", "\n;")+"\n;koniec opisu procedury\n");
        proc.text.append(proc.text_prolog);
        proc.text.append(mid);
        proc.text.append(proc.text_epilog);
        return "";
    }
    @Override public String visitInstrukcja_zlozona(plplParser.Instrukcja_zlozonaContext ctx) {
        aktualnyZakres = Tablice.zakresPoPierwszymTokenie(ctx.getStart());
        if(aktualnyZakres==null){throw new RuntimeException("Zepsute połączenie między generatorem a analizatorem semantycznym");}
        StringBuilder sb = new StringBuilder(); for(var c : ctx.lista_instrukcji().children){sb.append(visit(c));} return sb.toString();
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
    @Override public String visitInstrukcja_wyboru(plplParser.Instrukcja_wyboruContext ctx) {

        System.out.println("wizytacja instrukcji warunkowej "+"0");

        StringBuilder returningAsm = new StringBuilder();

        String indeksInstrukcjiWarunkowejStr = String.valueOf(Tablice.dodajIfa());
        String etykieta_warunek_niespelniony = "failed_condition_"+indeksInstrukcjiWarunkowejStr;
        String etykieta_po_else = "after_else_"+indeksInstrukcjiWarunkowejStr;
        //@ASM
        //instrukcja wyboru
        returningAsm.append("\n;instrukcja warunkowa w liniach:"+ctx.start.getLine()+"-"+ctx.stop.getLine()+"\n");
        //kod warunku i ewentualny błąd/ostrzeżenie przy niezgodności typów
        returningAsm.append(visit(ctx.wyrazenie()));
        PelnyTyp typ_z_warunku = stosTypów.pop();
        if(!typ_z_warunku.typ.equals(Całk)) {var level = ((typ_z_warunku.typ.dlugosc_B == DLUGOSC_SLOWA_B)?(SemanticOccurence.Level.WARN):(SemanticOccurence.Level.FATAL));
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(level, ctx.start, ctx.start.getLine(), ctx.start.getCharPositionInLine(),
                    "Wyrażenie w warunku zwraca wynik typu "+typ_z_warunku.typ.nazwa+" a nie całkowity."
            ));
        }
        returningAsm.append("cmp eax, 0\n");
        returningAsm.append("je " + etykieta_warunek_niespelniony + "\n");
        returningAsm.append(visit(ctx.instrukcja(0)) + "\n");
        if(ctx.instrukcja().size() > 1){ returningAsm.append("jmp " + etykieta_po_else + "\n");}//trzeba, wykonując pierwszą możliwość, przeskoczyć nad kodem drugiej
        returningAsm.append(etykieta_warunek_niespelniony+ ":\n");
        if(ctx.instrukcja().size() > 1)//inaczej - else
        {
            returningAsm.append(visit(ctx.instrukcja(1)) + "\n");
            returningAsm.append(etykieta_po_else+ ":\n");
        }
        returningAsm.append("; koniec instrukcji warunkowej\n");

        return returningAsm.toString();
    }

    Stack<Integer> numery_pętli = new Stack<>();//potrzebny do przerwij - break i kontynuuj - continue
    public static String pocz_petli = "start_loop_";
    public static String koniec_petli = "end_loop_";
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInstrukcja_petli(plplParser.Instrukcja_petliContext ctx) {

        System.out.println("wizytacja pętli "+"0");

        StringBuilder returningAsm = new StringBuilder();
        Integer indeksPetli = Tablice.dodajPetle();
        numery_pętli.push(indeksPetli);
        String indeksPetliStr = String.valueOf(indeksPetli);

        //@ASM
        //instrukcja wyboru
        returningAsm.append(";instrukcja dopoki\n");

        returningAsm.append(pocz_petli + indeksPetliStr + ":\n");
        returningAsm.append(visit(ctx.wyrazenie()));
        PelnyTyp typ_z_warunku = stosTypów.pop();
        if(!typ_z_warunku.typ.equals(Całk)) {var level = ((typ_z_warunku.typ.dlugosc_B == DLUGOSC_SLOWA_B)?(SemanticOccurence.Level.WARN):(SemanticOccurence.Level.FATAL));
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(level, ctx.start, ctx.start.getLine(), ctx.start.getCharPositionInLine(),
                    "Wyrażenie w warunku zwraca wynik typu "+typ_z_warunku.typ.nazwa+" a nie całkowity."
            ));
        }
        returningAsm.append("cmp eax, 0\n");
        returningAsm.append("je " + koniec_petli + indeksPetliStr + "\n");
        returningAsm.append(visit(ctx.instrukcja()) + "\n");
        returningAsm.append("jmp " + pocz_petli + indeksPetliStr + "\n");
        returningAsm.append(koniec_petli + indeksPetliStr + ":\n");

        returningAsm.append("; koniec dopoki\n");
        numery_pętli.pop();
        return returningAsm.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInstrukcja_przerwania_petli(plplParser.Instrukcja_przerwania_petliContext ctx) {
        if(numery_pętli.empty()) {
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.start, ctx.start.getLine(), ctx.start.getCharPositionInLine(),
                    "Instrukcja przerwania pętli poza pętlą"));
        }
        StringBuilder sb = new StringBuilder();
        //@ASM
        //instrukcja przerwania pętli
        sb.append("                jmp "+koniec_petli + numery_pętli.peek()+";przerwanie petli\n");
        return sb.toString();
    }
    /**
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInstrukcja_kontynuacji_petli(plplParser.Instrukcja_kontynuacji_petliContext ctx) {
        if(numery_pętli.empty()) {
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.start, ctx.start.getLine(), ctx.start.getCharPositionInLine(),
                    "Instrukcja kontynuacji pętli poza pętlą"));
        }
        StringBuilder sb = new StringBuilder();
        //@ASM
        //instrukcja przerwania pętli
        sb.append("                jmp "+pocz_petli + numery_pętli.peek()+";powrot do poczatku petli\n");
        return sb.toString();
    }
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
            sb.append(";instrukcja zwróć()\n");
            sb.append("                call "+aktualnyZakres.procedura.etykieta()+Procedura.PRZYROSTEK_ETYKIETY_EPILOGU +"\n");

            //@ASM
            //obliczenie wyrażenia zwracanego

            if(aktualnyZakres.procedura.typZwracany != null)
            {
                if(ctx.wyrazenie() == null)
                {
                    Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                            "Zadeklarowano, że procedura zwraca typ" + aktualnyZakres.procedura.typZwracany.typ.nazwa+" a natrafiono na zwróć bez parametru"));
                }
                sb.append(visit(ctx.wyrazenie()));
                PelnyTyp typ_wyrazenia =  stosTypów.pop();
                if(!typ_wyrazenia.equalsFunctionally(aktualnyZakres.procedura.typZwracany))
                {
                    Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                            "Wyrażenie - parametr aktualny zwróć zwraca typ niezgodny z  zadeklarowanym typem zwracanym przez procedurę\n "+aktualnyZakres.procedura.typZwracany+ "\n "+typ_wyrazenia));
                }
            } else{
                if(ctx.wyrazenie() != null)
                {
                    Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                            "Zwróć z wyrażeniem w środku, a zadeklaowano, że procedura nic nie zwraca\n "));
                }
            }
            //@ASM
            //instrukcja powrotu - dalszy ciąg
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


        //@ASM
        //instrukcja wkroczenia
        sb.append(";punkt wejsciowy\n");
        sb.append("              jmp "+Procedura.PRZEDROSTEK_ETYKIETY_PO_PUNKCIE +pkt.etykieta()+"; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć\n");
        sb.append(pkt.etykieta()+":\n");
        //kod przebudowujący ramkę, ale nie dla main
        if(!Objects.equals(pkt.nazwa, Tablice.WEJSCIE_PROG)) {
            sb.append("              nop;tutaj konstrukcja ramki na parametry\n");
            sb.append(Procedura.LOKALNA_ETYKIETA_PO_PRZEBUDOWIE_RAMKI + ":; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke\n");
        }
        sb.append(";robienie miejsca na zmienne lokalne w ramce\n");
        sb.append("              push ebp;\n");
        sb.append("              mov ebp, esp;\n");
        sb.append("              sub esp, "+(aktualnyZakres.procedura.rozmiar_B_zmiennych_automatycznych())+"\n");
        sb.append(";^robienie ramki stosu\n");
        sb.append("              call "+aktualnyZakres.procedura.etykieta()+Procedura.PRZYROSTEK_ETYKIETY_PROLOGU +"\n");
        sb.append("              ;tu coś może być\n");
        sb.append("              "+Procedura.PRZEDROSTEK_ETYKIETY_PO_PUNKCIE +pkt.etykieta()+":\n");

        return sb.toString();
    }
    /**
     * <p>
     */
    @Override public String visitWyrazenieWywolanie(plplParser.WyrazenieWywolanieContext ctx)
    {
        return visit(ctx.wywolanie_funkcji());
    }
    /**
     * <p>
     */
    @Override public String visitWywolanie_funkcji(plplParser.Wywolanie_funkcjiContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        Symbol s = przestrzeń(ctx.ID().getText());
        if(s.pktWe == null){
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Próba wywołania identyfikatora nie powiązanego z punktem wejściowym:" + s.identyfikator));
        }
        else{
            if(s.pktWe.nieokreślony() /*|| ctx.kolejno()!=null*/)
            {
                throw new RuntimeException("Nieokreślone punkty wejściowe jeszcze nie zaimplementowane");
                //sb.append(wywolanie nieokreslonego(s, ctx.lista_parametrow_aktualnych().wyrazenie()));
            }
            else{
                sb.append( wywolanie_okreslonego(s, ctx.lista_parametrow_aktualnych().wyrazenie()) );
            }
        }
        return sb.toString();
    }

    /**
     * Zwraca kod wywołujący procedurę i ułozywszy przedtem ramkę stosu
     * @param sympkt symbol odpowiadający punktowi wejściowemu
     * @param argumenty lista argumentów
     * @return
     */
    public String wywolanie_okreslonego(Symbol sympkt, List<plplParser.WyrazenieContext> argumenty)
    {
        StringBuilder sb = new StringBuilder();
        Procedura proc = sympkt.pktWe.procedura;
        //Chcemy ułożyć ramkę stosu po kolei, więc idźmy po ramce:
        Integer numer_dla_punktu=null;
        //System.err.println("\nSYMBOL WOLANY:"+sympkt);
        //System.err.println("\nPUNKT WOLANY:"+sympkt.pktWe);
    if(sympkt.pktWe.dajParametry().size() != argumenty.size())
        {
            var ctx = argumenty.get(0);//TODO a co jak len==0??
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Lista parametrów formalnych ma "+sympkt.pktWe.dajParametry().size()+ " pozycji, a  lista argumentów wywołania: "+argumenty.size()));
        }
        for(var ob : proc.ramka_stosu)
        {

            if(ob.offset <= DLUGOSC_SLOWA_B){break;}
            //System.err.println("\nOB:"+ob);
            Symbol parametr = ob.powiązanySymbol();
            if(parametr.pelnyTyp.parametr_formalny && (numer_dla_punktu = sympkt.pktWe.numerArgumentuPunktu(parametr)) != null)
            {
                //@ASM
                //parametr istniejący na danej liście
                sb.append(";parametr "+parametr.identyfikator+" \n");
                sb.append(visit(argumenty.get(numer_dla_punktu)));
                PelnyTyp typ_wyrazenia =  stosTypów.pop();
                if(!typ_wyrazenia.equalsFunctionally(parametr.pelnyTyp))
                {
                    var ctx = argumenty.get(numer_dla_punktu);
                    Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                            "Wyrażenie - parametr aktualny zwraca typ niezgodny z typem parametru formalnego " + parametr.identyfikator +"\n "+parametr.pelnyTyp + "\n "+typ_wyrazenia));
                }
                sb.append(";koniec obliczania parametru "+parametr.identyfikator+" \n");
                sb.append("              push "+akumulator(parametr.pelnyTyp.rozmiar_B())+"; złożenie na stos parametru "+parametr.identyfikator+"\n");
            }
            else{
                //@ASM
                //parametru nie ma na danej liście
                sb.append("              push "+przedrostek_rozmiaru(parametr.pelnyTyp.rozmiar_B())+" 0;dziura po parametrze "+parametr.identyfikator+" \n");
            }
        }
        //@ASM
        //wywołanie samo
        sb.append("              call "+sympkt.pktWe.etykieta()+Procedura.LOKALNA_ETYKIETA_PO_PRZEBUDOWIE_RAMKI+";wywołanie procedury\n");
        //należy sie spodziewać wyniku w akumulatorze
        stosTypów.push(proc.typZwracany);
        //@ASM
        //sprzątanie stosu po wywołaniu
        sb.append("              add esp, "+proc.rozmiar_B_parametrow()+";sprzątanie stosu po wywołaniu\n");
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
    @Override public String visitDeklaracja_referencji(plplParser.Deklaracja_referencjiContext ctx) { return ""; }
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

            if(!sym.pelnyTyp.equals(twyrazenie)){var level = ((sym.pelnyTyp.equalsFunctionally(twyrazenie))?(SemanticOccurence.Level.DEBUG):(SemanticOccurence.Level.WARN));
                Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(level, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                        "Typy w przypisaniu się nie zgadzają!\n"+sym.pelnyTyp+"\n"+twyrazenie));
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
        sb.append("                pxor xmm0, xmm0\n");
        sb.append("                pxor xmm1, xmm1\n");
        sb.append("                sub esp, 8\n");
        sb.append("                cvtsi2sd xmm0, eax\n");
        sb.append("                cvtsi2sd xmm1, ebx\n");
        sb.append("                call _pow\n");
        sb.append("                add esp, 8\n");
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

    @Override public String visitWyrazenieNegacja(plplParser.WyrazenieNegacjaContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        String wyrazenie = visit(ctx.wyrazenie());
        PelnyTyp twyrazenie = stosTypów.peek();
        //@ASM
        sb.append(";negacja:"+ctx.start.getLine() +"\n");
        sb.append(wyrazenie);
        sb.append("                push eax\n");
        sb.append("                xor eax, 1\n");
        sb.append(";koniec negacji:"+ctx.start.getLine() +"\n");

        return sb.toString();
    }

    @Override public String visitWyrazeniePorownanie(plplParser.WyrazeniePorownanieContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        String wyrazenie2 = visit(ctx.wyrazenie().get(1));
        PelnyTyp twyrazenie2 = stosTypów.pop();
        String wyrazenie1 = visit(ctx.wyrazenie().get(0));
        PelnyTyp twyrazenie1 = stosTypów.peek();
        //@ASM
        sb.append(";porównanie:"+ctx.start.getLine() +"\n");
        sb.append(wyrazenie2);
        sb.append("                push eax\n");
        sb.append(wyrazenie1);
        sb.append("                pop ebx\n");
        sb.append("                cmp eax, ebx\n");
        if(ctx.porownanie.getText().equals("=="))
        {
            sb.append("                mov eax, 0\n");
            sb.append("                sete al\n");
        }
        if(ctx.porownanie.getText().equals("!="))
        {
            sb.append("                mov eax, 0\n");
            sb.append("                setne al\n");
        }
        if(ctx.porownanie.getText().equals("<"))
        {
            sb.append("                mov eax, 0\n");
            sb.append("                setl al\n");
        }
        if(ctx.porownanie.getText().equals("<="))
        {
            sb.append("                mov eax, 0\n");
            sb.append("                setle al\n");
        }
        if(ctx.porownanie.getText().equals(">"))
        {
            sb.append("                mov eax, 0\n");
            sb.append("                setg al\n");
        }
        if(ctx.porownanie.getText().equals(">="))
        {
            sb.append("                mov eax, 0\n");
            sb.append("                setge al\n");
        }
        sb.append(";koniec porównania:"+ctx.start.getLine() +"\n");

        return sb.toString();
    }

    @Override public String visitWyrazenieLogicz(plplParser.WyrazenieLogiczContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        String wyrazenie2 = visit(ctx.wyrazenie().get(1));
        PelnyTyp twyrazenie2 = stosTypów.pop();
        String wyrazenie1 = visit(ctx.wyrazenie().get(0));
        PelnyTyp twyrazenie1 = stosTypów.peek();
        //@ASM
        sb.append(";and/or:"+ctx.start.getLine() +"\n");
        sb.append(wyrazenie2);
        sb.append("                push eax\n");
        sb.append(wyrazenie1);
        sb.append("                pop ebx\n");
        if(ctx.logicz.getText().equals("||"))
        {
            sb.append("                or eax, ebx\n");
        }
        if(ctx.logicz.getText().equals("&&"))
        {
            sb.append("                and eax, ebx\n");
        }
        sb.append(";koniec and/or:"+ctx.start.getLine() +"\n");

        return sb.toString();
    }
}
