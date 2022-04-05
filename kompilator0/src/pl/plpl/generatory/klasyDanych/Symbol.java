package pl.plpl.generatory.klasyDanych;

import org.antlr.v4.runtime.Token;

import java.text.Normalizer;
import java.util.Map;

public class Symbol {

    static int licznik=0;
    int nr=0;
    public String identyfikator;//dla zmiennych/nazwanych stałych/punktów wejściowych
    public Token token;//dla stałych
    public PunktWejsciowy pktWe;//dla punktów wejściowych
    public Zakres zakres;
    public PelnyTyp pelnyTyp;

    @Override
    public String toString() {
        return "Symbol{" +
                "nr=" + nr +
                ", identyfikator='" + identyfikator + '\'' +
                ", zakres=" + zakres.nr +
                ", " + pelnyTyp +
                '}';
    }

    public Symbol(String identyfikator, Zakres zakres, PelnyTyp pelnyTyp) {
        this.nr = licznik++;
        this.identyfikator = identyfikator;
        this.token = null;
        this.zakres = zakres;
        this.pelnyTyp = pelnyTyp;
    }
    public Symbol(Token token, Zakres zakres, PelnyTyp pelnyTyp) {
        this.nr = licznik++;
        this.token = token;
        this.identyfikator = null;
        this.zakres = zakres;
        this.pelnyTyp = pelnyTyp;
    }
    public String etykieta()
    {
        //Normalizer.normalize(pelnyTyp.typ.nazwa, Normalizer.Form.NFD)NFKD
        if(pelnyTyp.rodzaj_pamieci == PelnyTyp.RodzajPam.AUTOMATYCZNA){return "RUNTIME_ERROR_HANDLER";}
        return "S"+Normalizer.normalize(pelnyTyp.typ.nazwa, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "")+"_"+zakres.nr+"_"+nr;
    }
}
