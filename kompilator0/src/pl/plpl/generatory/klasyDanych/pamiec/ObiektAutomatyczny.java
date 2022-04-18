package pl.plpl.generatory.klasyDanych.pamiec;

import pl.plpl.generatory.klasyDanych.Procedura;
import pl.plpl.generatory.klasyDanych.Symbol;
/**
 * Reprezentuje obiekt w ramce stosu procedury (patrz komentarz do klasy nadrzędnej)
 */
public class ObiektAutomatyczny extends ObiektPamieci{
    public int offset;//od ebp (rejestru dna stosu)

    public ObiektAutomatyczny(Symbol symbol) {
        this.symbol = symbol;
        sprawdzUnikalnosc(symbol);
        offset = 0;
        this.rozmiar_B = symbol.pelnyTyp.rozmiar_B();
        //this.procedura = symbol.zakres.procedura;
        this.symbol.zakres.procedura.ramka_stosu.add(this);
    }
    @Override
    public String toString() {
        return "\n{" +
                "ebp"+ ((offset<0)?(""):("+")) + offset +
                ", " + rozmiar_B +
                "B, sym:" + symbol +
                "}";
    }


}
