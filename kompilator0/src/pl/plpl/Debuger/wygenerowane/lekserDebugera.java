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
		SEPARATOR_ZNACZNIKOWY=6, WSZ=7, ZMKK=8, PROC=9, ZAKR=10, GWIAZDKA=11, 
		SREDNIK=12, PRZECINEK=13, ZGIN=14, DOKONCZ=15, RAMKA=16, STATYCZNE=17, 
		SEKCJA=18, TYPY=19, TOKENY=20, DRZEWO=21, SYMBOLE=22, SYMBOL=23, TU=24, 
		TUIWYZEJ=25, CD=26, LS=27, TEXT=28, BSS=29, DATA=30, RODATA=31, ID=32, 
		NUM=33, WS=34, NASTEPNA=35, SL_COMMENT=36;
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
			"ZAKR", "GWIAZDKA", "SREDNIK", "PRZECINEK", "ZGIN", "DOKONCZ", "RAMKA", 
			"STATYCZNE", "SEKCJA", "TYPY", "TOKENY", "DRZEWO", "SYMBOLE", "SYMBOL", 
			"TU", "TUIWYZEJ", "CD", "LS", "TEXT", "BSS", "DATA", "RODATA", "ID", 
			"NUM", "WS", "NASTEPNA", "SL_COMMENT", "OGONKI"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", null, null, null, null, "':'", null, null, null, null, "'*'", 
			"';'", "','", null, null, "'ramka'", null, "'sekcja'", "'typy'", "'tokeny'", 
			null, null, null, "'tu'", "'tuiwy\u017Cej'", "'cd'", "'ls'", null, null, 
			null, null, null, null, null, "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OTW", "ZMK", "PRZEBIEG_TYPOWANIA", "PRZEBIEG_ANALIZY_SEMANTYCZNEJ", 
			"PRZEBIEG_GENERACYJNY", "SEPARATOR_ZNACZNIKOWY", "WSZ", "ZMKK", "PROC", 
			"ZAKR", "GWIAZDKA", "SREDNIK", "PRZECINEK", "ZGIN", "DOKONCZ", "RAMKA", 
			"STATYCZNE", "SEKCJA", "TYPY", "TOKENY", "DRZEWO", "SYMBOLE", "SYMBOL", 
			"TU", "TUIWYZEJ", "CD", "LS", "TEXT", "BSS", "DATA", "RODATA", "ID", 
			"NUM", "WS", "NASTEPNA", "SL_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u017b\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\5\4W\n\4\3\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6\5\6c\n\6\3\7\3\7"+
		"\3\7\3\7\3\b\6\bj\n\b\r\b\16\bk\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0083\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u008d\n\n\5\n\u008f\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009d\n\13\5\13\u009f\n"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00ac\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b9\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00cb\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00fd\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0114\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u011f\n\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\5\35"+
		"\u0134\n\35\3\35\3\35\3\35\3\35\3\35\3\36\5\36\u013c\n\36\3\36\3\36\3"+
		"\36\3\36\3\37\5\37\u0143\n\37\3\37\3\37\3\37\3\37\3\37\3 \5 \u014b\n "+
		"\3 \3 \3 \3 \3 \3 \3 \3!\3!\5!\u0156\n!\3!\3!\7!\u015a\n!\f!\16!\u015d"+
		"\13!\3\"\6\"\u0160\n\"\r\"\16\"\u0161\3#\6#\u0165\n#\r#\16#\u0166\3#\3"+
		"#\3$\3$\3%\3%\3%\3%\7%\u0171\n%\f%\16%\u0174\13%\3%\3%\3%\3%\3&\3&\3\u0172"+
		"\2\'\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36"+
		"\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33\66\348\35:\36<"+
		"\37> @!B\"D#F$H%J&L\2\4\2\3\b\5\2\13\f\17\17\"\"\4\2\60\60gg\4\2C\\c|"+
		"\6\2\62;C\\aac|\3\2\62;\t\2\u00d5\u00d5\u00f5\u00f5\u0106\u0109\u011a"+
		"\u011b\u0143\u0146\u015c\u015d\u017b\u017e\2\u0193\2\4\3\2\2\2\2\6\3\2"+
		"\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\3\22"+
		"\3\2\2\2\3\24\3\2\2\2\3\26\3\2\2\2\3\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2"+
		"\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\3(\3\2"+
		"\2\2\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\3\60\3\2\2\2\3\62\3\2\2\2\3\64\3"+
		"\2\2\2\3\66\3\2\2\2\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2\2\3>\3\2\2\2\3@\3\2"+
		"\2\2\3B\3\2\2\2\3D\3\2\2\2\3F\3\2\2\2\3H\3\2\2\2\3J\3\2\2\2\4N\3\2\2\2"+
		"\6P\3\2\2\2\bV\3\2\2\2\n\\\3\2\2\2\fb\3\2\2\2\16d\3\2\2\2\20i\3\2\2\2"+
		"\22o\3\2\2\2\24\u008e\3\2\2\2\26\u009e\3\2\2\2\30\u00a0\3\2\2\2\32\u00a2"+
		"\3\2\2\2\34\u00a4\3\2\2\2\36\u00ab\3\2\2\2 \u00b8\3\2\2\2\"\u00ba\3\2"+
		"\2\2$\u00c0\3\2\2\2&\u00cc\3\2\2\2(\u00d3\3\2\2\2*\u00d8\3\2\2\2,\u00df"+
		"\3\2\2\2.\u0113\3\2\2\2\60\u011e\3\2\2\2\62\u0120\3\2\2\2\64\u0123\3\2"+
		"\2\2\66\u012c\3\2\2\28\u012f\3\2\2\2:\u0133\3\2\2\2<\u013b\3\2\2\2>\u0142"+
		"\3\2\2\2@\u014a\3\2\2\2B\u0155\3\2\2\2D\u015f\3\2\2\2F\u0164\3\2\2\2H"+
		"\u016a\3\2\2\2J\u016c\3\2\2\2L\u0179\3\2\2\2NO\7>\2\2O\5\3\2\2\2PQ\7@"+
		"\2\2Q\7\3\2\2\2RS\7V\2\2ST\7[\2\2TW\7R\2\2UW\7V\2\2VR\3\2\2\2VU\3\2\2"+
		"\2W\t\3\2\2\2XY\7U\2\2YZ\7G\2\2Z]\7O\2\2[]\7U\2\2\\X\3\2\2\2\\[\3\2\2"+
		"\2]\13\3\2\2\2^_\7I\2\2_`\7G\2\2`c\7P\2\2ac\7I\2\2b^\3\2\2\2ba\3\2\2\2"+
		"c\r\3\2\2\2de\7<\2\2ef\3\2\2\2fg\b\7\2\2g\17\3\2\2\2hj\t\2\2\2ih\3\2\2"+
		"\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\b\b\3\2n\21\3\2\2\2op\7@"+
		"\2\2pq\3\2\2\2qr\b\t\4\2r\23\3\2\2\2st\7r\2\2tu\7t\2\2uv\7q\2\2vw\7e\2"+
		"\2wx\7g\2\2xy\7f\2\2yz\7w\2\2z{\7t\2\2{\u008f\7c\2\2|}\7r\2\2}~\7t\2\2"+
		"~\177\7q\2\2\177\u0080\7e\2\2\u0080\u0082\3\2\2\2\u0081\u0083\7\60\2\2"+
		"\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u008f\3\2\2\2\u0084\u0085"+
		"\7r\2\2\u0085\u0086\7t\2\2\u0086\u0087\7q\2\2\u0087\u0088\7e\2\2\u0088"+
		"\u0089\7g\2\2\u0089\u008a\7f\2\2\u008a\u008c\3\2\2\2\u008b\u008d\7\60"+
		"\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"s\3\2\2\2\u008e|\3\2\2\2\u008e\u0084\3\2\2\2\u008f\25\3\2\2\2\u0090\u0091"+
		"\7|\2\2\u0091\u0092\7c\2\2\u0092\u0093\7m\2\2\u0093\u0094\7t\2\2\u0094"+
		"\u0095\7g\2\2\u0095\u009f\7u\2\2\u0096\u0097\7|\2\2\u0097\u0098\7c\2\2"+
		"\u0098\u0099\7m\2\2\u0099\u009a\7t\2\2\u009a\u009c\3\2\2\2\u009b\u009d"+
		"\7\60\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2"+
		"\u009e\u0090\3\2\2\2\u009e\u0096\3\2\2\2\u009f\27\3\2\2\2\u00a0\u00a1"+
		"\7,\2\2\u00a1\31\3\2\2\2\u00a2\u00a3\7=\2\2\u00a3\33\3\2\2\2\u00a4\u00a5"+
		"\7.\2\2\u00a5\35\3\2\2\2\u00a6\u00a7\7|\2\2\u00a7\u00a8\7i\2\2\u00a8\u00a9"+
		"\7k\2\2\u00a9\u00ac\7\u0146\2\2\u00aa\u00ac\7b\2\2\u00ab\u00a6\3\2\2\2"+
		"\u00ab\u00aa\3\2\2\2\u00ac\37\3\2\2\2\u00ad\u00ae\7f\2\2\u00ae\u00af\7"+
		"q\2\2\u00af\u00b0\7m\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7\u0146\2\2\u00b2"+
		"\u00b3\7e\2\2\u00b3\u00b9\7|\2\2\u00b4\u00b5\7f\2\2\u00b5\u00b6\7q\2\2"+
		"\u00b6\u00b7\7m\2\2\u00b7\u00b9\7\60\2\2\u00b8\u00ad\3\2\2\2\u00b8\u00b4"+
		"\3\2\2\2\u00b9!\3\2\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd"+
		"\7o\2\2\u00bd\u00be\7m\2\2\u00be\u00bf\7c\2\2\u00bf#\3\2\2\2\u00c0\u00c1"+
		"\7u\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7v\2\2\u00c4"+
		"\u00c5\7{\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7\7|\2\2\u00c7\u00c8\7p\2\2"+
		"\u00c8\u00ca\3\2\2\2\u00c9\u00cb\t\3\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb%\3\2\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf"+
		"\7m\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7l\2\2\u00d1\u00d2\7c\2\2\u00d2"+
		"\'\3\2\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7{\2\2\u00d5\u00d6\7r\2\2\u00d6"+
		"\u00d7\7{\2\2\u00d7)\3\2\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7q\2\2\u00da"+
		"\u00db\7m\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7{\2\2"+
		"\u00de+\3\2\2\2\u00df\u00e0\7f\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7|\2"+
		"\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7y\2\2\u00e4\u00e5\7q\2\2\u00e5\u00fc"+
		"\3\2\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7m\2\2\u00e8\u00e9\7\u0144\2\2"+
		"\u00e9\u00ea\7c\2\2\u00ea\u00eb\7f\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed"+
		"\7k\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7y\2\2\u00ef\u00fd\7g\2\2\u00f0"+
		"\u00f1\7u\2\2\u00f1\u00f2\7{\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7v\2\2"+
		"\u00f4\u00f5\7c\2\2\u00f5\u00f6\7m\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8"+
		"\7{\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fa\7|\2\2\u00fa\u00fb\7p\2\2\u00fb"+
		"\u00fd\7g\2\2\u00fc\u00e6\3\2\2\2\u00fc\u00f0\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd-\3\2\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7{\2\2\u0100\u0101"+
		"\7o\2\2\u0101\u0102\7d\2\2\u0102\u0103\7q\2\2\u0103\u0104\7n\2\2\u0104"+
		"\u0114\7g\2\2\u0105\u0106\7r\2\2\u0106\u0107\7t\2\2\u0107\u0108\7|\2\2"+
		"\u0108\u0109\7g\2\2\u0109\u010a\7u\2\2\u010a\u010b\7v\2\2\u010b\u010c"+
		"\7t\2\2\u010c\u010d\7|\2\2\u010d\u010e\7g\2\2\u010e\u010f\7\u0146\2\2"+
		"\u010f\u0110\7p\2\2\u0110\u0111\7c\2\2\u0111\u0112\7|\2\2\u0112\u0114"+
		"\7y\2\2\u0113\u00fe\3\2\2\2\u0113\u0105\3\2\2\2\u0114/\3\2\2\2\u0115\u0116"+
		"\7u\2\2\u0116\u0117\7{\2\2\u0117\u0118\7o\2\2\u0118\u0119\7d\2\2\u0119"+
		"\u011a\7q\2\2\u011a\u011f\7n\2\2\u011b\u011c\7u\2\2\u011c\u011d\7{\2\2"+
		"\u011d\u011f\7o\2\2\u011e\u0115\3\2\2\2\u011e\u011b\3\2\2\2\u011f\61\3"+
		"\2\2\2\u0120\u0121\7v\2\2\u0121\u0122\7w\2\2\u0122\63\3\2\2\2\u0123\u0124"+
		"\7v\2\2\u0124\u0125\7w\2\2\u0125\u0126\7k\2\2\u0126\u0127\7y\2\2\u0127"+
		"\u0128\7{\2\2\u0128\u0129\7\u017e\2\2\u0129\u012a\7g\2\2\u012a\u012b\7"+
		"l\2\2\u012b\65\3\2\2\2\u012c\u012d\7e\2\2\u012d\u012e\7f\2\2\u012e\67"+
		"\3\2\2\2\u012f\u0130\7n\2\2\u0130\u0131\7u\2\2\u01319\3\2\2\2\u0132\u0134"+
		"\7\60\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2"+
		"\u0135\u0136\7v\2\2\u0136\u0137\7g\2\2\u0137\u0138\7z\2\2\u0138\u0139"+
		"\7v\2\2\u0139;\3\2\2\2\u013a\u013c\7\60\2\2\u013b\u013a\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\7d\2\2\u013e\u013f\7u\2"+
		"\2\u013f\u0140\7u\2\2\u0140=\3\2\2\2\u0141\u0143\7\60\2\2\u0142\u0141"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7f\2\2\u0145"+
		"\u0146\7c\2\2\u0146\u0147\7v\2\2\u0147\u0148\7c\2\2\u0148?\3\2\2\2\u0149"+
		"\u014b\7\60\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3"+
		"\2\2\2\u014c\u014d\7t\2\2\u014d\u014e\7q\2\2\u014e\u014f\7f\2\2\u014f"+
		"\u0150\7c\2\2\u0150\u0151\7v\2\2\u0151\u0152\7c\2\2\u0152A\3\2\2\2\u0153"+
		"\u0156\t\4\2\2\u0154\u0156\5L&\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2"+
		"\2\u0156\u015b\3\2\2\2\u0157\u015a\t\5\2\2\u0158\u015a\5L&\2\u0159\u0157"+
		"\3\2\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015cC\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0160\t\6\2\2"+
		"\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162E\3\2\2\2\u0163\u0165\t\2\2\2\u0164\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u0169\b#\3\2\u0169G\3\2\2\2\u016a\u016b\7^\2\2\u016bI\3\2\2"+
		"\2\u016c\u016d\7\61\2\2\u016d\u016e\7\61\2\2\u016e\u0172\3\2\2\2\u016f"+
		"\u0171\13\2\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0173\3"+
		"\2\2\2\u0172\u0170\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175"+
		"\u0176\7\f\2\2\u0176\u0177\3\2\2\2\u0177\u0178\b%\3\2\u0178K\3\2\2\2\u0179"+
		"\u017a\t\7\2\2\u017aM\3\2\2\2\35\2\3V\\bk\u0082\u008c\u008e\u009c\u009e"+
		"\u00ab\u00b8\u00ca\u00fc\u0113\u011e\u0133\u013b\u0142\u014a\u0155\u0159"+
		"\u015b\u0161\u0166\u0172\5\4\3\2\b\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}