package pl.plpl;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.apache.commons.cli.*;
import pl.plpl.bledy.SemanticOccurence;
import pl.plpl.bledy.SyntaxErrorListener;
import pl.plpl.generatory.*;
import pl.plpl.parser.plplLexer;
import pl.plpl.parser.plplParser;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Objects;

import static java.lang.System.exit;
import static pl.plpl.generatory.Tablice.inputFilePath;
import static pl.plpl.generatory.Tablice.outputFilePath;


public class Kompilator {

    public static void main(String[] args)  {
        //Opcje z terminala (apache.commons.cli)
        Options options = new Options();

        Option optinput = new Option("i", "we", true, "Plik wejściowy");
        optinput.setRequired(true);
        options.addOption(optinput);

        Option optoutput = new Option("o", "wy", true, "Plik wynikowy");
        optoutput.setRequired(false);
        options.addOption(optoutput);

        Option stopstate = new Option("s", "stop", true, "Jak poważny błąd zatrzyma kompilację: ostrzezenie/blad/fatalny, fatalny błąd domyślnie");
        stopstate.setRequired(false);
        options.addOption(stopstate);

        String header = "Kompilator języka PL/PL\n\n";
        String footer = "\nRepozytorium projektu: https://gitlab.com/Strzalkowski/kompilatorpl";
        CommandLineParser optparser = new DefaultParser();
        HelpFormatter optformatter = new HelpFormatter();
        CommandLine cmd = null;//not a good practice, it serves it purpose

        try {
            cmd = optparser.parse(options, args);
        } catch (ParseException e) {
            //trzeba by przetłumaczyć komunikaty o błędach (załączając zmienione źródła...)
            System.out.println(e.getMessage());

            optformatter.setSyntaxPrefix("użycie:");
            optformatter.printHelp("java pl.plpl.Kompilator", header, options, footer, true);

            System.exit(1);
        }
        //pliki we/wy
        inputFilePath = cmd.getOptionValue("we");
        outputFilePath = cmd.getOptionValue("wy");
        System.out.println("Pierwszy (i zapewne jedyny) Kompilator języka PL/PL.");
        System.out.println("Plik wejściowy:"+inputFilePath);
        System.out.println("Plik wynikowy:"+outputFilePath);

        //Inicjalizacja globalnych tablic kompilatora
        Tablice.inicjalizuj();
        //tolerancja błędów ostrzezenie/blad/fatalny
        String stopst = cmd.getOptionValue(stopstate);
        if(stopst != null)
        {
            Tablice.podsystem_bledow.setStop_at_severity(switch (cmd.getOptionValue(stopstate)) {
                case "ostrzezenie" -> SemanticOccurence.Level.WARN;
                case "blad" -> SemanticOccurence.Level.ERROR;
                default -> SemanticOccurence.Level.FATAL;
            });
        }
        //String inputFile = "C:\\Users\\mastr\\Documents\\MS\\STUDIA\\kompilatory\\kompilatorpl\\kompilator0\\przyklady\\a.plpl";
        //String inputFile = "C:\\Users\\mastr\\Documents\\MS\\STUDIA\\kompilatory\\kompilatorpl\\kompilator0\\przyklady\\deklaracje_typow.plpl";

        //otwarcie pliku wejściowego
        CharStream input = null;
        try {
            input = CharStreams.fromPath(Paths.get(inputFilePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("Nie udało się otworzyć pliku wejściowego. Kończenie");
            System.exit(1);
        }
        //1.analiza leksykalna
        plplLexer lexer = new plplLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //2.analiza syntaktyczna
        plplParser parser = new plplParser(tokens);
        SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener();
        parser.addErrorListener(syntaxErrorListener);
        ParseTree tree = parser.program(); // parse; start at prog <label id="code.tour.main.6"/>
        if(syntaxErrorListener.getNumberOfErrors() > 0)
        {
            System.err.println("WYSTĄPIŁY BŁĘDY SKŁADNIOWE, dokładnie "+syntaxErrorListener.getNumberOfErrors()+". Dalsza analiza i generacja nie nastąpi.\n");
            exit(1);
        }
        System.out.println(tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>
        //3.Zebranie nowych nazw typów
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( new ZbieraczNowychTypow(parser), tree );
        System.out.println(Tablice.wypisz());
        //4.Czytanie deklaracji i tworzenie struktur pamięci (typy i ramki stosu procedur)
        walker.walk(new UstalaczStruktur(parser), tree);
        System.out.println(Tablice.wypisz());
        //5.Generacja kodu
        GeneratorVisitor generator = new GeneratorVisitor();
        generator.visit(tree);
        //6.Składanie kodu?
        new SkladaczKoduAsemblera().uruchom();
    }
}
