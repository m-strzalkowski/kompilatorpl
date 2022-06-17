package pl.plpl.generatory.klasyDanych;

import org.antlr.v4.runtime.Token;
import pl.plpl.bledy.SemanticOccurence;
import pl.plpl.generatory.Tablice;
import pl.plpl.generatory.klasyDanych.pamiec.ObiektAutomatyczny;

import static pl.plpl.generatory.klasyDanych.Typ.DLUGOSC_SLOWA_B;

public class Struktura extends Procedura{
    Typ typ_zlozony = null;//jakiego typu jest to wewnętrzna strukura
    public Struktura(Token startToken, Typ TypZlozony) {
        super(startToken);typ_zlozony=TypZlozony;
    }

    public int rozmiar_B_calej_pamieci_lokalnej(){return rozmiar_B_parametrow() + rozmiar_B_zmiennych_automatycznych();}
    public int rozmiar_B_zmiennych_automatycznych(){return ramka_stosu.getLast().offset + ramka_stosu.getLast().rozmiar_B;}
    public int rozmiar_B_parametrow(){return 0;}
    public int rozmiar_B_nagłówka(){return 0;}
    public int rozmiar_B_skladowych(){return rozmiar_B_calej_pamieci_lokalnej() - rozmiar_B_nagłówka();}
    @Override
    public String etykieta()
    {
        //Normalizer.normalize(pelnyTyp.typ.nazwa, Normalizer.Form.NFD)NFKD
        //if(poczatkowa) {return }
        return "T"+ typ_zlozony.nazwa;
    }

    /**
     * @return typ1 nazwa1\n typ2 nazwa2\n ...
     */
    public String czytelnaListaSkładowych()
    {
        var sb = new StringBuilder();
        Symbol s;
        for (var d:this.ramka_stosu) {
            s = d.powiązanySymbol();
            sb.append(s.pelnyTyp.toString_cannonical());
            sb.append(" ");
            sb.append(s.identyfikator);
            sb.append("\n");
        }
        return sb.toString();
    }

    public String kodIndeksowania(String nazwa_skladowej, Token miejsce, String rejestr_z_indeksem, String rejestr_źródłowy, String rejestr_wynikowy, boolean dereferencja_na_końcu)
    {
        Symbol s = this.najogolniejszy_zakres.poNazwie(nazwa_skladowej);//dodać jeszcze zawsze token - pozwoli spraedzać użycie przed deklaracją i pisać gdzie dokładnie ie znaleziono nazwy
        if(s==null)
            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, miejsce,miejsce.getLine() ,miejsce.getCharPositionInLine(),
                    "Obiekt typu"+this.typ_zlozony.nazwa+"nie ma składowej o nazwie" +nazwa_skladowej));

        StringBuilder sb = new StringBuilder();
        if(s.pelnyTyp.rodzaj_pamieci == PelnyTyp.RodzajPam.AUTOMATYCZNA)
        {
            //@ASM - dostęp do składowej automatycznej
            sb.append("     add "+rejestr_źródłowy+", "+((ObiektAutomatyczny)s.obiektPamieci).offset);
            if(dereferencja_na_końcu)sb.append("     mov "+rejestr_wynikowy+", ["+rejestr_źródłowy+"]");
        }
        else{//statyczna składowa
            if(dereferencja_na_końcu)sb.append("     mov "+rejestr_wynikowy+", ["+s.etykieta()+"]");
        }
        return sb.toString();
    }

    @Override
    public void przeliczStruktury() {
        System.out.println("PRZELICZANIE STRUKTUR PROCEDURY"+nr);
        ramka_stosu.clear();
        pelnaListaArgumentow.clear();

        int offset_w_dół=0, offset_w_górę=0;
        PelnyTyp czystaRef = new PelnyTyp();
        czystaRef.typ = Typ.Ref;
        czystaRef.rodzaj_pamieci = PelnyTyp.RodzajPam.AUTOMATYCZNA;
        czystaRef.parametr_formalny = false;
        //Symbol pwt = new Symbol("adres powrotny", null,  najogolniejszy_zakres, czystaRef);
        //Symbol ebp = new Symbol("poprzedni ebp", null,  najogolniejszy_zakres, czystaRef);
        //ramka_stosu.add((ObiektAutomatyczny)pwt.obiektPamieci); offset_w_górę = 1* DLUGOSC_SLOWA_B;  ((ObiektAutomatyczny) pwt.obiektPamieci).offset = offset_w_górę; offset_w_górę +=  ((ObiektAutomatyczny) pwt.obiektPamieci).rozmiar_B;
        //ramka_stosu.add((ObiektAutomatyczny)ebp.obiektPamieci); offset_w_dół = 0; ((ObiektAutomatyczny) ebp.obiektPamieci).offset = offset_w_dół; offset_w_dół -=  ((ObiektAutomatyczny) ebp.obiektPamieci).rozmiar_B;

        Zakres zakres = najogolniejszy_zakres;//for (Zakres zakres : zakresy)
        {
            for(Symbol s: zakres.symbole)//dla wszystkich symboli w zakresach procedury...
            {
                System.out.println(s);
                if(s.pelnyTyp.rodzaj_pamieci == PelnyTyp.RodzajPam.AUTOMATYCZNA)//...które są automatyczne
                {
                    ObiektAutomatyczny obp = (ObiektAutomatyczny) s.obiektPamieci;
                    if(s.pelnyTyp.parametr_formalny)//ebp+x
                    {
                        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, this.najogolniejszy_zakres.startToken,this.najogolniejszy_zakres.startToken.getLine() ,this.najogolniejszy_zakres.startToken.getCharPositionInLine(),
                                "Przeliczanie struktury typu złożonego: w zakresie procedury znajduje się symbol"+s+" będący parametrem formalnym. Interpretacja takiego stanu rzeczy jest niemożliwa."));
                        /*obp.offset = offset_w_górę;
                        offset_w_górę += obp.rozmiar_B;
                        ramka_stosu.addFirst(obp);
                        pelnaListaArgumentow.add(s);
                        numeryArgProc.put(s, pelnaListaArgumentow.size()-1);*/
                    }
                    else//zmienne lokalne: ebp-x
                    {
                        obp.offset = offset_w_górę;
                        offset_w_górę += obp.rozmiar_B;
                        ramka_stosu.addLast(obp);
                        //System.err.println(obp);
                    }
                }
            }
        }
        //Collections.reverse(pelnaListaArgumentow);
        System.out.println("KONIEC PRZELICZANIA STRUKTUR TYPU ZŁOŻONEGO"+nr);
    }
}
