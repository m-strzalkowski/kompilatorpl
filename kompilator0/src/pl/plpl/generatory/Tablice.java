package pl.plpl.generatory;

import pl.plpl.generatory.klasyDanych.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class Tablice {
    public static String inputFilePath;
    public static String outputFilePath;

    static List<Typ> typy;
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
    }


    public static String wypisz() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTABLICE KOMPILATORA:\n");
        sb.append("\nTABLICA TYPÓW:\n");
        for (var t:typy)
        {
            sb.append(t.toString()+"\n");
        }
        return sb.toString();
    }
}
