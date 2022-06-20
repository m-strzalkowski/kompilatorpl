extern _free
extern _scanf
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
section .data
Sznak_1_2__P_main:   db    `%1025s`, 0  ;z linii 4
Sznak_1_3__P_main:   db    `\nPrzeczytałem napis:\n`, 0  ;z linii 5
Sznak_1_4__P_main:   db    `\ni nie wiem co z nim zrobić. Zatem ginę.`, 0  ;z linii 5
section .text
;PROCEDURA Z LINII 1 - 7
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=5, identyfikator='adres powrotny', zakres=1, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=6, identyfikator='poprzedni ebp', zakres=1, stały automatyczny ref pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=1, identyfikator='buf', zakres=1, automatyczny znak []pktWe=null}}
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
;przypisanie3:11
;załadowanie lwartości:3 niederef:true true
;symbol:Symbol{nr=1, identyfikator='buf', zakres=1, automatyczny znak []pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;alokacja3:17
;stała całkowita
                mov eax,1025
;koniec stałej całkowitej
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji3:32
                pop edx
                mov [edx], eax
;koniec przypisania3:32
;naiwne wywolanie w linii4:0
;obliczenie argumentu nr 1
;załadowanie lwartości:4 niederef:null false
;symbol:Symbol{nr=1, identyfikator='buf', zakres=1, automatyczny znak []pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
;koniec obliczenia argumentu nr 1, typuautomatyczny znak []
                sub esp, 4
                mov [esp], eax
;zlozenie argumentu nr 1na stos
;obliczenie argumentu nr 0
;załadowanie lwartości:4 niederef:null false
;symbol:Symbol{nr=2, identyfikator='null', zakres=1, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_1_2__P_main];@C
;koniec ładowania lwartosci
;koniec obliczenia argumentu nr 0, typustały statyczny znak [] /*inicjalizowany*/ 
                sub esp, 4
                mov [esp], eax
;zlozenie argumentu nr 0na stos
                call _scanf;wolanie w ciemno etykiety podanej doslownie przez uzytkownika
              add esp, 8;sprzątanie stosu po wywołaniu
;koniec naiwnego wywołania w linii4:21
;wypisanie w linii5
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:5 niederef:null false
;symbol:Symbol{nr=3, identyfikator='null', zakres=1, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_1_3__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:automatyczny znak []
;załadowanie lwartości:5 niederef:null false
;symbol:Symbol{nr=1, identyfikator='buf', zakres=1, automatyczny znak []pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:5 niederef:null false
;symbol:Symbol{nr=4, identyfikator='null', zakres=1, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_1_4__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii5
;znak:6
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                push eax
                neg eax
;koniec znaku:6
push eax
call _exit
;/mid
P_main_epilog:
;coś tu może być(epilog)...
ret
section .rodata
__COMPILER_NAME__:  db`kompilator PL/PL (plplk) 1.0 Spero, aut opera...`
