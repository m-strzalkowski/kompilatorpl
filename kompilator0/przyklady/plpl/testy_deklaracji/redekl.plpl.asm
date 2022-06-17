global _main
extern _printf
extern _pow

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `%d`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .data
Scak_0_2:   dd    0;t_globalne
section .data
Scak_2_3:   dd    0;t
section .text
;PROCEDURA Z LINII 8 - 18
;RAMKA STOSU (i parametry) PROCEDURYPf
;
;{ebp+12, 4B, sym:Symbol{nr=7, identyfikator='a', zakres=2, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=true, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+8, 4B, sym:Symbol{nr=4, identyfikator='b', zakres=2, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=true, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+4, 4B, sym:Symbol{nr=9, identyfikator='adres powrotny', zakres=2, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=10, identyfikator='poprzedni ebp', zakres=2, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=5, identyfikator='c', zakres=2, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:20
;rozmiar_B_zmiennych_automatycznych:4
;rozmiar_B_parametrow:8
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
              sub esp, 4
;^robienie ramki stosu
              call Pf_prolog
              ;tu coś może być
              after_f:
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
;wpisywanie wyrażenia do jakiegoś ID:13
                mov [ebp+8], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;punkt wejsciowy
              jmp after_g; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
g:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 4
;^robienie ramki stosu
              call Pf_prolog
              ;tu coś może być
              after_g:
;dodawanie/odejmowanie:15
;załadowanie lwartości:15
                mov edx, Scak_2_3
                mov eax, [edx]
;koniec ładowania lwartosc
                push eax
;załadowanie lwartości:15
                mov edx, Scak_0_2
                mov eax, [edx]
;koniec ładowania lwartosc
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:15
;wpisywanie wyrażenia do jakiegoś ID:15
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;instrukcja zwróć()
                call Pf_epilog
;dodawanie/odejmowanie:16
;mnożenie/dzielenie/modulo:16
;załadowanie lwartości:16
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                push eax
;załadowanie lwartości:16
                mov eax, [ebp+8]
;koniec ładowania lwartosc
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:16
                push eax
;mnożenie/dzielenie/modulo:16
;potęgowanie:16
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:16
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                pxor xmm0, xmm0
                pxor xmm1, xmm1
                sub esp, 8
                cvtsi2sd xmm0, eax
                cvtsi2sd xmm1, ebx
                call _pow
                add esp, 8
                cvttsd2si eax, xmm0
;koniec potęgowania:16
                push eax
;załadowanie lwartości:16
                mov eax, [ebp+12]
;koniec ładowania lwartosc
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:16
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:16
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Pf_epilog:
;coś tu może być(epilog)...
ret
section .text
;PROCEDURA Z LINII 19 - 19
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=12, identyfikator='adres powrotny', zakres=3, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=13, identyfikator='poprzedni ebp', zakres=3, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:8
;rozmiar_B_zmiennych_automatycznych:0
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
              sub esp, 0
;^robienie ramki stosu
              call P_main_prolog
              ;tu coś może być
              after__main:
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
