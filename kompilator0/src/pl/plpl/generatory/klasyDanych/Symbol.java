package pl.plpl.generatory.klasyDanych;

import org.antlr.v4.runtime.Token;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektAutomatyczny;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektPamieci;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektStatyczny;

import java.text.Normalizer;
import java.util.Map;

public class Symbol {

    static int licznik=0;
    int nr=0;
    public String identyfikator;//dla zmiennych/nazwanych stałych/punktów wejściowych
    public Token token;//dla stałych
    public PunktWejsciowy pktWe;//dla identyfikatorów punktów wejściowych
    public Zakres zakres;
    public PelnyTyp pelnyTyp;
    public ObiektPamieci obiektPamieci;
    public boolean udawana_referencja=false;//jeśli true, obiekt podczas generacji kodu powinien zwracać swój adres, gdy pytany o wartośc i błąd, jeśli pytany o adres (tak jakby był referencją do siebie, która rzeczywiście nie istnieje. Wykorzystywane przy dosłownych napisach, bo w kodzie istnieje tylko etykieta na początek danych, a nie ma osobnego obiektu referencji.)
    //^ normalnie, jesli jest np. całk [] a;, to istnieje jako referencja - słowo maszynowe, którego wartość jest adesem początku obszaru pamięci tablicy.
    //W przypadku "napisów", jest w sekcji statycznej generowany kod etykieta: db `napisów`.
    //Lecz [etykieta] to nie adres bloku, tylko wartość jego zerowego elementu. Trzeba zamiast tego zwracać etykieta, symulując niestniejący obiekt referencji, którego wartość byłaby równa etykieta. uf.
    //Implementacja mechanizmu powinna znajdowac się w visitorze reguły lwartosc.
    @Override
    public String toString() {
        return "Symbol{" +
                "nr=" + nr +
                ", identyfikator='" + identyfikator + '\'' +
                ", zakres=" + zakres.nr +
                ", " + pelnyTyp +
                ((pktWe == null)?("pktWe=null"):("\npktWe="+pktWe)) +
                '}';
    }
    public String briefToString()
    {
        return ""+identyfikator+","+etykieta()+","+token;
    }

    public Symbol(String identyfikator, Token pierwsze_wystąpienie, Zakres zakres, PelnyTyp pelnyTyp) {
        this.nr = licznik++;
        this.identyfikator = identyfikator;
        this.token = pierwsze_wystąpienie;
        this.zakres = zakres;
        this.pelnyTyp = pelnyTyp;
        this.obiektPamieci = (pelnyTyp.rodzaj_pamieci == PelnyTyp.RodzajPam.AUTOMATYCZNA)?(new ObiektAutomatyczny(this)):(new ObiektStatyczny(this));

    }
    public Symbol(Token token, Zakres zakres, PelnyTyp pelnyTyp) {
        this.nr = licznik++;
        this.token = token;
        this.identyfikator = null;
        this.zakres = zakres;
        this.pelnyTyp = pelnyTyp;
        this.obiektPamieci = (pelnyTyp.rodzaj_pamieci == PelnyTyp.RodzajPam.AUTOMATYCZNA)?(new ObiektAutomatyczny(this)):(new ObiektStatyczny(this));
    }
    public String etykieta()
    {
        //dla "prawdziwych" punktów wejsciowych
        if(pktWe != null && pktWe.procedura.nieokreslona == false){return pktWe.etykieta();}
        //Dla zmiennych automatycznych
        //Normalizer.normalize(pelnyTyp.typ.nazwa, Normalizer.Form.NFD)NFKD
        if(pelnyTyp.rodzaj_pamieci == PelnyTyp.RodzajPam.AUTOMATYCZNA){//dla składowych struktury nie działa
            if(this.zakres.procedura.getClass() == Procedura.class)
            {
                var obp = (ObiektAutomatyczny)obiektPamieci;
                String zn = (obp.offset<0)?(""):("+");
                return "ebp"+zn+obp.offset;
            }
            if(this.zakres.procedura.getClass() == Struktura.class)
            {
                var obp = (ObiektAutomatyczny)obiektPamieci;
                String zn = (obp.offset<0)?(""):("+");
                return "eax"+zn+obp.offset;
            }
        }
        //Dla zmiennych statycznych
        return "S"+Normalizer.normalize(pelnyTyp.typ.nazwa, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "")+"_"+zakres.nr+"_"+nr+"__"+this.zakres.procedura.etykieta();//identyfikatora tu być nie może, bo może zawierać znaki unicode
    }

}
