package pl.plpl.generatory;

import org.antlr.v4.runtime.CommonTokenStream;
import pl.plpl.generatory.klasyDanych.Typ;
import pl.plpl.parser.plplBaseListener;
import pl.plpl.parser.plplParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.System.exit;
import static pl.plpl.generatory.Tablice.inputLength;
import static pl.plpl.generatory.Tablice.typy;

public class Sprawdzacz extends plplBaseListener {
    private final CommonTokenStream tokens;
    plplParser parser;
    int i=0;
    public Sprawdzacz(plplParser parser, CommonTokenStream tokens) {this.parser = parser; this.tokens=tokens;}
    @Override public void exitProgram(plplParser.ProgramContext ctx) {
        try {
            Tablice.inputLength = Files.size(Paths.get(Tablice.inputFilePath));
            System.out.println("inl"+inputLength);
            var l = tokens.getTokens();
            System.out.println("tkln"+ l.get(l.size()-1).getStopIndex());
            System.out.println("diff"+ (l.get(l.size()-1).getStopIndex() - inputLength));
            System.out.println("trln"+ ctx.getStop().getStopIndex());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
