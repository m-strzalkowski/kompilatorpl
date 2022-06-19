package pl.plpl.generatory;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import pl.plpl.bledy.SemanticOccurence;
import pl.plpl.generatory.klasyDanych.*;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektAutomatyczny;
import pl.plpl.generatory.klasyDanych.tablice.TablicaC;
import pl.plpl.parser.plplBaseVisitor;
import pl.plpl.parser.plplParser;

import static pl.plpl.generatory.klasyDanych.Typ.*;
import static pl.plpl.generatory.Tablice.niedereferencja;

import java.util.List;
import java.util.Objects;
import java.util.Stack;

@SuppressWarnings({"FieldMayBeFinal", "StringConcatenationInsideStringBufferAppend"})
public class GeneratorVisitor extends plplBaseVisitor<String> {
    private Zakres aktualnyZakres;
    private Stack<PelnyTyp> stosTypów = new Stack<>();
    /*
        Nazwa przestrzeń odnosi się do przestrzeni nazw, którą można zdefiniować jako zbiór wszystkich symboli dostępnych w pewnym rejonie kodu źródłowego,
        zazwyczaj zasięgu/zakresie, czy procedurze, choć można by sobie wyobrazić generację przestrzeni nazw dla samego napisu identyfikatora/tokena w kodzie
         - będzie zawierać jedynie odpowiedni symbol, co właśnie jest realizowane przez poniższe funkcje.
     */
    Symbol przestrzeń(String identyfikator, ParserRuleContext ctx)
    {
        Symbol s = aktualnyZakres.poNazwie(identyfikator);//dodać jeszcze zawsze token - pozwoli sprawdzać użycie przed deklaracją i pisać gdzie dokładnie nie znaleziono nazwy
        if(s==null)
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "Nie znaleziono w przestrzeni nazw nic o identyfikatorze" +identyfikator));
        else if(s.token != null && ctx.start.getStartIndex() < s.token.getStartIndex()){
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                    "Użycie identyfikatora " +identyfikator+ "przed jego pierwszą deklaracją w linii "+s.token.getLine()+":"+s.token.getCharPositionInLine()));
        }
        return s;
    }
    Symbol przestrzeń(Token token, ParserRuleContext ctx)
    {
        Symbol s = aktualnyZakres.poTokenie(token);
        if(s==null)
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                    "Nie znaleziono w przestrzeni nazw nic powiązanego z tokenem" +token));
        return s;
    }
    //pomocnicza metoda opakowująca odwołanie się do atrybutu mówiącego, czy dany węzeł-podwyrażenie powinien zwrócić kod zwracający adres(true), czy wartość obiektu(false)
    boolean czy_niederef(ParserRuleContext ctx){return Tablice.opcje.nidereferencja.daj(ctx) != null && Tablice.opcje.nidereferencja.daj(ctx) ;}
    //boolean czy_niederef(ParserRuleContext ctx){return niedereferencja.get(ctx) != null && niedereferencja.get(ctx);}

    @Override public String visitProgram(plplParser.ProgramContext ctx) {
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "POCZĄTEK GENERACJI KODU"));
        visitChildren(ctx);
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "KONIEC GENERACJI KODU"));
        return "";//węzły poniżej procedury zwracają w stringach kod, przechowywany w procedura.text Wartość zwracana przez węzły powyżej procedury nie ma żadnego znaczenia.
    }
    //@Override public String visitByt_globalny(plplParser.Byt_globalnyContext ctx) { return ctx.getText(); }

    /** Znajduje się tu logika formujaca odpowiednio kod - sekcję .text procedury.
     * @return wartość zwracana nie ma żadnego znaczenia, ponieważ kod węzłów potomnych przeczywywany jest w składowych procedury odpowiadających sekcjom i sa one używane do składania kodu dopiero przez SkladaczKoduAsemblera
     */
    @Override public String visitProcedura(plplParser.ProceduraContext ctx)
    {
        aktualnyZakres = Tablice.zakresPoPierwszymTokenie(ctx.getStart());
        if(aktualnyZakres==null){throw new RuntimeException("Zepsute połączenie między generatorem a analizatorem ssemantycznym");}
        Procedura proc = aktualnyZakres.procedura;//żeby krócej było
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "wizytacja procedury "+aktualnyZakres.procedura.nr));


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
            //System.out.println("instrukcja:"+instr.getText()+"|"+zwr);
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
    /** Standardowy schemat kodu dla if.
     */
    @Override public String visitInstrukcja_wyboru(plplParser.Instrukcja_wyboruContext ctx) {

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
    /** Standardowy schemat kodu dla while.
     */
    @Override public String visitInstrukcja_petli(plplParser.Instrukcja_petliContext ctx) {

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
    /** break - przerwij
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
    /** continue - kontynuuj/nazad (sic!)
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
    /** return - zwróć(..)
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
    /** zacznij ID (typ ID, typ ID ... ) - oznaczenie punktu wejścia sterowania do procedury
     */
    @Override public String visitInstrukcja_wkroczenia(plplParser.Instrukcja_wkroczeniaContext ctx) {
        Symbol s = przestrzeń(ctx.ID().getText(),ctx);//aktualnyZakres.poNazwie(ctx.ID().getText());
        if(s==null){return "";}
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
    //
    //WYRAŻENIA
    //
    /** Węzeł istniejący dla technikaliów gramatycznych - patrz  visitWywolanie_funkcji
     */
    @Override public String visitWyrazenieWywolanie(plplParser.WyrazenieWywolanieContext ctx)
    {
        return visit(ctx.wywolanie_funkcji());
    }
    /** Kod rozsadzający, który z dwóch sposobów wywołań zastosować, patrz: wywolanie_okreslonego,
     */
    //TODO wywolanie_naiwne_cdecl
    //TODO wbudowany typ złożony C
    @Override public String visitWywolanie_funkcji(plplParser.Wywolanie_funkcjiContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        Symbol s = przestrzeń(ctx.ID().getText(),ctx);
        if(s==null){return "";}//rezygnacja z generacji kodu, bo nie wiadomo dlaczego
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

    @Override public String visitNaiwne_wywolanie(plplParser.Naiwne_wywolanieContext ctx)
    {
        return  ";naiwne wywolanie w linii"+ctx.start.getLine()+":"+ctx.start.getCharPositionInLine()+"\n"+
                wywolanie_naiwne_cdecl(ctx.ID().getText(), ctx.lista_parametrow_aktualnych().wyrazenie()) +
                ";koniec naiwnego wywołania w linii"+ctx.stop.getLine()+":"+ctx.stop.getCharPositionInLine()+"\n"
                ;
    }

    /**
     * Zwraca kod, który naiwnie wywołuje procedurę o dosłownie podanej etykiecie, składając argumenty na stosie zgodnie z konwencją cdecl.
     * @param wołany dosłowna wartość wołanej etykiety
     * @param argumenty lista argumentów
     * @return
     */
    private String wywolanie_naiwne_cdecl(String wołany, List<plplParser.WyrazenieContext> argumenty) {
        StringBuilder sb = new StringBuilder();
        //nie przejmujemy się składaniem caleer-save-registers na stos, bo... żadnych tak naprawdę nie używamy...
        //dla każdego argumentu, idąc od tyłu oblicz go i składaj na tos
        int rozm_złożonych=0;//Będziemy liczyć ile bajtów zostanie złożonych na stos.
        for(int i= argumenty.size()-1; i>=0; i--)
        {
            var arg = argumenty.get(i);
            //uzyskaj kod umieszczający w akumulatorze argument i jego typ
            sb.append(";obliczenie argumentu nr "+i+"\n");
            sb.append(visit(arg));
            var typarg = stosTypów.pop();
            sb.append(";koniec obliczenia argumentu nr "+i+", typu"+typarg.toString_cannonical()+"\n");
            sb.append("                sub esp, "+typarg.rozmiar_B()+"\n");
            sb.append("                mov [esp], "+akumulator(typarg.rozmiar_B())+"\n");
            //sb.append("                push "+akumulator(typarg.rozmiar_B())+"\n");
            sb.append(";zlozenie argumentu nr "+i+"na stos\n");
            rozm_złożonych += typarg.rozmiar_B();
        }
        sb.append("                call "+wołany+";wolanie w ciemno etykiety podanej doslownie przez uzytkownika\n");
        sb.append("              add esp, "+rozm_złożonych+";sprzątanie stosu po wywołaniu\n");
        PelnyTyp nieznanytyp = new PelnyTyp(); nieznanytyp.typ=Ref;
        stosTypów.push(nieznanytyp);//Nie wiemy, co dane wywołanie zwraca, zakładamy, że coś.
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

    /** Zakłada, że uprzedni kod umieścił w akumulatorze słowo maszynowe zawierające kod wyjścia (choć pod linuksem i tak lepiej ograniczyć się do kodów poniżej 127)
     * @return zwraca kod, wywołujący exit z libc
     */
    public String kod_zakonczenia_procesu()
    {
        return "push eax\ncall _exit\n";
    }
    /** Opakowanie dla exit z libc
     */
    @Override public String visitInstrukcja_zakonczenia(plplParser.Instrukcja_zakonczeniaContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.wyrazenie()));
        PelnyTyp t = stosTypów.pop();
        sb.append(kod_zakonczenia_procesu());
        if(!t.equalsFunctionally(Całk))
        {
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Wyrażenie w instrukcji zakończenia zwraca typ inny niż całkowity." +"\n typ:"+t));
        }
        return sb.toString();
    }

    public static int licznik_repr_typow=0;
    public String wypiszWyrazenie(plplParser.WyrazenieContext ctx)
    {

        String akum = akumulator(Ref.dlugosc_B);
        var sb = new StringBuilder();
        sb.append(";wypisanie wyrazenia\n");
        String kod_wyrazenia = visit(ctx);
        PelnyTyp typWyrazenia = stosTypów.pop();

        sb.append(";typ wyrazenia:"+typWyrazenia+"\n");
        if(typWyrazenia.czyAtomiczny())
        {
            if(typWyrazenia.typ == Typ.Całk )
            {

                //@ASM
                //wypisanie
                //statyczny:etykieta -> do akumulatora i dopiero push
                //adres -> do akumulatora i dopiero push/mov
                //automatyczny: od razu można [ebp-?]?
                //co z cholernymi bajtami?
                sb.append(kod_wyrazenia);
                sb.append("                sub esp, 4\n");
                sb.append("                mov dword [esp], eax\n");
                sb.append("                push dword WYPISZ_CALK_FMT\n");
                sb.append("                call _printf\n");
                sb.append("                add esp, byte 8\n");
                sb.append(";koniec wypisania - całk\n");

            }
            else if(typWyrazenia.typ == Typ.Znak )
            {

                //@ASM
                //wypisanie
                sb.append(kod_wyrazenia);
                //sb.append("                mov al ["+sym.etykieta()+"]\n");
                //sb.append("                push byte ["+sym.etykieta()+"]\n");
                sb.append("                sub esp, 1\n");
                sb.append("                mov byte [esp], al\n");
                sb.append("                push dword WYPISZ_ZNAK_FMT\n");
                sb.append("                call _printf\n");
                sb.append("                add esp, byte 5\n");
                sb.append(";koniec wypisania - znak\n");

            }
        }
        else{//wypisanie adresu

            //ograniczone wypisanie napisu
            if(typWyrazenia.typ == Znak && typWyrazenia.krotnosc_tablicowa == 1)// && typWyrazenia.modyfikowalonosc == PelnyTyp.Mod.STALA)
            {
                //dość brzydkie rozwiązanie problemu, że potrzebny jest tutaj adres tablicy, a nie jej wartość
                Tablice.opcje.nidereferencja.ustaw(ctx, true);
                kod_wyrazenia = visit(ctx);
                stosTypów.pop();
                sb.append(kod_wyrazenia);
                sb.append("                push "+akum+";wartosc na stos\n");
                //sb.append("                push dword WYPISZ_NAPIS_FMT\n");//ogranicza długość napisu do 64 znaków
                sb.append("                push dword WYPISZ_NAPIS_FMT\n");//ogranicza długość napisu do 64 znaków
                sb.append("                call _printf\n");
                sb.append("                add esp, byte 8\n");
                sb.append(";koniec wypisania wyrazenia - string ograniczony do 64 znaków\n");
            }
            //wypisanie referencji
            else{
                String etykieta_reprezentacji = "REPREZENTACJA_TYPU_"+(licznik_repr_typow++);
                aktualnyZakres.procedura.rodata.append(etykieta_reprezentacji+":   db    `"+typWyrazenia.toString_cannonical()+"@`, 0  ;z linii"+ctx.start.getLine()+"\n");
                sb.append("                push dword "+etykieta_reprezentacji+"\n");
                sb.append("                call _printf\n");
                //sb.append("                add esp, byte 4\n");//można po drugim wywołaniu dodać 12 zamiast 8...
                sb.append(kod_wyrazenia);
                sb.append("                push "+akum+";wypisanie referencji\n");
                sb.append("                push dword WYPISZ_REF_FMT\n");
                sb.append("                call _printf\n");
                sb.append("                add esp, byte 12\n");
                sb.append(";koniec wypisania wyyrazenia - referencja\n");

            }
        }
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitWypisanie(plplParser.WypisanieContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(";wypisanie w linii"+ctx.start.getLine()+"\n");
        for (var w:ctx.wyrazenie()) {
            sb.append(wypiszWyrazenie(w));
        }
        sb.append(";koniec wypisania w linii"+ctx.stop.getLine()+"\n");

        return sb.toString();
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
        if(czy_niederef(ctx)){Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "Próba uzyskania adresu stałej atomicznej: "+ctx.getText()+" \n"));}

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
            String wartosc = ctx.stala_atomiczna().ZNAK_DOSL().getText().replaceAll("^" +
                    "\'|\'$", "");//usuwamy cudzysłowy z końca i początku
            //@ASM
            //stała całkowita
            sb.append(";stała znakowa\n");
            sb.append("                mov "+akumulator(DLUGOSC_SLOWA_B)+", 0\n");//tak dla pewności wyczyszczenie
            sb.append("                mov eax, `"+wartosc+"`\n");
            sb.append(";koniec stałej znakowej\n");
        }
        if(ctx.stala_atomiczna().ZMIENN()!=null)
        {
            throw new RuntimeException("Jeszcze nie ma zmiennoprzecinkowych! (stała zmiennoprzecinkowa w wyrażeniu)");
        }
        stosTypów.push(t);
        return sb.toString();
    }
    /**
     * Visit a parse tree produced by the {@code wyrazenieAlokacja}
     * labeled alternative in {link plplParser_wyrazenie}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override public String visitWyrazenieAlokacja(plplParser.WyrazenieAlokacjaContext ctx)
    {
        String akum = akumulator(DLUGOSC_SLOWA_B);
        StringBuilder sb = new StringBuilder();
        sb.append(";alokacja"+ctx.start.getLine()+":"+ctx.start.getCharPositionInLine()+"\n");
        PelnyTyp t = new PelnyTyp();
        //troche powtórzenie kodu z enterPelny_typ z UstalaczaStruktur
        var tt = ctx.alokacja().pelny_typ_dynamiczny();
        if(tt.nazwa_dynamicznie_alokowalnego_typu_atom()!=null)
        {
            t.typ = zTokena( tt.nazwa_dynamicznie_alokowalnego_typu_atom().getStart());
        }
        else if(tt.ID() != null)
        {
            t.typ = Tablice.typPoNazwie(tt.ID().getText());
        }
        t.modyfikowalonosc = PelnyTyp.Mod.ZMIENNA;
        //obliczenie krotności tablicowej: ilość pustych nawiasów [] plus ten z wyrażeniem
        t.krotnosc_tablicowa += ctx.alokacja().pelny_typ_dynamiczny().nieokreslony_deklarator_tablicowy().size() + ((ctx.alokacja().pelny_typ_dynamiczny().obliczany_deklarator_tablicowy() != null)?(1):(0));//brawo dla tego durnia, co nie pozwolił w javie, nawet na jawne, konwersje boolean -> int!
        //Obliczenie wyrażenia - długości tablicy
        PelnyTyp typWyrazenia;
        if(ctx.alokacja().pelny_typ_dynamiczny().obliczany_deklarator_tablicowy() != null)//kiedy jest wyrażenie określające ilość elementów tablicy.
        {
            sb.append( visit(ctx.alokacja().pelny_typ_dynamiczny().obliczany_deklarator_tablicowy().wyrazenie()) );
            typWyrazenia = stosTypów.pop();
        }
        else{//kiedy typ w nawiasach kończy się [] - pustymi nawiasami kwadratowymi.
            if(t.typ.atomiczny)
            {
                if(t.krotnosc_tablicowa >= 1)//przypadki typu nowy(całk[][][])
                {
                    Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                            "Wiem, że mam zaalokować tablicę obiektów atomicznych, ale nie podałeś jakiego rozmiaru."
                    ));
                }
                else{//przypadki typu nowy(całk)
                    Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                            "Próba alokacji jednego elementu typu atomicznego:"+t.typ.nazwa+". Nie da się alokować typów atomicznych, potrzeba referencji. Możesz użyć "+t.typ.nazwa+"[1]"
                    ));
                    t.krotnosc_tablicowa++;
                }
                sb.append("                mov "+akum+",1\n");
                sb.append(kod_zakonczenia_procesu());//blokada dalszego wykonania
                typWyrazenia = new PelnyTyp(); typWyrazenia.typ=Całk;
            }
            else {
                if(t.krotnosc_tablicowa >= 1)//przypadki typu nowy(t[][])
                {
                    Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                            "Wiem, że mam zaalokować tablicę typów złożonych "+t.typ.nazwa+", ale nie podałeś jakiego rozmiaru."
                    ));
                    sb.append("                mov "+akum+",1\n");
                    sb.append(kod_zakonczenia_procesu());//blokada dalszego wykonania
                }
                //Alokacja tylko jednego okazu danego typu np. nowy(kot).
                sb.append("                mov " + akum + ",1\n");
                typWyrazenia = new PelnyTyp();
                typWyrazenia.typ = Całk;
            }
        }
        if(typWyrazenia.typ != Całk || !typWyrazenia.czyAtomiczny())
        {
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Wyrażenie zwracające długość alokowanej tablicy zwróciło wynik typu:"+typWyrazenia+" (a nie typu całk).\n W razie kontynuowania zostanie zaalokowany blok o długości 0. (Vide zachowanie malloc(0) w aktualnie używanej implementacji libc)."
            ));
            sb.append("                mov "+akum+",1\n");
            sb.append(kod_zakonczenia_procesu());//wykonanie tu się skończy
        }


        int dl_elementu=0;
        if(t.typ.atomiczny && t.krotnosc_tablicowa < 1){dl_elementu = t.typ.dlugosc_B;}
        if(t.typ.atomiczny && t.krotnosc_tablicowa >=1){dl_elementu = Ref.dlugosc_B;}
        if(!t.typ.atomiczny && t.krotnosc_tablicowa < 1){dl_elementu = t.typ.struktura.rozmiar_B_calej_pamieci_lokalnej();}//potrzebny faktyczny rozmiar struktury, np. 37B, do jednego, albo do tablicy
        if(!t.typ.atomiczny && t.krotnosc_tablicowa >=1){dl_elementu = Ref.dlugosc_B;}
        //if(t.krotnosc_tablicowa == 1){dl_elementu = t.typ.dlugosc_B;}
        //if(t.krotnosc_tablicowa > 1){dl_elementu = Ref.dlugosc_B;}
        //sb.append(";kt="+t.krotnosc_tablicowa+"\n");
        sb.append("                imul "+akum+","+dl_elementu+"\n");
        sb.append("                push "+akum+"\n");
        sb.append("                call _malloc\n");
        sb.append("                add esp, "+DLUGOSC_SLOWA_B+"\n");
        // adres w eax
        stosTypów.push(t);
        sb.append(";koniec alokacji"+ctx.stop.getLine()+":"+ctx.stop.getCharPositionInLine()+"\n");
        return sb.toString();
    }
    /**
     * Visit a parse tree produced by the {@code wyrazenieDealokacja}
     * labeled alternative in {link plplParser_wyrazenie}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override public String visitWyrazenieDealokacja(plplParser.WyrazenieDealokacjaContext ctx)
    {
        //zwraca NIC - typ BRAK
        StringBuilder sb = new StringBuilder();
        sb.append(";dealokacja"+ctx.start.getLine()+":"+ctx.start.getCharPositionInLine()+"\n");
        PelnyTyp t = new PelnyTyp();
        t.krotnosc_tablicowa=0;
        t.modyfikowalonosc= PelnyTyp.Mod.STALA;
        t.typ= BRAK;
        String akum = akumulator(DLUGOSC_SLOWA_B);
        sb.append( visit(ctx.dealokacja().wyrazenie()) );
        var typWyrazenia = stosTypów.pop();
        if(typWyrazenia.czyAtomiczny())
        {
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Próba dealokacji typu atomicznego:"+typWyrazenia+"\n Dealokacja nie zajdzie."
            ));
            sb.append("                mov "+akum+",0\n");
            return sb.toString();
        }
        sb.append("                push "+akum+"\n");
        sb.append("                call _free\n");
        sb.append("                add esp, "+DLUGOSC_SLOWA_B+"\n");
        sb.append("                mov "+akum+", 0\n");
        sb.append(";koniec dealokacji"+ctx.stop.getLine()+":"+ctx.stop.getCharPositionInLine()+"\n");
        stosTypów.push(t);
        return sb.toString();
    }



    @Override public String visitWyrazenieNawiasy(plplParser.WyrazenieNawiasyContext ctx) { return visit(ctx.wyrazenie()); }
    /**
     * @param typElem Typ elementu tablicy (można go uzyskać przez PelnyTyp.dereferencja(/typTablicy/))
     * @param rejestr_z_indeksem rejestr, w jakim umieszczono indeks (np. ecx)
     * @param rejestr_źródłowy rejestr, w którym umieszczono adres tablicy
     * @param dereferencja_na_końcu czy kod ma zwracać wartość obiektu=true, czy adres=false
     * @param długość_nagłówka o ile bajtów od adresu tablicy są przesunięte dane (dla tablic z C - 0)
     * @return zwraca kod, pozostawiający w akumulatorze odpowiedniej długości wartośc/adres elementu tablicy.
     */
    public String kod_indeksowania_tablicy(PelnyTyp typElem, String rejestr_z_indeksem, String rejestr_źródłowy, boolean dereferencja_na_końcu, int długość_nagłówka)
    {
        //@ASM - indeksowanie
        String akum;String s;
        int rozm_elem;
        if((typElem.typ.atomiczny && typElem.krotnosc_tablicowa > 1) || (!dereferencja_na_końcu && typElem.krotnosc_tablicowa > 1) )
        {
            //w tym wypadku zwracany obiekt będzie zawsze referencją
            rozm_elem = Ref.dlugosc_B;
            s=";A"+rozm_elem+"kt="+typElem.krotnosc_tablicowa+"\n";
        }
        else{
            rozm_elem = typElem.rozmiar_B();
            s=";B"+rozm_elem+"\n";
        }
        String opkod;
        if(dereferencja_na_końcu)
        {
            opkod = "mov";
            akum = akumulator(rozm_elem);
        }
        else {
            opkod = "lea";
            akum = akumulator(Ref.dlugosc_B);
        }
        //akum = akumulator(rozm_elem);
        //opkod = (dereferencja_na_końcu)?("mov"):("lea");
        return s+"        "+opkod + " "+ akum + ", ["+rejestr_źródłowy+"+"+rejestr_z_indeksem+"*"+rozm_elem+"+"+długość_nagłówka+"];indeksowanie tablicy, typ elementu:"+typElem+" dereferencja_na_końcu:"+dereferencja_na_końcu+";"+typElem.typ.dlugosc_B+"\n";
    }

    /** Odpowiada za konstrukcje typu t[q].
     * Zwraca kod ładujący do akumulatora adres/wartość(w zależności od wartości atrybuty niedereferencja) n-ego elemntu tablicy
     * Obecnie uznaje, że wszystkie tablice, to tablice z C (ciąg jednakowych elementów, z których zerowy zaczyna się pod adresem tablicy).
     */
    @Override public String visitWyrazenieSelekcjaTablicowa(plplParser.WyrazenieSelekcjaTablicowaContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(";początek elementu tablicy z linii"+ctx.start.getLine()+":"+ctx.start.getCharPositionInLine()+"\n");
        //1. Obliczenie kodu - indeksu
        String oblicz_indeks = visit(ctx.selektor_tablicowy().wyrazenie());
        PelnyTyp typIndeksu = stosTypów.pop();
        //2. Błędy związane z typem indeksu
        if(typIndeksu.typ != Całk || !typIndeksu.czyAtomiczny())
        {
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Wyrażenie zwracające indeks tablicy zwróciło zamiast całkowitego typ"+typIndeksu
            ));
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.WARN, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Niewłaściwy typ wyrażenia zwracającego indeks : wygenerowano kod zwracający 0 jako indeks"
            ));
            sb.append("                mov "+akumulator(DLUGOSC_SLOWA_B)+",1\n");
            sb.append(kod_zakonczenia_procesu());
        }
        else{
            sb.append(oblicz_indeks);
        }
        //3. Złożenie indeksu na stos
        String akumcałk = akumulator(Całk.dlugosc_B);
        String rej_licznika  = akumcałk.replace('a','c');
        sb.append("                push "+akumcałk+"\n");//zachowanie sobie indeksu na później

        //4. Kod zwracający adres tablicy, obliczenie typu jej elementu
        String tablica = visit(ctx.wyrazenie());
        PelnyTyp typTablicy = stosTypów.pop();
        PelnyTyp typElem = PelnyTyp.dereferencja(typTablicy);
        String akumadr = akumulator(typTablicy.rozmiar_B());
        //5. Błąd, jeżeli typu elementu nie da się obliczyć (bo to już pojedynczy element atomiczny)
        if(typElem == null)
        {
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Dereferencja elementu o takim typie jest niemożliwa (to pojedynczy obiekt, nie tablica:krotność tablicowa:"+typTablicy.krotnosc_tablicowa+")\ntyp:"+typTablicy
            ));
            sb.append("                mov "+akumulator(DLUGOSC_SLOWA_B)+",1\n");
            sb.append(kod_zakonczenia_procesu());
            PelnyTyp złytyp = new PelnyTyp(); złytyp.typ=Ref;
            stosTypów.push(złytyp);//żeby nie popsuć stosu.
            return sb.toString();//dlatego, że typElem == null spowodowałby błąd przy wywołaniu kod_indeksowania_tablicy później
        }
        //4.5 dodanie kodu - adres tablicy
        sb.append(tablica);
        //6. Zebranie licznika ze stosu do rejestru licznika (ecx)
        sb.append("                pop "+rej_licznika+";indeks tablicy\n");//zczytanie indeksu złozonego wcześniej na stos
        //7. Obliczenie kodu zwracającego wartość/adres elementu tablicy o danym indeksie.
        sb.append(kod_indeksowania_tablicy(typElem, rej_licznika, akumadr, !czy_niederef(ctx), 0));
        sb.append(";koniec elementu tablicy z linii"+ctx.stop.getLine()+":"+ctx.stop.getCharPositionInLine()+"\n");
        //8. Złożenie na stos typów typu elementu
        stosTypów.push(typElem);
        //Nota: PełnyTyp, jako koncept języka źródłowego, nie zawiera informacji o tym, czy w akumulatorze, podczas wykonania kodu znajdzie się adres czy wartość obiektu. Ta informacja przechowywana jest w atrybucie niedereferencja drzewa składniowego.
        return sb.toString();
    }

    public String kod_indeksowania_struktury(PelnyTyp typStrukt, PelnyTyp typSkladowej, int offset_składowej, String rejestr_źródłowy, boolean dereferencja_na_końcu)
    {
        //@ASM - indeksowanie
        String akum;
        int rozm_elem, rozm_ref_obj;
        //sprawdzenie typu referencji do struktury
        if(typStrukt.typ.atomiczny || typStrukt.krotnosc_tablicowa > 1)
        {
            return null;//nie da się
        }
        else{
            rozm_ref_obj = typStrukt.rozmiar_B();
        }
        //typ składowej - jak przy tablicy
        if((typSkladowej.typ.atomiczny && typSkladowej.krotnosc_tablicowa > 1) || !dereferencja_na_końcu)
        {
            //w tym wypadku zwracany obiekt będzie zawsze referencją
            rozm_elem = Ref.dlugosc_B;
        }
        else{
            rozm_elem = typSkladowej.rozmiar_B();
        }
        akum = akumulator(rozm_elem);
        String opkod = (dereferencja_na_końcu)?("mov"):("lea");
        return "        "+opkod + " "+ akum + ", ["+rejestr_źródłowy+"+"+offset_składowej+"];typ:"+typStrukt.typ.nazwa+"."+typSkladowej.typ.nazwa+"(kt:"+typSkladowej.krotnosc_tablicowa+")\n";
    }

    /** Zwraca adres/wartość składowej obiektu złożonego. Konceptualnie to jakby indeksowanie tablicy, wedle stałych przesunięć określanych przez ułożenie składowych w strukturze.
     */
    @Override public String visitWyrazenieSelekcjiSkladowej(plplParser.WyrazenieSelekcjiSkladowejContext ctx)
    {
        //ctx.selektor_typu_zlozonego().ID()
        StringBuilder sb = new StringBuilder();
        sb.append(";początek uzyskiwania składowej w linii"+ctx.start.getLine()+":"+ctx.start.getCharPositionInLine()+"\n");
        //1. Adres struktury
        String struktura = visit(ctx.wyrazenie());
        PelnyTyp typStruktury = stosTypów.peek();//później ściągniemy, żeby te wszystkie returny przy błędach nie popsuły stosu.
        //2.Czy to w ogóle typ złożony?
        if(typStruktury.czyAtomiczny())
        {
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                    "Próba uzyskania jakiejś składowej, lecz typ "+typStruktury+" to typ atomiczny, więc żadnych składowych nie ma."
            ));
            sb.append("                mov "+akumulator(DLUGOSC_SLOWA_B)+",1\n");
            sb.append(kod_zakonczenia_procesu());
            return sb.toString();//trzeba skończyć przetwarzanie, bo typy atomiczne mają pole struktura=null, więc próba dostania się do zakresu w takiej strukturze skończyła by się błędem.
        }
        //3. Typ elementu;
        Symbol skladowa = typStruktury.typ.struktura.najogolniejszy_zakres.poNazwie(ctx.selektor_typu_zlozonego().ID().getText());
        if(skladowa == null)
        {
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                    "Próba uzyskania składowej `"+ctx.selektor_typu_zlozonego().ID().getText()+"` lecz typ "+typStruktury+"nie posiada składnika o takiej nazwie"
            ));
            sb.append("                mov "+akumulator(DLUGOSC_SLOWA_B)+",1\n");
            sb.append(kod_zakonczenia_procesu());
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.INFO, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                    "Składowe obiektu typu "+typStruktury.typ.nazwa+":\n"+typStruktury.typ.struktura.czytelnaListaSkładowych()
            ));
            return sb.toString();//też trzeba skończyć przetwarzanie węzła, ze wzgl. na skladowa.Pelny typ w nast. linijce (jeśli skladowa == null -> błąd javy)
        }
        stosTypów.pop();//ściągamy typ struktury
        PelnyTyp typElem = skladowa.pelnyTyp;
        if(typElem == null)
        {
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "BŁĄD WEWNĘTRZNY KOMPILATORA:GeneratorVisitor:typElem == null\nskladowa.pelnyTyp:"+skladowa.pelnyTyp+"\nskladowa:"+skladowa));
        }
        String akumadr = akumulator(typStruktury.rozmiar_B());
        //(wklej kod uzyskujący adr. struktury)
        sb.append(struktura);
        //4. Obliczenie kodu zwracającego wartość/adres składowej struktury
        sb.append(kod_indeksowania_struktury(typStruktury, typElem, ((ObiektAutomatyczny)skladowa.obiektPamieci).offset, akumadr, !czy_niederef(ctx)));
        sb.append(";koniec uzyskiwania składowej w linii"+ctx.stop.getLine()+":"+ctx.stop.getCharPositionInLine()+"\n");
        //8. Złożenie na stos typów typu elementu
        stosTypów.push(typElem);
        //System.err.println("@@@@@@@@@@@@@"+typElem);
        //Nota: PełnyTyp, jako koncept języka źródłowego, nie zawiera informacji o tym, czy w akumulatorze, podczas wykonania kodu znajdzie się adres czy wartość obiektu. Ta informacja przechowywana jest w atrybucie niedereferencja drzewa składniowego.
        return sb.toString();
    }
    //sposób na uzyskanie adresu obiektu. (Tylko, że konstrukcja typu @a=2; będzie legalna, a nie powinna...)
    @Override public String visitWyrazenieAdres(plplParser.WyrazenieAdresContext ctx){
        //ustawia blokadę dereferencji na wyrażeniu potomnym. (i uruchamia logike jej propagacjiw dół i ewentualnych błędów - vide klasa Atrybut_Nidereferencja)
        Tablice.opcje.nidereferencja.ustaw(ctx.wyrazenie(), true);
        return  ";operator uzyskania adresu w linii "+ctx.start.getLine()+"\n"+
                visit(ctx.wyrazenie())+
                ";koniec operatora uzyskania adresu w linii "+ctx.stop.getLine()+"\n";
    }
    @Override public String visitWyrazenieLwartosc(plplParser.WyrazenieLwartoscContext ctx) {if(czy_niederef(ctx)){niedereferencja.put(ctx.lwartosc(), true);} return visit(ctx.lwartosc()); }
    /*
    @Override public String visitLwartosc(plplParser.LwartoscContext ctx)
    {
        if(ctx.selektor_tablicowy().size() < 1 && ctx.selektor_typu_zlozonego().size() < 1)
        {
            Symbol sym = przestrzeń(ctx.ID().getText(),ctx);
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
     * Dodatkowo, trzeba umieć zwracać adresy/wartości potworków typu: a.b[d+2][7][12+w].e , co realizuje selektor tablicowy i typu złożonego
     *
     */
    @Override public String visitLwartosc(plplParser.LwartoscContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(";załadowanie lwartości:"+ctx.start.getLine() +" niederef:"+niedereferencja.get(ctx)+" "+czy_niederef(ctx)+"\n");
        //Przypadek szczególny - nic
        if(ctx.NIC() != null)
        {
            if(czy_niederef(ctx)){Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Nic jest niebytem a on jest wszędzie i nigdzie; jak śmiesz żądać jego adresu człowiecze? (Podałem 0.)\n"));}
            sb.append("                mov " + akumulator(Ref.dlugosc_B) + ", 0;nic\n");
            PelnyTyp t = new PelnyTyp(); t.typ = Ref; t.modyfikowalonosc = PelnyTyp.Mod.STALA;
            stosTypów.push(t);
            sb.append(";koniec ładowania lwartosci - nic\n");
            return sb.toString();
        }
        //Załadowanie odpowiedniego symbolu dla ID albo napisu dosłownego
        Symbol sym=null;
        if(ctx.ID()!=null){ sym = przestrzeń(ctx.ID().getText(),ctx);}
        if(ctx.stala_tablicowa()!=null){ sym = przestrzeń(ctx.stala_tablicowa().NAPIS_DOSL().getSymbol(),ctx);}
        if(sym == null){
            if(czy_niederef(ctx)){Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Nie znaleziono symbolu dla"+ctx.getText()+"\n"));}
            sb.append("mov eax,1");
            sb.append(kod_zakonczenia_procesu());
            var t=new PelnyTyp();t.typ=Ref;t.modyfikowalonosc= PelnyTyp.Mod.STALA;//żeby stos sie nie rozleciał
            stosTypów.push(t);
            return sb.toString();
        }

        //@ASM
        //lwartosc
        sb.append(";symbol:"+sym+"\n");
        //String akum = akumulator(sym.pelnyTyp.typ.dlugosc_B);
        String wlk = "";//jawne określenie wielkości
        String akum = akumulator(sym.pelnyTyp.rozmiar_B());
        if(ctx.ID() != null || ctx.stala_tablicowa().NAPIS_DOSL() != null)//czy dla napis_dosl zadziała?
        {
            if (sym.pelnyTyp.rozmiar_B()< DLUGOSC_SLOWA_B) {
                sb.append("                mov " + akumulator(DLUGOSC_SLOWA_B) + ", 0\n");//tak dla pewności wyczyszczenie
                if(sym.pelnyTyp.rozmiar_B() == 1){ wlk = "byte";}//próba rozwiązania problemu dla bajtów
            }

            if (sym.pelnyTyp.rodzaj_pamieci == PelnyTyp.RodzajPam.AUTOMATYCZNA) {
                if(czy_niederef(ctx)) sb.append("                lea " + akum + ", [" + sym.etykieta() + "]\n");
                else                         sb.append("                mov " + akum + ",  [" + sym.etykieta() + "]\n");
            } else {
                char zn_drugiego_rej = 'd';
                String drugirejestr = akumulator(DLUGOSC_SLOWA_B).replace('a', zn_drugiego_rej);//rejestr na adres - zawsze o długości słowa

                if(czy_niederef(ctx)) sb.append("                lea " + akum + ", [" + sym.etykieta()  + "]\n");
                else {
                    sb.append("                mov " + drugirejestr + ", " + sym.etykieta() + "\n");
                    sb.append("                mov " + akum + ",  [" + drugirejestr + "]\n");
                }

            }
        }

        sb.append(";koniec ładowania lwartosci\n");

        stosTypów.push(sym.pelnyTyp);
        return sb.toString();
    }
    /*
    @Override public String visitLwartosc(plplParser.LwartoscContext ctx)
    {
        Symbol sym = przestrzeń(ctx.ID().getText(),ctx);
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
*/


    @Override public String visitWyrazeniePrzypisanieZwykle(plplParser.WyrazeniePrzypisanieZwykleContext ctx)
    {
        char zn_drugiego_rej = 'd';
        String drugirejestr = akumulator(DLUGOSC_SLOWA_B).replace('a', zn_drugiego_rej);//rejestr na adres - zawsze o długości słowa

        StringBuilder sb = new StringBuilder();
        sb.append(";przypisanie"+ctx.start.getLine()+":"+ctx.start.getCharPositionInLine()+"\n");
        //oblicz adres, gdzie wpisać
        //niedereferencja.put(ctx.wyrazenie().get(0), true);//oznaczenie węzła, że przy generacji kodu, potrzebujemy adresu, a nie wartości
        Tablice.opcje.nidereferencja.ustaw(ctx.wyrazenie().get(0), true);
        String lewe = visit(ctx.wyrazenie().get(0));
        //for (var e:ctx.wyrazenie()) {
        //    System.err.println(e.getClass());
        //}
        PelnyTyp tlewe = stosTypów.pop();
        sb.append(lewe);
        //sb.append("                push "+akumulator(tlewe.rozmiar_B())+";lewa strona przypisania\n");
        sb.append("                push "+akumulator(DLUGOSC_SLOWA_B)+";lewa strona przypisania\n");
        //^ nielegalna jest instrukcja push al (dla znaków), więc lepiej już wykorzystac całe słow, zwłaszcza, że robi się potem pop edx...
        String prawe = visit(ctx.wyrazenie().get(1));
        PelnyTyp tprawe = stosTypów.peek();//zostaje
        sb.append(prawe);
        sb.append("                pop "+drugirejestr+ "\n");

        if(!tprawe.equals(tlewe))
        {var level = ((tprawe.equalsFunctionally(tlewe))?(SemanticOccurence.Level.DEBUG):(SemanticOccurence.Level.WARN));
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(level, ctx.stop,ctx.stop.getLine() ,ctx.stop.getCharPositionInLine(),
                    "Typy w przypisaniu się nie zgadzają!\n"+tlewe +"\n"+tprawe));
        }
        if(tlewe.modyfikowalonosc == PelnyTyp.Mod.STALA)
        {
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.ERROR, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                    "Lewa strona przypisania: `"+ctx.wyrazenie().get(0).getText()+"` zwraca typ niemodyfikowalny (stały):"+tlewe+". Pisanie po stałych jest niedozwolone."));
        }
        //@ASM
        sb.append("                mov ["+drugirejestr+"], "+akumulator(tlewe.rozmiar_B())+"\n");
        sb.append(";koniec przypisania"+ctx.stop.getLine()+":"+ctx.stop.getCharPositionInLine()+"\n");
        return sb.toString();
    }
    /*
    @Override public String visitWyrazeniePrzypisanie(plplParser.WyrazeniePrzypisanieContext ctx)
    {
        return visit(ctx.przypisanie());
    }
    @Override public String visitPrzypisanieZwykle(plplParser.PrzypisanieZwykleContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        String wyrazenie = visit(ctx.wyrazenie());
        PelnyTyp twyrazenie = stosTypów.pop();
        Symbol sym = przestrzeń(ctx.lwartosc().ID().getText(),ctx);

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
     */

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
