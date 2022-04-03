package pl.plpl.generatory.klasyDanych;

import org.antlr.v4.runtime.Token;

import java.util.Map;

public class Symbol {
    public Token token;//dla stałych
    public String identyfikator;//dla zmiennych/nazwanych stałych
    public Zakres zakres;
    public PelnyTyp pelnyTyp;
}
