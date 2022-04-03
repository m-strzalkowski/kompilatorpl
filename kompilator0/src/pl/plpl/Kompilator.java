package pl.plpl;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import pl.plpl.bledy.SyntaxErrorListener;
import pl.plpl.generatory.GeneratorVisitor;
import pl.plpl.generatory.Tablice;
import pl.plpl.generatory.UstalaczStruktur;
import pl.plpl.generatory.ZbieraczNowychTypow;
import pl.plpl.parser.plplLexer;
import pl.plpl.parser.plplParser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

import static java.lang.System.exit;


public class Kompilator {

    public static void main(String[] args) throws Exception {
        Tablice.inicjalizuj();
        String inputFile = "C:\\Users\\mastr\\Documents\\MS\\STUDIA\\kompilatory\\kompilatorpl\\kompilator0\\przyklady\\a.plpl";
        //String inputFile = "C:\\Users\\mastr\\Documents\\MS\\STUDIA\\kompilatory\\kompilatorpl\\kompilator0\\przyklady\\deklaracje_typow.plpl";
        if ( args.length>0 ) inputFile = args[0];
        if(inputFile == null) {
            System.err.println("Nie podano pliku wejścowego");
            exit(1);
        }
        //otwarcie pliku wejściowego
        CharStream input = CharStreams.fromPath(Paths.get(inputFile), StandardCharsets.UTF_8);
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
        //4.Czytanie deklaracji i tworzenie struktur pamięci (typy i ramki stosu procedur)
        walker.walk(new UstalaczStruktur(parser), tree);
        //5.Generacja kodu
        GeneratorVisitor generator = new GeneratorVisitor();
        generator.visit(tree);



    }
}
