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
		SEPARATOR_ZNACZNIKOWY=6, WSZ=7, ZMKK=8, PROC=9, ZAKR=10, MINUS_L=11, GWIAZDKA=12, 
		SREDNIK=13, PRZECINEK=14, ZGIN=15, DOKONCZ=16, STAN_MASZYNY_DEKLARACYJNEJ=17, 
		RAMKA=18, STATYCZNE=19, SEKCJA=20, TYPY=21, TOKENY=22, DRZEWO=23, SYMBOLE=24, 
		SYMBOL=25, TU=26, TUIWYZEJ=27, CD=28, LS=29, TEXT=30, BSS=31, DATA=32, 
		RODATA=33, ID=34, NUM=35, WS=36, NASTEPNA=37, SL_COMMENT=38;
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
			"ZAKR", "MINUS_L", "GWIAZDKA", "SREDNIK", "PRZECINEK", "ZGIN", "DOKONCZ", 
			"STAN_MASZYNY_DEKLARACYJNEJ", "RAMKA", "STATYCZNE", "SEKCJA", "TYPY", 
			"TOKENY", "DRZEWO", "SYMBOLE", "SYMBOL", "TU", "TUIWYZEJ", "CD", "LS", 
			"TEXT", "BSS", "DATA", "RODATA", "ID", "NUM", "WS", "NASTEPNA", "SL_COMMENT", 
			"OGONKI"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", null, null, null, null, "':'", null, null, null, null, "'-l'", 
			"'*'", "';'", "','", null, null, null, "'ramka'", null, "'sekcja'", "'typy'", 
			"'tokeny'", null, null, null, "'tu'", "'tuiwy\u017Cej'", "'cd'", "'ls'", 
			null, null, null, null, null, null, null, "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OTW", "ZMK", "PRZEBIEG_TYPOWANIA", "PRZEBIEG_ANALIZY_SEMANTYCZNEJ", 
			"PRZEBIEG_GENERACYJNY", "SEPARATOR_ZNACZNIKOWY", "WSZ", "ZMKK", "PROC", 
			"ZAKR", "MINUS_L", "GWIAZDKA", "SREDNIK", "PRZECINEK", "ZGIN", "DOKONCZ", 
			"STAN_MASZYNY_DEKLARACYJNEJ", "RAMKA", "STATYCZNE", "SEKCJA", "TYPY", 
			"TOKENY", "DRZEWO", "SYMBOLE", "SYMBOL", "TU", "TUIWYZEJ", "CD", "LS", 
			"TEXT", "BSS", "DATA", "RODATA", "ID", "NUM", "WS", "NASTEPNA", "SL_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u01c0\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\5\4[\n\4\3\5\3\5\3\5\3\5\5\5a\n\5\3\6\3\6\3\6\3\6\5\6"+
		"g\n\6\3\7\3\7\3\7\3\7\3\b\6\bn\n\b\r\b\16\bo\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0087\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0091\n\n\5\n\u0093\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a1\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00aa\n\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00ba\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c7\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d2\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00fd\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u010f\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0141\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0159\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u0164\n\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\5\37"+
		"\u0179\n\37\3\37\3\37\3\37\3\37\3\37\3 \5 \u0181\n \3 \3 \3 \3 \3!\5!"+
		"\u0188\n!\3!\3!\3!\3!\3!\3\"\5\"\u0190\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\5#\u019b\n#\3#\3#\7#\u019f\n#\f#\16#\u01a2\13#\3$\6$\u01a5\n$\r"+
		"$\16$\u01a6\3%\6%\u01aa\n%\r%\16%\u01ab\3%\3%\3&\3&\3\'\3\'\3\'\3\'\7"+
		"\'\u01b6\n\'\f\'\16\'\u01b9\13\'\3\'\3\'\3\'\3\'\3(\3(\3\u01b7\2)\4\3"+
		"\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21"+
		"\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33\66\348\35:\36<\37> @!"+
		"B\"D#F$H%J&L\'N(P\2\4\2\3\b\5\2\13\f\17\17\"\"\4\2\60\60gg\4\2C\\c|\6"+
		"\2\62;C\\aac|\3\2\62;\t\2\u00d5\u00d5\u00f5\u00f5\u0106\u0109\u011a\u011b"+
		"\u0143\u0146\u015c\u015d\u017b\u017e\2\u01dd\2\4\3\2\2\2\2\6\3\2\2\2\2"+
		"\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\3\22\3\2"+
		"\2\2\3\24\3\2\2\2\3\26\3\2\2\2\3\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2"+
		"\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\3(\3\2\2\2"+
		"\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\3\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2"+
		"\2\3\66\3\2\2\2\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2"+
		"\3B\3\2\2\2\3D\3\2\2\2\3F\3\2\2\2\3H\3\2\2\2\3J\3\2\2\2\3L\3\2\2\2\3N"+
		"\3\2\2\2\4R\3\2\2\2\6T\3\2\2\2\bZ\3\2\2\2\n`\3\2\2\2\ff\3\2\2\2\16h\3"+
		"\2\2\2\20m\3\2\2\2\22s\3\2\2\2\24\u0092\3\2\2\2\26\u00a9\3\2\2\2\30\u00ab"+
		"\3\2\2\2\32\u00ae\3\2\2\2\34\u00b0\3\2\2\2\36\u00b2\3\2\2\2 \u00b9\3\2"+
		"\2\2\"\u00c6\3\2\2\2$\u00fc\3\2\2\2&\u00fe\3\2\2\2(\u0104\3\2\2\2*\u0110"+
		"\3\2\2\2,\u0117\3\2\2\2.\u011c\3\2\2\2\60\u0123\3\2\2\2\62\u0158\3\2\2"+
		"\2\64\u0163\3\2\2\2\66\u0165\3\2\2\28\u0168\3\2\2\2:\u0171\3\2\2\2<\u0174"+
		"\3\2\2\2>\u0178\3\2\2\2@\u0180\3\2\2\2B\u0187\3\2\2\2D\u018f\3\2\2\2F"+
		"\u019a\3\2\2\2H\u01a4\3\2\2\2J\u01a9\3\2\2\2L\u01af\3\2\2\2N\u01b1\3\2"+
		"\2\2P\u01be\3\2\2\2RS\7>\2\2S\5\3\2\2\2TU\7@\2\2U\7\3\2\2\2VW\7V\2\2W"+
		"X\7[\2\2X[\7R\2\2Y[\7V\2\2ZV\3\2\2\2ZY\3\2\2\2[\t\3\2\2\2\\]\7U\2\2]^"+
		"\7G\2\2^a\7O\2\2_a\7U\2\2`\\\3\2\2\2`_\3\2\2\2a\13\3\2\2\2bc\7I\2\2cd"+
		"\7G\2\2dg\7P\2\2eg\7I\2\2fb\3\2\2\2fe\3\2\2\2g\r\3\2\2\2hi\7<\2\2ij\3"+
		"\2\2\2jk\b\7\2\2k\17\3\2\2\2ln\t\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2o"+
		"p\3\2\2\2pq\3\2\2\2qr\b\b\3\2r\21\3\2\2\2st\7@\2\2tu\3\2\2\2uv\b\t\4\2"+
		"v\23\3\2\2\2wx\7r\2\2xy\7t\2\2yz\7q\2\2z{\7e\2\2{|\7g\2\2|}\7f\2\2}~\7"+
		"w\2\2~\177\7t\2\2\177\u0093\7c\2\2\u0080\u0081\7r\2\2\u0081\u0082\7t\2"+
		"\2\u0082\u0083\7q\2\2\u0083\u0084\7e\2\2\u0084\u0086\3\2\2\2\u0085\u0087"+
		"\7\60\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0093\3\2\2\2"+
		"\u0088\u0089\7r\2\2\u0089\u008a\7t\2\2\u008a\u008b\7q\2\2\u008b\u008c"+
		"\7e\2\2\u008c\u008d\7g\2\2\u008d\u008e\7f\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u0091\7\60\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3"+
		"\2\2\2\u0092w\3\2\2\2\u0092\u0080\3\2\2\2\u0092\u0088\3\2\2\2\u0093\25"+
		"\3\2\2\2\u0094\u0095\7|\2\2\u0095\u0096\7c\2\2\u0096\u0097\7m\2\2\u0097"+
		"\u0098\7t\2\2\u0098\u0099\7g\2\2\u0099\u00aa\7u\2\2\u009a\u009b\7|\2\2"+
		"\u009b\u009c\7c\2\2\u009c\u009d\7m\2\2\u009d\u009e\7t\2\2\u009e\u00a0"+
		"\3\2\2\2\u009f\u00a1\7\60\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2"+
		"\u00a1\u00aa\3\2\2\2\u00a2\u00a3\7|\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5"+
		"\7m\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7u\2\2\u00a8"+
		"\u00aa\7{\2\2\u00a9\u0094\3\2\2\2\u00a9\u009a\3\2\2\2\u00a9\u00a2\3\2"+
		"\2\2\u00aa\27\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac\u00ad\7n\2\2\u00ad\31\3"+
		"\2\2\2\u00ae\u00af\7,\2\2\u00af\33\3\2\2\2\u00b0\u00b1\7=\2\2\u00b1\35"+
		"\3\2\2\2\u00b2\u00b3\7.\2\2\u00b3\37\3\2\2\2\u00b4\u00b5\7|\2\2\u00b5"+
		"\u00b6\7i\2\2\u00b6\u00b7\7k\2\2\u00b7\u00ba\7\u0146\2\2\u00b8\u00ba\7"+
		"b\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba!\3\2\2\2\u00bb\u00bc"+
		"\7f\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7m\2\2\u00be\u00bf\7q\2\2\u00bf"+
		"\u00c0\7\u0146\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c7\7|\2\2\u00c2\u00c3\7"+
		"f\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7m\2\2\u00c5\u00c7\7\60\2\2\u00c6"+
		"\u00bb\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7#\3\2\2\2\u00c8\u00c9\7u\2\2\u00c9"+
		"\u00fd\7f\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7f\2\2\u00cc\u00cd\7g\2\2"+
		"\u00cd\u00ce\7m\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00d2"+
		"\7\60\2\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00fd\3\2\2\2"+
		"\u00d3\u00d4\7u\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7"+
		"\7p\2\2\u00d7\u00d8\7a\2\2\u00d8\u00d9\7f\2\2\u00d9\u00da\7g\2\2\u00da"+
		"\u00db\7m\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7t\2\2"+
		"\u00de\u00df\7c\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7l\2\2\u00e1\u00fd"+
		"\7k\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7c\2\2\u00e5"+
		"\u00e6\7p\2\2\u00e6\u00e7\7a\2\2\u00e7\u00e8\7o\2\2\u00e8\u00e9\7c\2\2"+
		"\u00e9\u00ea\7u\2\2\u00ea\u00eb\7|\2\2\u00eb\u00ec\7{\2\2\u00ec\u00ed"+
		"\7p\2\2\u00ed\u00ee\7{\2\2\u00ee\u00ef\7a\2\2\u00ef\u00f0\7f\2\2\u00f0"+
		"\u00f1\7g\2\2\u00f1\u00f2\7m\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7c\2\2"+
		"\u00f4\u00f5\7t\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8"+
		"\7{\2\2\u00f8\u00f9\7l\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"\u00fd\7l\2\2\u00fc\u00c8\3\2\2\2\u00fc\u00ca\3\2\2\2\u00fc\u00d3\3\2"+
		"\2\2\u00fc\u00e2\3\2\2\2\u00fd%\3\2\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100"+
		"\7c\2\2\u0100\u0101\7o\2\2\u0101\u0102\7m\2\2\u0102\u0103\7c\2\2\u0103"+
		"\'\3\2\2\2\u0104\u0105\7u\2\2\u0105\u0106\7v\2\2\u0106\u0107\7c\2\2\u0107"+
		"\u0108\7v\2\2\u0108\u0109\7{\2\2\u0109\u010a\7e\2\2\u010a\u010b\7|\2\2"+
		"\u010b\u010c\7p\2\2\u010c\u010e\3\2\2\2\u010d\u010f\t\3\2\2\u010e\u010d"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f)\3\2\2\2\u0110\u0111\7u\2\2\u0111\u0112"+
		"\7g\2\2\u0112\u0113\7m\2\2\u0113\u0114\7e\2\2\u0114\u0115\7l\2\2\u0115"+
		"\u0116\7c\2\2\u0116+\3\2\2\2\u0117\u0118\7v\2\2\u0118\u0119\7{\2\2\u0119"+
		"\u011a\7r\2\2\u011a\u011b\7{\2\2\u011b-\3\2\2\2\u011c\u011d\7v\2\2\u011d"+
		"\u011e\7q\2\2\u011e\u011f\7m\2\2\u011f\u0120\7g\2\2\u0120\u0121\7p\2\2"+
		"\u0121\u0122\7{\2\2\u0122/\3\2\2\2\u0123\u0124\7f\2\2\u0124\u0125\7t\2"+
		"\2\u0125\u0126\7|\2\2\u0126\u0127\7g\2\2\u0127\u0128\7y\2\2\u0128\u0129"+
		"\7q\2\2\u0129\u0140\3\2\2\2\u012a\u012b\7u\2\2\u012b\u012c\7m\2\2\u012c"+
		"\u012d\7\u0144\2\2\u012d\u012e\7c\2\2\u012e\u012f\7f\2\2\u012f\u0130\7"+
		"p\2\2\u0130\u0131\7k\2\2\u0131\u0132\7q\2\2\u0132\u0133\7y\2\2\u0133\u0141"+
		"\7g\2\2\u0134\u0135\7u\2\2\u0135\u0136\7{\2\2\u0136\u0137\7p\2\2\u0137"+
		"\u0138\7v\2\2\u0138\u0139\7c\2\2\u0139\u013a\7m\2\2\u013a\u013b\7v\2\2"+
		"\u013b\u013c\7{\2\2\u013c\u013d\7e\2\2\u013d\u013e\7|\2\2\u013e\u013f"+
		"\7p\2\2\u013f\u0141\7g\2\2\u0140\u012a\3\2\2\2\u0140\u0134\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\61\3\2\2\2\u0142\u0143\7u\2\2\u0143\u0144\7{\2\2"+
		"\u0144\u0145\7o\2\2\u0145\u0146\7d\2\2\u0146\u0147\7q\2\2\u0147\u0148"+
		"\7n\2\2\u0148\u0159\7g\2\2\u0149\u014a\7r\2\2\u014a\u014b\7t\2\2\u014b"+
		"\u014c\7|\2\2\u014c\u014d\7g\2\2\u014d\u014e\7u\2\2\u014e\u014f\7v\2\2"+
		"\u014f\u0150\7t\2\2\u0150\u0151\7|\2\2\u0151\u0152\7g\2\2\u0152\u0153"+
		"\7\u0146\2\2\u0153\u0154\7\"\2\2\u0154\u0155\7p\2\2\u0155\u0156\7c\2\2"+
		"\u0156\u0157\7|\2\2\u0157\u0159\7y\2\2\u0158\u0142\3\2\2\2\u0158\u0149"+
		"\3\2\2\2\u0159\63\3\2\2\2\u015a\u015b\7u\2\2\u015b\u015c\7{\2\2\u015c"+
		"\u015d\7o\2\2\u015d\u015e\7d\2\2\u015e\u015f\7q\2\2\u015f\u0164\7n\2\2"+
		"\u0160\u0161\7u\2\2\u0161\u0162\7{\2\2\u0162\u0164\7o\2\2\u0163\u015a"+
		"\3\2\2\2\u0163\u0160\3\2\2\2\u0164\65\3\2\2\2\u0165\u0166\7v\2\2\u0166"+
		"\u0167\7w\2\2\u0167\67\3\2\2\2\u0168\u0169\7v\2\2\u0169\u016a\7w\2\2\u016a"+
		"\u016b\7k\2\2\u016b\u016c\7y\2\2\u016c\u016d\7{\2\2\u016d\u016e\7\u017e"+
		"\2\2\u016e\u016f\7g\2\2\u016f\u0170\7l\2\2\u01709\3\2\2\2\u0171\u0172"+
		"\7e\2\2\u0172\u0173\7f\2\2\u0173;\3\2\2\2\u0174\u0175\7n\2\2\u0175\u0176"+
		"\7u\2\2\u0176=\3\2\2\2\u0177\u0179\7\60\2\2\u0178\u0177\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\7v\2\2\u017b\u017c\7g\2"+
		"\2\u017c\u017d\7z\2\2\u017d\u017e\7v\2\2\u017e?\3\2\2\2\u017f\u0181\7"+
		"\60\2\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0183\7d\2\2\u0183\u0184\7u\2\2\u0184\u0185\7u\2\2\u0185A\3\2\2\2\u0186"+
		"\u0188\7\60\2\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3"+
		"\2\2\2\u0189\u018a\7f\2\2\u018a\u018b\7c\2\2\u018b\u018c\7v\2\2\u018c"+
		"\u018d\7c\2\2\u018dC\3\2\2\2\u018e\u0190\7\60\2\2\u018f\u018e\3\2\2\2"+
		"\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\7t\2\2\u0192\u0193"+
		"\7q\2\2\u0193\u0194\7f\2\2\u0194\u0195\7c\2\2\u0195\u0196\7v\2\2\u0196"+
		"\u0197\7c\2\2\u0197E\3\2\2\2\u0198\u019b\t\4\2\2\u0199\u019b\5P(\2\u019a"+
		"\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019b\u01a0\3\2\2\2\u019c\u019f\t\5"+
		"\2\2\u019d\u019f\5P(\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f\u01a2"+
		"\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1G\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a3\u01a5\t\6\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7I\3\2\2\2\u01a8\u01aa"+
		"\t\2\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\b%\3\2\u01aeK\3\2\2\2\u01af"+
		"\u01b0\7^\2\2\u01b0M\3\2\2\2\u01b1\u01b2\7\61\2\2\u01b2\u01b3\7\61\2\2"+
		"\u01b3\u01b7\3\2\2\2\u01b4\u01b6\13\2\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01ba\u01bb\7\f\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\b\'"+
		"\3\2\u01bdO\3\2\2\2\u01be\u01bf\t\7\2\2\u01bfQ\3\2\2\2\37\2\3Z`fo\u0086"+
		"\u0090\u0092\u00a0\u00a9\u00b9\u00c6\u00d1\u00fc\u010e\u0140\u0158\u0163"+
		"\u0178\u0180\u0187\u018f\u019a\u019e\u01a0\u01a6\u01ab\u01b7\5\4\3\2\b"+
		"\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}