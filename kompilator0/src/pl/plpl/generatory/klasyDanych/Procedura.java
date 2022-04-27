package pl.plpl.generatory.klasyDanych;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;
import pl.plpl.generatory.Tablice;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektAutomatyczny;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektStatyczny;

import java.text.Normalizer;
import java.util.*;

public class Procedura {
    public static int licznik=0;
    public int nr;

    public boolean poczatkowa=false;//czy jest w niej program/main
    public boolean nieokreslona=false;//procedura nieokreślona jest konceptualną zaślepką, mówiącą, że podczas wykonania znajdzie się coś, czego rzeczywistej procedury nie znamy/nie mamy podczas kompilacji. Nie jest wpisana do globalnej listy procedur, nie napuszcza się na nią generatora kodu.
    public boolean zamknieta_zwroc=false;//czy ostatnią instrukcją jest zwróć
    public PelnyTyp typZwracany;
    public List<Pair<String,PelnyTyp>> pelnaListaArgumentow = new ArrayList<Pair<String,PelnyTyp>>();//nazwa - typ
    public List<PunktWejsciowy> wejscia = new ArrayList<>();
    public List<Zakres> zakresy = new ArrayList<>();
    public Zakres najogolniejszy_zakres=null;//zakres odpowiadający nawiasom klamrowym procedury, potrzebny bo w nim mają być parametry formalne
    public Map<Symbol, Boolean> zmapowane_w_pamiec_symbole = new HashMap<Symbol,Boolean>();//te, które maja odpowiadające obiekty pamięci

    public List<ObiektStatyczny> statyczne = new ArrayList<ObiektStatyczny>();
    public LinkedList<ObiektAutomatyczny> ramka_stosu = new LinkedList<ObiektAutomatyczny>();//właściwie ramka stosu + parametry
    public int rozmiar_B_calej_pamieci_lokalnej(){return rozmiar_B_parametrow() + rozmiar_B_zmiennych_automatycznych() + Typ.Ref.dlugosc_B;}//parametry +adres powrotny?+ ebp + zm. autom.
    public int rozmiar_B_zmiennych_automatycznych(){return ((ramka_stosu.size()<1)?(0):-(ramka_stosu.getLast().offset - ramka_stosu.getLast().rozmiar_B)) - Typ.Ref.dlugosc_B;}//bez poprzedniego ebp - od ebp-4
    public int rozmiar_B_parametrow(){return 0;}
    public String infoORamce()
    {
        StringBuilder sb = new StringBuilder();
        sb.append( "RAMKA STOSU (i parametry) PROCEDURY"+ this.etykieta()+"\n");
        for(var o : this.ramka_stosu)
        {
            sb.append(o.toString());
        }
        sb.append("\nrozmiar_B_calej_pamieci_lokalnej:"+rozmiar_B_calej_pamieci_lokalnej());
        sb.append("\nrozmiar_B_zmiennych_automatycznych:"+rozmiar_B_zmiennych_automatycznych());
        sb.append("\nrozmiar_B_parametrow:"+rozmiar_B_parametrow());
        return sb.toString();
    }
    public void przeliczStruktury() {
        System.out.println("PRZELICZANIE STRUKTUR PROCEDURY"+nr);
        ramka_stosu.clear();
        int offset_kolejnych=0;
        PelnyTyp czystaRef = new PelnyTyp();
        czystaRef.typ = Typ.Ref;
        czystaRef.rodzaj_pamieci = PelnyTyp.RodzajPam.AUTOMATYCZNA;
        czystaRef.parametr_formalny = false;
        Symbol ebp = new Symbol("poprzedni ebp", null,  najogolniejszy_zakres, czystaRef);
       // ramka_stosu.add((ObiektAutomatyczny) ebp.obiektPamieci);
        //ramka_stosu.getLast().offset=offset_kolejnych;
        offset_kolejnych -= ramka_stosu.getLast().rozmiar_B;
        System.out.println("%%%%%%%%%%%%%%%%%%%%%");
        //nie dodajemy symbolu do przestrezni nazw, bo właściwie go tam nie ma.
        for (Zakres zakres : zakresy)
        {
            for(Symbol s: zakres.symbole)
            {
                System.out.println(s);
                if(s.pelnyTyp.rodzaj_pamieci == PelnyTyp.RodzajPam.AUTOMATYCZNA && s.pelnyTyp.parametr_formalny == false )
                {
                    ObiektAutomatyczny obp = (ObiektAutomatyczny) s.obiektPamieci;
                    obp.offset = offset_kolejnych;
                    offset_kolejnych -= obp.rozmiar_B;
                    ramka_stosu.add(obp);
                    System.out.println(obp);

                }
            }
        }
        System.out.println("KONIEC PRZELICZANIA STRUKTUR PROCEDURY"+nr);
    }

    //kod wynikowy
    public StringBuilder data = new StringBuilder();
    public StringBuilder bss = new StringBuilder();
    public StringBuilder rodata = new StringBuilder();
    public StringBuilder text = new StringBuilder();

    public StringBuilder text_prolog = new StringBuilder();
    public StringBuilder text_epilog = new StringBuilder();

    //public StringBuilder prolog_text = new StringBuilder();

    public Procedura(Token startToken) {
        nr = licznik++;
    }

    public String etykieta()
    {
        //Normalizer.normalize(pelnyTyp.typ.nazwa, Normalizer.Form.NFD)NFKD
        //if(poczatkowa) {return }
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
