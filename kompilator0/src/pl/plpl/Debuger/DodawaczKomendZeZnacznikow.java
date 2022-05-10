package pl.plpl.Debuger;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;
import pl.plpl.Debuger.wygenerowane.parserDebugera;
import pl.plpl.Debuger.wygenerowane.parserDebugeraBaseVisitor;

public class DodawaczKomendZeZnacznikow extends parserDebugeraBaseVisitor {
    ParseTree currenttree;
    Token currenttoken;
    DebugerKompilatora bref;
    @Override public String visitOznaczenia_przebiegow(parserDebugera.Oznaczenia_przebiegowContext ctx) {
        if(ctx.PRZEBIEG_ANALIZY_SEMANTYCZNEJ().size() > 0)
        {
            bref.zn_sem.add(new Pair<Token, ParseTree>(currenttoken, currenttree) );
        }
        if(ctx.PRZEBIEG_GENERACYJNY().size() > 0)
        {
            bref.zn_gen.add(new Pair<Token, ParseTree>(currenttoken, currenttree) );
        }
        if(ctx.PRZEBIEG_TYPOWANIA().size() > 0)
        {
            bref.zn_typ.add(new Pair<Token, ParseTree>(currenttoken, currenttree) );
        }


        return "";
    }
}
