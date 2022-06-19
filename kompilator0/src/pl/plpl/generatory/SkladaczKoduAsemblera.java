package pl.plpl.generatory;


import pl.plpl.generatory.klasyDanych.Procedura;
import pl.plpl.generatory.klasyDanych.Typ;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.io.*;

// NIE TESTOWANE!

public class SkladaczKoduAsemblera {

    private String nazwaPlikuWe;
    private String nazwaPlikuWeObcięta;
    private String nazwaPlikuZRozszerzeniemAsm;
    private Tablice.Srodowisko system;


    public SkladaczKoduAsemblera() {
        this("out");
    }

    public SkladaczKoduAsemblera(String nazwaPliku) {
        nazwaPlikuWe = nazwaPliku;
        nazwaPlikuWeObcięta = nazwaPlikuWe.replaceAll("\\.plpl$", "");
        nazwaPlikuZRozszerzeniemAsm = nazwaPlikuWeObcięta + ".asm";
    }

    public SkladaczKoduAsemblera(Tablice.Srodowisko system) {
        this("out");
        this.system = system;
    }

    public SkladaczKoduAsemblera(String nazwaPliku, Tablice.Srodowisko system) {
        this(nazwaPliku);
        this.system = system;
    }

    private void stworzPlikWynikowy() {
        try {
            File kod = new File(nazwaPlikuZRozszerzeniemAsm);
            if (!kod.exists()) {
                kod.createNewFile();
            }

        } catch (IOException e) {
            System.err.println("Wystapil blad podczas tworzenia pliku assemblera.");
            e.printStackTrace();
        }
    }

    private StringBuilder generujAssembler() {
        StringBuilder gotowyKod = new StringBuilder();

        gotowyKod.append("global _main\nextern _printf\nextern _pow\nextern _malloc\nextern _free\nextern _exit\n\n");

        gotowyKod.append(";dodatki dla wypisz\n");
        gotowyKod.append("section .rodata\n");
        gotowyKod.append("WYPISZ_CALK_FMT:   db    `%d`, 0  ;\n");
        gotowyKod.append("WYPISZ_REF_FMT:   db    `%p`, 0  ;\n");
        gotowyKod.append("WYPISZ_NAPIS_FMT:   db    `%s`, 0  ;\n");//ograniczone do 99 znaków
        gotowyKod.append("WYPISZ_ZNAK_FMT:   db    `znak:%c\\n`, 0  ;\n");
        gotowyKod.append(";koniec dodatków\n");

        gotowyKod.append(Tablice.kod_globalny.zamienNaAssembler(true, true, true, true));
        for (Procedura p : Tablice.procedury) {
            gotowyKod.append(p.zamienNaAssembler(true, true, true, true));
        }
        //deklaracje statycznych składowych ze struktur
        for(Typ t : Tablice.typy)
        {
            if(t.struktura != null && t.atomiczny)
            {
                gotowyKod.append(t.struktura.zamienNaAssembler(true, true, false, true));
            }

        }
        gotowyKod.append("section .rodata\n");
        gotowyKod.append("__COMPILER_NAME__:  db`kompilator PL/PL (plplk) 1.0 Spero, aut opera...`\n");
        return gotowyKod;
    }

    public void zapiszKodAssembleraDoPliku() {
        stworzPlikWynikowy();
        try (FileWriter fw = new FileWriter(new File(nazwaPlikuZRozszerzeniemAsm), StandardCharsets.UTF_8);
             BufferedWriter writer = new BufferedWriter(fw)) {

            writer.append(generujAssembler());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void wydajKomendeCmd(String komenda) throws IOException {
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/C",komenda);
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
        if(system == Tablice.Srodowisko.WIN32)
        {
            try {
                //wydajKomendeCmd("nasm");
                wydajKomendeCmd("nasm -f win32 " + nazwaPlikuZRozszerzeniemAsm + " -o "+ nazwaPlikuWeObcięta +".obj");
                System.out.println("nasm -f win32 " + nazwaPlikuZRozszerzeniemAsm + " -o "+ nazwaPlikuWeObcięta +".obj");
                wydajKomendeCmd("gcc -o " + nazwaPlikuWeObcięta + ".exe " + nazwaPlikuWeObcięta +".obj");
                System.out.println("gcc -o " + nazwaPlikuWeObcięta + ".exe " + nazwaPlikuWeObcięta +".obj");
                //wydajKomendeCmd(nazwaPlikuAssemblera);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

