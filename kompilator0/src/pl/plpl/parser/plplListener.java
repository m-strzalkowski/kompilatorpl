// Generated from C:/Users/mastr/Documents/MS/STUDIA/kompilatory/kompilatorpl/kompilator0/src/pl/plpl\plpl.g4 by ANTLR 4.9.2
package pl.plpl.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link plplParser}.
 */
public interface plplListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link plplParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(plplParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(plplParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#byt_globalny}.
	 * @param ctx the parse tree
	 */
	void enterByt_globalny(plplParser.Byt_globalnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#byt_globalny}.
	 * @param ctx the parse tree
	 */
	void exitByt_globalny(plplParser.Byt_globalnyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#procedura}.
	 * @param ctx the parse tree
	 */
	void enterProcedura(plplParser.ProceduraContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#procedura}.
	 * @param ctx the parse tree
	 */
	void exitProcedura(plplParser.ProceduraContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#typ_zwracany}.
	 * @param ctx the parse tree
	 */
	void enterTyp_zwracany(plplParser.Typ_zwracanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#typ_zwracany}.
	 * @param ctx the parse tree
	 */
	void exitTyp_zwracany(plplParser.Typ_zwracanyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#deklaracja_typu}.
	 * @param ctx the parse tree
	 */
	void enterDeklaracja_typu(plplParser.Deklaracja_typuContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#deklaracja_typu}.
	 * @param ctx the parse tree
	 */
	void exitDeklaracja_typu(plplParser.Deklaracja_typuContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#deklaracja_prosta}.
	 * @param ctx the parse tree
	 */
	void enterDeklaracja_prosta(plplParser.Deklaracja_prostaContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#deklaracja_prosta}.
	 * @param ctx the parse tree
	 */
	void exitDeklaracja_prosta(plplParser.Deklaracja_prostaContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#deklaracja_atomiczna}.
	 * @param ctx the parse tree
	 */
	void enterDeklaracja_atomiczna(plplParser.Deklaracja_atomicznaContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#deklaracja_atomiczna}.
	 * @param ctx the parse tree
	 */
	void exitDeklaracja_atomiczna(plplParser.Deklaracja_atomicznaContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#deklarator_bez_przypisania}.
	 * @param ctx the parse tree
	 */
	void enterDeklarator_bez_przypisania(plplParser.Deklarator_bez_przypisaniaContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#deklarator_bez_przypisania}.
	 * @param ctx the parse tree
	 */
	void exitDeklarator_bez_przypisania(plplParser.Deklarator_bez_przypisaniaContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#deklarator_atomiczny_z_przypisaniem}.
	 * @param ctx the parse tree
	 */
	void enterDeklarator_atomiczny_z_przypisaniem(plplParser.Deklarator_atomiczny_z_przypisaniemContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#deklarator_atomiczny_z_przypisaniem}.
	 * @param ctx the parse tree
	 */
	void exitDeklarator_atomiczny_z_przypisaniem(plplParser.Deklarator_atomiczny_z_przypisaniemContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#deklaracja_referencji}.
	 * @param ctx the parse tree
	 */
	void enterDeklaracja_referencji(plplParser.Deklaracja_referencjiContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#deklaracja_referencji}.
	 * @param ctx the parse tree
	 */
	void exitDeklaracja_referencji(plplParser.Deklaracja_referencjiContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#deklarator_zlozony_z_przypisaniem}.
	 * @param ctx the parse tree
	 */
	void enterDeklarator_zlozony_z_przypisaniem(plplParser.Deklarator_zlozony_z_przypisaniemContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#deklarator_zlozony_z_przypisaniem}.
	 * @param ctx the parse tree
	 */
	void exitDeklarator_zlozony_z_przypisaniem(plplParser.Deklarator_zlozony_z_przypisaniemContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#lista_instrukcji}.
	 * @param ctx the parse tree
	 */
	void enterLista_instrukcji(plplParser.Lista_instrukcjiContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#lista_instrukcji}.
	 * @param ctx the parse tree
	 */
	void exitLista_instrukcji(plplParser.Lista_instrukcjiContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#instrukcja}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja(plplParser.InstrukcjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#instrukcja}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja(plplParser.InstrukcjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#instrukcja_zlozona}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja_zlozona(plplParser.Instrukcja_zlozonaContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#instrukcja_zlozona}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja_zlozona(plplParser.Instrukcja_zlozonaContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#instrukcja_wyboru}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja_wyboru(plplParser.Instrukcja_wyboruContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#instrukcja_wyboru}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja_wyboru(plplParser.Instrukcja_wyboruContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#instrukcja_petli}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja_petli(plplParser.Instrukcja_petliContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#instrukcja_petli}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja_petli(plplParser.Instrukcja_petliContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#instrukcja_powrotu}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja_powrotu(plplParser.Instrukcja_powrotuContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#instrukcja_powrotu}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja_powrotu(plplParser.Instrukcja_powrotuContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#instrukcja_wkroczenia}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja_wkroczenia(plplParser.Instrukcja_wkroczeniaContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#instrukcja_wkroczenia}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja_wkroczenia(plplParser.Instrukcja_wkroczeniaContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#instrukcja_zakonczenia}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja_zakonczenia(plplParser.Instrukcja_zakonczeniaContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#instrukcja_zakonczenia}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja_zakonczenia(plplParser.Instrukcja_zakonczeniaContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#instrukcja_przerwania_petli}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja_przerwania_petli(plplParser.Instrukcja_przerwania_petliContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#instrukcja_przerwania_petli}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja_przerwania_petli(plplParser.Instrukcja_przerwania_petliContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#instrukcja_kontynuacji_petli}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja_kontynuacji_petli(plplParser.Instrukcja_kontynuacji_petliContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#instrukcja_kontynuacji_petli}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja_kontynuacji_petli(plplParser.Instrukcja_kontynuacji_petliContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#wypisanie}.
	 * @param ctx the parse tree
	 */
	void enterWypisanie(plplParser.WypisanieContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#wypisanie}.
	 * @param ctx the parse tree
	 */
	void exitWypisanie(plplParser.WypisanieContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#instrukcja_prosta}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja_prosta(plplParser.Instrukcja_prostaContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#instrukcja_prosta}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja_prosta(plplParser.Instrukcja_prostaContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#wstawka_asemblerowa}.
	 * @param ctx the parse tree
	 */
	void enterWstawka_asemblerowa(plplParser.Wstawka_asemblerowaContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#wstawka_asemblerowa}.
	 * @param ctx the parse tree
	 */
	void exitWstawka_asemblerowa(plplParser.Wstawka_asemblerowaContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#lista_parametrow_formalnych}.
	 * @param ctx the parse tree
	 */
	void enterLista_parametrow_formalnych(plplParser.Lista_parametrow_formalnychContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#lista_parametrow_formalnych}.
	 * @param ctx the parse tree
	 */
	void exitLista_parametrow_formalnych(plplParser.Lista_parametrow_formalnychContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#deklaracja_parametru}.
	 * @param ctx the parse tree
	 */
	void enterDeklaracja_parametru(plplParser.Deklaracja_parametruContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#deklaracja_parametru}.
	 * @param ctx the parse tree
	 */
	void exitDeklaracja_parametru(plplParser.Deklaracja_parametruContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazeniePrzypisaniePoteg}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniePrzypisaniePoteg(plplParser.WyrazeniePrzypisaniePotegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniePrzypisaniePoteg}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniePrzypisaniePoteg(plplParser.WyrazeniePrzypisaniePotegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazeniePrzypisanieAddyt}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniePrzypisanieAddyt(plplParser.WyrazeniePrzypisanieAddytContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniePrzypisanieAddyt}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniePrzypisanieAddyt(plplParser.WyrazeniePrzypisanieAddytContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieNegacja}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieNegacja(plplParser.WyrazenieNegacjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieNegacja}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieNegacja(plplParser.WyrazenieNegacjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieNawiasy}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieNawiasy(plplParser.WyrazenieNawiasyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieNawiasy}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieNawiasy(plplParser.WyrazenieNawiasyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieLwartosc}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieLwartosc(plplParser.WyrazenieLwartoscContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieLwartosc}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieLwartosc(plplParser.WyrazenieLwartoscContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazeniePorownanie}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniePorownanie(plplParser.WyrazeniePorownanieContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniePorownanie}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniePorownanie(plplParser.WyrazeniePorownanieContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazeniePoteg}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniePoteg(plplParser.WyrazeniePotegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniePoteg}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniePoteg(plplParser.WyrazeniePotegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieLogicz}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieLogicz(plplParser.WyrazenieLogiczContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieLogicz}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieLogicz(plplParser.WyrazenieLogiczContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieWywolanieNaiwne}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieWywolanieNaiwne(plplParser.WyrazenieWywolanieNaiwneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieWywolanieNaiwne}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieWywolanieNaiwne(plplParser.WyrazenieWywolanieNaiwneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieMult}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieMult(plplParser.WyrazenieMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieMult}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieMult(plplParser.WyrazenieMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazeniePrzypisanieMult}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniePrzypisanieMult(plplParser.WyrazeniePrzypisanieMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniePrzypisanieMult}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniePrzypisanieMult(plplParser.WyrazeniePrzypisanieMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieAlokacja}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieAlokacja(plplParser.WyrazenieAlokacjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieAlokacja}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieAlokacja(plplParser.WyrazenieAlokacjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieDealokacja}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieDealokacja(plplParser.WyrazenieDealokacjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieDealokacja}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieDealokacja(plplParser.WyrazenieDealokacjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieAdres}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieAdres(plplParser.WyrazenieAdresContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieAdres}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieAdres(plplParser.WyrazenieAdresContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazeniePrzypisanieZwykle}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniePrzypisanieZwykle(plplParser.WyrazeniePrzypisanieZwykleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniePrzypisanieZwykle}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniePrzypisanieZwykle(plplParser.WyrazeniePrzypisanieZwykleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieAddyt}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieAddyt(plplParser.WyrazenieAddytContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieAddyt}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieAddyt(plplParser.WyrazenieAddytContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieSelekcjiSkladowej}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieSelekcjiSkladowej(plplParser.WyrazenieSelekcjiSkladowejContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieSelekcjiSkladowej}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieSelekcjiSkladowej(plplParser.WyrazenieSelekcjiSkladowejContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieWywolanie}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieWywolanie(plplParser.WyrazenieWywolanieContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieWywolanie}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieWywolanie(plplParser.WyrazenieWywolanieContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieStala}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieStala(plplParser.WyrazenieStalaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieStala}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieStala(plplParser.WyrazenieStalaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieSelekcjaTablicowa}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieSelekcjaTablicowa(plplParser.WyrazenieSelekcjaTablicowaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieSelekcjaTablicowa}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieSelekcjaTablicowa(plplParser.WyrazenieSelekcjaTablicowaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieZnak}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieZnak(plplParser.WyrazenieZnakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieZnak}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieZnak(plplParser.WyrazenieZnakContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#alokacja}.
	 * @param ctx the parse tree
	 */
	void enterAlokacja(plplParser.AlokacjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#alokacja}.
	 * @param ctx the parse tree
	 */
	void exitAlokacja(plplParser.AlokacjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#dealokacja}.
	 * @param ctx the parse tree
	 */
	void enterDealokacja(plplParser.DealokacjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#dealokacja}.
	 * @param ctx the parse tree
	 */
	void exitDealokacja(plplParser.DealokacjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#lwartosc}.
	 * @param ctx the parse tree
	 */
	void enterLwartosc(plplParser.LwartoscContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#lwartosc}.
	 * @param ctx the parse tree
	 */
	void exitLwartosc(plplParser.LwartoscContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#selektor_tablicowy}.
	 * @param ctx the parse tree
	 */
	void enterSelektor_tablicowy(plplParser.Selektor_tablicowyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#selektor_tablicowy}.
	 * @param ctx the parse tree
	 */
	void exitSelektor_tablicowy(plplParser.Selektor_tablicowyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#selektor_typu_zlozonego}.
	 * @param ctx the parse tree
	 */
	void enterSelektor_typu_zlozonego(plplParser.Selektor_typu_zlozonegoContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#selektor_typu_zlozonego}.
	 * @param ctx the parse tree
	 */
	void exitSelektor_typu_zlozonego(plplParser.Selektor_typu_zlozonegoContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#wywolanie_funkcji}.
	 * @param ctx the parse tree
	 */
	void enterWywolanie_funkcji(plplParser.Wywolanie_funkcjiContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#wywolanie_funkcji}.
	 * @param ctx the parse tree
	 */
	void exitWywolanie_funkcji(plplParser.Wywolanie_funkcjiContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#naiwne_wywolanie}.
	 * @param ctx the parse tree
	 */
	void enterNaiwne_wywolanie(plplParser.Naiwne_wywolanieContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#naiwne_wywolanie}.
	 * @param ctx the parse tree
	 */
	void exitNaiwne_wywolanie(plplParser.Naiwne_wywolanieContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#lista_parametrow_aktualnych}.
	 * @param ctx the parse tree
	 */
	void enterLista_parametrow_aktualnych(plplParser.Lista_parametrow_aktualnychContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#lista_parametrow_aktualnych}.
	 * @param ctx the parse tree
	 */
	void exitLista_parametrow_aktualnych(plplParser.Lista_parametrow_aktualnychContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#stala_atomiczna}.
	 * @param ctx the parse tree
	 */
	void enterStala_atomiczna(plplParser.Stala_atomicznaContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#stala_atomiczna}.
	 * @param ctx the parse tree
	 */
	void exitStala_atomiczna(plplParser.Stala_atomicznaContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#stala_tablicowa}.
	 * @param ctx the parse tree
	 */
	void enterStala_tablicowa(plplParser.Stala_tablicowaContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#stala_tablicowa}.
	 * @param ctx the parse tree
	 */
	void exitStala_tablicowa(plplParser.Stala_tablicowaContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#pelny_typ}.
	 * @param ctx the parse tree
	 */
	void enterPelny_typ(plplParser.Pelny_typContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#pelny_typ}.
	 * @param ctx the parse tree
	 */
	void exitPelny_typ(plplParser.Pelny_typContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#pelny_typ_dynamiczny}.
	 * @param ctx the parse tree
	 */
	void enterPelny_typ_dynamiczny(plplParser.Pelny_typ_dynamicznyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#pelny_typ_dynamiczny}.
	 * @param ctx the parse tree
	 */
	void exitPelny_typ_dynamiczny(plplParser.Pelny_typ_dynamicznyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#nieokreslony_deklarator_tablicowy}.
	 * @param ctx the parse tree
	 */
	void enterNieokreslony_deklarator_tablicowy(plplParser.Nieokreslony_deklarator_tablicowyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#nieokreslony_deklarator_tablicowy}.
	 * @param ctx the parse tree
	 */
	void exitNieokreslony_deklarator_tablicowy(plplParser.Nieokreslony_deklarator_tablicowyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#okreslony_deklarator_tablicowy}.
	 * @param ctx the parse tree
	 */
	void enterOkreslony_deklarator_tablicowy(plplParser.Okreslony_deklarator_tablicowyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#okreslony_deklarator_tablicowy}.
	 * @param ctx the parse tree
	 */
	void exitOkreslony_deklarator_tablicowy(plplParser.Okreslony_deklarator_tablicowyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#obliczany_deklarator_tablicowy}.
	 * @param ctx the parse tree
	 */
	void enterObliczany_deklarator_tablicowy(plplParser.Obliczany_deklarator_tablicowyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#obliczany_deklarator_tablicowy}.
	 * @param ctx the parse tree
	 */
	void exitObliczany_deklarator_tablicowy(plplParser.Obliczany_deklarator_tablicowyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#przydomki}.
	 * @param ctx the parse tree
	 */
	void enterPrzydomki(plplParser.PrzydomkiContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#przydomki}.
	 * @param ctx the parse tree
	 */
	void exitPrzydomki(plplParser.PrzydomkiContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#nazwa_typu_atom}.
	 * @param ctx the parse tree
	 */
	void enterNazwa_typu_atom(plplParser.Nazwa_typu_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#nazwa_typu_atom}.
	 * @param ctx the parse tree
	 */
	void exitNazwa_typu_atom(plplParser.Nazwa_typu_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link plplParser#nazwa_dynamicznie_alokowalnego_typu_atom}.
	 * @param ctx the parse tree
	 */
	void enterNazwa_dynamicznie_alokowalnego_typu_atom(plplParser.Nazwa_dynamicznie_alokowalnego_typu_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#nazwa_dynamicznie_alokowalnego_typu_atom}.
	 * @param ctx the parse tree
	 */
	void exitNazwa_dynamicznie_alokowalnego_typu_atom(plplParser.Nazwa_dynamicznie_alokowalnego_typu_atomContext ctx);
}