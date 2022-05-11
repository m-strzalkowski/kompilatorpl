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
		TRZECZYW=7, TZNAK=8, TREF=9, PRZERWIJ=10, KONTYNUUJ=11, ZMIENN=12, CALK=13, 
		ZNAK_DOSL=14, NAPIS_DOSL=15, LINIA_ASEMBLERA=16, ID=17, EOS=18, LINE_COMMENT=19, 
		COMMENT=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ZNACZNIK_DEBUGGERA", "NIC", "STATYCZN", "AUTOMATYCZN", "STAL", "TCALK", 
			"TRZECZYW", "TZNAK", "TREF", "PRZERWIJ", "KONTYNUUJ", "ZMIENN", "CALK", 
			"ZNAK_DOSL", "NAPIS_DOSL", "LINIA_ASEMBLERA", "EscapeSequence", "ID", 
			"OGONKI", "EOS", "LINE_COMMENT", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'rzeczyw'", "'znak'", "'ref'", 
			"'przerwij'", null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ZNACZNIK_DEBUGGERA", "NIC", "STATYCZN", "AUTOMATYCZN", "STAL", 
			"TCALK", "TRZECZYW", "TZNAK", "TREF", "PRZERWIJ", "KONTYNUUJ", "ZMIENN", 
			"CALK", "ZNAK_DOSL", "NAPIS_DOSL", "LINIA_ASEMBLERA", "ID", "EOS", "LINE_COMMENT", 
			"COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0102\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"v\n\7\5\7x\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a2\n\f\3\r\3\r\3\r"+
		"\3\r\3\16\6\16\u00a9\n\16\r\16\16\16\u00aa\3\17\3\17\3\17\5\17\u00b0\n"+
		"\17\3\17\3\17\3\20\3\20\3\20\7\20\u00b7\n\20\f\20\16\20\u00ba\13\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\7\21\u00c2\n\21\f\21\16\21\u00c5\13\21\3"+
		"\21\5\21\u00c8\n\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\5\23\u00d1\n\23"+
		"\3\23\3\23\7\23\u00d5\n\23\f\23\16\23\u00d8\13\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\7\26\u00e2\n\26\f\26\16\26\u00e5\13\26\3\26\5\26"+
		"\u00e8\n\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00f2\n\27\f"+
		"\27\16\27\u00f5\13\27\3\27\3\27\3\27\3\27\3\27\3\30\6\30\u00fd\n\30\r"+
		"\30\16\30\u00fe\3\30\3\30\6\67\u00c3\u00e3\u00f3\2\31\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2%\23"+
		"\'\2)\24+\25-\26/\27\3\2\r\3\2>>\5\2ccgg{{\3\2\u0144\u0144\3\2\62;\4\2"+
		"))^^\4\2$$^^\t\2))^^ddhhppttvv\4\2C\\c|\6\2\62;C\\aac|\t\2\u00d5\u00d5"+
		"\u00f5\u00f5\u0106\u0109\u011a\u011b\u0143\u0146\u015c\u015d\u017b\u017e"+
		"\5\2\13\f\17\17\"\"\2\u0112\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2"+
		"\2\2\3\61\3\2\2\2\5H\3\2\2\2\7J\3\2\2\2\tU\3\2\2\2\13c\3\2\2\2\rj\3\2"+
		"\2\2\17y\3\2\2\2\21\u0081\3\2\2\2\23\u0086\3\2\2\2\25\u008a\3\2\2\2\27"+
		"\u00a1\3\2\2\2\31\u00a3\3\2\2\2\33\u00a8\3\2\2\2\35\u00ac\3\2\2\2\37\u00b3"+
		"\3\2\2\2!\u00bd\3\2\2\2#\u00cb\3\2\2\2%\u00d0\3\2\2\2\'\u00d9\3\2\2\2"+
		")\u00db\3\2\2\2+\u00dd\3\2\2\2-\u00ed\3\2\2\2/\u00fc\3\2\2\2\61\62\7>"+
		"\2\2\62\63\7>\2\2\63\67\3\2\2\2\64\66\n\2\2\2\65\64\3\2\2\2\669\3\2\2"+
		"\2\678\3\2\2\2\67\65\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7@\2\2;<\7@\2\2<"+
		"=\3\2\2\2=>\b\2\2\2>\4\3\2\2\2?@\7p\2\2@A\7k\2\2AI\7e\2\2BC\7P\2\2CD\7"+
		"K\2\2DI\7E\2\2EF\7P\2\2FG\7k\2\2GI\7e\2\2H?\3\2\2\2HB\3\2\2\2HE\3\2\2"+
		"\2I\6\3\2\2\2JK\7u\2\2KL\7v\2\2LM\7c\2\2MN\7v\2\2NO\7{\2\2OP\7e\2\2PQ"+
		"\7|\2\2QR\7p\2\2RS\3\2\2\2ST\t\3\2\2T\b\3\2\2\2UV\7c\2\2VW\7w\2\2WX\7"+
		"v\2\2XY\7q\2\2YZ\7o\2\2Z[\7c\2\2[\\\7v\2\2\\]\7{\2\2]^\7e\2\2^_\7|\2\2"+
		"_`\7p\2\2`a\3\2\2\2ab\t\3\2\2b\n\3\2\2\2cd\7u\2\2de\7v\2\2ef\7c\2\2fg"+
		"\3\2\2\2gh\t\4\2\2hi\t\3\2\2i\f\3\2\2\2jk\7e\2\2kl\7c\2\2lm\3\2\2\2mn"+
		"\t\4\2\2nw\7m\2\2op\7q\2\2pq\7y\2\2qr\7k\2\2rs\7v\2\2su\3\2\2\2tv\t\3"+
		"\2\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2wo\3\2\2\2wx\3\2\2\2x\16\3\2\2\2yz\7"+
		"t\2\2z{\7|\2\2{|\7g\2\2|}\7e\2\2}~\7|\2\2~\177\7{\2\2\177\u0080\7y\2\2"+
		"\u0080\20\3\2\2\2\u0081\u0082\7|\2\2\u0082\u0083\7p\2\2\u0083\u0084\7"+
		"c\2\2\u0084\u0085\7m\2\2\u0085\22\3\2\2\2\u0086\u0087\7t\2\2\u0087\u0088"+
		"\7g\2\2\u0088\u0089\7h\2\2\u0089\24\3\2\2\2\u008a\u008b\7r\2\2\u008b\u008c"+
		"\7t\2\2\u008c\u008d\7|\2\2\u008d\u008e\7g\2\2\u008e\u008f\7t\2\2\u008f"+
		"\u0090\7y\2\2\u0090\u0091\7k\2\2\u0091\u0092\7l\2\2\u0092\26\3\2\2\2\u0093"+
		"\u0094\7m\2\2\u0094\u0095\7q\2\2\u0095\u0096\7p\2\2\u0096\u0097\7v\2\2"+
		"\u0097\u0098\7{\2\2\u0098\u0099\7p\2\2\u0099\u009a\7w\2\2\u009a\u009b"+
		"\7w\2\2\u009b\u00a2\7l\2\2\u009c\u009d\7p\2\2\u009d\u009e\7c\2\2\u009e"+
		"\u009f\7|\2\2\u009f\u00a0\7c\2\2\u00a0\u00a2\7f\2\2\u00a1\u0093\3\2\2"+
		"\2\u00a1\u009c\3\2\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\5\33\16\2\u00a4\u00a5"+
		"\7\60\2\2\u00a5\u00a6\5\33\16\2\u00a6\32\3\2\2\2\u00a7\u00a9\t\5\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\34\3\2\2\2\u00ac\u00af\7)\2\2\u00ad\u00b0\5#\22\2\u00ae\u00b0"+
		"\n\6\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\7)\2\2\u00b2\36\3\2\2\2\u00b3\u00b8\7$\2\2\u00b4\u00b7\5#\22\2"+
		"\u00b5\u00b7\n\7\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bc\7$\2\2\u00bc \3\2\2\2\u00bd\u00be\7&\2\2\u00be"+
		"\u00bf\7&\2\2\u00bf\u00c3\3\2\2\2\u00c0\u00c2\13\2\2\2\u00c1\u00c0\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\7\17\2\2\u00c7\u00c6\3"+
		"\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\f\2\2\u00ca"+
		"\"\3\2\2\2\u00cb\u00cc\7^\2\2\u00cc\u00cd\t\b\2\2\u00cd$\3\2\2\2\u00ce"+
		"\u00d1\t\t\2\2\u00cf\u00d1\5\'\24\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3"+
		"\2\2\2\u00d1\u00d6\3\2\2\2\u00d2\u00d5\t\n\2\2\u00d3\u00d5\5\'\24\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7&\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da"+
		"\t\13\2\2\u00da(\3\2\2\2\u00db\u00dc\7=\2\2\u00dc*\3\2\2\2\u00dd\u00de"+
		"\7\61\2\2\u00de\u00df\7\61\2\2\u00df\u00e3\3\2\2\2\u00e0\u00e2\13\2\2"+
		"\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\7\17\2\2"+
		"\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea"+
		"\7\f\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b\26\3\2\u00ec,\3\2\2\2\u00ed"+
		"\u00ee\7\61\2\2\u00ee\u00ef\7,\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f2\13"+
		"\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7,"+
		"\2\2\u00f7\u00f8\7\61\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\b\27\3\2\u00fa"+
		".\3\2\2\2\u00fb\u00fd\t\f\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2"+
		"\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101"+
		"\b\30\3\2\u0101\60\3\2\2\2\25\2\67Huw\u00a1\u00aa\u00af\u00b6\u00b8\u00c3"+
		"\u00c7\u00d0\u00d4\u00d6\u00e3\u00e7\u00f3\u00fe\4\2\u014f\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}