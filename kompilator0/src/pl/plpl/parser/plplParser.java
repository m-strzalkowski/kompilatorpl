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
		TREF=53, NOWY=54, WYPISZ=55, PRZERWIJ=56, KONTYNUUJ=57, ZMIENN=58, CALK=59, 
		ZNAK_DOSL=60, NAPIS_DOSL=61, LINIA_ASEMBLERA=62, ID=63, EOS=64, LINE_COMMENT=65, 
		COMMENT=66, WS=67;
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
		RULE_deklaracja_parametru = 25, RULE_wyrazenie = 26, RULE_alokacja = 27, 
		RULE_dealokacja = 28, RULE_lwartosc = 29, RULE_selektor_tablicowy = 30, 
		RULE_selektor_typu_zlozonego = 31, RULE_wywolanie_funkcji = 32, RULE_naiwne_wywolanie = 33, 
		RULE_lista_parametrow_aktualnych = 34, RULE_stala_atomiczna = 35, RULE_stala_tablicowa = 36, 
		RULE_pelny_typ = 37, RULE_pelny_typ_dynamiczny = 38, RULE_nieokreslony_deklarator_tablicowy = 39, 
		RULE_okreslony_deklarator_tablicowy = 40, RULE_obliczany_deklarator_tablicowy = 41, 
		RULE_przydomki = 42, RULE_nazwa_typu_atom = 43, RULE_nazwa_dynamicznie_alokowalnego_typu_atom = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "byt_globalny", "procedura", "typ_zwracany", "deklaracja_typu", 
			"deklaracja_prosta", "deklaracja_atomiczna", "deklarator_bez_przypisania", 
			"deklarator_atomiczny_z_przypisaniem", "deklaracja_referencji", "deklarator_zlozony_z_przypisaniem", 
			"lista_instrukcji", "instrukcja", "instrukcja_zlozona", "instrukcja_wyboru", 
			"instrukcja_petli", "instrukcja_powrotu", "instrukcja_wkroczenia", "instrukcja_zakonczenia", 
			"instrukcja_przerwania_petli", "instrukcja_kontynuacji_petli", "wypisanie", 
			"instrukcja_prosta", "wstawka_asemblerowa", "lista_parametrow_formalnych", 
			"deklaracja_parametru", "wyrazenie", "alokacja", "dealokacja", "lwartosc", 
			"selektor_tablicowy", "selektor_typu_zlozonego", "wywolanie_funkcji", 
			"naiwne_wywolanie", "lista_parametrow_aktualnych", "stala_atomiczna", 
			"stala_tablicowa", "pelny_typ", "pelny_typ_dynamiczny", "nieokreslony_deklarator_tablicowy", 
			"okreslony_deklarator_tablicowy", "obliczany_deklarator_tablicowy", "przydomki", 
			"nazwa_typu_atom", "nazwa_dynamicznie_alokowalnego_typu_atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'procedura'", "'->'", "'{'", "'}'", "'typ'", "','", "'='", "'je\u015Bli'", 
			"'jesli'", "'gdy'", "'('", "')'", "'inaczej'", "'dop\u00F3ki'", "'zwr\u00F3\u0107'", 
			"'zacznij'", "'sko\u0144cz'", "'@'", "'!'", "'-'", "'+'", "'^'", "'*'", 
			"'/'", "'%'", "'&&'", "'||'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", 
			"'^='", "'*='", "'/='", "'%='", "'+='", "'-='", "'zapomnij'", "'['", 
			"']'", "'.'", "'C.'", null, null, null, null, null, null, "'rzeczyw'", 
			"'znak'", "'ref'", null, null, "'przerwij'", null, null, null, null, 
			null, null, null, "';'"
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
			"TREF", "NOWY", "WYPISZ", "PRZERWIJ", "KONTYNUUJ", "ZMIENN", "CALK", 
			"ZNAK_DOSL", "NAPIS_DOSL", "LINIA_ASEMBLERA", "ID", "EOS", "LINE_COMMENT", 
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
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << STATYCZN) | (1L << AUTOMATYCZN) | (1L << STAL) | (1L << TCALK) | (1L << TRZECZYW) | (1L << TZNAK) | (1L << TREF) | (1L << ID))) != 0)) {
				{
				{
				setState(90);
				byt_globalny();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				procedura();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
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
				setState(100);
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
			setState(103);
			match(T__0);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(104);
				match(T__1);
				setState(105);
				typ_zwracany();
				}
			}

			setState(108);
			match(T__2);
			setState(109);
			lista_instrukcji();
			setState(110);
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
			setState(112);
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
			setState(114);
			match(T__4);
			setState(115);
			match(ID);
			setState(116);
			match(T__2);
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				deklaracja_prosta();
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STATYCZN) | (1L << AUTOMATYCZN) | (1L << STAL) | (1L << TCALK) | (1L << TRZECZYW) | (1L << TZNAK) | (1L << TREF) | (1L << ID))) != 0) );
			setState(122);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				deklaracja_atomiczna();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
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
			setState(128);
			przydomki();
			setState(129);
			nazwa_typu_atom();
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(130);
				deklarator_atomiczny_z_przypisaniem();
				}
				break;
			case 2:
				{
				setState(131);
				deklarator_bez_przypisania();
				}
				break;
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(134);
				match(T__5);
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(135);
					deklarator_atomiczny_z_przypisaniem();
					}
					break;
				case 2:
					{
					setState(136);
					deklarator_bez_przypisania();
					}
					break;
				}
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
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
			setState(146);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(ID);
			setState(149);
			match(T__6);
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALK:
				{
				setState(150);
				match(CALK);
				}
				break;
			case ZMIENN:
				{
				setState(151);
				match(ZMIENN);
				notifyErrorListeners("Liczby zmienoprzecinkowe jeszcze nie zaimplementowane");
				}
				break;
			case ZNAK_DOSL:
				{
				setState(153);
				match(ZNAK_DOSL);
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
			setState(156);
			przydomki();
			setState(157);
			pelny_typ();
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(158);
				deklarator_bez_przypisania();
				}
				break;
			case 2:
				{
				setState(159);
				deklarator_zlozony_z_przypisaniem();
				}
				break;
			}
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(162);
				match(T__5);
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(163);
					deklarator_bez_przypisania();
					}
					break;
				case 2:
					{
					setState(164);
					deklarator_zlozony_z_przypisaniem();
					}
					break;
				}
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
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
			setState(174);
			match(ID);
			setState(175);
			match(T__6);
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(176);
				lwartosc();
				}
				break;
			case 2:
				{
				setState(177);
				stala_tablicowa();
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
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				instrukcja();
				}
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__39) | (1L << T__43) | (1L << NIC) | (1L << STATYCZN) | (1L << AUTOMATYCZN) | (1L << STAL) | (1L << TCALK) | (1L << TRZECZYW) | (1L << TZNAK) | (1L << TREF) | (1L << NOWY) | (1L << WYPISZ) | (1L << PRZERWIJ) | (1L << KONTYNUUJ) | (1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL) | (1L << NAPIS_DOSL) | (1L << LINIA_ASEMBLERA) | (1L << ID))) != 0) );
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
		public WypisanieContext wypisanie() {
			return getRuleContext(WypisanieContext.class,0);
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
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				instrukcja_wyboru();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				instrukcja_petli();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				instrukcja_zlozona();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				instrukcja_przerwania_petli();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				instrukcja_kontynuacji_petli();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				wypisanie();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(191);
				instrukcja_prosta();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(192);
				instrukcja_wkroczenia();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(193);
				instrukcja_powrotu();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(194);
				instrukcja_zakonczenia();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(195);
				deklaracja_prosta();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(196);
				wstawka_asemblerowa();
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
			setState(199);
			match(T__2);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__39) | (1L << T__43) | (1L << NIC) | (1L << STATYCZN) | (1L << AUTOMATYCZN) | (1L << STAL) | (1L << TCALK) | (1L << TRZECZYW) | (1L << TZNAK) | (1L << TREF) | (1L << NOWY) | (1L << WYPISZ) | (1L << PRZERWIJ) | (1L << KONTYNUUJ) | (1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL) | (1L << NAPIS_DOSL) | (1L << LINIA_ASEMBLERA) | (1L << ID))) != 0)) {
				{
				setState(200);
				lista_instrukcji();
				}
			}

			setState(203);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(206);
			match(T__10);
			setState(207);
			wyrazenie(0);
			setState(208);
			match(T__11);
			setState(209);
			instrukcja();
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(210);
				match(T__12);
				setState(211);
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
			setState(214);
			match(T__13);
			setState(215);
			match(T__10);
			setState(216);
			wyrazenie(0);
			setState(217);
			match(T__11);
			setState(218);
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
			setState(220);
			match(T__14);
			setState(221);
			match(T__10);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__39) | (1L << T__43) | (1L << NIC) | (1L << NOWY) | (1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL) | (1L << NAPIS_DOSL) | (1L << ID))) != 0)) {
				{
				setState(222);
				wyrazenie(0);
				}
			}

			setState(225);
			match(T__11);
			setState(226);
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
			setState(228);
			match(T__15);
			setState(229);
			match(ID);
			setState(230);
			match(T__10);
			setState(231);
			lista_parametrow_formalnych();
			setState(232);
			match(T__11);
			setState(233);
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
			setState(235);
			match(T__16);
			setState(236);
			match(T__10);
			setState(237);
			wyrazenie(0);
			setState(238);
			match(T__11);
			setState(239);
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
			setState(241);
			match(PRZERWIJ);
			setState(242);
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
			setState(244);
			match(KONTYNUUJ);
			setState(245);
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
		public TerminalNode WYPISZ() { return getToken(plplParser.WYPISZ, 0); }
		public TerminalNode EOS() { return getToken(plplParser.EOS, 0); }
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(WYPISZ);
			setState(248);
			match(T__10);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__39) | (1L << T__43) | (1L << NIC) | (1L << NOWY) | (1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL) | (1L << NAPIS_DOSL) | (1L << ID))) != 0)) {
				{
				setState(249);
				wyrazenie(0);
				}
			}

			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(252);
				match(T__5);
				setState(253);
				wyrazenie(0);
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			match(T__11);
			setState(260);
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
			setState(262);
			wyrazenie(0);
			setState(263);
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
			setState(265);
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
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STATYCZN) | (1L << AUTOMATYCZN) | (1L << STAL) | (1L << TCALK) | (1L << TRZECZYW) | (1L << TZNAK) | (1L << TREF) | (1L << ID))) != 0)) {
				{
				setState(267);
				deklaracja_parametru();
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(268);
					match(T__5);
					setState(269);
					deklaracja_parametru();
					}
					}
					setState(274);
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
			setState(277);
			przydomki();
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(278);
				nazwa_typu_atom();
				}
				break;
			case 2:
				{
				setState(279);
				pelny_typ();
				}
				break;
			}
			setState(282);
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
	public static class WyrazeniePrzypisaniePotegContext extends WyrazenieContext {
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazeniePrzypisaniePotegContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazeniePrzypisaniePoteg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazeniePrzypisaniePoteg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazeniePrzypisaniePoteg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazeniePrzypisanieAddytContext extends WyrazenieContext {
		public Token addyt;
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazeniePrzypisanieAddytContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazeniePrzypisanieAddyt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazeniePrzypisanieAddyt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazeniePrzypisanieAddyt(this);
			else return visitor.visitChildren(this);
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
	public static class WyrazenieWywolanieNaiwneContext extends WyrazenieContext {
		public Naiwne_wywolanieContext naiwne_wywolanie() {
			return getRuleContext(Naiwne_wywolanieContext.class,0);
		}
		public WyrazenieWywolanieNaiwneContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazenieWywolanieNaiwne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazenieWywolanieNaiwne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazenieWywolanieNaiwne(this);
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
	public static class WyrazeniePrzypisanieMultContext extends WyrazenieContext {
		public Token mult;
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazeniePrzypisanieMultContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazeniePrzypisanieMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazeniePrzypisanieMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazeniePrzypisanieMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieAlokacjaContext extends WyrazenieContext {
		public AlokacjaContext alokacja() {
			return getRuleContext(AlokacjaContext.class,0);
		}
		public WyrazenieAlokacjaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazenieAlokacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazenieAlokacja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazenieAlokacja(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieDealokacjaContext extends WyrazenieContext {
		public DealokacjaContext dealokacja() {
			return getRuleContext(DealokacjaContext.class,0);
		}
		public WyrazenieDealokacjaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazenieDealokacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazenieDealokacja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazenieDealokacja(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieAdresContext extends WyrazenieContext {
		public Token adr;
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
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
	public static class WyrazeniePrzypisanieZwykleContext extends WyrazenieContext {
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazeniePrzypisanieZwykleContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazeniePrzypisanieZwykle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazeniePrzypisanieZwykle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazeniePrzypisanieZwykle(this);
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
	public static class WyrazenieSelekcjiSkladowejContext extends WyrazenieContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public Selektor_typu_zlozonegoContext selektor_typu_zlozonego() {
			return getRuleContext(Selektor_typu_zlozonegoContext.class,0);
		}
		public WyrazenieSelekcjiSkladowejContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazenieSelekcjiSkladowej(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazenieSelekcjiSkladowej(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazenieSelekcjiSkladowej(this);
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
	public static class WyrazenieSelekcjaTablicowaContext extends WyrazenieContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public Selektor_tablicowyContext selektor_tablicowy() {
			return getRuleContext(Selektor_tablicowyContext.class,0);
		}
		public WyrazenieSelekcjaTablicowaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterWyrazenieSelekcjaTablicowa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitWyrazenieSelekcjaTablicowa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitWyrazenieSelekcjaTablicowa(this);
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
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new WyrazenieWywolanieContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(285);
				wywolanie_funkcji();
				}
				break;
			case 2:
				{
				_localctx = new WyrazenieWywolanieNaiwneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				naiwne_wywolanie();
				}
				break;
			case 3:
				{
				_localctx = new WyrazenieAlokacjaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				alokacja();
				}
				break;
			case 4:
				{
				_localctx = new WyrazenieDealokacjaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				dealokacja();
				}
				break;
			case 5:
				{
				_localctx = new WyrazenieLwartoscContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				lwartosc();
				}
				break;
			case 6:
				{
				_localctx = new WyrazenieAdresContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				((WyrazenieAdresContext)_localctx).adr = match(T__17);
				setState(291);
				wyrazenie(14);
				}
				break;
			case 7:
				{
				_localctx = new WyrazenieNegacjaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				((WyrazenieNegacjaContext)_localctx).neg = match(T__18);
				setState(293);
				wyrazenie(13);
				}
				break;
			case 8:
				{
				_localctx = new WyrazenieZnakContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
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
				setState(295);
				wyrazenie(12);
				}
				break;
			case 9:
				{
				_localctx = new WyrazenieStalaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(296);
				stala_atomiczna();
				}
				break;
			case 10:
				{
				_localctx = new WyrazenieNawiasyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				match(T__10);
				setState(298);
				wyrazenie(0);
				setState(299);
				match(T__11);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(340);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new WyrazeniePotegContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(303);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(304);
						match(T__21);
						setState(305);
						wyrazenie(11);
						notifyErrorListeners("Operator potegowania jeszcze nie zaimplementowany...");
						}
						break;
					case 2:
						{
						_localctx = new WyrazenieMultContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(308);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(309);
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
						setState(310);
						wyrazenie(11);
						}
						break;
					case 3:
						{
						_localctx = new WyrazenieAddytContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(311);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(312);
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
						setState(313);
						wyrazenie(10);
						}
						break;
					case 4:
						{
						_localctx = new WyrazenieLogiczContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(314);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(315);
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
						setState(316);
						wyrazenie(9);
						}
						break;
					case 5:
						{
						_localctx = new WyrazeniePorownanieContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(317);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(318);
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
						setState(319);
						wyrazenie(8);
						}
						break;
					case 6:
						{
						_localctx = new WyrazeniePrzypisanieZwykleContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(320);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(321);
						match(T__6);
						setState(322);
						wyrazenie(6);
						}
						break;
					case 7:
						{
						_localctx = new WyrazeniePrzypisaniePotegContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(323);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(324);
						match(T__33);
						setState(325);
						wyrazenie(5);
						notifyErrorListeners("Operator potegowania jeszcze nie zaimplementowany...");
						}
						break;
					case 8:
						{
						_localctx = new WyrazeniePrzypisanieMultContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(328);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(329);
						((WyrazeniePrzypisanieMultContext)_localctx).mult = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
							((WyrazeniePrzypisanieMultContext)_localctx).mult = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						notifyErrorListeners("'*='  '/='  '%=' jeszcze nie zaimplementowane...");
						setState(331);
						wyrazenie(4);
						}
						break;
					case 9:
						{
						_localctx = new WyrazeniePrzypisanieAddytContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(332);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(333);
						((WyrazeniePrzypisanieAddytContext)_localctx).addyt = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__37 || _la==T__38) ) {
							((WyrazeniePrzypisanieAddytContext)_localctx).addyt = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						notifyErrorListeners("'+=' | '-=' jeszcze nie zaimplementowane...");
						setState(335);
						wyrazenie(3);
						}
						break;
					case 10:
						{
						_localctx = new WyrazenieSelekcjaTablicowaContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(336);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(337);
						selektor_tablicowy();
						}
						break;
					case 11:
						{
						_localctx = new WyrazenieSelekcjiSkladowejContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(338);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(339);
						selektor_typu_zlozonego();
						}
						break;
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class AlokacjaContext extends ParserRuleContext {
		public TerminalNode NOWY() { return getToken(plplParser.NOWY, 0); }
		public Pelny_typ_dynamicznyContext pelny_typ_dynamiczny() {
			return getRuleContext(Pelny_typ_dynamicznyContext.class,0);
		}
		public AlokacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alokacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterAlokacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitAlokacja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitAlokacja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlokacjaContext alokacja() throws RecognitionException {
		AlokacjaContext _localctx = new AlokacjaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_alokacja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(NOWY);
			setState(346);
			match(T__10);
			setState(347);
			pelny_typ_dynamiczny();
			setState(348);
			match(T__11);
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

	public static class DealokacjaContext extends ParserRuleContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public DealokacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dealokacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterDealokacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitDealokacja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitDealokacja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DealokacjaContext dealokacja() throws RecognitionException {
		DealokacjaContext _localctx = new DealokacjaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_dealokacja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__39);
			setState(351);
			match(T__10);
			setState(352);
			wyrazenie(0);
			setState(353);
			match(T__11);
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

	public static class LwartoscContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(plplParser.ID, 0); }
		public Stala_tablicowaContext stala_tablicowa() {
			return getRuleContext(Stala_tablicowaContext.class,0);
		}
		public TerminalNode NIC() { return getToken(plplParser.NIC, 0); }
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
		enterRule(_localctx, 58, RULE_lwartosc);
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(ID);
				}
				break;
			case NAPIS_DOSL:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				stala_tablicowa();
				}
				break;
			case NIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				match(NIC);
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
		enterRule(_localctx, 60, RULE_selektor_tablicowy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__40);
			setState(361);
			wyrazenie(0);
			setState(362);
			match(T__41);
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
		enterRule(_localctx, 62, RULE_selektor_typu_zlozonego);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__42);
			setState(365);
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
		enterRule(_localctx, 64, RULE_wywolanie_funkcji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(ID);
			setState(368);
			match(T__10);
			setState(369);
			lista_parametrow_aktualnych();
			setState(370);
			match(T__11);
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

	public static class Naiwne_wywolanieContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(plplParser.ID, 0); }
		public Lista_parametrow_aktualnychContext lista_parametrow_aktualnych() {
			return getRuleContext(Lista_parametrow_aktualnychContext.class,0);
		}
		public Naiwne_wywolanieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naiwne_wywolanie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterNaiwne_wywolanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitNaiwne_wywolanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitNaiwne_wywolanie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Naiwne_wywolanieContext naiwne_wywolanie() throws RecognitionException {
		Naiwne_wywolanieContext _localctx = new Naiwne_wywolanieContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_naiwne_wywolanie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(T__43);
			setState(373);
			match(ID);
			setState(374);
			match(T__10);
			setState(375);
			lista_parametrow_aktualnych();
			setState(376);
			match(T__11);
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
		enterRule(_localctx, 68, RULE_lista_parametrow_aktualnych);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__39) | (1L << T__43) | (1L << NIC) | (1L << NOWY) | (1L << ZMIENN) | (1L << CALK) | (1L << ZNAK_DOSL) | (1L << NAPIS_DOSL) | (1L << ID))) != 0)) {
				{
				setState(378);
				wyrazenie(0);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(379);
					match(T__5);
					setState(380);
					wyrazenie(0);
					}
					}
					setState(385);
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
		enterRule(_localctx, 70, RULE_stala_atomiczna);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALK:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(CALK);
				}
				break;
			case ZMIENN:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(ZMIENN);
				notifyErrorListeners("Liczby zmienoprzecinkowe jeszcze nie zaimplementowane");
				}
				break;
			case ZNAK_DOSL:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				match(ZNAK_DOSL);
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
		enterRule(_localctx, 72, RULE_stala_tablicowa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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
		enterRule(_localctx, 74, RULE_pelny_typ);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TCALK:
			case TRZECZYW:
			case TZNAK:
			case TREF:
				{
				setState(396);
				nazwa_typu_atom();
				}
				break;
			case ID:
				{
				setState(397);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(400);
					nieokreslony_deklarator_tablicowy();
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(406);
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

	public static class Pelny_typ_dynamicznyContext extends ParserRuleContext {
		public Nazwa_dynamicznie_alokowalnego_typu_atomContext nazwa_dynamicznie_alokowalnego_typu_atom() {
			return getRuleContext(Nazwa_dynamicznie_alokowalnego_typu_atomContext.class,0);
		}
		public TerminalNode ID() { return getToken(plplParser.ID, 0); }
		public Obliczany_deklarator_tablicowyContext obliczany_deklarator_tablicowy() {
			return getRuleContext(Obliczany_deklarator_tablicowyContext.class,0);
		}
		public List<Nieokreslony_deklarator_tablicowyContext> nieokreslony_deklarator_tablicowy() {
			return getRuleContexts(Nieokreslony_deklarator_tablicowyContext.class);
		}
		public Nieokreslony_deklarator_tablicowyContext nieokreslony_deklarator_tablicowy(int i) {
			return getRuleContext(Nieokreslony_deklarator_tablicowyContext.class,i);
		}
		public Pelny_typ_dynamicznyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pelny_typ_dynamiczny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterPelny_typ_dynamiczny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitPelny_typ_dynamiczny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitPelny_typ_dynamiczny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pelny_typ_dynamicznyContext pelny_typ_dynamiczny() throws RecognitionException {
		Pelny_typ_dynamicznyContext _localctx = new Pelny_typ_dynamicznyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_pelny_typ_dynamiczny);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TCALK:
			case TRZECZYW:
			case TZNAK:
			case TREF:
				{
				setState(409);
				nazwa_dynamicznie_alokowalnego_typu_atom();
				}
				break;
			case ID:
				{
				setState(410);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(413);
				obliczany_deklarator_tablicowy();
				}
				break;
			}
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40) {
				{
				{
				setState(416);
				nieokreslony_deklarator_tablicowy();
				}
				}
				setState(421);
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
		enterRule(_localctx, 78, RULE_nieokreslony_deklarator_tablicowy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(T__40);
			setState(423);
			match(T__41);
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
		enterRule(_localctx, 80, RULE_okreslony_deklarator_tablicowy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(T__40);
			setState(426);
			match(CALK);
			setState(427);
			match(T__41);
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

	public static class Obliczany_deklarator_tablicowyContext extends ParserRuleContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public Obliczany_deklarator_tablicowyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obliczany_deklarator_tablicowy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterObliczany_deklarator_tablicowy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitObliczany_deklarator_tablicowy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitObliczany_deklarator_tablicowy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Obliczany_deklarator_tablicowyContext obliczany_deklarator_tablicowy() throws RecognitionException {
		Obliczany_deklarator_tablicowyContext _localctx = new Obliczany_deklarator_tablicowyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_obliczany_deklarator_tablicowy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__40);
			setState(430);
			wyrazenie(0);
			setState(431);
			match(T__41);
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
		enterRule(_localctx, 84, RULE_przydomki);
		int _la;
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATYCZN || _la==AUTOMATYCZN) {
					{
					setState(433);
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

				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAL) {
					{
					setState(436);
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
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAL) {
					{
					setState(439);
					match(STAL);
					}
				}

				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATYCZN || _la==AUTOMATYCZN) {
					{
					setState(442);
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
		enterRule(_localctx, 86, RULE_nazwa_typu_atom);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TCALK:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(TCALK);
				}
				break;
			case TRZECZYW:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(TRZECZYW);
				notifyErrorListeners("Liczby zmienoprzecinkowe jeszcze nie zaimplementowane");
				}
				break;
			case TZNAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				match(TZNAK);
				}
				break;
			case TREF:
				enterOuterAlt(_localctx, 4);
				{
				setState(451);
				match(TREF);
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

	public static class Nazwa_dynamicznie_alokowalnego_typu_atomContext extends ParserRuleContext {
		public TerminalNode TCALK() { return getToken(plplParser.TCALK, 0); }
		public TerminalNode TRZECZYW() { return getToken(plplParser.TRZECZYW, 0); }
		public TerminalNode TZNAK() { return getToken(plplParser.TZNAK, 0); }
		public TerminalNode TREF() { return getToken(plplParser.TREF, 0); }
		public Nazwa_dynamicznie_alokowalnego_typu_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nazwa_dynamicznie_alokowalnego_typu_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).enterNazwa_dynamicznie_alokowalnego_typu_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plplListener ) ((plplListener)listener).exitNazwa_dynamicznie_alokowalnego_typu_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof plplVisitor ) return ((plplVisitor<? extends T>)visitor).visitNazwa_dynamicznie_alokowalnego_typu_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nazwa_dynamicznie_alokowalnego_typu_atomContext nazwa_dynamicznie_alokowalnego_typu_atom() throws RecognitionException {
		Nazwa_dynamicznie_alokowalnego_typu_atomContext _localctx = new Nazwa_dynamicznie_alokowalnego_typu_atomContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_nazwa_dynamicznie_alokowalnego_typu_atom);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TCALK:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(TCALK);
				}
				break;
			case TRZECZYW:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				match(TRZECZYW);
				notifyErrorListeners("Liczby zmienoprzecinkowe jeszcze nie zaimplementowane");
				}
				break;
			case TZNAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				match(TZNAK);
				}
				break;
			case TREF:
				enterOuterAlt(_localctx, 4);
				{
				setState(458);
				match(TREF);
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
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 16);
		case 10:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u01d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\7\2^\n\2\f\2\16\2a\13\2\3\2\3\2\3\3\3\3\3\3\5\3h"+
		"\n\3\3\4\3\4\3\4\5\4m\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\6\6"+
		"y\n\6\r\6\16\6z\3\6\3\6\3\7\3\7\5\7\u0081\n\7\3\b\3\b\3\b\3\b\5\b\u0087"+
		"\n\b\3\b\3\b\3\b\5\b\u008c\n\b\7\b\u008e\n\b\f\b\16\b\u0091\13\b\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009d\n\n\3\13\3\13\3\13\3\13\5"+
		"\13\u00a3\n\13\3\13\3\13\3\13\5\13\u00a8\n\13\7\13\u00aa\n\13\f\13\16"+
		"\13\u00ad\13\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00b5\n\f\3\r\6\r\u00b8"+
		"\n\r\r\r\16\r\u00b9\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00c8\n\16\3\17\3\17\5\17\u00cc\n\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d7\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\5\22\u00e2\n\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\5\27\u00fd\n\27\3\27\3\27\7\27\u0101\n\27\f\27\16"+
		"\27\u0104\13\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\7\32\u0111\n\32\f\32\16\32\u0114\13\32\5\32\u0116\n\32\3\33\3\33\3\33"+
		"\5\33\u011b\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0130\n\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0157\n\34\f\34\16\34\u015a\13\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\5\37"+
		"\u0169\n\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\7$\u0180\n$\f$\16$\u0183\13$\5$\u0185\n$\3%\3%\3%\3%\5%\u018b"+
		"\n%\3&\3&\3\'\3\'\5\'\u0191\n\'\3\'\7\'\u0194\n\'\f\'\16\'\u0197\13\'"+
		"\3\'\5\'\u019a\n\'\3(\3(\5(\u019e\n(\3(\5(\u01a1\n(\3(\7(\u01a4\n(\f("+
		"\16(\u01a7\13(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\5,\u01b5\n,\3,\5,\u01b8"+
		"\n,\3,\5,\u01bb\n,\3,\5,\u01be\n,\5,\u01c0\n,\3-\3-\3-\3-\3-\5-\u01c7"+
		"\n-\3.\3.\3.\3.\3.\5.\u01ce\n.\3.\2\3\66/\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\n\3\2\n\f\3\2\26\27"+
		"\3\2\31\33\3\2\34\35\3\2\36#\3\2%\'\3\2()\3\2\61\62\2\u01f0\2_\3\2\2\2"+
		"\4g\3\2\2\2\6i\3\2\2\2\br\3\2\2\2\nt\3\2\2\2\f\u0080\3\2\2\2\16\u0082"+
		"\3\2\2\2\20\u0094\3\2\2\2\22\u0096\3\2\2\2\24\u009e\3\2\2\2\26\u00b0\3"+
		"\2\2\2\30\u00b7\3\2\2\2\32\u00c7\3\2\2\2\34\u00c9\3\2\2\2\36\u00cf\3\2"+
		"\2\2 \u00d8\3\2\2\2\"\u00de\3\2\2\2$\u00e6\3\2\2\2&\u00ed\3\2\2\2(\u00f3"+
		"\3\2\2\2*\u00f6\3\2\2\2,\u00f9\3\2\2\2.\u0108\3\2\2\2\60\u010b\3\2\2\2"+
		"\62\u0115\3\2\2\2\64\u0117\3\2\2\2\66\u012f\3\2\2\28\u015b\3\2\2\2:\u0160"+
		"\3\2\2\2<\u0168\3\2\2\2>\u016a\3\2\2\2@\u016e\3\2\2\2B\u0171\3\2\2\2D"+
		"\u0176\3\2\2\2F\u0184\3\2\2\2H\u018a\3\2\2\2J\u018c\3\2\2\2L\u0190\3\2"+
		"\2\2N\u019d\3\2\2\2P\u01a8\3\2\2\2R\u01ab\3\2\2\2T\u01af\3\2\2\2V\u01bf"+
		"\3\2\2\2X\u01c6\3\2\2\2Z\u01cd\3\2\2\2\\^\5\4\3\2]\\\3\2\2\2^a\3\2\2\2"+
		"_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\2\2\3c\3\3\2\2\2dh\5\6\4"+
		"\2eh\5\n\6\2fh\5\f\7\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\5\3\2\2\2il\7\3"+
		"\2\2jk\7\4\2\2km\5\b\5\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\5\2\2op\5\30"+
		"\r\2pq\7\6\2\2q\7\3\2\2\2rs\5L\'\2s\t\3\2\2\2tu\7\7\2\2uv\7A\2\2vx\7\5"+
		"\2\2wy\5\f\7\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\6"+
		"\2\2}\13\3\2\2\2~\u0081\5\16\b\2\177\u0081\5\24\13\2\u0080~\3\2\2\2\u0080"+
		"\177\3\2\2\2\u0081\r\3\2\2\2\u0082\u0083\5V,\2\u0083\u0086\5X-\2\u0084"+
		"\u0087\5\22\n\2\u0085\u0087\5\20\t\2\u0086\u0084\3\2\2\2\u0086\u0085\3"+
		"\2\2\2\u0087\u008f\3\2\2\2\u0088\u008b\7\b\2\2\u0089\u008c\5\22\n\2\u008a"+
		"\u008c\5\20\t\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008e\3"+
		"\2\2\2\u008d\u0088\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7B"+
		"\2\2\u0093\17\3\2\2\2\u0094\u0095\7A\2\2\u0095\21\3\2\2\2\u0096\u0097"+
		"\7A\2\2\u0097\u009c\7\t\2\2\u0098\u009d\7=\2\2\u0099\u009a\7<\2\2\u009a"+
		"\u009d\b\n\1\2\u009b\u009d\7>\2\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2"+
		"\2\2\u009c\u009b\3\2\2\2\u009d\23\3\2\2\2\u009e\u009f\5V,\2\u009f\u00a2"+
		"\5L\'\2\u00a0\u00a3\5\20\t\2\u00a1\u00a3\5\26\f\2\u00a2\u00a0\3\2\2\2"+
		"\u00a2\u00a1\3\2\2\2\u00a3\u00ab\3\2\2\2\u00a4\u00a7\7\b\2\2\u00a5\u00a8"+
		"\5\20\t\2\u00a6\u00a8\5\26\f\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2"+
		"\u00a8\u00aa\3\2\2\2\u00a9\u00a4\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00af\7B\2\2\u00af\25\3\2\2\2\u00b0\u00b1\7A\2\2\u00b1\u00b4\7\t\2\2"+
		"\u00b2\u00b5\5<\37\2\u00b3\u00b5\5J&\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3"+
		"\3\2\2\2\u00b5\27\3\2\2\2\u00b6\u00b8\5\32\16\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\31\3\2\2"+
		"\2\u00bb\u00c8\5\36\20\2\u00bc\u00c8\5 \21\2\u00bd\u00c8\5\34\17\2\u00be"+
		"\u00c8\5(\25\2\u00bf\u00c8\5*\26\2\u00c0\u00c8\5,\27\2\u00c1\u00c8\5."+
		"\30\2\u00c2\u00c8\5$\23\2\u00c3\u00c8\5\"\22\2\u00c4\u00c8\5&\24\2\u00c5"+
		"\u00c8\5\f\7\2\u00c6\u00c8\5\60\31\2\u00c7\u00bb\3\2\2\2\u00c7\u00bc\3"+
		"\2\2\2\u00c7\u00bd\3\2\2\2\u00c7\u00be\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7"+
		"\u00c0\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c3\3\2"+
		"\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\33\3\2\2\2\u00c9\u00cb\7\5\2\2\u00ca\u00cc\5\30\r\2\u00cb\u00ca\3\2\2"+
		"\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\6\2\2\u00ce\35"+
		"\3\2\2\2\u00cf\u00d0\t\2\2\2\u00d0\u00d1\7\r\2\2\u00d1\u00d2\5\66\34\2"+
		"\u00d2\u00d3\7\16\2\2\u00d3\u00d6\5\32\16\2\u00d4\u00d5\7\17\2\2\u00d5"+
		"\u00d7\5\32\16\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\37\3\2"+
		"\2\2\u00d8\u00d9\7\20\2\2\u00d9\u00da\7\r\2\2\u00da\u00db\5\66\34\2\u00db"+
		"\u00dc\7\16\2\2\u00dc\u00dd\5\32\16\2\u00dd!\3\2\2\2\u00de\u00df\7\21"+
		"\2\2\u00df\u00e1\7\r\2\2\u00e0\u00e2\5\66\34\2\u00e1\u00e0\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\16\2\2\u00e4\u00e5\7"+
		"B\2\2\u00e5#\3\2\2\2\u00e6\u00e7\7\22\2\2\u00e7\u00e8\7A\2\2\u00e8\u00e9"+
		"\7\r\2\2\u00e9\u00ea\5\62\32\2\u00ea\u00eb\7\16\2\2\u00eb\u00ec\7B\2\2"+
		"\u00ec%\3\2\2\2\u00ed\u00ee\7\23\2\2\u00ee\u00ef\7\r\2\2\u00ef\u00f0\5"+
		"\66\34\2\u00f0\u00f1\7\16\2\2\u00f1\u00f2\7B\2\2\u00f2\'\3\2\2\2\u00f3"+
		"\u00f4\7:\2\2\u00f4\u00f5\7B\2\2\u00f5)\3\2\2\2\u00f6\u00f7\7;\2\2\u00f7"+
		"\u00f8\7B\2\2\u00f8+\3\2\2\2\u00f9\u00fa\79\2\2\u00fa\u00fc\7\r\2\2\u00fb"+
		"\u00fd\5\66\34\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0102\3"+
		"\2\2\2\u00fe\u00ff\7\b\2\2\u00ff\u0101\5\66\34\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7\16\2\2\u0106\u0107\7B\2\2\u0107"+
		"-\3\2\2\2\u0108\u0109\5\66\34\2\u0109\u010a\7B\2\2\u010a/\3\2\2\2\u010b"+
		"\u010c\7@\2\2\u010c\61\3\2\2\2\u010d\u0112\5\64\33\2\u010e\u010f\7\b\2"+
		"\2\u010f\u0111\5\64\33\2\u0110\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0115\u010d\3\2\2\2\u0115\u0116\3\2\2\2\u0116\63\3\2\2\2\u0117\u011a"+
		"\5V,\2\u0118\u011b\5X-\2\u0119\u011b\5L\'\2\u011a\u0118\3\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\5\20\t\2\u011d\65\3\2\2"+
		"\2\u011e\u011f\b\34\1\2\u011f\u0130\5B\"\2\u0120\u0130\5D#\2\u0121\u0130"+
		"\58\35\2\u0122\u0130\5:\36\2\u0123\u0130\5<\37\2\u0124\u0125\7\24\2\2"+
		"\u0125\u0130\5\66\34\20\u0126\u0127\7\25\2\2\u0127\u0130\5\66\34\17\u0128"+
		"\u0129\t\3\2\2\u0129\u0130\5\66\34\16\u012a\u0130\5H%\2\u012b\u012c\7"+
		"\r\2\2\u012c\u012d\5\66\34\2\u012d\u012e\7\16\2\2\u012e\u0130\3\2\2\2"+
		"\u012f\u011e\3\2\2\2\u012f\u0120\3\2\2\2\u012f\u0121\3\2\2\2\u012f\u0122"+
		"\3\2\2\2\u012f\u0123\3\2\2\2\u012f\u0124\3\2\2\2\u012f\u0126\3\2\2\2\u012f"+
		"\u0128\3\2\2\2\u012f\u012a\3\2\2\2\u012f\u012b\3\2\2\2\u0130\u0158\3\2"+
		"\2\2\u0131\u0132\f\r\2\2\u0132\u0133\7\30\2\2\u0133\u0134\5\66\34\r\u0134"+
		"\u0135\b\34\1\2\u0135\u0157\3\2\2\2\u0136\u0137\f\f\2\2\u0137\u0138\t"+
		"\4\2\2\u0138\u0157\5\66\34\r\u0139\u013a\f\13\2\2\u013a\u013b\t\3\2\2"+
		"\u013b\u0157\5\66\34\f\u013c\u013d\f\n\2\2\u013d\u013e\t\5\2\2\u013e\u0157"+
		"\5\66\34\13\u013f\u0140\f\t\2\2\u0140\u0141\t\6\2\2\u0141\u0157\5\66\34"+
		"\n\u0142\u0143\f\b\2\2\u0143\u0144\7\t\2\2\u0144\u0157\5\66\34\b\u0145"+
		"\u0146\f\7\2\2\u0146\u0147\7$\2\2\u0147\u0148\5\66\34\7\u0148\u0149\b"+
		"\34\1\2\u0149\u0157\3\2\2\2\u014a\u014b\f\6\2\2\u014b\u014c\t\7\2\2\u014c"+
		"\u014d\b\34\1\2\u014d\u0157\5\66\34\6\u014e\u014f\f\5\2\2\u014f\u0150"+
		"\t\b\2\2\u0150\u0151\b\34\1\2\u0151\u0157\5\66\34\5\u0152\u0153\f\22\2"+
		"\2\u0153\u0157\5> \2\u0154\u0155\f\21\2\2\u0155\u0157\5@!\2\u0156\u0131"+
		"\3\2\2\2\u0156\u0136\3\2\2\2\u0156\u0139\3\2\2\2\u0156\u013c\3\2\2\2\u0156"+
		"\u013f\3\2\2\2\u0156\u0142\3\2\2\2\u0156\u0145\3\2\2\2\u0156\u014a\3\2"+
		"\2\2\u0156\u014e\3\2\2\2\u0156\u0152\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\67\3\2\2"+
		"\2\u015a\u0158\3\2\2\2\u015b\u015c\78\2\2\u015c\u015d\7\r\2\2\u015d\u015e"+
		"\5N(\2\u015e\u015f\7\16\2\2\u015f9\3\2\2\2\u0160\u0161\7*\2\2\u0161\u0162"+
		"\7\r\2\2\u0162\u0163\5\66\34\2\u0163\u0164\7\16\2\2\u0164;\3\2\2\2\u0165"+
		"\u0169\7A\2\2\u0166\u0169\5J&\2\u0167\u0169\7\60\2\2\u0168\u0165\3\2\2"+
		"\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169=\3\2\2\2\u016a\u016b"+
		"\7+\2\2\u016b\u016c\5\66\34\2\u016c\u016d\7,\2\2\u016d?\3\2\2\2\u016e"+
		"\u016f\7-\2\2\u016f\u0170\7A\2\2\u0170A\3\2\2\2\u0171\u0172\7A\2\2\u0172"+
		"\u0173\7\r\2\2\u0173\u0174\5F$\2\u0174\u0175\7\16\2\2\u0175C\3\2\2\2\u0176"+
		"\u0177\7.\2\2\u0177\u0178\7A\2\2\u0178\u0179\7\r\2\2\u0179\u017a\5F$\2"+
		"\u017a\u017b\7\16\2\2\u017bE\3\2\2\2\u017c\u0181\5\66\34\2\u017d\u017e"+
		"\7\b\2\2\u017e\u0180\5\66\34\2\u017f\u017d\3\2\2\2\u0180\u0183\3\2\2\2"+
		"\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181"+
		"\3\2\2\2\u0184\u017c\3\2\2\2\u0184\u0185\3\2\2\2\u0185G\3\2\2\2\u0186"+
		"\u018b\7=\2\2\u0187\u0188\7<\2\2\u0188\u018b\b%\1\2\u0189\u018b\7>\2\2"+
		"\u018a\u0186\3\2\2\2\u018a\u0187\3\2\2\2\u018a\u0189\3\2\2\2\u018bI\3"+
		"\2\2\2\u018c\u018d\7?\2\2\u018dK\3\2\2\2\u018e\u0191\5X-\2\u018f\u0191"+
		"\7A\2\2\u0190\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0191\u0195\3\2\2\2\u0192"+
		"\u0194\5P)\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2"+
		"\2\u0195\u0196\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019a"+
		"\5R*\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019aM\3\2\2\2\u019b\u019e"+
		"\5Z.\2\u019c\u019e\7A\2\2\u019d\u019b\3\2\2\2\u019d\u019c\3\2\2\2\u019e"+
		"\u01a0\3\2\2\2\u019f\u01a1\5T+\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2"+
		"\2\u01a1\u01a5\3\2\2\2\u01a2\u01a4\5P)\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7"+
		"\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6O\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a8\u01a9\7+\2\2\u01a9\u01aa\7,\2\2\u01aaQ\3\2\2\2\u01ab"+
		"\u01ac\7+\2\2\u01ac\u01ad\7=\2\2\u01ad\u01ae\7,\2\2\u01aeS\3\2\2\2\u01af"+
		"\u01b0\7+\2\2\u01b0\u01b1\5\66\34\2\u01b1\u01b2\7,\2\2\u01b2U\3\2\2\2"+
		"\u01b3\u01b5\t\t\2\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7"+
		"\3\2\2\2\u01b6\u01b8\7\63\2\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2"+
		"\u01b8\u01c0\3\2\2\2\u01b9\u01bb\7\63\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01be\t\t\2\2\u01bd\u01bc\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01b4\3\2\2\2\u01bf\u01ba\3\2"+
		"\2\2\u01c0W\3\2\2\2\u01c1\u01c7\7\64\2\2\u01c2\u01c3\7\65\2\2\u01c3\u01c7"+
		"\b-\1\2\u01c4\u01c7\7\66\2\2\u01c5\u01c7\7\67\2\2\u01c6\u01c1\3\2\2\2"+
		"\u01c6\u01c2\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7Y\3"+
		"\2\2\2\u01c8\u01ce\7\64\2\2\u01c9\u01ca\7\65\2\2\u01ca\u01ce\b.\1\2\u01cb"+
		"\u01ce\7\66\2\2\u01cc\u01ce\7\67\2\2\u01cd\u01c8\3\2\2\2\u01cd\u01c9\3"+
		"\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce[\3\2\2\2-_glz\u0080"+
		"\u0086\u008b\u008f\u009c\u00a2\u00a7\u00ab\u00b4\u00b9\u00c7\u00cb\u00d6"+
		"\u00e1\u00fc\u0102\u0112\u0115\u011a\u012f\u0156\u0158\u0168\u0181\u0184"+
		"\u018a\u0190\u0195\u0199\u019d\u01a0\u01a5\u01b4\u01b7\u01ba\u01bd\u01bf"+
		"\u01c6\u01cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}