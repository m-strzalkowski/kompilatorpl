package pl.plpl.generatory.klasyDanych;

import org.antlr.v4.runtime.misc.Pair;

import java.util.List;
import java.util.Map;

public class Typ {
    public String nazwa;
    public int dlugosc_B=4;
    public boolean atomiczny=false;
    public Map<String, Pair<Integer, Integer>> przesuniecia; //dla typów złozonych: nazwa -> przesuniecie, rozmiar obiektu;

    public Typ(String nazwa, int dlugosc_B, boolean atomiczny, Map<String, Pair<Integer, Integer>> przesuniecia) {
        this.nazwa = nazwa;
        this.dlugosc_B = dlugosc_B;
        this.atomiczny = atomiczny;
        this.przesuniecia = przesuniecia;
    }

    @Override
    public String toString() {
        return "Typ{" +
                "nazwa='" + nazwa + '\'' +
                ", dlugosc_B=" + dlugosc_B +
                ", atomiczny=" + atomiczny +
                ", przesuniecia=" + przesuniecia +
                '}';
    }
    public static final Typ Całk = new Typ("całk", 4, true, null);
    public static final Typ Rzeczyw = new Typ("rzeczyw", 4, true, null);
    public static final Typ Znak = new Typ("znak", 1, true, null);
    public static final Typ Ref = new Typ("ref", 4, true, null);
}
