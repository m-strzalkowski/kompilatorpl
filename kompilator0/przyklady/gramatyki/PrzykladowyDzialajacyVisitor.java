package pl.plpl.generatory;

import pl.plpl.generatory.klasyDanych.Zakres;
import pl.plpl.parser.plplBaseVisitor;
import pl.plpl.parser.plplParser;

public class GeneratorVisitor extends plplBaseVisitor<String> {
    private Zakres aktualnyZakres;
    @Override public String visitProgram(plplParser.ProgramContext ctx) {
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(level, ctx.start, ctx.start.getLine(), ctx.start.getCharPositionInLine(),
                "Pragnę pojnformować, że rozpocząłem wizytacje programu."));
        String aggr = visitChildren(ctx);
        return "nic";
    }
    @Override public String visitByt_globalny(plplParser.Byt_globalnyContext ctx) { return ctx.getText(); }
}
