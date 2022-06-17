package pl.plpl.generatory.klasyDanych.tablice;

import org.antlr.v4.runtime.Token;
import pl.plpl.bledy.SemanticOccurence;
import pl.plpl.generatory.Tablice;
import pl.plpl.generatory.klasyDanych.PelnyTyp;
import pl.plpl.generatory.klasyDanych.Symbol;
import pl.plpl.generatory.klasyDanych.Typ;

import static pl.plpl.generatory.klasyDanych.Typ.Ref;
import static pl.plpl.generatory.klasyDanych.Typ.akumulator;
///////////////////////////////////////////////////////////////////////
//Ta klasa powinna sie przydać, przy wprowadzeniu różnych rodzajów tablic (zwłaszcza takich o znanym rozmiarze) Teraz jest bezużyteczna. Nie używać.
/////////////////////////////////////////////////////////////////////////
public class TablicaC extends Tablica{
    public TablicaC(Token startToken, Typ TypZlozony) {
        super(startToken, TypZlozony);
    }

    public static boolean indeksowalny(Symbol s)
    {
        return s.pelnyTyp.krotnosc_tablicowa > 0;
    }
    public static int dlugosc_nagłówka_B(){return 0;}
    public static int log2(int N)
    {
        return  (int)(Math.log(N) / Math.log(2));
    }

    /**
     * @param sym Symbol tablicy
     * @param miejsce miejsce w kodzie, gdzie zapisano indeksowanie
     * @param rejestr_z_indeksem rejestr, w jakim umieszczono indeks (np. ecx)
     * @param rejestr_źródłowy rejestr, w którym umieszczono adres tablicy
     * @param dereferencja_na_końcu czy kod ma zwracać wartość obiektu=true, czy adres=false
     * @return zwraca kod, pozostawiający w akumulatorze odpowiedniej długości wartośc/adres elementu tablicy.
     */
    /*
    public static String kodIndeksowania_statyczny(PelnyTyp sym, Token miejsce, String rejestr_z_indeksem, String rejestr_źródłowy, boolean dereferencja_na_końcu)
    {
        if(!indeksowalny(sym)){
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, miejsce,miejsce.getLine() ,miejsce.getCharPositionInLine(),
                    "Próba indeksowania (pozycja:"+rejestr_z_indeksem+") obiektu "+sym +" ,który indeksowalny nie jest."));
        }
        //StringBuilder sb = new StringBuilder();
        int nagl = dlugosc_nagłówka_B();
        //@ASM - indeksowanie
        //if(nagl>0)sb.append("     add "+rejestr_źródłowy+", "+nagl);
        //sb.append("     sal "+rejestr_z_indeksem+", "+log2(sym.pelnyTyp.rozmiar_B()));
        //sb.append("     add "+rejestr_źródłowy+", "+rejestr_z_indeksem);
        //if(dereferencja_na_końcu)sb.append("     mov "+rejestr_wynikowy+", ["+rejestr_źródłowy+"]");
        String akum;
        int rozm_elem;
        if((sym.pelnyTyp.typ.atomiczny && sym.pelnyTyp.krotnosc_tablicowa > 1))
        {
            //w tym wypadku zwracany obiekt będzie zawsze referencją
            rozm_elem = Ref.dlugosc_B;
        }
        else{
            rozm_elem = sym.pelnyTyp.rozmiar_B();
        }
        akum = akumulator(rozm_elem);
        String opkod = (dereferencja_na_końcu)?("mov"):("lea");
        return "        "+opkod + " "+ akum + ", ["+rejestr_źródłowy+"+"+rejestr_z_indeksem+"*"+rozm_elem+"+"+nagl+"]";
    }
    */

    public static String kodIndeksowania_statyczny(Symbol sym, Token miejsce, String rejestr_z_indeksem, String rejestr_źródłowy, boolean dereferencja_na_końcu)
    {/*
        if(!indeksowalny(sym)){
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, miejsce,miejsce.getLine() ,miejsce.getCharPositionInLine(),
                    "Próba indeksowania (pozycja:"+rejestr_z_indeksem+") obiektu "+sym +" ,który indeksowalny nie jest."));
        }
        //StringBuilder sb = new StringBuilder();
        int nagl = dlugosc_nagłówka_B();
        //@ASM - indeksowanie
        //if(nagl>0)sb.append("     add "+rejestr_źródłowy+", "+nagl);
        //sb.append("     sal "+rejestr_z_indeksem+", "+log2(sym.pelnyTyp.rozmiar_B()));
        //sb.append("     add "+rejestr_źródłowy+", "+rejestr_z_indeksem);
        //if(dereferencja_na_końcu)sb.append("     mov "+rejestr_wynikowy+", ["+rejestr_źródłowy+"]");
        String akum;
        int rozm_elem;
        if((sym.pelnyTyp.typ.atomiczny && sym.pelnyTyp.krotnosc_tablicowa > 1))
        {
            //w tym wypadku zwracany obiekt będzie zawsze referencją
            rozm_elem = Ref.dlugosc_B;
        }
        else{
            rozm_elem = sym.pelnyTyp.rozmiar_B();
        }
        akum = akumulator(rozm_elem);
        String opkod = (dereferencja_na_końcu)?("mov"):("lea");
        return "        "+opkod + " "+ akum + ", ["+rejestr_źródłowy+"+"+rejestr_z_indeksem+"*"+rozm_elem+"+"+nagl+"]";
        */
        return "";
    }

    public  String kodIndeksowania(Symbol sym, Token miejsce, String rejestr_z_indeksem, String rejestr_źródłowy,  boolean dereferencja_na_końcu) {return kodIndeksowania_statyczny(sym, miejsce, rejestr_z_indeksem, rejestr_źródłowy,dereferencja_na_końcu);}//wie, że to całe jest bez sensu ale juz mi sie nie chce poprawnie dodawac tablic do Pelnego typ i wiazać tego wszystkiego....
}
