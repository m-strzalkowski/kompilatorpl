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
section .bss
Sznak_2_4__P_main:   resb    1;w
section .text
;PROCEDURA Z LINII 2 - 23
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=8, identyfikator='adres powrotny', zakres=2, stały ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=9, identyfikator='poprzedni ebp', zakres=2, stały ref pktWe=null}}
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
;załadowanie lwartości:8 niederef:null false
;symbol:Symbol{nr=7, identyfikator='null', zakres=2, stały znak [] /*inicjalizowany*/ pktWe=null}
                mov edx, Sznak_2_7__P_main
                mov eax,  [edx]
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
