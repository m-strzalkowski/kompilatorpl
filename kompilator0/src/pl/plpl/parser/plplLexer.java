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
		T__45=46, NIC=47, ZMIENN=48, CALK=49, ZNAK_DOSL=50, NAPIS_DOSL=51, ID=52, 
		EOS=53, LINE_COMMENT=54, COMMENT=55, WS=56;
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
			"ZNAK_DOSL", "NAPIS_DOSL", "EscapeSequence", "ID", "OGONKI", "EOS", "LINE_COMMENT", 
			"COMMENT", "WS"
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
			null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "NIC", 
			"ZMIENN", "CALK", "ZNAK_DOSL", "NAPIS_DOSL", "ID", "EOS", "LINE_COMMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0180\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3"+
		"*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u012e\n\60\3"+
		"\61\3\61\3\61\3\61\3\62\6\62\u0135\n\62\r\62\16\62\u0136\3\63\3\63\3\63"+
		"\5\63\u013c\n\63\3\63\3\63\3\64\3\64\3\64\7\64\u0143\n\64\f\64\16\64\u0146"+
		"\13\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\5\66\u014f\n\66\3\66\3\66\7"+
		"\66\u0153\n\66\f\66\16\66\u0156\13\66\3\67\3\67\38\38\39\39\39\39\79\u0160"+
		"\n9\f9\169\u0163\139\39\59\u0166\n9\39\39\39\39\3:\3:\3:\3:\7:\u0170\n"+
		":\f:\16:\u0173\13:\3:\3:\3:\3:\3:\3;\6;\u017b\n;\r;\16;\u017c\3;\3;\4"+
		"\u0161\u0171\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\2k\66m\2o\67q8s9u:\3\2\n\3\2\62;\4\2))^^\4\2$$^^\t\2))^^ddhhppt"+
		"tvv\4\2C\\c|\6\2\62;C\\aac|\t\2\u00d5\u00d5\u00f5\u00f5\u0106\u0109\u011a"+
		"\u011b\u0143\u0146\u015c\u015d\u017b\u017e\5\2\13\f\17\17\"\"\2\u018a"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2k\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5\u0081\3\2\2\2\7\u0084\3\2\2\2\t"+
		"\u0086\3\2\2\2\13\u0088\3\2\2\2\r\u008c\3\2\2\2\17\u008e\3\2\2\2\21\u0090"+
		"\3\2\2\2\23\u0096\3\2\2\2\25\u0098\3\2\2\2\27\u009a\3\2\2\2\31\u00a2\3"+
		"\2\2\2\33\u00a9\3\2\2\2\35\u00af\3\2\2\2\37\u00b7\3\2\2\2!\u00be\3\2\2"+
		"\2#\u00c7\3\2\2\2%\u00d1\3\2\2\2\'\u00d3\3\2\2\2)\u00d5\3\2\2\2+\u00d7"+
		"\3\2\2\2-\u00d9\3\2\2\2/\u00db\3\2\2\2\61\u00dd\3\2\2\2\63\u00df\3\2\2"+
		"\2\65\u00e1\3\2\2\2\67\u00e4\3\2\2\29\u00e7\3\2\2\2;\u00ea\3\2\2\2=\u00ed"+
		"\3\2\2\2?\u00ef\3\2\2\2A\u00f1\3\2\2\2C\u00f4\3\2\2\2E\u00f7\3\2\2\2G"+
		"\u00f9\3\2\2\2I\u00fb\3\2\2\2K\u00fd\3\2\2\2M\u0100\3\2\2\2O\u0103\3\2"+
		"\2\2Q\u0106\3\2\2\2S\u0109\3\2\2\2U\u010c\3\2\2\2W\u010f\3\2\2\2Y\u0112"+
		"\3\2\2\2[\u0117\3\2\2\2]\u011f\3\2\2\2_\u012d\3\2\2\2a\u012f\3\2\2\2c"+
		"\u0134\3\2\2\2e\u0138\3\2\2\2g\u013f\3\2\2\2i\u0149\3\2\2\2k\u014e\3\2"+
		"\2\2m\u0157\3\2\2\2o\u0159\3\2\2\2q\u015b\3\2\2\2s\u016b\3\2\2\2u\u017a"+
		"\3\2\2\2wx\7r\2\2xy\7t\2\2yz\7q\2\2z{\7e\2\2{|\7g\2\2|}\7f\2\2}~\7w\2"+
		"\2~\177\7t\2\2\177\u0080\7c\2\2\u0080\4\3\2\2\2\u0081\u0082\7/\2\2\u0082"+
		"\u0083\7@\2\2\u0083\6\3\2\2\2\u0084\u0085\7}\2\2\u0085\b\3\2\2\2\u0086"+
		"\u0087\7\177\2\2\u0087\n\3\2\2\2\u0088\u0089\7v\2\2\u0089\u008a\7{\2\2"+
		"\u008a\u008b\7r\2\2\u008b\f\3\2\2\2\u008c\u008d\7?\2\2\u008d\16\3\2\2"+
		"\2\u008e\u008f\7.\2\2\u008f\20\3\2\2\2\u0090\u0091\7l\2\2\u0091\u0092"+
		"\7g\2\2\u0092\u0093\7\u015d\2\2\u0093\u0094\7n\2\2\u0094\u0095\7k\2\2"+
		"\u0095\22\3\2\2\2\u0096\u0097\7*\2\2\u0097\24\3\2\2\2\u0098\u0099\7+\2"+
		"\2\u0099\26\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c\u009d"+
		"\7c\2\2\u009d\u009e\7e\2\2\u009e\u009f\7|\2\2\u009f\u00a0\7g\2\2\u00a0"+
		"\u00a1\7l\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7f\2\2\u00a3\u00a4\7q\2\2\u00a4"+
		"\u00a5\7r\2\2\u00a5\u00a6\7\u00f5\2\2\u00a6\u00a7\7m\2\2\u00a7\u00a8\7"+
		"k\2\2\u00a8\32\3\2\2\2\u00a9\u00aa\7|\2\2\u00aa\u00ab\7y\2\2\u00ab\u00ac"+
		"\7t\2\2\u00ac\u00ad\7\u00f5\2\2\u00ad\u00ae\7\u0109\2\2\u00ae\34\3\2\2"+
		"\2\u00af\u00b0\7|\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3"+
		"\7|\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7l\2\2\u00b6"+
		"\36\3\2\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7m\2\2\u00b9\u00ba\7q\2\2\u00ba"+
		"\u00bb\7\u0146\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7|\2\2\u00bd \3\2\2"+
		"\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7|\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7y\2\2\u00c4\u00c5\7k\2\2\u00c5"+
		"\u00c6\7l\2\2\u00c6\"\3\2\2\2\u00c7\u00c8\7m\2\2\u00c8\u00c9\7q\2\2\u00c9"+
		"\u00ca\7p\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7{\2\2\u00cc\u00cd\7p\2\2"+
		"\u00cd\u00ce\7w\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7l\2\2\u00d0$\3\2\2"+
		"\2\u00d1\u00d2\7B\2\2\u00d2&\3\2\2\2\u00d3\u00d4\7#\2\2\u00d4(\3\2\2\2"+
		"\u00d5\u00d6\7/\2\2\u00d6*\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8,\3\2\2\2\u00d9"+
		"\u00da\7`\2\2\u00da.\3\2\2\2\u00db\u00dc\7,\2\2\u00dc\60\3\2\2\2\u00dd"+
		"\u00de\7\61\2\2\u00de\62\3\2\2\2\u00df\u00e0\7\'\2\2\u00e0\64\3\2\2\2"+
		"\u00e1\u00e2\7(\2\2\u00e2\u00e3\7(\2\2\u00e3\66\3\2\2\2\u00e4\u00e5\7"+
		"~\2\2\u00e5\u00e6\7~\2\2\u00e68\3\2\2\2\u00e7\u00e8\7?\2\2\u00e8\u00e9"+
		"\7?\2\2\u00e9:\3\2\2\2\u00ea\u00eb\7#\2\2\u00eb\u00ec\7?\2\2\u00ec<\3"+
		"\2\2\2\u00ed\u00ee\7@\2\2\u00ee>\3\2\2\2\u00ef\u00f0\7>\2\2\u00f0@\3\2"+
		"\2\2\u00f1\u00f2\7>\2\2\u00f2\u00f3\7?\2\2\u00f3B\3\2\2\2\u00f4\u00f5"+
		"\7@\2\2\u00f5\u00f6\7?\2\2\u00f6D\3\2\2\2\u00f7\u00f8\7]\2\2\u00f8F\3"+
		"\2\2\2\u00f9\u00fa\7_\2\2\u00faH\3\2\2\2\u00fb\u00fc\7\60\2\2\u00fcJ\3"+
		"\2\2\2\u00fd\u00fe\7`\2\2\u00fe\u00ff\7?\2\2\u00ffL\3\2\2\2\u0100\u0101"+
		"\7,\2\2\u0101\u0102\7?\2\2\u0102N\3\2\2\2\u0103\u0104\7\61\2\2\u0104\u0105"+
		"\7?\2\2\u0105P\3\2\2\2\u0106\u0107\7\'\2\2\u0107\u0108\7?\2\2\u0108R\3"+
		"\2\2\2\u0109\u010a\7-\2\2\u010a\u010b\7?\2\2\u010bT\3\2\2\2\u010c\u010d"+
		"\7/\2\2\u010d\u010e\7?\2\2\u010eV\3\2\2\2\u010f\u0110\7]\2\2\u0110\u0111"+
		"\7_\2\2\u0111X\3\2\2\2\u0112\u0113\7e\2\2\u0113\u0114\7c\2\2\u0114\u0115"+
		"\7\u0144\2\2\u0115\u0116\7m\2\2\u0116Z\3\2\2\2\u0117\u0118\7t\2\2\u0118"+
		"\u0119\7|\2\2\u0119\u011a\7g\2\2\u011a\u011b\7e\2\2\u011b\u011c\7|\2\2"+
		"\u011c\u011d\7{\2\2\u011d\u011e\7y\2\2\u011e\\\3\2\2\2\u011f\u0120\7|"+
		"\2\2\u0120\u0121\7p\2\2\u0121\u0122\7c\2\2\u0122\u0123\7m\2\2\u0123^\3"+
		"\2\2\2\u0124\u0125\7p\2\2\u0125\u0126\7k\2\2\u0126\u012e\7e\2\2\u0127"+
		"\u0128\7P\2\2\u0128\u0129\7K\2\2\u0129\u012e\7E\2\2\u012a\u012b\7P\2\2"+
		"\u012b\u012c\7k\2\2\u012c\u012e\7e\2\2\u012d\u0124\3\2\2\2\u012d\u0127"+
		"\3\2\2\2\u012d\u012a\3\2\2\2\u012e`\3\2\2\2\u012f\u0130\5c\62\2\u0130"+
		"\u0131\7\60\2\2\u0131\u0132\5c\62\2\u0132b\3\2\2\2\u0133\u0135\t\2\2\2"+
		"\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137d\3\2\2\2\u0138\u013b\7)\2\2\u0139\u013c\5i\65\2\u013a\u013c"+
		"\n\3\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\7)\2\2\u013ef\3\2\2\2\u013f\u0144\7$\2\2\u0140\u0143\5i\65\2\u0141"+
		"\u0143\n\4\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2"+
		"\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0147\u0148\7$\2\2\u0148h\3\2\2\2\u0149\u014a\7^\2\2\u014a"+
		"\u014b\t\5\2\2\u014bj\3\2\2\2\u014c\u014f\t\6\2\2\u014d\u014f\5m\67\2"+
		"\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0154\3\2\2\2\u0150\u0153"+
		"\t\7\2\2\u0151\u0153\5m\67\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153"+
		"\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155l\3\2\2\2"+
		"\u0156\u0154\3\2\2\2\u0157\u0158\t\b\2\2\u0158n\3\2\2\2\u0159\u015a\7"+
		"=\2\2\u015ap\3\2\2\2\u015b\u015c\7\61\2\2\u015c\u015d\7\61\2\2\u015d\u0161"+
		"\3\2\2\2\u015e\u0160\13\2\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2"+
		"\u0161\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0164\u0166\7\17\2\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2"+
		"\u0166\u0167\3\2\2\2\u0167\u0168\7\f\2\2\u0168\u0169\3\2\2\2\u0169\u016a"+
		"\b9\2\2\u016ar\3\2\2\2\u016b\u016c\7\61\2\2\u016c\u016d\7,\2\2\u016d\u0171"+
		"\3\2\2\2\u016e\u0170\13\2\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2"+
		"\u0171\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0175\7,\2\2\u0175\u0176\7\61\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0178\b:\2\2\u0178t\3\2\2\2\u0179\u017b\t\t\2\2\u017a\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u017f\b;\2\2\u017fv\3\2\2\2\17\2\u012d\u0136\u013b\u0142\u0144"+
		"\u014e\u0152\u0154\u0161\u0165\u0171\u017c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}