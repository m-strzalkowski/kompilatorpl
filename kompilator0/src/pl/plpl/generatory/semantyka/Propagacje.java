package pl.plpl.generatory.semantyka;

public class Propagacje {
    public Propagacje(boolean dół, boolean góra, boolean lewo, boolean prawo) {
        this.dół = dół;
        this.góra = góra;
        this.lewo = lewo;
        this.prawo = prawo;
    }

    public boolean dół;
    public boolean góra;
    public boolean lewo;
    public boolean prawo;

    public static Propagacje nigdzie = new Propagacje(false, false, false,false);
    public static Propagacje stop = nigdzie;//synonim
    public static Propagacje w_dół = new Propagacje(true, false, false,false);
    public static Propagacje w_górę = new Propagacje(false, true, false,false);
    public static Propagacje na_boki = new Propagacje(false, false, true,true);
}
