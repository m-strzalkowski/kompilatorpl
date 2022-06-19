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
Sznak_2_7__P_main:   db    `%d`, 0  ;z linii 8
Sznak_2_8__P_main:   db    `dupa`, 0  ;z linii 19
Sznak_2_9__P_main:   db    `Ala ma kota `, 0  ;z linii 20
Sznak_2_10__P_main:   db    ` lata\n`, 0  ;z linii 20
Sznak_2_11__P_main:   db    `\n%d/%d/%d %s\n`, 0  ;z linii 21
Sznak_2_12__P_main:   db    `koniec prac nad wersją 1.0 plplk`, 0  ;z linii 21
section .bss
Sznak_2_4__P_main:   resb    4;w
section .text
;PROCEDURA Z LINII 2 - 25
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=13, identyfikator='adres powrotny', zakres=2, stały ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=14, identyfikator='poprzedni ebp', zakres=2, stały ref pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=3, identyfikator='z', zakres=2, automatyczny znak []pktWe=null}}
;{ebp-8, 4B, sym:Symbol{nr=5, identyfikator='c', zakres=2, automatyczny całk []pktWe=null}}
;{ebp-12, 4B, sym:Symbol{nr=6, identyfikator='a', zakres=2, automatyczny A pktWe=null}}
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
;przypisanie7:9
;załadowanie lwartości:7 niederef:true true
;symbol:Symbol{nr=6, identyfikator='a', zakres=2, automatyczny A pktWe=null}
                lea eax, [ebp-12]
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;alokacja7:13
                mov eax,1
                imul eax,2
                push eax
                call _malloc
                add esp, 4
;koniec alokacji7:19
                pop edx
                mov [edx], eax
;koniec przypisania7:19
;załadowanie lwartości:8 niederef:null false
;symbol:Symbol{nr=7, identyfikator='null', zakres=2, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_7__P_main]
;koniec ładowania lwartosci
;załadowanie lwartości:9 niederef:null false
;symbol:Symbol{nr=3, identyfikator='z', zakres=2, automatyczny znak []pktWe=null}
                mov eax,  [ebp-4]
;koniec ładowania lwartosci
;operator uzyskania adresu w linii 10
;załadowanie lwartości:10 niederef:true true
;symbol:Symbol{nr=3, identyfikator='z', zakres=2, automatyczny znak []pktWe=null}
                lea eax, [ebp-4]
;koniec ładowania lwartosci
;koniec operatora uzyskania adresu w linii 10
;załadowanie lwartości:11 niederef:null false
;symbol:Symbol{nr=4, identyfikator='w', zakres=2, automatyczny znak []pktWe=null}
                mov edx, Sznak_2_4__P_main
                mov eax,  [edx]
;koniec ładowania lwartosci
;operator uzyskania adresu w linii 12
;załadowanie lwartości:12 niederef:true true
;symbol:Symbol{nr=4, identyfikator='w', zakres=2, automatyczny znak []pktWe=null}
                lea eax, [Sznak_2_4__P_main]
;koniec ładowania lwartosci
;koniec operatora uzyskania adresu w linii 12
;załadowanie lwartości:13 niederef:null false
;symbol:Symbol{nr=5, identyfikator='c', zakres=2, automatyczny całk []pktWe=null}
                mov eax,  [ebp-8]
;koniec ładowania lwartosci
;operator uzyskania adresu w linii 14
;załadowanie lwartości:14 niederef:true true
;symbol:Symbol{nr=5, identyfikator='c', zakres=2, automatyczny całk []pktWe=null}
                lea eax, [ebp-8]
;koniec ładowania lwartosci
;koniec operatora uzyskania adresu w linii 14
;załadowanie lwartości:15 niederef:null false
;symbol:Symbol{nr=6, identyfikator='a', zakres=2, automatyczny A pktWe=null}
                mov eax,  [ebp-12]
;koniec ładowania lwartosci
;operator uzyskania adresu w linii 16
;załadowanie lwartości:16 niederef:true true
;symbol:Symbol{nr=6, identyfikator='a', zakres=2, automatyczny A pktWe=null}
                lea eax, [ebp-12]
;koniec ładowania lwartosci
;koniec operatora uzyskania adresu w linii 16
;początek uzyskiwania składowej w linii17:4
;załadowanie lwartości:17 niederef:null false
;symbol:Symbol{nr=6, identyfikator='a', zakres=2, automatyczny A pktWe=null}
                mov eax,  [ebp-12]
;koniec ładowania lwartosci
        mov al, [eax+0];typ:A.znak(kt:0)
;koniec uzyskiwania składowej w linii17:6
;operator uzyskania adresu w linii 18
;początek uzyskiwania składowej w linii18:6
;załadowanie lwartości:18 niederef:null false
;symbol:Symbol{nr=6, identyfikator='a', zakres=2, automatyczny A pktWe=null}
                mov eax,  [ebp-12]
;koniec ładowania lwartosci
        lea eax, [eax+0];typ:A.znak(kt:0)
;koniec uzyskiwania składowej w linii18:8
;koniec operatora uzyskania adresu w linii 18
;przypisanie19:4
;załadowanie lwartości:19 niederef:true true
;symbol:Symbol{nr=3, identyfikator='z', zakres=2, automatyczny znak []pktWe=null}
                lea eax, [ebp-4]
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;załadowanie lwartości:19 niederef:null false
;symbol:Symbol{nr=8, identyfikator='null', zakres=2, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_8__P_main]
;koniec ładowania lwartosci
                pop edx
                mov [edx], eax
;koniec przypisania19:8
;wypisanie w linii20
;wypisanie wyrazenia
;typ wyrazenia:stały znak [] /*inicjalizowany*/ 
;załadowanie lwartości:20 niederef:null false
;symbol:Symbol{nr=9, identyfikator='null', zakres=2, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_9__P_main]
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
;załadowanie lwartości:20 niederef:null false
;symbol:Symbol{nr=10, identyfikator='null', zakres=2, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_10__P_main]
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:automatyczny znak []
;załadowanie lwartości:20 niederef:null false
;symbol:Symbol{nr=3, identyfikator='z', zakres=2, automatyczny znak []pktWe=null}
                mov eax,  [ebp-4]
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii20
;naiwne wywolanie w linii21:4
;obliczenie argumentu nr 4
;załadowanie lwartości:21 niederef:null false
;symbol:Symbol{nr=12, identyfikator='null', zakres=2, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_12__P_main]
;koniec ładowania lwartosci
;koniec obliczenia argumentu nr 4, typustały znak [] /*inicjalizowany*/ 
                sub esp, 4
                mov [esp], eax
;zlozenie argumentu nr 4na stos
;obliczenie argumentu nr 3
;stała całkowita
                mov eax,2022
;koniec stałej całkowitej
;koniec obliczenia argumentu nr 3, typustały całk 
                sub esp, 4
                mov [esp], eax
;zlozenie argumentu nr 3na stos
;obliczenie argumentu nr 2
;stała całkowita
                mov eax,6
;koniec stałej całkowitej
;koniec obliczenia argumentu nr 2, typustały całk 
                sub esp, 4
                mov [esp], eax
;zlozenie argumentu nr 2na stos
;obliczenie argumentu nr 1
;stała całkowita
                mov eax,19
;koniec stałej całkowitej
;koniec obliczenia argumentu nr 1, typustały całk 
                sub esp, 4
                mov [esp], eax
;zlozenie argumentu nr 1na stos
;obliczenie argumentu nr 0
;załadowanie lwartości:21 niederef:null false
;symbol:Symbol{nr=11, identyfikator='null', zakres=2, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_11__P_main]
;koniec ładowania lwartosci
;koniec obliczenia argumentu nr 0, typustały znak [] /*inicjalizowany*/ 
                sub esp, 4
                mov [esp], eax
;zlozenie argumentu nr 0na stos
                call _printf;wolanie w ciemno etykiety podanej doslownie przez uzytkownika
              add esp, 20;sprzątanie stosu po wywołaniu
;koniec naiwnego wywołania w linii21:77
;dealokacja22:4
;załadowanie lwartości:22 niederef:null false
;symbol:Symbol{nr=6, identyfikator='a', zakres=2, automatyczny A pktWe=null}
                mov eax,  [ebp-12]
;koniec ładowania lwartosci
                push eax
                call _free
                add esp, 4
                mov eax, 0
;koniec dealokacji22:14
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
section .rodata
__COMPILER_NAME__:  db`kompilator PL/PL (plplk) 1.0 Spero, aut opera...`
