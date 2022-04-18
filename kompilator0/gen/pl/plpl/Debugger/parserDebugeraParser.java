// Generated from C:/Users/mastr/Documents/MS/STUDIA/kompilatory/kompilatorpl/kompilator0/src/pl/plpl/Debugger\parserDebugera.g4 by ANTLR 4.9.2
package pl.plpl.Debuger;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class parserDebugeraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OTW=2, ZMK=3, PRZEBIEG_TYPOWANIA=4, PRZEBIEG_ANALIZY_SEMANTYCZNEJ=5, 
		PRZEBIEG_GENERACYJNY=6, SEPARATOR_ZNACZNIKOWY=7, WSZ=8, NASTEPNA=9;
	public static final int
		RULE_znacznik = 0, RULE_oznaczenia_przebiegow = 1, RULE_zbior_komend = 2, 
		RULE_reszta = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"znacznik", "oznaczenia_przebiegow", "zbior_komend", "reszta"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'komenda'", "'<'", "'>'", null, null, null, "':'", null, "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OTW", "ZMK", "PRZEBIEG_TYPOWANIA", "PRZEBIEG_ANALIZY_SEMANTYCZNEJ", 
			"PRZEBIEG_GENERACYJNY", "SEPARATOR_ZNACZNIKOWY", "WSZ", "NASTEPNA"
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

	@Override
	public String getGrammarFileName() { return "parserDebugera.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public parserDebugeraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ZnacznikContext extends ParserRuleContext {
		public TerminalNode OTW() { return getToken(parserDebugeraParser.OTW, 0); }
		public Oznaczenia_przebiegowContext oznaczenia_przebiegow() {
			return getRuleContext(Oznaczenia_przebiegowContext.class,0);
		}
		public TerminalNode ZMK() { return getToken(parserDebugeraParser.ZMK, 0); }
		public TerminalNode SEPARATOR_ZNACZNIKOWY() { return getToken(parserDebugeraParser.SEPARATOR_ZNACZNIKOWY, 0); }
		public Zbior_komendContext zbior_komend() {
			return getRuleContext(Zbior_komendContext.class,0);
		}
		public ZnacznikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_znacznik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterZnacznik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitZnacznik(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitZnacznik(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZnacznikContext znacznik() throws RecognitionException {
		ZnacznikContext _localctx = new ZnacznikContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_znacznik);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(OTW);
			setState(9);
			oznaczenia_przebiegow();
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR_ZNACZNIKOWY) {
				{
				setState(10);
				match(SEPARATOR_ZNACZNIKOWY);
				setState(11);
				zbior_komend();
				}
			}

			setState(14);
			match(ZMK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Oznaczenia_przebiegowContext extends ParserRuleContext {
		public List<TerminalNode> PRZEBIEG_TYPOWANIA() { return getTokens(parserDebugeraParser.PRZEBIEG_TYPOWANIA); }
		public TerminalNode PRZEBIEG_TYPOWANIA(int i) {
			return getToken(parserDebugeraParser.PRZEBIEG_TYPOWANIA, i);
		}
		public List<TerminalNode> PRZEBIEG_ANALIZY_SEMANTYCZNEJ() { return getTokens(parserDebugeraParser.PRZEBIEG_ANALIZY_SEMANTYCZNEJ); }
		public TerminalNode PRZEBIEG_ANALIZY_SEMANTYCZNEJ(int i) {
			return getToken(parserDebugeraParser.PRZEBIEG_ANALIZY_SEMANTYCZNEJ, i);
		}
		public List<TerminalNode> PRZEBIEG_GENERACYJNY() { return getTokens(parserDebugeraParser.PRZEBIEG_GENERACYJNY); }
		public TerminalNode PRZEBIEG_GENERACYJNY(int i) {
			return getToken(parserDebugeraParser.PRZEBIEG_GENERACYJNY, i);
		}
		public Oznaczenia_przebiegowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oznaczenia_przebiegow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterOznaczenia_przebiegow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitOznaczenia_przebiegow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitOznaczenia_przebiegow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oznaczenia_przebiegowContext oznaczenia_przebiegow() throws RecognitionException {
		Oznaczenia_przebiegowContext _localctx = new Oznaczenia_przebiegowContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_oznaczenia_przebiegow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRZEBIEG_TYPOWANIA) | (1L << PRZEBIEG_ANALIZY_SEMANTYCZNEJ) | (1L << PRZEBIEG_GENERACYJNY))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRZEBIEG_TYPOWANIA) | (1L << PRZEBIEG_ANALIZY_SEMANTYCZNEJ) | (1L << PRZEBIEG_GENERACYJNY))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Zbior_komendContext extends ParserRuleContext {
		public TerminalNode NASTEPNA() { return getToken(parserDebugeraParser.NASTEPNA, 0); }
		public ResztaContext reszta() {
			return getRuleContext(ResztaContext.class,0);
		}
		public Zbior_komendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zbior_komend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterZbior_komend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitZbior_komend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitZbior_komend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zbior_komendContext zbior_komend() throws RecognitionException {
		Zbior_komendContext _localctx = new Zbior_komendContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_zbior_komend);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(T__0);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NASTEPNA) {
				{
				setState(22);
				match(NASTEPNA);
				setState(23);
				reszta();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResztaContext extends ParserRuleContext {
		public List<TerminalNode> ZMK() { return getTokens(parserDebugeraParser.ZMK); }
		public TerminalNode ZMK(int i) {
			return getToken(parserDebugeraParser.ZMK, i);
		}
		public ResztaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reszta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterReszta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitReszta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitReszta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResztaContext reszta() throws RecognitionException {
		ResztaContext _localctx = new ResztaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reszta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OTW) | (1L << PRZEBIEG_TYPOWANIA) | (1L << PRZEBIEG_ANALIZY_SEMANTYCZNEJ) | (1L << PRZEBIEG_GENERACYJNY) | (1L << SEPARATOR_ZNACZNIKOWY) | (1L << WSZ) | (1L << NASTEPNA))) != 0)) {
				{
				{
				setState(26);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==ZMK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13#\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\5\2\17\n\2\3\2\3\2\3\3\6\3\24\n\3\r"+
		"\3\16\3\25\3\4\3\4\3\4\5\4\33\n\4\3\5\7\5\36\n\5\f\5\16\5!\13\5\3\5\2"+
		"\2\6\2\4\6\b\2\4\3\2\6\b\3\2\5\5\2\"\2\n\3\2\2\2\4\23\3\2\2\2\6\27\3\2"+
		"\2\2\b\37\3\2\2\2\n\13\7\4\2\2\13\16\5\4\3\2\f\r\7\t\2\2\r\17\5\6\4\2"+
		"\16\f\3\2\2\2\16\17\3\2\2\2\17\20\3\2\2\2\20\21\7\5\2\2\21\3\3\2\2\2\22"+
		"\24\t\2\2\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26"+
		"\5\3\2\2\2\27\32\7\3\2\2\30\31\7\13\2\2\31\33\5\b\5\2\32\30\3\2\2\2\32"+
		"\33\3\2\2\2\33\7\3\2\2\2\34\36\n\3\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 \t\3\2\2\2!\37\3\2\2\2\6\16\25\32\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}