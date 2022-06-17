package pl.plpl.generatory;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import pl.plpl.Debuger.DebugerKompilatora;
import pl.plpl.bledy.Błędnik;
import pl.plpl.generatory.klasyDanych.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tablice {
    public enum Srodowisko{WIN32, LINUX32};
    public static Srodowisko SRODOWISKO;
    public static boolean generacja_binarnego_obrazu = false;//czy generować asm, czy próbować uruchomić nasm i potem gcc/ld
    public static String inputFilePath;
    public static String outputFilePath;
    public static long inputLength=0;
    public static DebugerKompilatora debuger_kompilatora=null;

    public static Błędnik podsystem_bledow = new Błędnik();

    public static List<Typ> typy;
    public static Zakres zakres_globalny;
    public static Procedura kod_globalny;
    public static List<Zakres> zakresy = new ArrayList<>();
    public static List<Procedura> procedury = new ArrayList<>();
    public static Map<Token, Zakres> zakresy_po_pierwszym_tokenie = new HashMap<>();

    public static boolean znaleziono_pkt_we_programu=false;//czy znaleziono program/main
    public static String PODKRESLNIK = "_";//zamienić na "", jeśli w tym srodowisku nie życzą sobie podkreśnika przed np. main
    public static String WEJSCIE_PROG = "program";//nazwa stojąca za main

    public static int liczbaIfow = 0;
    public static int liczbaPetli = 0;

    public static OpcjePLPL opcje = new OpcjePLPL();//opcje - atrybuty semantyczne drzewa składniowego

    //Adnotacje na drzewie składniowym
    public static ParseTreeProperty<Boolean> niedereferencja = new ParseTreeProperty<>();

    public static void dodajZakres(Zakres z)
    {
        zakresy.add(z); zakresy_po_pierwszym_tokenie.put(z.startToken, z);
    }
    public static Zakres zakresPoPierwszymTokenie(Token t){
        return zakresy_po_pierwszym_tokenie.getOrDefault(t, null);
    }

    public static void inicjalizuj()
    {
        typy = new ArrayList<Typ>();
        typy.add(Typ.Całk);
        typy.add(Typ.Rzeczyw);
        typy.add(Typ.Znak);
        typy.add(Typ.Ref);

        kod_globalny = new Procedura(null);
        zakres_globalny = new Zakres(null, kod_globalny, null);
        kod_globalny.najogolniejszy_zakres = zakres_globalny;
    }

    //przechowywanie typów i dostęp do nich
    private static Map<String, Typ> typPoNazwie_mapa = new HashMap<>();
    public static void dodajTypZlozony(String ID, Struktura struktura)
    {
        Typ t = new Typ(ID, Typ.Ref.dlugosc_B, false, struktura);
        typy.add(t);
        typPoNazwie_mapa.put(ID, t);
    }
    public static Typ typPoNazwie(String ID)
    {
        return typPoNazwie_mapa.getOrDefault(ID, null);
    }


    public static String wypisz() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTABLICE KOMPILATORA:\n");
        sb.append("\nTABLICA TYPÓW:\n");
        for (var t:typy)
        {
            sb.append(t.toString()).append("\n");
        }
        sb.append("\nZAKRESY SYMBOLI:\n");
        sb.append("GLOBALNY:\n");
        sb.append(zakres_globalny.toString());
        sb.append("LOKALNE:\n");
        for(var z:zakresy)
        {
            sb.append(z.toString());
        }

        sb.append("\nKOD GLOBALNY:\n");
        sb.append(kod_globalny.toString());
        sb.append("\nPROCEDURY:"+procedury.size()+"\n");
        for(var p:procedury)
        {
            sb.append(p.toString());
        }
        sb.append("\nKONIEC TABLIC KOMPILATORA:\n");
        return sb.toString();
    }
    public static String listingProcedur()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPROCEDURY:"+procedury.size()+"\n");
        for(var p:procedury)
        {
            sb.append(p.toString());
        }
        return sb.toString();
    }
    public static String krotkilistingProcedur()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPROCEDURY:"+procedury.size()+"\n");
        for(var p:procedury)
        {
            sb.append(""+p.nr+", " +p.etykieta()+"\n");
        }
        return sb.toString();
    }
    public static String listingZakresow()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\nZAKRESY:"+zakresy.size()+"\n");
        for(var p:zakresy)
        {
            sb.append(p.toString());
        }
        return sb.toString();
    }
    public static String krotkilistingZakresow()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\nZAKRESY:"+zakresy.size()+"\n");
        for(var p:zakresy)
        {
            sb.append("zakr:"+p.nr+", proc:" +p.procedura.nr+"\n");
        }
        return sb.toString();
    }
    public static String wypiszSymbolWPrzestrzeni(String nazwa, Zakres z, boolean dluzej)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\nSYMBOL `"+nazwa+"`w zakresie"+z.nr+"\n");

        Symbol s = z.poNazwie(nazwa);

        if(s == null)
        {
            sb.append("\nNIE ZNALEZIONO W PRZESTRZENI NAZW ZACZEPIONEJ W ZAKRESIE "+z.nr);
            for (var w:zakresy) {
                s = w.poNazwie_bez_nadrzednych(nazwa);
                if(s != null)
                {
                    sb.append("\nZNALEZIONO W ZAKRESIE"+ w.nr);
                    if(dluzej){sb.append("  ").append(s.briefToString());}
                    //sb.append(wypiszSymbolWPrzestrzeni(nazwa,w));
                }
            }
        }
        else{
            if(dluzej){sb.append(s.toString());
                if(s.pktWe!=null){
                sb.append("\nPUNKT WEJSCIOWY:\n");
                    for(var p : s.pktWe.dajParametry())
                    {
                        sb.append(p.toString()+"\n");
                    }
                }
            }
            else{sb.append(s.briefToString());
                if(s.pktWe!=null){
                    sb.append("\nPUNKT WEJSCIOWY:\n");
                    for(var p : s.pktWe.dajParametry())
                    {
                        sb.append(p.briefToString()+"\n");
                    }
                }
            }
        }
        return sb.toString();
    }

    public static int dodajIfa()
    {
        return liczbaIfow++;
    }

    public static int dodajPetle()
    {
        return liczbaPetli++;
    }

}
