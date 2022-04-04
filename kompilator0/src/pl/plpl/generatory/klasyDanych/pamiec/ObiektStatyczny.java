package pl.plpl.generatory.klasyDanych.pamiec;

import pl.plpl.generatory.klasyDanych.Procedura;
import pl.plpl.generatory.klasyDanych.Symbol;
/**
 * Reprezentuje obiekt w statycznej pamięci (patrz komentarz do klasy nadrzędnej)
 */
public class ObiektStatyczny extends ObiektPamieci{
    String etykieta;//etykieta w asemblerze

    public ObiektStatyczny(Symbol symbol) {
        this.symbol = symbol;
        sprawdzUnikalnosc(symbol);
        this.rozmiar_B = symbol.pelnyTyp.rozmiar_B();
        //this.procedura = symbol.zakres.procedura;
        this.etykieta = symbol.etykieta();
        this.symbol.zakres.procedura.statyczne.add(this);
    }

    @Override
    public String toString() {
        return "\nObStat{" +
                "sym=" + symbol +
                ", rozm=" + rozmiar_B +
                "B, etykieta='" + etykieta + '\'' +
                "}";
    }
}
