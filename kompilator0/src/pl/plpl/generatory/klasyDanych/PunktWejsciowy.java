package pl.plpl.generatory.klasyDanych;

import org.antlr.v4.runtime.misc.Pair;
import pl.plpl.generatory.Tablice;

import java.text.Normalizer;
import java.util.*;

public class PunktWejsciowy {
    public final String nazwa;
    private List<Symbol> parametry = new ArrayList<>();//lista symboli - parametrów
    public List<Symbol> dajParametry(){return this.parametry;}//setter - przypnijParametr
    private Map<Symbol, Integer> numeryArgPkt = new HashMap<>(); public Integer numerArgumentuPunktu(Symbol s){return numeryArgPkt.getOrDefault(s, null);}
    public Procedura procedura=null;//Z jaką procedurą jest powiązany punkt wejściowy. (określoną, lub nieokreśloną)
    Zakres zakres_prywatny = null;//Jeśli punkt wejściowy nie jest powiązany z procedurą (referencja do punktu), musi gdzieś przechowywać symbole swoich parametrów formalnych. (Bardziej z powodów formalno - teoretycznych - wszystkie symbole powinny być w zakresach)
    public int[] numery;//mapa zawierająca numer parametru procedury odpowiadający parametrowi wejścia

    public PunktWejsciowy(String nazwa, Procedura procedura) {
        this.nazwa = nazwa; this.procedura = procedura;
    }

    //public List<Pair<PelnyTyp, PelnyTyp>> ListaNazwaTyp;//do analizy id - typ
    //public List<Pair<PelnyTyp, Integer>> ListaArgument_przesuniecie;//do generacji
    public boolean nieokreślony(){return procedura.nieokreslona;}
    public String etykieta()
    {
        //Normalizer.normalize(pelnyTyp.typ.nazwa, Normalizer.Form.NFD)NFKD
        if(nazwa.equals(Tablice.WEJSCIE_PROG)){return Tablice.PODKRESLNIK+ "main";}
        return  Normalizer.normalize(nazwa, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

    //atrybut parametry jest prywatny, żeby nie dało się namieszać operując bezpośrednio na nim
    private Map<String, Symbol> parametryPoNazwie = new HashMap<>();
    public void przypnijParametr(Symbol p)
    {
        //System.err.println("\nPRZYPINANIE "+p.identyfikator);
        //paranoiczne sprawdzanie
        if(this.procedura != null)
        {
            if( this.procedura.najogolniejszy_zakres.poNazwie_bez_nadrzednych(p.identyfikator) != p)
            {
                throw new RuntimeException("Wewnętrzny błąd: Próba podpięcia pod punkt wejściowy "+etykieta()+" symbolu, z jakiegoś powodu nie znajduje się w zakresie procedury, w którym jest punkt wejściowy");
            }
        }
        //zwyczajne sprawdzanie
        if(p.pelnyTyp.parametr_formalny)
        {
            if( ! parametryPoNazwie.containsKey(p.identyfikator))//jeśli po raz pierwszy się dołącza:
            {
                //przypięcie
                parametryPoNazwie.put(p.identyfikator, p);
                parametry.add(p);
                numeryArgPkt.put(p, parametry.size()-1);
                System.out.println(parametry.size()-1+"$$$$$\n");
                //System.err.println("\nPRZYPIĘTO "+p.identyfikator+" do "+this.nazwa);
            }
        }
        else throw new RuntimeException("Wewnętrzny błąd: Próba podpięcia pod punkt wejściowy "+etykieta()+" symbolu, który nie jest parametrem formalnym (p.pelnyTyp.parametr_formalny == false)");
    }

    @Override
    public String toString() {
        return "PunktWejsciowy{" +
                "nazwa='" + nazwa + '\'' +
                ", parametry=" + parametry +
                ", procedura=" + procedura.nr +
                ", zakres_prywatny=" + zakres_prywatny +
                ", numery=" + Arrays.toString(numery) +
                '}';
    }
    public String toStringLonger()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\bPUNKT WEJŚCIOWY"+this.nazwa +"\n");
        sb.append("parametry:\n");
        for(var p : this.parametry)
        {
            sb.append(p.briefToString());
        }
        sb.append( "\nprocedura=" + procedura.nr).
            append( "\n zakres_prywatny=" + zakres_prywatny).
            append("nnumery=" + Arrays.toString(numery));
        return sb.toString();
    }
}
