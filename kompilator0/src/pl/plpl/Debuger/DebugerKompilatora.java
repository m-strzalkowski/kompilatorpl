package pl.plpl.Debuger;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import pl.plpl.Debuger.wygenerowane.lekserDebugera;
import pl.plpl.Debuger.wygenerowane.parserDebugera;
import pl.plpl.Debuger.wygenerowane.parserDebugeraBaseVisitor;
import pl.plpl.bledy.SemanticOccurence;
import pl.plpl.bledy.SyntaxErrorListener;
import pl.plpl.generatory.GeneratorVisitor;
import pl.plpl.generatory.Tablice;
import pl.plpl.generatory.UstalaczStruktur;
import pl.plpl.generatory.ZbieraczNowychTypow;
import pl.plpl.generatory.klasyDanych.Procedura;
import pl.plpl.generatory.klasyDanych.Zakres;
import pl.plpl.parser.*;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

import static java.lang.System.exit;
import static pl.plpl.generatory.Tablice.debuger_kompilatora;

public class DebugerKompilatora extends parserDebugeraBaseVisitor  {
    BufferedTokenStream tokens;

    public enum Przebieg {ZBIERANIE_TYPOW(1), ANALIZA_SEMANTYCZNA(2), GENERACJA_KODU(3);
        private final Integer numerek;

        Przebieg(Integer numerek) {
            this.numerek = numerek;
        }

        public String toString(){
            return switch (numerek) {
                case 1 -> "T";
                case 2 -> "S";
                case 3 -> "G";
                default -> "?";
            };
        }}


    ;
    public Przebieg aktualny_przebieg = null;
    LinkedList<Pair<Token, ParseTree>> zn_typ = new LinkedList<>();//znacznik, sparsowany znacznik
    LinkedList<Pair<Token, ParseTree>> zn_sem = new LinkedList<>();
    LinkedList<Pair<Token, ParseTree>> zn_gen = new LinkedList<>();


    Scanner scanner=null;

    public DebugerKompilatora(CommonTokenStream tokens) {
        this.tokens = tokens;
        this.scanner = new Scanner(System.in);
        tokens.reset();
        //System.err.println( tokens.getTokens(0, tokens.getNumberOfOnChannelTokens(), plplLexer.ZNACZNIK_DEBUGGERA) );//czemu to tak działa, nie wiem...
        try{
            tokens.getTokens(0, tokens.getNumberOfOnChannelTokens(), plplLexer.ZNACZNIK_DEBUGGERA);
        }
        catch(IndexOutOfBoundsException e){return;}
        System.out.println(tokens.size());
        //System.err.println(tokens.get(0, 50));
       // System.err.println(tokens.LT(0));
        //System.err.println(tokens.LT(1));
        //System.err.println(tokens.LT(2));
        System.out.println("%%%%");
        //System.err.println( tokens.getTokens());
        //List<Token> kanał333 =tokens.getTokens();
        //System.err.println(tokens);
        var dodawacz = new DodawaczKomendZeZnacznikow();

        for (Token token : tokens.getTokens()) {
            //System.err.println("KANAŁ CHOLERNY:");

            if (token.getChannel() != 333) {
                continue;
            }

            ParseTree cmd = parsacjaZnacznika(token.getText());
            System.out.println("DRZEWO:\n"+cmd.getText()); // print tree as text <label id="code.tour.main.7"/>
            //ależtobrzydkie
            dodawacz.currenttree = cmd;
            dodawacz.currenttoken = token;
            dodawacz.bref = this;
            dodawacz.visit(cmd);
            //tokens.getHiddenTokensToRight(0, 333);

            //System.err.println(tokens.seek(0));
            System.out.println(token.getText());

        }
        tokens.reset();
        System.out.println("LISTY:");
        for(var v : zn_typ){System.out.println(v.b.getText());}
        //zn_typ.stream().map(ParseTree::getText).forEach(System.err::println);
        System.out.println("LISTY:");
        for(var v : zn_sem){System.out.println(v.b.getText());}
        //zn_sem.stream().map(ParseTree::getText).forEach(System.err::println);
        //System.err.println("LISTY:");
        //zn_gen.stream().map(ParseTree::getText).forEach(System.err::println);

    }

    /*
    @Override public String visitOznaczenia_przebiegow(parserDebugera.Oznaczenia_przebiegowContext ctx) {
        if(ctx.PRZEBIEG_ANALIZY_SEMANTYCZNEJ().size() > 0)
        {
            this.zn_sem.add(new Pair<Token, ParseTree>(currenttoken, currenttree) );
        }
        if(ctx.PRZEBIEG_GENERACYJNY().size() > 0)
        {
            this.zn_gen.add(new Pair<Token, ParseTree>(currenttoken, currenttree) );
        }
        if(ctx.PRZEBIEG_TYPOWANIA().size() > 0)
        {
            this.zn_typ.add(new Pair<Token, ParseTree>(currenttoken, currenttree) );
        }
        return "";
    }*/
    private Object proxy;
    private final Map<String, Method> methods = new HashMap<>();

    public Object zmień(Object ofiara, Przebieg przebieg)
    {
        proxy = ofiara;
        if(ofiara.getClass() == ZbieraczNowychTypow.class)
        {
            System.err.println("Zmieniono na zbieracz");
            this.aktualny_przebieg = Przebieg.ZBIERANIE_TYPOW;
            proxy =  Proxy.newProxyInstance(
                    ListenerInvocationHandlerForDebugger.class.getClassLoader(), new Class[] { plplListener.class, ParseTreeListener.class},
                    new ListenerInvocationHandlerForDebugger(ofiara, this));

        }
        if(ofiara.getClass() == UstalaczStruktur.class)
        {
            System.err.println("Zmieniono na ustalacz struktur");
            this.aktualny_przebieg = Przebieg.ANALIZA_SEMANTYCZNA;
            proxy =  Proxy.newProxyInstance(
                    ListenerInvocationHandlerForDebugger.class.getClassLoader(), new Class[] { plplListener.class},
                    new ListenerInvocationHandlerForDebugger(ofiara, this));

        }
        if(ofiara.getClass() == GeneratorVisitor.class)
        {
            System.err.println("Zmieniono na generator");
            this.aktualny_przebieg = Przebieg.GENERACJA_KODU;
            proxy =  Proxy.newProxyInstance(
                    VisitorInvocationHandlerForDebugger.class.getClassLoader(), new Class[] { plplVisitor.class},
                    new VisitorInvocationHandlerForDebugger(ofiara, this));

        }

        //Class c = ofiara.getClass();
        //this.aktualny_przebieg = przebieg;
        return proxy;
    }



        public ParseTree parsacjaZnacznika(String tekstZnacznika)//tak, powinien być parsing, ale zeźlony jestem, to będzie parsacja.
        {
            //1.Analiza leksykalna
            lekserDebugera lexer = new lekserDebugera(CharStreams.fromString( tekstZnacznika));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            //2.analiza syntaktyczna
            parserDebugera parser = new parserDebugera(tokens);
            SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener();
            parser.addErrorListener(syntaxErrorListener);
            ParseTree tree = parser.znacznik(); // parse; start at prog <label id="code.tour.main.6"/>
            if (syntaxErrorListener.getNumberOfErrors() > 0) {
                System.err.println("DEBUGGER: WYSTĄPIŁY BŁĘDY SKŁADNIOWE, dokładnie " + syntaxErrorListener.getNumberOfErrors() + ". Dalsza analiza nie nastąpi.\n");
                //exit(1);
            }
            //System.err.println("DRZEWO:\n"+tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>
            return tree;
        }


        //właściwy stan maszyny debuggera
        int indeks_znaku=0;
        int linia=0;
        int znak_w_linii=0;
        //oczywiście aktualny przebieg
        Procedura aktualna_procedura=null;
        Zakres aktualny_zakres=null;
        boolean interaktywność=true;
        LinkedList< ParseTree> sesja_inter = new LinkedList<>();//sesja interaktywna
        public boolean zmuś=false;//zmuś do rozpoczęcia sesji interaktywnej

        public void krok(Object ofiara, boolean na_poczatku, Method method, Object[] args)//ofiara debugowania oczywiście
        {
            //przestawianie aktualnego stanu debugera
            if(aktualny_przebieg == Przebieg.ANALIZA_SEMANTYCZNA || aktualny_przebieg == Przebieg.ZBIERANIE_TYPOW )
            {
                try{

                    ParserRuleContext ctx = (ParserRuleContext) args[0];
                    indeks_znaku = ((na_poczatku)?(ctx.getStart().getStartIndex()):(ctx.getStop().getStopIndex()));
                    linia = ((na_poczatku)?(ctx.getStart().getLine()):(ctx.getStop().getLine()));
                    znak_w_linii = ((na_poczatku)?(ctx.getStart().getCharPositionInLine()):(ctx.getStop().getCharPositionInLine()));
                    if(aktualny_przebieg == Przebieg.ANALIZA_SEMANTYCZNA)
                    {
                        aktualny_zakres = ((UstalaczStruktur) ofiara).getAktualnyZakres();
                        aktualna_procedura = ((UstalaczStruktur) ofiara).getAktualnyZakres().procedura;
                    }

                    //System.err.println(method.getName()+ " kursor:" +((na_poczatku)?(ctx.getStart().getStartIndex()):(ctx.getStop().getStopIndex())));
                }
                catch (Throwable t)
                {
                    //to faktycznie nie działa w połowie przypadków, ale co tam. (terminal nodes, czy cośtam nie mają ParserRuleContext)
                    //t.printStackTrace();
                }
            }
            System.out.print(method.getName()+ "::");
            System.out.println(karetka());
            //czy jest się poszło za znacznik?
            LinkedList<Pair<Token, ParseTree>> znaczniki = switch(aktualny_przebieg){case ZBIERANIE_TYPOW -> zn_typ; case ANALIZA_SEMANTYCZNA -> zn_sem; case GENERACJA_KODU -> zn_gen;};
            Token znacznik_w_programie=null;
            if(!zmuś)
            {
                if(znaczniki.size() < 1){return;}//i tak nie ma nic do roboty
                znacznik_w_programie = znaczniki.getFirst().a;
                System.out.println(""+ indeks_znaku +" > " + znacznik_w_programie.getStartIndex() + " lista" + znaczniki.size());
            }
            else {znaczniki = zn_sem;}
            if(zmuś || indeks_znaku >= znacznik_w_programie.getStartIndex())
            {
                if(!zmuś)
                {
                    System.out.print(karetka()+":");
                    //wykonaj podaną w znaczniku komendę
                    ParseTree komenda_ze_znacznika  = znaczniki.getFirst().b;
                    interaktywność = true;
                    this.visit(komenda_ze_znacznika);
                    if(znaczniki.size()<1){return;}
                    System.out.println(znaczniki.getFirst().b.getText());
                    //usuń z komend do wykonania
                    znaczniki.removeFirst();
                }
                else{zmuś=false; interaktywność=true;}


                //wykonuj komendy interaktywne
                while(interaktywność){
                    System.out.print(karetka()+">");
                    String komenda = this.scanner.nextLine();
                    if(komenda.length() < 1){continue;}
                    //System.out.println(komenda);
                    ParseTree cmd = parsacjaZnacznika(":"+komenda);
                    //wykonaj komendę
                    try {
                        this.visit(cmd);
                    }
                    catch(Throwable t){t.printStackTrace();}//tu akurat uzasadnione łapanie wszystkiego - debugger nie powinien nic modyfikować
                }




            }


        }
    public String karetka()
    {
        return ""+aktualny_przebieg+":"+linia+":"+znak_w_linii+", procedura:"+((aktualna_procedura == null)?("?!"):(aktualna_procedura.nr))+", zakres:"+((aktualny_zakres == null)?("?!"):(aktualny_zakres.nr));
    }
    @Override public String visitNastepny_znacznik(parserDebugera.Nastepny_znacznikContext ctx) {
            interaktywność = false;
            return "";
        }
    @Override public String visitKomenda_ubicia_kompilatora(parserDebugera.Komenda_ubicia_kompilatoraContext ctx)
    {
        System.out.println("Debuggerowi wydano komendę zakończenia kompilacji");
        System.exit(2);
        return "";
    }
    @Override public String  visitKomenda_ubicia_debugera(parserDebugera.Komenda_ubicia_debugeraContext ctx)
    {
        this.zn_typ.clear();
        this.zn_sem.clear();
        this.zn_gen.clear();
        interaktywność=false;
        return "";
    }
    @Override public String visitOgolne_listowanie(parserDebugera.Ogolne_listowanieContext ctx) { System.out.println(Tablice.wypisz());  return ""; }
    @Override public String visitListing_procedur(parserDebugera.Listing_procedurContext ctx)
    {
        if(ctx.MINUS_L()==null){System.out.println(Tablice.krotkilistingProcedur()); return "";}
        System.out.println(Tablice.listingProcedur());
        return "";
    }
    @Override public String visitListing_zakresow(parserDebugera.Listing_zakresowContext ctx)
    {
        if(ctx.MINUS_L()==null){System.out.println(Tablice.krotkilistingZakresow()); return "";}
        System.out.println(Tablice.listingProcedur());
        return "";
    }
    @Override public String visitCd_do_proc(parserDebugera.Cd_do_procContext ctx)
    {
        int nr_proc = Integer.parseInt( ctx.NUM().getText());
        for(var p :Tablice.procedury)
        {
            if(p.nr==nr_proc){aktualna_procedura = p; break;}
        }
        if(nr_proc == 0){aktualna_procedura = Tablice.kod_globalny;}
        aktualny_zakres = aktualna_procedura.najogolniejszy_zakres;
        return "";
    }
    @Override public String visitCd_do_zakresu(parserDebugera.Cd_do_zakresuContext ctx)
    {
        int nr_zakr = Integer.parseInt( ctx.NUM().getText());
        for(var z :Tablice.zakresy)
        {
            if(z.nr==nr_zakr){aktualny_zakres = z; break;}
        }
        if(nr_zakr == 0){aktualny_zakres = Tablice.zakres_globalny;}
        if(aktualny_zakres.procedura != aktualna_procedura){aktualna_procedura = aktualny_zakres.procedura;}
        return "";
    }

    @Override public String visitPisz_nazwy_typow(parserDebugera.Pisz_nazwy_typowContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTABLICA TYPÓW:\n");
        for (var t:Tablice.typy)
        {
            sb.append(t.toString()).append("\n");
        }
        System.out.println(sb.toString());
            return "";
    }
    @Override public String visitPisz_ramke_procedury(parserDebugera.Pisz_ramke_proceduryContext ctx)
    {
        System.out.println( aktualna_procedura.infoORamce());
        return "";
    }
    @Override public String visitPisz_symbole(parserDebugera.Pisz_symboleContext ctx)
    {
        if(ctx.TU()!= null)
        {
            System.out.println(aktualny_zakres.krotkoSymbole());
        }
        else{System.out.println("PRZESTRZEŃ NAZW:\n"+aktualny_zakres.krotkoPrzestrzen());}
        return "";
    }
    @Override public String visitPisz_stan_maszyny_deklaracyjnej(parserDebugera.Pisz_stan_maszyny_deklaracyjnejContext ctx)
    {
        if(this.aktualny_przebieg == Przebieg.ANALIZA_SEMANTYCZNA)
        {
            String s = ((UstalaczStruktur)(((InvocationHandlerForDebugger) Proxy.getInvocationHandler(this.proxy)).getTarget())).piszStanMaszynyDeklaracyjnej();
            System.out.println(s);
        }
        else {
            System.out.println("STAN MASZYNY DEKLARACYJNEJ DOSTĘPNY TYLKO PODCZAS ANALIZY SEMANTYCZNEJ\n");
        }
        return "";
    }
    @Override public String visitPisz_symbol(parserDebugera.Pisz_symbolContext ctx)
    {
        if(ctx.ID().getText() != null && ctx.ID().getText().length() > 0)
        {
            System.out.println( Tablice.wypiszSymbolWPrzestrzeni(ctx.ID().getText(), aktualny_zakres, ctx.MINUS_L() != null));
        }
        return "";
    }


}
