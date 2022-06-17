package pl.plpl.generatory.semantyka.atrybuty;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import pl.plpl.bledy.SemanticOccurence;
import pl.plpl.generatory.Tablice;
import pl.plpl.generatory.semantyka.Opcja;
import pl.plpl.parser.plplParser;

import static pl.plpl.generatory.semantyka.Propagacje.nigdzie;
import static pl.plpl.generatory.semantyka.Propagacje.w_dół;

/** Ten atrybut ma informować węzły potomne, że mają podczas generacji kodu zwrócić adres obiektu, a nie jego wartość.
 * Węzły końcowe powinny, już w visitorze - generatorze poprawnie skonsumować taka informację, inacze wygeneruje się tragicznie błędny kod.
 */
public class Atrybut_Niedereferencja extends Opcja<Boolean> {
    ParseTreeProperty<Boolean> prop = new ParseTreeProperty<>();
    public Atrybut_Niedereferencja() {super();
        //na węzłach pośrednich, atrybut przechodzi dalej, na końcowych nie prezchodzi, zakłada się jego skonsumowanie, na reszcie węzłów powoduje błędy.
        // żródło zaznaczeń: wyrazeniePrzypisanieZwykle
        Class[] pośrednie = new Class[]{
                plplParser.WyrazenieNawiasyContext.class,
                plplParser.WyrazenieLwartoscContext.class

                                        };
        Class[] końcowe = new Class[]{
                plplParser.LwartoscContext.class,
                plplParser.WyrazenieSelekcjiSkladowejContext.class,
                plplParser.WyrazenieSelekcjaTablicowaContext.class
                //plplParser.Selektor_tablicowyContext.class,
                //plplParser.Selektor_typu_zlozonegoContext.class
        };
        propagacjaNaWęzłach(w_dół, pośrednie);
        propagacjaNaWęzłach(nigdzie, końcowe);
        propagacjaNaInnychWęzłach(w_dół);
        zdarzenieNaWęzłach(pośrednie,
                Opcja.generatorZdarzeńZPozycjąPoczątkaWęzła(SemanticOccurence.Level.DEBUG, "węzeł pośredni"));
        zdarzenieNaWęzłach(końcowe,c -> {
            ParserRuleContext ctx = ((ParserRuleContext) c);
            return new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                    ""+ctx.getClass()+"węzeł końcowy: "+ctx.getText()+" \n");
        });
        zdarzenieNaWęzłach(new Class[]{plplParser.WyrazenieStalaContext.class},c -> {
            ParserRuleContext ctx = ((ParserRuleContext) c);
            return new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                    "Próba uzyskania adresu stałej atomicznej: "+ctx.getText()+" \n");
        });
        zdarzenieNaReszcieWęzłów(c -> {
            ParserRuleContext ctx = ((ParserRuleContext) c);
            return new SemanticOccurence(SemanticOccurence.Level.FATAL, ctx.start, ctx.start.getLine(), ctx.start.getCharPositionInLine(),
                    "Próba uzyskania adresu obiektu, który poprawnego adresu nie posiada: " + ctx.getText() + "\n");
        });
    }
}
