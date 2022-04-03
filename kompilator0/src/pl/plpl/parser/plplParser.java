// Generated from C:/Users/mastr/Documents/MS/STUDIA/kompilatory/kompilatorpl/kompilator0/src/pl/plpl\plpl.g4 by ANTLR 4.9.2
package pl.plpl.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class plplParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_byt_globalny = 1, RULE_procedura = 2, RULE_deklaracja_typu = 3, 
		RULE_deklaracja_prosta = 4, RULE_deklaracja_referencji = 5, RULE_deklaracja_atomiczna = 6, 
		RULE_lista_instrukcji = 7, RULE_instrukcja = 8, RULE_instrukcja_zlozona = 9, 
		RULE_instrukcja_wyboru = 10, RULE_instrukcja_petli = 11, RULE_instrukcja_powrotu = 12, 
		RULE_instrukcja_wkroczenia = 13, RULE_instrukcja_zakonczenia = 14, RULE_instrukcja_przerwania_petli = 15, 
		RULE_instrukcja_kontynuacji_petli = 16, RULE_instrukcja_prosta = 17, RULE_lista_parametrow_formalnych = 18, 
		RULE_deklaracja_parametru = 19, RULE_wyrazenie = 20, RULE_lwartosc = 21, 
		RULE_selektor_tablicowy = 22, RULE_selektor_typu_zlozonego = 23, RULE_przypisanie = 24, 
		RULE_wywolanie_funkcji = 25, RULE_lista_parametrow_aktualnych = 26, RULE_stala_atomiczna = 27, 
		RULE_pelny_typ = 28, RULE_nazwa_typu_atom = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "byt_globalny", "procedura", "deklaracja_typu", "deklaracja_prosta", 
			"deklaracja_referencji", "deklaracja_atomiczna", "lista_instrukcji", 
			"instrukcja", "instrukcja_zlozona", "instrukcja_wyboru", "instrukcja_petli", 
			"instrukcja_powrotu", "instrukcja_wkroczenia", "instrukcja_zakonczenia", 
			"instrukcja_przerwania_petli", "instrukcja_kontynuacji_petli", "instrukcja_prosta", 
			"lista_parametrow_formalnych", "deklaracja_parametru", "wyrazenie", "lwartosc", 
			"selektor_tablicowy", "selektor_typu_zlozonego", "przypisanie", "wywolanie_funkcji", 
			"lista_parametrow_aktualnych", "stala_atomiczna", "pelny_typ", "nazwa_typu_atom"
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

	@Override
	public String getGrammarFileName() { return "plpl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public plplParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Byt_globalnyContext> byt_globalny() {
			return getRuleContexts(Byt_globalnyContext.class);
		}
		public Byt_globalnyContext byt_globalny(int i) {
			return getRuleContext(Byt_globalnyContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << ID))) != 0)) {
				{
				{
				setState(60);
				byt_globalny();
				}
				}
				setState(65);
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

	public static class Byt_globalnyContext extends ParserRuleContext {
		public ProceduraContext procedura() {
			return getRuleContext(ProceduraContext.class,0);
		}
		public Deklaracja_typuContext deklaracja_typu() {
			return getRuleContext(Deklaracja_typuContext.class,0);
		}
		public Deklaracja_prostaContext deklaracja_prosta() {
			return getRuleContext(Deklaracja_prostaContext.class,0);
		}
		public Byt_globalnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byt_globalny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterByt_globalny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitByt_globalny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitByt_globalny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Byt_globalnyContext byt_globalny() throws RecognitionException {
		Byt_globalnyContext _localctx = new Byt_globalnyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_byt_globalny);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				procedura();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				deklaracja_typu();
				}
				break;
			case T__43:
			case T__44:
			case T__45:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				deklaracja_prosta();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ProceduraContext extends ParserRuleContext {
		public Lista_instrukcjiContext lista_instrukcji() {
			return getRuleContext(Lista_instrukcjiContext.class,0);
		}
		public Pelny_typContext pelny_typ() {
			return getRuleContext(Pelny_typContext.class,0);
		}
		public ProceduraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterProcedura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitProcedura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitProcedura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProceduraContext procedura() throws RecognitionException {
		ProceduraContext _localctx = new ProceduraContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_procedura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__0);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(72);
				match(T__1);
				setState(73);
				pelny_typ();
				}
			}

			setState(76);
			match(T__2);
			setState(77);
			lista_instrukcji();
			setState(78);
			match(T__3);
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

	public static class Deklaracja_typuContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(plplParser.ID, 0); }
		public List<Deklaracja_prostaContext> deklaracja_prosta() {
			return getRuleContexts(Deklaracja_prostaContext.class);
		}
		public Deklaracja_prostaContext deklaracja_prosta(int i) {
			return getRuleContext(Deklaracja_prostaContext.class,i);
		}
		public Deklaracja_typuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracja_typu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterDeklaracja_typu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitDeklaracja_typu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitDeklaracja_typu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deklaracja_typuContext deklaracja_typu() throws RecognitionException {
		Deklaracja_typuContext _localctx = new Deklaracja_typuContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_deklaracja_typu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__4);
			setState(81);
			match(ID);
			setState(82);
			match(T__2);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				deklaracja_prosta();
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << ID))) != 0) );
			setState(88);
			match(T__3);
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

	public static class Deklaracja_prostaContext extends ParserRuleContext {
		public Deklaracja_atomicznaContext deklaracja_atomiczna() {
			return getRuleContext(Deklaracja_atomicznaContext.class,0);
		}
		public Deklaracja_referencjiContext deklaracja_referencji() {
			return getRuleContext(Deklaracja_referencjiContext.class,0);
		}
		public Deklaracja_prostaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracja_prosta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterDeklaracja_prosta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitDeklaracja_prosta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitDeklaracja_prosta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deklaracja_prostaContext deklaracja_prosta() throws RecognitionException {
		Deklaracja_prostaContext _localctx = new Deklaracja_prostaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_deklaracja_prosta);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				deklaracja_atomiczna();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				deklaracja_referencji();
				}
				break;
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

	public static class Deklaracja_referencjiContext extends ParserRuleContext {
		public Pelny_typContext pelny_typ() {
			return getRuleContext(Pelny_typContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(plplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(plplParser.ID, i);
		}
		public TerminalNode EOS() { return getToken(plplParser.EOS, 0); }
		public TerminalNode NAPIS_DOSL() { return getToken(plplParser.NAPIS_DOSL, 0); }
		public Deklaracja_referencjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracja_referencji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterDeklaracja_referencji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitDeklaracja_referencji(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitDeklaracja_referencji(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deklaracja_referencjiContext deklaracja_referencji() throws RecognitionException {
		Deklaracja_referencjiContext _localctx = new Deklaracja_referencjiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_deklaracja_referencji);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				pelny_typ();
				setState(95);
				match(ID);
				setState(96);
				match(EOS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				pelny_typ();
				setState(99);
				match(ID);
				setState(100);
				match(T__5);
				setState(101);
				_la = _input.LA(1);
				if ( !(_la==NAPIS_DOSL || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(102);
				match(EOS);
				}
				break;
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

	public static class Deklaracja_atomicznaContext extends ParserRuleContext {
		public Nazwa_typu_atomContext nazwa_typu_atom() {
			return getRuleContext(Nazwa_typu_atomContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(plplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(plplParser.ID, i);
		}
		public TerminalNode EOS() { return getToken(plplParser.EOS, 0); }
		public List<TerminalNode> CALK() { return getTokens(plplParser.CALK); }
		public TerminalNode CALK(int i) {
			return getToken(plplParser.CALK, i);
		}
		public List<TerminalNode> ZMIENN() { return getTokens(plplParser.ZMIENN); }
		public TerminalNode ZMIENN(int i) {
			return getToken(plplParser.ZMIENN, i);
		}
		public List<TerminalNode> ZNAK_DOSL() { return getTokens(plplParser.ZNAK_DOSL); }
		public TerminalNode ZNAK_DOSL(int i) {
			return getToken(plplParser.ZNAK_DOSL, i);
		}
		public Deklaracja_atomicznaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracja_atomiczna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterDeklaracja_atomiczna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitDeklaracja_atomiczna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitDeklaracja_atomiczna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deklaracja_atomicznaContext deklaracja_atomiczna() throws RecognitionException {
		Deklaracja_atomicznaContext _localctx = new Deklaracja_atomicznaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_deklaracja_atomiczna);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				nazwa_typu_atom();
				setState(107);
				match(ID);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(108);
					match(T__6);
					setState(109);
					match(ID);
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				match(EOS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				nazwa_typu_atom();
				setState(118);
				match(ID);
				setState(119);
				match(T__5);
				setState(120);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(121);
					match(ID);
					setState(122);
					match(T__5);
					setState(123);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
				match(EOS);
				}
				break;
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

	public static class Lista_instrukcjiContext extends ParserRuleContext {
		public List<InstrukcjaContext> instrukcja() {
			return getRuleContexts(InstrukcjaContext.class);
		}
		public InstrukcjaContext instrukcja(int i) {
			return getRuleContext(InstrukcjaContext.class,i);
		}
		public Lista_instrukcjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_instrukcji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterLista_instrukcji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitLista_instrukcji(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitLista_instrukcji(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_instrukcjiContext lista_instrukcji() throws RecognitionException {
		Lista_instrukcjiContext _localctx = new Lista_instrukcjiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lista_instrukcji);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(133);
				instrukcja();
				}
				}
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL) | (1L << ID))) != 0) );
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

	public static class InstrukcjaContext extends ParserRuleContext {
		public Instrukcja_wyboruContext instrukcja_wyboru() {
			return getRuleContext(Instrukcja_wyboruContext.class,0);
		}
		public Instrukcja_petliContext instrukcja_petli() {
			return getRuleContext(Instrukcja_petliContext.class,0);
		}
		public Instrukcja_zlozonaContext instrukcja_zlozona() {
			return getRuleContext(Instrukcja_zlozonaContext.class,0);
		}
		public Instrukcja_prostaContext instrukcja_prosta() {
			return getRuleContext(Instrukcja_prostaContext.class,0);
		}
		public Instrukcja_wkroczeniaContext instrukcja_wkroczenia() {
			return getRuleContext(Instrukcja_wkroczeniaContext.class,0);
		}
		public Instrukcja_przerwania_petliContext instrukcja_przerwania_petli() {
			return getRuleContext(Instrukcja_przerwania_petliContext.class,0);
		}
		public Instrukcja_kontynuacji_petliContext instrukcja_kontynuacji_petli() {
			return getRuleContext(Instrukcja_kontynuacji_petliContext.class,0);
		}
		public Instrukcja_powrotuContext instrukcja_powrotu() {
			return getRuleContext(Instrukcja_powrotuContext.class,0);
		}
		public Instrukcja_zakonczeniaContext instrukcja_zakonczenia() {
			return getRuleContext(Instrukcja_zakonczeniaContext.class,0);
		}
		public Deklaracja_atomicznaContext deklaracja_atomiczna() {
			return getRuleContext(Deklaracja_atomicznaContext.class,0);
		}
		public Deklaracja_referencjiContext deklaracja_referencji() {
			return getRuleContext(Deklaracja_referencjiContext.class,0);
		}
		public InstrukcjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrukcja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterInstrukcja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitInstrukcja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitInstrukcja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrukcjaContext instrukcja() throws RecognitionException {
		InstrukcjaContext _localctx = new InstrukcjaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instrukcja);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				instrukcja_wyboru();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				instrukcja_petli();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				instrukcja_zlozona();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				instrukcja_prosta();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				instrukcja_wkroczenia();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				instrukcja_przerwania_petli();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(144);
				instrukcja_kontynuacji_petli();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(145);
				instrukcja_powrotu();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(146);
				instrukcja_zakonczenia();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(147);
				deklaracja_atomiczna();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(148);
				deklaracja_referencji();
				}
				break;
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

	public static class Instrukcja_zlozonaContext extends ParserRuleContext {
		public Lista_instrukcjiContext lista_instrukcji() {
			return getRuleContext(Lista_instrukcjiContext.class,0);
		}
		public Instrukcja_zlozonaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrukcja_zlozona; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterInstrukcja_zlozona(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitInstrukcja_zlozona(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitInstrukcja_zlozona(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrukcja_zlozonaContext instrukcja_zlozona() throws RecognitionException {
		Instrukcja_zlozonaContext _localctx = new Instrukcja_zlozonaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instrukcja_zlozona);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__2);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL) | (1L << ID))) != 0)) {
				{
				setState(152);
				lista_instrukcji();
				}
			}

			setState(155);
			match(T__3);
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

	public static class Instrukcja_wyboruContext extends ParserRuleContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public List<InstrukcjaContext> instrukcja() {
			return getRuleContexts(InstrukcjaContext.class);
		}
		public InstrukcjaContext instrukcja(int i) {
			return getRuleContext(InstrukcjaContext.class,i);
		}
		public Instrukcja_wyboruContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrukcja_wyboru; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterInstrukcja_wyboru(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitInstrukcja_wyboru(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitInstrukcja_wyboru(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrukcja_wyboruContext instrukcja_wyboru() throws RecognitionException {
		Instrukcja_wyboruContext _localctx = new Instrukcja_wyboruContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instrukcja_wyboru);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__7);
			setState(158);
			match(T__8);
			setState(159);
			wyrazenie(0);
			setState(160);
			match(T__9);
			setState(161);
			instrukcja();
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(162);
				match(T__10);
				setState(163);
				instrukcja();
				}
				break;
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

	public static class Instrukcja_petliContext extends ParserRuleContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public InstrukcjaContext instrukcja() {
			return getRuleContext(InstrukcjaContext.class,0);
		}
		public Instrukcja_petliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrukcja_petli; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterInstrukcja_petli(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitInstrukcja_petli(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitInstrukcja_petli(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrukcja_petliContext instrukcja_petli() throws RecognitionException {
		Instrukcja_petliContext _localctx = new Instrukcja_petliContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instrukcja_petli);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__11);
			setState(167);
			match(T__8);
			setState(168);
			wyrazenie(0);
			setState(169);
			match(T__9);
			setState(170);
			instrukcja();
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

	public static class Instrukcja_powrotuContext extends ParserRuleContext {
		public TerminalNode EOS() { return getToken(plplParser.EOS, 0); }
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public Instrukcja_powrotuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrukcja_powrotu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterInstrukcja_powrotu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitInstrukcja_powrotu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitInstrukcja_powrotu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrukcja_powrotuContext instrukcja_powrotu() throws RecognitionException {
		Instrukcja_powrotuContext _localctx = new Instrukcja_powrotuContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instrukcja_powrotu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__12);
			setState(173);
			match(T__8);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL) | (1L << ID))) != 0)) {
				{
				setState(174);
				wyrazenie(0);
				}
			}

			setState(177);
			match(T__9);
			setState(178);
			match(EOS);
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

	public static class Instrukcja_wkroczeniaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(plplParser.ID, 0); }
		public Lista_parametrow_formalnychContext lista_parametrow_formalnych() {
			return getRuleContext(Lista_parametrow_formalnychContext.class,0);
		}
		public TerminalNode EOS() { return getToken(plplParser.EOS, 0); }
		public Instrukcja_wkroczeniaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrukcja_wkroczenia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterInstrukcja_wkroczenia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitInstrukcja_wkroczenia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitInstrukcja_wkroczenia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrukcja_wkroczeniaContext instrukcja_wkroczenia() throws RecognitionException {
		Instrukcja_wkroczeniaContext _localctx = new Instrukcja_wkroczeniaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instrukcja_wkroczenia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__13);
			setState(181);
			match(ID);
			setState(182);
			match(T__8);
			setState(183);
			lista_parametrow_formalnych();
			setState(184);
			match(T__9);
			setState(185);
			match(EOS);
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

	public static class Instrukcja_zakonczeniaContext extends ParserRuleContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public TerminalNode EOS() { return getToken(plplParser.EOS, 0); }
		public Instrukcja_zakonczeniaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrukcja_zakonczenia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterInstrukcja_zakonczenia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitInstrukcja_zakonczenia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitInstrukcja_zakonczenia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrukcja_zakonczeniaContext instrukcja_zakonczenia() throws RecognitionException {
		Instrukcja_zakonczeniaContext _localctx = new Instrukcja_zakonczeniaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_instrukcja_zakonczenia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__14);
			setState(188);
			match(T__8);
			setState(189);
			wyrazenie(0);
			setState(190);
			match(T__9);
			setState(191);
			match(EOS);
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

	public static class Instrukcja_przerwania_petliContext extends ParserRuleContext {
		public TerminalNode EOS() { return getToken(plplParser.EOS, 0); }
		public Instrukcja_przerwania_petliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrukcja_przerwania_petli; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterInstrukcja_przerwania_petli(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitInstrukcja_przerwania_petli(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitInstrukcja_przerwania_petli(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrukcja_przerwania_petliContext instrukcja_przerwania_petli() throws RecognitionException {
		Instrukcja_przerwania_petliContext _localctx = new Instrukcja_przerwania_petliContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instrukcja_przerwania_petli);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__15);
			setState(194);
			match(EOS);
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

	public static class Instrukcja_kontynuacji_petliContext extends ParserRuleContext {
		public TerminalNode EOS() { return getToken(plplParser.EOS, 0); }
		public Instrukcja_kontynuacji_petliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrukcja_kontynuacji_petli; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterInstrukcja_kontynuacji_petli(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitInstrukcja_kontynuacji_petli(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitInstrukcja_kontynuacji_petli(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrukcja_kontynuacji_petliContext instrukcja_kontynuacji_petli() throws RecognitionException {
		Instrukcja_kontynuacji_petliContext _localctx = new Instrukcja_kontynuacji_petliContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_instrukcja_kontynuacji_petli);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__16);
			setState(197);
			match(EOS);
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

	public static class Instrukcja_prostaContext extends ParserRuleContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public TerminalNode EOS() { return getToken(plplParser.EOS, 0); }
		public Instrukcja_prostaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrukcja_prosta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterInstrukcja_prosta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitInstrukcja_prosta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitInstrukcja_prosta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrukcja_prostaContext instrukcja_prosta() throws RecognitionException {
		Instrukcja_prostaContext _localctx = new Instrukcja_prostaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_instrukcja_prosta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			wyrazenie(0);
			setState(200);
			match(EOS);
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

	public static class Lista_parametrow_formalnychContext extends ParserRuleContext {
		public List<Deklaracja_parametruContext> deklaracja_parametru() {
			return getRuleContexts(Deklaracja_parametruContext.class);
		}
		public Deklaracja_parametruContext deklaracja_parametru(int i) {
			return getRuleContext(Deklaracja_parametruContext.class,i);
		}
		public Lista_parametrow_formalnychContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parametrow_formalnych; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterLista_parametrow_formalnych(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitLista_parametrow_formalnych(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitLista_parametrow_formalnych(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_parametrow_formalnychContext lista_parametrow_formalnych() throws RecognitionException {
		Lista_parametrow_formalnychContext _localctx = new Lista_parametrow_formalnychContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lista_parametrow_formalnych);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << ID))) != 0)) {
				{
				setState(202);
				deklaracja_parametru();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(203);
					match(T__6);
					setState(204);
					deklaracja_parametru();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Deklaracja_parametruContext extends ParserRuleContext {
		public Pelny_typContext pelny_typ() {
			return getRuleContext(Pelny_typContext.class,0);
		}
		public TerminalNode ID() { return getToken(plplParser.ID, 0); }
		public Deklaracja_parametruContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracja_parametru; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterDeklaracja_parametru(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitDeklaracja_parametru(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitDeklaracja_parametru(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deklaracja_parametruContext deklaracja_parametru() throws RecognitionException {
		Deklaracja_parametruContext _localctx = new Deklaracja_parametruContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_deklaracja_parametru);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			pelny_typ();
			setState(213);
			match(ID);
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

	public static class WyrazenieContext extends ParserRuleContext {
		public WyrazenieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wyrazenie; }
	 
		public WyrazenieContext() { }
		public void copyFrom(WyrazenieContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WyrazenieNegacjaContext extends WyrazenieContext {
		public Token neg;
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public WyrazenieNegacjaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazenieNegacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazenieNegacja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazenieNegacja(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieNawiasyContext extends WyrazenieContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public WyrazenieNawiasyContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazenieNawiasy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazenieNawiasy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazenieNawiasy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieLwartoscContext extends WyrazenieContext {
		public LwartoscContext lwartosc() {
			return getRuleContext(LwartoscContext.class,0);
		}
		public WyrazenieLwartoscContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazenieLwartosc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazenieLwartosc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazenieLwartosc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazeniePorownanieContext extends WyrazenieContext {
		public Token porownanie;
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazeniePorownanieContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazeniePorownanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazeniePorownanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazeniePorownanie(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazeniePotegContext extends WyrazenieContext {
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazeniePotegContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazeniePoteg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazeniePoteg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazeniePoteg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieIdContext extends WyrazenieContext {
		public TerminalNode ID() { return getToken(plplParser.ID, 0); }
		public WyrazenieIdContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazenieId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazenieId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazenieId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieLogiczContext extends WyrazenieContext {
		public Token logicz;
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazenieLogiczContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazenieLogicz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazenieLogicz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazenieLogicz(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieMultContext extends WyrazenieContext {
		public Token mult;
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazenieMultContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazenieMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazenieMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazenieMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazeniePrzypisanieContext extends WyrazenieContext {
		public PrzypisanieContext przypisanie() {
			return getRuleContext(PrzypisanieContext.class,0);
		}
		public WyrazeniePrzypisanieContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazeniePrzypisanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazeniePrzypisanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazeniePrzypisanie(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieAdresContext extends WyrazenieContext {
		public Token adr;
		public LwartoscContext lwartosc() {
			return getRuleContext(LwartoscContext.class,0);
		}
		public WyrazenieAdresContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazenieAdres(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazenieAdres(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazenieAdres(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieAddytContext extends WyrazenieContext {
		public Token addyt;
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazenieAddytContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazenieAddyt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazenieAddyt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazenieAddyt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieWywolanieContext extends WyrazenieContext {
		public Wywolanie_funkcjiContext wywolanie_funkcji() {
			return getRuleContext(Wywolanie_funkcjiContext.class,0);
		}
		public WyrazenieWywolanieContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazenieWywolanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazenieWywolanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazenieWywolanie(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieStalaContext extends WyrazenieContext {
		public Stala_atomicznaContext stala_atomiczna() {
			return getRuleContext(Stala_atomicznaContext.class,0);
		}
		public WyrazenieStalaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazenieStala(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazenieStala(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazenieStala(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieZnakContext extends WyrazenieContext {
		public Token znak;
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public WyrazenieZnakContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazenieZnak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazenieZnak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazenieZnak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WyrazenieContext wyrazenie() throws RecognitionException {
		return wyrazenie(0);
	}

	private WyrazenieContext wyrazenie(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		WyrazenieContext _localctx = new WyrazenieContext(_ctx, _parentState);
		WyrazenieContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_wyrazenie, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new WyrazenieWywolanieContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(216);
				wywolanie_funkcji();
				}
				break;
			case 2:
				{
				_localctx = new WyrazenieLwartoscContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				lwartosc();
				}
				break;
			case 3:
				{
				_localctx = new WyrazenieAdresContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				((WyrazenieAdresContext)_localctx).adr = match(T__17);
				setState(219);
				lwartosc();
				}
				break;
			case 4:
				{
				_localctx = new WyrazenieNegacjaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				((WyrazenieNegacjaContext)_localctx).neg = match(T__18);
				setState(221);
				wyrazenie(11);
				}
				break;
			case 5:
				{
				_localctx = new WyrazenieZnakContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				((WyrazenieZnakContext)_localctx).znak = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
					((WyrazenieZnakContext)_localctx).znak = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(223);
				wyrazenie(10);
				}
				break;
			case 6:
				{
				_localctx = new WyrazeniePrzypisanieContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				przypisanie();
				}
				break;
			case 7:
				{
				_localctx = new WyrazenieStalaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				stala_atomiczna();
				}
				break;
			case 8:
				{
				_localctx = new WyrazenieIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new WyrazenieNawiasyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(T__8);
				setState(228);
				wyrazenie(0);
				setState(229);
				match(T__9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(248);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new WyrazeniePotegContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(233);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(234);
						match(T__21);
						setState(235);
						wyrazenie(9);
						}
						break;
					case 2:
						{
						_localctx = new WyrazenieMultContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(236);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(237);
						((WyrazenieMultContext)_localctx).mult = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
							((WyrazenieMultContext)_localctx).mult = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(238);
						wyrazenie(9);
						}
						break;
					case 3:
						{
						_localctx = new WyrazenieAddytContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(239);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(240);
						((WyrazenieAddytContext)_localctx).addyt = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((WyrazenieAddytContext)_localctx).addyt = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						wyrazenie(8);
						}
						break;
					case 4:
						{
						_localctx = new WyrazenieLogiczContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(242);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(243);
						((WyrazenieLogiczContext)_localctx).logicz = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((WyrazenieLogiczContext)_localctx).logicz = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(244);
						wyrazenie(7);
						}
						break;
					case 5:
						{
						_localctx = new WyrazeniePorownanieContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(245);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(246);
						((WyrazeniePorownanieContext)_localctx).porownanie = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
							((WyrazeniePorownanieContext)_localctx).porownanie = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(247);
						wyrazenie(6);
						}
						break;
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LwartoscContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(plplParser.ID, 0); }
		public List<Selektor_tablicowyContext> selektor_tablicowy() {
			return getRuleContexts(Selektor_tablicowyContext.class);
		}
		public Selektor_tablicowyContext selektor_tablicowy(int i) {
			return getRuleContext(Selektor_tablicowyContext.class,i);
		}
		public List<Selektor_typu_zlozonegoContext> selektor_typu_zlozonego() {
			return getRuleContexts(Selektor_typu_zlozonegoContext.class);
		}
		public Selektor_typu_zlozonegoContext selektor_typu_zlozonego(int i) {
			return getRuleContext(Selektor_typu_zlozonegoContext.class,i);
		}
		public LwartoscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lwartosc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterLwartosc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitLwartosc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitLwartosc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LwartoscContext lwartosc() throws RecognitionException {
		LwartoscContext _localctx = new LwartoscContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lwartosc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(ID);
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(254);
				selektor_tablicowy();
				}
				break;
			}
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(257);
					selektor_typu_zlozonego();
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(258);
							selektor_tablicowy();
							}
							} 
						}
						setState(263);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					}
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Selektor_tablicowyContext extends ParserRuleContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public Selektor_tablicowyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selektor_tablicowy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterSelektor_tablicowy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitSelektor_tablicowy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitSelektor_tablicowy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selektor_tablicowyContext selektor_tablicowy() throws RecognitionException {
		Selektor_tablicowyContext _localctx = new Selektor_tablicowyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_selektor_tablicowy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__33);
			setState(270);
			wyrazenie(0);
			setState(271);
			match(T__34);
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

	public static class Selektor_typu_zlozonegoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(plplParser.ID, 0); }
		public Selektor_typu_zlozonegoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selektor_typu_zlozonego; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterSelektor_typu_zlozonego(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitSelektor_typu_zlozonego(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitSelektor_typu_zlozonego(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selektor_typu_zlozonegoContext selektor_typu_zlozonego() throws RecognitionException {
		Selektor_typu_zlozonegoContext _localctx = new Selektor_typu_zlozonegoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_selektor_typu_zlozonego);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__35);
			setState(274);
			match(ID);
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

	public static class PrzypisanieContext extends ParserRuleContext {
		public PrzypisanieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_przypisanie; }
	 
		public PrzypisanieContext() { }
		public void copyFrom(PrzypisanieContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrzypisanieMultContext extends PrzypisanieContext {
		public Token mult;
		public LwartoscContext lwartosc() {
			return getRuleContext(LwartoscContext.class,0);
		}
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public PrzypisanieMultContext(PrzypisanieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterPrzypisanieMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitPrzypisanieMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitPrzypisanieMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrzypisanieZwykleContext extends PrzypisanieContext {
		public LwartoscContext lwartosc() {
			return getRuleContext(LwartoscContext.class,0);
		}
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public PrzypisanieZwykleContext(PrzypisanieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterPrzypisanieZwykle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitPrzypisanieZwykle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitPrzypisanieZwykle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrzypisaniePotegContext extends PrzypisanieContext {
		public LwartoscContext lwartosc() {
			return getRuleContext(LwartoscContext.class,0);
		}
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public PrzypisaniePotegContext(PrzypisanieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterPrzypisaniePoteg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitPrzypisaniePoteg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitPrzypisaniePoteg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrzypisanieAddytContext extends PrzypisanieContext {
		public Token addyt;
		public LwartoscContext lwartosc() {
			return getRuleContext(LwartoscContext.class,0);
		}
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public PrzypisanieAddytContext(PrzypisanieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterPrzypisanieAddyt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitPrzypisanieAddyt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitPrzypisanieAddyt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrzypisanieContext przypisanie() throws RecognitionException {
		PrzypisanieContext _localctx = new PrzypisanieContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_przypisanie);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new PrzypisanieZwykleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				lwartosc();
				setState(277);
				match(T__5);
				setState(278);
				wyrazenie(0);
				}
				break;
			case 2:
				_localctx = new PrzypisaniePotegContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				lwartosc();
				setState(281);
				match(T__36);
				setState(282);
				wyrazenie(0);
				}
				break;
			case 3:
				_localctx = new PrzypisanieMultContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				lwartosc();
				setState(285);
				((PrzypisanieMultContext)_localctx).mult = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
					((PrzypisanieMultContext)_localctx).mult = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(286);
				wyrazenie(0);
				}
				break;
			case 4:
				_localctx = new PrzypisanieAddytContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				lwartosc();
				setState(289);
				((PrzypisanieAddytContext)_localctx).addyt = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__40 || _la==T__41) ) {
					((PrzypisanieAddytContext)_localctx).addyt = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(290);
				wyrazenie(0);
				}
				break;
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

	public static class Wywolanie_funkcjiContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(plplParser.ID, 0); }
		public Lista_parametrow_aktualnychContext lista_parametrow_aktualnych() {
			return getRuleContext(Lista_parametrow_aktualnychContext.class,0);
		}
		public Wywolanie_funkcjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wywolanie_funkcji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWywolanie_funkcji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWywolanie_funkcji(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWywolanie_funkcji(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wywolanie_funkcjiContext wywolanie_funkcji() throws RecognitionException {
		Wywolanie_funkcjiContext _localctx = new Wywolanie_funkcjiContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_wywolanie_funkcji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(ID);
			setState(295);
			match(T__8);
			setState(296);
			lista_parametrow_aktualnych();
			setState(297);
			match(T__9);
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

	public static class Lista_parametrow_aktualnychContext extends ParserRuleContext {
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public Lista_parametrow_aktualnychContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parametrow_aktualnych; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterLista_parametrow_aktualnych(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitLista_parametrow_aktualnych(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitLista_parametrow_aktualnych(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_parametrow_aktualnychContext lista_parametrow_aktualnych() throws RecognitionException {
		Lista_parametrow_aktualnychContext _localctx = new Lista_parametrow_aktualnychContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lista_parametrow_aktualnych);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL) | (1L << ID))) != 0)) {
				{
				setState(299);
				wyrazenie(0);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(300);
					match(T__6);
					setState(301);
					wyrazenie(0);
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Stala_atomicznaContext extends ParserRuleContext {
		public TerminalNode CALK() { return getToken(plplParser.CALK, 0); }
		public TerminalNode ZMIENN() { return getToken(plplParser.ZMIENN, 0); }
		public TerminalNode ZNAK_DOSL() { return getToken(plplParser.ZNAK_DOSL, 0); }
		public Stala_atomicznaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stala_atomiczna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterStala_atomiczna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitStala_atomiczna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitStala_atomiczna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stala_atomicznaContext stala_atomiczna() throws RecognitionException {
		Stala_atomicznaContext _localctx = new Stala_atomicznaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stala_atomiczna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Pelny_typContext extends ParserRuleContext {
		public Nazwa_typu_atomContext nazwa_typu_atom() {
			return getRuleContext(Nazwa_typu_atomContext.class,0);
		}
		public TerminalNode ID() { return getToken(plplParser.ID, 0); }
		public List<TerminalNode> CALK() { return getTokens(plplParser.CALK); }
		public TerminalNode CALK(int i) {
			return getToken(plplParser.CALK, i);
		}
		public Pelny_typContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pelny_typ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterPelny_typ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitPelny_typ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitPelny_typ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pelny_typContext pelny_typ() throws RecognitionException {
		Pelny_typContext _localctx = new Pelny_typContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pelny_typ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
			case T__44:
			case T__45:
				{
				setState(311);
				nazwa_typu_atom();
				}
				break;
			case ID:
				{
				setState(312);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(315);
				match(T__42);
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33) {
				{
				{
				setState(321);
				match(T__33);
				setState(322);
				match(CALK);
				setState(323);
				match(T__34);
				}
				}
				setState(328);
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

	public static class Nazwa_typu_atomContext extends ParserRuleContext {
		public Nazwa_typu_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nazwa_typu_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterNazwa_typu_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitNazwa_typu_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitNazwa_typu_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nazwa_typu_atomContext nazwa_typu_atom() throws RecognitionException {
		Nazwa_typu_atomContext _localctx = new Nazwa_typu_atomContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_nazwa_typu_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return wyrazenie_sempred((WyrazenieContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean wyrazenie_sempred(WyrazenieContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u014e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\3\3\3\3\3\5\3H\n\3\3\4\3\4\3\4\5\4M\n\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\6\5W\n\5\r\5\16\5X\3\5\3\5\3\6\3\6\5\6_\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7k\n\7\3\b\3\b\3\b\3\b\7\bq\n"+
		"\b\f\b\16\bt\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\177\n\b\f\b"+
		"\16\b\u0082\13\b\3\b\3\b\5\b\u0086\n\b\3\t\6\t\u0089\n\t\r\t\16\t\u008a"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0098\n\n\3\13\3\13\5"+
		"\13\u009c\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a7\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00b2\n\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00d0\n\24\f\24"+
		"\16\24\u00d3\13\24\5\24\u00d5\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ea"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u00fb\n\26\f\26\16\26\u00fe\13\26\3\27\3\27\5\27\u0102"+
		"\n\27\3\27\3\27\7\27\u0106\n\27\f\27\16\27\u0109\13\27\7\27\u010b\n\27"+
		"\f\27\16\27\u010e\13\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5"+
		"\32\u0127\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u0131\n\34"+
		"\f\34\16\34\u0134\13\34\5\34\u0136\n\34\3\35\3\35\3\36\3\36\5\36\u013c"+
		"\n\36\3\36\7\36\u013f\n\36\f\36\16\36\u0142\13\36\3\36\3\36\3\36\7\36"+
		"\u0147\n\36\f\36\16\36\u014a\13\36\3\37\3\37\3\37\2\3* \2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\13\3\2\65\66\3\2\62"+
		"\64\3\2\26\27\3\2\31\33\3\2\34\35\3\2\36#\3\2(*\3\2+,\3\2.\60\2\u0161"+
		"\2A\3\2\2\2\4G\3\2\2\2\6I\3\2\2\2\bR\3\2\2\2\n^\3\2\2\2\fj\3\2\2\2\16"+
		"\u0085\3\2\2\2\20\u0088\3\2\2\2\22\u0097\3\2\2\2\24\u0099\3\2\2\2\26\u009f"+
		"\3\2\2\2\30\u00a8\3\2\2\2\32\u00ae\3\2\2\2\34\u00b6\3\2\2\2\36\u00bd\3"+
		"\2\2\2 \u00c3\3\2\2\2\"\u00c6\3\2\2\2$\u00c9\3\2\2\2&\u00d4\3\2\2\2(\u00d6"+
		"\3\2\2\2*\u00e9\3\2\2\2,\u00ff\3\2\2\2.\u010f\3\2\2\2\60\u0113\3\2\2\2"+
		"\62\u0126\3\2\2\2\64\u0128\3\2\2\2\66\u0135\3\2\2\28\u0137\3\2\2\2:\u013b"+
		"\3\2\2\2<\u014b\3\2\2\2>@\5\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2"+
		"\2\2B\3\3\2\2\2CA\3\2\2\2DH\5\6\4\2EH\5\b\5\2FH\5\n\6\2GD\3\2\2\2GE\3"+
		"\2\2\2GF\3\2\2\2H\5\3\2\2\2IL\7\3\2\2JK\7\4\2\2KM\5:\36\2LJ\3\2\2\2LM"+
		"\3\2\2\2MN\3\2\2\2NO\7\5\2\2OP\5\20\t\2PQ\7\6\2\2Q\7\3\2\2\2RS\7\7\2\2"+
		"ST\7\66\2\2TV\7\5\2\2UW\5\n\6\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2"+
		"\2YZ\3\2\2\2Z[\7\6\2\2[\t\3\2\2\2\\_\5\16\b\2]_\5\f\7\2^\\\3\2\2\2^]\3"+
		"\2\2\2_\13\3\2\2\2`a\5:\36\2ab\7\66\2\2bc\7\67\2\2ck\3\2\2\2de\5:\36\2"+
		"ef\7\66\2\2fg\7\b\2\2gh\t\2\2\2hi\7\67\2\2ik\3\2\2\2j`\3\2\2\2jd\3\2\2"+
		"\2k\r\3\2\2\2lm\5<\37\2mr\7\66\2\2no\7\t\2\2oq\7\66\2\2pn\3\2\2\2qt\3"+
		"\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\67\2\2v\u0086\3\2\2"+
		"\2wx\5<\37\2xy\7\66\2\2yz\7\b\2\2z\u0080\t\3\2\2{|\7\66\2\2|}\7\b\2\2"+
		"}\177\t\3\2\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\67\2\2\u0084"+
		"\u0086\3\2\2\2\u0085l\3\2\2\2\u0085w\3\2\2\2\u0086\17\3\2\2\2\u0087\u0089"+
		"\5\22\n\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\21\3\2\2\2\u008c\u0098\5\26\f\2\u008d\u0098"+
		"\5\30\r\2\u008e\u0098\5\24\13\2\u008f\u0098\5$\23\2\u0090\u0098\5\34\17"+
		"\2\u0091\u0098\5 \21\2\u0092\u0098\5\"\22\2\u0093\u0098\5\32\16\2\u0094"+
		"\u0098\5\36\20\2\u0095\u0098\5\16\b\2\u0096\u0098\5\f\7\2\u0097\u008c"+
		"\3\2\2\2\u0097\u008d\3\2\2\2\u0097\u008e\3\2\2\2\u0097\u008f\3\2\2\2\u0097"+
		"\u0090\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2"+
		"\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\23\3\2\2\2\u0099\u009b\7\5\2\2\u009a\u009c\5\20\t\2\u009b\u009a\3\2\2"+
		"\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\6\2\2\u009e\25"+
		"\3\2\2\2\u009f\u00a0\7\n\2\2\u00a0\u00a1\7\13\2\2\u00a1\u00a2\5*\26\2"+
		"\u00a2\u00a3\7\f\2\2\u00a3\u00a6\5\22\n\2\u00a4\u00a5\7\r\2\2\u00a5\u00a7"+
		"\5\22\n\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\27\3\2\2\2\u00a8"+
		"\u00a9\7\16\2\2\u00a9\u00aa\7\13\2\2\u00aa\u00ab\5*\26\2\u00ab\u00ac\7"+
		"\f\2\2\u00ac\u00ad\5\22\n\2\u00ad\31\3\2\2\2\u00ae\u00af\7\17\2\2\u00af"+
		"\u00b1\7\13\2\2\u00b0\u00b2\5*\26\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\f\2\2\u00b4\u00b5\7\67\2\2\u00b5"+
		"\33\3\2\2\2\u00b6\u00b7\7\20\2\2\u00b7\u00b8\7\66\2\2\u00b8\u00b9\7\13"+
		"\2\2\u00b9\u00ba\5&\24\2\u00ba\u00bb\7\f\2\2\u00bb\u00bc\7\67\2\2\u00bc"+
		"\35\3\2\2\2\u00bd\u00be\7\21\2\2\u00be\u00bf\7\13\2\2\u00bf\u00c0\5*\26"+
		"\2\u00c0\u00c1\7\f\2\2\u00c1\u00c2\7\67\2\2\u00c2\37\3\2\2\2\u00c3\u00c4"+
		"\7\22\2\2\u00c4\u00c5\7\67\2\2\u00c5!\3\2\2\2\u00c6\u00c7\7\23\2\2\u00c7"+
		"\u00c8\7\67\2\2\u00c8#\3\2\2\2\u00c9\u00ca\5*\26\2\u00ca\u00cb\7\67\2"+
		"\2\u00cb%\3\2\2\2\u00cc\u00d1\5(\25\2\u00cd\u00ce\7\t\2\2\u00ce\u00d0"+
		"\5(\25\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00cc\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\'\3\2\2\2\u00d6\u00d7\5:\36\2\u00d7\u00d8"+
		"\7\66\2\2\u00d8)\3\2\2\2\u00d9\u00da\b\26\1\2\u00da\u00ea\5\64\33\2\u00db"+
		"\u00ea\5,\27\2\u00dc\u00dd\7\24\2\2\u00dd\u00ea\5,\27\2\u00de\u00df\7"+
		"\25\2\2\u00df\u00ea\5*\26\r\u00e0\u00e1\t\4\2\2\u00e1\u00ea\5*\26\f\u00e2"+
		"\u00ea\5\62\32\2\u00e3\u00ea\58\35\2\u00e4\u00ea\7\66\2\2\u00e5\u00e6"+
		"\7\13\2\2\u00e6\u00e7\5*\26\2\u00e7\u00e8\7\f\2\2\u00e8\u00ea\3\2\2\2"+
		"\u00e9\u00d9\3\2\2\2\u00e9\u00db\3\2\2\2\u00e9\u00dc\3\2\2\2\u00e9\u00de"+
		"\3\2\2\2\u00e9\u00e0\3\2\2\2\u00e9\u00e2\3\2\2\2\u00e9\u00e3\3\2\2\2\u00e9"+
		"\u00e4\3\2\2\2\u00e9\u00e5\3\2\2\2\u00ea\u00fc\3\2\2\2\u00eb\u00ec\f\13"+
		"\2\2\u00ec\u00ed\7\30\2\2\u00ed\u00fb\5*\26\13\u00ee\u00ef\f\n\2\2\u00ef"+
		"\u00f0\t\5\2\2\u00f0\u00fb\5*\26\13\u00f1\u00f2\f\t\2\2\u00f2\u00f3\t"+
		"\4\2\2\u00f3\u00fb\5*\26\n\u00f4\u00f5\f\b\2\2\u00f5\u00f6\t\6\2\2\u00f6"+
		"\u00fb\5*\26\t\u00f7\u00f8\f\7\2\2\u00f8\u00f9\t\7\2\2\u00f9\u00fb\5*"+
		"\26\b\u00fa\u00eb\3\2\2\2\u00fa\u00ee\3\2\2\2\u00fa\u00f1\3\2\2\2\u00fa"+
		"\u00f4\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd+\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101"+
		"\7\66\2\2\u0100\u0102\5.\30\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2"+
		"\u0102\u010c\3\2\2\2\u0103\u0107\5\60\31\2\u0104\u0106\5.\30\2\u0105\u0104"+
		"\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u0103\3\2\2\2\u010b\u010e\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d-\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010f\u0110\7$\2\2\u0110\u0111\5*\26\2\u0111\u0112\7%\2\2\u0112"+
		"/\3\2\2\2\u0113\u0114\7&\2\2\u0114\u0115\7\66\2\2\u0115\61\3\2\2\2\u0116"+
		"\u0117\5,\27\2\u0117\u0118\7\b\2\2\u0118\u0119\5*\26\2\u0119\u0127\3\2"+
		"\2\2\u011a\u011b\5,\27\2\u011b\u011c\7\'\2\2\u011c\u011d\5*\26\2\u011d"+
		"\u0127\3\2\2\2\u011e\u011f\5,\27\2\u011f\u0120\t\b\2\2\u0120\u0121\5*"+
		"\26\2\u0121\u0127\3\2\2\2\u0122\u0123\5,\27\2\u0123\u0124\t\t\2\2\u0124"+
		"\u0125\5*\26\2\u0125\u0127\3\2\2\2\u0126\u0116\3\2\2\2\u0126\u011a\3\2"+
		"\2\2\u0126\u011e\3\2\2\2\u0126\u0122\3\2\2\2\u0127\63\3\2\2\2\u0128\u0129"+
		"\7\66\2\2\u0129\u012a\7\13\2\2\u012a\u012b\5\66\34\2\u012b\u012c\7\f\2"+
		"\2\u012c\65\3\2\2\2\u012d\u0132\5*\26\2\u012e\u012f\7\t\2\2\u012f\u0131"+
		"\5*\26\2\u0130\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u012d\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\67\3\2\2\2\u0137\u0138\t\3\2\2\u01389\3"+
		"\2\2\2\u0139\u013c\5<\37\2\u013a\u013c\7\66\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013a\3\2\2\2\u013c\u0140\3\2\2\2\u013d\u013f\7-\2\2\u013e\u013d\3\2"+
		"\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0148\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7$\2\2\u0144\u0145\7\63"+
		"\2\2\u0145\u0147\7%\2\2\u0146\u0143\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149;\3\2\2\2\u014a\u0148\3\2\2\2"+
		"\u014b\u014c\t\n\2\2\u014c=\3\2\2\2\36AGLX^jr\u0080\u0085\u008a\u0097"+
		"\u009b\u00a6\u00b1\u00d1\u00d4\u00e9\u00fa\u00fc\u0101\u0107\u010c\u0126"+
		"\u0132\u0135\u013b\u0140\u0148";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}