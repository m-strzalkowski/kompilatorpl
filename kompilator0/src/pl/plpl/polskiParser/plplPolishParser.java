package pl.plpl.polskiParser;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import pl.plpl.parser.plplParser;

/**
 * Antlr4 nie przewiduje lokalizacji komunikatów o błędach w parserze, a w tym wypadku, mając cały język oparty na polskim substracie, powinniśmy ją zapewnić, niezależnie od tego, jak szpetnie musi to wyglądać.
 * Klasy w tym pakiecie nadpisują odpowiednie metody klas głównie w antlr.v4.runtime
 */
public class plplPolishParser extends plplParser {
    public plplPolishParser(TokenStream input) {
        super(input);
        setErrorHandler(new DefaultPolishErrorStrategy());
    }
    private static String[] makeLiteralNames() {
        return new String[] {
                null, "'procedura'", "'->'", "'{'", "'}'", "'typ'", "','", "'='", "'je\u015Bli'",
                "'('", "')'", "'inaczej'", "'dop\u00F3ki'", "'zwr\u00F3\u0107'", "'zacznij'",
                "'sko\u0144cz'", "'wypisz'", "'@'", "'!'", "'-'", "'+'", "'^'", "'*'",
                "'/'", "'%'", "'&&'", "'||'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='",
                "'['", "']'", "'.'", "'^='", "'*='", "'/='", "'%='", "'+='", "'-='",
                null, null, null, null, null, null, "'rzeczyw'", "'znak'", "'ref'", "'przerwij'",
                null, null, null, null, null, null, null, "';'"
        };
    }
    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    public final static String[] makeSymbolicNames()
    {
        /*
        return new String[] {
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, "ZNACZNIK_DEBUGGERA", "NIC", "STATYCZNA",
                "AUTOMATYCZNA", "STAŁA", "T CAŁKOWITA", "T RZECZYWISTA", "T ZNAK", "T REFERENCJA", "PRZERWIJ",
                "KONTYNUUJ", "ZMIENNA", "CAŁKOWITA", "ZNAK_DOSŁOWNY", "NAPIS_DOSŁOWNY", "LINIA_ASEMBLERA",
                "IDENTYFIKATOR", "EOS", "KOMENTARZ", "KOMENTARZ", "WS"
        };
        */
        return new String[] {
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, "ZNACZNIK_DEBUGGERA", "nic", "STATYCZNA",
                "AUTOMATYCZNA", "STAŁA", "T CAŁKOWITA", "T RZECZYWISTA", "T ZNAK", "T REFERENCJA", "PRZERWIJ",
                "KONTYNUUJ", "ZMIENNA", "CAŁKOWITA", "ZNAK_DOSŁOWNY", "NAPIS_DOSŁOWNY", "LINIA_ASEMBLERA",
                "IDENTYFIKATOR", "ŚREDNIK", "KOMENTARZ", "KOMENTARZ", "BIAŁY_ZNAK"
        };
    }
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    @Override
    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }
}
