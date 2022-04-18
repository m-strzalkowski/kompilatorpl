// Generated from C:/Users/mastr/Documents/MS/STUDIA/kompilatory/kompilatorpl/kompilator0/src/pl/plpl/Debugger\parserDebugera.g4 by ANTLR 4.9.2
package pl.plpl.Debuger;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link parserDebugera}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface parserDebugeraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link parserDebugera#znacznik}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZnacznik(parserDebugera.ZnacznikContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#oznaczenia_przebiegow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOznaczenia_przebiegow(parserDebugera.Oznaczenia_przebiegowContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#zbior_komend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZbior_komend(parserDebugera.Zbior_komendContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#reszta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReszta(parserDebugera.ResztaContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#komenda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKomenda(parserDebugera.KomendaContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#nastepny_krok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNastepny_krok(parserDebugera.Nastepny_krokContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#nastepny_znacznik}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNastepny_znacznik(parserDebugera.Nastepny_znacznikContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#komenda_ubicia_kompilatora}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKomenda_ubicia_kompilatora(parserDebugera.Komenda_ubicia_kompilatoraContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#komenda_ubicia_debugera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKomenda_ubicia_debugera(parserDebugera.Komenda_ubicia_debugeraContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#przechodzenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrzechodzenie(parserDebugera.PrzechodzenieContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#cd_do_proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCd_do_proc(parserDebugera.Cd_do_procContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#cd_do_zakresu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCd_do_zakresu(parserDebugera.Cd_do_zakresuContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#listowanie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListowanie(parserDebugera.ListowanieContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#listing_procedur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListing_procedur(parserDebugera.Listing_procedurContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#listing_zakresow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListing_zakresow(parserDebugera.Listing_zakresowContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#pisz_zakres}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPisz_zakres(parserDebugera.Pisz_zakresContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#pisz_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPisz_procedure(parserDebugera.Pisz_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#pisz_ramke_procedury}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPisz_ramke_procedury(parserDebugera.Pisz_ramke_proceduryContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#pisz_statyczne_procedury}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPisz_statyczne_procedury(parserDebugera.Pisz_statyczne_proceduryContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#pisz_sekcje}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPisz_sekcje(parserDebugera.Pisz_sekcjeContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#pisz_nazwy_typow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPisz_nazwy_typow(parserDebugera.Pisz_nazwy_typowContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#pisz_tokeny}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPisz_tokeny(parserDebugera.Pisz_tokenyContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserDebugera#pisz_drzewo_skladniowe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPisz_drzewo_skladniowe(parserDebugera.Pisz_drzewo_skladnioweContext ctx);
}