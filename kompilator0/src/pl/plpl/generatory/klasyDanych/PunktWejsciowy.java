package pl.plpl.generatory.klasyDanych;

import org.antlr.v4.runtime.misc.Pair;

import java.util.List;

public class PunktWejsciowy {
    String nazwa;
    public List<Pair<String, PelnyTyp>> ListaNazwaTyp;//do analizy
    public List<Pair<PelnyTyp, Integer>> ListaArgument_przesuniecie;//do generacji
}
