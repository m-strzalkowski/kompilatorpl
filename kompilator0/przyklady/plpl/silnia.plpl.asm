global _main
extern _printf
extern _pow

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `%d`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .text
;PROCEDURA Z LINII 2 - 15
;RAMKA STOSU (i parametry) PROCEDURYPrek
;
;{ebp+8, 4B, sym:Symbol{nr=1, identyfikator='n', zakres=1, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=true, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+4, 4B, sym:Symbol{nr=4, identyfikator='adres powrotny', zakres=1, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=5, identyfikator='poprzedni ebp', zakres=1, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=3, identyfikator='wynik', zakres=1, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:16
;rozmiar_B_zmiennych_automatycznych:4
;rozmiar_B_parametrow:4
;koniec opisu procedury
Prek_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after_rek; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
rek:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 4
;^robienie ramki stosu
              call Prek_prolog
              ;tu coś może być
              after_rek:

;instrukcja warunkowa w liniach:4-4
;porównanie:4
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:4
                mov eax, [ebp+8]
;koniec ładowania lwartosc
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setle al
;koniec porównania:4
cmp eax, 0
je failed_condition_0
;instrukcja zwróć()
                call Prek_epilog
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury

failed_condition_0:
; koniec instrukcji warunkowej
;instrukcja zwróć()
                call Prek_epilog
;mnożenie/dzielenie/modulo:5
;załadowanie lwartości:5
                mov eax, [ebp+8]
;koniec ładowania lwartosc
                push eax
;parametr n 
;dodawanie/odejmowanie:5
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:5
                mov eax, [ebp+8]
;koniec ładowania lwartosc
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:5
;koniec obliczania parametru n 
              push eax; złożenie na stos parametru n
              call rek.noargshuffle;wywołanie procedury
              add esp, 4;sprzątanie stosu po wywołaniu
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:5
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;punkt wejsciowy
              jmp after_iter; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
iter:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 4
;^robienie ramki stosu
              call Prek_prolog
              ;tu coś może być
              after_iter:
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
;wpisywanie wyrażenia do jakiegoś ID:8
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;instrukcja dopoki
start_loop_0:
;porównanie:9
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:9
                mov eax, [ebp+8]
;koniec ładowania lwartosc
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setg al
;koniec porównania:9
cmp eax, 0
je end_loop_0
;mnożenie/dzielenie/modulo:11
;załadowanie lwartości:11
                mov eax, [ebp+8]
;koniec ładowania lwartosc
                push eax
;załadowanie lwartości:11
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:11
;wpisywanie wyrażenia do jakiegoś ID:11
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;dodawanie/odejmowanie:12
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:12
                mov eax, [ebp+8]
;koniec ładowania lwartosc
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:12
;wpisywanie wyrażenia do jakiegoś ID:12
                mov [ebp+8], eax
;koniec wpisywanie wyrażenia do jakiegoś ID

jmp start_loop_0
end_loop_0:
; koniec dopoki
;instrukcja zwróć()
                call Prek_epilog
;załadowanie lwartości:14
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Prek_epilog:
;coś tu może być(epilog)...
ret
section .data
Sznak_5_10:   db    `\n`, 0  ;z linii 22
Sznak_5_11:   db    `:`, 0  ;z linii 22
Sznak_5_12:   db    ` : `, 0  ;z linii 22
section .text
;PROCEDURA Z LINII 16 - 26
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=13, identyfikator='adres powrotny', zakres=4, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=14, identyfikator='poprzedni ebp', zakres=4, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=7, identyfikator='i', zakres=4, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-8, 4B, sym:Symbol{nr=8, identyfikator='wr', zakres=4, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-12, 4B, sym:Symbol{nr=9, identyfikator='wi', zakres=4, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
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
;wpisywanie wyrażenia do jakiegoś ID:18
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;instrukcja dopoki
start_loop_1:
;porównanie:19
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:19
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:19
cmp eax, 0
je end_loop_1
;parametr n 
;załadowanie lwartości:21
                mov eax, [ebp-4]
;koniec ładowania lwartosc
;koniec obliczania parametru n 
              push eax; złożenie na stos parametru n
              call rek.noargshuffle;wywołanie procedury
              add esp, 4;sprzątanie stosu po wywołaniu
;wpisywanie wyrażenia do jakiegoś ID:21
                mov [ebp-8], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;parametr n 
;załadowanie lwartości:21
                mov eax, [ebp-4]
;koniec ładowania lwartosc
;koniec obliczania parametru n 
              push eax; złożenie na stos parametru n
              call iter.noargshuffle;wywołanie procedury
              add esp, 4;sprzątanie stosu po wywołaniu
;wpisywanie wyrażenia do jakiegoś ID:21
                mov [ebp-12], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;wypisanie
                push dword Sznak_5_10
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
                push dword Sznak_5_11
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
                push dword Sznak_5_12
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
;dodawanie/odejmowanie:23
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:23
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:23
;wpisywanie wyrażenia do jakiegoś ID:23
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID

jmp start_loop_1
end_loop_1:
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
;PROCEDURA Z LINII 28 - 39
;RAMKA STOSU (i parametry) PROCEDURYPsilnia_it
;
;{ebp+8, 4B, sym:Symbol{nr=16, identyfikator='n', zakres=6, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=true, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+4, 4B, sym:Symbol{nr=18, identyfikator='adres powrotny', zakres=6, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=19, identyfikator='poprzedni ebp', zakres=6, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=17, identyfikator='wynik', zakres=6, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:16
;rozmiar_B_zmiennych_automatycznych:4
;rozmiar_B_parametrow:4
;koniec opisu procedury
Psilnia_it_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after_silnia_it; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
silnia_it:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 4
;^robienie ramki stosu
              call Psilnia_it_prolog
              ;tu coś może być
              after_silnia_it:
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
;wpisywanie wyrażenia do jakiegoś ID:32
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;instrukcja dopoki
start_loop_2:
;porównanie:33
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:33
                mov eax, [ebp+8]
;koniec ładowania lwartosc
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setg al
;koniec porównania:33
cmp eax, 0
je end_loop_2
;mnożenie/dzielenie/modulo:35
;załadowanie lwartości:35
                mov eax, [ebp+8]
;koniec ładowania lwartosc
                push eax
;załadowanie lwartości:35
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:35
;wpisywanie wyrażenia do jakiegoś ID:35
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;dodawanie/odejmowanie:36
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:36
                mov eax, [ebp+8]
;koniec ładowania lwartosc
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:36
;wpisywanie wyrażenia do jakiegoś ID:36
                mov [ebp+8], eax
;koniec wpisywanie wyrażenia do jakiegoś ID

jmp start_loop_2
end_loop_2:
; koniec dopoki
;instrukcja zwróć()
                call Psilnia_it_epilog
;załadowanie lwartości:38
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Psilnia_it_epilog:
;coś tu może być(epilog)...
ret
