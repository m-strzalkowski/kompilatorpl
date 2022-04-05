package pl.plpl.generatory.klasyDanych;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;
import pl.plpl.bledy.SemanticOccurence;
import pl.plpl.generatory.Tablice;
import pl.plpl.parser.plplParser;

import java.util.List;
import java.util.Map;

public class Typ {
    public String nazwa;
    public int dlugosc_B=4;
    public boolean atomiczny=false;
    public Map<PelnyTyp, Pair<Integer, Integer>> przesuniecia; //dla typów złozonych: nazwa -> przesuniecie, rozmiar obiektu;

    public Typ(String nazwa, int dlugosc_B, boolean atomiczny, Map<PelnyTyp, Pair<Integer, Integer>> przesuniecia) {
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
    public static final Typ Pkt = new Typ("pkt", 4, true, null);//punkt wejściowy
    public static Typ zTokena(Token token)
    {
        switch (token.getType())
        {
            case plplParser.TCALK: return Całk;
            case plplParser.TRZECZYW: return Rzeczyw;
            case plplParser.TZNAK: return Znak;
            case plplParser.TREF: return Ref;
            default: Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(
                    SemanticOccurence.Level.FATAL,
                    token,token.getLine() ,token.getStartIndex(),
                    "Token"+token.getText()+"nie jest typem podstawowym (prawdopodobnie błąd wewnętrzny kompilatora)"
            )); return Ref;
        }

    }
}
