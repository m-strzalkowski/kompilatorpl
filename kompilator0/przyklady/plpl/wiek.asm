extern _free
extern _scanf
extern _pow
extern _exit
extern _time
extern _printf
global _main

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `%d`, 0  ;
WYPISZ_REF_FMT:   db    `%p`, 0  ;
WYPISZ_NAPIS_FMT:   db    `%s`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .data
Sznak_1_4__P_main:   db    `Ile masz lat?\n>`, 0  ;z linii 10
Sznak_1_5__P_main:   db    `%d`, 0  ;z linii 11
section .text
;PROCEDURA Z LINII 3 - 14
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=6, identyfikator='adres powrotny', zakres=1, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=7, identyfikator='poprzedni ebp', zakres=1, stały automatyczny ref pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=1, identyfikator='wiek', zakres=1, automatyczny całk pktWe=null}}
;{ebp-8, 4B, sym:Symbol{nr=2, identyfikator='t', zakres=1, automatyczny całk pktWe=null}}
;{ebp-12, 4B, sym:Symbol{nr=3, identyfikator='r', zakres=1, automatyczny ref pktWe=null}}
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
;przypisanie8:10
;załadowanie lwartości:8 niederef:true true
;symbol:Symbol{nr=3, identyfikator='r', zakres=1, automatyczny ref pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;załadowanie lwartości:8 niederef:null false
                mov eax, 0;nic
;koniec ładowania lwartosci - nic
                pop edx
                mov [edx], eax
;koniec przypisania8:14
;wypisanie w linii9
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;przypisanie9:9
;załadowanie lwartości:9 niederef:true true
;symbol:Symbol{nr=2, identyfikator='t', zakres=1, automatyczny całk pktWe=null}
                lea eax, [ebp-8];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;naiwne wywolanie w linii9:11
;obliczenie argumentu nr 0
;załadowanie lwartości:9 niederef:null false
                mov eax, 0;nic
;koniec ładowania lwartosci - nic
;koniec obliczenia argumentu nr 0, typustały automatyczny ref 
                sub esp, 4
                mov [esp], eax
;zlozenie argumentu nr 0na stos
                call _time;wolanie w ciemno etykiety podanej doslownie przez uzytkownika
              add esp, 4;sprzątanie stosu po wywołaniu
;koniec naiwnego wywołania w linii9:22
                pop edx
                mov [edx], eax
;koniec przypisania9:22
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;koniec wypisania w linii9
;wypisanie w linii10
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:10 niederef:null false
;symbol:Symbol{nr=4, identyfikator='null', zakres=1, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_1_4__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii10
;naiwne wywolanie w linii11:4
;obliczenie argumentu nr 1
;operator uzyskania adresu w linii 11
;załadowanie lwartości:11 niederef:true true
;symbol:Symbol{nr=1, identyfikator='wiek', zakres=1, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
;koniec operatora uzyskania adresu w linii 11
;koniec obliczenia argumentu nr 1, typuautomatyczny całk 
                sub esp, 4
                mov [esp], eax
;zlozenie argumentu nr 1na stos
;obliczenie argumentu nr 0
;załadowanie lwartości:11 niederef:null false
;symbol:Symbol{nr=5, identyfikator='null', zakres=1, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_1_5__P_main];@C
;koniec ładowania lwartosci
;koniec obliczenia argumentu nr 0, typustały statyczny znak [] /*inicjalizowany*/ 
                sub esp, 4
                mov [esp], eax
;zlozenie argumentu nr 0na stos
                call _scanf;wolanie w ciemno etykiety podanej doslownie przez uzytkownika
              add esp, 8;sprzątanie stosu po wywołaniu
;koniec naiwnego wywołania w linii11:23
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
