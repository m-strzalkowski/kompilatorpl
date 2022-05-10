package pl.plpl.generatory.klasyDanych;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;
import pl.plpl.generatory.Tablice;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektAutomatyczny;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektStatyczny;

import java.text.Normalizer;
import java.util.*;

import static pl.plpl.generatory.klasyDanych.Typ.DLUGOSC_SLOWA_B;

public class Procedura {
    public static int licznik=0;
    public int nr;

    public boolean poczatkowa=false;//czy jest w niej program/main
    public boolean nieokreslona=false;//procedura nieokreślona jest konceptualną zaślepką, mówiącą, że podczas wykonania znajdzie się coś, czego rzeczywistej procedury nie znamy/nie mamy podczas kompilacji. Nie jest wpisana do globalnej listy procedur, nie napuszcza się na nią generatora kodu.
    public boolean zamknieta_zwroc=false;//czy ostatnią instrukcją jest zwróć
    public PelnyTyp typZwracany;
    public List<Symbol> pelnaListaArgumentow = new ArrayList<Symbol>();//nazwa - typ
    private Map<Symbol, Integer> numeryArgProc = new HashMap<>(); public Integer numerArgumentuProcedury(Symbol s){return numeryArgProc.getOrDefault(s, null);}
    public List<PunktWejsciowy> wejscia = new ArrayList<>();
    public List<Zakres> zakresy = new ArrayList<>();
    public Zakres najogolniejszy_zakres=null;//zakres odpowiadający nawiasom klamrowym procedury, potrzebny bo w nim mają być parametry formalne
    public Map<Symbol, Boolean> zmapowane_w_pamiec_symbole = new HashMap<Symbol,Boolean>();//te, które maja odpowiadające obiekty pamięci

    public List<ObiektStatyczny> statyczne = new ArrayList<ObiektStatyczny>();
    public LinkedList<ObiektAutomatyczny> ramka_stosu = new LinkedList<ObiektAutomatyczny>();//właściwie ramka stosu + parametry
    public int rozmiar_B_calej_pamieci_lokalnej(){return rozmiar_B_parametrow() + rozmiar_B_zmiennych_automatycznych() + 2*Typ.Ref.dlugosc_B;}//parametry +adres powrotny?+ ebp + zm. autom.
    public int rozmiar_B_zmiennych_automatycznych(){return ((ramka_stosu.size()<1)?(0):-(ramka_stosu.getLast().offset - ramka_stosu.getLast().rozmiar_B)) - Typ.Ref.dlugosc_B;}//bez poprzedniego ebp - od ebp-4
    public int rozmiar_B_parametrow(){return ((ramka_stosu.size()<1)?(0):(ramka_stosu.getFirst().offset + ramka_stosu.getFirst().rozmiar_B)) - 2*Typ.Ref.dlugosc_B;}
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
    /*
    public void przeliczStruktury() {
        System.out.println("PRZELICZANIE STRUKTUR PROCEDURY"+nr);
        ramka_stosu.clear();
        int offset_kolejnych=0;
        PelnyTyp czystaRef = new PelnyTyp();
        czystaRef.typ = Typ.Ref;
        czystaRef.rodzaj_pamieci = PelnyTyp.RodzajPam.AUTOMATYCZNA;
        czystaRef.parametr_formalny = false;
        Symbol ebp = new Symbol("poprzedni ebp", null,  najogolniejszy_zakres, czystaRef);
        offset_kolejnych -= ramka_stosu.getLast().rozmiar_B;
       // ramka_stosu.add((ObiektAutomatyczny) ebp.obiektPamieci);
        //ramka_stosu.getLast().offset=offset_kolejnych;

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
    */
    public void przeliczStruktury() {
        System.out.println("PRZELICZANIE STRUKTUR PROCEDURY"+nr);
        ramka_stosu.clear();
        pelnaListaArgumentow.clear();

        int offset_w_dół, offset_w_górę;
        PelnyTyp czystaRef = new PelnyTyp();
        czystaRef.typ = Typ.Ref;
        czystaRef.rodzaj_pamieci = PelnyTyp.RodzajPam.AUTOMATYCZNA;
        czystaRef.parametr_formalny = false;
        Symbol pwt = new Symbol("adres powrotny", null,  najogolniejszy_zakres, czystaRef);
        Symbol ebp = new Symbol("poprzedni ebp", null,  najogolniejszy_zakres, czystaRef);
        ramka_stosu.add((ObiektAutomatyczny)pwt.obiektPamieci); offset_w_górę = 1* DLUGOSC_SLOWA_B;  ((ObiektAutomatyczny) pwt.obiektPamieci).offset = offset_w_górę; offset_w_górę +=  ((ObiektAutomatyczny) pwt.obiektPamieci).rozmiar_B;
        ramka_stosu.add((ObiektAutomatyczny)ebp.obiektPamieci); offset_w_dół = 0; ((ObiektAutomatyczny) ebp.obiektPamieci).offset = offset_w_dół; offset_w_dół -=  ((ObiektAutomatyczny) ebp.obiektPamieci).rozmiar_B;

        for (Zakres zakres : zakresy)
        {
            for(Symbol s: zakres.symbole)//dla wszystkich symboli w zakresach procedury...
            {
                System.out.println(s);
                if(s.pelnyTyp.rodzaj_pamieci == PelnyTyp.RodzajPam.AUTOMATYCZNA)//...które są automatyczne
                {
                    ObiektAutomatyczny obp = (ObiektAutomatyczny) s.obiektPamieci;
                    if(s.pelnyTyp.parametr_formalny)//ebp+x
                    {
                        obp.offset = offset_w_górę;
                        offset_w_górę += obp.rozmiar_B;
                        ramka_stosu.addFirst(obp);
                        pelnaListaArgumentow.add(s);
                        numeryArgProc.put(s, pelnaListaArgumentow.size()-1);
                    }
                    else//zmienne lokalne: ebp-x
                    {
                        obp.offset = offset_w_dół;
                        offset_w_dół -= obp.rozmiar_B;
                        ramka_stosu.addLast(obp);
                    }
                }
            }
        }
    //Collections.reverse(pelnaListaArgumentow);
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
                ", \npelnaListaArgumentow=" + pelnaListaArgumentow.toString().replaceAll("},", ",}\n") +
                ", \nWEJSCIA=" + wejscia +
                ", \nzakresy=" + zakresy +
                ", \nstatyczne=" + statyczne +
                ", \nramka_stosu=" + ramka_stosu +
                ", \ndata=\n" + data +
                ", \nbss=\n" + bss +
                ", \nrodata=\n" + rodata +
                ", \ntext=\n" + text +
                "}\n";
    }
    public static String PRZYROSTEK_ETYKIETY_PROLOGU = "_prolog";
    public static String PRZYROSTEK_ETYKIETY_EPILOGU = "_epilog";
    public static String PRZEDROSTEK_ETYKIETY_PO_PUNKCIE = "after_";
    public static String LOKALNA_ETYKIETA_PO_PRZEBUDOWIE_RAMKI = ".noargshuffle";


}
