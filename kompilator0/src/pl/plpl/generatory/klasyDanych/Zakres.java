package pl.plpl.generatory.klasyDanych;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zakres {
    static int licznik=0;
    public int nr;
    public Zakres nadrzedny;
    public Procedura procedura=null;
    public List<Symbol> symbole=new ArrayList<>();
    public Map<String, Symbol> sym_po_nazwie = new HashMap<String,Symbol>();
    public Zakres(Zakres nadrzedny, Procedura procedura) {
        nr = licznik++;
        this.nadrzedny = nadrzedny;
        this.procedura = procedura;
    }

    public void dodajSymbol(Symbol s)
    {
        symbole.add(s);
        sym_po_nazwie.put(s.identyfikator, s);
    }

    public Symbol poNazwie(String identyfikator)
    {
        if(sym_po_nazwie.containsKey(identyfikator)){return sym_po_nazwie.get(identyfikator);}
        else{
            if(nadrzedny != null)
            {
                return nadrzedny.poNazwie(identyfikator);
            }
            else{return null;}
        }
    }

    @Override
    public String toString() {
        return "Zakres{" +
                "\nnr=" + nr +
                "\n, nadrzedny=" + ((nadrzedny == null)?(null):(nadrzedny.nr)) +
                "\n, procedura=" + procedura.nr +
                "\n, symbole=" + symbole.toString() +
                "\nKoniec zakresu}";
    }

    //dajSymbol
}
