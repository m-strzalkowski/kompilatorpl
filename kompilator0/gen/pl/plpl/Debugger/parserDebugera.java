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
public class parserDebugera extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OTW=1, ZMK=2, KOMENDA=3, PRZEBIEG_TYPOWANIA=4, PRZEBIEG_ANALIZY_SEMANTYCZNEJ=5, 
		PRZEBIEG_GENERACYJNY=6, SEPARATOR_ZNACZNIKOWY=7, WSZ=8, PROC=9, ZAKR=10, 
		GWIAZDKA=11, SREDNIK=12, PRZECINEK=13, ZGIN=14, DOKONCZ=15, RAMKA=16, 
		STATYCZNE=17, SEKCJA=18, TYPY=19, TOKENY=20, DRZEWO=21, CD=22, LS=23, 
		TEXT=24, BSS=25, DATA=26, RODATA=27, ID=28, NUM=29, WS=30, NASTEPNA=31, 
		SL_COMMENT=32;
	public static final int
		RULE_znacznik = 0, RULE_oznaczenia_przebiegow = 1, RULE_zbior_komend = 2, 
		RULE_reszta = 3, RULE_komenda = 4, RULE_nastepny_krok = 5, RULE_nastepny_znacznik = 6, 
		RULE_komenda_ubicia_kompilatora = 7, RULE_komenda_ubicia_debugera = 8, 
		RULE_przechodzenie = 9, RULE_cd_do_proc = 10, RULE_cd_do_zakresu = 11, 
		RULE_listowanie = 12, RULE_listing_procedur = 13, RULE_listing_zakresow = 14, 
		RULE_pisz_zakres = 15, RULE_pisz_procedure = 16, RULE_pisz_ramke_procedury = 17, 
		RULE_pisz_statyczne_procedury = 18, RULE_pisz_sekcje = 19, RULE_pisz_nazwy_typow = 20, 
		RULE_pisz_tokeny = 21, RULE_pisz_drzewo_skladniowe = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"znacznik", "oznaczenia_przebiegow", "zbior_komend", "reszta", "komenda", 
			"nastepny_krok", "nastepny_znacznik", "komenda_ubicia_kompilatora", "komenda_ubicia_debugera", 
			"przechodzenie", "cd_do_proc", "cd_do_zakresu", "listowanie", "listing_procedur", 
			"listing_zakresow", "pisz_zakres", "pisz_procedure", "pisz_ramke_procedury", 
			"pisz_statyczne_procedury", "pisz_sekcje", "pisz_nazwy_typow", "pisz_tokeny", 
			"pisz_drzewo_skladniowe"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'komenda'", null, null, null, "':'", null, null, 
			null, "'*'", "';'", "','", "'zgi\u0144'", "'doko\u0144cz'", "'ramka'", 
			null, "'sekcja'", "'typy'", "'tokeny'", null, "'cd'", "'ls'", null, null, 
			null, null, null, null, null, "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OTW", "ZMK", "KOMENDA", "PRZEBIEG_TYPOWANIA", "PRZEBIEG_ANALIZY_SEMANTYCZNEJ", 
			"PRZEBIEG_GENERACYJNY", "SEPARATOR_ZNACZNIKOWY", "WSZ", "PROC", "ZAKR", 
			"GWIAZDKA", "SREDNIK", "PRZECINEK", "ZGIN", "DOKONCZ", "RAMKA", "STATYCZNE", 
			"SEKCJA", "TYPY", "TOKENY", "DRZEWO", "CD", "LS", "TEXT", "BSS", "DATA", 
			"RODATA", "ID", "NUM", "WS", "NASTEPNA", "SL_COMMENT"
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
		public TerminalNode OTW() { return getToken(parserDebugera.OTW, 0); }
		public Oznaczenia_przebiegowContext oznaczenia_przebiegow() {
			return getRuleContext(Oznaczenia_przebiegowContext.class,0);
		}
		public TerminalNode ZMK() { return getToken(parserDebugera.ZMK, 0); }
		public TerminalNode SEPARATOR_ZNACZNIKOWY() { return getToken(parserDebugera.SEPARATOR_ZNACZNIKOWY, 0); }
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
			setState(46);
			match(OTW);
			setState(47);
			oznaczenia_przebiegow();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR_ZNACZNIKOWY) {
				{
				setState(48);
				match(SEPARATOR_ZNACZNIKOWY);
				setState(49);
				zbior_komend();
				}
			}

			setState(52);
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
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
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
				setState(57); 
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
		public TerminalNode KOMENDA() { return getToken(parserDebugera.KOMENDA, 0); }
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
			setState(59);
			match(KOMENDA);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NASTEPNA) {
				{
				setState(60);
				match(NASTEPNA);
				setState(61);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OTW) | (1L << KOMENDA) | (1L << PRZEBIEG_TYPOWANIA) | (1L << PRZEBIEG_ANALIZY_SEMANTYCZNEJ) | (1L << PRZEBIEG_GENERACYJNY) | (1L << SEPARATOR_ZNACZNIKOWY) | (1L << WSZ) | (1L << PROC) | (1L << ZAKR) | (1L << GWIAZDKA) | (1L << SREDNIK) | (1L << PRZECINEK) | (1L << ZGIN) | (1L << DOKONCZ) | (1L << RAMKA) | (1L << STATYCZNE) | (1L << SEKCJA) | (1L << TYPY) | (1L << TOKENY) | (1L << DRZEWO) | (1L << CD) | (1L << LS) | (1L << TEXT) | (1L << BSS) | (1L << DATA) | (1L << RODATA) | (1L << ID) | (1L << NUM) | (1L << WS) | (1L << NASTEPNA) | (1L << SL_COMMENT))) != 0)) {
				{
				{
				setState(64);
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
				setState(69);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SREDNIK:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				nastepny_krok();
				}
				break;
			case PRZECINEK:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				nastepny_znacznik();
				}
				break;
			case ZGIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				komenda_ubicia_kompilatora();
				}
				break;
			case DOKONCZ:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				komenda_ubicia_debugera();
				}
				break;
			case PROC:
			case ZAKR:
			case RAMKA:
			case STATYCZNE:
			case SEKCJA:
			case TYPY:
			case TOKENY:
			case DRZEWO:
			case LS:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				listowanie();
				}
				break;
			case CD:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
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
			setState(78);
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
			setState(80);
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
			setState(82);
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
			setState(84);
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
			setState(86);
			match(CD);
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROC:
				{
				setState(87);
				cd_do_proc();
				}
				break;
			case ZAKR:
				{
				setState(88);
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
			setState(91);
			match(PROC);
			setState(92);
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
			setState(94);
			match(ZAKR);
			setState(95);
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
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(97);
				match(LS);
				setState(100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PROC:
					{
					setState(98);
					listing_procedur();
					}
					break;
				case ZAKR:
					{
					setState(99);
					listing_zakresow();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LS) {
					{
					setState(102);
					match(LS);
					}
				}

				setState(113);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ZAKR:
					{
					setState(105);
					pisz_zakres();
					}
					break;
				case PROC:
					{
					setState(106);
					pisz_procedure();
					}
					break;
				case RAMKA:
					{
					setState(107);
					pisz_ramke_procedury();
					}
					break;
				case STATYCZNE:
					{
					setState(108);
					pisz_statyczne_procedury();
					}
					break;
				case SEKCJA:
					{
					setState(109);
					pisz_sekcje();
					}
					break;
				case TYPY:
					{
					setState(110);
					pisz_nazwy_typow();
					}
					break;
				case TOKENY:
					{
					setState(111);
					pisz_tokeny();
					}
					break;
				case DRZEWO:
					{
					setState(112);
					pisz_drzewo_skladniowe();
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

	public static class Listing_procedurContext extends ParserRuleContext {
		public TerminalNode PROC() { return getToken(parserDebugera.PROC, 0); }
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
		enterRule(_localctx, 26, RULE_listing_procedur);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(PROC);
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
		enterRule(_localctx, 28, RULE_listing_zakresow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ZAKR);
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
		enterRule(_localctx, 30, RULE_pisz_zakres);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ZAKR);
			setState(122);
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
		enterRule(_localctx, 32, RULE_pisz_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(PROC);
			setState(125);
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
		enterRule(_localctx, 34, RULE_pisz_ramke_procedury);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(RAMKA);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROC) {
				{
				setState(128);
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
		enterRule(_localctx, 36, RULE_pisz_statyczne_procedury);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(STATYCZNE);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROC) {
				{
				setState(132);
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
		enterRule(_localctx, 38, RULE_pisz_sekcje);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(SEKCJA);
			setState(136);
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
		enterRule(_localctx, 40, RULE_pisz_nazwy_typow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		enterRule(_localctx, 42, RULE_pisz_tokeny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
		enterRule(_localctx, 44, RULE_pisz_drzewo_skladniowe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u0093\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\5\2\65\n\2\3\2\3\2\3\3\6\3:\n\3\r\3\16\3;\3\4\3\4\3\4\5\4A\n\4"+
		"\3\5\7\5D\n\5\f\5\16\5G\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13\\\n\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\5\16g\n\16\3\16\5\16j\n\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16t\n\16\5\16v\n\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\5\23\u0084\n\23\3\24\3\24\5\24\u0088\n"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\2\2\31\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\5\3\2\6\b\3\2\4\4\4\2\r\r\32"+
		"\35\2\u0091\2\60\3\2\2\2\49\3\2\2\2\6=\3\2\2\2\bE\3\2\2\2\nN\3\2\2\2\f"+
		"P\3\2\2\2\16R\3\2\2\2\20T\3\2\2\2\22V\3\2\2\2\24X\3\2\2\2\26]\3\2\2\2"+
		"\30`\3\2\2\2\32u\3\2\2\2\34w\3\2\2\2\36y\3\2\2\2 {\3\2\2\2\"~\3\2\2\2"+
		"$\u0081\3\2\2\2&\u0085\3\2\2\2(\u0089\3\2\2\2*\u008c\3\2\2\2,\u008e\3"+
		"\2\2\2.\u0090\3\2\2\2\60\61\7\3\2\2\61\64\5\4\3\2\62\63\7\t\2\2\63\65"+
		"\5\6\4\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\4\2\2\67\3"+
		"\3\2\2\28:\t\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\5\3\2\2\2"+
		"=@\7\5\2\2>?\7!\2\2?A\5\b\5\2@>\3\2\2\2@A\3\2\2\2A\7\3\2\2\2BD\n\3\2\2"+
		"CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\t\3\2\2\2GE\3\2\2\2HO\5\f\7"+
		"\2IO\5\16\b\2JO\5\20\t\2KO\5\22\n\2LO\5\32\16\2MO\5\24\13\2NH\3\2\2\2"+
		"NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\13\3\2\2\2PQ\7\16"+
		"\2\2Q\r\3\2\2\2RS\7\17\2\2S\17\3\2\2\2TU\7\20\2\2U\21\3\2\2\2VW\7\21\2"+
		"\2W\23\3\2\2\2X[\7\30\2\2Y\\\5\26\f\2Z\\\5\30\r\2[Y\3\2\2\2[Z\3\2\2\2"+
		"\\\25\3\2\2\2]^\7\13\2\2^_\7\37\2\2_\27\3\2\2\2`a\7\f\2\2ab\7\37\2\2b"+
		"\31\3\2\2\2cf\7\31\2\2dg\5\34\17\2eg\5\36\20\2fd\3\2\2\2fe\3\2\2\2gv\3"+
		"\2\2\2hj\7\31\2\2ih\3\2\2\2ij\3\2\2\2js\3\2\2\2kt\5 \21\2lt\5\"\22\2m"+
		"t\5$\23\2nt\5&\24\2ot\5(\25\2pt\5*\26\2qt\5,\27\2rt\5.\30\2sk\3\2\2\2"+
		"sl\3\2\2\2sm\3\2\2\2sn\3\2\2\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2"+
		"tv\3\2\2\2uc\3\2\2\2ui\3\2\2\2v\33\3\2\2\2wx\7\13\2\2x\35\3\2\2\2yz\7"+
		"\f\2\2z\37\3\2\2\2{|\7\f\2\2|}\7\37\2\2}!\3\2\2\2~\177\7\13\2\2\177\u0080"+
		"\7\37\2\2\u0080#\3\2\2\2\u0081\u0083\7\22\2\2\u0082\u0084\7\13\2\2\u0083"+
		"\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084%\3\2\2\2\u0085\u0087\7\23\2\2"+
		"\u0086\u0088\7\13\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\'"+
		"\3\2\2\2\u0089\u008a\7\24\2\2\u008a\u008b\t\4\2\2\u008b)\3\2\2\2\u008c"+
		"\u008d\7\25\2\2\u008d+\3\2\2\2\u008e\u008f\7\26\2\2\u008f-\3\2\2\2\u0090"+
		"\u0091\7\27\2\2\u0091/\3\2\2\2\16\64;@EN[fisu\u0083\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}