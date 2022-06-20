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
		TRZECZYW=7, TZNAK=8, TREF=9, NOWY=10, WYPISZ=11, PRZERWIJ=12, KONTYNUUJ=13, 
		ZMIENN=14, CALK=15, ZNAK_DOSL=16, NAPIS_DOSL=17, LINIA_ASEMBLERA=18, ID=19, 
		EOS=20, LINE_COMMENT=21, COMMENT=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ZNACZNIK_DEBUGGERA", "NIC", "STATYCZN", "AUTOMATYCZN", "STAL", "TCALK", 
			"TRZECZYW", "TZNAK", "TREF", "NOWY", "WYPISZ", "PRZERWIJ", "KONTYNUUJ", 
			"ZMIENN", "CALK", "ZNAK_DOSL", "NAPIS_DOSL", "LINIA_ASEMBLERA", "EscapeSequence", 
			"ID", "OGONKI", "EOS", "LINE_COMMENT", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'rzeczyw'", "'znak'", "'ref'", 
			null, null, "'przerwij'", null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ZNACZNIK_DEBUGGERA", "NIC", "STATYCZN", "AUTOMATYCZN", "STAL", 
			"TCALK", "TRZECZYW", "TZNAK", "TREF", "NOWY", "WYPISZ", "PRZERWIJ", "KONTYNUUJ", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0117\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7z\n\7\5\7|\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5"+
		"\f\u0097\n\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00b5\n\16\3\17\3\17\3\17\3\17\3\20\6\20\u00bc\n\20\r\20\16\20\u00bd"+
		"\3\21\3\21\3\21\5\21\u00c3\n\21\3\21\3\21\3\22\3\22\3\22\7\22\u00ca\n"+
		"\22\f\22\16\22\u00cd\13\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00d5\n"+
		"\23\f\23\16\23\u00d8\13\23\3\23\5\23\u00db\n\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\5\25\u00e4\n\25\3\25\3\25\7\25\u00e8\n\25\f\25\16\25\u00eb"+
		"\13\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00f5\n\30\f\30\16"+
		"\30\u00f8\13\30\3\30\3\30\5\30\u00fc\n\30\3\30\5\30\u00ff\n\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\7\31\u0107\n\31\f\31\16\31\u010a\13\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\6\32\u0112\n\32\r\32\16\32\u0113\3\32\3\32\6;"+
		"\u00d6\u00f6\u0108\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\25+\2-\26/\27\61\30\63"+
		"\31\3\2\r\3\2>>\5\2ccgg{{\3\2\u0144\u0144\3\2\62;\4\2))^^\4\2$$^^\t\2"+
		"))^^ddhhppttvv\5\2C\\aac|\6\2\62;C\\aac|\t\2\u00d5\u00d5\u00f5\u00f5\u0106"+
		"\u0109\u011a\u011b\u0143\u0146\u015c\u015d\u017b\u017e\5\2\13\f\17\17"+
		"\"\"\2\u0129\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\3\65\3\2\2\2\5L\3\2\2\2\7N\3\2\2\2\tY\3\2\2\2\13g\3\2"+
		"\2\2\rn\3\2\2\2\17}\3\2\2\2\21\u0085\3\2\2\2\23\u008a\3\2\2\2\25\u008e"+
		"\3\2\2\2\27\u0096\3\2\2\2\31\u009d\3\2\2\2\33\u00b4\3\2\2\2\35\u00b6\3"+
		"\2\2\2\37\u00bb\3\2\2\2!\u00bf\3\2\2\2#\u00c6\3\2\2\2%\u00d0\3\2\2\2\'"+
		"\u00de\3\2\2\2)\u00e3\3\2\2\2+\u00ec\3\2\2\2-\u00ee\3\2\2\2/\u00f0\3\2"+
		"\2\2\61\u0102\3\2\2\2\63\u0111\3\2\2\2\65\66\7>\2\2\66\67\7>\2\2\67;\3"+
		"\2\2\28:\n\2\2\298\3\2\2\2:=\3\2\2\2;<\3\2\2\2;9\3\2\2\2<>\3\2\2\2=;\3"+
		"\2\2\2>?\7@\2\2?@\7@\2\2@A\3\2\2\2AB\b\2\2\2B\4\3\2\2\2CD\7p\2\2DE\7k"+
		"\2\2EM\7e\2\2FG\7P\2\2GH\7K\2\2HM\7E\2\2IJ\7P\2\2JK\7k\2\2KM\7e\2\2LC"+
		"\3\2\2\2LF\3\2\2\2LI\3\2\2\2M\6\3\2\2\2NO\7u\2\2OP\7v\2\2PQ\7c\2\2QR\7"+
		"v\2\2RS\7{\2\2ST\7e\2\2TU\7|\2\2UV\7p\2\2VW\3\2\2\2WX\t\3\2\2X\b\3\2\2"+
		"\2YZ\7c\2\2Z[\7w\2\2[\\\7v\2\2\\]\7q\2\2]^\7o\2\2^_\7c\2\2_`\7v\2\2`a"+
		"\7{\2\2ab\7e\2\2bc\7|\2\2cd\7p\2\2de\3\2\2\2ef\t\3\2\2f\n\3\2\2\2gh\7"+
		"u\2\2hi\7v\2\2ij\7c\2\2jk\3\2\2\2kl\t\4\2\2lm\t\3\2\2m\f\3\2\2\2no\7e"+
		"\2\2op\7c\2\2pq\3\2\2\2qr\t\4\2\2r{\7m\2\2st\7q\2\2tu\7y\2\2uv\7k\2\2"+
		"vw\7v\2\2wy\3\2\2\2xz\t\3\2\2yx\3\2\2\2yz\3\2\2\2z|\3\2\2\2{s\3\2\2\2"+
		"{|\3\2\2\2|\16\3\2\2\2}~\7t\2\2~\177\7|\2\2\177\u0080\7g\2\2\u0080\u0081"+
		"\7e\2\2\u0081\u0082\7|\2\2\u0082\u0083\7{\2\2\u0083\u0084\7y\2\2\u0084"+
		"\20\3\2\2\2\u0085\u0086\7|\2\2\u0086\u0087\7p\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7m\2\2\u0089\22\3\2\2\2\u008a\u008b\7t\2\2\u008b\u008c\7g\2\2\u008c"+
		"\u008d\7h\2\2\u008d\24\3\2\2\2\u008e\u008f\7p\2\2\u008f\u0090\7q\2\2\u0090"+
		"\u0091\7y\2\2\u0091\u0092\3\2\2\2\u0092\u0093\t\3\2\2\u0093\26\3\2\2\2"+
		"\u0094\u0095\7y\2\2\u0095\u0097\7{\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7r\2\2\u0099\u009a\7k\2\2\u009a"+
		"\u009b\7u\2\2\u009b\u009c\7|\2\2\u009c\30\3\2\2\2\u009d\u009e\7r\2\2\u009e"+
		"\u009f\7t\2\2\u009f\u00a0\7|\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7t\2\2"+
		"\u00a2\u00a3\7y\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7l\2\2\u00a5\32\3\2"+
		"\2\2\u00a6\u00a7\7m\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa"+
		"\7v\2\2\u00aa\u00ab\7{\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7w\2\2\u00ad"+
		"\u00ae\7w\2\2\u00ae\u00b5\7l\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7c\2\2"+
		"\u00b1\u00b2\7|\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b5\7f\2\2\u00b4\u00a6"+
		"\3\2\2\2\u00b4\u00af\3\2\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\5\37\20\2\u00b7"+
		"\u00b8\7\60\2\2\u00b8\u00b9\5\37\20\2\u00b9\36\3\2\2\2\u00ba\u00bc\t\5"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be \3\2\2\2\u00bf\u00c2\7)\2\2\u00c0\u00c3\5\'\24\2"+
		"\u00c1\u00c3\n\6\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c5\7)\2\2\u00c5\"\3\2\2\2\u00c6\u00cb\7$\2\2\u00c7\u00ca"+
		"\5\'\24\2\u00c8\u00ca\n\7\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2"+
		"\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7$\2\2\u00cf$\3\2\2\2\u00d0\u00d1"+
		"\7&\2\2\u00d1\u00d2\7&\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d5\13\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\7\17\2\2\u00da"+
		"\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\f"+
		"\2\2\u00dd&\3\2\2\2\u00de\u00df\7^\2\2\u00df\u00e0\t\b\2\2\u00e0(\3\2"+
		"\2\2\u00e1\u00e4\t\t\2\2\u00e2\u00e4\5+\26\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e9\3\2\2\2\u00e5\u00e8\t\n\2\2\u00e6\u00e8\5+"+
		"\26\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea*\3\2\2\2\u00eb\u00e9\3\2\2\2"+
		"\u00ec\u00ed\t\13\2\2\u00ed,\3\2\2\2\u00ee\u00ef\7=\2\2\u00ef.\3\2\2\2"+
		"\u00f0\u00f1\7\61\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f6\3\2\2\2\u00f3\u00f5"+
		"\13\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f7\3\2\2\2"+
		"\u00f6\u00f4\3\2\2\2\u00f7\u00fe\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00ff"+
		"\7\2\2\3\u00fa\u00fc\7\17\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2"+
		"\u00fc\u00fd\3\2\2\2\u00fd\u00ff\7\f\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fb"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b\30\3\2\u0101\60\3\2\2\2\u0102"+
		"\u0103\7\61\2\2\u0103\u0104\7,\2\2\u0104\u0108\3\2\2\2\u0105\u0107\13"+
		"\2\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0109\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7,"+
		"\2\2\u010c\u010d\7\61\2\2\u010d\u010e\3\2\2\2\u010e\u010f\b\31\3\2\u010f"+
		"\62\3\2\2\2\u0110\u0112\t\f\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2"+
		"\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116"+
		"\b\32\3\2\u0116\64\3\2\2\2\27\2;Ly{\u0096\u00b4\u00bd\u00c2\u00c9\u00cb"+
		"\u00d6\u00da\u00e3\u00e7\u00e9\u00f6\u00fb\u00fe\u0108\u0113\4\2\u014f"+
		"\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}