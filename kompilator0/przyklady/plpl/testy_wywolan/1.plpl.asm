global _main
extern _printf
extern _pow

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `liczba:%d\n`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .text
;PROCEDURA Z LINII 1 - 5
;RAMKA STOSU (i parametry) PROCEDURYPf
;
;{ebp+4, 4B, sym:Symbol{nr=1, identyfikator='adres powrotny', zakres=1, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=2, identyfikator='poprzedni ebp', zakres=1, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:8
;rozmiar_B_zmiennych_automatycznych:0
;rozmiar_B_parametrow:0
;koniec opisu procedury
Pf_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after_f; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
f:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 0
;^robienie ramki stosu
              call Pf_prolog
              ;tu coś może być
              after_f:
;instrukcja zwróć()
                call Pf_epilog
;dodawanie/odejmowanie:4
;stała całkowita
                mov eax,5
;koniec stałej całkowitej
                push eax
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:4
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Pf_epilog:
;coś tu może być(epilog)...
ret
section .data
Sznak_3_9:   db    `Jestem wewnątrz funkcji i wewnątrz jakiś bezsensownych wąsów2\n!`, 0  ;z linii 14
section .text
;PROCEDURA Z LINII 6 - 17
;RAMKA STOSU (i parametry) PROCEDURYPproporcjonalna
;
;{ebp+16, 4B, sym:Symbol{nr=7, identyfikator='b', zakres=2, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=true, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+12, 4B, sym:Symbol{nr=6, identyfikator='x', zakres=2, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=true, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+8, 4B, sym:Symbol{nr=5, identyfikator='a', zakres=2, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=true, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+4, 4B, sym:Symbol{nr=10, identyfikator='adres powrotny', zakres=2, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=11, identyfikator='poprzedni ebp', zakres=2, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=3, identyfikator='w', zakres=2, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
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
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
;wpisywanie wyrażenia do jakiegoś ID:10
                mov [ebp+16], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
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
;dodawanie/odejmowanie:12
;załadowanie lwartości:12
                mov eax, [ebp+16]
;koniec ładowania lwartosc
                push eax
;mnożenie/dzielenie/modulo:12
;załadowanie lwartości:12
                mov eax, [ebp+12]
;koniec ładowania lwartosc
                push eax
;załadowanie lwartości:12
                mov eax, [ebp+8]
;koniec ładowania lwartosc
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:12
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:12
;wpisywanie wyrażenia do jakiegoś ID:12
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;wypisanie
                push dword Sznak_3_9
                call _printf
                add esp, byte 4
;koniec wypisania
;instrukcja zwróć()
                call Pproporcjonalna_epilog
;załadowanie lwartości:15
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
;PROCEDURA Z LINII 18 - 24
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=16, identyfikator='adres powrotny', zakres=4, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=17, identyfikator='poprzedni ebp', zakres=4, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=13, identyfikator='w', zakres=4, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-8, 4B, sym:Symbol{nr=14, identyfikator='z', zakres=4, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-12, 4B, sym:Symbol{nr=15, identyfikator='y', zakres=4, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:20
;rozmiar_B_zmiennych_automatycznych:12
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
              sub esp, 12
;^robienie ramki stosu
              call P_main_prolog
              ;tu coś może być
              after__main:
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
;wpisywanie wyrażenia do jakiegoś ID:20
                mov [ebp-8], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
;wpisywanie wyrażenia do jakiegoś ID:20
                mov [ebp-12], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;parametr b 
;załadowanie lwartości:22
                mov eax, [ebp-12]
;koniec ładowania lwartosc
;koniec obliczania parametru b 
              push eax; złożenie na stos parametru b
;parametr x 
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
;koniec obliczania parametru x 
              push eax; złożenie na stos parametru x
;parametr a 
;załadowanie lwartości:22
                mov eax, [ebp-8]
;koniec ładowania lwartosc
;koniec obliczania parametru a 
              push eax; złożenie na stos parametru a
              call liniowa.noargshuffle;wywołanie procedury
              add esp, 12;sprzątanie stosu po wywołaniu
;wpisywanie wyrażenia do jakiegoś ID:22
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;wypisanie całk
                sub esp, 4
                mov dword eax, [ebp-4]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania
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
