package pl.plpl.generatory;

import java.util.HashMap;
import java.util.Map;

public class Externator {
    private Map<String, Boolean> externy = new HashMap<>();
    public void użyj_extern(String id)
    {
        externy.put(id,true);
    }
    public String generuj_externy()
    {
        StringBuilder sb = new StringBuilder();
        for (var key:externy.keySet()) {
            sb.append("extern "+key+"\n");
        }
        return sb.toString();
    }
}