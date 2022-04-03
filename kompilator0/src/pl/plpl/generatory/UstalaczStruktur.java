package pl.plpl.generatory;

import pl.plpl.generatory.klasyDanych.Typ;
import pl.plpl.parser.plplBaseListener;
import pl.plpl.parser.plplParser;

import static pl.plpl.generatory.Tablice.typy;

public class UstalaczStruktur extends plplBaseListener {
    plplParser parser;
    public UstalaczStruktur(plplParser parser) {this.parser = parser;}
    @Override public void enterProgram(plplParser.ProgramContext ctx) {
        System.out.println("USTALANIE STRUKTUR\n");
    }

    @Override public void exitProgram(plplParser.ProgramContext ctx) {
        //System.out.println(Tablice.wypisz());
    }
}
