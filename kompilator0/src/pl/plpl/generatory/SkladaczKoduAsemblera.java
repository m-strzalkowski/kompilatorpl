package pl.plpl.generatory;

import pl.plpl.generatory.klasyDanych.Procedura;
import java.io.Writer;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.io.*;

// NIE TESTOWANE!

public class SkladaczKoduAsemblera {

    private String nazwaPlikuAssemblera;
    private String nazwaPlikuZRozszerzeniem;
    private int system;

    public static int WIN32 = 1;
    public static int linux = 2;

    public SkladaczKoduAsemblera() {
        SkladaczKoduAsemblera("out");
    }

    public SkladaczKoduAsemblera(String nazwaPliku) {
        nazwaPlikuAssemblera = nazwaPliku;
        nazwaPlikuZRozszerzeniem = nazwaPlikuAssemblera + ".asm";
    }

    public SkladaczKoduAsemblera(int system) {
        this.system = system;
        SkladaczKoduAsemblera("out");
    }

    public SkladaczKoduAsemblera(String nazwaPliku, int sytem) {
        this.system = system;
        SkladaczKoduAsemblera(nazwaPliku);
    }

    public void stworzPlikWynikowy() {
        try {
            File kod = new File(nazwaPlikuZRozszerzeniem);
            if (!kod.exists()) {
                kod.createNewFile();
            }

        } catch (IOException e) {
            System.out.println("Wystapil blad podczas tworzenia pliku assemblera.");
            e.printStackTrace();
        }
    }

    private String generujAssembler() {
        StringBuilder gotowyKod = new StringBuilder();

        gotowyKod.append("global _main\nextern _printf\n\n");

        for (Procedura p : Tablice.procedury) {
            gotowyKod.append(p.zamienNaAssembler());
        }
        return gotowyKod.toString();
    }

    public void zapiszKodAssembleraDoPliku() {
        stworzPlikWynikowy();
        try (FileWriter fw = new FileWriter(new File(nazwaPlikuZRozszerzeniem), StandardCharsets.UTF_8);
             BufferedWriter writer = new BufferedWriter(fw)) {

            writer.append(generujAssembler());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void wydajKomendeCmd(String komenda)
    {
        ProcessBuilder builder = new ProcessBuilder(komenda);
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String linia;
        while (true) {
            linia = r.readLine();
            if (linia == null) { break; }
            System.out.println(linia);
        }
    }

    public void uruchom()
    {
        if(system == WIN32)
        {
            wydajKomendeCmd("nasm -fwin32 " + nazwaPlikuAssemblera);
            wydajKomendeCmd("gcc " + nazwaPlikuAssemblera + ".obj " + nazwaPlikuAssemblera);
            wydajKomendeCmd(nazwaPlikuAssemblera);
        }
    }
}
