package pl.plpl.generatory.semantyka;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import pl.plpl.bledy.SemanticOccurence;
import pl.plpl.generatory.Tablice;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static java.lang.Math.abs;
import static pl.plpl.generatory.semantyka.Propagacje.nigdzie;

/** Celem tej klasy jest zapewnienie pewnej uniformizacji zapisu reguł semantycznych, aby nie musiały byc one rozrzucone pod listenerach/visitorach, często w sposób nieczytlny i wymuszający kopiowanie kodu.
 * Ogólna idea troszeczkę sięga do gramatyk atrybutywnych: węzłowi drzewa składniowego możemy przypisywac atrybuty - dowolnego typu, tu T.
 * klasa Opcja jest właściwie opakowaniem na pojedyncze ParseTreeProperty<T>, posiadające odpowiedni geter i setter (ustaw/daj)
 * Jedyna różnica polega na tym, że ustaw nie tylko zazacza jeden węzeł, ale rozpoczyna proces propagacji atrybutu po drzewie.
 * Każdy nieterminal gramatyki ma w kontekście tego procesu propagacji związane zdarzenie semantyczne (Semantic Occurence), oraz kierunki propagacji do nastepnych wezłów (troche jak atrybuty syntezowane i dziedziczone)
 * Używając metod propagacjaNaWęzłach, zdarzenieNaWęzłach mozna w sposób quasi-deklaratywny, najlepiej w konstruktorze klasy potomnej, ustalić reguły semantyczne dla danego atrynutu, a w szczególności, zdarzenia o wysokich poziomoach błędu - powodujące zatrzymanie kompilacji
 * Co ważne, dostępne są metody sterujące dopełnieniem tych zbiorów:propagacjaNaInnychWęzłach, zdarzenieNaReszcieWęzłów, co powinno oszczędzić żmudnego pisania dla całej reszty mozliwych do zaznaczenia nieterminali.
 */
public class Opcja <T> {
    public Opcja()//Parser parser)
    {
        //ruleNames = parser.getRuleNames();
    }
    //String[] ruleNames=null;//nazwy nieterminali, do wypisywania
    ParseTreeProperty<T> prop = new ParseTreeProperty<T>();
    //Oznaczając określony typ kontekstu - stąd Class, powinniśmy albo nic nie zrobić, albo wygenerować SemanticOccurence.
    // Jednak nie można po prostu przechować gotowego obiektu zdarzenia, ponieważ zawiera ono numer linii, który powinien odpowiadać konkretnemu przypadkowi.
    //Trzeba przechować kod, który wygeneruje odpowiednie zdarzenie na podstawie kontekstu.
    Map<Class, Function<ParserRuleContext, SemanticOccurence>> kodPrzyRegule = new HashMap<Class, Function<ParserRuleContext, SemanticOccurence>>();
    Function<ParserRuleContext, SemanticOccurence> kodPrzyReszcieReguł = null;
    //w jakich kierunkach rozchodzi się atrybut z węzła danego typu
    Map<Class, Propagacje> kierunkiNaWęzłach = new HashMap<>();
    Propagacje kierunkiNaInnychWęzłach = nigdzie;
    private int maks_odwiedzin_na_propagację=256;
    Function<ParserRuleContext, SemanticOccurence> kodPrzyPrzekroczeniuLimituOdwiedzin = null;//domyślnie nie dzieje się nic, prócz wygaszenia propagacji
    private int maks_różnica_poziomów_na_propagację=256;
    Function<ParserRuleContext, SemanticOccurence> kodPrzyPrzekroczeniuMaksRóżnicyPoziomów= null;//domyślnie nie dzieje się nic, prócz wygaszenia propagacji

    private int licznik_odwiedzin_w_procesie_propagacji=0;
    private int poziom_startowy = 0;
    //MECHANIZM PROPAGACJI PO WĘZŁACH:
    //oznaczenie węzła powoduje wywołanie akcji - generacji zdarzenia
    //następnie następuje oznaczenie potomków/rodzica/sąsiadów wedle wartości w kierunkiNaWęzłach

    /** Sprawdza, czy do typu węzła przypisana jest lambda, jeśli tak, wykonuje ją (i podnosi zwrócone Semantic Occurence)
     * @param ctx węzeł
     * @return
     */
    void akcja(ParserRuleContext ctx)
    {

        //Class t = plplParser.PrzydomkiContext.class;
        Function<ParserRuleContext, SemanticOccurence> f = kodPrzyRegule.get(ctx.getClass());
        if(f != null)//jest przypisany jakiś kod do tego typu reguły gramatycznej
        {
            Tablice.podsystem_bledow.zglosZdarzenie(f.apply(ctx));
        }
        else{//nie ma wpisanego nic specjalnego dla danej reguły gramatycznej
            if(kodPrzyReszcieReguł != null)//ale jest akcja dla pozostałych
            {
                Tablice.podsystem_bledow.zglosZdarzenie(kodPrzyReszcieReguł.apply(ctx));
            }
            else{
                Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                        "sprawdź: "+ctx.getClass()+": nic się nie dzieje"));
            }

        }
        return;
    }

    /** Rekurencyjnie wywoływana procedura algorytmu propagacji.
     * Właściwa procedura główna, poprawnie zaczynająca i kończąca /proces propagacji/ to ustaw() (zeruje licznik odwiedzin i poziomów).
     * @param ctx
     */
    void odwiedź(ParserRuleContext ctx, T wartość)
    {
        //Zabezpieczenia przed głębkością rekurencji
        licznik_odwiedzin_w_procesie_propagacji++;
        if(licznik_odwiedzin_w_procesie_propagacji > maks_odwiedzin_na_propagację)
        //wykonaj przechowywany kod, jeśli nie jego adres to nie null
        {if(this.kodPrzyPrzekroczeniuLimituOdwiedzin != null)this.kodPrzyPrzekroczeniuLimituOdwiedzin.apply(ctx);}
        if(abs( ctx.depth() - poziom_startowy) >= maks_różnica_poziomów_na_propagację)
        {if(this.kodPrzyPrzekroczeniuMaksRóżnicyPoziomów != null)this.kodPrzyPrzekroczeniuMaksRóżnicyPoziomów.apply(ctx);}

        //1.wykonaj akcję
        //2.Zaznacz węzeł
        //3.Jesli możliwe: propagacja dla dango typu węzła/dla pozostałych węzłów:
        // - w dół
        // - w lewo
        // - w prawo
        // - w górę
        //1.wykonaj akcję
        akcja(ctx);
        //2.Zaznacz węzeł
        this.prop.put(ctx, wartość);
        //3.Jesli możliwe: propagacja:
        Propagacje p = kierunkiNaWęzłach.get(ctx.getClass());
        if(p == null){p = kierunkiNaInnychWęzłach;}
        //propagacja w dół
        if(p.dół)
        {
            if(ctx.children != null) {
                for (var child : ctx.children)
                {
                    if (child instanceof ParserRuleContext)
                    {
                        odwiedź((ParserRuleContext) child, wartość);//rekurencja
                    } else if (child instanceof TerminalNode)
                    {
                        //nic
                    } else {
                        throw new RuntimeException("Dziecko elementu drzewa" + ctx + "nie jest ani ParserRuleContext, ani TerminalNode, tylko " + child.getClass() + ",co nie zostało przewidziane.");
                    }
                }
            }
        }
        //propagacja w lewo
        if(p.lewo)
        {
            throw new RuntimeException("Chodzenia w bok jeszcze nie chciało się zaimplementować leniwemu programiście.");
        }
        //propagacja w prawo
        if(p.prawo)
        {
            throw new RuntimeException("Chodzenia w bok jeszcze nie chciało się zaimplementować leniwemu programiście.");
        }
        //propagacja w góre
        if(p.góra)
        {
            var parent =ctx.getParent();
            if(parent != null)
            {
                odwiedź(parent, wartość);
            }
        }
    }
//METODY USTALAJĄCE WŁASNOŚCI ATRYBUTU - JEGO PROPAGACJĘ I ZDARZENIA PRZY NIEJ WYSTĘPUJĄCE//


    /** Ustanawia regułę, czy zaznaczenie atrybutu na węźle danego typu, powinno powodować również oznaczenie jego dzieci/rodzica/rodzeństwa
     * W celu zastopowania propagacji należy użyć kierunku nigdzie/stop
     * @param kierunki reprezentacja kierunków propagacji. Dostępne stałe: w_dół/w_górę/na_boki/nigdzie
     * @param typyWęzłów tablica kontekstów, odpowiadająca typom węzłów ujętym w regule
     */
    protected void propagacjaNaWęzłach(Propagacje kierunki,  Class[] typyWęzłów)
    {
        for (var k: typyWęzłów) {
            kierunkiNaWęzłach.put(k, kierunki);
        }
    }

    /** Ustanawia regułę, czy zaznaczenie atrybutu na węźle typu nieujętego w innych regułach propagacji,
      * W celu zastopowania propagacji należy użyć kierunku nigdzie/stop.
      * @param kierunki reprezentacja kierunków propagacji. Dostępne stałe: w_dół/w_górę/na_boki/nigdzie
     */
    protected void propagacjaNaInnychWęzłach(Propagacje kierunki)
    {
      kierunkiNaInnychWęzłach = kierunki;
    }

    /** Ustawia, jakie zdarzenie semantyczne (Semantic Occurence) powinno się odpalić przy napotkaniu węzła danego typu. Null oznacza nieodpalenie niczego.
     * @param typyWęzłów tablica z typami węzłów
     * @param zdarzenieZKontekstu lambda/funkcja zwracająca  na podstawie kontekstu zdarzenie semantyczne z wpisanymi odpowiednimi liniami.
     */
    protected void zdarzenieNaWęzłach(Class[] typyWęzłów, Function<ParserRuleContext, SemanticOccurence> zdarzenieZKontekstu)
    {
        for (var k: typyWęzłów) {
            this.kodPrzyRegule.put(k, zdarzenieZKontekstu);
        }
    }
    protected void zdarzenieNaReszcieWęzłów(Function<ParserRuleContext, SemanticOccurence> zdarzenieZKontekstu)
    {
        this.kodPrzyReszcieReguł = zdarzenieZKontekstu;
    }

    /** Dopisana dla wygody metoda zwracająca lambdę odpowiednią dla zdarzenieNaWęzłach(..), z prostym stałym komunikatem. (Komunikaty bardziej skomplikowane wymagają napisania lambdy samemu)
     * @param poziom
     * @param tekst
     * @return
     */
    public static Function<ParserRuleContext, SemanticOccurence> generatorZdarzeńZPozycjąPoczątkaWęzła(SemanticOccurence.Level poziom, String tekst)
    {
       return  c -> {
            ParserRuleContext ctx = ((ParserRuleContext) c);
            return new SemanticOccurence(poziom, ctx.start, ctx.start.getLine(), ctx.start.getCharPositionInLine(), tekst);
        };
    }

//METODY DO ZAZNACZANIA ATRYBUTU NA PODDRZEWIE, ORAZ ODCZYTYWANIU NA WĘŹLE

    /** Ustawia atrybut o zadanej wartości, na poddrzewie o korzeniu w podanym przez kontekst węźle.
     * Następuje propagacja atrybutu po drzewie, zgodnie z zapisanymi w obiekcie Opcji regułami. Generowane są odpowiednie zdarzenia. (W tym być może błędy zatrzymujące kompilację)
      * @param ctx węzeł
     * @param wartość
     */
    public void ustaw(ParserRuleContext ctx, T wartość)
    {
        licznik_odwiedzin_w_procesie_propagacji = 0;
        poziom_startowy = ctx.depth();
        odwiedź(ctx, wartość);
        Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.DEBUG, ctx.start,ctx.start.getLine() ,ctx.start.getCharPositionInLine(),
                "Proces propagacji  z węzła nastąpi, odwiedzając"+licznik_odwiedzin_w_procesie_propagacji+"węzłów"));
        licznik_odwiedzin_w_procesie_propagacji = Integer.MAX_VALUE;
        poziom_startowy = 0;
    }

    public T daj(ParserRuleContext ctx)
    {
        return prop.get(ctx);
    }
}
