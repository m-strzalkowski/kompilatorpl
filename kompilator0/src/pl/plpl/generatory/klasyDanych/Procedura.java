package pl.plpl.generatory.klasyDanych;

import org.antlr.v4.runtime.misc.Pair;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektAutomatyczny;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektStatyczny;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Procedura {
    public static int licznik=0;
    public int nr;
    public List<Pair<String,PelnyTyp>> pelnaListaArgumentow = new ArrayList<Pair<String,PelnyTyp>>();//nazwa - typ
    public List<PunktWejsciowy> wejscia = new ArrayList<>();
    public List<Zakres> zakresy = new ArrayList<>();
    //najogólniejszy zakres?
    public Map<Symbol, Boolean> zmapowane_w_pamiec_symbole = new HashMap<Symbol,Boolean>();//te, które maja odpowiadające obiekty pamięci

    public List<ObiektStatyczny> statyczne = new ArrayList<ObiektStatyczny>();
    public List<ObiektAutomatyczny> ramka_stosu = new ArrayList<ObiektAutomatyczny>();

    //kod wynikowy
    public StringBuilder data = new StringBuilder();
    public StringBuilder bss = new StringBuilder();
    public StringBuilder rodata = new StringBuilder();
    public StringBuilder text = new StringBuilder();
    public Zakres najogolniejszy_zakres=null;//zakres odpowiadający nawiasom klamrowym procedury, potrzebny bo w nim mają być parametry formalne
    //public StringBuilder prolog_text = new StringBuilder();

    public Procedura() {
        nr = licznik++;
    }


    @Override
    public String toString() {
        return "Procedura{" +
                "nr=" + nr +
                ", pelnaListaArgumentow=" + pelnaListaArgumentow +
                ", wejscia=" + wejscia +
                ", zakresy=" + zakresy +
                ", statyczne=" + statyczne +
                ", ramka_stosu=" + ramka_stosu +
                ", data=" + data +
                ", bss=" + bss +
                ", rodata=" + rodata +
                ", text=" + text +
                "}\n";
    }
}
