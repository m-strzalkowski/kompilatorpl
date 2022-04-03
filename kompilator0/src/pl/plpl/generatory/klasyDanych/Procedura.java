package pl.plpl.generatory.klasyDanych;

import org.antlr.v4.runtime.misc.Pair;

import java.util.List;

public class Procedura {
    public int nr;
    public List<Pair<String,PelnyTyp>> pelnaListaArgumentow;//nazwa - typ
    public List<PunktWejsciowy> wejscia;
    public StringBuilder data = new StringBuilder();
    public StringBuilder bss = new StringBuilder();
    public StringBuilder rodata = new StringBuilder();
    public StringBuilder text = new StringBuilder();
}
