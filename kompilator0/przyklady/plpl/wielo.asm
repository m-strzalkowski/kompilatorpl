extern _free
extern _pow
extern _exit
extern _printf
extern _malloc
global _main

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `%d`, 0  ;
WYPISZ_REF_FMT:   db    `%p`, 0  ;
WYPISZ_NAPIS_FMT:   db    `%s`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .text
;PROCEDURA Z LINII 2 - 7
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=1, identyfikator='adres powrotny', zakres=1, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=2, identyfikator='poprzedni ebp', zakres=1, stały automatyczny ref pktWe=null}}
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
;parametr b 
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
;koniec obliczania parametru b 
              push eax; złożenie na stos parametru b
;parametr a 
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
;koniec obliczania parametru a 
              push eax; złożenie na stos parametru a
              push dword 0;dziura po parametrze c 
              call g.noargshuffle;wywołanie procedury
              add esp, 12;sprzątanie stosu po wywołaniu
;parametr b 
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
;koniec obliczania parametru b 
              push eax; złożenie na stos parametru b
;parametr a 
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
;koniec obliczania parametru a 
              push eax; złożenie na stos parametru a
              push dword 0;dziura po parametrze c 
              call h.noargshuffle;wywołanie procedury
              add esp, 12;sprzątanie stosu po wywołaniu
;parametr b 
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
;koniec obliczania parametru b 
              push eax; złożenie na stos parametru b
;parametr a 
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
;koniec obliczania parametru a 
              push eax; złożenie na stos parametru a
;parametr c 
;dodawanie/odejmowanie:5
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                push eax
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:5
;koniec obliczania parametru c 
              push eax; złożenie na stos parametru c
              call f.noargshuffle;wywołanie procedury
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
section .data
Sznak_2_10__Pg:   db    `a:`, 0  ;z linii 16
Sznak_2_11__Pg:   db    `, b:`, 0  ;z linii 16
Sznak_2_12__Pg:   db    `, c:`, 0  ;z linii 16
Sznak_2_13__Pg:   db    `\n`, 0  ;z linii 16
section .text
;PROCEDURA Z LINII 9 - 19
;RAMKA STOSU (i parametry) PROCEDURYPg
;
;{ebp+16, 4B, sym:Symbol{nr=7, identyfikator='b', zakres=2, /*parametr*/ automatyczny całk pktWe=null}}
;{ebp+12, 4B, sym:Symbol{nr=6, identyfikator='a', zakres=2, /*parametr*/ automatyczny całk pktWe=null}}
;{ebp+8, 4B, sym:Symbol{nr=3, identyfikator='c', zakres=2, /*parametr*/ automatyczny całk pktWe=null}}
;{ebp+4, 4B, sym:Symbol{nr=14, identyfikator='adres powrotny', zakres=2, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=15, identyfikator='poprzedni ebp', zakres=2, stały automatyczny ref pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=4, identyfikator='d', zakres=2, automatyczny całk pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:24
;rozmiar_B_zmiennych_automatycznych:4
;rozmiar_B_parametrow:12
;koniec opisu procedury
Pg_prolog:
;coś tu może być(prolog)...
ret
;mid
;przypisanie12:4
;załadowanie lwartości:12 niederef:true true
;symbol:Symbol{nr=3, identyfikator='c', zakres=2, /*parametr*/ automatyczny całk pktWe=null}
                lea eax, [ebp+8];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania12:6
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
              call Pg_prolog
              ;tu coś może być
              after_g:
;punkt wejsciowy
              jmp after_h; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
h:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 4
;^robienie ramki stosu
              call Pg_prolog
              ;tu coś może być
              after_h:
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
              call Pg_prolog
              ;tu coś może być
              after_f:
;wypisanie w linii16
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:16 niederef:null false
;symbol:Symbol{nr=10, identyfikator='null', zakres=2, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_10__Pg];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:/*parametr*/ automatyczny całk 
;załadowanie lwartości:16 niederef:null false
;symbol:Symbol{nr=6, identyfikator='a', zakres=2, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+12];@B
;koniec ładowania lwartosci
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:16 niederef:null false
;symbol:Symbol{nr=11, identyfikator='null', zakres=2, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_11__Pg];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:/*parametr*/ automatyczny całk 
;załadowanie lwartości:16 niederef:null false
;symbol:Symbol{nr=7, identyfikator='b', zakres=2, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+16];@B
;koniec ładowania lwartosci
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:16 niederef:null false
;symbol:Symbol{nr=12, identyfikator='null', zakres=2, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_12__Pg];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:/*parametr*/ automatyczny całk 
;załadowanie lwartości:16 niederef:null false
;symbol:Symbol{nr=3, identyfikator='c', zakres=2, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:16 niederef:null false
;symbol:Symbol{nr=13, identyfikator='null', zakres=2, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_13__Pg];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii16
;instrukcja zwróć()
                call Pg_epilog
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Pg_epilog:
;coś tu może być(epilog)...
ret
section .rodata
__COMPILER_NAME__:  db`kompilator PL/PL (plplk) 1.0 Spero, aut opera...`
__NULL_DEREFERENCE_FMT__:  db`\nPRÓBA DEREFERENCJI REFERENCJI O WARTOŚCI NIC, CZYLI ZERO (w linii kodu źródłowego:%d)\n`
