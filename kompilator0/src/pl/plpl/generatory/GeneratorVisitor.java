package pl.plpl.generatory;

import pl.plpl.generatory.klasyDanych.Zakres;
import pl.plpl.parser.plplBaseVisitor;
import pl.plpl.parser.plplParser;

public class GeneratorVisitor extends plplBaseVisitor<String> {
    private Zakres aktualnyZakres;
    @Override public String visitProgram(plplParser.ProgramContext ctx) { System.out.println("Pragnę pojnformować, że rozpocząłem wizytacje programu."); return visitChildren(ctx); }
}
