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
	 * Visit a parse tree produced by {@link plplParser#deklaracja_referencji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklaracja_referencji(plplParser.Deklaracja_referencjiContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#deklaracja_atomiczna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklaracja_atomiczna(plplParser.Deklaracja_atomicznaContext ctx);
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
	 * Visit a parse tree produced by {@link plplParser#instrukcja_prosta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja_prosta(plplParser.Instrukcja_prostaContext ctx);
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
	 * Visit a parse tree produced by the {@code wyrazenieId}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieId(plplParser.WyrazenieIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieLogicz}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieLogicz(plplParser.WyrazenieLogiczContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieMult}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieMult(plplParser.WyrazenieMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniePrzypisanie}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniePrzypisanie(plplParser.WyrazeniePrzypisanieContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieAdres}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieAdres(plplParser.WyrazenieAdresContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieAddyt}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieAddyt(plplParser.WyrazenieAddytContext ctx);
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
	 * Visit a parse tree produced by the {@code wyrazenieZnak}
	 * labeled alternative in {@link plplParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieZnak(plplParser.WyrazenieZnakContext ctx);
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
	 * Visit a parse tree produced by the {@code przypisanieZwykle}
	 * labeled alternative in {@link plplParser#przypisanie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrzypisanieZwykle(plplParser.PrzypisanieZwykleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code przypisaniePoteg}
	 * labeled alternative in {@link plplParser#przypisanie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrzypisaniePoteg(plplParser.PrzypisaniePotegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code przypisanieMult}
	 * labeled alternative in {@link plplParser#przypisanie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrzypisanieMult(plplParser.PrzypisanieMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code przypisanieAddyt}
	 * labeled alternative in {@link plplParser#przypisanie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrzypisanieAddyt(plplParser.PrzypisanieAddytContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#wywolanie_funkcji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWywolanie_funkcji(plplParser.Wywolanie_funkcjiContext ctx);
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
	 * Visit a parse tree produced by {@link plplParser#pelny_typ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPelny_typ(plplParser.Pelny_typContext ctx);
	/**
	 * Visit a parse tree produced by {@link plplParser#nazwa_typu_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNazwa_typu_atom(plplParser.Nazwa_typu_atomContext ctx);
}