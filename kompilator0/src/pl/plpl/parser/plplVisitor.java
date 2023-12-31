// Generated from C:/Users/mastr/Documents/MS/STUDIA/kompilatory/kompilatorpl/kompilator0/src/pl/plpl\plpl.g4 by ANTLR 4.9.2
package pl.plpl.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link plplParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface plplVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link plplParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(plplParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#byt_globalny}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByt_globalny(plplParser.Byt_globalnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#procedura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedura(plplParser.ProceduraContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#typ_zwracany}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyp_zwracany(plplParser.Typ_zwracanyContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#deklaracja_typu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklaracja_typu(plplParser.Deklaracja_typuContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#deklaracja_prosta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklaracja_prosta(plplParser.Deklaracja_prostaContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#deklaracja_atomiczna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklaracja_atomiczna(plplParser.Deklaracja_atomicznaContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#deklarator_bez_przypisania}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklarator_bez_przypisania(plplParser.Deklarator_bez_przypisaniaContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#deklarator_atomiczny_z_przypisaniem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklarator_atomiczny_z_przypisaniem(plplParser.Deklarator_atomiczny_z_przypisaniemContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#deklaracja_referencji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklaracja_referencji(plplParser.Deklaracja_referencjiContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#deklarator_zlozony_z_przypisaniem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklarator_zlozony_z_przypisaniem(plplParser.Deklarator_zlozony_z_przypisaniemContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#lista_instrukcji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_instrukcji(plplParser.Lista_instrukcjiContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#instrukcja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja(plplParser.InstrukcjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#instrukcja_zlozona}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja_zlozona(plplParser.Instrukcja_zlozonaContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#instrukcja_wyboru}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja_wyboru(plplParser.Instrukcja_wyboruContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#instrukcja_petli}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja_petli(plplParser.Instrukcja_petliContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#instrukcja_powrotu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja_powrotu(plplParser.Instrukcja_powrotuContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#instrukcja_wkroczenia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja_wkroczenia(plplParser.Instrukcja_wkroczeniaContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#instrukcja_zakonczenia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja_zakonczenia(plplParser.Instrukcja_zakonczeniaContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#instrukcja_przerwania_petli}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja_przerwania_petli(plplParser.Instrukcja_przerwania_petliContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#instrukcja_kontynuacji_petli}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja_kontynuacji_petli(plplParser.Instrukcja_kontynuacji_petliContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#wypisanie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWypisanie(plplParser.WypisanieContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#instrukcja_prosta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja_prosta(plplParser.Instrukcja_prostaContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#wstawka_asemblerowa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWstawka_asemblerowa(plplParser.Wstawka_asemblerowaContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#lista_parametrow_formalnych}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parametrow_formalnych(plplParser.Lista_parametrow_formalnychContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#deklaracja_parametru}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklaracja_parametru(plplParser.Deklaracja_parametruContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniePrzypisaniePoteg}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniePrzypisaniePoteg(plplParser.WyrazeniePrzypisaniePotegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniePrzypisanieAddyt}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniePrzypisanieAddyt(plplParser.WyrazeniePrzypisanieAddytContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieNegacja}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieNegacja(plplParser.WyrazenieNegacjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieNawiasy}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieNawiasy(plplParser.WyrazenieNawiasyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieLwartosc}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieLwartosc(plplParser.WyrazenieLwartoscContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniePorownanie}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniePorownanie(plplParser.WyrazeniePorownanieContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniePoteg}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniePoteg(plplParser.WyrazeniePotegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieLogicz}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieLogicz(plplParser.WyrazenieLogiczContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieWywolanieNaiwne}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieWywolanieNaiwne(plplParser.WyrazenieWywolanieNaiwneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieMult}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieMult(plplParser.WyrazenieMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniePrzypisanieMult}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniePrzypisanieMult(plplParser.WyrazeniePrzypisanieMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieAlokacja}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieAlokacja(plplParser.WyrazenieAlokacjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieDealokacja}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieDealokacja(plplParser.WyrazenieDealokacjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieAdres}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieAdres(plplParser.WyrazenieAdresContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniePrzypisanieZwykle}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniePrzypisanieZwykle(plplParser.WyrazeniePrzypisanieZwykleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieAddyt}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieAddyt(plplParser.WyrazenieAddytContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieSelekcjiSkladowej}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieSelekcjiSkladowej(plplParser.WyrazenieSelekcjiSkladowejContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieWywolanie}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieWywolanie(plplParser.WyrazenieWywolanieContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieStala}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieStala(plplParser.WyrazenieStalaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieSelekcjaTablicowa}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieSelekcjaTablicowa(plplParser.WyrazenieSelekcjaTablicowaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieZnak}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieZnak(plplParser.WyrazenieZnakContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#alokacja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlokacja(plplParser.AlokacjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#dealokacja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDealokacja(plplParser.DealokacjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#lwartosc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLwartosc(plplParser.LwartoscContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#selektor_tablicowy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelektor_tablicowy(plplParser.Selektor_tablicowyContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#selektor_typu_zlozonego}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelektor_typu_zlozonego(plplParser.Selektor_typu_zlozonegoContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#wywolanie_funkcji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWywolanie_funkcji(plplParser.Wywolanie_funkcjiContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#naiwne_wywolanie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaiwne_wywolanie(plplParser.Naiwne_wywolanieContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#lista_parametrow_aktualnych}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parametrow_aktualnych(plplParser.Lista_parametrow_aktualnychContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#stala_atomiczna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStala_atomiczna(plplParser.Stala_atomicznaContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#stala_tablicowa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStala_tablicowa(plplParser.Stala_tablicowaContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#pelny_typ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPelny_typ(plplParser.Pelny_typContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#pelny_typ_dynamiczny}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPelny_typ_dynamiczny(plplParser.Pelny_typ_dynamicznyContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#nieokreslony_deklarator_tablicowy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNieokreslony_deklarator_tablicowy(plplParser.Nieokreslony_deklarator_tablicowyContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#okreslony_deklarator_tablicowy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOkreslony_deklarator_tablicowy(plplParser.Okreslony_deklarator_tablicowyContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#obliczany_deklarator_tablicowy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObliczany_deklarator_tablicowy(plplParser.Obliczany_deklarator_tablicowyContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#przydomki}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrzydomki(plplParser.PrzydomkiContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#nazwa_typu_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNazwa_typu_atom(plplParser.Nazwa_typu_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#nazwa_dynamicznie_alokowalnego_typu_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNazwa_dynamicznie_alokowalnego_typu_atom(plplParser.Nazwa_dynamicznie_alokowalnego_typu_atomContext ctx);
}