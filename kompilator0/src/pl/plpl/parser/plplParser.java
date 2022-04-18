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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, ZNACZNIK_DEBUGGERA=45, 
		NIC=46, STATYCZN=47, AUTOMATYCZN=48, STAL=49, TCALK=50, TRZECZYW=51, TZNAK=52, 
		TREF=53, ZMIENN=54, CALK=55, ZNAK_DOSL=56, NAPIS_DOSL=57, LINIA_ASEMBLERA=58, 
		ID=59, EOS=60, LINE_COMMENT=61, COMMENT=62, WS=63;
	public static final int
		RULE_program = 0, RULE_byt_globalny = 1, RULE_procedura = 2, RULE_deklaracja_typu = 3, 
		RULE_deklaracja_prosta = 4, RULE_deklaracja_atomiczna = 5, RULE_deklarator_bez_przypisania = 6, 
		RULE_deklarator_atomiczny_z_przypisaniem = 7, RULE_deklaracja_referencji = 8, 
		RULE_lista_instrukcji = 9, RULE_instrukcja = 10, RULE_instrukcja_zlozona = 11, 
		RULE_instrukcja_wyboru = 12, RULE_instrukcja_petli = 13, RULE_instrukcja_powrotu = 14, 
		RULE_instrukcja_wkroczenia = 15, RULE_instrukcja_zakonczenia = 16, RULE_instrukcja_przerwania_petli = 17, 
		RULE_instrukcja_kontynuacji_petli = 18, RULE_wypisanie = 19, RULE_instrukcja_prosta = 20, 
		RULE_wstawka_asemblerowa = 21, RULE_lista_parametrow_formalnych = 22, 
		RULE_deklaracja_parametru = 23, RULE_wyrazenie = 24, RULE_lwartosc = 25, 
		RULE_selektor_tablicowy = 26, RULE_selektor_typu_zlozonego = 27, RULE_przypisanie = 28, 
		RULE_wywolanie_funkcji = 29, RULE_lista_parametrow_aktualnych = 30, RULE_stala_atomiczna = 31, 
		RULE_stala_tablicowa = 32, RULE_pelny_typ = 33, RULE_przydomki = 34, RULE_przydomek = 35, 
		RULE_nazwa_typu_atom = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "byt_globalny", "procedura", "deklaracja_typu", "deklaracja_prosta", 
			"deklaracja_atomiczna", "deklarator_bez_przypisania", "deklarator_atomiczny_z_przypisaniem", 
			"deklaracja_referencji", "lista_instrukcji", "instrukcja", "instrukcja_zlozona", 
			"instrukcja_wyboru", "instrukcja_petli", "instrukcja_powrotu", "instrukcja_wkroczenia", 
			"instrukcja_zakonczenia", "instrukcja_przerwania_petli", "instrukcja_kontynuacji_petli", 
			"wypisanie", "instrukcja_prosta", "wstawka_asemblerowa", "lista_parametrow_formalnych", 
			"deklaracja_parametru", "wyrazenie", "lwartosc", "selektor_tablicowy", 
			"selektor_typu_zlozonego", "przypisanie", "wywolanie_funkcji", "lista_parametrow_aktualnych", 
			"stala_atomiczna", "stala_tablicowa", "pelny_typ", "przydomki", "przydomek", 
			"nazwa_typu_atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'procedura'", "'->'", "'{'", "'}'", "'typ'", "','", "'='", "'je\u015Bli'", 
			"'('", "')'", "'inaczej'", "'dop\u00F3ki'", "'zwr\u00F3\u0107'", "'zacznij'", 
			"'sko\u0144cz'", "'przerwij'", "'kontynuuj'", "'wypisz'", "'@'", "'!'", 
			"'-'", "'+'", "'^'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'=='", "'!='", 
			"'>'", "'<'", "'<='", "'>='", "'['", "']'", "'.'", "'^='", "'*='", "'/='", 
			"'%='", "'+='", "'-='", "'[]'", null, null, null, null, null, null, "'rzeczyw'", 
			"'znak'", "'ref'", null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "ZNACZNIK_DEBUGGERA", 
			"NIC", "STATYCZN", "AUTOMATYCZN", "STAL", "TCALK", "TRZECZYW", "TZNAK", 
			"TREF", "ZMIENN", "CALK", "ZNAK_DOSL", "NAPIS_DOSL", "LINIA_ASEMBLERA", 
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
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << STATYCZN) | (1L << AUTOMATYCZN) | (1L << STAL) | (1L << TCALK) | (1L << TRZECZYW) | (1L << TZNAK) | (1L << TREF) | (1L << ID))) != 0)) {
				{
				{
				setState(74);
				byt_globalny();
				}
				}
				setState(79);
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
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				procedura();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				deklaracja_typu();
				}
				break;
			case STATYCZN:
			case AUTOMATYCZN:
			case STAL:
			case TCALK:
			case TRZECZYW:
			case TZNAK:
			case TREF:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
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
			setState(85);
			match(T__0);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(86);
				match(T__1);
				setState(87);
				pelny_typ();
				}
			}

			setState(90);
			match(T__2);
			setState(91);
			lista_instrukcji();
			setState(92);
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
			setState(94);
			match(T__4);
			setState(95);
			match(ID);
			setState(96);
			match(T__2);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				deklaracja_prosta();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STATYCZN) | (1L << AUTOMATYCZN) | (1L << STAL) | (1L << TCALK) | (1L << TRZECZYW) | (1L << TZNAK) | (1L << TREF) | (1L << ID))) != 0) );
			setState(102);
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
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				deklaracja_atomiczna();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
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

	public static class Deklaracja_atomicznaContext extends ParserRuleContext {
		public PrzydomkiContext przydomki() {
			return getRuleContext(PrzydomkiContext.class,0);
		}
		public Nazwa_typu_atomContext nazwa_typu_atom() {
			return getRuleContext(Nazwa_typu_atomContext.class,0);
		}
		public TerminalNode EOS() { return getToken(plplParser.EOS, 0); }
		public List<Deklarator_atomiczny_z_przypisaniemContext> deklarator_atomiczny_z_przypisaniem() {
			return getRuleContexts(Deklarator_atomiczny_z_przypisaniemContext.class);
		}
		public Deklarator_atomiczny_z_przypisaniemContext deklarator_atomiczny_z_przypisaniem(int i) {
			return getRuleContext(Deklarator_atomiczny_z_przypisaniemContext.class,i);
		}
		public List<Deklarator_bez_przypisaniaContext> deklarator_bez_przypisania() {
			return getRuleContexts(Deklarator_bez_przypisaniaContext.class);
		}
		public Deklarator_bez_przypisaniaContext deklarator_bez_przypisania(int i) {
			return getRuleContext(Deklarator_bez_przypisaniaContext.class,i);
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
		enterRule(_localctx, 10, RULE_deklaracja_atomiczna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			przydomki();
			setState(109);
			nazwa_typu_atom();
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(110);
				deklarator_atomiczny_z_przypisaniem();
				}
				break;
			case 2:
				{
				setState(111);
				deklarator_bez_przypisania();
				}
				break;
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(114);
				match(T__5);
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(115);
					deklarator_atomiczny_z_przypisaniem();
					}
					break;
				case 2:
					{
					setState(116);
					deklarator_bez_przypisania();
					}
					break;
				}
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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

	public static class Deklarator_bez_przypisaniaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(plplParser.ID, 0); }
		public Deklarator_bez_przypisaniaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklarator_bez_przypisania; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterDeklarator_bez_przypisania(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitDeklarator_bez_przypisania(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitDeklarator_bez_przypisania(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deklarator_bez_przypisaniaContext deklarator_bez_przypisania() throws RecognitionException {
		Deklarator_bez_przypisaniaContext _localctx = new Deklarator_bez_przypisaniaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_deklarator_bez_przypisania);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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

	public static class Deklarator_atomiczny_z_przypisaniemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(plplParser.ID, 0); }
		public TerminalNode CALK() { return getToken(plplParser.CALK, 0); }
		public TerminalNode ZMIENN() { return getToken(plplParser.ZMIENN, 0); }
		public TerminalNode ZNAK_DOSL() { return getToken(plplParser.ZNAK_DOSL, 0); }
		public Deklarator_atomiczny_z_przypisaniemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklarator_atomiczny_z_przypisaniem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterDeklarator_atomiczny_z_przypisaniem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitDeklarator_atomiczny_z_przypisaniem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitDeklarator_atomiczny_z_przypisaniem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deklarator_atomiczny_z_przypisaniemContext deklarator_atomiczny_z_przypisaniem() throws RecognitionException {
		Deklarator_atomiczny_z_przypisaniemContext _localctx = new Deklarator_atomiczny_z_przypisaniemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_deklarator_atomiczny_z_przypisaniem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(ID);
			setState(129);
			match(T__6);
			setState(130);
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

	public static class Deklaracja_referencjiContext extends ParserRuleContext {
		public PrzydomkiContext przydomki() {
			return getRuleContext(PrzydomkiContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_deklaracja_referencji);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				przydomki();
				setState(133);
				pelny_typ();
				setState(134);
				match(ID);
				setState(135);
				match(EOS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				przydomki();
				setState(138);
				pelny_typ();
				setState(139);
				match(ID);
				setState(140);
				match(T__6);
				setState(141);
				_la = _input.LA(1);
				if ( !(_la==NAPIS_DOSL || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(142);
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
		enterRule(_localctx, 18, RULE_lista_instrukcji);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				instrukcja();
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << STATYCZN) | (1L << AUTOMATYCZN) | (1L << STAL) | (1L << TCALK) | (1L << TRZECZYW) | (1L << TZNAK) | (1L << TREF) | (1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL) | (1L << LINIA_ASEMBLERA) | (1L << ID))) != 0) );
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
		public Wstawka_asemblerowaContext wstawka_asemblerowa() {
			return getRuleContext(Wstawka_asemblerowaContext.class,0);
		}
		public WypisanieContext wypisanie() {
			return getRuleContext(WypisanieContext.class,0);
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
		enterRule(_localctx, 20, RULE_instrukcja);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				instrukcja_wyboru();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				instrukcja_petli();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				instrukcja_zlozona();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				instrukcja_prosta();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				instrukcja_wkroczenia();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				instrukcja_przerwania_petli();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
				instrukcja_kontynuacji_petli();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(158);
				instrukcja_powrotu();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(159);
				instrukcja_zakonczenia();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(160);
				deklaracja_atomiczna();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(161);
				deklaracja_referencji();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(162);
				wstawka_asemblerowa();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(163);
				wypisanie();
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
		enterRule(_localctx, 22, RULE_instrukcja_zlozona);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__2);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << STATYCZN) | (1L << AUTOMATYCZN) | (1L << STAL) | (1L << TCALK) | (1L << TRZECZYW) | (1L << TZNAK) | (1L << TREF) | (1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL) | (1L << LINIA_ASEMBLERA) | (1L << ID))) != 0)) {
				{
				setState(167);
				lista_instrukcji();
				}
			}

			setState(170);
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
		enterRule(_localctx, 24, RULE_instrukcja_wyboru);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__7);
			setState(173);
			match(T__8);
			setState(174);
			wyrazenie(0);
			setState(175);
			match(T__9);
			setState(176);
			instrukcja();
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(177);
				match(T__10);
				setState(178);
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
		enterRule(_localctx, 26, RULE_instrukcja_petli);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__11);
			setState(182);
			match(T__8);
			setState(183);
			wyrazenie(0);
			setState(184);
			match(T__9);
			setState(185);
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
		enterRule(_localctx, 28, RULE_instrukcja_powrotu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__12);
			setState(188);
			match(T__8);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL) | (1L << ID))) != 0)) {
				{
				setState(189);
				wyrazenie(0);
				}
			}

			setState(192);
			match(T__9);
			setState(193);
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
		enterRule(_localctx, 30, RULE_instrukcja_wkroczenia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__13);
			setState(196);
			match(ID);
			setState(197);
			match(T__8);
			setState(198);
			lista_parametrow_formalnych();
			setState(199);
			match(T__9);
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
		enterRule(_localctx, 32, RULE_instrukcja_zakonczenia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__14);
			setState(203);
			match(T__8);
			setState(204);
			wyrazenie(0);
			setState(205);
			match(T__9);
			setState(206);
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
		enterRule(_localctx, 34, RULE_instrukcja_przerwania_petli);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__15);
			setState(209);
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
		enterRule(_localctx, 36, RULE_instrukcja_kontynuacji_petli);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__16);
			setState(212);
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

	public static class WypisanieContext extends ParserRuleContext {
		public TerminalNode EOS() { return getToken(plplParser.EOS, 0); }
		public Stala_tablicowaContext stala_tablicowa() {
			return getRuleContext(Stala_tablicowaContext.class,0);
		}
		public TerminalNode ID() { return getToken(plplParser.ID, 0); }
		public WypisanieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wypisanie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWypisanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWypisanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWypisanie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WypisanieContext wypisanie() throws RecognitionException {
		WypisanieContext _localctx = new WypisanieContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_wypisanie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__17);
			setState(215);
			match(T__8);
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAPIS_DOSL:
				{
				setState(216);
				stala_tablicowa();
				}
				break;
			case ID:
				{
				setState(217);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(220);
			match(T__9);
			setState(221);
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
		enterRule(_localctx, 40, RULE_instrukcja_prosta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			wyrazenie(0);
			setState(224);
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

	public static class Wstawka_asemblerowaContext extends ParserRuleContext {
		public TerminalNode LINIA_ASEMBLERA() { return getToken(plplParser.LINIA_ASEMBLERA, 0); }
		public Wstawka_asemblerowaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wstawka_asemblerowa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWstawka_asemblerowa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWstawka_asemblerowa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWstawka_asemblerowa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wstawka_asemblerowaContext wstawka_asemblerowa() throws RecognitionException {
		Wstawka_asemblerowaContext _localctx = new Wstawka_asemblerowaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_wstawka_asemblerowa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(LINIA_ASEMBLERA);
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
		enterRule(_localctx, 44, RULE_lista_parametrow_formalnych);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TCALK) | (1L << TRZECZYW) | (1L << TZNAK) | (1L << TREF) | (1L << ID))) != 0)) {
				{
				setState(228);
				deklaracja_parametru();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(229);
					match(T__5);
					setState(230);
					deklaracja_parametru();
					}
					}
					setState(235);
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
		enterRule(_localctx, 46, RULE_deklaracja_parametru);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			pelny_typ();
			setState(239);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_wyrazenie, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new WyrazenieWywolanieContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(242);
				wywolanie_funkcji();
				}
				break;
			case 2:
				{
				_localctx = new WyrazenieLwartoscContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				lwartosc();
				}
				break;
			case 3:
				{
				_localctx = new WyrazenieAdresContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				((WyrazenieAdresContext)_localctx).adr = match(T__18);
				setState(245);
				lwartosc();
				}
				break;
			case 4:
				{
				_localctx = new WyrazenieNegacjaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				((WyrazenieNegacjaContext)_localctx).neg = match(T__19);
				setState(247);
				wyrazenie(10);
				}
				break;
			case 5:
				{
				_localctx = new WyrazenieZnakContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				((WyrazenieZnakContext)_localctx).znak = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
					((WyrazenieZnakContext)_localctx).znak = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(249);
				wyrazenie(9);
				}
				break;
			case 6:
				{
				_localctx = new WyrazeniePrzypisanieContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				przypisanie();
				}
				break;
			case 7:
				{
				_localctx = new WyrazenieStalaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				stala_atomiczna();
				}
				break;
			case 8:
				{
				_localctx = new WyrazenieNawiasyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				match(T__8);
				setState(253);
				wyrazenie(0);
				setState(254);
				match(T__9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new WyrazeniePotegContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(258);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(259);
						match(T__22);
						setState(260);
						wyrazenie(8);
						}
						break;
					case 2:
						{
						_localctx = new WyrazenieMultContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(261);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(262);
						((WyrazenieMultContext)_localctx).mult = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
							((WyrazenieMultContext)_localctx).mult = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(263);
						wyrazenie(8);
						}
						break;
					case 3:
						{
						_localctx = new WyrazenieAddytContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(264);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(265);
						((WyrazenieAddytContext)_localctx).addyt = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
							((WyrazenieAddytContext)_localctx).addyt = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(266);
						wyrazenie(7);
						}
						break;
					case 4:
						{
						_localctx = new WyrazenieLogiczContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(267);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(268);
						((WyrazenieLogiczContext)_localctx).logicz = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
							((WyrazenieLogiczContext)_localctx).logicz = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(269);
						wyrazenie(6);
						}
						break;
					case 5:
						{
						_localctx = new WyrazeniePorownanieContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(270);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(271);
						((WyrazeniePorownanieContext)_localctx).porownanie = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
							((WyrazeniePorownanieContext)_localctx).porownanie = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(272);
						wyrazenie(5);
						}
						break;
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 50, RULE_lwartosc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(ID);
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(279);
				selektor_tablicowy();
				}
				break;
			}
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(282);
					selektor_typu_zlozonego();
					setState(286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(283);
							selektor_tablicowy();
							}
							} 
						}
						setState(288);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					}
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 52, RULE_selektor_tablicowy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__34);
			setState(295);
			wyrazenie(0);
			setState(296);
			match(T__35);
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
		enterRule(_localctx, 54, RULE_selektor_typu_zlozonego);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__36);
			setState(299);
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
		enterRule(_localctx, 56, RULE_przypisanie);
		int _la;
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new PrzypisanieZwykleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				lwartosc();
				setState(302);
				match(T__6);
				setState(303);
				wyrazenie(0);
				}
				break;
			case 2:
				_localctx = new PrzypisaniePotegContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				lwartosc();
				setState(306);
				match(T__37);
				setState(307);
				wyrazenie(0);
				}
				break;
			case 3:
				_localctx = new PrzypisanieMultContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				lwartosc();
				setState(310);
				((PrzypisanieMultContext)_localctx).mult = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
					((PrzypisanieMultContext)_localctx).mult = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(311);
				wyrazenie(0);
				}
				break;
			case 4:
				_localctx = new PrzypisanieAddytContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				lwartosc();
				setState(314);
				((PrzypisanieAddytContext)_localctx).addyt = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__41 || _la==T__42) ) {
					((PrzypisanieAddytContext)_localctx).addyt = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(315);
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
		enterRule(_localctx, 58, RULE_wywolanie_funkcji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(ID);
			setState(320);
			match(T__8);
			setState(321);
			lista_parametrow_aktualnych();
			setState(322);
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
		enterRule(_localctx, 60, RULE_lista_parametrow_aktualnych);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL) | (1L << ID))) != 0)) {
				{
				setState(324);
				wyrazenie(0);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(325);
					match(T__5);
					setState(326);
					wyrazenie(0);
					}
					}
					setState(331);
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
		enterRule(_localctx, 62, RULE_stala_atomiczna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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

	public static class Stala_tablicowaContext extends ParserRuleContext {
		public TerminalNode NAPIS_DOSL() { return getToken(plplParser.NAPIS_DOSL, 0); }
		public Stala_tablicowaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stala_tablicowa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterStala_tablicowa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitStala_tablicowa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitStala_tablicowa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stala_tablicowaContext stala_tablicowa() throws RecognitionException {
		Stala_tablicowaContext _localctx = new Stala_tablicowaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_stala_tablicowa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(NAPIS_DOSL);
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
		enterRule(_localctx, 66, RULE_pelny_typ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TCALK:
			case TRZECZYW:
			case TZNAK:
			case TREF:
				{
				setState(338);
				nazwa_typu_atom();
				}
				break;
			case ID:
				{
				setState(339);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__43) {
				{
				{
				setState(342);
				match(T__43);
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__34) {
				{
				{
				setState(348);
				match(T__34);
				setState(349);
				match(CALK);
				setState(350);
				match(T__35);
				}
				}
				setState(355);
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

	public static class PrzydomkiContext extends ParserRuleContext {
		public TerminalNode STAL() { return getToken(plplParser.STAL, 0); }
		public TerminalNode STATYCZN() { return getToken(plplParser.STATYCZN, 0); }
		public TerminalNode AUTOMATYCZN() { return getToken(plplParser.AUTOMATYCZN, 0); }
		public PrzydomkiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_przydomki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterPrzydomki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitPrzydomki(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitPrzydomki(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrzydomkiContext przydomki() throws RecognitionException {
		PrzydomkiContext _localctx = new PrzydomkiContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_przydomki);
		int _la;
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATYCZN || _la==AUTOMATYCZN) {
					{
					setState(356);
					_la = _input.LA(1);
					if ( !(_la==STATYCZN || _la==AUTOMATYCZN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAL) {
					{
					setState(359);
					match(STAL);
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAL) {
					{
					setState(362);
					match(STAL);
					}
				}

				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATYCZN || _la==AUTOMATYCZN) {
					{
					setState(365);
					_la = _input.LA(1);
					if ( !(_la==STATYCZN || _la==AUTOMATYCZN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
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

	public static class PrzydomekContext extends ParserRuleContext {
		public TerminalNode STATYCZN() { return getToken(plplParser.STATYCZN, 0); }
		public TerminalNode AUTOMATYCZN() { return getToken(plplParser.AUTOMATYCZN, 0); }
		public TerminalNode STAL() { return getToken(plplParser.STAL, 0); }
		public PrzydomekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_przydomek; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterPrzydomek(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitPrzydomek(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitPrzydomek(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrzydomekContext przydomek() throws RecognitionException {
		PrzydomekContext _localctx = new PrzydomekContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_przydomek);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STATYCZN) | (1L << AUTOMATYCZN) | (1L << STAL))) != 0)) ) {
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

	public static class Nazwa_typu_atomContext extends ParserRuleContext {
		public TerminalNode TCALK() { return getToken(plplParser.TCALK, 0); }
		public TerminalNode TRZECZYW() { return getToken(plplParser.TRZECZYW, 0); }
		public TerminalNode TZNAK() { return getToken(plplParser.TZNAK, 0); }
		public TerminalNode TREF() { return getToken(plplParser.TREF, 0); }
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
		enterRule(_localctx, 72, RULE_nazwa_typu_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TCALK) | (1L << TRZECZYW) | (1L << TZNAK) | (1L << TREF))) != 0)) ) {
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
		case 24:
			return wyrazenie_sempred((WyrazenieContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean wyrazenie_sempred(WyrazenieContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u0179\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\3\3"+
		"\3\3\3\5\3V\n\3\3\4\3\4\3\4\5\4[\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6"+
		"\5e\n\5\r\5\16\5f\3\5\3\5\3\6\3\6\5\6m\n\6\3\7\3\7\3\7\3\7\5\7s\n\7\3"+
		"\7\3\7\3\7\5\7x\n\7\7\7z\n\7\f\7\16\7}\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0093\n\n\3"+
		"\13\6\13\u0096\n\13\r\13\16\13\u0097\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00a7\n\f\3\r\3\r\5\r\u00ab\n\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b6\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\5\20\u00c1\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\5\25\u00dd\n\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\7\30\u00ea\n\30\f\30\16\30\u00ed\13\30\5\30"+
		"\u00ef\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0103\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0114\n\32\f\32"+
		"\16\32\u0117\13\32\3\33\3\33\5\33\u011b\n\33\3\33\3\33\7\33\u011f\n\33"+
		"\f\33\16\33\u0122\13\33\7\33\u0124\n\33\f\33\16\33\u0127\13\33\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0140\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \7 \u014a\n \f \16 \u014d\13 \5 \u014f\n \3!\3!\3\""+
		"\3\"\3#\3#\5#\u0157\n#\3#\7#\u015a\n#\f#\16#\u015d\13#\3#\3#\3#\7#\u0162"+
		"\n#\f#\16#\u0165\13#\3$\5$\u0168\n$\3$\5$\u016b\n$\3$\5$\u016e\n$\3$\5"+
		"$\u0171\n$\5$\u0173\n$\3%\3%\3&\3&\3&\2\3\62\'\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\r\3\28:\4\2;;==\3\2\27"+
		"\30\3\2\32\34\3\2\35\36\3\2\37$\3\2)+\3\2,-\3\2\61\62\3\2\61\63\3\2\64"+
		"\67\2\u018c\2O\3\2\2\2\4U\3\2\2\2\6W\3\2\2\2\b`\3\2\2\2\nl\3\2\2\2\fn"+
		"\3\2\2\2\16\u0080\3\2\2\2\20\u0082\3\2\2\2\22\u0092\3\2\2\2\24\u0095\3"+
		"\2\2\2\26\u00a6\3\2\2\2\30\u00a8\3\2\2\2\32\u00ae\3\2\2\2\34\u00b7\3\2"+
		"\2\2\36\u00bd\3\2\2\2 \u00c5\3\2\2\2\"\u00cc\3\2\2\2$\u00d2\3\2\2\2&\u00d5"+
		"\3\2\2\2(\u00d8\3\2\2\2*\u00e1\3\2\2\2,\u00e4\3\2\2\2.\u00ee\3\2\2\2\60"+
		"\u00f0\3\2\2\2\62\u0102\3\2\2\2\64\u0118\3\2\2\2\66\u0128\3\2\2\28\u012c"+
		"\3\2\2\2:\u013f\3\2\2\2<\u0141\3\2\2\2>\u014e\3\2\2\2@\u0150\3\2\2\2B"+
		"\u0152\3\2\2\2D\u0156\3\2\2\2F\u0172\3\2\2\2H\u0174\3\2\2\2J\u0176\3\2"+
		"\2\2LN\5\4\3\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\3\3\2\2\2QO\3"+
		"\2\2\2RV\5\6\4\2SV\5\b\5\2TV\5\n\6\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\5"+
		"\3\2\2\2WZ\7\3\2\2XY\7\4\2\2Y[\5D#\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\"+
		"]\7\5\2\2]^\5\24\13\2^_\7\6\2\2_\7\3\2\2\2`a\7\7\2\2ab\7=\2\2bd\7\5\2"+
		"\2ce\5\n\6\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\6\2"+
		"\2i\t\3\2\2\2jm\5\f\7\2km\5\22\n\2lj\3\2\2\2lk\3\2\2\2m\13\3\2\2\2no\5"+
		"F$\2or\5J&\2ps\5\20\t\2qs\5\16\b\2rp\3\2\2\2rq\3\2\2\2s{\3\2\2\2tw\7\b"+
		"\2\2ux\5\20\t\2vx\5\16\b\2wu\3\2\2\2wv\3\2\2\2xz\3\2\2\2yt\3\2\2\2z}\3"+
		"\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7>\2\2\177\r\3\2\2"+
		"\2\u0080\u0081\7=\2\2\u0081\17\3\2\2\2\u0082\u0083\7=\2\2\u0083\u0084"+
		"\7\t\2\2\u0084\u0085\t\2\2\2\u0085\21\3\2\2\2\u0086\u0087\5F$\2\u0087"+
		"\u0088\5D#\2\u0088\u0089\7=\2\2\u0089\u008a\7>\2\2\u008a\u0093\3\2\2\2"+
		"\u008b\u008c\5F$\2\u008c\u008d\5D#\2\u008d\u008e\7=\2\2\u008e\u008f\7"+
		"\t\2\2\u008f\u0090\t\3\2\2\u0090\u0091\7>\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0086\3\2\2\2\u0092\u008b\3\2\2\2\u0093\23\3\2\2\2\u0094\u0096\5\26\f"+
		"\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\25\3\2\2\2\u0099\u00a7\5\32\16\2\u009a\u00a7\5\34\17\2"+
		"\u009b\u00a7\5\30\r\2\u009c\u00a7\5*\26\2\u009d\u00a7\5 \21\2\u009e\u00a7"+
		"\5$\23\2\u009f\u00a7\5&\24\2\u00a0\u00a7\5\36\20\2\u00a1\u00a7\5\"\22"+
		"\2\u00a2\u00a7\5\f\7\2\u00a3\u00a7\5\22\n\2\u00a4\u00a7\5,\27\2\u00a5"+
		"\u00a7\5(\25\2\u00a6\u0099\3\2\2\2\u00a6\u009a\3\2\2\2\u00a6\u009b\3\2"+
		"\2\2\u00a6\u009c\3\2\2\2\u00a6\u009d\3\2\2\2\u00a6\u009e\3\2\2\2\u00a6"+
		"\u009f\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2"+
		"\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\27\3\2\2\2\u00a8\u00aa\7\5\2\2\u00a9\u00ab\5\24\13\2\u00aa\u00a9\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\6\2\2\u00ad"+
		"\31\3\2\2\2\u00ae\u00af\7\n\2\2\u00af\u00b0\7\13\2\2\u00b0\u00b1\5\62"+
		"\32\2\u00b1\u00b2\7\f\2\2\u00b2\u00b5\5\26\f\2\u00b3\u00b4\7\r\2\2\u00b4"+
		"\u00b6\5\26\f\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\33\3\2\2"+
		"\2\u00b7\u00b8\7\16\2\2\u00b8\u00b9\7\13\2\2\u00b9\u00ba\5\62\32\2\u00ba"+
		"\u00bb\7\f\2\2\u00bb\u00bc\5\26\f\2\u00bc\35\3\2\2\2\u00bd\u00be\7\17"+
		"\2\2\u00be\u00c0\7\13\2\2\u00bf\u00c1\5\62\32\2\u00c0\u00bf\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\f\2\2\u00c3\u00c4\7>"+
		"\2\2\u00c4\37\3\2\2\2\u00c5\u00c6\7\20\2\2\u00c6\u00c7\7=\2\2\u00c7\u00c8"+
		"\7\13\2\2\u00c8\u00c9\5.\30\2\u00c9\u00ca\7\f\2\2\u00ca\u00cb\7>\2\2\u00cb"+
		"!\3\2\2\2\u00cc\u00cd\7\21\2\2\u00cd\u00ce\7\13\2\2\u00ce\u00cf\5\62\32"+
		"\2\u00cf\u00d0\7\f\2\2\u00d0\u00d1\7>\2\2\u00d1#\3\2\2\2\u00d2\u00d3\7"+
		"\22\2\2\u00d3\u00d4\7>\2\2\u00d4%\3\2\2\2\u00d5\u00d6\7\23\2\2\u00d6\u00d7"+
		"\7>\2\2\u00d7\'\3\2\2\2\u00d8\u00d9\7\24\2\2\u00d9\u00dc\7\13\2\2\u00da"+
		"\u00dd\5B\"\2\u00db\u00dd\7=\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2"+
		"\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\f\2\2\u00df\u00e0\7>\2\2\u00e0)\3"+
		"\2\2\2\u00e1\u00e2\5\62\32\2\u00e2\u00e3\7>\2\2\u00e3+\3\2\2\2\u00e4\u00e5"+
		"\7<\2\2\u00e5-\3\2\2\2\u00e6\u00eb\5\60\31\2\u00e7\u00e8\7\b\2\2\u00e8"+
		"\u00ea\5\60\31\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3"+
		"\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00e6\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef/\3\2\2\2\u00f0\u00f1\5D#\2\u00f1"+
		"\u00f2\7=\2\2\u00f2\61\3\2\2\2\u00f3\u00f4\b\32\1\2\u00f4\u0103\5<\37"+
		"\2\u00f5\u0103\5\64\33\2\u00f6\u00f7\7\25\2\2\u00f7\u0103\5\64\33\2\u00f8"+
		"\u00f9\7\26\2\2\u00f9\u0103\5\62\32\f\u00fa\u00fb\t\4\2\2\u00fb\u0103"+
		"\5\62\32\13\u00fc\u0103\5:\36\2\u00fd\u0103\5@!\2\u00fe\u00ff\7\13\2\2"+
		"\u00ff\u0100\5\62\32\2\u0100\u0101\7\f\2\2\u0101\u0103\3\2\2\2\u0102\u00f3"+
		"\3\2\2\2\u0102\u00f5\3\2\2\2\u0102\u00f6\3\2\2\2\u0102\u00f8\3\2\2\2\u0102"+
		"\u00fa\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2"+
		"\2\2\u0103\u0115\3\2\2\2\u0104\u0105\f\n\2\2\u0105\u0106\7\31\2\2\u0106"+
		"\u0114\5\62\32\n\u0107\u0108\f\t\2\2\u0108\u0109\t\5\2\2\u0109\u0114\5"+
		"\62\32\n\u010a\u010b\f\b\2\2\u010b\u010c\t\4\2\2\u010c\u0114\5\62\32\t"+
		"\u010d\u010e\f\7\2\2\u010e\u010f\t\6\2\2\u010f\u0114\5\62\32\b\u0110\u0111"+
		"\f\6\2\2\u0111\u0112\t\7\2\2\u0112\u0114\5\62\32\7\u0113\u0104\3\2\2\2"+
		"\u0113\u0107\3\2\2\2\u0113\u010a\3\2\2\2\u0113\u010d\3\2\2\2\u0113\u0110"+
		"\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\63\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\7=\2\2\u0119\u011b\5\66\34"+
		"\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0125\3\2\2\2\u011c\u0120"+
		"\58\35\2\u011d\u011f\5\66\34\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2"+
		"\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0123\u011c\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\65\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7%\2\2"+
		"\u0129\u012a\5\62\32\2\u012a\u012b\7&\2\2\u012b\67\3\2\2\2\u012c\u012d"+
		"\7\'\2\2\u012d\u012e\7=\2\2\u012e9\3\2\2\2\u012f\u0130\5\64\33\2\u0130"+
		"\u0131\7\t\2\2\u0131\u0132\5\62\32\2\u0132\u0140\3\2\2\2\u0133\u0134\5"+
		"\64\33\2\u0134\u0135\7(\2\2\u0135\u0136\5\62\32\2\u0136\u0140\3\2\2\2"+
		"\u0137\u0138\5\64\33\2\u0138\u0139\t\b\2\2\u0139\u013a\5\62\32\2\u013a"+
		"\u0140\3\2\2\2\u013b\u013c\5\64\33\2\u013c\u013d\t\t\2\2\u013d\u013e\5"+
		"\62\32\2\u013e\u0140\3\2\2\2\u013f\u012f\3\2\2\2\u013f\u0133\3\2\2\2\u013f"+
		"\u0137\3\2\2\2\u013f\u013b\3\2\2\2\u0140;\3\2\2\2\u0141\u0142\7=\2\2\u0142"+
		"\u0143\7\13\2\2\u0143\u0144\5> \2\u0144\u0145\7\f\2\2\u0145=\3\2\2\2\u0146"+
		"\u014b\5\62\32\2\u0147\u0148\7\b\2\2\u0148\u014a\5\62\32\2\u0149\u0147"+
		"\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0146\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f?\3\2\2\2\u0150\u0151\t\2\2\2\u0151A\3\2\2\2\u0152\u0153\7;"+
		"\2\2\u0153C\3\2\2\2\u0154\u0157\5J&\2\u0155\u0157\7=\2\2\u0156\u0154\3"+
		"\2\2\2\u0156\u0155\3\2\2\2\u0157\u015b\3\2\2\2\u0158\u015a\7.\2\2\u0159"+
		"\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u0163\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\7%\2\2\u015f"+
		"\u0160\79\2\2\u0160\u0162\7&\2\2\u0161\u015e\3\2\2\2\u0162\u0165\3\2\2"+
		"\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164E\3\2\2\2\u0165\u0163"+
		"\3\2\2\2\u0166\u0168\t\n\2\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u016a\3\2\2\2\u0169\u016b\7\63\2\2\u016a\u0169\3\2\2\2\u016a\u016b\3"+
		"\2\2\2\u016b\u0173\3\2\2\2\u016c\u016e\7\63\2\2\u016d\u016c\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0171\t\n\2\2\u0170\u016f\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0167\3\2\2\2\u0172"+
		"\u016d\3\2\2\2\u0173G\3\2\2\2\u0174\u0175\t\13\2\2\u0175I\3\2\2\2\u0176"+
		"\u0177\t\f\2\2\u0177K\3\2\2\2$OUZflrw{\u0092\u0097\u00a6\u00aa\u00b5\u00c0"+
		"\u00dc\u00eb\u00ee\u0102\u0113\u0115\u011a\u0120\u0125\u013f\u014b\u014e"+
		"\u0156\u015b\u0163\u0167\u016a\u016d\u0170\u0172";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}