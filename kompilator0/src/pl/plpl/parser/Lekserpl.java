// Generated from C:/Users/mastr/Documents/MS/STUDIA/kompilatory/kompilatorpl/kompilator0/src/pl/plpl\Lekserpl.g4 by ANTLR 4.9.2
package pl.plpl.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lekserpl extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ZNACZNIK_DEBUGGERA=1, NIC=2, STATYCZN=3, AUTOMATYCZN=4, STAL=5, TCALK=6, 
		TRZECZYW=7, TZNAK=8, TREF=9, NOWY=10, PRZERWIJ=11, KONTYNUUJ=12, ZMIENN=13, 
		CALK=14, ZNAK_DOSL=15, NAPIS_DOSL=16, LINIA_ASEMBLERA=17, ID=18, EOS=19, 
		LINE_COMMENT=20, COMMENT=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ZNACZNIK_DEBUGGERA", "NIC", "STATYCZN", "AUTOMATYCZN", "STAL", "TCALK", 
			"TRZECZYW", "TZNAK", "TREF", "NOWY", "PRZERWIJ", "KONTYNUUJ", "ZMIENN", 
			"CALK", "ZNAK_DOSL", "NAPIS_DOSL", "LINIA_ASEMBLERA", "EscapeSequence", 
			"ID", "OGONKI", "EOS", "LINE_COMMENT", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'rzeczyw'", "'znak'", "'ref'", 
			null, "'przerwij'", null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ZNACZNIK_DEBUGGERA", "NIC", "STATYCZN", "AUTOMATYCZN", "STAL", 
			"TCALK", "TRZECZYW", "TZNAK", "TREF", "NOWY", "PRZERWIJ", "KONTYNUUJ", 
			"ZMIENN", "CALK", "ZNAK_DOSL", "NAPIS_DOSL", "LINIA_ASEMBLERA", "ID", 
			"EOS", "LINE_COMMENT", "COMMENT", "WS"
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


	public Lekserpl(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lekserpl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u010c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3K\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7x\n\7\5\7z\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00aa\n\r\3\16\3\16\3\16\3\16\3\17\6\17\u00b1\n\17\r\17\16\17\u00b2"+
		"\3\20\3\20\3\20\5\20\u00b8\n\20\3\20\3\20\3\21\3\21\3\21\7\21\u00bf\n"+
		"\21\f\21\16\21\u00c2\13\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00ca\n"+
		"\22\f\22\16\22\u00cd\13\22\3\22\5\22\u00d0\n\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\5\24\u00d9\n\24\3\24\3\24\7\24\u00dd\n\24\f\24\16\24\u00e0"+
		"\13\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00ea\n\27\f\27\16"+
		"\27\u00ed\13\27\3\27\3\27\5\27\u00f1\n\27\3\27\5\27\u00f4\n\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\7\30\u00fc\n\30\f\30\16\30\u00ff\13\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\6\31\u0107\n\31\r\31\16\31\u0108\3\31\3\31\69"+
		"\u00cb\u00eb\u00fd\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'\24)\2+\25-\26/\27\61\30\3\2"+
		"\r\3\2>>\5\2ccgg{{\3\2\u0144\u0144\3\2\62;\4\2))^^\4\2$$^^\t\2))^^ddh"+
		"hppttvv\5\2C\\aac|\6\2\62;C\\aac|\t\2\u00d5\u00d5\u00f5\u00f5\u0106\u0109"+
		"\u011a\u011b\u0143\u0146\u015c\u015d\u017b\u017e\5\2\13\f\17\17\"\"\2"+
		"\u011d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2\'\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\3\63\3\2\2\2\5J\3\2\2\2\7L\3\2\2\2\tW\3\2\2\2\13e\3\2\2\2\rl\3\2\2\2"+
		"\17{\3\2\2\2\21\u0083\3\2\2\2\23\u0088\3\2\2\2\25\u008c\3\2\2\2\27\u0092"+
		"\3\2\2\2\31\u00a9\3\2\2\2\33\u00ab\3\2\2\2\35\u00b0\3\2\2\2\37\u00b4\3"+
		"\2\2\2!\u00bb\3\2\2\2#\u00c5\3\2\2\2%\u00d3\3\2\2\2\'\u00d8\3\2\2\2)\u00e1"+
		"\3\2\2\2+\u00e3\3\2\2\2-\u00e5\3\2\2\2/\u00f7\3\2\2\2\61\u0106\3\2\2\2"+
		"\63\64\7>\2\2\64\65\7>\2\2\659\3\2\2\2\668\n\2\2\2\67\66\3\2\2\28;\3\2"+
		"\2\29:\3\2\2\29\67\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7@\2\2=>\7@\2\2>?\3\2"+
		"\2\2?@\b\2\2\2@\4\3\2\2\2AB\7p\2\2BC\7k\2\2CK\7e\2\2DE\7P\2\2EF\7K\2\2"+
		"FK\7E\2\2GH\7P\2\2HI\7k\2\2IK\7e\2\2JA\3\2\2\2JD\3\2\2\2JG\3\2\2\2K\6"+
		"\3\2\2\2LM\7u\2\2MN\7v\2\2NO\7c\2\2OP\7v\2\2PQ\7{\2\2QR\7e\2\2RS\7|\2"+
		"\2ST\7p\2\2TU\3\2\2\2UV\t\3\2\2V\b\3\2\2\2WX\7c\2\2XY\7w\2\2YZ\7v\2\2"+
		"Z[\7q\2\2[\\\7o\2\2\\]\7c\2\2]^\7v\2\2^_\7{\2\2_`\7e\2\2`a\7|\2\2ab\7"+
		"p\2\2bc\3\2\2\2cd\t\3\2\2d\n\3\2\2\2ef\7u\2\2fg\7v\2\2gh\7c\2\2hi\3\2"+
		"\2\2ij\t\4\2\2jk\t\3\2\2k\f\3\2\2\2lm\7e\2\2mn\7c\2\2no\3\2\2\2op\t\4"+
		"\2\2py\7m\2\2qr\7q\2\2rs\7y\2\2st\7k\2\2tu\7v\2\2uw\3\2\2\2vx\t\3\2\2"+
		"wv\3\2\2\2wx\3\2\2\2xz\3\2\2\2yq\3\2\2\2yz\3\2\2\2z\16\3\2\2\2{|\7t\2"+
		"\2|}\7|\2\2}~\7g\2\2~\177\7e\2\2\177\u0080\7|\2\2\u0080\u0081\7{\2\2\u0081"+
		"\u0082\7y\2\2\u0082\20\3\2\2\2\u0083\u0084\7|\2\2\u0084\u0085\7p\2\2\u0085"+
		"\u0086\7c\2\2\u0086\u0087\7m\2\2\u0087\22\3\2\2\2\u0088\u0089\7t\2\2\u0089"+
		"\u008a\7g\2\2\u008a\u008b\7h\2\2\u008b\24\3\2\2\2\u008c\u008d\7p\2\2\u008d"+
		"\u008e\7q\2\2\u008e\u008f\7y\2\2\u008f\u0090\3\2\2\2\u0090\u0091\t\3\2"+
		"\2\u0091\26\3\2\2\2\u0092\u0093\7r\2\2\u0093\u0094\7t\2\2\u0094\u0095"+
		"\7|\2\2\u0095\u0096\7g\2\2\u0096\u0097\7t\2\2\u0097\u0098\7y\2\2\u0098"+
		"\u0099\7k\2\2\u0099\u009a\7l\2\2\u009a\30\3\2\2\2\u009b\u009c\7m\2\2\u009c"+
		"\u009d\7q\2\2\u009d\u009e\7p\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7{\2\2"+
		"\u00a0\u00a1\7p\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7w\2\2\u00a3\u00aa"+
		"\7l\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7|\2\2\u00a7"+
		"\u00a8\7c\2\2\u00a8\u00aa\7f\2\2\u00a9\u009b\3\2\2\2\u00a9\u00a4\3\2\2"+
		"\2\u00aa\32\3\2\2\2\u00ab\u00ac\5\35\17\2\u00ac\u00ad\7\60\2\2\u00ad\u00ae"+
		"\5\35\17\2\u00ae\34\3\2\2\2\u00af\u00b1\t\5\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\36\3\2\2"+
		"\2\u00b4\u00b7\7)\2\2\u00b5\u00b8\5%\23\2\u00b6\u00b8\n\6\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7)\2\2\u00ba"+
		" \3\2\2\2\u00bb\u00c0\7$\2\2\u00bc\u00bf\5%\23\2\u00bd\u00bf\n\7\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c4\7$\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\7&\2\2\u00c6\u00c7\7&\2\2\u00c7"+
		"\u00cb\3\2\2\2\u00c8\u00ca\13\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3"+
		"\2\2\2\u00cb\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00d0\7\17\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\f\2\2\u00d2$\3\2\2\2\u00d3\u00d4"+
		"\7^\2\2\u00d4\u00d5\t\b\2\2\u00d5&\3\2\2\2\u00d6\u00d9\t\t\2\2\u00d7\u00d9"+
		"\5)\25\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00de\3\2\2\2\u00da"+
		"\u00dd\t\n\2\2\u00db\u00dd\5)\25\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2"+
		"\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"(\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\t\13\2\2\u00e2*\3\2\2\2\u00e3"+
		"\u00e4\7=\2\2\u00e4,\3\2\2\2\u00e5\u00e6\7\61\2\2\u00e6\u00e7\7\61\2\2"+
		"\u00e7\u00eb\3\2\2\2\u00e8\u00ea\13\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f3\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00f4\7\2\2\3\u00ef\u00f1\7\17\2\2\u00f0\u00ef\3"+
		"\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\7\f\2\2\u00f3"+
		"\u00ee\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\27"+
		"\3\2\u00f6.\3\2\2\2\u00f7\u00f8\7\61\2\2\u00f8\u00f9\7,\2\2\u00f9\u00fd"+
		"\3\2\2\2\u00fa\u00fc\13\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u0100\u0101\7,\2\2\u0101\u0102\7\61\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\b\30\3\2\u0104\60\3\2\2\2\u0105\u0107\t\f\2\2\u0106\u0105\3\2\2"+
		"\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010b\b\31\3\2\u010b\62\3\2\2\2\26\29Jwy\u00a9\u00b2\u00b7"+
		"\u00be\u00c0\u00cb\u00cf\u00d8\u00dc\u00de\u00eb\u00f0\u00f3\u00fd\u0108"+
		"\4\2\u014f\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}