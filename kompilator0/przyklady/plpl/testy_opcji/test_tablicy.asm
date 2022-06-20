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
Scak_3_12__P_main:   dd    0;i
Sznak_4_14__P_main:   db    `\n`, 0  ;z linii 29
Sznak_4_15__P_main:   db    `\n`, 0  ;z linii 29
section .text
;PROCEDURA Z LINII 15 - 36
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=16, identyfikator='adres powrotny', zakres=3, stały ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=17, identyfikator='poprzedni ebp', zakres=3, stały ref pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=10, identyfikator='a', zakres=3, automatyczny całk pktWe=null}}
;{ebp-8, 4B, sym:Symbol{nr=11, identyfikator='t', zakres=3, automatyczny całk [][]pktWe=null}}
;{ebp-12, 4B, sym:Symbol{nr=13, identyfikator='j', zakres=3, automatyczny całk pktWe=null}}
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
;przypisanie18:4
;załadowanie lwartości:18 niederef:true true
;symbol:Symbol{nr=10, identyfikator='a', zakres=3, automatyczny całk pktWe=null}
                lea eax, [ebp-4]
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania18:6
;przypisanie20:4
;załadowanie lwartości:20 niederef:true true
;symbol:Symbol{nr=11, identyfikator='t', zakres=3, automatyczny całk [][]pktWe=null}
                lea eax, [ebp-8]
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;alokacja20:8
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji20:22
                pop edx
                mov [edx], eax
;koniec przypisania20:22
;przypisanie21:4
;początek elementu tablicy z linii21:4
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:21 niederef:null false
;symbol:Symbol{nr=11, identyfikator='t', zakres=3, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-8]
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
;B4
        lea eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk [] dereferencja_na_końcu:false;4
;koniec elementu tablicy z linii21:7
                push eax;lewa strona przypisania
;alokacja21:11
;stała całkowita
                mov eax,3
;koniec stałej całkowitej
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji21:23
                pop edx
                mov [edx], eax
;koniec przypisania21:23
;przypisanie22:4
;początek elementu tablicy z linii22:4
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:22 niederef:null false
;symbol:Symbol{nr=11, identyfikator='t', zakres=3, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-8]
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
;B4
        lea eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk [] dereferencja_na_końcu:false;4
;koniec elementu tablicy z linii22:7
                push eax;lewa strona przypisania
;alokacja22:11
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji22:23
                pop edx
                mov [edx], eax
;koniec przypisania22:23
;przypisanie23:4
;początek elementu tablicy z linii23:4
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;początek elementu tablicy z linii23:4
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:23 niederef:null false
;symbol:Symbol{nr=11, identyfikator='t', zakres=3, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-8]
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii23:7
                pop ecx;indeks tablicy
;B4
        lea eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk  dereferencja_na_końcu:false;4
;koniec elementu tablicy z linii23:10
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania23:14
;instrukcja dopoki
start_loop_0:
;porównanie:26
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:26 niederef:null false
;symbol:Symbol{nr=12, identyfikator='i', zakres=3, automatyczny całk  /*inicjalizowany*/ pktWe=null}
                mov edx, Scak_3_12__P_main
                mov eax,  [edx]
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:26
cmp eax, 0
je end_loop_0
;przypisanie28:8
;załadowanie lwartości:28 niederef:true true
;symbol:Symbol{nr=10, identyfikator='a', zakres=3, automatyczny całk pktWe=null}
                lea eax, [ebp-4]
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;początek elementu tablicy z linii28:12
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;początek elementu tablicy z linii28:12
;załadowanie lwartości:28 niederef:null false
;symbol:Symbol{nr=12, identyfikator='i', zakres=3, automatyczny całk  /*inicjalizowany*/ pktWe=null}
                mov edx, Scak_3_12__P_main
                mov eax,  [edx]
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:28 niederef:null false
;symbol:Symbol{nr=11, identyfikator='t', zakres=3, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-8]
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii28:15
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii28:18
                pop edx
                mov [edx], eax
;koniec przypisania28:18
;przypisanie30:8
;załadowanie lwartości:30 niederef:true true
;symbol:Symbol{nr=12, identyfikator='i', zakres=3, automatyczny całk  /*inicjalizowany*/ pktWe=null}
                lea eax, [Scak_3_12__P_main]
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:30
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:30 niederef:null false
;symbol:Symbol{nr=12, identyfikator='i', zakres=3, automatyczny całk  /*inicjalizowany*/ pktWe=null}
                mov edx, Scak_3_12__P_main
                mov eax,  [edx]
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:30
                pop edx
                mov [edx], eax
;koniec przypisania30:12

jmp start_loop_0
end_loop_0:
; koniec dopoki
;dealokacja33:4
;początek elementu tablicy z linii33:13
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:33 niederef:null false
;symbol:Symbol{nr=11, identyfikator='t', zakres=3, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-8]
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii33:16
                push eax
                call _free
                add esp, 4
                mov eax, 0
;koniec dealokacji33:17
;dealokacja34:4
;początek elementu tablicy z linii34:13
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:34 niederef:null false
;symbol:Symbol{nr=11, identyfikator='t', zakres=3, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-8]
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii34:16
                push eax
                call _free
                add esp, 4
                mov eax, 0
;koniec dealokacji34:17
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
;PROCEDURA Z LINII 37 - 37
;RAMKA STOSU (i parametry) PROCEDURYPf
;
;{ebp+4, 4B, sym:Symbol{nr=19, identyfikator='adres powrotny', zakres=5, stały ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=20, identyfikator='poprzedni ebp', zakres=5, stały ref pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:8
;rozmiar_B_zmiennych_automatycznych:0
;rozmiar_B_parametrow:0
;koniec opisu procedury
Pf_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after_f; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
f:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 0
;^robienie ramki stosu
              call Pf_prolog
              ;tu coś może być
              after_f:
;instrukcja zwróć()
                call Pf_epilog
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Pf_epilog:
;coś tu może być(epilog)...
ret
section .rodata
__COMPILER_NAME__:  db`kompilator PL/PL (plplk) 1.0 Spero, aut opera...`
