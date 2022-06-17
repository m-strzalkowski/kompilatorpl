package pl.plpl.generatory.klasyDanych.tablice;

import org.antlr.v4.runtime.Token;
import pl.plpl.generatory.klasyDanych.Struktura;
import pl.plpl.generatory.klasyDanych.Symbol;
import pl.plpl.generatory.klasyDanych.Typ;

public abstract class Tablica extends Struktura {

    public Tablica(Token startToken, Typ TypZlozony) {
        super(startToken, TypZlozony);
    }
    public abstract String kodIndeksowania(Symbol sym, Token miejsce, String rejestr_z_indeksem, String rejestr_źródłowy, boolean dereferencja_na_końcu);
}
