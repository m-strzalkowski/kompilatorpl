// Generated from C:/Users/mastr/Documents/MS/STUDIA/kompilatory/kompilatorpl/kompilator0/src/pl/plpl\plpl.g4 by ANTLR 4.9.2
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
public class plplLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, NIC=47, ZMIENN=48, CALK=49, ZNAK_DOSL=50, NAPIS_DOSL=51, LINIA_ASEMBLERA=52, 
		ID=53, EOS=54, LINE_COMMENT=55, COMMENT=56, WS=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "NIC", "ZMIENN", "CALK", 
			"ZNAK_DOSL", "NAPIS_DOSL", "LINIA_ASEMBLERA", "EscapeSequence", "ID", 
			"OGONKI", "EOS", "LINE_COMMENT", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'procedura'", "'->'", "'{'", "'}'", "'typ'", "'='", "','", "'je\u015Bli'", 
			"'('", "')'", "'inaczej'", "'dop\u00F3ki'", "'zwr\u00F3\u0107'", "'zacznij'", 
			"'sko\u0144cz'", "'przerwij'", "'kontynuuj'", "'@'", "'!'", "'-'", "'+'", 
			"'^'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'=='", "'!='", "'>'", "'<'", 
			"'<='", "'>='", "'['", "']'", "'.'", "'^='", "'*='", "'/='", "'%='", 
			"'+='", "'-='", "'[]'", "'ca\u0142k'", "'rzeczyw'", "'znak'", null, null, 
			null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "NIC", 
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


	public plplLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "plpl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u018e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3"+
		")\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0130"+
		"\n\60\3\61\3\61\3\61\3\61\3\62\6\62\u0137\n\62\r\62\16\62\u0138\3\63\3"+
		"\63\3\63\5\63\u013e\n\63\3\63\3\63\3\64\3\64\3\64\7\64\u0145\n\64\f\64"+
		"\16\64\u0148\13\64\3\64\3\64\3\65\3\65\7\65\u014e\n\65\f\65\16\65\u0151"+
		"\13\65\3\65\5\65\u0154\n\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\5\67\u015d"+
		"\n\67\3\67\3\67\7\67\u0161\n\67\f\67\16\67\u0164\13\67\38\38\39\39\3:"+
		"\3:\3:\3:\7:\u016e\n:\f:\16:\u0171\13:\3:\5:\u0174\n:\3:\3:\3:\3:\3;\3"+
		";\3;\3;\7;\u017e\n;\f;\16;\u0181\13;\3;\3;\3;\3;\3;\3<\6<\u0189\n<\r<"+
		"\16<\u018a\3<\3<\5\u014f\u016f\u017f\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\2m\67o\2q8s9u:w;\3\2\n\3\2\62;\4\2"+
		"))^^\4\2$$^^\t\2))^^ddhhppttvv\4\2C\\c|\6\2\62;C\\aac|\t\2\u00d5\u00d5"+
		"\u00f5\u00f5\u0106\u0109\u011a\u011b\u0143\u0146\u015c\u015d\u017b\u017e"+
		"\5\2\13\f\17\17\"\"\2\u019a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2m\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2"+
		"\2\2\5\u0083\3\2\2\2\7\u0086\3\2\2\2\t\u0088\3\2\2\2\13\u008a\3\2\2\2"+
		"\r\u008e\3\2\2\2\17\u0090\3\2\2\2\21\u0092\3\2\2\2\23\u0098\3\2\2\2\25"+
		"\u009a\3\2\2\2\27\u009c\3\2\2\2\31\u00a4\3\2\2\2\33\u00ab\3\2\2\2\35\u00b1"+
		"\3\2\2\2\37\u00b9\3\2\2\2!\u00c0\3\2\2\2#\u00c9\3\2\2\2%\u00d3\3\2\2\2"+
		"\'\u00d5\3\2\2\2)\u00d7\3\2\2\2+\u00d9\3\2\2\2-\u00db\3\2\2\2/\u00dd\3"+
		"\2\2\2\61\u00df\3\2\2\2\63\u00e1\3\2\2\2\65\u00e3\3\2\2\2\67\u00e6\3\2"+
		"\2\29\u00e9\3\2\2\2;\u00ec\3\2\2\2=\u00ef\3\2\2\2?\u00f1\3\2\2\2A\u00f3"+
		"\3\2\2\2C\u00f6\3\2\2\2E\u00f9\3\2\2\2G\u00fb\3\2\2\2I\u00fd\3\2\2\2K"+
		"\u00ff\3\2\2\2M\u0102\3\2\2\2O\u0105\3\2\2\2Q\u0108\3\2\2\2S\u010b\3\2"+
		"\2\2U\u010e\3\2\2\2W\u0111\3\2\2\2Y\u0114\3\2\2\2[\u0119\3\2\2\2]\u0121"+
		"\3\2\2\2_\u012f\3\2\2\2a\u0131\3\2\2\2c\u0136\3\2\2\2e\u013a\3\2\2\2g"+
		"\u0141\3\2\2\2i\u014b\3\2\2\2k\u0157\3\2\2\2m\u015c\3\2\2\2o\u0165\3\2"+
		"\2\2q\u0167\3\2\2\2s\u0169\3\2\2\2u\u0179\3\2\2\2w\u0188\3\2\2\2yz\7r"+
		"\2\2z{\7t\2\2{|\7q\2\2|}\7e\2\2}~\7g\2\2~\177\7f\2\2\177\u0080\7w\2\2"+
		"\u0080\u0081\7t\2\2\u0081\u0082\7c\2\2\u0082\4\3\2\2\2\u0083\u0084\7/"+
		"\2\2\u0084\u0085\7@\2\2\u0085\6\3\2\2\2\u0086\u0087\7}\2\2\u0087\b\3\2"+
		"\2\2\u0088\u0089\7\177\2\2\u0089\n\3\2\2\2\u008a\u008b\7v\2\2\u008b\u008c"+
		"\7{\2\2\u008c\u008d\7r\2\2\u008d\f\3\2\2\2\u008e\u008f\7?\2\2\u008f\16"+
		"\3\2\2\2\u0090\u0091\7.\2\2\u0091\20\3\2\2\2\u0092\u0093\7l\2\2\u0093"+
		"\u0094\7g\2\2\u0094\u0095\7\u015d\2\2\u0095\u0096\7n\2\2\u0096\u0097\7"+
		"k\2\2\u0097\22\3\2\2\2\u0098\u0099\7*\2\2\u0099\24\3\2\2\2\u009a\u009b"+
		"\7+\2\2\u009b\26\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f"+
		"\7c\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7|\2\2\u00a1\u00a2\7g\2\2\u00a2"+
		"\u00a3\7l\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7q\2\2\u00a6"+
		"\u00a7\7r\2\2\u00a7\u00a8\7\u00f5\2\2\u00a8\u00a9\7m\2\2\u00a9\u00aa\7"+
		"k\2\2\u00aa\32\3\2\2\2\u00ab\u00ac\7|\2\2\u00ac\u00ad\7y\2\2\u00ad\u00ae"+
		"\7t\2\2\u00ae\u00af\7\u00f5\2\2\u00af\u00b0\7\u0109\2\2\u00b0\34\3\2\2"+
		"\2\u00b1\u00b2\7|\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5"+
		"\7|\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7l\2\2\u00b8"+
		"\36\3\2\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7m\2\2\u00bb\u00bc\7q\2\2\u00bc"+
		"\u00bd\7\u0146\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7|\2\2\u00bf \3\2\2"+
		"\2\u00c0\u00c1\7r\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7|\2\2\u00c3\u00c4"+
		"\7g\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7y\2\2\u00c6\u00c7\7k\2\2\u00c7"+
		"\u00c8\7l\2\2\u00c8\"\3\2\2\2\u00c9\u00ca\7m\2\2\u00ca\u00cb\7q\2\2\u00cb"+
		"\u00cc\7p\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7{\2\2\u00ce\u00cf\7p\2\2"+
		"\u00cf\u00d0\7w\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7l\2\2\u00d2$\3\2\2"+
		"\2\u00d3\u00d4\7B\2\2\u00d4&\3\2\2\2\u00d5\u00d6\7#\2\2\u00d6(\3\2\2\2"+
		"\u00d7\u00d8\7/\2\2\u00d8*\3\2\2\2\u00d9\u00da\7-\2\2\u00da,\3\2\2\2\u00db"+
		"\u00dc\7`\2\2\u00dc.\3\2\2\2\u00dd\u00de\7,\2\2\u00de\60\3\2\2\2\u00df"+
		"\u00e0\7\61\2\2\u00e0\62\3\2\2\2\u00e1\u00e2\7\'\2\2\u00e2\64\3\2\2\2"+
		"\u00e3\u00e4\7(\2\2\u00e4\u00e5\7(\2\2\u00e5\66\3\2\2\2\u00e6\u00e7\7"+
		"~\2\2\u00e7\u00e8\7~\2\2\u00e88\3\2\2\2\u00e9\u00ea\7?\2\2\u00ea\u00eb"+
		"\7?\2\2\u00eb:\3\2\2\2\u00ec\u00ed\7#\2\2\u00ed\u00ee\7?\2\2\u00ee<\3"+
		"\2\2\2\u00ef\u00f0\7@\2\2\u00f0>\3\2\2\2\u00f1\u00f2\7>\2\2\u00f2@\3\2"+
		"\2\2\u00f3\u00f4\7>\2\2\u00f4\u00f5\7?\2\2\u00f5B\3\2\2\2\u00f6\u00f7"+
		"\7@\2\2\u00f7\u00f8\7?\2\2\u00f8D\3\2\2\2\u00f9\u00fa\7]\2\2\u00faF\3"+
		"\2\2\2\u00fb\u00fc\7_\2\2\u00fcH\3\2\2\2\u00fd\u00fe\7\60\2\2\u00feJ\3"+
		"\2\2\2\u00ff\u0100\7`\2\2\u0100\u0101\7?\2\2\u0101L\3\2\2\2\u0102\u0103"+
		"\7,\2\2\u0103\u0104\7?\2\2\u0104N\3\2\2\2\u0105\u0106\7\61\2\2\u0106\u0107"+
		"\7?\2\2\u0107P\3\2\2\2\u0108\u0109\7\'\2\2\u0109\u010a\7?\2\2\u010aR\3"+
		"\2\2\2\u010b\u010c\7-\2\2\u010c\u010d\7?\2\2\u010dT\3\2\2\2\u010e\u010f"+
		"\7/\2\2\u010f\u0110\7?\2\2\u0110V\3\2\2\2\u0111\u0112\7]\2\2\u0112\u0113"+
		"\7_\2\2\u0113X\3\2\2\2\u0114\u0115\7e\2\2\u0115\u0116\7c\2\2\u0116\u0117"+
		"\7\u0144\2\2\u0117\u0118\7m\2\2\u0118Z\3\2\2\2\u0119\u011a\7t\2\2\u011a"+
		"\u011b\7|\2\2\u011b\u011c\7g\2\2\u011c\u011d\7e\2\2\u011d\u011e\7|\2\2"+
		"\u011e\u011f\7{\2\2\u011f\u0120\7y\2\2\u0120\\\3\2\2\2\u0121\u0122\7|"+
		"\2\2\u0122\u0123\7p\2\2\u0123\u0124\7c\2\2\u0124\u0125\7m\2\2\u0125^\3"+
		"\2\2\2\u0126\u0127\7p\2\2\u0127\u0128\7k\2\2\u0128\u0130\7e\2\2\u0129"+
		"\u012a\7P\2\2\u012a\u012b\7K\2\2\u012b\u0130\7E\2\2\u012c\u012d\7P\2\2"+
		"\u012d\u012e\7k\2\2\u012e\u0130\7e\2\2\u012f\u0126\3\2\2\2\u012f\u0129"+
		"\3\2\2\2\u012f\u012c\3\2\2\2\u0130`\3\2\2\2\u0131\u0132\5c\62\2\u0132"+
		"\u0133\7\60\2\2\u0133\u0134\5c\62\2\u0134b\3\2\2\2\u0135\u0137\t\2\2\2"+
		"\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139d\3\2\2\2\u013a\u013d\7)\2\2\u013b\u013e\5k\66\2\u013c\u013e"+
		"\n\3\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\7)\2\2\u0140f\3\2\2\2\u0141\u0146\7$\2\2\u0142\u0145\5k\66\2\u0143"+
		"\u0145\n\4\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014a\7$\2\2\u014ah\3\2\2\2\u014b\u014f\7%\2\2\u014c"+
		"\u014e\13\2\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u0150\3"+
		"\2\2\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0152"+
		"\u0154\7\17\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3"+
		"\2\2\2\u0155\u0156\7\f\2\2\u0156j\3\2\2\2\u0157\u0158\7^\2\2\u0158\u0159"+
		"\t\5\2\2\u0159l\3\2\2\2\u015a\u015d\t\6\2\2\u015b\u015d\5o8\2\u015c\u015a"+
		"\3\2\2\2\u015c\u015b\3\2\2\2\u015d\u0162\3\2\2\2\u015e\u0161\t\7\2\2\u015f"+
		"\u0161\5o8\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2"+
		"\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163n\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0165\u0166\t\b\2\2\u0166p\3\2\2\2\u0167\u0168\7=\2\2\u0168r"+
		"\3\2\2\2\u0169\u016a\7\61\2\2\u016a\u016b\7\61\2\2\u016b\u016f\3\2\2\2"+
		"\u016c\u016e\13\2\2\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u0170"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u0174\7\17\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3"+
		"\2\2\2\u0175\u0176\7\f\2\2\u0176\u0177\3\2\2\2\u0177\u0178\b:\2\2\u0178"+
		"t\3\2\2\2\u0179\u017a\7\61\2\2\u017a\u017b\7,\2\2\u017b\u017f\3\2\2\2"+
		"\u017c\u017e\13\2\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182"+
		"\u0183\7,\2\2\u0183\u0184\7\61\2\2\u0184\u0185\3\2\2\2\u0185\u0186\b;"+
		"\2\2\u0186v\3\2\2\2\u0187\u0189\t\t\2\2\u0188\u0187\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\b<\2\2\u018dx\3\2\2\2\21\2\u012f\u0138\u013d\u0144\u0146\u014f"+
		"\u0153\u015c\u0160\u0162\u016f\u0173\u017f\u018a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}