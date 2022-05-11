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
		T__38=39, T__39=40, T__40=41, ZNACZNIK_DEBUGGERA=42, NIC=43, STATYCZN=44, 
		AUTOMATYCZN=45, STAL=46, TCALK=47, TRZECZYW=48, TZNAK=49, TREF=50, PRZERWIJ=51, 
		KONTYNUUJ=52, ZMIENN=53, CALK=54, ZNAK_DOSL=55, NAPIS_DOSL=56, LINIA_ASEMBLERA=57, 
		ID=58, EOS=59, LINE_COMMENT=60, COMMENT=61, WS=62;
	public static final int
		RULE_program = 0, RULE_byt_globalny = 1, RULE_procedura = 2, RULE_typ_zwracany = 3, 
		RULE_deklaracja_typu = 4, RULE_deklaracja_prosta = 5, RULE_deklaracja_atomiczna = 6, 
		RULE_deklarator_bez_przypisania = 7, RULE_deklarator_atomiczny_z_przypisaniem = 8, 
		RULE_deklaracja_referencji = 9, RULE_deklarator_zlozony_z_przypisaniem = 10, 
		RULE_lista_instrukcji = 11, RULE_instrukcja = 12, RULE_instrukcja_zlozona = 13, 
		RULE_instrukcja_wyboru = 14, RULE_instrukcja_petli = 15, RULE_instrukcja_powrotu = 16, 
		RULE_instrukcja_wkroczenia = 17, RULE_instrukcja_zakonczenia = 18, RULE_instrukcja_przerwania_petli = 19, 
		RULE_instrukcja_kontynuacji_petli = 20, RULE_wypisanie = 21, RULE_instrukcja_prosta = 22, 
		RULE_wstawka_asemblerowa = 23, RULE_lista_parametrow_formalnych = 24, 
		RULE_deklaracja_parametru = 25, RULE_wyrazenie = 26, RULE_lwartosc = 27, 
		RULE_selektor_tablicowy = 28, RULE_selektor_typu_zlozonego = 29, RULE_przypisanie = 30, 
		RULE_wywolanie_funkcji = 31, RULE_lista_parametrow_aktualnych = 32, RULE_stala_atomiczna = 33, 
		RULE_stala_tablicowa = 34, RULE_pelny_typ = 35, RULE_nieokreslony_deklarator_tablicowy = 36, 
		RULE_okreslony_deklarator_tablicowy = 37, RULE_przydomki = 38, RULE_nazwa_typu_atom = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "byt_globalny", "procedura", "typ_zwracany", "deklaracja_typu", 
			"deklaracja_prosta", "deklaracja_atomiczna", "deklarator_bez_przypisania", 
			"deklarator_atomiczny_z_przypisaniem", "deklaracja_referencji", "deklarator_zlozony_z_przypisaniem", 
			"lista_instrukcji", "instrukcja", "instrukcja_zlozona", "instrukcja_wyboru", 
			"instrukcja_petli", "instrukcja_powrotu", "instrukcja_wkroczenia", "instrukcja_zakonczenia", 
			"instrukcja_przerwania_petli", "instrukcja_kontynuacji_petli", "wypisanie", 
			"instrukcja_prosta", "wstawka_asemblerowa", "lista_parametrow_formalnych", 
			"deklaracja_parametru", "wyrazenie", "lwartosc", "selektor_tablicowy", 
			"selektor_typu_zlozonego", "przypisanie", "wywolanie_funkcji", "lista_parametrow_aktualnych", 
			"stala_atomiczna", "stala_tablicowa", "pelny_typ", "nieokreslony_deklarator_tablicowy", 
			"okreslony_deklarator_tablicowy", "przydomki", "nazwa_typu_atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'procedura'", "'->'", "'{'", "'}'", "'typ'", "','", "'='", "'je\u015Bli'", 
			"'('", "')'", "'inaczej'", "'dop\u00F3ki'", "'zwr\u00F3\u0107'", "'zacznij'", 
			"'sko\u0144cz'", "'wypisz'", "'@'", "'!'", "'-'", "'+'", "'^'", "'*'", 
			"'/'", "'%'", "'&&'", "'||'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", 
			"'['", "']'", "'.'", "'^='", "'*='", "'/='", "'%='", "'+='", "'-='", 
			null, null, null, null, null, null, "'rzeczyw'", "'znak'", "'ref'", "'przerwij'", 
			null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ZNACZNIK_DEBUGGERA", "NIC", "STATYCZN", 
			"AUTOMATYCZN", "STAL", "TCALK", "TRZECZYW", "TZNAK", "TREF", "PRZERWIJ", 
			"KONTYNUUJ", "ZMIENN", "CALK", "ZNAK_DOSL", "NAPIS_DOSL", "LINIA_ASEMBLERA", 
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
		public TerminalNode EOF() { return getToken(plplParser.EOF, 0); }
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << STATYCZN) | (1L << AUTOMATYCZN) | (1L << STAL) | (1L << TCALK) | (1L << TRZECZYW) | (1L << TZNAK) | (1L << TREF) | (1L << ID))) != 0)) {
				{
				{
				setState(80);
				byt_globalny();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(EOF);
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
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				procedura();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
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
				setState(90);
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
		public Typ_zwracanyContext typ_zwracany() {
			return getRuleContext(Typ_zwracanyContext.class,0);
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
			setState(93);
			match(T__0);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(94);
				match(T__1);
				setState(95);
				typ_zwracany();
				}
			}

			setState(98);
			match(T__2);
			setState(99);
			lista_instrukcji();
			setState(100);
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

	public static class Typ_zwracanyContext extends ParserRuleContext {
		public Pelny_typContext pelny_typ() {
			return getRuleContext(Pelny_typContext.class,0);
		}
		public Typ_zwracanyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typ_zwracany; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterTyp_zwracany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitTyp_zwracany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitTyp_zwracany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typ_zwracanyContext typ_zwracany() throws RecognitionException {
		Typ_zwracanyContext _localctx = new Typ_zwracanyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typ_zwracany);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			pelny_typ();
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
		enterRule(_localctx, 8, RULE_deklaracja_typu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__4);
			setState(105);
			match(ID);
			setState(106);
			match(T__2);
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				deklaracja_prosta();
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STATYCZN) | (1L << AUTOMATYCZN) | (1L << STAL) | (1L << TCALK) | (1L << TRZECZYW) | (1L << TZNAK) | (1L << TREF) | (1L << ID))) != 0) );
			setState(112);
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
		enterRule(_localctx, 10, RULE_deklaracja_prosta);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				deklaracja_atomiczna();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
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
		enterRule(_localctx, 12, RULE_deklaracja_atomiczna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			przydomki();
			setState(119);
			nazwa_typu_atom();
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(120);
				deklarator_atomiczny_z_przypisaniem();
				}
				break;
			case 2:
				{
				setState(121);
				deklarator_bez_przypisania();
				}
				break;
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(124);
				match(T__5);
				setState(127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(125);
					deklarator_atomiczny_z_przypisaniem();
					}
					break;
				case 2:
					{
					setState(126);
					deklarator_bez_przypisania();
					}
					break;
				}
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
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
		enterRule(_localctx, 14, RULE_deklarator_bez_przypisania);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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
		enterRule(_localctx, 16, RULE_deklarator_atomiczny_z_przypisaniem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ID);
			setState(139);
			match(T__6);
			setState(140);
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
		public TerminalNode EOS() { return getToken(plplParser.EOS, 0); }
		public List<Deklarator_bez_przypisaniaContext> deklarator_bez_przypisania() {
			return getRuleContexts(Deklarator_bez_przypisaniaContext.class);
		}
		public Deklarator_bez_przypisaniaContext deklarator_bez_przypisania(int i) {
			return getRuleContext(Deklarator_bez_przypisaniaContext.class,i);
		}
		public List<Deklarator_zlozony_z_przypisaniemContext> deklarator_zlozony_z_przypisaniem() {
			return getRuleContexts(Deklarator_zlozony_z_przypisaniemContext.class);
		}
		public Deklarator_zlozony_z_przypisaniemContext deklarator_zlozony_z_przypisaniem(int i) {
			return getRuleContext(Deklarator_zlozony_z_przypisaniemContext.class,i);
		}
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
		enterRule(_localctx, 18, RULE_deklaracja_referencji);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			przydomki();
			setState(143);
			pelny_typ();
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(144);
				deklarator_bez_przypisania();
				}
				break;
			case 2:
				{
				setState(145);
				deklarator_zlozony_z_przypisaniem();
				}
				break;
			}
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(148);
				match(T__5);
				setState(151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(149);
					deklarator_bez_przypisania();
					}
					break;
				case 2:
					{
					setState(150);
					deklarator_zlozony_z_przypisaniem();
					}
					break;
				}
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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

	public static class Deklarator_zlozony_z_przypisaniemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(plplParser.ID, 0); }
		public LwartoscContext lwartosc() {
			return getRuleContext(LwartoscContext.class,0);
		}
		public Stala_tablicowaContext stala_tablicowa() {
			return getRuleContext(Stala_tablicowaContext.class,0);
		}
		public Deklarator_zlozony_z_przypisaniemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklarator_zlozony_z_przypisaniem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterDeklarator_zlozony_z_przypisaniem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitDeklarator_zlozony_z_przypisaniem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitDeklarator_zlozony_z_przypisaniem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deklarator_zlozony_z_przypisaniemContext deklarator_zlozony_z_przypisaniem() throws RecognitionException {
		Deklarator_zlozony_z_przypisaniemContext _localctx = new Deklarator_zlozony_z_przypisaniemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_deklarator_zlozony_z_przypisaniem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ID);
			setState(161);
			match(T__6);
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(162);
				lwartosc();
				}
				break;
			case NAPIS_DOSL:
				{
				setState(163);
				stala_tablicowa();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 22, RULE_lista_instrukcji);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				instrukcja();
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << STATYCZN) | (1L << AUTOMATYCZN) | (1L << STAL) | (1L << TCALK) | (1L << TRZECZYW) | (1L << TZNAK) | (1L << TREF) | (1L << PRZERWIJ) | (1L << KONTYNUUJ) | (1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL) | (1L << LINIA_ASEMBLERA) | (1L << ID))) != 0) );
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
		public Instrukcja_przerwania_petliContext instrukcja_przerwania_petli() {
			return getRuleContext(Instrukcja_przerwania_petliContext.class,0);
		}
		public Instrukcja_kontynuacji_petliContext instrukcja_kontynuacji_petli() {
			return getRuleContext(Instrukcja_kontynuacji_petliContext.class,0);
		}
		public Instrukcja_prostaContext instrukcja_prosta() {
			return getRuleContext(Instrukcja_prostaContext.class,0);
		}
		public Instrukcja_wkroczeniaContext instrukcja_wkroczenia() {
			return getRuleContext(Instrukcja_wkroczeniaContext.class,0);
		}
		public Instrukcja_powrotuContext instrukcja_powrotu() {
			return getRuleContext(Instrukcja_powrotuContext.class,0);
		}
		public Instrukcja_zakonczeniaContext instrukcja_zakonczenia() {
			return getRuleContext(Instrukcja_zakonczeniaContext.class,0);
		}
		public Deklaracja_prostaContext deklaracja_prosta() {
			return getRuleContext(Deklaracja_prostaContext.class,0);
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
		enterRule(_localctx, 24, RULE_instrukcja);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				instrukcja_wyboru();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				instrukcja_petli();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				instrukcja_zlozona();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				instrukcja_przerwania_petli();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				instrukcja_kontynuacji_petli();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(176);
				instrukcja_prosta();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(177);
				instrukcja_wkroczenia();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(178);
				instrukcja_powrotu();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(179);
				instrukcja_zakonczenia();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(180);
				deklaracja_prosta();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(181);
				wstawka_asemblerowa();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(182);
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
		enterRule(_localctx, 26, RULE_instrukcja_zlozona);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__2);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << STATYCZN) | (1L << AUTOMATYCZN) | (1L << STAL) | (1L << TCALK) | (1L << TRZECZYW) | (1L << TZNAK) | (1L << TREF) | (1L << PRZERWIJ) | (1L << KONTYNUUJ) | (1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL) | (1L << LINIA_ASEMBLERA) | (1L << ID))) != 0)) {
				{
				setState(186);
				lista_instrukcji();
				}
			}

			setState(189);
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
		enterRule(_localctx, 28, RULE_instrukcja_wyboru);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__7);
			setState(192);
			match(T__8);
			setState(193);
			wyrazenie(0);
			setState(194);
			match(T__9);
			setState(195);
			instrukcja();
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(196);
				match(T__10);
				setState(197);
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
		enterRule(_localctx, 30, RULE_instrukcja_petli);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__11);
			setState(201);
			match(T__8);
			setState(202);
			wyrazenie(0);
			setState(203);
			match(T__9);
			setState(204);
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
		enterRule(_localctx, 32, RULE_instrukcja_powrotu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__12);
			setState(207);
			match(T__8);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL) | (1L << ID))) != 0)) {
				{
				setState(208);
				wyrazenie(0);
				}
			}

			setState(211);
			match(T__9);
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
		enterRule(_localctx, 34, RULE_instrukcja_wkroczenia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__13);
			setState(215);
			match(ID);
			setState(216);
			match(T__8);
			setState(217);
			lista_parametrow_formalnych();
			setState(218);
			match(T__9);
			setState(219);
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
		enterRule(_localctx, 36, RULE_instrukcja_zakonczenia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__14);
			setState(222);
			match(T__8);
			setState(223);
			wyrazenie(0);
			setState(224);
			match(T__9);
			setState(225);
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
		public TerminalNode PRZERWIJ() { return getToken(plplParser.PRZERWIJ, 0); }
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
		enterRule(_localctx, 38, RULE_instrukcja_przerwania_petli);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(PRZERWIJ);
			setState(228);
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
		public TerminalNode KONTYNUUJ() { return getToken(plplParser.KONTYNUUJ, 0); }
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
		enterRule(_localctx, 40, RULE_instrukcja_kontynuacji_petli);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(KONTYNUUJ);
			setState(231);
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
		enterRule(_localctx, 42, RULE_wypisanie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__15);
			setState(234);
			match(T__8);
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAPIS_DOSL:
				{
				setState(235);
				stala_tablicowa();
				}
				break;
			case ID:
				{
				setState(236);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(239);
			match(T__9);
			setState(240);
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
		enterRule(_localctx, 44, RULE_instrukcja_prosta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			wyrazenie(0);
			setState(243);
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
		enterRule(_localctx, 46, RULE_wstawka_asemblerowa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		enterRule(_localctx, 48, RULE_lista_parametrow_formalnych);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STATYCZN) | (1L << AUTOMATYCZN) | (1L << STAL) | (1L << TCALK) | (1L << TRZECZYW) | (1L << TZNAK) | (1L << TREF) | (1L << ID))) != 0)) {
				{
				setState(247);
				deklaracja_parametru();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(248);
					match(T__5);
					setState(249);
					deklaracja_parametru();
					}
					}
					setState(254);
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
		public PrzydomkiContext przydomki() {
			return getRuleContext(PrzydomkiContext.class,0);
		}
		public Deklarator_bez_przypisaniaContext deklarator_bez_przypisania() {
			return getRuleContext(Deklarator_bez_przypisaniaContext.class,0);
		}
		public Nazwa_typu_atomContext nazwa_typu_atom() {
			return getRuleContext(Nazwa_typu_atomContext.class,0);
		}
		public Pelny_typContext pelny_typ() {
			return getRuleContext(Pelny_typContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_deklaracja_parametru);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			przydomki();
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(258);
				nazwa_typu_atom();
				}
				break;
			case 2:
				{
				setState(259);
				pelny_typ();
				}
				break;
			}
			setState(262);
			deklarator_bez_przypisania();
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_wyrazenie, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new WyrazenieWywolanieContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(265);
				wywolanie_funkcji();
				}
				break;
			case 2:
				{
				_localctx = new WyrazenieLwartoscContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				lwartosc();
				}
				break;
			case 3:
				{
				_localctx = new WyrazenieAdresContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				((WyrazenieAdresContext)_localctx).adr = match(T__16);
				setState(268);
				lwartosc();
				}
				break;
			case 4:
				{
				_localctx = new WyrazenieNegacjaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				((WyrazenieNegacjaContext)_localctx).neg = match(T__17);
				setState(270);
				wyrazenie(10);
				}
				break;
			case 5:
				{
				_localctx = new WyrazenieZnakContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				((WyrazenieZnakContext)_localctx).znak = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
					((WyrazenieZnakContext)_localctx).znak = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(272);
				wyrazenie(9);
				}
				break;
			case 6:
				{
				_localctx = new WyrazeniePrzypisanieContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				przypisanie();
				}
				break;
			case 7:
				{
				_localctx = new WyrazenieStalaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				stala_atomiczna();
				}
				break;
			case 8:
				{
				_localctx = new WyrazenieNawiasyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275);
				match(T__8);
				setState(276);
				wyrazenie(0);
				setState(277);
				match(T__9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(296);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new WyrazeniePotegContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(281);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(282);
						match(T__20);
						setState(283);
						wyrazenie(8);
						}
						break;
					case 2:
						{
						_localctx = new WyrazenieMultContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(284);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(285);
						((WyrazenieMultContext)_localctx).mult = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
							((WyrazenieMultContext)_localctx).mult = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(286);
						wyrazenie(8);
						}
						break;
					case 3:
						{
						_localctx = new WyrazenieAddytContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(287);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(288);
						((WyrazenieAddytContext)_localctx).addyt = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
							((WyrazenieAddytContext)_localctx).addyt = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(289);
						wyrazenie(7);
						}
						break;
					case 4:
						{
						_localctx = new WyrazenieLogiczContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(290);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(291);
						((WyrazenieLogiczContext)_localctx).logicz = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
							((WyrazenieLogiczContext)_localctx).logicz = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(292);
						wyrazenie(6);
						}
						break;
					case 5:
						{
						_localctx = new WyrazeniePorownanieContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(293);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(294);
						((WyrazeniePorownanieContext)_localctx).porownanie = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
							((WyrazeniePorownanieContext)_localctx).porownanie = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(295);
						wyrazenie(5);
						}
						break;
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 54, RULE_lwartosc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(ID);
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(302);
				selektor_tablicowy();
				}
				break;
			}
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					selektor_typu_zlozonego();
					setState(309);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(306);
							selektor_tablicowy();
							}
							} 
						}
						setState(311);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					}
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 56, RULE_selektor_tablicowy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__32);
			setState(318);
			wyrazenie(0);
			setState(319);
			match(T__33);
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
		enterRule(_localctx, 58, RULE_selektor_typu_zlozonego);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__34);
			setState(322);
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
		enterRule(_localctx, 60, RULE_przypisanie);
		int _la;
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new PrzypisanieZwykleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				lwartosc();
				setState(325);
				match(T__6);
				setState(326);
				wyrazenie(0);
				}
				break;
			case 2:
				_localctx = new PrzypisaniePotegContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				lwartosc();
				setState(329);
				match(T__35);
				setState(330);
				wyrazenie(0);
				}
				break;
			case 3:
				_localctx = new PrzypisanieMultContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				lwartosc();
				setState(333);
				((PrzypisanieMultContext)_localctx).mult = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
					((PrzypisanieMultContext)_localctx).mult = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(334);
				wyrazenie(0);
				}
				break;
			case 4:
				_localctx = new PrzypisanieAddytContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				lwartosc();
				setState(337);
				((PrzypisanieAddytContext)_localctx).addyt = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__39 || _la==T__40) ) {
					((PrzypisanieAddytContext)_localctx).addyt = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(338);
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
		enterRule(_localctx, 62, RULE_wywolanie_funkcji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(ID);
			setState(343);
			match(T__8);
			setState(344);
			lista_parametrow_aktualnych();
			setState(345);
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
		enterRule(_localctx, 64, RULE_lista_parametrow_aktualnych);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL) | (1L << ID))) != 0)) {
				{
				setState(347);
				wyrazenie(0);
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(348);
					match(T__5);
					setState(349);
					wyrazenie(0);
					}
					}
					setState(354);
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
		enterRule(_localctx, 66, RULE_stala_atomiczna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
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
		enterRule(_localctx, 68, RULE_stala_tablicowa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
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
		public List<Nieokreslony_deklarator_tablicowyContext> nieokreslony_deklarator_tablicowy() {
			return getRuleContexts(Nieokreslony_deklarator_tablicowyContext.class);
		}
		public Nieokreslony_deklarator_tablicowyContext nieokreslony_deklarator_tablicowy(int i) {
			return getRuleContext(Nieokreslony_deklarator_tablicowyContext.class,i);
		}
		public Okreslony_deklarator_tablicowyContext okreslony_deklarator_tablicowy() {
			return getRuleContext(Okreslony_deklarator_tablicowyContext.class,0);
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
		enterRule(_localctx, 70, RULE_pelny_typ);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TCALK:
			case TRZECZYW:
			case TZNAK:
			case TREF:
				{
				setState(361);
				nazwa_typu_atom();
				}
				break;
			case ID:
				{
				setState(362);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(365);
					nieokreslony_deklarator_tablicowy();
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(371);
				okreslony_deklarator_tablicowy();
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

	public static class Nieokreslony_deklarator_tablicowyContext extends ParserRuleContext {
		public Nieokreslony_deklarator_tablicowyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nieokreslony_deklarator_tablicowy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterNieokreslony_deklarator_tablicowy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitNieokreslony_deklarator_tablicowy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitNieokreslony_deklarator_tablicowy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nieokreslony_deklarator_tablicowyContext nieokreslony_deklarator_tablicowy() throws RecognitionException {
		Nieokreslony_deklarator_tablicowyContext _localctx = new Nieokreslony_deklarator_tablicowyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_nieokreslony_deklarator_tablicowy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__32);
			setState(375);
			match(T__33);
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

	public static class Okreslony_deklarator_tablicowyContext extends ParserRuleContext {
		public TerminalNode CALK() { return getToken(plplParser.CALK, 0); }
		public Okreslony_deklarator_tablicowyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_okreslony_deklarator_tablicowy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterOkreslony_deklarator_tablicowy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitOkreslony_deklarator_tablicowy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitOkreslony_deklarator_tablicowy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Okreslony_deklarator_tablicowyContext okreslony_deklarator_tablicowy() throws RecognitionException {
		Okreslony_deklarator_tablicowyContext _localctx = new Okreslony_deklarator_tablicowyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_okreslony_deklarator_tablicowy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T__32);
			setState(378);
			match(CALK);
			setState(379);
			match(T__33);
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
		enterRule(_localctx, 76, RULE_przydomki);
		int _la;
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATYCZN || _la==AUTOMATYCZN) {
					{
					setState(381);
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

				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAL) {
					{
					setState(384);
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
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAL) {
					{
					setState(387);
					match(STAL);
					}
				}

				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATYCZN || _la==AUTOMATYCZN) {
					{
					setState(390);
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
		enterRule(_localctx, 78, RULE_nazwa_typu_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
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
		case 26:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0190\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\7\2T\n\2\f"+
		"\2\16\2W\13\2\3\2\3\2\3\3\3\3\3\3\5\3^\n\3\3\4\3\4\3\4\5\4c\n\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\6\6o\n\6\r\6\16\6p\3\6\3\6\3\7\3\7"+
		"\5\7w\n\7\3\b\3\b\3\b\3\b\5\b}\n\b\3\b\3\b\3\b\5\b\u0082\n\b\7\b\u0084"+
		"\n\b\f\b\16\b\u0087\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\5\13\u0095\n\13\3\13\3\13\3\13\5\13\u009a\n\13\7\13\u009c\n\13\f"+
		"\13\16\13\u009f\13\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00a7\n\f\3\r\6\r"+
		"\u00aa\n\r\r\r\16\r\u00ab\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00ba\n\16\3\17\3\17\5\17\u00be\n\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c9\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\5\22\u00d4\n\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00f0\n\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\32\7\32\u00fd\n\32\f\32\16\32\u0100\13\32"+
		"\5\32\u0102\n\32\3\33\3\33\3\33\5\33\u0107\n\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u011a"+
		"\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\7\34\u012b\n\34\f\34\16\34\u012e\13\34\3\35\3\35\5\35\u0132"+
		"\n\35\3\35\3\35\7\35\u0136\n\35\f\35\16\35\u0139\13\35\7\35\u013b\n\35"+
		"\f\35\16\35\u013e\13\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0157\n \3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\7\"\u0161\n\"\f\"\16\"\u0164\13\"\5\"\u0166\n\"\3#\3#\3$\3$\3%"+
		"\3%\5%\u016e\n%\3%\7%\u0171\n%\f%\16%\u0174\13%\3%\5%\u0177\n%\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3(\5(\u0181\n(\3(\5(\u0184\n(\3(\5(\u0187\n(\3(\5(\u018a"+
		"\n(\5(\u018c\n(\3)\3)\3)\2\3\66*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\13\3\2\679\3\2\25\26\3\2\30\32\3"+
		"\2\33\34\3\2\35\"\3\2\')\3\2*+\3\2./\3\2\61\64\2\u01a3\2U\3\2\2\2\4]\3"+
		"\2\2\2\6_\3\2\2\2\bh\3\2\2\2\nj\3\2\2\2\fv\3\2\2\2\16x\3\2\2\2\20\u008a"+
		"\3\2\2\2\22\u008c\3\2\2\2\24\u0090\3\2\2\2\26\u00a2\3\2\2\2\30\u00a9\3"+
		"\2\2\2\32\u00b9\3\2\2\2\34\u00bb\3\2\2\2\36\u00c1\3\2\2\2 \u00ca\3\2\2"+
		"\2\"\u00d0\3\2\2\2$\u00d8\3\2\2\2&\u00df\3\2\2\2(\u00e5\3\2\2\2*\u00e8"+
		"\3\2\2\2,\u00eb\3\2\2\2.\u00f4\3\2\2\2\60\u00f7\3\2\2\2\62\u0101\3\2\2"+
		"\2\64\u0103\3\2\2\2\66\u0119\3\2\2\28\u012f\3\2\2\2:\u013f\3\2\2\2<\u0143"+
		"\3\2\2\2>\u0156\3\2\2\2@\u0158\3\2\2\2B\u0165\3\2\2\2D\u0167\3\2\2\2F"+
		"\u0169\3\2\2\2H\u016d\3\2\2\2J\u0178\3\2\2\2L\u017b\3\2\2\2N\u018b\3\2"+
		"\2\2P\u018d\3\2\2\2RT\5\4\3\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2"+
		"VX\3\2\2\2WU\3\2\2\2XY\7\2\2\3Y\3\3\2\2\2Z^\5\6\4\2[^\5\n\6\2\\^\5\f\7"+
		"\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\5\3\2\2\2_b\7\3\2\2`a\7\4\2\2ac\5\b"+
		"\5\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\5\2\2ef\5\30\r\2fg\7\6\2\2g\7\3"+
		"\2\2\2hi\5H%\2i\t\3\2\2\2jk\7\7\2\2kl\7<\2\2ln\7\5\2\2mo\5\f\7\2nm\3\2"+
		"\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\6\2\2s\13\3\2\2\2tw\5"+
		"\16\b\2uw\5\24\13\2vt\3\2\2\2vu\3\2\2\2w\r\3\2\2\2xy\5N(\2y|\5P)\2z}\5"+
		"\22\n\2{}\5\20\t\2|z\3\2\2\2|{\3\2\2\2}\u0085\3\2\2\2~\u0081\7\b\2\2\177"+
		"\u0082\5\22\n\2\u0080\u0082\5\20\t\2\u0081\177\3\2\2\2\u0081\u0080\3\2"+
		"\2\2\u0082\u0084\3\2\2\2\u0083~\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\7=\2\2\u0089\17\3\2\2\2\u008a\u008b\7<\2\2\u008b\21\3\2\2\2\u008c"+
		"\u008d\7<\2\2\u008d\u008e\7\t\2\2\u008e\u008f\t\2\2\2\u008f\23\3\2\2\2"+
		"\u0090\u0091\5N(\2\u0091\u0094\5H%\2\u0092\u0095\5\20\t\2\u0093\u0095"+
		"\5\26\f\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u009d\3\2\2\2"+
		"\u0096\u0099\7\b\2\2\u0097\u009a\5\20\t\2\u0098\u009a\5\26\f\2\u0099\u0097"+
		"\3\2\2\2\u0099\u0098\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0096\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7=\2\2\u00a1\25\3\2\2\2\u00a2\u00a3"+
		"\7<\2\2\u00a3\u00a6\7\t\2\2\u00a4\u00a7\58\35\2\u00a5\u00a7\5F$\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\27\3\2\2\2\u00a8\u00aa\5\32\16"+
		"\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\31\3\2\2\2\u00ad\u00ba\5\36\20\2\u00ae\u00ba\5 \21\2\u00af"+
		"\u00ba\5\34\17\2\u00b0\u00ba\5(\25\2\u00b1\u00ba\5*\26\2\u00b2\u00ba\5"+
		".\30\2\u00b3\u00ba\5$\23\2\u00b4\u00ba\5\"\22\2\u00b5\u00ba\5&\24\2\u00b6"+
		"\u00ba\5\f\7\2\u00b7\u00ba\5\60\31\2\u00b8\u00ba\5,\27\2\u00b9\u00ad\3"+
		"\2\2\2\u00b9\u00ae\3\2\2\2\u00b9\u00af\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9"+
		"\u00b1\3\2\2\2\u00b9\u00b2\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b4\3\2"+
		"\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\33\3\2\2\2\u00bb\u00bd\7\5\2\2\u00bc\u00be\5\30\r"+
		"\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0"+
		"\7\6\2\2\u00c0\35\3\2\2\2\u00c1\u00c2\7\n\2\2\u00c2\u00c3\7\13\2\2\u00c3"+
		"\u00c4\5\66\34\2\u00c4\u00c5\7\f\2\2\u00c5\u00c8\5\32\16\2\u00c6\u00c7"+
		"\7\r\2\2\u00c7\u00c9\5\32\16\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2"+
		"\u00c9\37\3\2\2\2\u00ca\u00cb\7\16\2\2\u00cb\u00cc\7\13\2\2\u00cc\u00cd"+
		"\5\66\34\2\u00cd\u00ce\7\f\2\2\u00ce\u00cf\5\32\16\2\u00cf!\3\2\2\2\u00d0"+
		"\u00d1\7\17\2\2\u00d1\u00d3\7\13\2\2\u00d2\u00d4\5\66\34\2\u00d3\u00d2"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\f\2\2\u00d6"+
		"\u00d7\7=\2\2\u00d7#\3\2\2\2\u00d8\u00d9\7\20\2\2\u00d9\u00da\7<\2\2\u00da"+
		"\u00db\7\13\2\2\u00db\u00dc\5\62\32\2\u00dc\u00dd\7\f\2\2\u00dd\u00de"+
		"\7=\2\2\u00de%\3\2\2\2\u00df\u00e0\7\21\2\2\u00e0\u00e1\7\13\2\2\u00e1"+
		"\u00e2\5\66\34\2\u00e2\u00e3\7\f\2\2\u00e3\u00e4\7=\2\2\u00e4\'\3\2\2"+
		"\2\u00e5\u00e6\7\65\2\2\u00e6\u00e7\7=\2\2\u00e7)\3\2\2\2\u00e8\u00e9"+
		"\7\66\2\2\u00e9\u00ea\7=\2\2\u00ea+\3\2\2\2\u00eb\u00ec\7\22\2\2\u00ec"+
		"\u00ef\7\13\2\2\u00ed\u00f0\5F$\2\u00ee\u00f0\7<\2\2\u00ef\u00ed\3\2\2"+
		"\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\f\2\2\u00f2\u00f3"+
		"\7=\2\2\u00f3-\3\2\2\2\u00f4\u00f5\5\66\34\2\u00f5\u00f6\7=\2\2\u00f6"+
		"/\3\2\2\2\u00f7\u00f8\7;\2\2\u00f8\61\3\2\2\2\u00f9\u00fe\5\64\33\2\u00fa"+
		"\u00fb\7\b\2\2\u00fb\u00fd\5\64\33\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3"+
		"\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u00f9\3\2\2\2\u0101\u0102\3\2\2\2\u0102\63\3\2\2"+
		"\2\u0103\u0106\5N(\2\u0104\u0107\5P)\2\u0105\u0107\5H%\2\u0106\u0104\3"+
		"\2\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\5\20\t\2\u0109"+
		"\65\3\2\2\2\u010a\u010b\b\34\1\2\u010b\u011a\5@!\2\u010c\u011a\58\35\2"+
		"\u010d\u010e\7\23\2\2\u010e\u011a\58\35\2\u010f\u0110\7\24\2\2\u0110\u011a"+
		"\5\66\34\f\u0111\u0112\t\3\2\2\u0112\u011a\5\66\34\13\u0113\u011a\5> "+
		"\2\u0114\u011a\5D#\2\u0115\u0116\7\13\2\2\u0116\u0117\5\66\34\2\u0117"+
		"\u0118\7\f\2\2\u0118\u011a\3\2\2\2\u0119\u010a\3\2\2\2\u0119\u010c\3\2"+
		"\2\2\u0119\u010d\3\2\2\2\u0119\u010f\3\2\2\2\u0119\u0111\3\2\2\2\u0119"+
		"\u0113\3\2\2\2\u0119\u0114\3\2\2\2\u0119\u0115\3\2\2\2\u011a\u012c\3\2"+
		"\2\2\u011b\u011c\f\n\2\2\u011c\u011d\7\27\2\2\u011d\u012b\5\66\34\n\u011e"+
		"\u011f\f\t\2\2\u011f\u0120\t\4\2\2\u0120\u012b\5\66\34\n\u0121\u0122\f"+
		"\b\2\2\u0122\u0123\t\3\2\2\u0123\u012b\5\66\34\t\u0124\u0125\f\7\2\2\u0125"+
		"\u0126\t\5\2\2\u0126\u012b\5\66\34\b\u0127\u0128\f\6\2\2\u0128\u0129\t"+
		"\6\2\2\u0129\u012b\5\66\34\7\u012a\u011b\3\2\2\2\u012a\u011e\3\2\2\2\u012a"+
		"\u0121\3\2\2\2\u012a\u0124\3\2\2\2\u012a\u0127\3\2\2\2\u012b\u012e\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\67\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012f\u0131\7<\2\2\u0130\u0132\5:\36\2\u0131\u0130\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u013c\3\2\2\2\u0133\u0137\5<\37\2\u0134\u0136\5:"+
		"\36\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u0133\3\2"+
		"\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"9\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7#\2\2\u0140\u0141\5\66\34\2"+
		"\u0141\u0142\7$\2\2\u0142;\3\2\2\2\u0143\u0144\7%\2\2\u0144\u0145\7<\2"+
		"\2\u0145=\3\2\2\2\u0146\u0147\58\35\2\u0147\u0148\7\t\2\2\u0148\u0149"+
		"\5\66\34\2\u0149\u0157\3\2\2\2\u014a\u014b\58\35\2\u014b\u014c\7&\2\2"+
		"\u014c\u014d\5\66\34\2\u014d\u0157\3\2\2\2\u014e\u014f\58\35\2\u014f\u0150"+
		"\t\7\2\2\u0150\u0151\5\66\34\2\u0151\u0157\3\2\2\2\u0152\u0153\58\35\2"+
		"\u0153\u0154\t\b\2\2\u0154\u0155\5\66\34\2\u0155\u0157\3\2\2\2\u0156\u0146"+
		"\3\2\2\2\u0156\u014a\3\2\2\2\u0156\u014e\3\2\2\2\u0156\u0152\3\2\2\2\u0157"+
		"?\3\2\2\2\u0158\u0159\7<\2\2\u0159\u015a\7\13\2\2\u015a\u015b\5B\"\2\u015b"+
		"\u015c\7\f\2\2\u015cA\3\2\2\2\u015d\u0162\5\66\34\2\u015e\u015f\7\b\2"+
		"\2\u015f\u0161\5\66\34\2\u0160\u015e\3\2\2\2\u0161\u0164\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2"+
		"\2\2\u0165\u015d\3\2\2\2\u0165\u0166\3\2\2\2\u0166C\3\2\2\2\u0167\u0168"+
		"\t\2\2\2\u0168E\3\2\2\2\u0169\u016a\7:\2\2\u016aG\3\2\2\2\u016b\u016e"+
		"\5P)\2\u016c\u016e\7<\2\2\u016d\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016e"+
		"\u0172\3\2\2\2\u016f\u0171\5J&\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2"+
		"\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0175\u0177\5L\'\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"I\3\2\2\2\u0178\u0179\7#\2\2\u0179\u017a\7$\2\2\u017aK\3\2\2\2\u017b\u017c"+
		"\7#\2\2\u017c\u017d\78\2\2\u017d\u017e\7$\2\2\u017eM\3\2\2\2\u017f\u0181"+
		"\t\t\2\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182"+
		"\u0184\7\60\2\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u018c\3"+
		"\2\2\2\u0185\u0187\7\60\2\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0189\3\2\2\2\u0188\u018a\t\t\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018a\u018c\3\2\2\2\u018b\u0180\3\2\2\2\u018b\u0186\3\2\2\2\u018c"+
		"O\3\2\2\2\u018d\u018e\t\n\2\2\u018eQ\3\2\2\2(U]bpv|\u0081\u0085\u0094"+
		"\u0099\u009d\u00a6\u00ab\u00b9\u00bd\u00c8\u00d3\u00ef\u00fe\u0101\u0106"+
		"\u0119\u012a\u012c\u0131\u0137\u013c\u0156\u0162\u0165\u016d\u0172\u0176"+
		"\u0180\u0183\u0186\u0189\u018b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}