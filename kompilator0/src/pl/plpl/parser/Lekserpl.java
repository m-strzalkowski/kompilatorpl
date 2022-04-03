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
		NIC=1, ZMIENN=2, CALK=3, ZNAK_DOSL=4, NAPIS_DOSL=5, ID=6, EOS=7, LINE_COMMENT=8, 
		COMMENT=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NIC", "ZMIENN", "CALK", "ZNAK_DOSL", "NAPIS_DOSL", "EscapeSequence", 
			"ID", "OGONKI", "EOS", "LINE_COMMENT", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NIC", "ZMIENN", "CALK", "ZNAK_DOSL", "NAPIS_DOSL", "ID", "EOS", 
			"LINE_COMMENT", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fw\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2%\n\2\3\3\3"+
		"\3\3\3\3\3\3\4\6\4,\n\4\r\4\16\4-\3\5\3\5\3\5\5\5\63\n\5\3\5\3\5\3\6\3"+
		"\6\3\6\7\6:\n\6\f\6\16\6=\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\5\bF\n\b\3"+
		"\b\3\b\7\bJ\n\b\f\b\16\bM\13\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\7\13"+
		"W\n\13\f\13\16\13Z\13\13\3\13\5\13]\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\7\fg\n\f\f\f\16\fj\13\f\3\f\3\f\3\f\3\f\3\f\3\r\6\rr\n\r\r\r\16"+
		"\rs\3\r\3\r\4Xh\2\16\3\3\5\4\7\5\t\6\13\7\r\2\17\b\21\2\23\t\25\n\27\13"+
		"\31\f\3\2\n\3\2\62;\4\2))^^\4\2$$^^\t\2))^^ddhhppttvv\4\2C\\c|\6\2\62"+
		";C\\aac|\t\2\u00d5\u00d5\u00f5\u00f5\u0106\u0109\u011a\u011b\u0143\u0146"+
		"\u015c\u015d\u017b\u017e\5\2\13\f\17\17\"\"\2\u0081\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3$\3\2\2\2\5&\3\2\2\2\7+\3\2\2"+
		"\2\t/\3\2\2\2\13\66\3\2\2\2\r@\3\2\2\2\17E\3\2\2\2\21N\3\2\2\2\23P\3\2"+
		"\2\2\25R\3\2\2\2\27b\3\2\2\2\31q\3\2\2\2\33\34\7p\2\2\34\35\7k\2\2\35"+
		"%\7e\2\2\36\37\7P\2\2\37 \7K\2\2 %\7E\2\2!\"\7P\2\2\"#\7k\2\2#%\7e\2\2"+
		"$\33\3\2\2\2$\36\3\2\2\2$!\3\2\2\2%\4\3\2\2\2&\'\5\7\4\2\'(\7\60\2\2("+
		")\5\7\4\2)\6\3\2\2\2*,\t\2\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2"+
		".\b\3\2\2\2/\62\7)\2\2\60\63\5\r\7\2\61\63\n\3\2\2\62\60\3\2\2\2\62\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\65\7)\2\2\65\n\3\2\2\2\66;\7$\2\2\67:\5\r\7"+
		"\28:\n\4\2\29\67\3\2\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2"+
		"\2\2=;\3\2\2\2>?\7$\2\2?\f\3\2\2\2@A\7^\2\2AB\t\5\2\2B\16\3\2\2\2CF\t"+
		"\6\2\2DF\5\21\t\2EC\3\2\2\2ED\3\2\2\2FK\3\2\2\2GJ\t\7\2\2HJ\5\21\t\2I"+
		"G\3\2\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\20\3\2\2\2MK\3\2\2"+
		"\2NO\t\b\2\2O\22\3\2\2\2PQ\7=\2\2Q\24\3\2\2\2RS\7\61\2\2ST\7\61\2\2TX"+
		"\3\2\2\2UW\13\2\2\2VU\3\2\2\2WZ\3\2\2\2XY\3\2\2\2XV\3\2\2\2Y\\\3\2\2\2"+
		"ZX\3\2\2\2[]\7\17\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\f\2\2_`\3\2"+
		"\2\2`a\b\13\2\2a\26\3\2\2\2bc\7\61\2\2cd\7,\2\2dh\3\2\2\2eg\13\2\2\2f"+
		"e\3\2\2\2gj\3\2\2\2hi\3\2\2\2hf\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7,\2\2l"+
		"m\7\61\2\2mn\3\2\2\2no\b\f\2\2o\30\3\2\2\2pr\t\t\2\2qp\3\2\2\2rs\3\2\2"+
		"\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\b\r\2\2v\32\3\2\2\2\17\2$-\629;EIK"+
		"X\\hs\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}