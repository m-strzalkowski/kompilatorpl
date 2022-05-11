global _main
extern _printf
extern _pow

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `%d`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .data
Sznak_2_3:   db    `a jest większe\n`, 0  ;z linii 10
Sznak_3_4:   db    `b jest większe\n`, 0  ;z linii 14
Sznak_4_5:   db    `\n`, 0  ;z linii 21
section .text
;PROCEDURA Z LINII 1 - 26
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=6, identyfikator='adres powrotny', zakres=1, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=7, identyfikator='poprzedni ebp', zakres=1, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=1, identyfikator='a', zakres=1, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-8, 4B, sym:Symbol{nr=2, identyfikator='b', zakres=1, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
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
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
;wpisywanie wyrażenia do jakiegoś ID:6
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;stała całkowita
                mov eax,9
;koniec stałej całkowitej
;wpisywanie wyrażenia do jakiegoś ID:7
                mov [ebp-8], eax
;koniec wpisywanie wyrażenia do jakiegoś ID

;instrukcja warunkowa w liniach:8-15
;porównanie:8
;załadowanie lwartości:8
                mov eax, [ebp-8]
;koniec ładowania lwartosc
                push eax
;załadowanie lwartości:8
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setg al
;koniec porównania:8
cmp eax, 0
je failed_condition_0
;wypisanie
                push dword Sznak_2_3
                call _printf
                add esp, byte 4
;koniec wypisania

jmp after_else_0
failed_condition_0:
;wypisanie
                push dword Sznak_3_4
                call _printf
                add esp, byte 4
;koniec wypisania

after_else_0:
; koniec instrukcji warunkowej
;instrukcja dopoki
start_loop_0:
;porównanie:16
;załadowanie lwartości:16
                mov eax, [ebp-8]
;koniec ładowania lwartosc
                push eax
;załadowanie lwartości:16
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setne al
;koniec porównania:16
cmp eax, 0
je end_loop_0
;dodawanie/odejmowanie:18
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:18
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:18
;wpisywanie wyrażenia do jakiegoś ID:18
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID

;instrukcja warunkowa w liniach:19-20
;porównanie:19
;stała całkowita
                mov eax,5
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:19
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                cmp eax, ebx
                mov eax, 0
                sete al
;koniec porównania:19
cmp eax, 0
je failed_condition_1
                jmp start_loop_0;powrot do poczatku petli

failed_condition_1:
; koniec instrukcji warunkowej
;wypisanie całk
                sub esp, 4
                mov dword eax, [ebp-4]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania
;wypisanie
                push dword Sznak_4_5
                call _printf
                add esp, byte 4
;koniec wypisania

;instrukcja warunkowa w liniach:22-23
;porównanie:22
;stała całkowita
                mov eax,7
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:22
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                cmp eax, ebx
                mov eax, 0
                sete al
;koniec porównania:22
cmp eax, 0
je failed_condition_2
                jmp end_loop_0;przerwanie petli

failed_condition_2:
; koniec instrukcji warunkowej

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
