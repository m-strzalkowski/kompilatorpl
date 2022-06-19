package pl.plpl.generatory;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import pl.plpl.bledy.SemanticOccurence;
import pl.plpl.generatory.klasyDanych.Typ;
import pl.plpl.parser.plplBaseListener;
import pl.plpl.parser.plplParser;

import static pl.plpl.generatory.Tablice.*;

public class ZbieraczNowychTypow extends plplBaseListener {
    plplParser parser;
    int i=0;
    public ZbieraczNowychTypow(plplParser parser) {this.parser = parser;}
    @Override public void enterProgram(plplParser.ProgramContext ctx) {
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "ZBIERANIE NAZW TYPÓW"));
    }
    @Override public void enterDeklaracja_typu(plplParser.Deklaracja_typuContext ctx)
    { //System.out.println("\n"+i+ ctx.getText() + "\n"); i++;
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "NOWY TYP"));
        //typy.add(new Typ(ctx.ID().getText(), Typ.Ref.dlugosc_B, false, null));
        dodajTypZlozony(ctx.ID().getText(), null);
    }
    @Override public void exitProgram(plplParser.ProgramContext ctx) {
    }

}
