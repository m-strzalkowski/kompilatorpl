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
Sznak_2_6__P_main:   db    `\n`, 0  ;z linii 12
Sznak_2_7__P_main:   db    `\n`, 0  ;z linii 12
Sznak_2_8__P_main:   db    `\n`, 0  ;z linii 12
Sznak_2_9__P_main:   db    `\n`, 0  ;z linii 14
Sznak_2_10__P_main:   db    `\n`, 0  ;z linii 16
Sznak_4_11__P_main:   db    `i=`, 0  ;z linii 19
Sznak_4_12__P_main:   db    `t[0][i]=`, 0  ;z linii 19
Sznak_4_13__P_main:   db    `\n`, 0  ;z linii 19
section .text
;PROCEDURA Z LINII 5 - 24
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=14, identyfikator='adres powrotny', zakres=2, stały ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=15, identyfikator='poprzedni ebp', zakres=2, stały ref pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=1, identyfikator='i', zakres=2, automatyczny całk pktWe=null}}
;{ebp-8, 4B, sym:Symbol{nr=2, identyfikator='j', zakres=2, automatyczny całk pktWe=null}}
;{ebp-12, 4B, sym:Symbol{nr=3, identyfikator='t', zakres=2, automatyczny całk [][]pktWe=null}}
;{ebp-16, 1B, sym:Symbol{nr=5, identyfikator='a', zakres=2, automatyczny znak pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:21
;rozmiar_B_zmiennych_automatycznych:13
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
              sub esp, 13
;^robienie ramki stosu
              call P_main_prolog
              ;tu coś może być
              after__main:
;przypisanie10:1
;załadowanie lwartości:10 niederef:true true
;symbol:Symbol{nr=5, identyfikator='a', zakres=2, automatyczny znak pktWe=null}
                mov eax, 0
                lea eax, [ebp-16];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała znakowa
                mov eax, 0
                mov byte al, `a`
;koniec stałej znakowej
                pop edx
                mov [edx], al
;koniec przypisania10:3
;przypisanie11:1
;załadowanie lwartości:11 niederef:true true
;symbol:Symbol{nr=1, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;załadowanie lwartości:11 niederef:null false
;symbol:Symbol{nr=5, identyfikator='a', zakres=2, automatyczny znak pktWe=null}
                mov eax, 0
                mov al,  [ebp-16];@B
;koniec ładowania lwartosci
                pop edx
                mov [edx], eax
;koniec przypisania11:3
;wypisanie w linii12
;wypisanie wyrazenia
;typ wyrazenia:stały znak 
;stała znakowa
                mov eax, 0
                mov byte al, `#`
;koniec stałej znakowej
                sub esp, 1
                mov byte [esp], al
                push dword WYPISZ_ZNAK_FMT
                call _printf
                add esp, byte 5
;koniec wypisania - znak
;wypisanie wyrazenia
;typ wyrazenia:automatyczny znak 
;załadowanie lwartości:12 niederef:null false
;symbol:Symbol{nr=5, identyfikator='a', zakres=2, automatyczny znak pktWe=null}
                mov eax, 0
                mov al,  [ebp-16];@B
;koniec ładowania lwartosci
                sub esp, 1
                mov byte [esp], al
                push dword WYPISZ_ZNAK_FMT
                call _printf
                add esp, byte 5
;koniec wypisania - znak
;wypisanie wyrazenia
;typ wyrazenia:stały znak [] /*inicjalizowany*/ 
;załadowanie lwartości:12 niederef:null false
;symbol:Symbol{nr=6, identyfikator='null', zakres=2, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_6__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;załadowanie lwartości:12 niederef:null false
;symbol:Symbol{nr=1, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;wypisanie wyrazenia
;typ wyrazenia:stały znak [] /*inicjalizowany*/ 
;załadowanie lwartości:12 niederef:null false
;symbol:Symbol{nr=7, identyfikator='null', zakres=2, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_7__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;przypisanie12:24
;załadowanie lwartości:12 niederef:true true
;symbol:Symbol{nr=5, identyfikator='a', zakres=2, automatyczny znak pktWe=null}
                mov eax, 0
                lea eax, [ebp-16];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;załadowanie lwartości:12 niederef:null false
;symbol:Symbol{nr=1, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                pop edx
                mov [edx], al
;koniec przypisania12:26
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;wypisanie wyrazenia
;typ wyrazenia:stały znak [] /*inicjalizowany*/ 
;załadowanie lwartości:12 niederef:null false
;symbol:Symbol{nr=8, identyfikator='null', zakres=2, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_8__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii12
;przypisanie13:0
;załadowanie lwartości:13 niederef:true true
;symbol:Symbol{nr=3, identyfikator='t', zakres=2, automatyczny całk [][]pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;alokacja13:4
;stała całkowita
                mov eax,12
;koniec stałej całkowitej
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji13:19
                pop edx
                mov [edx], eax
;koniec przypisania13:19
;wypisanie w linii14
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk [][]
                push dword REPREZENTACJA_TYPU_0
                call _printf
;załadowanie lwartości:14 niederef:null false
;symbol:Symbol{nr=3, identyfikator='t', zakres=2, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax;wypisanie referencji
                push dword WYPISZ_REF_FMT
                call _printf
                add esp, byte 12
;koniec wypisania wyyrazenia - referencja
;wypisanie wyrazenia
;typ wyrazenia:stały znak [] /*inicjalizowany*/ 
;załadowanie lwartości:14 niederef:null false
;symbol:Symbol{nr=9, identyfikator='null', zakres=2, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_9__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii14
;przypisanie15:0
;załadowanie lwartości:15 niederef:true true
;symbol:Symbol{nr=3, identyfikator='t', zakres=2, automatyczny całk [][]pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;alokacja15:4
;stała całkowita
                mov eax,120
;koniec stałej całkowitej
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji15:20
                pop edx
                mov [edx], eax
;koniec przypisania15:20
;wypisanie w linii16
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk [][]
                push dword REPREZENTACJA_TYPU_1
                call _printf
;załadowanie lwartości:16 niederef:null false
;symbol:Symbol{nr=3, identyfikator='t', zakres=2, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax;wypisanie referencji
                push dword WYPISZ_REF_FMT
                call _printf
                add esp, byte 12
;koniec wypisania wyyrazenia - referencja
;wypisanie wyrazenia
;typ wyrazenia:stały znak [] /*inicjalizowany*/ 
;załadowanie lwartości:16 niederef:null false
;symbol:Symbol{nr=10, identyfikator='null', zakres=2, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_10__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii16
;przypisanie17:0
;początek elementu tablicy z linii17:0
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:17 niederef:null false
;symbol:Symbol{nr=3, identyfikator='t', zakres=2, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
;B4
        lea eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk [] dereferencja_na_końcu:false;4
;koniec elementu tablicy z linii17:3
                push eax;lewa strona przypisania
;alokacja17:7
;stała całkowita
                mov eax,32
;koniec stałej całkowitej
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji17:20
                pop edx
                mov [edx], eax
;koniec przypisania17:20
;przypisanie18:0
;załadowanie lwartości:18 niederef:true true
;symbol:Symbol{nr=1, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania18:2
;instrukcja dopoki
start_loop_0:
;porównanie:18
;stała całkowita
                mov eax,32
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:18 niederef:null false
;symbol:Symbol{nr=1, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:18
cmp eax, 0
je end_loop_0
;przypisanie18:18
;początek elementu tablicy z linii18:18
;załadowanie lwartości:18 niederef:null false
;symbol:Symbol{nr=1, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii18:18
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:18 niederef:null false
;symbol:Symbol{nr=3, identyfikator='t', zakres=2, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii18:21
                pop ecx;indeks tablicy
;B4
        lea eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk  dereferencja_na_końcu:false;4
;koniec elementu tablicy z linii18:24
                push eax;lewa strona przypisania
;mnożenie/dzielenie/modulo:18
;załadowanie lwartości:18 niederef:null false
;symbol:Symbol{nr=1, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:18 niederef:null false
;symbol:Symbol{nr=1, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:18
                pop edx
                mov [edx], eax
;koniec przypisania18:28
;przypisanie18:31
;załadowanie lwartości:18 niederef:true true
;symbol:Symbol{nr=1, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:18
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:18 niederef:null false
;symbol:Symbol{nr=1, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:18
                pop edx
                mov [edx], eax
;koniec przypisania18:35

jmp start_loop_0
end_loop_0:
; koniec dopoki
;przypisanie19:0
;załadowanie lwartości:19 niederef:true true
;symbol:Symbol{nr=1, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania19:2
;instrukcja dopoki
start_loop_1:
;porównanie:19
;stała całkowita
                mov eax,32
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:19 niederef:null false
;symbol:Symbol{nr=1, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:19
cmp eax, 0
je end_loop_1
;wypisanie w linii19
;wypisanie wyrazenia
;typ wyrazenia:stały znak [] /*inicjalizowany*/ 
;załadowanie lwartości:19 niederef:null false
;symbol:Symbol{nr=11, identyfikator='null', zakres=4, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_4_11__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;załadowanie lwartości:19 niederef:null false
;symbol:Symbol{nr=1, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;wypisanie wyrazenia
;typ wyrazenia:stały znak [] /*inicjalizowany*/ 
;załadowanie lwartości:19 niederef:null false
;symbol:Symbol{nr=12, identyfikator='null', zakres=4, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_4_12__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;początek elementu tablicy z linii19:41
;załadowanie lwartości:19 niederef:null false
;symbol:Symbol{nr=1, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii19:41
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:19 niederef:null false
;symbol:Symbol{nr=3, identyfikator='t', zakres=2, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii19:44
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii19:47
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;wypisanie wyrazenia
;typ wyrazenia:stały znak [] /*inicjalizowany*/ 
;załadowanie lwartości:19 niederef:null false
;symbol:Symbol{nr=13, identyfikator='null', zakres=4, stały znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_4_13__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii19
;przypisanie19:57
;załadowanie lwartości:19 niederef:true true
;symbol:Symbol{nr=1, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:19
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:19 niederef:null false
;symbol:Symbol{nr=1, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:19
                pop edx
                mov [edx], eax
;koniec przypisania19:61

jmp start_loop_1
end_loop_1:
; koniec dopoki
;dealokacja20:0
;początek elementu tablicy z linii20:9
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:20 niederef:null false
;symbol:Symbol{nr=3, identyfikator='t', zakres=2, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii20:12
                push eax
                call _free
                add esp, 4
                mov eax, 0
;koniec dealokacji20:13
;dealokacja21:0
;załadowanie lwartości:21 niederef:null false
;symbol:Symbol{nr=3, identyfikator='t', zakres=2, automatyczny całk [][]pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
                call _free
                add esp, 4
                mov eax, 0
;koniec dealokacji21:10
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
REPREZENTACJA_TYPU_0:   db    `automatyczny całk [][]@`, 0  ;z linii14
REPREZENTACJA_TYPU_1:   db    `automatyczny całk [][]@`, 0  ;z linii16
section .rodata
__COMPILER_NAME__:  db`kompilator PL/PL (plplk) 1.0 Spero, aut opera...`
