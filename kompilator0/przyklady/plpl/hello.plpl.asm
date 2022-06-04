global _main
extern _printf
extern _pow

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `%d`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .data
Sznak_2_1:   db    `JESTEM W JEŚLI\n`, 0  ;z linii 4
Sznak_3_3:   db    `JESTEM W DOPÓKI\n`, 0  ;z linii 9
Sznak_4_4:   db    `ALE TO JESZCZE DALEKO...\n`, 0  ;z linii 11
section .text
;PROCEDURA Z LINII 1 - 17
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=5, identyfikator='adres powrotny', zakres=1, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=6, identyfikator='poprzedni ebp', zakres=1, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=2, identyfikator='a', zakres=1, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:12
;rozmiar_B_zmiennych_automatycznych:4
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
              sub esp, 4
;^robienie ramki stosu
              call P_main_prolog
              ;tu coś może być
              after__main:

;instrukcja warunkowa w liniach:4-4
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
cmp eax, 0
je failed_condition_0
;wypisanie
                push dword Sznak_2_1
                call _printf
                add esp, byte 4
;koniec wypisania

failed_condition_0:
; koniec instrukcji warunkowej
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
;wpisywanie wyrażenia do jakiegoś ID:6
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;instrukcja dopoki
start_loop_0:
;porównanie:7
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:7
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setle al
;koniec porównania:7
cmp eax, 0
je end_loop_0
;wypisanie
                push dword Sznak_3_3
                call _printf
                add esp, byte 4
;koniec wypisania
;wypisanie całk
                sub esp, 4
                mov dword eax, [ebp-4]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania

;instrukcja warunkowa w liniach:11-11
;porównanie:11
;stała całkowita
                mov eax,3
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:11
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:11
cmp eax, 0
je failed_condition_1
;wypisanie
                push dword Sznak_4_4
                call _printf
                add esp, byte 4
;koniec wypisania

failed_condition_1:
; koniec instrukcji warunkowej
;dodawanie/odejmowanie:12
;parametr a 
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
;koniec obliczania parametru a 
              push eax; złożenie na stos parametru a
              call p.noargshuffle;wywołanie procedury
              add esp, 4;sprzątanie stosu po wywołaniu
                push eax
;załadowanie lwartości:12
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:12
;wpisywanie wyrażenia do jakiegoś ID:12
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
                jmp start_loop_0;powrot do poczatku petli

jmp start_loop_0
end_loop_0:
; koniec dopoki
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
;PROCEDURA Z LINII 18 - 18
;RAMKA STOSU (i parametry) PROCEDURYPp
;
;{ebp+8, 4B, sym:Symbol{nr=8, identyfikator='a', zakres=5, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=true, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+4, 4B, sym:Symbol{nr=9, identyfikator='adres powrotny', zakres=5, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=10, identyfikator='poprzedni ebp', zakres=5, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:12
;rozmiar_B_zmiennych_automatycznych:0
;rozmiar_B_parametrow:4
;koniec opisu procedury
Pp_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after_p; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
p:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 0
;^robienie ramki stosu
              call Pp_prolog
              ;tu coś może być
              after_p:
;instrukcja zwróć()
                call Pp_epilog
;załadowanie lwartości:18
                mov eax, [ebp+8]
;koniec ładowania lwartosc
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Pp_epilog:
;coś tu może być(epilog)...
ret
