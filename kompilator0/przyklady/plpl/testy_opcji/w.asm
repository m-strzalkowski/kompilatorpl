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
Sznak_3_4__P_main:   db    `i=`, 0  ;z linii 8
Sznak_3_5__P_main:   db    `t[0][i]=`, 0  ;z linii 8
Sznak_3_6__P_main:   db    `\n`, 0  ;z linii 8
section .text
;PROCEDURA Z LINII 1 - 12
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=7, identyfikator='adres powrotny', zakres=1, stały ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=8, identyfikator='poprzedni ebp', zakres=1, stały ref pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=0, identyfikator='i', zakres=1, automatyczny całk pktWe=null}}
;{ebp-8, 4B, sym:Symbol{nr=1, identyfikator='j', zakres=1, automatyczny całk pktWe=null}}
;{ebp-12, 4B, sym:Symbol{nr=2, identyfikator='t', zakres=1, automatyczny całk [][]pktWe=null}}
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
;przypisanie5:0
;załadowanie lwartości:5 niederef:true true
;symbol:Symbol{nr=2, identyfikator='t', zakres=1, automatyczny całk [][]pktWe=null}
                lea eax, [ebp-12]
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;alokacja5:4
;stała całkowita
                mov eax,12
;koniec stałej całkowitej
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji5:19
                pop edx
                mov [edx], eax
;koniec przypisania5:19
;przypisanie6:0
;początek elementu tablicy z linii6:0
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:6 niederef:null false
;symbol:Symbol{nr=2, identyfikator='t', zakres=1, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-12]
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
;B4
        lea eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk [] dereferencja_na_końcu:false;4
;koniec elementu tablicy z linii6:3
                push eax;lewa strona przypisania
;alokacja6:7
;stała całkowita
                mov eax,32
;koniec stałej całkowitej
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji6:20
                pop edx
                mov [edx], eax
;koniec przypisania6:20
;przypisanie7:0
;załadowanie lwartości:7 niederef:true true
;symbol:Symbol{nr=0, identyfikator='i', zakres=1, automatyczny całk pktWe=null}
                lea eax, [ebp-4]
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania7:2
;instrukcja dopoki
start_loop_0:
;porównanie:7
;stała całkowita
                mov eax,32
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:7 niederef:null false
;symbol:Symbol{nr=0, identyfikator='i', zakres=1, automatyczny całk pktWe=null}
                mov eax,  [ebp-4]
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:7
cmp eax, 0
je end_loop_0
;przypisanie7:18
;początek elementu tablicy z linii7:18
;załadowanie lwartości:7 niederef:null false
;symbol:Symbol{nr=0, identyfikator='i', zakres=1, automatyczny całk pktWe=null}
                mov eax,  [ebp-4]
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii7:18
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:7 niederef:null false
;symbol:Symbol{nr=2, identyfikator='t', zakres=1, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-12]
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii7:21
                pop ecx;indeks tablicy
;B4
        lea eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk  dereferencja_na_końcu:false;4
;koniec elementu tablicy z linii7:24
                push eax;lewa strona przypisania
;mnożenie/dzielenie/modulo:7
;załadowanie lwartości:7 niederef:null false
;symbol:Symbol{nr=0, identyfikator='i', zakres=1, automatyczny całk pktWe=null}
                mov eax,  [ebp-4]
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:7 niederef:null false
;symbol:Symbol{nr=0, identyfikator='i', zakres=1, automatyczny całk pktWe=null}
                mov eax,  [ebp-4]
;koniec ładowania lwartosci
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:7
                pop edx
                mov [edx], eax
;koniec przypisania7:28
;przypisanie7:31
;załadowanie lwartości:7 niederef:true true
;symbol:Symbol{nr=0, identyfikator='i', zakres=1, automatyczny całk pktWe=null}
                lea eax, [ebp-4]
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:7
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:7 niederef:null false
;symbol:Symbol{nr=0, identyfikator='i', zakres=1, automatyczny całk pktWe=null}
                mov eax,  [ebp-4]
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:7
                pop edx
                mov [edx], eax
;koniec przypisania7:35

jmp start_loop_0
end_loop_0:
; koniec dopoki
;przypisanie8:0
;załadowanie lwartości:8 niederef:true true
;symbol:Symbol{nr=0, identyfikator='i', zakres=1, automatyczny całk pktWe=null}
                lea eax, [ebp-4]
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania8:2
;instrukcja dopoki
start_loop_1:
;porównanie:8
;stała całkowita
                mov eax,32
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:8 niederef:null false
;symbol:Symbol{nr=0, identyfikator='i', zakres=1, automatyczny całk pktWe=null}
                mov eax,  [ebp-4]
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:8
cmp eax, 0
je end_loop_1
;wypisanie w linii8
;wypisanie wyrazenia
;typ wyrazenia:stały znak [] /*inicjalizowany*/ 
;załadowanie lwartości:8 niederef:null false
;symbol:Symbol{nr=4, identyfikator='null', zakres=3, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_3_4__P_main]
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;załadowanie lwartości:8 niederef:null false
;symbol:Symbol{nr=0, identyfikator='i', zakres=1, automatyczny całk pktWe=null}
                mov eax,  [ebp-4]
;koniec ładowania lwartosci
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;wypisanie wyrazenia
;typ wyrazenia:stały znak [] /*inicjalizowany*/ 
;załadowanie lwartości:8 niederef:null false
;symbol:Symbol{nr=5, identyfikator='null', zakres=3, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_3_5__P_main]
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;początek elementu tablicy z linii8:41
;załadowanie lwartości:8 niederef:null false
;symbol:Symbol{nr=0, identyfikator='i', zakres=1, automatyczny całk pktWe=null}
                mov eax,  [ebp-4]
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii8:41
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:8 niederef:null false
;symbol:Symbol{nr=2, identyfikator='t', zakres=1, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-12]
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii8:44
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii8:47
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;wypisanie wyrazenia
;typ wyrazenia:stały znak [] /*inicjalizowany*/ 
;załadowanie lwartości:8 niederef:null false
;symbol:Symbol{nr=6, identyfikator='null', zakres=3, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_3_6__P_main]
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii8
;przypisanie8:57
;załadowanie lwartości:8 niederef:true true
;symbol:Symbol{nr=0, identyfikator='i', zakres=1, automatyczny całk pktWe=null}
                lea eax, [ebp-4]
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:8
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:8 niederef:null false
;symbol:Symbol{nr=0, identyfikator='i', zakres=1, automatyczny całk pktWe=null}
                mov eax,  [ebp-4]
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:8
                pop edx
                mov [edx], eax
;koniec przypisania8:61

jmp start_loop_1
end_loop_1:
; koniec dopoki
;dealokacja9:0
;początek elementu tablicy z linii9:9
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:9 niederef:null false
;symbol:Symbol{nr=2, identyfikator='t', zakres=1, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-12]
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii9:12
                push eax
                call _free
                add esp, 4
                mov eax, 0
;koniec dealokacji9:13
;dealokacja10:0
;załadowanie lwartości:10 niederef:null false
;symbol:Symbol{nr=2, identyfikator='t', zakres=1, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-12]
;koniec ładowania lwartosci
                push eax
                call _free
                add esp, 4
                mov eax, 0
;koniec dealokacji10:10
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
