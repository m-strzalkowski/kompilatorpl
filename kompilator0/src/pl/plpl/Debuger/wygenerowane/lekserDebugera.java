// Generated from C:/Users/mastr/Documents/MS/STUDIA/kompilatory/kompilatorpl/kompilator0/src/pl/plpl/Debuger\lekserDebugera.g4 by ANTLR 4.9.2
package pl.plpl.Debuger.wygenerowane;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lekserDebugera extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OTW=1, ZMK=2, PRZEBIEG_TYPOWANIA=3, PRZEBIEG_ANALIZY_SEMANTYCZNEJ=4, PRZEBIEG_GENERACYJNY=5, 
		SEPARATOR_ZNACZNIKOWY=6, WSZ=7, ZMKK=8, PROC=9, ZAKR=10, PUNKT=11, MINUS_L=12, 
		GWIAZDKA=13, SREDNIK=14, PRZECINEK=15, ZGIN=16, DOKONCZ=17, STAN_MASZYNY_DEKLARACYJNEJ=18, 
		RAMKA=19, STATYCZNE=20, SEKCJA=21, TYPY=22, TOKENY=23, DRZEWO=24, SYMBOLE=25, 
		SYMBOL=26, TU=27, TUIWYZEJ=28, CD=29, LS=30, TEXT=31, BSS=32, DATA=33, 
		RODATA=34, ID=35, NUM=36, WS=37, NASTEPNA=38, SL_COMMENT=39;
	public static final int
		KOMENDY=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "KOMENDY"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OTW", "ZMK", "PRZEBIEG_TYPOWANIA", "PRZEBIEG_ANALIZY_SEMANTYCZNEJ", 
			"PRZEBIEG_GENERACYJNY", "SEPARATOR_ZNACZNIKOWY", "WSZ", "ZMKK", "PROC", 
			"ZAKR", "PUNKT", "MINUS_L", "GWIAZDKA", "SREDNIK", "PRZECINEK", "ZGIN", 
			"DOKONCZ", "STAN_MASZYNY_DEKLARACYJNEJ", "RAMKA", "STATYCZNE", "SEKCJA", 
			"TYPY", "TOKENY", "DRZEWO", "SYMBOLE", "SYMBOL", "TU", "TUIWYZEJ", "CD", 
			"LS", "TEXT", "BSS", "DATA", "RODATA", "ID", "NUM", "WS", "NASTEPNA", 
			"SL_COMMENT", "OGONKI"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<<'", null, null, null, null, "':'", null, null, null, null, 
			null, "'-l'", "'*'", "';'", "','", null, null, null, "'ramka'", null, 
			"'sekcja'", "'typy'", "'tokeny'", null, null, null, "'tu'", "'tuiwy\u017Cej'", 
			"'cd'", "'ls'", null, null, null, null, null, null, null, "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OTW", "ZMK", "PRZEBIEG_TYPOWANIA", "PRZEBIEG_ANALIZY_SEMANTYCZNEJ", 
			"PRZEBIEG_GENERACYJNY", "SEPARATOR_ZNACZNIKOWY", "WSZ", "ZMKK", "PROC", 
			"ZAKR", "PUNKT", "MINUS_L", "GWIAZDKA", "SREDNIK", "PRZECINEK", "ZGIN", 
			"DOKONCZ", "STAN_MASZYNY_DEKLARACYJNEJ", "RAMKA", "STATYCZNE", "SEKCJA", 
			"TYPY", "TOKENY", "DRZEWO", "SYMBOLE", "SYMBOL", "TU", "TUIWYZEJ", "CD", 
			"LS", "TEXT", "BSS", "DATA", "RODATA", "ID", "NUM", "WS", "NASTEPNA", 
			"SL_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public lekserDebugera(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lekserDebugera.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u01d4\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4_\n\4\3\5\3\5\3\5\3\5\5\5e\n\5\3\6\3"+
		"\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\b\6\br\n\b\r\b\16\bs\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u008c\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0096\n\n\5\n"+
		"\u0098\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00a6\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00af\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00b6\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bd\n\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00cd"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00da"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e5\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0110"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0122\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0154"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u016c\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0177\n\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \5 \u018c\n \3 \3 \3 \3 \3 \3!\5!\u0194\n!\3!\3!\3!\3!\3\"\5\"\u019b"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3#\5#\u01a3\n#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$"+
		"\5$\u01af\n$\3$\3$\7$\u01b3\n$\f$\16$\u01b6\13$\3%\6%\u01b9\n%\r%\16%"+
		"\u01ba\3&\6&\u01be\n&\r&\16&\u01bf\3&\3&\3\'\3\'\3(\3(\3(\3(\7(\u01ca"+
		"\n(\f(\16(\u01cd\13(\3(\3(\3(\3(\3)\3)\3\u01cb\2*\4\3\6\4\b\5\n\6\f\7"+
		"\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25"+
		"*\26,\27.\30\60\31\62\32\64\33\66\348\35:\36<\37> @!B\"D#F$H%J&L\'N(P"+
		")R\2\4\2\3\b\5\2\13\f\17\17\"\"\4\2\60\60gg\4\2C\\c|\6\2\62;C\\aac|\3"+
		"\2\62;\t\2\u00d5\u00d5\u00f5\u00f5\u0106\u0109\u011a\u011b\u0143\u0146"+
		"\u015c\u015d\u017b\u017e\2\u01f4\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2"+
		"\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2"+
		"\2\2\3\26\3\2\2\2\3\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2"+
		"\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3"+
		",\3\2\2\2\3.\3\2\2\2\3\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2"+
		"\2\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2\3B\3\2\2\2\3"+
		"D\3\2\2\2\3F\3\2\2\2\3H\3\2\2\2\3J\3\2\2\2\3L\3\2\2\2\3N\3\2\2\2\3P\3"+
		"\2\2\2\4T\3\2\2\2\6W\3\2\2\2\b^\3\2\2\2\nd\3\2\2\2\fj\3\2\2\2\16l\3\2"+
		"\2\2\20q\3\2\2\2\22w\3\2\2\2\24\u0097\3\2\2\2\26\u00ae\3\2\2\2\30\u00bc"+
		"\3\2\2\2\32\u00be\3\2\2\2\34\u00c1\3\2\2\2\36\u00c3\3\2\2\2 \u00c5\3\2"+
		"\2\2\"\u00cc\3\2\2\2$\u00d9\3\2\2\2&\u010f\3\2\2\2(\u0111\3\2\2\2*\u0117"+
		"\3\2\2\2,\u0123\3\2\2\2.\u012a\3\2\2\2\60\u012f\3\2\2\2\62\u0136\3\2\2"+
		"\2\64\u016b\3\2\2\2\66\u0176\3\2\2\28\u0178\3\2\2\2:\u017b\3\2\2\2<\u0184"+
		"\3\2\2\2>\u0187\3\2\2\2@\u018b\3\2\2\2B\u0193\3\2\2\2D\u019a\3\2\2\2F"+
		"\u01a2\3\2\2\2H\u01ae\3\2\2\2J\u01b8\3\2\2\2L\u01bd\3\2\2\2N\u01c3\3\2"+
		"\2\2P\u01c5\3\2\2\2R\u01d2\3\2\2\2TU\7>\2\2UV\7>\2\2V\5\3\2\2\2WX\7@\2"+
		"\2XY\7@\2\2Y\7\3\2\2\2Z[\7V\2\2[\\\7[\2\2\\_\7R\2\2]_\7V\2\2^Z\3\2\2\2"+
		"^]\3\2\2\2_\t\3\2\2\2`a\7U\2\2ab\7G\2\2be\7O\2\2ce\7U\2\2d`\3\2\2\2dc"+
		"\3\2\2\2e\13\3\2\2\2fg\7I\2\2gh\7G\2\2hk\7P\2\2ik\7I\2\2jf\3\2\2\2ji\3"+
		"\2\2\2k\r\3\2\2\2lm\7<\2\2mn\3\2\2\2no\b\7\2\2o\17\3\2\2\2pr\t\2\2\2q"+
		"p\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\b\b\3\2v\21\3\2\2"+
		"\2wx\7@\2\2xy\7@\2\2yz\3\2\2\2z{\b\t\4\2{\23\3\2\2\2|}\7r\2\2}~\7t\2\2"+
		"~\177\7q\2\2\177\u0080\7e\2\2\u0080\u0081\7g\2\2\u0081\u0082\7f\2\2\u0082"+
		"\u0083\7w\2\2\u0083\u0084\7t\2\2\u0084\u0098\7c\2\2\u0085\u0086\7r\2\2"+
		"\u0086\u0087\7t\2\2\u0087\u0088\7q\2\2\u0088\u0089\7e\2\2\u0089\u008b"+
		"\3\2\2\2\u008a\u008c\7\60\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2"+
		"\u008c\u0098\3\2\2\2\u008d\u008e\7r\2\2\u008e\u008f\7t\2\2\u008f\u0090"+
		"\7q\2\2\u0090\u0091\7e\2\2\u0091\u0092\7g\2\2\u0092\u0093\7f\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0096\7\60\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3"+
		"\2\2\2\u0096\u0098\3\2\2\2\u0097|\3\2\2\2\u0097\u0085\3\2\2\2\u0097\u008d"+
		"\3\2\2\2\u0098\25\3\2\2\2\u0099\u009a\7|\2\2\u009a\u009b\7c\2\2\u009b"+
		"\u009c\7m\2\2\u009c\u009d\7t\2\2\u009d\u009e\7g\2\2\u009e\u00af\7u\2\2"+
		"\u009f\u00a0\7|\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7m\2\2\u00a2\u00a3"+
		"\7t\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a6\7\60\2\2\u00a5\u00a4\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00af\3\2\2\2\u00a7\u00a8\7|\2\2\u00a8\u00a9\7c\2"+
		"\2\u00a9\u00aa\7m\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad"+
		"\7u\2\2\u00ad\u00af\7{\2\2\u00ae\u0099\3\2\2\2\u00ae\u009f\3\2\2\2\u00ae"+
		"\u00a7\3\2\2\2\u00af\27\3\2\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7m\2\2"+
		"\u00b2\u00b3\7v\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b6\7\60\2\2\u00b5\u00b4"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00bd\3\2\2\2\u00b7\u00b8\7r\2\2\u00b8"+
		"\u00b9\7w\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7m\2\2\u00bb\u00bd\7v\2\2"+
		"\u00bc\u00b0\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bd\31\3\2\2\2\u00be\u00bf"+
		"\7/\2\2\u00bf\u00c0\7n\2\2\u00c0\33\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2\35"+
		"\3\2\2\2\u00c3\u00c4\7=\2\2\u00c4\37\3\2\2\2\u00c5\u00c6\7.\2\2\u00c6"+
		"!\3\2\2\2\u00c7\u00c8\7|\2\2\u00c8\u00c9\7i\2\2\u00c9\u00ca\7k\2\2\u00ca"+
		"\u00cd\7\u0146\2\2\u00cb\u00cd\7b\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd#\3\2\2\2\u00ce\u00cf\7f\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1"+
		"\7m\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7\u0146\2\2\u00d3\u00d4\7e\2\2"+
		"\u00d4\u00da\7|\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8"+
		"\7m\2\2\u00d8\u00da\7\60\2\2\u00d9\u00ce\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da"+
		"%\3\2\2\2\u00db\u00dc\7u\2\2\u00dc\u0110\7f\2\2\u00dd\u00de\7u\2\2\u00de"+
		"\u00df\7f\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7m\2\2\u00e1\u00e2\7n\2\2"+
		"\u00e2\u00e4\3\2\2\2\u00e3\u00e5\7\60\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u0110\3\2\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7v\2\2\u00e8"+
		"\u00e9\7c\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7a\2\2\u00eb\u00ec\7f\2\2"+
		"\u00ec\u00ed\7g\2\2\u00ed\u00ee\7m\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0"+
		"\7c\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7e\2\2\u00f3"+
		"\u00f4\7l\2\2\u00f4\u0110\7k\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7v\2\2"+
		"\u00f7\u00f8\7c\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7a\2\2\u00fa\u00fb"+
		"\7o\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7|\2\2\u00fe"+
		"\u00ff\7{\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7{\2\2\u0101\u0102\7a\2\2"+
		"\u0102\u0103\7f\2\2\u0103\u0104\7g\2\2\u0104\u0105\7m\2\2\u0105\u0106"+
		"\7n\2\2\u0106\u0107\7c\2\2\u0107\u0108\7t\2\2\u0108\u0109\7c\2\2\u0109"+
		"\u010a\7e\2\2\u010a\u010b\7{\2\2\u010b\u010c\7l\2\2\u010c\u010d\7p\2\2"+
		"\u010d\u010e\7g\2\2\u010e\u0110\7l\2\2\u010f\u00db\3\2\2\2\u010f\u00dd"+
		"\3\2\2\2\u010f\u00e6\3\2\2\2\u010f\u00f5\3\2\2\2\u0110\'\3\2\2\2\u0111"+
		"\u0112\7t\2\2\u0112\u0113\7c\2\2\u0113\u0114\7o\2\2\u0114\u0115\7m\2\2"+
		"\u0115\u0116\7c\2\2\u0116)\3\2\2\2\u0117\u0118\7u\2\2\u0118\u0119\7v\2"+
		"\2\u0119\u011a\7c\2\2\u011a\u011b\7v\2\2\u011b\u011c\7{\2\2\u011c\u011d"+
		"\7e\2\2\u011d\u011e\7|\2\2\u011e\u011f\7p\2\2\u011f\u0121\3\2\2\2\u0120"+
		"\u0122\t\3\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122+\3\2\2\2"+
		"\u0123\u0124\7u\2\2\u0124\u0125\7g\2\2\u0125\u0126\7m\2\2\u0126\u0127"+
		"\7e\2\2\u0127\u0128\7l\2\2\u0128\u0129\7c\2\2\u0129-\3\2\2\2\u012a\u012b"+
		"\7v\2\2\u012b\u012c\7{\2\2\u012c\u012d\7r\2\2\u012d\u012e\7{\2\2\u012e"+
		"/\3\2\2\2\u012f\u0130\7v\2\2\u0130\u0131\7q\2\2\u0131\u0132\7m\2\2\u0132"+
		"\u0133\7g\2\2\u0133\u0134\7p\2\2\u0134\u0135\7{\2\2\u0135\61\3\2\2\2\u0136"+
		"\u0137\7f\2\2\u0137\u0138\7t\2\2\u0138\u0139\7|\2\2\u0139\u013a\7g\2\2"+
		"\u013a\u013b\7y\2\2\u013b\u013c\7q\2\2\u013c\u0153\3\2\2\2\u013d\u013e"+
		"\7u\2\2\u013e\u013f\7m\2\2\u013f\u0140\7\u0144\2\2\u0140\u0141\7c\2\2"+
		"\u0141\u0142\7f\2\2\u0142\u0143\7p\2\2\u0143\u0144\7k\2\2\u0144\u0145"+
		"\7q\2\2\u0145\u0146\7y\2\2\u0146\u0154\7g\2\2\u0147\u0148\7u\2\2\u0148"+
		"\u0149\7{\2\2\u0149\u014a\7p\2\2\u014a\u014b\7v\2\2\u014b\u014c\7c\2\2"+
		"\u014c\u014d\7m\2\2\u014d\u014e\7v\2\2\u014e\u014f\7{\2\2\u014f\u0150"+
		"\7e\2\2\u0150\u0151\7|\2\2\u0151\u0152\7p\2\2\u0152\u0154\7g\2\2\u0153"+
		"\u013d\3\2\2\2\u0153\u0147\3\2\2\2\u0153\u0154\3\2\2\2\u0154\63\3\2\2"+
		"\2\u0155\u0156\7u\2\2\u0156\u0157\7{\2\2\u0157\u0158\7o\2\2\u0158\u0159"+
		"\7d\2\2\u0159\u015a\7q\2\2\u015a\u015b\7n\2\2\u015b\u016c\7g\2\2\u015c"+
		"\u015d\7r\2\2\u015d\u015e\7t\2\2\u015e\u015f\7|\2\2\u015f\u0160\7g\2\2"+
		"\u0160\u0161\7u\2\2\u0161\u0162\7v\2\2\u0162\u0163\7t\2\2\u0163\u0164"+
		"\7|\2\2\u0164\u0165\7g\2\2\u0165\u0166\7\u0146\2\2\u0166\u0167\7\"\2\2"+
		"\u0167\u0168\7p\2\2\u0168\u0169\7c\2\2\u0169\u016a\7|\2\2\u016a\u016c"+
		"\7y\2\2\u016b\u0155\3\2\2\2\u016b\u015c\3\2\2\2\u016c\65\3\2\2\2\u016d"+
		"\u016e\7u\2\2\u016e\u016f\7{\2\2\u016f\u0170\7o\2\2\u0170\u0171\7d\2\2"+
		"\u0171\u0172\7q\2\2\u0172\u0177\7n\2\2\u0173\u0174\7u\2\2\u0174\u0175"+
		"\7{\2\2\u0175\u0177\7o\2\2\u0176\u016d\3\2\2\2\u0176\u0173\3\2\2\2\u0177"+
		"\67\3\2\2\2\u0178\u0179\7v\2\2\u0179\u017a\7w\2\2\u017a9\3\2\2\2\u017b"+
		"\u017c\7v\2\2\u017c\u017d\7w\2\2\u017d\u017e\7k\2\2\u017e\u017f\7y\2\2"+
		"\u017f\u0180\7{\2\2\u0180\u0181\7\u017e\2\2\u0181\u0182\7g\2\2\u0182\u0183"+
		"\7l\2\2\u0183;\3\2\2\2\u0184\u0185\7e\2\2\u0185\u0186\7f\2\2\u0186=\3"+
		"\2\2\2\u0187\u0188\7n\2\2\u0188\u0189\7u\2\2\u0189?\3\2\2\2\u018a\u018c"+
		"\7\60\2\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2"+
		"\u018d\u018e\7v\2\2\u018e\u018f\7g\2\2\u018f\u0190\7z\2\2\u0190\u0191"+
		"\7v\2\2\u0191A\3\2\2\2\u0192\u0194\7\60\2\2\u0193\u0192\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\7d\2\2\u0196\u0197\7u\2"+
		"\2\u0197\u0198\7u\2\2\u0198C\3\2\2\2\u0199\u019b\7\60\2\2\u019a\u0199"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\7f\2\2\u019d"+
		"\u019e\7c\2\2\u019e\u019f\7v\2\2\u019f\u01a0\7c\2\2\u01a0E\3\2\2\2\u01a1"+
		"\u01a3\7\60\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3"+
		"\2\2\2\u01a4\u01a5\7t\2\2\u01a5\u01a6\7q\2\2\u01a6\u01a7\7f\2\2\u01a7"+
		"\u01a8\7c\2\2\u01a8\u01a9\7v\2\2\u01a9\u01aa\7c\2\2\u01aaG\3\2\2\2\u01ab"+
		"\u01af\t\4\2\2\u01ac\u01af\5R)\2\u01ad\u01af\7\60\2\2\u01ae\u01ab\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b4\3\2\2\2\u01b0"+
		"\u01b3\t\5\2\2\u01b1\u01b3\5R)\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2"+
		"\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5I"+
		"\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b9\t\6\2\2\u01b8\u01b7\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bbK\3\2\2\2"+
		"\u01bc\u01be\t\2\2\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\b&\3\2\u01c2"+
		"M\3\2\2\2\u01c3\u01c4\7^\2\2\u01c4O\3\2\2\2\u01c5\u01c6\7\61\2\2\u01c6"+
		"\u01c7\7\61\2\2\u01c7\u01cb\3\2\2\2\u01c8\u01ca\13\2\2\2\u01c9\u01c8\3"+
		"\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc"+
		"\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01cf\7\f\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u01d1\b(\3\2\u01d1Q\3\2\2\2\u01d2\u01d3\t\7\2\2\u01d3S\3\2"+
		"\2\2!\2\3^djs\u008b\u0095\u0097\u00a5\u00ae\u00b5\u00bc\u00cc\u00d9\u00e4"+
		"\u010f\u0121\u0153\u016b\u0176\u018b\u0193\u019a\u01a2\u01ae\u01b2\u01b4"+
		"\u01ba\u01bf\u01cb\5\4\3\2\b\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}