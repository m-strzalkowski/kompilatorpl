package pl.plpl.generatory;

import pl.plpl.bledy.Błędnik;
import pl.plpl.generatory.klasyDanych.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class Tablice {
    public static String inputFilePath;
    public static String outputFilePath;

    public static Błędnik podsystem_bledow = new Błędnik();

    public static List<Typ> typy;
    public static Zakres zakres_globalny;
    public static Procedura kod_globalny;
    public static List<Zakres> zakresy = new ArrayList<>();
    public static List<Procedura> procedury = new ArrayList<>();
    public static Typ typPoNazwie(String nazwa)
    {
        for (var t:typy) {if(t.nazwa.equals(nazwa))return t;} return null;
    }
    public static void inicjalizuj()
    {
        typy = new ArrayList<Typ>();
        typy.add(Typ.Całk);
        typy.add(Typ.Rzeczyw);
        typy.add(Typ.Znak);
        typy.add(Typ.Ref);

        kod_globalny = new Procedura();
        zakres_globalny = new Zakres(null, kod_globalny);
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
}
