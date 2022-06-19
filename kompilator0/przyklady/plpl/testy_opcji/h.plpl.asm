global _main
extern _printf
extern _pow
extern _malloc
extern _free
extern _exit

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `%d`, 0  ;
WYPISZ_REF_FMT:   db    `%p`, 0  ;
WYPISZ_NAPIS_FMT:   db    `%s`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .data
Sznak_1_1__P_main:   db    `Ala ma kota `, 0  ;z linii 3
Sznak_1_2__P_main:   db    ` lata\n`, 0  ;z linii 3
section .text
;PROCEDURA Z LINII 1 - 6
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=3, identyfikator='adres powrotny', zakres=1, stały ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=4, identyfikator='poprzedni ebp', zakres=1, stały ref pktWe=null}}
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
;wypisanie w linii3
;wypisanie wyrazenia
;typ wyrazenia:stały znak [] /*inicjalizowany*/ 
;załadowanie lwartości:3 niederef:true true
;symbol:Symbol{nr=1, identyfikator='null', zakres=1, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_1_1__P_main]
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:stały całk 
;stała całkowita
                mov eax,3
;koniec stałej całkowitej
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;wypisanie wyrazenia
;typ wyrazenia:stały znak [] /*inicjalizowany*/ 
;załadowanie lwartości:3 niederef:true true
;symbol:Symbol{nr=2, identyfikator='null', zakres=1, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_1_2__P_main]
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:stały znak 
;dodawanie/odejmowanie:3
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;stała znakowa
                mov eax, 0
                mov eax, `a`
;koniec stałej znakowej
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:3
                sub esp, 1
                mov byte [esp], al
                push dword WYPISZ_ZNAK_FMT
                call _printf
                add esp, byte 5
;koniec wypisania - znak
;koniec wypisania w linii3
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
push eax
call _exit
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
