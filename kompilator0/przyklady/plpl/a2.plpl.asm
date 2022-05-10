global _main
extern _printf
extern _pow

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `liczba:%d\n`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .bss
Scak_0_14:   resb    4;pole1
Sznak_0_15:   resb    1;pole2
section .text
;PROCEDURA Z LINII 2 - 16
;RAMKA STOSU (i parametry) PROCEDURYPproporcjonalna
;
;{ebp+16, 4B, sym:Symbol{nr=4, identyfikator='b', zakres=1, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=true, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+12, 4B, sym:Symbol{nr=3, identyfikator='x', zakres=1, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=true, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+8, 4B, sym:Symbol{nr=2, identyfikator='a', zakres=1, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=true, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+4, 4B, sym:Symbol{nr=6, identyfikator='adres powrotny', zakres=1, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=7, identyfikator='poprzedni ebp', zakres=1, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=0, identyfikator='w', zakres=1, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:24
;rozmiar_B_zmiennych_automatycznych:4
;rozmiar_B_parametrow:12
;koniec opisu procedury
Pproporcjonalna_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after_proporcjonalna; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
proporcjonalna:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 4
;^robienie ramki stosu
              call Pproporcjonalna_prolog
              ;tu coś może być
              after_proporcjonalna:
;punkt wejsciowy
              jmp after_liniowa; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
liniowa:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 4
;^robienie ramki stosu
              call Pproporcjonalna_prolog
              ;tu coś może być
              after_liniowa:
;dodawanie/odejmowanie:8
;załadowanie lwartości:8
                mov eax, [ebp+16]
;koniec ładowania lwartosc
                push eax
;mnożenie/dzielenie/modulo:8
;załadowanie lwartości:8
                mov eax, [ebp+12]
;koniec ładowania lwartosc
                push eax
;załadowanie lwartości:8
                mov eax, [ebp+8]
;koniec ładowania lwartosc
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:8
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:8
;wpisywanie wyrażenia do jakiegoś ID:8
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
CC:
;instrukcja zwróć()
                call Pproporcjonalna_epilog
;załadowanie lwartości:14
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Pproporcjonalna_epilog:
;coś tu może być(epilog)...
ret
section .text
;PROCEDURA Z LINII 18 - 32
;RAMKA STOSU (i parametry) PROCEDURYPnapisownik
;
;{ebp+4, 4B, sym:Symbol{nr=12, identyfikator='adres powrotny', zakres=3, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=13, identyfikator='poprzedni ebp', zakres=3, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=9, identyfikator='tab', zakres=3, PelnyTyp{typ=Typ{nazwa='rzeczyw', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=1}pktWe=null}}
;{ebp-8, 4B, sym:Symbol{nr=10, identyfikator='ta', zakres=3, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=1}pktWe=null}}
;{ebp-12, 4B, sym:Symbol{nr=11, identyfikator='tb', zakres=3, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=1}pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:20
;rozmiar_B_zmiennych_automatycznych:12
;rozmiar_B_parametrow:0
;koniec opisu procedury
Pnapisownik_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after_napisownik; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
napisownik:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 12
;^robienie ramki stosu
              call Pnapisownik_prolog
              ;tu coś może być
              after_napisownik:
;instrukcja zwróć()
                call Pnapisownik_epilog
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Pnapisownik_epilog:
;coś tu może być(epilog)...
ret
section .text
;PROCEDURA Z LINII 34 - 48
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=19, identyfikator='adres powrotny', zakres=4, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=20, identyfikator='poprzedni ebp', zakres=4, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=16, identyfikator='a', zakres=4, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-8, 4B, sym:Symbol{nr=17, identyfikator='a', zakres=5, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:16
;rozmiar_B_zmiennych_automatycznych:8
;rozmiar_B_parametrow:0
;koniec opisu procedury
P_main_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after__main; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
_main:
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 8
;^robienie ramki stosu
              call P_main_prolog
              ;tu coś może być
              after__main:
              push dword 0;dziura po parametrze b 
;parametr x 
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
;koniec obliczania parametru x 
              push eax; złożenie na stos parametru x
;parametr a 
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
;koniec obliczania parametru a 
              push eax; złożenie na stos parametru a
              call proporcjonalna.noargshuffle;wywołanie procedury
              add esp, 12;sprzątanie stosu po wywołaniu
;parametr b 
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
;koniec obliczania parametru b 
              push eax; złożenie na stos parametru b
;parametr x 
;stała całkowita
                mov eax,3
;koniec stałej całkowitej
;koniec obliczania parametru x 
              push eax; złożenie na stos parametru x
;parametr a 
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
;koniec obliczania parametru a 
              push eax; złożenie na stos parametru a
              call liniowa.noargshuffle;wywołanie procedury
              add esp, 12;sprzątanie stosu po wywołaniu
;instrukcja zwróć()
                call P_main_epilog
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
P_main_epilog:
;coś tu może być(epilog)...
ret
section .text
;PROCEDURA Z LINII 49 - 49
;RAMKA STOSU (i parametry) PROCEDURYPost
;
;{ebp+4, 4B, sym:Symbol{nr=22, identyfikator='adres powrotny', zakres=6, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=23, identyfikator='poprzedni ebp', zakres=6, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:8
;rozmiar_B_zmiennych_automatycznych:0
;rozmiar_B_parametrow:0
;koniec opisu procedury
Post_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after_ost; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
ost:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 0
;^robienie ramki stosu
              call Post_prolog
              ;tu coś może być
              after_ost:
;instrukcja zwróć()
                call Post_epilog
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Post_epilog:
;coś tu może być(epilog)...
ret
