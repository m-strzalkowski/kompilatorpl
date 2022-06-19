package pl.plpl.generatory.klasyDanych;

import pl.plpl.bledy.SemanticOccurence;
import pl.plpl.generatory.Tablice;

import java.util.Objects;

public class PelnyTyp implements Cloneable{
    public static boolean reprezentacje_typów_w_języku_źródłowym = true;
    @Override  public String toString()
    {
        return (reprezentacje_typów_w_języku_źródłowym)?(toString_cannonical()):(toString_internal());
    }

    /** Kompletna reprezentacja javowego obiektu. (Więc nieczytelna dla postronnych)
     */
    public String toString_internal() {
        return "PelnyTyp{" +
                "typ=" + ((typ==null)?("null"):(typ.toString())) +
                ", rodzaj_pamieci=" + rodzaj_pamieci.toString() +
                ", inicjalizowana=" + inicjalizowana +
                ", parametr_formalny=" + parametr_formalny +
                ", modyfikowalonosc=" + modyfikowalonosc.toString() +
                ", krotnosc_tablicowa=" + krotnosc_tablicowa +
                '}';
    }

    /** Tekstowa reprezentacja typu zgodna z gramatyką języka źródłowego
     * pomija, czy zmienna jest zainicjalizowana
     */
    public String toString_cannonical() {
        var sb = new StringBuilder();
        if(this.parametr_formalny)
        {
            //sb.append("zacznij ?(..., ");
            sb.append("/*parametr*/ ");
        }
        if(this.modyfikowalonosc == Mod.STALA){sb.append("stały ");}
        if(this.modyfikowalonosc == Mod.ZMIENNA){sb.append("automatyczny ");}
        sb.append(this.typ.nazwa);
        sb.append(" ");
        for(int i=this.krotnosc_tablicowa; i>0; i--){sb.append("[]");}
        if(this.inicjalizowana){sb.append(" /*inicjalizowany*/ ");}
        if(this.parametr_formalny)
        {
            //sb.append(" ?,...)");
        }
        return sb.toString();
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
                                :(
                                        (krotnosc_tablicowa>0)?
                                                (Typ.Ref.dlugosc_B):(typ.dlugosc_B)
                                 )
                )
                :(Typ.Ref.dlugosc_B);
    }

    /**
     * @return Zwraca rozmiar obiektu na który wskazuje referencja, albo 0 gdy atomiczny
     * Przydatne do malloca
     */
    public int rozmiar_B_wskazywanego()
    {
        if(czyAtomiczny()){return 0;}
        else{
            if(krotnosc_tablicowa == 1)
            {
                return this.typ.struktura.rozmiar_B_calej_pamieci_lokalnej();
            }
            else{return rozmiar_B();}
        }
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
    //równość - oprócz bycia parametrem
    public boolean equalsOpróczByciaParametrem(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PelnyTyp pelnyTyp = (PelnyTyp) o;
        return inicjalizowana == pelnyTyp.inicjalizowana  && krotnosc_tablicowa == pelnyTyp.krotnosc_tablicowa && dlugosc_tablicy == pelnyTyp.dlugosc_tablicy && Objects.equals(typ, pelnyTyp.typ) && rodzaj_pamieci == pelnyTyp.rodzaj_pamieci && modyfikowalonosc == pelnyTyp.modyfikowalonosc;
    }
    //równość w sensie zgodności funkcjonalnej - daje się przypisać (Oprócz stałości, którą operator przypisania powinien sprawdzić sam, po odpowiedniej stronie)
    public boolean equalsFunctionally(Object o) {
        PelnyTyp pelnyTyp;
        if (this == o) return true;
        if(o!=null &&o.getClass() == Typ.class)
        {
            pelnyTyp = new PelnyTyp(); pelnyTyp.typ=(Typ)o;
        }
        else {if (o == null || getClass() != o.getClass()){return false;}
        pelnyTyp = (PelnyTyp) o;
        }
        return  krotnosc_tablicowa == pelnyTyp.krotnosc_tablicowa && dlugosc_tablicy == pelnyTyp.dlugosc_tablicy && Objects.equals(typ, pelnyTyp.typ);
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
    public static PelnyTyp dereferencja(PelnyTyp t)
    {
        var d = t.clone();
        if(d.krotnosc_tablicowa < 1)
        {
            return null;
        }
        d.krotnosc_tablicowa--;
        return d;
    }
}
