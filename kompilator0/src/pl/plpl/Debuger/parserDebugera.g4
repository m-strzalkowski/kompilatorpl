parser grammar parserDebugera;
options {tokenVocab=lekserDebugera;}
//import lekserDebugera;
znacznik: OTW? oznaczenia_przebiegow (SEPARATOR_ZNACZNIKOWY zbior_komend)? (ZMK|ZMKK)? EOF;
oznaczenia_przebiegow : (PRZEBIEG_TYPOWANIA | PRZEBIEG_ANALIZY_SEMANTYCZNEJ | PRZEBIEG_GENERACYJNY)*;
zbior_komend: komenda (NASTEPNA reszta)?;
reszta: ~(ZMK)* ;

komenda: nastepny_krok
       | nastepny_znacznik
       | komenda_ubicia_kompilatora
       | komenda_ubicia_debugera
       | listowanie
       | przechodzenie
;
/*krótkie komendy*/
nastepny_krok: SREDNIK;
nastepny_znacznik: PRZECINEK;
komenda_ubicia_kompilatora : ZGIN;
komenda_ubicia_debugera : DOKONCZ;
przechodzenie: CD (cd_do_proc | cd_do_zakresu);

/*komendy przechodzenia*/
cd_do_proc: PROC NUM;
cd_do_zakresu: ZAKR NUM;

listowanie: (ogolne_listowanie)|( LS (listing_procedur | listing_zakresow ))
            | (LS?
                    ( pisz_zakres
                    | pisz_procedure
                    | pisz_ramke_procedury
                    | pisz_statyczne_procedury
                    | pisz_symbole
                    | pisz_symbol
                    | pisz_sekcje
                    | pisz_nazwy_typow
                    | pisz_tokeny
                    | pisz_drzewo_skladniowe
                    | pisz_stan_maszyny_deklaracyjnej
                    | pisz_punkt_we
                    )
                );
/*lisotwanie*/
ogolne_listowanie: LS;
listing_procedur: PROC (MINUS_L)?;
listing_zakresow: ZAKR (MINUS_L)?;

/*wypisywanie*/
pisz_zakres : ZAKR NUM;
pisz_procedure: PROC (NUM|ID);
pisz_ramke_procedury: RAMKA (PROC)?;
pisz_statyczne_procedury: STATYCZNE (PROC)?;
pisz_sekcje: SEKCJA (BSS|DATA|RODATA|TEXT| GWIAZDKA);
pisz_nazwy_typow: TYPY;
pisz_tokeny: TOKENY;
pisz_drzewo_skladniowe: DRZEWO;
pisz_symbole: SYMBOLE (TU|TUIWYZEJ)?;
pisz_symbol: SYMBOL ID (MINUS_L)?;
pisz_punkt_we: PUNKT ID (MINUS_L)?;
pisz_stan_maszyny_deklaracyjnej : STAN_MASZYNY_DEKLARACYJNEJ;
