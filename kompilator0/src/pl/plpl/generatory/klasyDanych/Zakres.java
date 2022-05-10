package pl.plpl.generatory.klasyDanych;

import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zakres {
    static int licznik=0;
    public int nr;
    public Token startToken;
    public Zakres nadrzedny;
    public Procedura procedura=null;
    public List<Symbol> symbole=new ArrayList<>();
    public Map<String, Symbol> sym_po_nazwie = new HashMap<String,Symbol>();
    public Map<Token, Symbol> sym_po_tokenie = new HashMap<Token,Symbol>();
    public Zakres(Zakres nadrzedny, Procedura procedura, Token startToken) {
        nr = licznik++;
        this.nadrzedny = nadrzedny;
        this.procedura = procedura;
        this.procedura.zakresy.add(this);
        this.startToken = startToken;
    }


    public void dodajSymbol(Symbol s)
    {
        symbole.add(s);
        if(s.token != null){sym_po_tokenie.put(s.token, s);}
        if(s.identyfikator != null){sym_po_nazwie.put(s.identyfikator, s);}
    }

    //Znajduje symbol w PRZESTREZNI NAZW - czyli danym zakresie i nadrzędnych
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
    //Znajduje symbol tylko w danym zakresie, nie przeszukuje w nadrzędnych
    public Symbol poNazwie_bez_nadrzednych(String identyfikator)
    {
        return sym_po_nazwie.getOrDefault(identyfikator, null);
    }

    public Symbol poTokenie(Token token)
    {
        if(sym_po_tokenie.containsKey(token)){return sym_po_tokenie.get(token);}
        else{
            if(nadrzedny != null)
            {
                return nadrzedny.poTokenie(token);
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
    public String krotkoSymbole()
    {
        StringBuilder sb = new StringBuilder("\nSymbole w zakresie "+nr+"\nidentyfikator, etykieta, token");
        for(var s: symbole){sb.append("\n"+s.identyfikator+","+s.etykieta()+","+s.token);}
        //sb.append("\nPO NAZWIE:\n");
        //for(var s: sym_po_nazwie.values()){sb.append("\n"+s.briefToString());}
        //sb.append("\nPO TOKENIE:\n");
        //for(var s: sym_po_tokenie.values()){sb.append("\n"+s.briefToString());}
        return sb.toString();
    }
    public String krotkoPrzestrzen()
    {
        StringBuilder sb = new StringBuilder("\n\nSymbole w zakresie "+nr+"\nidentyfikator, etykieta, token");
        for(var s: symbole){sb.append("\n"+s.briefToString());}
        if(this.nadrzedny != null) sb.append(this.nadrzedny.krotkoPrzestrzen());
        return sb.toString();
    }

    //dajSymbol
}
