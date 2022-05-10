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
		SEPARATOR_ZNACZNIKOWY=6, WSZ=7, ZMKK=8, PROC=9, ZAKR=10, PUNKT=11, MINUS_L=12, 
		GWIAZDKA=13, SREDNIK=14, PRZECINEK=15, ZGIN=16, DOKONCZ=17, STAN_MASZYNY_DEKLARACYJNEJ=18, 
		RAMKA=19, STATYCZNE=20, SEKCJA=21, TYPY=22, TOKENY=23, DRZEWO=24, SYMBOLE=25, 
		SYMBOL=26, TU=27, TUIWYZEJ=28, CD=29, LS=30, TEXT=31, BSS=32, DATA=33, 
		RODATA=34, ID=35, NUM=36, WS=37, NASTEPNA=38, SL_COMMENT=39;
	public static final int
		RULE_znacznik = 0, RULE_oznaczenia_przebiegow = 1, RULE_zbior_komend = 2, 
		RULE_reszta = 3, RULE_komenda = 4, RULE_nastepny_krok = 5, RULE_nastepny_znacznik = 6, 
		RULE_komenda_ubicia_kompilatora = 7, RULE_komenda_ubicia_debugera = 8, 
		RULE_przechodzenie = 9, RULE_cd_do_proc = 10, RULE_cd_do_zakresu = 11, 
		RULE_listowanie = 12, RULE_ogolne_listowanie = 13, RULE_listing_procedur = 14, 
		RULE_listing_zakresow = 15, RULE_pisz_zakres = 16, RULE_pisz_procedure = 17, 
		RULE_pisz_ramke_procedury = 18, RULE_pisz_statyczne_procedury = 19, RULE_pisz_sekcje = 20, 
		RULE_pisz_nazwy_typow = 21, RULE_pisz_tokeny = 22, RULE_pisz_drzewo_skladniowe = 23, 
		RULE_pisz_symbole = 24, RULE_pisz_symbol = 25, RULE_pisz_punkt_we = 26, 
		RULE_pisz_stan_maszyny_deklaracyjnej = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"znacznik", "oznaczenia_przebiegow", "zbior_komend", "reszta", "komenda", 
			"nastepny_krok", "nastepny_znacznik", "komenda_ubicia_kompilatora", "komenda_ubicia_debugera", 
			"przechodzenie", "cd_do_proc", "cd_do_zakresu", "listowanie", "ogolne_listowanie", 
			"listing_procedur", "listing_zakresow", "pisz_zakres", "pisz_procedure", 
			"pisz_ramke_procedury", "pisz_statyczne_procedury", "pisz_sekcje", "pisz_nazwy_typow", 
			"pisz_tokeny", "pisz_drzewo_skladniowe", "pisz_symbole", "pisz_symbol", 
			"pisz_punkt_we", "pisz_stan_maszyny_deklaracyjnej"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<<'", null, null, null, null, "':'", null, null, null, null, 
			null, "'-l'", "'*'", "';'", "','", null, null, null, "'ramka'", null, 
			"'sekcja'", "'typy'", "'tokeny'", null, null, null, "'tu'", "'tuiwy\u017Cej'", 
			"'cd'", "'ls'", null, null, null, null, null, null, null, "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OTW", "ZMK", "PRZEBIEG_TYPOWANIA", "PRZEBIEG_ANALIZY_SEMANTYCZNEJ", 
			"PRZEBIEG_GENERACYJNY", "SEPARATOR_ZNACZNIKOWY", "WSZ", "ZMKK", "PROC", 
			"ZAKR", "PUNKT", "MINUS_L", "GWIAZDKA", "SREDNIK", "PRZECINEK", "ZGIN", 
			"DOKONCZ", "STAN_MASZYNY_DEKLARACYJNEJ", "RAMKA", "STATYCZNE", "SEKCJA", 
			"TYPY", "TOKENY", "DRZEWO", "SYMBOLE", "SYMBOL", "TU", "TUIWYZEJ", "CD", 
			"LS", "TEXT", "BSS", "DATA", "RODATA", "ID", "NUM", "WS", "NASTEPNA", 
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
		public TerminalNode EOF() { return getToken(parserDebugera.EOF, 0); }
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTW) {
				{
				setState(56);
				match(OTW);
				}
			}

			setState(59);
			oznaczenia_przebiegow();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR_ZNACZNIKOWY) {
				{
				setState(60);
				match(SEPARATOR_ZNACZNIKOWY);
				setState(61);
				zbior_komend();
				}
			}

			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ZMK || _la==ZMKK) {
				{
				setState(64);
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

			setState(67);
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
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRZEBIEG_TYPOWANIA) | (1L << PRZEBIEG_ANALIZY_SEMANTYCZNEJ) | (1L << PRZEBIEG_GENERACYJNY))) != 0)) {
				{
				{
				setState(69);
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
				setState(74);
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
			setState(75);
			komenda();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NASTEPNA) {
				{
				setState(76);
				match(NASTEPNA);
				setState(77);
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
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
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
				setState(85);
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SREDNIK:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				nastepny_krok();
				}
				break;
			case PRZECINEK:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				nastepny_znacznik();
				}
				break;
			case ZGIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				komenda_ubicia_kompilatora();
				}
				break;
			case DOKONCZ:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				komenda_ubicia_debugera();
				}
				break;
			case PROC:
			case ZAKR:
			case PUNKT:
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
				setState(90);
				listowanie();
				}
				break;
			case CD:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
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
			setState(94);
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
			setState(96);
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
			setState(98);
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
			setState(100);
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
			setState(102);
			match(CD);
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROC:
				{
				setState(103);
				cd_do_proc();
				}
				break;
			case ZAKR:
				{
				setState(104);
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
			setState(107);
			match(PROC);
			setState(108);
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
			setState(110);
			match(ZAKR);
			setState(111);
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
		public Pisz_punkt_weContext pisz_punkt_we() {
			return getRuleContext(Pisz_punkt_weContext.class,0);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(113);
				ogolne_listowanie();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(114);
				match(LS);
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PROC:
					{
					setState(115);
					listing_procedur();
					}
					break;
				case ZAKR:
					{
					setState(116);
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
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LS) {
					{
					setState(119);
					match(LS);
					}
				}

				setState(134);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ZAKR:
					{
					setState(122);
					pisz_zakres();
					}
					break;
				case PROC:
					{
					setState(123);
					pisz_procedure();
					}
					break;
				case RAMKA:
					{
					setState(124);
					pisz_ramke_procedury();
					}
					break;
				case STATYCZNE:
					{
					setState(125);
					pisz_statyczne_procedury();
					}
					break;
				case SYMBOLE:
					{
					setState(126);
					pisz_symbole();
					}
					break;
				case SYMBOL:
					{
					setState(127);
					pisz_symbol();
					}
					break;
				case SEKCJA:
					{
					setState(128);
					pisz_sekcje();
					}
					break;
				case TYPY:
					{
					setState(129);
					pisz_nazwy_typow();
					}
					break;
				case TOKENY:
					{
					setState(130);
					pisz_tokeny();
					}
					break;
				case DRZEWO:
					{
					setState(131);
					pisz_drzewo_skladniowe();
					}
					break;
				case STAN_MASZYNY_DEKLARACYJNEJ:
					{
					setState(132);
					pisz_stan_maszyny_deklaracyjnej();
					}
					break;
				case PUNKT:
					{
					setState(133);
					pisz_punkt_we();
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
			setState(138);
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
			setState(140);
			match(PROC);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS_L) {
				{
				setState(141);
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
			setState(144);
			match(ZAKR);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS_L) {
				{
				setState(145);
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
			setState(148);
			match(ZAKR);
			setState(149);
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
		public TerminalNode ID() { return getToken(parserDebugera.ID, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(PROC);
			setState(152);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
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
			setState(154);
			match(RAMKA);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROC) {
				{
				setState(155);
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
			setState(158);
			match(STATYCZNE);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROC) {
				{
				setState(159);
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
			setState(162);
			match(SEKCJA);
			setState(163);
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
			setState(165);
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
			setState(167);
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
			setState(169);
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
			setState(171);
			match(SYMBOLE);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TU || _la==TUIWYZEJ) {
				{
				setState(172);
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
			setState(175);
			match(SYMBOL);
			setState(176);
			match(ID);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS_L) {
				{
				setState(177);
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

	public static class Pisz_punkt_weContext extends ParserRuleContext {
		public TerminalNode PUNKT() { return getToken(parserDebugera.PUNKT, 0); }
		public TerminalNode ID() { return getToken(parserDebugera.ID, 0); }
		public TerminalNode MINUS_L() { return getToken(parserDebugera.MINUS_L, 0); }
		public Pisz_punkt_weContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pisz_punkt_we; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).enterPisz_punkt_we(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDebugeraListener ) ((parserDebugeraListener)listener).exitPisz_punkt_we(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDebugeraVisitor ) return ((parserDebugeraVisitor<? extends T>)visitor).visitPisz_punkt_we(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pisz_punkt_weContext pisz_punkt_we() throws RecognitionException {
		Pisz_punkt_weContext _localctx = new Pisz_punkt_weContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pisz_punkt_we);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(PUNKT);
			setState(181);
			match(ID);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS_L) {
				{
				setState(182);
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
		enterRule(_localctx, 54, RULE_pisz_stan_maszyny_deklaracyjnej);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\5\2<\n\2\3\2\3\2\3\2\5\2"+
		"A\n\2\3\2\5\2D\n\2\3\2\3\2\3\3\7\3I\n\3\f\3\16\3L\13\3\3\4\3\4\3\4\5\4"+
		"Q\n\4\3\5\7\5T\n\5\f\5\16\5W\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13l\n\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\5\16x\n\16\3\16\5\16{\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0089\n\16\5\16\u008b"+
		"\n\16\3\17\3\17\3\20\3\20\5\20\u0091\n\20\3\21\3\21\5\21\u0095\n\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\5\24\u009f\n\24\3\25\3\25\5\25"+
		"\u00a3\n\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\5\32"+
		"\u00b0\n\32\3\33\3\33\3\33\5\33\u00b5\n\33\3\34\3\34\3\34\5\34\u00ba\n"+
		"\34\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668\2\b\4\2\4\4\n\n\3\2\5\7\3\2\4\4\3\2%&\4\2\17\17!$\3"+
		"\2\35\36\2\u00c3\2;\3\2\2\2\4J\3\2\2\2\6M\3\2\2\2\bU\3\2\2\2\n^\3\2\2"+
		"\2\f`\3\2\2\2\16b\3\2\2\2\20d\3\2\2\2\22f\3\2\2\2\24h\3\2\2\2\26m\3\2"+
		"\2\2\30p\3\2\2\2\32\u008a\3\2\2\2\34\u008c\3\2\2\2\36\u008e\3\2\2\2 \u0092"+
		"\3\2\2\2\"\u0096\3\2\2\2$\u0099\3\2\2\2&\u009c\3\2\2\2(\u00a0\3\2\2\2"+
		"*\u00a4\3\2\2\2,\u00a7\3\2\2\2.\u00a9\3\2\2\2\60\u00ab\3\2\2\2\62\u00ad"+
		"\3\2\2\2\64\u00b1\3\2\2\2\66\u00b6\3\2\2\28\u00bb\3\2\2\2:<\7\3\2\2;:"+
		"\3\2\2\2;<\3\2\2\2<=\3\2\2\2=@\5\4\3\2>?\7\b\2\2?A\5\6\4\2@>\3\2\2\2@"+
		"A\3\2\2\2AC\3\2\2\2BD\t\2\2\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\2\2\3"+
		"F\3\3\2\2\2GI\t\3\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\5\3\2\2"+
		"\2LJ\3\2\2\2MP\5\n\6\2NO\7(\2\2OQ\5\b\5\2PN\3\2\2\2PQ\3\2\2\2Q\7\3\2\2"+
		"\2RT\n\4\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\t\3\2\2\2WU\3\2"+
		"\2\2X_\5\f\7\2Y_\5\16\b\2Z_\5\20\t\2[_\5\22\n\2\\_\5\32\16\2]_\5\24\13"+
		"\2^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\13\3"+
		"\2\2\2`a\7\20\2\2a\r\3\2\2\2bc\7\21\2\2c\17\3\2\2\2de\7\22\2\2e\21\3\2"+
		"\2\2fg\7\23\2\2g\23\3\2\2\2hk\7\37\2\2il\5\26\f\2jl\5\30\r\2ki\3\2\2\2"+
		"kj\3\2\2\2l\25\3\2\2\2mn\7\13\2\2no\7&\2\2o\27\3\2\2\2pq\7\f\2\2qr\7&"+
		"\2\2r\31\3\2\2\2s\u008b\5\34\17\2tw\7 \2\2ux\5\36\20\2vx\5 \21\2wu\3\2"+
		"\2\2wv\3\2\2\2x\u008b\3\2\2\2y{\7 \2\2zy\3\2\2\2z{\3\2\2\2{\u0088\3\2"+
		"\2\2|\u0089\5\"\22\2}\u0089\5$\23\2~\u0089\5&\24\2\177\u0089\5(\25\2\u0080"+
		"\u0089\5\62\32\2\u0081\u0089\5\64\33\2\u0082\u0089\5*\26\2\u0083\u0089"+
		"\5,\27\2\u0084\u0089\5.\30\2\u0085\u0089\5\60\31\2\u0086\u0089\58\35\2"+
		"\u0087\u0089\5\66\34\2\u0088|\3\2\2\2\u0088}\3\2\2\2\u0088~\3\2\2\2\u0088"+
		"\177\3\2\2\2\u0088\u0080\3\2\2\2\u0088\u0081\3\2\2\2\u0088\u0082\3\2\2"+
		"\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008b\3\2\2\2\u008as\3\2\2\2\u008a"+
		"t\3\2\2\2\u008az\3\2\2\2\u008b\33\3\2\2\2\u008c\u008d\7 \2\2\u008d\35"+
		"\3\2\2\2\u008e\u0090\7\13\2\2\u008f\u0091\7\16\2\2\u0090\u008f\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\37\3\2\2\2\u0092\u0094\7\f\2\2\u0093\u0095"+
		"\7\16\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095!\3\2\2\2\u0096"+
		"\u0097\7\f\2\2\u0097\u0098\7&\2\2\u0098#\3\2\2\2\u0099\u009a\7\13\2\2"+
		"\u009a\u009b\t\5\2\2\u009b%\3\2\2\2\u009c\u009e\7\25\2\2\u009d\u009f\7"+
		"\13\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\'\3\2\2\2\u00a0"+
		"\u00a2\7\26\2\2\u00a1\u00a3\7\13\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3"+
		"\2\2\2\u00a3)\3\2\2\2\u00a4\u00a5\7\27\2\2\u00a5\u00a6\t\6\2\2\u00a6+"+
		"\3\2\2\2\u00a7\u00a8\7\30\2\2\u00a8-\3\2\2\2\u00a9\u00aa\7\31\2\2\u00aa"+
		"/\3\2\2\2\u00ab\u00ac\7\32\2\2\u00ac\61\3\2\2\2\u00ad\u00af\7\33\2\2\u00ae"+
		"\u00b0\t\7\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\63\3\2\2"+
		"\2\u00b1\u00b2\7\34\2\2\u00b2\u00b4\7%\2\2\u00b3\u00b5\7\16\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\65\3\2\2\2\u00b6\u00b7\7\r\2"+
		"\2\u00b7\u00b9\7%\2\2\u00b8\u00ba\7\16\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\67\3\2\2\2\u00bb\u00bc\7\24\2\2\u00bc9\3\2\2\2\25;@CJP"+
		"U^kwz\u0088\u008a\u0090\u0094\u009e\u00a2\u00af\u00b4\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}