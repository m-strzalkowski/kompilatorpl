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
		NIC=1, ZMIENN=2, CALK=3, ZNAK_DOSL=4, NAPIS_DOSL=5, LINIA_ASEMBLERA=6, 
		ID=7, EOS=8, LINE_COMMENT=9, COMMENT=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NIC", "ZMIENN", "CALK", "ZNAK_DOSL", "NAPIS_DOSL", "LINIA_ASEMBLERA", 
			"EscapeSequence", "ID", "OGONKI", "EOS", "LINE_COMMENT", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NIC", "ZMIENN", "CALK", "ZNAK_DOSL", "NAPIS_DOSL", "LINIA_ASEMBLERA", 
			"ID", "EOS", "LINE_COMMENT", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u0085\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5"+
		"\2\'\n\2\3\3\3\3\3\3\3\3\3\4\6\4.\n\4\r\4\16\4/\3\5\3\5\3\5\5\5\65\n\5"+
		"\3\5\3\5\3\6\3\6\3\6\7\6<\n\6\f\6\16\6?\13\6\3\6\3\6\3\7\3\7\7\7E\n\7"+
		"\f\7\16\7H\13\7\3\7\5\7K\n\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\5\tT\n\t\3\t"+
		"\3\t\7\tX\n\t\f\t\16\t[\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\7\fe\n"+
		"\f\f\f\16\fh\13\f\3\f\5\fk\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\ru\n"+
		"\r\f\r\16\rx\13\r\3\r\3\r\3\r\3\r\3\r\3\16\6\16\u0080\n\16\r\16\16\16"+
		"\u0081\3\16\3\16\5Ffv\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\t\23\2\25"+
		"\n\27\13\31\f\33\r\3\2\n\3\2\62;\4\2))^^\4\2$$^^\t\2))^^ddhhppttvv\4\2"+
		"C\\c|\6\2\62;C\\aac|\t\2\u00d5\u00d5\u00f5\u00f5\u0106\u0109\u011a\u011b"+
		"\u0143\u0146\u015c\u015d\u017b\u017e\5\2\13\f\17\17\"\"\2\u0091\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\21\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3&\3\2"+
		"\2\2\5(\3\2\2\2\7-\3\2\2\2\t\61\3\2\2\2\138\3\2\2\2\rB\3\2\2\2\17N\3\2"+
		"\2\2\21S\3\2\2\2\23\\\3\2\2\2\25^\3\2\2\2\27`\3\2\2\2\31p\3\2\2\2\33\177"+
		"\3\2\2\2\35\36\7p\2\2\36\37\7k\2\2\37\'\7e\2\2 !\7P\2\2!\"\7K\2\2\"\'"+
		"\7E\2\2#$\7P\2\2$%\7k\2\2%\'\7e\2\2&\35\3\2\2\2& \3\2\2\2&#\3\2\2\2\'"+
		"\4\3\2\2\2()\5\7\4\2)*\7\60\2\2*+\5\7\4\2+\6\3\2\2\2,.\t\2\2\2-,\3\2\2"+
		"\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\b\3\2\2\2\61\64\7)\2\2\62\65\5\17"+
		"\b\2\63\65\n\3\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\67\7)"+
		"\2\2\67\n\3\2\2\28=\7$\2\29<\5\17\b\2:<\n\4\2\2;9\3\2\2\2;:\3\2\2\2<?"+
		"\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7$\2\2A\f\3\2\2\2B"+
		"F\7%\2\2CE\13\2\2\2DC\3\2\2\2EH\3\2\2\2FG\3\2\2\2FD\3\2\2\2GJ\3\2\2\2"+
		"HF\3\2\2\2IK\7\17\2\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\f\2\2M\16\3\2"+
		"\2\2NO\7^\2\2OP\t\5\2\2P\20\3\2\2\2QT\t\6\2\2RT\5\23\n\2SQ\3\2\2\2SR\3"+
		"\2\2\2TY\3\2\2\2UX\t\7\2\2VX\5\23\n\2WU\3\2\2\2WV\3\2\2\2X[\3\2\2\2YW"+
		"\3\2\2\2YZ\3\2\2\2Z\22\3\2\2\2[Y\3\2\2\2\\]\t\b\2\2]\24\3\2\2\2^_\7=\2"+
		"\2_\26\3\2\2\2`a\7\61\2\2ab\7\61\2\2bf\3\2\2\2ce\13\2\2\2dc\3\2\2\2eh"+
		"\3\2\2\2fg\3\2\2\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2ik\7\17\2\2ji\3\2\2\2"+
		"jk\3\2\2\2kl\3\2\2\2lm\7\f\2\2mn\3\2\2\2no\b\f\2\2o\30\3\2\2\2pq\7\61"+
		"\2\2qr\7,\2\2rv\3\2\2\2su\13\2\2\2ts\3\2\2\2ux\3\2\2\2vw\3\2\2\2vt\3\2"+
		"\2\2wy\3\2\2\2xv\3\2\2\2yz\7,\2\2z{\7\61\2\2{|\3\2\2\2|}\b\r\2\2}\32\3"+
		"\2\2\2~\u0080\t\t\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\16\2\2\u0084"+
		"\34\3\2\2\2\21\2&/\64;=FJSWYfjv\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}