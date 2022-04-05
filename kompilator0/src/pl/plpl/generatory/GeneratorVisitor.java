package pl.plpl.generatory;

import org.antlr.v4.runtime.RuleContext;
import pl.plpl.bledy.SemanticOccurence;
import pl.plpl.generatory.klasyDanych.Procedura;
import pl.plpl.generatory.klasyDanych.PunktWejsciowy;
import pl.plpl.generatory.klasyDanych.Symbol;
import pl.plpl.generatory.klasyDanych.Zakres;
import pl.plpl.parser.plplBaseVisitor;
import pl.plpl.parser.plplParser;

import java.util.Objects;

public class GeneratorVisitor extends plplBaseVisitor<String> {
    private Zakres aktualnyZakres;
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
        Symbol s = aktualnyZakres.poNazwie(ctx.ID().getText());
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
            sb.append("              ;sub esp, "+aktualnyZakres.procedura.dlugosc_B_zmiennych_automatycznych+"\n");
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
        Symbol sym = aktualnyZakres.poTokenie(ctx.stala_tablicowa().NAPIS_DOSL().getSymbol());
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
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInstrukcja_prosta(plplParser.Instrukcja_prostaContext ctx) { return ""; }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
}
