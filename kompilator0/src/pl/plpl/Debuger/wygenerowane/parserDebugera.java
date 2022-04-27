// Generated from C:/Users/mastr/Documents/MS/STUDIA/kompilatory/kompilatorpl/kompilator0/src/pl/plpl/Debuger\parserDebugera.g4 by ANTLR 4.9.2
package pl.plpl.Debuger.wygenerowane;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class parserDebugera extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OTW=1, ZMK=2, PRZEBIEG_TYPOWANIA=3, PRZEBIEG_ANALIZY_SEMANTYCZNEJ=4, PRZEBIEG_GENERACYJNY=5, 
		SEPARATOR_ZNACZNIKOWY=6, WSZ=7, ZMKK=8, PROC=9, ZAKR=10, MINUS_L=11, GWIAZDKA=12, 
		SREDNIK=13, PRZECINEK=14, ZGIN=15, DOKONCZ=16, STAN_MASZYNY_DEKLARACYJNEJ=17, 
		RAMKA=18, STATYCZNE=19, SEKCJA=20, TYPY=21, TOKENY=22, DRZEWO=23, SYMBOLE=24, 
		SYMBOL=25, TU=26, TUIWYZEJ=27, CD=28, LS=29, TEXT=30, BSS=31, DATA=32, 
		RODATA=33, ID=34, NUM=35, WS=36, NASTEPNA=37, SL_COMMENT=38;
	public static final int
		RULE_znacznik = 0, RULE_oznaczenia_przebiegow = 1, RULE_zbior_komend = 2, 
		RULE_reszta = 3, RULE_komenda = 4, RULE_nastepny_krok = 5, RULE_nastepny_znacznik = 6, 
		RULE_komenda_ubicia_kompilatora = 7, RULE_komenda_ubicia_debugera = 8, 
		RULE_przechodzenie = 9, RULE_cd_do_proc = 10, RULE_cd_do_zakresu = 11, 
		RULE_listowanie = 12, RULE_ogolne_listowanie = 13, RULE_listing_procedur = 14, 
		RULE_listing_zakresow = 15, RULE_pisz_zakres = 16, RULE_pisz_procedure = 17, 
		RULE_pisz_ramke_procedury = 18, RULE_pisz_statyczne_procedury = 19, RULE_pisz_sekcje = 20, 
		RULE_pisz_nazwy_typow = 21, RULE_pisz_tokeny = 22, RULE_pisz_drzewo_skladniowe = 23, 
		RULE_pisz_symbole = 24, RULE_pisz_symbol = 25, RULE_pisz_stan_maszyny_deklaracyjnej = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"znacznik", "oznaczenia_przebiegow", "zbior_komend", "reszta", "komenda", 
			"nastepny_krok", "nastepny_znacznik", "komenda_ubicia_kompilatora", "komenda_ubicia_debugera", 
			"przechodzenie", "cd_do_proc", "cd_do_zakresu", "listowanie", "ogolne_listowanie", 
			"listing_procedur", "listing_zakresow", "pisz_zakres", "pisz_procedure", 
			"pisz_ramke_procedury", "pisz_statyczne_procedury", "pisz_sekcje", "pisz_nazwy_typow", 
			"pisz_tokeny", "pisz_drzewo_skladniowe", "pisz_symbole", "pisz_symbol", 
			"pisz_stan_maszyny_deklaracyjnej"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", null, null, null, null, "':'", null, null, null, null, "'-l'", 
			"'*'", "';'", "','", null, null, null, "'ramka'", null, "'sekcja'", "'typy'", 
			"'tokeny'", null, null, null, "'tu'", "'tuiwy\u017Cej'", "'cd'", "'ls'", 
			null, null, null, null, null, null, null, "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OTW", "ZMK", "PRZEBIEG_TYPOWANIA", "PRZEBIEG_ANALIZY_SEMANTYCZNEJ", 
			"PRZEBIEG_GENERACYJNY", "SEPARATOR_ZNACZNIKOWY", "WSZ", "ZMKK", "PROC", 
			"ZAKR", "MINUS_L", "GWIAZDKA", "SREDNIK", "PRZECINEK", "ZGIN", "DOKONCZ", 
			"STAN_MASZYNY_DEKLARACYJNEJ", "RAMKA", "STATYCZNE", "SEKCJA", "TYPY", 
			"TOKENY", "DRZEWO", "SYMBOLE", "SYMBOL", "TU", "TUIWYZEJ", "CD", "LS", 
			"TEXT", "BSS", "DATA", "RODATA", "ID", "NUM", "WS", "NASTEPNA", "SL_COMMENT"
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

	public parserDebugera(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ZnacznikContext extends ParserRuleContext {
		public Oznaczenia_przebiegowContext oznaczenia_przebiegow() {
			return getRuleContext(Oznaczenia_przebiegowContext.class,0);
		}
		public TerminalNode OTW() { return getToken(parserDebugera.OTW, 0); }
		public TerminalNode SEPARATOR_ZNACZNIKOWY() { return getToken(parserDebugera.SEPARATOR_ZNACZNIKOWY, 0); }
		public Zbior_komendContext zbior_komend() {
			return getRuleContext(Zbior_komendContext.class,0);
		}
		public TerminalNode ZMK() { return getToken(parserDebugera.ZMK, 0); }
		public TerminalNode ZMKK() { return getToken(parserDebugera.ZMKK, 0); }
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTW) {
				{
				setState(54);
				match(OTW);
				}
			}

			setState(57);
			oznaczenia_przebiegow();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR_ZNACZNIKOWY) {
				{
				setState(58);
				match(SEPARATOR_ZNACZNIKOWY);
				setState(59);
				zbior_komend();
				}
			}

			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ZMK || _la==ZMKK) {
				{
				setState(62);
				_la = _input.LA(1);
				if ( !(_la==ZMK || _la==ZMKK) ) {
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
		public List<TerminalNode> PRZEBIEG_TYPOWANIA() { return getTokens(parserDebugera.PRZEBIEG_TYPOWANIA); }
		public TerminalNode PRZEBIEG_TYPOWANIA(int i) {
			return getToken(parserDebugera.PRZEBIEG_TYPOWANIA, i);
		}
		public List<TerminalNode> PRZEBIEG_ANALIZY_SEMANTYCZNEJ() { return getTokens(parserDebugera.PRZEBIEG_ANALIZY_SEMANTYCZNEJ); }
		public TerminalNode PRZEBIEG_ANALIZY_SEMANTYCZNEJ(int i) {
			return getToken(parserDebugera.PRZEBIEG_ANALIZY_SEMANTYCZNEJ, i);
		}
		public List<TerminalNode> PRZEBIEG_GENERACYJNY() { return getTokens(parserDebugera.PRZEBIEG_GENERACYJNY); }
		public TerminalNode PRZEBIEG_GENERACYJNY(int i) {
			return getToken(parserDebugera.PRZEBIEG_GENERACYJNY, i);
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
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRZEBIEG_TYPOWANIA) | (1L << PRZEBIEG_ANALIZY_SEMANTYCZNEJ) | (1L << PRZEBIEG_GENERACYJNY))) != 0)) {
				{
				{
				setState(65);
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
				setState(70);
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

	public static class Zbior_komendContext extends ParserRuleContext {
		public KomendaContext komenda() {
			return getRuleContext(KomendaContext.class,0);
		}
		public TerminalNode NASTEPNA() { return getToken(parserDebugera.NASTEPNA, 0); }
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
			setState(71);
			komenda();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NASTEPNA) {
				{
				setState(72);
				match(NASTEPNA);
				setState(73);
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
		public List<TerminalNode> ZMK() { return getTokens(parserDebugera.ZMK); }
		public TerminalNode ZMK(int i) {
			return getToken(parserDebugera.ZMK, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
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
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class KomendaContext extends ParserRuleContext {
		public Nastepny_krokContext nastepny_krok() {
			return getRuleContext(Nastepny_krokContext.class,0);
		}
		public Nastepny_znacznikContext nastepny_znacznik() {
			return getRuleContext(Nastepny_znacznikContext.class,0);
		}
		public Komenda_ubicia_kompilatoraContext komenda_ubicia_kompilatora() {
			return getRuleContext(Komenda_ubicia_kompilatoraContext.class,0);
		}
		public Komenda_ubicia_debugeraContext komenda_ubicia_debugera() {
			return getRuleContext(Komenda_ubicia_debugeraContext.class,0);
		}
		public ListowanieContext listowanie() {
			return getRuleContext(ListowanieContext.class,0);
		}
		public PrzechodzenieContext przechodzenie() {
			return getRuleContext(PrzechodzenieContext.class,0);
		}
		public KomendaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_komenda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterKomenda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitKomenda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitKomenda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KomendaContext komenda() throws RecognitionException {
		KomendaContext _localctx = new KomendaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_komenda);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SREDNIK:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				nastepny_krok();
				}
				break;
			case PRZECINEK:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				nastepny_znacznik();
				}
				break;
			case ZGIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				komenda_ubicia_kompilatora();
				}
				break;
			case DOKONCZ:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				komenda_ubicia_debugera();
				}
				break;
			case PROC:
			case ZAKR:
			case STAN_MASZYNY_DEKLARACYJNEJ:
			case RAMKA:
			case STATYCZNE:
			case SEKCJA:
			case TYPY:
			case TOKENY:
			case DRZEWO:
			case SYMBOLE:
			case SYMBOL:
			case LS:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				listowanie();
				}
				break;
			case CD:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				przechodzenie();
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

	public static class Nastepny_krokContext extends ParserRuleContext {
		public TerminalNode SREDNIK() { return getToken(parserDebugera.SREDNIK, 0); }
		public Nastepny_krokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nastepny_krok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterNastepny_krok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitNastepny_krok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitNastepny_krok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nastepny_krokContext nastepny_krok() throws RecognitionException {
		Nastepny_krokContext _localctx = new Nastepny_krokContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nastepny_krok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(SREDNIK);
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

	public static class Nastepny_znacznikContext extends ParserRuleContext {
		public TerminalNode PRZECINEK() { return getToken(parserDebugera.PRZECINEK, 0); }
		public Nastepny_znacznikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nastepny_znacznik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterNastepny_znacznik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitNastepny_znacznik(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitNastepny_znacznik(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nastepny_znacznikContext nastepny_znacznik() throws RecognitionException {
		Nastepny_znacznikContext _localctx = new Nastepny_znacznikContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nastepny_znacznik);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(PRZECINEK);
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

	public static class Komenda_ubicia_kompilatoraContext extends ParserRuleContext {
		public TerminalNode ZGIN() { return getToken(parserDebugera.ZGIN, 0); }
		public Komenda_ubicia_kompilatoraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_komenda_ubicia_kompilatora; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterKomenda_ubicia_kompilatora(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitKomenda_ubicia_kompilatora(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitKomenda_ubicia_kompilatora(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Komenda_ubicia_kompilatoraContext komenda_ubicia_kompilatora() throws RecognitionException {
		Komenda_ubicia_kompilatoraContext _localctx = new Komenda_ubicia_kompilatoraContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_komenda_ubicia_kompilatora);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(ZGIN);
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

	public static class Komenda_ubicia_debugeraContext extends ParserRuleContext {
		public TerminalNode DOKONCZ() { return getToken(parserDebugera.DOKONCZ, 0); }
		public Komenda_ubicia_debugeraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_komenda_ubicia_debugera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterKomenda_ubicia_debugera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitKomenda_ubicia_debugera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitKomenda_ubicia_debugera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Komenda_ubicia_debugeraContext komenda_ubicia_debugera() throws RecognitionException {
		Komenda_ubicia_debugeraContext _localctx = new Komenda_ubicia_debugeraContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_komenda_ubicia_debugera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(DOKONCZ);
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

	public static class PrzechodzenieContext extends ParserRuleContext {
		public TerminalNode CD() { return getToken(parserDebugera.CD, 0); }
		public Cd_do_procContext cd_do_proc() {
			return getRuleContext(Cd_do_procContext.class,0);
		}
		public Cd_do_zakresuContext cd_do_zakresu() {
			return getRuleContext(Cd_do_zakresuContext.class,0);
		}
		public PrzechodzenieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_przechodzenie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterPrzechodzenie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitPrzechodzenie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitPrzechodzenie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrzechodzenieContext przechodzenie() throws RecognitionException {
		PrzechodzenieContext _localctx = new PrzechodzenieContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_przechodzenie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(CD);
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROC:
				{
				setState(99);
				cd_do_proc();
				}
				break;
			case ZAKR:
				{
				setState(100);
				cd_do_zakresu();
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

	public static class Cd_do_procContext extends ParserRuleContext {
		public TerminalNode PROC() { return getToken(parserDebugera.PROC, 0); }
		public TerminalNode NUM() { return getToken(parserDebugera.NUM, 0); }
		public Cd_do_procContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cd_do_proc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterCd_do_proc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitCd_do_proc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitCd_do_proc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cd_do_procContext cd_do_proc() throws RecognitionException {
		Cd_do_procContext _localctx = new Cd_do_procContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cd_do_proc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(PROC);
			setState(104);
			match(NUM);
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

	public static class Cd_do_zakresuContext extends ParserRuleContext {
		public TerminalNode ZAKR() { return getToken(parserDebugera.ZAKR, 0); }
		public TerminalNode NUM() { return getToken(parserDebugera.NUM, 0); }
		public Cd_do_zakresuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cd_do_zakresu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterCd_do_zakresu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitCd_do_zakresu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitCd_do_zakresu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cd_do_zakresuContext cd_do_zakresu() throws RecognitionException {
		Cd_do_zakresuContext _localctx = new Cd_do_zakresuContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cd_do_zakresu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ZAKR);
			setState(107);
			match(NUM);
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

	public static class ListowanieContext extends ParserRuleContext {
		public Ogolne_listowanieContext ogolne_listowanie() {
			return getRuleContext(Ogolne_listowanieContext.class,0);
		}
		public TerminalNode LS() { return getToken(parserDebugera.LS, 0); }
		public Listing_procedurContext listing_procedur() {
			return getRuleContext(Listing_procedurContext.class,0);
		}
		public Listing_zakresowContext listing_zakresow() {
			return getRuleContext(Listing_zakresowContext.class,0);
		}
		public Pisz_zakresContext pisz_zakres() {
			return getRuleContext(Pisz_zakresContext.class,0);
		}
		public Pisz_procedureContext pisz_procedure() {
			return getRuleContext(Pisz_procedureContext.class,0);
		}
		public Pisz_ramke_proceduryContext pisz_ramke_procedury() {
			return getRuleContext(Pisz_ramke_proceduryContext.class,0);
		}
		public Pisz_statyczne_proceduryContext pisz_statyczne_procedury() {
			return getRuleContext(Pisz_statyczne_proceduryContext.class,0);
		}
		public Pisz_symboleContext pisz_symbole() {
			return getRuleContext(Pisz_symboleContext.class,0);
		}
		public Pisz_symbolContext pisz_symbol() {
			return getRuleContext(Pisz_symbolContext.class,0);
		}
		public Pisz_sekcjeContext pisz_sekcje() {
			return getRuleContext(Pisz_sekcjeContext.class,0);
		}
		public Pisz_nazwy_typowContext pisz_nazwy_typow() {
			return getRuleContext(Pisz_nazwy_typowContext.class,0);
		}
		public Pisz_tokenyContext pisz_tokeny() {
			return getRuleContext(Pisz_tokenyContext.class,0);
		}
		public Pisz_drzewo_skladnioweContext pisz_drzewo_skladniowe() {
			return getRuleContext(Pisz_drzewo_skladnioweContext.class,0);
		}
		public Pisz_stan_maszyny_deklaracyjnejContext pisz_stan_maszyny_deklaracyjnej() {
			return getRuleContext(Pisz_stan_maszyny_deklaracyjnejContext.class,0);
		}
		public ListowanieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listowanie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterListowanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitListowanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitListowanie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListowanieContext listowanie() throws RecognitionException {
		ListowanieContext _localctx = new ListowanieContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listowanie);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(109);
				ogolne_listowanie();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(110);
				match(LS);
				setState(113);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PROC:
					{
					setState(111);
					listing_procedur();
					}
					break;
				case ZAKR:
					{
					setState(112);
					listing_zakresow();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LS) {
					{
					setState(115);
					match(LS);
					}
				}

				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ZAKR:
					{
					setState(118);
					pisz_zakres();
					}
					break;
				case PROC:
					{
					setState(119);
					pisz_procedure();
					}
					break;
				case RAMKA:
					{
					setState(120);
					pisz_ramke_procedury();
					}
					break;
				case STATYCZNE:
					{
					setState(121);
					pisz_statyczne_procedury();
					}
					break;
				case SYMBOLE:
					{
					setState(122);
					pisz_symbole();
					}
					break;
				case SYMBOL:
					{
					setState(123);
					pisz_symbol();
					}
					break;
				case SEKCJA:
					{
					setState(124);
					pisz_sekcje();
					}
					break;
				case TYPY:
					{
					setState(125);
					pisz_nazwy_typow();
					}
					break;
				case TOKENY:
					{
					setState(126);
					pisz_tokeny();
					}
					break;
				case DRZEWO:
					{
					setState(127);
					pisz_drzewo_skladniowe();
					}
					break;
				case STAN_MASZYNY_DEKLARACYJNEJ:
					{
					setState(128);
					pisz_stan_maszyny_deklaracyjnej();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class Ogolne_listowanieContext extends ParserRuleContext {
		public TerminalNode LS() { return getToken(parserDebugera.LS, 0); }
		public Ogolne_listowanieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ogolne_listowanie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterOgolne_listowanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitOgolne_listowanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitOgolne_listowanie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ogolne_listowanieContext ogolne_listowanie() throws RecognitionException {
		Ogolne_listowanieContext _localctx = new Ogolne_listowanieContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ogolne_listowanie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(LS);
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

	public static class Listing_procedurContext extends ParserRuleContext {
		public TerminalNode PROC() { return getToken(parserDebugera.PROC, 0); }
		public TerminalNode MINUS_L() { return getToken(parserDebugera.MINUS_L, 0); }
		public Listing_procedurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listing_procedur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterListing_procedur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitListing_procedur(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitListing_procedur(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Listing_procedurContext listing_procedur() throws RecognitionException {
		Listing_procedurContext _localctx = new Listing_procedurContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listing_procedur);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(PROC);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS_L) {
				{
				setState(136);
				match(MINUS_L);
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

	public static class Listing_zakresowContext extends ParserRuleContext {
		public TerminalNode ZAKR() { return getToken(parserDebugera.ZAKR, 0); }
		public TerminalNode MINUS_L() { return getToken(parserDebugera.MINUS_L, 0); }
		public Listing_zakresowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listing_zakresow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterListing_zakresow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitListing_zakresow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitListing_zakresow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Listing_zakresowContext listing_zakresow() throws RecognitionException {
		Listing_zakresowContext _localctx = new Listing_zakresowContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listing_zakresow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ZAKR);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS_L) {
				{
				setState(140);
				match(MINUS_L);
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

	public static class Pisz_zakresContext extends ParserRuleContext {
		public TerminalNode ZAKR() { return getToken(parserDebugera.ZAKR, 0); }
		public TerminalNode NUM() { return getToken(parserDebugera.NUM, 0); }
		public Pisz_zakresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pisz_zakres; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterPisz_zakres(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitPisz_zakres(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitPisz_zakres(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pisz_zakresContext pisz_zakres() throws RecognitionException {
		Pisz_zakresContext _localctx = new Pisz_zakresContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pisz_zakres);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(ZAKR);
			setState(144);
			match(NUM);
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

	public static class Pisz_procedureContext extends ParserRuleContext {
		public TerminalNode PROC() { return getToken(parserDebugera.PROC, 0); }
		public TerminalNode NUM() { return getToken(parserDebugera.NUM, 0); }
		public Pisz_procedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pisz_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterPisz_procedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitPisz_procedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitPisz_procedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pisz_procedureContext pisz_procedure() throws RecognitionException {
		Pisz_procedureContext _localctx = new Pisz_procedureContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pisz_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(PROC);
			setState(147);
			match(NUM);
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

	public static class Pisz_ramke_proceduryContext extends ParserRuleContext {
		public TerminalNode RAMKA() { return getToken(parserDebugera.RAMKA, 0); }
		public TerminalNode PROC() { return getToken(parserDebugera.PROC, 0); }
		public Pisz_ramke_proceduryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pisz_ramke_procedury; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterPisz_ramke_procedury(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitPisz_ramke_procedury(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitPisz_ramke_procedury(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pisz_ramke_proceduryContext pisz_ramke_procedury() throws RecognitionException {
		Pisz_ramke_proceduryContext _localctx = new Pisz_ramke_proceduryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pisz_ramke_procedury);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(RAMKA);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROC) {
				{
				setState(150);
				match(PROC);
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

	public static class Pisz_statyczne_proceduryContext extends ParserRuleContext {
		public TerminalNode STATYCZNE() { return getToken(parserDebugera.STATYCZNE, 0); }
		public TerminalNode PROC() { return getToken(parserDebugera.PROC, 0); }
		public Pisz_statyczne_proceduryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pisz_statyczne_procedury; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterPisz_statyczne_procedury(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitPisz_statyczne_procedury(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitPisz_statyczne_procedury(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pisz_statyczne_proceduryContext pisz_statyczne_procedury() throws RecognitionException {
		Pisz_statyczne_proceduryContext _localctx = new Pisz_statyczne_proceduryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pisz_statyczne_procedury);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(STATYCZNE);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROC) {
				{
				setState(154);
				match(PROC);
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

	public static class Pisz_sekcjeContext extends ParserRuleContext {
		public TerminalNode SEKCJA() { return getToken(parserDebugera.SEKCJA, 0); }
		public TerminalNode BSS() { return getToken(parserDebugera.BSS, 0); }
		public TerminalNode DATA() { return getToken(parserDebugera.DATA, 0); }
		public TerminalNode RODATA() { return getToken(parserDebugera.RODATA, 0); }
		public TerminalNode TEXT() { return getToken(parserDebugera.TEXT, 0); }
		public TerminalNode GWIAZDKA() { return getToken(parserDebugera.GWIAZDKA, 0); }
		public Pisz_sekcjeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pisz_sekcje; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterPisz_sekcje(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitPisz_sekcje(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitPisz_sekcje(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pisz_sekcjeContext pisz_sekcje() throws RecognitionException {
		Pisz_sekcjeContext _localctx = new Pisz_sekcjeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pisz_sekcje);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(SEKCJA);
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GWIAZDKA) | (1L << TEXT) | (1L << BSS) | (1L << DATA) | (1L << RODATA))) != 0)) ) {
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

	public static class Pisz_nazwy_typowContext extends ParserRuleContext {
		public TerminalNode TYPY() { return getToken(parserDebugera.TYPY, 0); }
		public Pisz_nazwy_typowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pisz_nazwy_typow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterPisz_nazwy_typow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitPisz_nazwy_typow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitPisz_nazwy_typow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pisz_nazwy_typowContext pisz_nazwy_typow() throws RecognitionException {
		Pisz_nazwy_typowContext _localctx = new Pisz_nazwy_typowContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pisz_nazwy_typow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(TYPY);
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

	public static class Pisz_tokenyContext extends ParserRuleContext {
		public TerminalNode TOKENY() { return getToken(parserDebugera.TOKENY, 0); }
		public Pisz_tokenyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pisz_tokeny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterPisz_tokeny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitPisz_tokeny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitPisz_tokeny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pisz_tokenyContext pisz_tokeny() throws RecognitionException {
		Pisz_tokenyContext _localctx = new Pisz_tokenyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pisz_tokeny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(TOKENY);
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

	public static class Pisz_drzewo_skladnioweContext extends ParserRuleContext {
		public TerminalNode DRZEWO() { return getToken(parserDebugera.DRZEWO, 0); }
		public Pisz_drzewo_skladnioweContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pisz_drzewo_skladniowe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterPisz_drzewo_skladniowe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitPisz_drzewo_skladniowe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitPisz_drzewo_skladniowe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pisz_drzewo_skladnioweContext pisz_drzewo_skladniowe() throws RecognitionException {
		Pisz_drzewo_skladnioweContext _localctx = new Pisz_drzewo_skladnioweContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pisz_drzewo_skladniowe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(DRZEWO);
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

	public static class Pisz_symboleContext extends ParserRuleContext {
		public TerminalNode SYMBOLE() { return getToken(parserDebugera.SYMBOLE, 0); }
		public TerminalNode TU() { return getToken(parserDebugera.TU, 0); }
		public TerminalNode TUIWYZEJ() { return getToken(parserDebugera.TUIWYZEJ, 0); }
		public Pisz_symboleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pisz_symbole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterPisz_symbole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitPisz_symbole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitPisz_symbole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pisz_symboleContext pisz_symbole() throws RecognitionException {
		Pisz_symboleContext _localctx = new Pisz_symboleContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pisz_symbole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(SYMBOLE);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TU || _la==TUIWYZEJ) {
				{
				setState(167);
				_la = _input.LA(1);
				if ( !(_la==TU || _la==TUIWYZEJ) ) {
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

	public static class Pisz_symbolContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(parserDebugera.SYMBOL, 0); }
		public TerminalNode ID() { return getToken(parserDebugera.ID, 0); }
		public TerminalNode MINUS_L() { return getToken(parserDebugera.MINUS_L, 0); }
		public Pisz_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pisz_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterPisz_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitPisz_symbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitPisz_symbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pisz_symbolContext pisz_symbol() throws RecognitionException {
		Pisz_symbolContext _localctx = new Pisz_symbolContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pisz_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(SYMBOL);
			setState(171);
			match(ID);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS_L) {
				{
				setState(172);
				match(MINUS_L);
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

	public static class Pisz_stan_maszyny_deklaracyjnejContext extends ParserRuleContext {
		public TerminalNode STAN_MASZYNY_DEKLARACYJNEJ() { return getToken(parserDebugera.STAN_MASZYNY_DEKLARACYJNEJ, 0); }
		public Pisz_stan_maszyny_deklaracyjnejContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pisz_stan_maszyny_deklaracyjnej; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterPisz_stan_maszyny_deklaracyjnej(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitPisz_stan_maszyny_deklaracyjnej(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitPisz_stan_maszyny_deklaracyjnej(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pisz_stan_maszyny_deklaracyjnejContext pisz_stan_maszyny_deklaracyjnej() throws RecognitionException {
		Pisz_stan_maszyny_deklaracyjnejContext _localctx = new Pisz_stan_maszyny_deklaracyjnejContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pisz_stan_maszyny_deklaracyjnej);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(STAN_MASZYNY_DEKLARACYJNEJ);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\5\2:\n\2\3\2\3\2\3\2\5\2?\n\2\3\2\5"+
		"\2B\n\2\3\3\7\3E\n\3\f\3\16\3H\13\3\3\4\3\4\3\4\5\4M\n\4\3\5\7\5P\n\5"+
		"\f\5\16\5S\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\5\13h\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\5\16t\n\16\3\16\5\16w\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u0084\n\16\5\16\u0086\n\16\3\17\3\17\3\20"+
		"\3\20\5\20\u008c\n\20\3\21\3\21\5\21\u0090\n\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\5\24\u009a\n\24\3\25\3\25\5\25\u009e\n\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\5\32\u00ab\n\32\3\33\3\33"+
		"\3\33\5\33\u00b0\n\33\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\66\2\7\4\2\4\4\n\n\3\2\5\7\3\2\4\4\4\2"+
		"\16\16 #\3\2\34\35\2\u00b8\29\3\2\2\2\4F\3\2\2\2\6I\3\2\2\2\bQ\3\2\2\2"+
		"\nZ\3\2\2\2\f\\\3\2\2\2\16^\3\2\2\2\20`\3\2\2\2\22b\3\2\2\2\24d\3\2\2"+
		"\2\26i\3\2\2\2\30l\3\2\2\2\32\u0085\3\2\2\2\34\u0087\3\2\2\2\36\u0089"+
		"\3\2\2\2 \u008d\3\2\2\2\"\u0091\3\2\2\2$\u0094\3\2\2\2&\u0097\3\2\2\2"+
		"(\u009b\3\2\2\2*\u009f\3\2\2\2,\u00a2\3\2\2\2.\u00a4\3\2\2\2\60\u00a6"+
		"\3\2\2\2\62\u00a8\3\2\2\2\64\u00ac\3\2\2\2\66\u00b1\3\2\2\28:\7\3\2\2"+
		"98\3\2\2\29:\3\2\2\2:;\3\2\2\2;>\5\4\3\2<=\7\b\2\2=?\5\6\4\2><\3\2\2\2"+
		">?\3\2\2\2?A\3\2\2\2@B\t\2\2\2A@\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CE\t\3\2"+
		"\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\5\3\2\2\2HF\3\2\2\2IL\5\n"+
		"\6\2JK\7\'\2\2KM\5\b\5\2LJ\3\2\2\2LM\3\2\2\2M\7\3\2\2\2NP\n\4\2\2ON\3"+
		"\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\t\3\2\2\2SQ\3\2\2\2T[\5\f\7\2U["+
		"\5\16\b\2V[\5\20\t\2W[\5\22\n\2X[\5\32\16\2Y[\5\24\13\2ZT\3\2\2\2ZU\3"+
		"\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\13\3\2\2\2\\]\7\17\2\2"+
		"]\r\3\2\2\2^_\7\20\2\2_\17\3\2\2\2`a\7\21\2\2a\21\3\2\2\2bc\7\22\2\2c"+
		"\23\3\2\2\2dg\7\36\2\2eh\5\26\f\2fh\5\30\r\2ge\3\2\2\2gf\3\2\2\2h\25\3"+
		"\2\2\2ij\7\13\2\2jk\7%\2\2k\27\3\2\2\2lm\7\f\2\2mn\7%\2\2n\31\3\2\2\2"+
		"o\u0086\5\34\17\2ps\7\37\2\2qt\5\36\20\2rt\5 \21\2sq\3\2\2\2sr\3\2\2\2"+
		"t\u0086\3\2\2\2uw\7\37\2\2vu\3\2\2\2vw\3\2\2\2w\u0083\3\2\2\2x\u0084\5"+
		"\"\22\2y\u0084\5$\23\2z\u0084\5&\24\2{\u0084\5(\25\2|\u0084\5\62\32\2"+
		"}\u0084\5\64\33\2~\u0084\5*\26\2\177\u0084\5,\27\2\u0080\u0084\5.\30\2"+
		"\u0081\u0084\5\60\31\2\u0082\u0084\5\66\34\2\u0083x\3\2\2\2\u0083y\3\2"+
		"\2\2\u0083z\3\2\2\2\u0083{\3\2\2\2\u0083|\3\2\2\2\u0083}\3\2\2\2\u0083"+
		"~\3\2\2\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0086\3\2\2\2\u0085o\3\2\2\2\u0085p\3\2\2\2\u0085"+
		"v\3\2\2\2\u0086\33\3\2\2\2\u0087\u0088\7\37\2\2\u0088\35\3\2\2\2\u0089"+
		"\u008b\7\13\2\2\u008a\u008c\7\r\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008c\37\3\2\2\2\u008d\u008f\7\f\2\2\u008e\u0090\7\r\2\2\u008f"+
		"\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090!\3\2\2\2\u0091\u0092\7\f\2\2"+
		"\u0092\u0093\7%\2\2\u0093#\3\2\2\2\u0094\u0095\7\13\2\2\u0095\u0096\7"+
		"%\2\2\u0096%\3\2\2\2\u0097\u0099\7\24\2\2\u0098\u009a\7\13\2\2\u0099\u0098"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\'\3\2\2\2\u009b\u009d\7\25\2\2\u009c"+
		"\u009e\7\13\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e)\3\2\2\2"+
		"\u009f\u00a0\7\26\2\2\u00a0\u00a1\t\5\2\2\u00a1+\3\2\2\2\u00a2\u00a3\7"+
		"\27\2\2\u00a3-\3\2\2\2\u00a4\u00a5\7\30\2\2\u00a5/\3\2\2\2\u00a6\u00a7"+
		"\7\31\2\2\u00a7\61\3\2\2\2\u00a8\u00aa\7\32\2\2\u00a9\u00ab\t\6\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\63\3\2\2\2\u00ac\u00ad\7\33\2"+
		"\2\u00ad\u00af\7$\2\2\u00ae\u00b0\7\r\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\65\3\2\2\2\u00b1\u00b2\7\23\2\2\u00b2\67\3\2\2\2\249>A"+
		"FLQZgsv\u0083\u0085\u008b\u008f\u0099\u009d\u00aa\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}