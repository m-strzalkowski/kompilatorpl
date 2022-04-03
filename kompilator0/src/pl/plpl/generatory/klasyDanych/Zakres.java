package pl.plpl.generatory.klasyDanych;

import java.util.List;

public class Zakres {
    static int licznik=0;
    public int nr;
    public Zakres nadrzedny;
    public Procedura procedura=null;
    public List<Symbol> symbole;

    public Zakres(Zakres nadrzedny, Procedura procedura) {
        nr = licznik++;
        this.nadrzedny = nadrzedny;
        this.procedura = procedura;
    }
}
