// Generated from C:/Users/mastr/Documents/MS/STUDIA/kompilatory/kompilatorpl/kompilator0/src/pl/plpl/Debugger\lekserDebugera.g4 by ANTLR 4.9.2
package pl.plpl.Debuger;
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
		SEKCJA=18, TYPY=19, TOKENY=20, DRZEWO=21, CD=22, LS=23, TEXT=24, BSS=25, 
		DATA=26, RODATA=27, ID=28, NUM=29, WS=30, NASTEPNA=31, SL_COMMENT=32;
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
			"STATYCZNE", "SEKCJA", "TYPY", "TOKENY", "DRZEWO", "CD", "LS", "TEXT", 
			"BSS", "DATA", "RODATA", "ID", "NUM", "WS", "NASTEPNA", "SL_COMMENT", 
			"OGONKI"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", null, null, null, null, "':'", null, null, null, null, "'*'", 
			"';'", "','", "'zgi\u0144'", "'doko\u0144cz'", "'ramka'", null, "'sekcja'", 
			"'typy'", "'tokeny'", null, "'cd'", "'ls'", null, null, null, null, null, 
			null, null, "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OTW", "ZMK", "PRZEBIEG_TYPOWANIA", "PRZEBIEG_ANALIZY_SEMANTYCZNEJ", 
			"PRZEBIEG_GENERACYJNY", "SEPARATOR_ZNACZNIKOWY", "WSZ", "ZMKK", "PROC", 
			"ZAKR", "GWIAZDKA", "SREDNIK", "PRZECINEK", "ZGIN", "DOKONCZ", "RAMKA", 
			"STATYCZNE", "SEKCJA", "TYPY", "TOKENY", "DRZEWO", "CD", "LS", "TEXT", 
			"BSS", "DATA", "RODATA", "ID", "NUM", "WS", "NASTEPNA", "SL_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u013e\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4O\n\4\3\5\3\5\3\5\3"+
		"\5\5\5U\n\5\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\7\3\b\6\bb\n\b\r\b"+
		"\16\bc\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n{\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0085"+
		"\n\n\5\n\u0087\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u0095\n\13\5\13\u0097\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00bc\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ee\n\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\5\31\u00f7\n\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\5\32\u00ff\n\32\3\32\3\32\3\32\3\32\3\33\5\33\u0106\n\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\5\34\u010e\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\5\35\u0119\n\35\3\35\3\35\7\35\u011d\n\35\f\35\16\35\u0120"+
		"\13\35\3\36\6\36\u0123\n\36\r\36\16\36\u0124\3\37\6\37\u0128\n\37\r\37"+
		"\16\37\u0129\3\37\3\37\3 \3 \3!\3!\3!\3!\7!\u0134\n!\f!\16!\u0137\13!"+
		"\3!\3!\3!\3!\3\"\3\"\3\u0135\2#\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24"+
		"\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31"+
		"\62\32\64\33\66\348\35:\36<\37> @!B\"D\2\4\2\3\b\5\2\13\f\17\17\"\"\4"+
		"\2\60\60gg\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\t\2\u00d5\u00d5\u00f5\u00f5"+
		"\u0106\u0109\u011a\u011b\u0143\u0146\u015c\u015d\u017b\u017e\2\u0152\2"+
		"\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2"+
		"\2\2\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2\2\2\3\26\3\2\2\2\3\30\3\2\2\2\3"+
		"\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2"+
		"\2\3&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\3\60\3\2\2\2"+
		"\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2"+
		"\2\3>\3\2\2\2\3@\3\2\2\2\3B\3\2\2\2\4F\3\2\2\2\6H\3\2\2\2\bN\3\2\2\2\n"+
		"T\3\2\2\2\fZ\3\2\2\2\16\\\3\2\2\2\20a\3\2\2\2\22g\3\2\2\2\24\u0086\3\2"+
		"\2\2\26\u0096\3\2\2\2\30\u0098\3\2\2\2\32\u009a\3\2\2\2\34\u009c\3\2\2"+
		"\2\36\u009e\3\2\2\2 \u00a3\3\2\2\2\"\u00ab\3\2\2\2$\u00b1\3\2\2\2&\u00bd"+
		"\3\2\2\2(\u00c4\3\2\2\2*\u00c9\3\2\2\2,\u00d0\3\2\2\2.\u00ef\3\2\2\2\60"+
		"\u00f2\3\2\2\2\62\u00f6\3\2\2\2\64\u00fe\3\2\2\2\66\u0105\3\2\2\28\u010d"+
		"\3\2\2\2:\u0118\3\2\2\2<\u0122\3\2\2\2>\u0127\3\2\2\2@\u012d\3\2\2\2B"+
		"\u012f\3\2\2\2D\u013c\3\2\2\2FG\7>\2\2G\5\3\2\2\2HI\7@\2\2I\7\3\2\2\2"+
		"JK\7V\2\2KL\7[\2\2LO\7R\2\2MO\7V\2\2NJ\3\2\2\2NM\3\2\2\2O\t\3\2\2\2PQ"+
		"\7U\2\2QR\7G\2\2RU\7O\2\2SU\7U\2\2TP\3\2\2\2TS\3\2\2\2U\13\3\2\2\2VW\7"+
		"I\2\2WX\7G\2\2X[\7P\2\2Y[\7I\2\2ZV\3\2\2\2ZY\3\2\2\2[\r\3\2\2\2\\]\7<"+
		"\2\2]^\3\2\2\2^_\b\7\2\2_\17\3\2\2\2`b\t\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3"+
		"\2\2\2cd\3\2\2\2de\3\2\2\2ef\b\b\3\2f\21\3\2\2\2gh\7@\2\2hi\3\2\2\2ij"+
		"\b\t\4\2j\23\3\2\2\2kl\7r\2\2lm\7t\2\2mn\7q\2\2no\7e\2\2op\7g\2\2pq\7"+
		"f\2\2qr\7w\2\2rs\7t\2\2s\u0087\7c\2\2tu\7r\2\2uv\7t\2\2vw\7q\2\2wx\7e"+
		"\2\2xz\3\2\2\2y{\7\60\2\2zy\3\2\2\2z{\3\2\2\2{\u0087\3\2\2\2|}\7r\2\2"+
		"}~\7t\2\2~\177\7q\2\2\177\u0080\7e\2\2\u0080\u0081\7g\2\2\u0081\u0082"+
		"\7f\2\2\u0082\u0084\3\2\2\2\u0083\u0085\7\60\2\2\u0084\u0083\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086k\3\2\2\2\u0086t\3\2\2\2\u0086"+
		"|\3\2\2\2\u0087\25\3\2\2\2\u0088\u0089\7|\2\2\u0089\u008a\7c\2\2\u008a"+
		"\u008b\7m\2\2\u008b\u008c\7t\2\2\u008c\u008d\7g\2\2\u008d\u0097\7u\2\2"+
		"\u008e\u008f\7|\2\2\u008f\u0090\7c\2\2\u0090\u0091\7m\2\2\u0091\u0092"+
		"\7t\2\2\u0092\u0094\3\2\2\2\u0093\u0095\7\60\2\2\u0094\u0093\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0088\3\2\2\2\u0096\u008e\3\2"+
		"\2\2\u0097\27\3\2\2\2\u0098\u0099\7,\2\2\u0099\31\3\2\2\2\u009a\u009b"+
		"\7=\2\2\u009b\33\3\2\2\2\u009c\u009d\7.\2\2\u009d\35\3\2\2\2\u009e\u009f"+
		"\7|\2\2\u009f\u00a0\7i\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7\u0146\2\2"+
		"\u00a2\37\3\2\2\2\u00a3\u00a4\7f\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7"+
		"m\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7\u0146\2\2\u00a8\u00a9\7e\2\2\u00a9"+
		"\u00aa\7|\2\2\u00aa!\3\2\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7c\2\2\u00ad"+
		"\u00ae\7o\2\2\u00ae\u00af\7m\2\2\u00af\u00b0\7c\2\2\u00b0#\3\2\2\2\u00b1"+
		"\u00b2\7u\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7v\2\2"+
		"\u00b5\u00b6\7{\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7|\2\2\u00b8\u00b9"+
		"\7p\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00bc\t\3\2\2\u00bb\u00ba\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc%\3\2\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7g\2\2\u00bf"+
		"\u00c0\7m\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7l\2\2\u00c2\u00c3\7c\2\2"+
		"\u00c3\'\3\2\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7{\2\2\u00c6\u00c7\7r"+
		"\2\2\u00c7\u00c8\7{\2\2\u00c8)\3\2\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb"+
		"\7q\2\2\u00cb\u00cc\7m\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7p\2\2\u00ce"+
		"\u00cf\7{\2\2\u00cf+\3\2\2\2\u00d0\u00d1\7f\2\2\u00d1\u00d2\7t\2\2\u00d2"+
		"\u00d3\7|\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7y\2\2\u00d5\u00d6\7q\2\2"+
		"\u00d6\u00ed\3\2\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7m\2\2\u00d9\u00da"+
		"\7\u0144\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7p\2\2"+
		"\u00dd\u00de\7k\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7y\2\2\u00e0\u00ee"+
		"\7g\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7{\2\2\u00e3\u00e4\7p\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7m\2\2\u00e7\u00e8\7v\2\2"+
		"\u00e8\u00e9\7{\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7|\2\2\u00eb\u00ec"+
		"\7p\2\2\u00ec\u00ee\7g\2\2\u00ed\u00d7\3\2\2\2\u00ed\u00e1\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee-\3\2\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7f\2\2\u00f1"+
		"/\3\2\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7u\2\2\u00f4\61\3\2\2\2\u00f5"+
		"\u00f7\7\60\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3"+
		"\2\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7z\2\2\u00fb"+
		"\u00fc\7v\2\2\u00fc\63\3\2\2\2\u00fd\u00ff\7\60\2\2\u00fe\u00fd\3\2\2"+
		"\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7d\2\2\u0101\u0102"+
		"\7u\2\2\u0102\u0103\7u\2\2\u0103\65\3\2\2\2\u0104\u0106\7\60\2\2\u0105"+
		"\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7f"+
		"\2\2\u0108\u0109\7c\2\2\u0109\u010a\7v\2\2\u010a\u010b\7c\2\2\u010b\67"+
		"\3\2\2\2\u010c\u010e\7\60\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2"+
		"\u010e\u010f\3\2\2\2\u010f\u0110\7t\2\2\u0110\u0111\7q\2\2\u0111\u0112"+
		"\7f\2\2\u0112\u0113\7c\2\2\u0113\u0114\7v\2\2\u0114\u0115\7c\2\2\u0115"+
		"9\3\2\2\2\u0116\u0119\t\4\2\2\u0117\u0119\5D\"\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0117\3\2\2\2\u0119\u011e\3\2\2\2\u011a\u011d\t\5\2\2\u011b\u011d\5D"+
		"\"\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f;\3\2\2\2\u0120\u011e\3\2\2\2"+
		"\u0121\u0123\t\6\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125=\3\2\2\2\u0126\u0128\t\2\2\2\u0127"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012c\b\37\3\2\u012c?\3\2\2\2\u012d\u012e"+
		"\7^\2\2\u012eA\3\2\2\2\u012f\u0130\7\61\2\2\u0130\u0131\7\61\2\2\u0131"+
		"\u0135\3\2\2\2\u0132\u0134\13\2\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3"+
		"\2\2\2\u0135\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0138\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138\u0139\7\f\2\2\u0139\u013a\3\2\2\2\u013a\u013b\b!"+
		"\3\2\u013bC\3\2\2\2\u013c\u013d\t\7\2\2\u013dE\3\2\2\2\31\2\3NTZcz\u0084"+
		"\u0086\u0094\u0096\u00bb\u00ed\u00f6\u00fe\u0105\u010d\u0118\u011c\u011e"+
		"\u0124\u0129\u0135\5\4\3\2\b\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}