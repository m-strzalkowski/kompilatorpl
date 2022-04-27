package pl.plpl.generatory.klasyDanych;

import java.util.Objects;

public class PelnyTyp implements Cloneable{
    @Override
    public String toString() {
        return "PelnyTyp{" +
                "typ=" + ((typ==null)?("null"):(typ.toString())) +
                ", rodzaj_pamieci=" + rodzaj_pamieci.toString() +
                ", inicjalizowana=" + inicjalizowana +
                ", parametr_formalny=" + parametr_formalny +
                ", modyfikowalonosc=" + modyfikowalonosc.toString() +
                ", krotnosc_tablicowa=" + krotnosc_tablicowa +
                '}';
    }

    //nie wszystkie pola będą zawsze ustawione/przydatne
    public Typ typ;
    public enum RodzajPam{STATYCZNA, AUTOMATYCZNA};
    public RodzajPam rodzaj_pamieci = RodzajPam.AUTOMATYCZNA;
    public boolean inicjalizowana = false;
    public boolean parametr_formalny = false;
    public enum Mod{STALA, ZMIENNA};
    public Mod modyfikowalonosc = Mod.STALA;
    public int krotnosc_tablicowa=0;// całk - 0 całk[][] - 2
    public int dlugosc_tablicy=-1;//-1 - nie wiadomo
    public int rozmiar_B()
    {
        return (typ.atomiczny)?
                (
                        (krotnosc_tablicowa<0)?
                                (0)
                                :(typ.dlugosc_B)
                )
                :(Typ.Ref.dlugosc_B);
    }
    public boolean czyAtomiczny()
    {
        return this.typ.atomiczny && (this.krotnosc_tablicowa == 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PelnyTyp pelnyTyp = (PelnyTyp) o;
        return inicjalizowana == pelnyTyp.inicjalizowana && parametr_formalny == pelnyTyp.parametr_formalny && krotnosc_tablicowa == pelnyTyp.krotnosc_tablicowa && dlugosc_tablicy == pelnyTyp.dlugosc_tablicy && Objects.equals(typ, pelnyTyp.typ) && rodzaj_pamieci == pelnyTyp.rodzaj_pamieci && modyfikowalonosc == pelnyTyp.modyfikowalonosc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(typ, rodzaj_pamieci, inicjalizowana, parametr_formalny, modyfikowalonosc, krotnosc_tablicowa, dlugosc_tablicy);
    }

    @Override
    public PelnyTyp clone() {
        try {
            PelnyTyp clone = (PelnyTyp) super.clone();
            // : copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
