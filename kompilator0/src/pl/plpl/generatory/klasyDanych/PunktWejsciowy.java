package pl.plpl.generatory.klasyDanych;

import org.antlr.v4.runtime.misc.Pair;
import pl.plpl.generatory.Tablice;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class PunktWejsciowy {
    public final String nazwa;
    public List<Symbol> parametry = new ArrayList<>();
    public int[] numery;//mapa zawierająca numer parametru procedury odpowiadający parametrowi wejścia

    public PunktWejsciowy(String nazwa) {
        this.nazwa = nazwa;
    }

    //public List<Pair<PelnyTyp, PelnyTyp>> ListaNazwaTyp;//do analizy id - typ
    //public List<Pair<PelnyTyp, Integer>> ListaArgument_przesuniecie;//do generacji
    public String etykieta()
    {
        //Normalizer.normalize(pelnyTyp.typ.nazwa, Normalizer.Form.NFD)NFKD
        if(nazwa.equals(Tablice.WEJSCIE_PROG)){return Tablice.PODKRESLNIK+ "main";}
        return  Normalizer.normalize(nazwa, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
