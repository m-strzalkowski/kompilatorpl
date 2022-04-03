package pl.plpl.generatory.klasyDanych;

public class PelnyTyp {
    //nie wszystkie pola będą zawsze ustawione/przydatne
    Typ typ;
    public enum Rodzaj{STATYCZNY, AUTOMATYCZNY};
    public Rodzaj rodzaj = Rodzaj.AUTOMATYCZNY;
    public boolean inicjalizowana = false;
    public boolean parametr_formalny = false;
    public enum Mod{STALA, ZMIENNA};
    Mod modyfikowalonosc = Mod.STALA;
    int krotnosc_tablicowa=0;// całk - 0 całk[][] - 2
    int dlugosc_tablicy=-1;//-1 - nie wiadomo
}
