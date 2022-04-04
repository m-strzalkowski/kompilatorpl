package pl.plpl.bledy;

import java.util.ArrayList;
import java.util.List;

/*
Jak sama nazwa wskazuje, ta klasa zajmuje się obsługa błędów. (podczas analizy semantycznej, generacji i dalszych etapów)
Należy do niego zgłaszać zdarzenia (SemanticOccurence), co może spowodować zakończenie kompilacji
 */
public class Błędnik {
    List<SemanticOccurence> zdarzenia = new ArrayList<>();
    SemanticOccurence.Level stop_at_severity = SemanticOccurence.Level.FATAL;//kiedy ma zatrzymać kompilator
    public List<SemanticOccurence> getZdarzenia() {
        return zdarzenia;
    }

    public void zglosZdarzenie(SemanticOccurence z)
    {
        System.err.println(z.toString());
        zdarzenia.add(z);
        if(z.getSeverity().worseOrEqual(stop_at_severity))
        {
            System.err.println("CO ZNACZY, ŻE NAPOTKANO BŁĄD O WADZE ZBYT DUŻEJ, BY KONTYNUOWAĆ KOMPILACJĘ");
            System.exit(1);
        }
    }
    public void setStop_at_severity(SemanticOccurence.Level stop_at_severity) {
        this.stop_at_severity = stop_at_severity;
    }
}
