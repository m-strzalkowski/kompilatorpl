package pl.plpl.generatory.klasyDanych.pamiec;

import pl.plpl.bledy.SemanticOccurence;
import pl.plpl.generatory.Tablice;
import pl.plpl.generatory.klasyDanych.*;
/**
 * Celem tej klasy i dwóch potomnych jest przechowywanie informacji o rzeczywistych strukturach pamięci, które należy oddzielić od abstrakcyjnych zakresów i nazw
 * Jako, że skonstruowanie obiektów klas potomnych odbywa się na podstawie symbolu, sam konstruktor dodaje obiekt do odpowiedniej procedury.
 * Jest zazwyczaj powiązany z konkretnym symbolem, konstruktor symbolu tworzy też obiekt pamięci.
 */
public abstract class ObiektPamieci {
    Symbol symbol;
    //Procedura procedura;
    public int rozmiar_B;//konstruktory z symboli klas potomnych dbają o wypełnienie
    public void sprawdzUnikalnosc(Symbol s)
    {
        if(symbol.zakres.procedura.zmapowane_w_pamiec_symbole.containsKey(s))
        {

            Tablice.podsystem_bledow.zglosZdarzenie(new SemanticOccurence(SemanticOccurence.Level.FATAL, s,0 ,0,
                    "Próba powtórnego zmapowania w struktury pamięci procedury tego samego symbolu (raczej wewnętrzny błąd kompilatora)"
            ));
        }
    }

}
