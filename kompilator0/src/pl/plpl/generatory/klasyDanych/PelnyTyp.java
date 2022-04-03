package pl.plpl.generatory.klasyDanych;

public class PelnyTyp {
    Typ typ;
    enum Rodzaj{STATYCZNY, AUTOMATYCZNY};
    Rodzaj rodzaj = Rodzaj.AUTOMATYCZNY;
    int krotnosc_tablicowa=0;// całk - 0 całk[][] - 2
    int dlugosc_tablicy=-1;//-1 - nie wiadomo
}
