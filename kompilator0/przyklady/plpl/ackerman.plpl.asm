global _main
extern _printf
extern _pow

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `%d`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .text
;PROCEDURA Z LINII 2 - 10
;RAMKA STOSU (i parametry) PROCEDURYPack
;
;{ebp+12, 4B, sym:Symbol{nr=3, identyfikator='n', zakres=1, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=true, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+8, 4B, sym:Symbol{nr=2, identyfikator='m', zakres=1, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=true, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+4, 4B, sym:Symbol{nr=4, identyfikator='adres powrotny', zakres=1, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=5, identyfikator='poprzedni ebp', zakres=1, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=0, identyfikator='odp', zakres=1, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:20
;rozmiar_B_zmiennych_automatycznych:4
;rozmiar_B_parametrow:8
;koniec opisu procedury
Pack_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after_ack; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
ack:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 4
;^robienie ramki stosu
              call Pack_prolog
              ;tu coś może być
              after_ack:

;instrukcja warunkowa w liniach:6-8
;porównanie:6
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:6
                mov eax, [ebp+8]
;koniec ładowania lwartosc
                pop ebx
                cmp eax, ebx
                mov eax, 0
                sete al
;koniec porównania:6
cmp eax, 0
je failed_condition_0
;dodawanie/odejmowanie:6
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:6
                mov eax, [ebp+12]
;koniec ładowania lwartosc
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:6
;wpisywanie wyrażenia do jakiegoś ID:6
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID

jmp after_else_0
failed_condition_0:

;instrukcja warunkowa w liniach:7-8
;porównanie:7
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:7
                mov eax, [ebp+12]
;koniec ładowania lwartosc
                pop ebx
                cmp eax, ebx
                mov eax, 0
                sete al
;koniec porównania:7
cmp eax, 0
je failed_condition_1
;parametr n 
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
;koniec obliczania parametru n 
              push eax; złożenie na stos parametru n
;parametr m 
;dodawanie/odejmowanie:7
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:7
                mov eax, [ebp+8]
;koniec ładowania lwartosc
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:7
;koniec obliczania parametru m 
              push eax; złożenie na stos parametru m
              call ack.noargshuffle;wywołanie procedury
              add esp, 8;sprzątanie stosu po wywołaniu
;wpisywanie wyrażenia do jakiegoś ID:7
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID

jmp after_else_1
failed_condition_1:
;parametr n 
;parametr n 
;dodawanie/odejmowanie:8
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:8
                mov eax, [ebp+12]
;koniec ładowania lwartosc
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:8
;koniec obliczania parametru n 
              push eax; złożenie na stos parametru n
;parametr m 
;załadowanie lwartości:8
                mov eax, [ebp+8]
;koniec ładowania lwartosc
;koniec obliczania parametru m 
              push eax; złożenie na stos parametru m
              call ack.noargshuffle;wywołanie procedury
              add esp, 8;sprzątanie stosu po wywołaniu
;koniec obliczania parametru n 
              push eax; złożenie na stos parametru n
;parametr m 
;dodawanie/odejmowanie:8
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:8
                mov eax, [ebp+8]
;koniec ładowania lwartosc
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:8
;koniec obliczania parametru m 
              push eax; złożenie na stos parametru m
              call ack.noargshuffle;wywołanie procedury
              add esp, 8;sprzątanie stosu po wywołaniu
;wpisywanie wyrażenia do jakiegoś ID:8
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID

after_else_1:
; koniec instrukcji warunkowej

after_else_0:
; koniec instrukcji warunkowej
;instrukcja zwróć()
                call Pack_epilog
;załadowanie lwartości:9
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Pack_epilog:
;coś tu może być(epilog)...
ret
section .data
Sznak_7_10:   db    `Wartość funkcji Ackermana dla argumentów:`, 0  ;z linii 23
Sznak_7_11:   db    `, `, 0  ;z linii 23
Sznak_7_12:   db    ` to `, 0  ;z linii 23
Sznak_7_13:   db    `\n`, 0  ;z linii 23
Sznak_5_14:   db    `Koniec.`, 0  ;z linii 28
section .text
;PROCEDURA Z LINII 11 - 30
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=15, identyfikator='adres powrotny', zakres=5, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=16, identyfikator='poprzedni ebp', zakres=5, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=6, identyfikator='i', zakres=5, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-8, 4B, sym:Symbol{nr=7, identyfikator='j', zakres=5, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-12, 4B, sym:Symbol{nr=8, identyfikator='w', zakres=5, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
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
                mov eax,0
;koniec stałej całkowitej
;wpisywanie wyrażenia do jakiegoś ID:15
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;instrukcja dopoki
start_loop_0:
;porównanie:16
;stała całkowita
                mov eax,4
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:16
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:16
cmp eax, 0
je end_loop_0
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
;wpisywanie wyrażenia do jakiegoś ID:18
                mov [ebp-8], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;instrukcja dopoki
start_loop_1:
;porównanie:19
;stała całkowita
                mov eax,4
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:19
                mov eax, [ebp-8]
;koniec ładowania lwartosc
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:19
cmp eax, 0
je end_loop_1
;parametr n 
;załadowanie lwartości:22
                mov eax, [ebp-8]
;koniec ładowania lwartosc
;koniec obliczania parametru n 
              push eax; złożenie na stos parametru n
;parametr m 
;załadowanie lwartości:22
                mov eax, [ebp-4]
;koniec ładowania lwartosc
;koniec obliczania parametru m 
              push eax; złożenie na stos parametru m
              call ack.noargshuffle;wywołanie procedury
              add esp, 8;sprzątanie stosu po wywołaniu
;wpisywanie wyrażenia do jakiegoś ID:22
                mov [ebp-12], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;wypisanie
                push dword Sznak_7_10
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
;wypisanie
                push dword Sznak_7_11
                call _printf
                add esp, byte 4
;koniec wypisania
;wypisanie całk
                sub esp, 4
                mov dword eax, [ebp-8]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania
;wypisanie
                push dword Sznak_7_12
                call _printf
                add esp, byte 4
;koniec wypisania
;wypisanie całk
                sub esp, 4
                mov dword eax, [ebp-12]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania
;wypisanie
                push dword Sznak_7_13
                call _printf
                add esp, byte 4
;koniec wypisania
;dodawanie/odejmowanie:24
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:24
                mov eax, [ebp-8]
;koniec ładowania lwartosc
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:24
;wpisywanie wyrażenia do jakiegoś ID:24
                mov [ebp-8], eax
;koniec wpisywanie wyrażenia do jakiegoś ID

jmp start_loop_1
end_loop_1:
; koniec dopoki
;dodawanie/odejmowanie:26
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:26
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:26
;wpisywanie wyrażenia do jakiegoś ID:26
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID

jmp start_loop_0
end_loop_0:
; koniec dopoki
;wypisanie
                push dword Sznak_5_14
                call _printf
                add esp, byte 4
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
