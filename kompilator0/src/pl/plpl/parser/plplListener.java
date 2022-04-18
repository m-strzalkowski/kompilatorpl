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
	 * Enter a parse tree produced by the {@code wyrazeniePrzypisanie}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniePrzypisanie(plplParser.WyrazeniePrzypisanieContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniePrzypisanie}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniePrzypisanie(plplParser.WyrazeniePrzypisanieContext ctx);
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
	 * Enter a parse tree produced by the {@code przypisanieZwykle}
	 * labeled alternative in {@link plplParser#przypisanie}.
	 * @param ctx the parse tree
	 */
	void enterPrzypisanieZwykle(plplParser.PrzypisanieZwykleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code przypisanieZwykle}
	 * labeled alternative in {@link plplParser#przypisanie}.
	 * @param ctx the parse tree
	 */
	void exitPrzypisanieZwykle(plplParser.PrzypisanieZwykleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code przypisaniePoteg}
	 * labeled alternative in {@link plplParser#przypisanie}.
	 * @param ctx the parse tree
	 */
	void enterPrzypisaniePoteg(plplParser.PrzypisaniePotegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code przypisaniePoteg}
	 * labeled alternative in {@link plplParser#przypisanie}.
	 * @param ctx the parse tree
	 */
	void exitPrzypisaniePoteg(plplParser.PrzypisaniePotegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code przypisanieMult}
	 * labeled alternative in {@link plplParser#przypisanie}.
	 * @param ctx the parse tree
	 */
	void enterPrzypisanieMult(plplParser.PrzypisanieMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code przypisanieMult}
	 * labeled alternative in {@link plplParser#przypisanie}.
	 * @param ctx the parse tree
	 */
	void exitPrzypisanieMult(plplParser.PrzypisanieMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code przypisanieAddyt}
	 * labeled alternative in {@link plplParser#przypisanie}.
	 * @param ctx the parse tree
	 */
	void enterPrzypisanieAddyt(plplParser.PrzypisanieAddytContext ctx);
	/**
	 * Exit a parse tree produced by the {@code przypisanieAddyt}
	 * labeled alternative in {@link plplParser#przypisanie}.
	 * @param ctx the parse tree
	 */
	void exitPrzypisanieAddyt(plplParser.PrzypisanieAddytContext ctx);
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
	 * Enter a parse tree produced by {@link plplParser#przydomek}.
	 * @param ctx the parse tree
	 */
	void enterPrzydomek(plplParser.PrzydomekContext ctx);
	/**
	 * Exit a parse tree produced by {@link plplParser#przydomek}.
	 * @param ctx the parse tree
	 */
	void exitPrzydomek(plplParser.PrzydomekContext ctx);
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
}