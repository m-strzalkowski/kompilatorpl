package pl.plpl.generatory.klasyDanych;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;
import pl.plpl.generatory.Tablice;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektAutomatyczny;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektStatyczny;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Procedura {
    public static int licznik=0;
    public int nr;

    public boolean poczatkowa=false;//czy jest w niej program/main
    public boolean zamknieta_zwroc=false;
    public PelnyTyp typZwracany;
    public List<Pair<String,PelnyTyp>> pelnaListaArgumentow = new ArrayList<Pair<String,PelnyTyp>>();//nazwa - typ
    public List<PunktWejsciowy> wejscia = new ArrayList<>();
    public List<Zakres> zakresy = new ArrayList<>();
    //najogólniejszy zakres?
    public Map<Symbol, Boolean> zmapowane_w_pamiec_symbole = new HashMap<Symbol,Boolean>();//te, które maja odpowiadające obiekty pamięci

    public List<ObiektStatyczny> statyczne = new ArrayList<ObiektStatyczny>();
    public List<ObiektAutomatyczny> ramka_stosu = new ArrayList<ObiektAutomatyczny>();
    public int dlugosc_B_zmiennych_automatycznych=0;

    //kod wynikowy
    public StringBuilder data = new StringBuilder();
    public StringBuilder bss = new StringBuilder();
    public StringBuilder rodata = new StringBuilder();
    public StringBuilder text = new StringBuilder();

    public StringBuilder text_prolog = new StringBuilder();
    public StringBuilder text_epilog = new StringBuilder();
    public Zakres najogolniejszy_zakres=null;//zakres odpowiadający nawiasom klamrowym procedury, potrzebny bo w nim mają być parametry formalne
    //public StringBuilder prolog_text = new StringBuilder();

    public Procedura(Token startToken) {
        nr = licznik++;
    }

    public String etykieta()
    {
        //Normalizer.normalize(pelnyTyp.typ.nazwa, Normalizer.Form.NFD)NFKD

        return "P"+ wejscia.get(0).etykieta();
    }

    public StringBuilder zamienNaAssembler()
    {
        StringBuilder sb = new StringBuilder();
        if(!data.isEmpty())
        {
            sb.append("section .data\n");
            sb.append(data);
        }
        if(!bss.isEmpty())
        {
            sb.append("section .bss\n");
            sb.append(bss);
        }
        if(!text.isEmpty())
        {
            sb.append("section .text\n");
            sb.append(text);
        }
        if(!rodata.isEmpty())
        {
            sb.append("section .rodata\n");
            sb.append(rodata);
        }

        return sb;
    }

    @Override
    public String toString() {
        return "Procedura{początkowa:" + poczatkowa +
                ", nr=" + nr +
                ", pelnaListaArgumentow=" + pelnaListaArgumentow +
                ", wejscia=" + wejscia +
                ", zakresy=" + zakresy +
                ", statyczne=" + statyczne +
                ", ramka_stosu=" + ramka_stosu +
                ", \ndata=\n" + data +
                ", \nbss=\n" + bss +
                ", \nrodata=\n" + rodata +
                ", \ntext=\n" + text +
                "}\n";
    }
    public static String PROLOG_LABEL_SUFFIX = "_prolog";
    public static String EPILOG_LABEL_SUFFIX = "_epilog";
}
