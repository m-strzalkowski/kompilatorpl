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
		SEPARATOR_ZNACZNIKOWY=6, WSZ=7, ZMKK=8, TYP=9, PROC=10, ZAKR=11, PUNKT=12, 
		MINUS_L=13, GWIAZDKA=14, SREDNIK=15, PRZECINEK=16, ZGIN=17, DOKONCZ=18, 
		STAN_MASZYNY_DEKLARACYJNEJ=19, RAMKA=20, STATYCZNE=21, SEKCJA=22, TYPY=23, 
		TOKENY=24, DRZEWO=25, SYMBOLE=26, SYMBOL=27, TU=28, TUIWYZEJ=29, CD=30, 
		LS=31, TEXT=32, BSS=33, DATA=34, RODATA=35, ID=36, NUM=37, WS=38, NASTEPNA=39, 
		SL_COMMENT=40;
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
			"PRZEBIEG_GENERACYJNY", "SEPARATOR_ZNACZNIKOWY", "WSZ", "ZMKK", "TYP", 
			"PROC", "ZAKR", "PUNKT", "MINUS_L", "GWIAZDKA", "SREDNIK", "PRZECINEK", 
			"ZGIN", "DOKONCZ", "STAN_MASZYNY_DEKLARACYJNEJ", "RAMKA", "STATYCZNE", 
			"SEKCJA", "TYPY", "TOKENY", "DRZEWO", "SYMBOLE", "SYMBOL", "TU", "TUIWYZEJ", 
			"CD", "LS", "TEXT", "BSS", "DATA", "RODATA", "ID", "NUM", "WS", "NASTEPNA", 
			"SL_COMMENT", "OGONKI"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<<'", null, null, null, null, "':'", null, null, "'typ'", null, 
			null, null, "'-l'", "'*'", "';'", "','", null, null, null, "'ramka'", 
			null, "'sekcja'", "'typy'", "'tokeny'", null, null, null, "'tu'", "'tuiwy\u017Cej'", 
			"'cd'", "'ls'", null, null, null, null, null, null, null, "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OTW", "ZMK", "PRZEBIEG_TYPOWANIA", "PRZEBIEG_ANALIZY_SEMANTYCZNEJ", 
			"PRZEBIEG_GENERACYJNY", "SEPARATOR_ZNACZNIKOWY", "WSZ", "ZMKK", "TYP", 
			"PROC", "ZAKR", "PUNKT", "MINUS_L", "GWIAZDKA", "SREDNIK", "PRZECINEK", 
			"ZGIN", "DOKONCZ", "STAN_MASZYNY_DEKLARACYJNEJ", "RAMKA", "STATYCZNE", 
			"SEKCJA", "TYPY", "TOKENY", "DRZEWO", "SYMBOLE", "SYMBOL", "TU", "TUIWYZEJ", 
			"CD", "LS", "TEXT", "BSS", "DATA", "RODATA", "ID", "NUM", "WS", "NASTEPNA", 
			"SL_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u01da\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4a\n\4\3\5\3\5\3\5\3\5\5\5g\n\5"+
		"\3\6\3\6\3\6\3\6\5\6m\n\6\3\7\3\7\3\7\3\7\3\b\6\bt\n\b\r\b\16\bu\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0092\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009c\n\13\5\13\u009e\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ac\n\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00b5\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00bc\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00c3\n\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00d3\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00e0\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00eb\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u0116\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0128\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u015a\n\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0172\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u017d\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3!\5!\u0192\n!\3!\3!\3!\3!\3!\3\"\5\"\u019a"+
		"\n\"\3\"\3\"\3\"\3\"\3#\5#\u01a1\n#\3#\3#\3#\3#\3#\3$\5$\u01a9\n$\3$\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\5%\u01b5\n%\3%\3%\7%\u01b9\n%\f%\16%\u01bc\13"+
		"%\3&\6&\u01bf\n&\r&\16&\u01c0\3\'\6\'\u01c4\n\'\r\'\16\'\u01c5\3\'\3\'"+
		"\3(\3(\3)\3)\3)\3)\7)\u01d0\n)\f)\16)\u01d3\13)\3)\3)\3)\3)\3*\3*\3\u01d1"+
		"\2+\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36"+
		"\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33\66\348\35:\36<"+
		"\37> @!B\"D#F$H%J&L\'N(P)R*T\2\4\2\3\b\5\2\13\f\17\17\"\"\4\2\60\60gg"+
		"\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\t\2\u00d5\u00d5\u00f5\u00f5\u0106\u0109"+
		"\u011a\u011b\u0143\u0146\u015c\u015d\u017b\u017e\2\u01fa\2\4\3\2\2\2\2"+
		"\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2"+
		"\2\3\22\3\2\2\2\3\24\3\2\2\2\3\26\3\2\2\2\3\30\3\2\2\2\3\32\3\2\2\2\3"+
		"\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2"+
		"\3(\3\2\2\2\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\3\60\3\2\2\2\3\62\3\2\2\2"+
		"\3\64\3\2\2\2\3\66\3\2\2\2\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2\2\3>\3\2\2\2"+
		"\3@\3\2\2\2\3B\3\2\2\2\3D\3\2\2\2\3F\3\2\2\2\3H\3\2\2\2\3J\3\2\2\2\3L"+
		"\3\2\2\2\3N\3\2\2\2\3P\3\2\2\2\3R\3\2\2\2\4V\3\2\2\2\6Y\3\2\2\2\b`\3\2"+
		"\2\2\nf\3\2\2\2\fl\3\2\2\2\16n\3\2\2\2\20s\3\2\2\2\22y\3\2\2\2\24~\3\2"+
		"\2\2\26\u009d\3\2\2\2\30\u00b4\3\2\2\2\32\u00c2\3\2\2\2\34\u00c4\3\2\2"+
		"\2\36\u00c7\3\2\2\2 \u00c9\3\2\2\2\"\u00cb\3\2\2\2$\u00d2\3\2\2\2&\u00df"+
		"\3\2\2\2(\u0115\3\2\2\2*\u0117\3\2\2\2,\u011d\3\2\2\2.\u0129\3\2\2\2\60"+
		"\u0130\3\2\2\2\62\u0135\3\2\2\2\64\u013c\3\2\2\2\66\u0171\3\2\2\28\u017c"+
		"\3\2\2\2:\u017e\3\2\2\2<\u0181\3\2\2\2>\u018a\3\2\2\2@\u018d\3\2\2\2B"+
		"\u0191\3\2\2\2D\u0199\3\2\2\2F\u01a0\3\2\2\2H\u01a8\3\2\2\2J\u01b4\3\2"+
		"\2\2L\u01be\3\2\2\2N\u01c3\3\2\2\2P\u01c9\3\2\2\2R\u01cb\3\2\2\2T\u01d8"+
		"\3\2\2\2VW\7>\2\2WX\7>\2\2X\5\3\2\2\2YZ\7@\2\2Z[\7@\2\2[\7\3\2\2\2\\]"+
		"\7V\2\2]^\7[\2\2^a\7R\2\2_a\7V\2\2`\\\3\2\2\2`_\3\2\2\2a\t\3\2\2\2bc\7"+
		"U\2\2cd\7G\2\2dg\7O\2\2eg\7U\2\2fb\3\2\2\2fe\3\2\2\2g\13\3\2\2\2hi\7I"+
		"\2\2ij\7G\2\2jm\7P\2\2km\7I\2\2lh\3\2\2\2lk\3\2\2\2m\r\3\2\2\2no\7<\2"+
		"\2op\3\2\2\2pq\b\7\2\2q\17\3\2\2\2rt\t\2\2\2sr\3\2\2\2tu\3\2\2\2us\3\2"+
		"\2\2uv\3\2\2\2vw\3\2\2\2wx\b\b\3\2x\21\3\2\2\2yz\7@\2\2z{\7@\2\2{|\3\2"+
		"\2\2|}\b\t\4\2}\23\3\2\2\2~\177\7v\2\2\177\u0080\7{\2\2\u0080\u0081\7"+
		"r\2\2\u0081\25\3\2\2\2\u0082\u0083\7r\2\2\u0083\u0084\7t\2\2\u0084\u0085"+
		"\7q\2\2\u0085\u0086\7e\2\2\u0086\u0087\7g\2\2\u0087\u0088\7f\2\2\u0088"+
		"\u0089\7w\2\2\u0089\u008a\7t\2\2\u008a\u009e\7c\2\2\u008b\u008c\7r\2\2"+
		"\u008c\u008d\7t\2\2\u008d\u008e\7q\2\2\u008e\u008f\7e\2\2\u008f\u0091"+
		"\3\2\2\2\u0090\u0092\7\60\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2"+
		"\u0092\u009e\3\2\2\2\u0093\u0094\7r\2\2\u0094\u0095\7t\2\2\u0095\u0096"+
		"\7q\2\2\u0096\u0097\7e\2\2\u0097\u0098\7g\2\2\u0098\u0099\7f\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u009c\7\60\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3"+
		"\2\2\2\u009c\u009e\3\2\2\2\u009d\u0082\3\2\2\2\u009d\u008b\3\2\2\2\u009d"+
		"\u0093\3\2\2\2\u009e\27\3\2\2\2\u009f\u00a0\7|\2\2\u00a0\u00a1\7c\2\2"+
		"\u00a1\u00a2\7m\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7g\2\2\u00a4\u00b5"+
		"\7u\2\2\u00a5\u00a6\7|\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7m\2\2\u00a8"+
		"\u00a9\7t\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\7\60\2\2\u00ab\u00aa\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b5\3\2\2\2\u00ad\u00ae\7|\2\2\u00ae"+
		"\u00af\7c\2\2\u00af\u00b0\7m\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7g\2\2"+
		"\u00b2\u00b3\7u\2\2\u00b3\u00b5\7{\2\2\u00b4\u009f\3\2\2\2\u00b4\u00a5"+
		"\3\2\2\2\u00b4\u00ad\3\2\2\2\u00b5\31\3\2\2\2\u00b6\u00b7\7r\2\2\u00b7"+
		"\u00b8\7m\2\2\u00b8\u00b9\7v\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00bc\7\60"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c3\3\2\2\2\u00bd"+
		"\u00be\7r\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7m\2\2"+
		"\u00c1\u00c3\7v\2\2\u00c2\u00b6\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c3\33\3"+
		"\2\2\2\u00c4\u00c5\7/\2\2\u00c5\u00c6\7n\2\2\u00c6\35\3\2\2\2\u00c7\u00c8"+
		"\7,\2\2\u00c8\37\3\2\2\2\u00c9\u00ca\7=\2\2\u00ca!\3\2\2\2\u00cb\u00cc"+
		"\7.\2\2\u00cc#\3\2\2\2\u00cd\u00ce\7|\2\2\u00ce\u00cf\7i\2\2\u00cf\u00d0"+
		"\7k\2\2\u00d0\u00d3\7\u0146\2\2\u00d1\u00d3\7b\2\2\u00d2\u00cd\3\2\2\2"+
		"\u00d2\u00d1\3\2\2\2\u00d3%\3\2\2\2\u00d4\u00d5\7f\2\2\u00d5\u00d6\7q"+
		"\2\2\u00d6\u00d7\7m\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7\u0146\2\2\u00d9"+
		"\u00da\7e\2\2\u00da\u00e0\7|\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7q\2\2"+
		"\u00dd\u00de\7m\2\2\u00de\u00e0\7\60\2\2\u00df\u00d4\3\2\2\2\u00df\u00db"+
		"\3\2\2\2\u00e0\'\3\2\2\2\u00e1\u00e2\7u\2\2\u00e2\u0116\7f\2\2\u00e3\u00e4"+
		"\7u\2\2\u00e4\u00e5\7f\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7m\2\2\u00e7"+
		"\u00e8\7n\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00eb\7\60\2\2\u00ea\u00e9\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u0116\3\2\2\2\u00ec\u00ed\7u\2\2\u00ed"+
		"\u00ee\7v\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7a\2\2"+
		"\u00f1\u00f2\7f\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7m\2\2\u00f4\u00f5"+
		"\7n\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7c\2\2\u00f8"+
		"\u00f9\7e\2\2\u00f9\u00fa\7l\2\2\u00fa\u0116\7k\2\2\u00fb\u00fc\7u\2\2"+
		"\u00fc\u00fd\7v\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100"+
		"\7a\2\2\u0100\u0101\7o\2\2\u0101\u0102\7c\2\2\u0102\u0103\7u\2\2\u0103"+
		"\u0104\7|\2\2\u0104\u0105\7{\2\2\u0105\u0106\7p\2\2\u0106\u0107\7{\2\2"+
		"\u0107\u0108\7a\2\2\u0108\u0109\7f\2\2\u0109\u010a\7g\2\2\u010a\u010b"+
		"\7m\2\2\u010b\u010c\7n\2\2\u010c\u010d\7c\2\2\u010d\u010e\7t\2\2\u010e"+
		"\u010f\7c\2\2\u010f\u0110\7e\2\2\u0110\u0111\7{\2\2\u0111\u0112\7l\2\2"+
		"\u0112\u0113\7p\2\2\u0113\u0114\7g\2\2\u0114\u0116\7l\2\2\u0115\u00e1"+
		"\3\2\2\2\u0115\u00e3\3\2\2\2\u0115\u00ec\3\2\2\2\u0115\u00fb\3\2\2\2\u0116"+
		")\3\2\2\2\u0117\u0118\7t\2\2\u0118\u0119\7c\2\2\u0119\u011a\7o\2\2\u011a"+
		"\u011b\7m\2\2\u011b\u011c\7c\2\2\u011c+\3\2\2\2\u011d\u011e\7u\2\2\u011e"+
		"\u011f\7v\2\2\u011f\u0120\7c\2\2\u0120\u0121\7v\2\2\u0121\u0122\7{\2\2"+
		"\u0122\u0123\7e\2\2\u0123\u0124\7|\2\2\u0124\u0125\7p\2\2\u0125\u0127"+
		"\3\2\2\2\u0126\u0128\t\3\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"-\3\2\2\2\u0129\u012a\7u\2\2\u012a\u012b\7g\2\2\u012b\u012c\7m\2\2\u012c"+
		"\u012d\7e\2\2\u012d\u012e\7l\2\2\u012e\u012f\7c\2\2\u012f/\3\2\2\2\u0130"+
		"\u0131\7v\2\2\u0131\u0132\7{\2\2\u0132\u0133\7r\2\2\u0133\u0134\7{\2\2"+
		"\u0134\61\3\2\2\2\u0135\u0136\7v\2\2\u0136\u0137\7q\2\2\u0137\u0138\7"+
		"m\2\2\u0138\u0139\7g\2\2\u0139\u013a\7p\2\2\u013a\u013b\7{\2\2\u013b\63"+
		"\3\2\2\2\u013c\u013d\7f\2\2\u013d\u013e\7t\2\2\u013e\u013f\7|\2\2\u013f"+
		"\u0140\7g\2\2\u0140\u0141\7y\2\2\u0141\u0142\7q\2\2\u0142\u0159\3\2\2"+
		"\2\u0143\u0144\7u\2\2\u0144\u0145\7m\2\2\u0145\u0146\7\u0144\2\2\u0146"+
		"\u0147\7c\2\2\u0147\u0148\7f\2\2\u0148\u0149\7p\2\2\u0149\u014a\7k\2\2"+
		"\u014a\u014b\7q\2\2\u014b\u014c\7y\2\2\u014c\u015a\7g\2\2\u014d\u014e"+
		"\7u\2\2\u014e\u014f\7{\2\2\u014f\u0150\7p\2\2\u0150\u0151\7v\2\2\u0151"+
		"\u0152\7c\2\2\u0152\u0153\7m\2\2\u0153\u0154\7v\2\2\u0154\u0155\7{\2\2"+
		"\u0155\u0156\7e\2\2\u0156\u0157\7|\2\2\u0157\u0158\7p\2\2\u0158\u015a"+
		"\7g\2\2\u0159\u0143\3\2\2\2\u0159\u014d\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\65\3\2\2\2\u015b\u015c\7u\2\2\u015c\u015d\7{\2\2\u015d\u015e\7o\2\2\u015e"+
		"\u015f\7d\2\2\u015f\u0160\7q\2\2\u0160\u0161\7n\2\2\u0161\u0172\7g\2\2"+
		"\u0162\u0163\7r\2\2\u0163\u0164\7t\2\2\u0164\u0165\7|\2\2\u0165\u0166"+
		"\7g\2\2\u0166\u0167\7u\2\2\u0167\u0168\7v\2\2\u0168\u0169\7t\2\2\u0169"+
		"\u016a\7|\2\2\u016a\u016b\7g\2\2\u016b\u016c\7\u0146\2\2\u016c\u016d\7"+
		"\"\2\2\u016d\u016e\7p\2\2\u016e\u016f\7c\2\2\u016f\u0170\7|\2\2\u0170"+
		"\u0172\7y\2\2\u0171\u015b\3\2\2\2\u0171\u0162\3\2\2\2\u0172\67\3\2\2\2"+
		"\u0173\u0174\7u\2\2\u0174\u0175\7{\2\2\u0175\u0176\7o\2\2\u0176\u0177"+
		"\7d\2\2\u0177\u0178\7q\2\2\u0178\u017d\7n\2\2\u0179\u017a\7u\2\2\u017a"+
		"\u017b\7{\2\2\u017b\u017d\7o\2\2\u017c\u0173\3\2\2\2\u017c\u0179\3\2\2"+
		"\2\u017d9\3\2\2\2\u017e\u017f\7v\2\2\u017f\u0180\7w\2\2\u0180;\3\2\2\2"+
		"\u0181\u0182\7v\2\2\u0182\u0183\7w\2\2\u0183\u0184\7k\2\2\u0184\u0185"+
		"\7y\2\2\u0185\u0186\7{\2\2\u0186\u0187\7\u017e\2\2\u0187\u0188\7g\2\2"+
		"\u0188\u0189\7l\2\2\u0189=\3\2\2\2\u018a\u018b\7e\2\2\u018b\u018c\7f\2"+
		"\2\u018c?\3\2\2\2\u018d\u018e\7n\2\2\u018e\u018f\7u\2\2\u018fA\3\2\2\2"+
		"\u0190\u0192\7\60\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u0194\7v\2\2\u0194\u0195\7g\2\2\u0195\u0196\7z\2\2\u0196"+
		"\u0197\7v\2\2\u0197C\3\2\2\2\u0198\u019a\7\60\2\2\u0199\u0198\3\2\2\2"+
		"\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\7d\2\2\u019c\u019d"+
		"\7u\2\2\u019d\u019e\7u\2\2\u019eE\3\2\2\2\u019f\u01a1\7\60\2\2\u01a0\u019f"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\7f\2\2\u01a3"+
		"\u01a4\7c\2\2\u01a4\u01a5\7v\2\2\u01a5\u01a6\7c\2\2\u01a6G\3\2\2\2\u01a7"+
		"\u01a9\7\60\2\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3"+
		"\2\2\2\u01aa\u01ab\7t\2\2\u01ab\u01ac\7q\2\2\u01ac\u01ad\7f\2\2\u01ad"+
		"\u01ae\7c\2\2\u01ae\u01af\7v\2\2\u01af\u01b0\7c\2\2\u01b0I\3\2\2\2\u01b1"+
		"\u01b5\t\4\2\2\u01b2\u01b5\5T*\2\u01b3\u01b5\7\60\2\2\u01b4\u01b1\3\2"+
		"\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01ba\3\2\2\2\u01b6"+
		"\u01b9\t\5\2\2\u01b7\u01b9\5T*\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2"+
		"\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bbK"+
		"\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01bf\t\6\2\2\u01be\u01bd\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1M\3\2\2\2"+
		"\u01c2\u01c4\t\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c3"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\b\'\3\2\u01c8"+
		"O\3\2\2\2\u01c9\u01ca\7^\2\2\u01caQ\3\2\2\2\u01cb\u01cc\7\61\2\2\u01cc"+
		"\u01cd\7\61\2\2\u01cd\u01d1\3\2\2\2\u01ce\u01d0\13\2\2\2\u01cf\u01ce\3"+
		"\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2"+
		"\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\7\f\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d7\b)\3\2\u01d7S\3\2\2\2\u01d8\u01d9\t\7\2\2\u01d9U\3\2"+
		"\2\2!\2\3`flu\u0091\u009b\u009d\u00ab\u00b4\u00bb\u00c2\u00d2\u00df\u00ea"+
		"\u0115\u0127\u0159\u0171\u017c\u0191\u0199\u01a0\u01a8\u01b4\u01b8\u01ba"+
		"\u01c0\u01c5\u01d1\5\4\3\2\b\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}