extern _free
extern _pow
extern _exit
extern _malloc
extern _memset
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
Sznak_2_3__P_main:   db    `\n`, 0  ;z linii 8
Sznak_2_9__P_main:   db    `\n`, 0  ;z linii 17
Sznak_2_10__P_main:   db    `\n`, 0  ;z linii 27
Sznak_2_12__P_main:   db    `w:`, 0  ;z linii 31
Sznak_2_13__P_main:   db    `\n`, 0  ;z linii 31
Sznak_4_14__P_main:   db    ` `, 0  ;z linii 34
Sznak_4_15__P_main:   db    ` `, 0  ;z linii 36
section .text
;PROCEDURA Z LINII 6 - 50
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=16, identyfikator='adres powrotny', zakres=2, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=17, identyfikator='poprzedni ebp', zakres=2, stały automatyczny ref pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=4, identyfikator='SZEROKOSC', zakres=2, automatyczny całk pktWe=null}}
;{ebp-8, 4B, sym:Symbol{nr=5, identyfikator='WYSOKOSC', zakres=2, automatyczny całk pktWe=null}}
;{ebp-12, 4B, sym:Symbol{nr=6, identyfikator='i', zakres=2, automatyczny całk pktWe=null}}
;{ebp-16, 4B, sym:Symbol{nr=7, identyfikator='j', zakres=2, automatyczny całk pktWe=null}}
;{ebp-20, 4B, sym:Symbol{nr=8, identyfikator='tab_fib', zakres=2, automatyczny zespolona [][]pktWe=null}}
;{ebp-24, 4B, sym:Symbol{nr=11, identyfikator='w', zakres=2, automatyczny całk pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:32
;rozmiar_B_zmiennych_automatycznych:24
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
              sub esp, 24
;^robienie ramki stosu
              call P_main_prolog
              ;tu coś może być
              after__main:
;wypisanie w linii8
;wypisanie wyrazenia
;typ wyrazenia:stały automatyczny całk 
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:8 niederef:null false
;symbol:Symbol{nr=3, identyfikator='null', zakres=2, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_3__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii8
;przypisanie11:4
;załadowanie lwartości:11 niederef:true true
;symbol:Symbol{nr=4, identyfikator='SZEROKOSC', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania11:16
;przypisanie12:4
;załadowanie lwartości:12 niederef:true true
;symbol:Symbol{nr=5, identyfikator='WYSOKOSC', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-8];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania12:15
;przypisanie16:4
;załadowanie lwartości:16 niederef:true true
;symbol:Symbol{nr=8, identyfikator='tab_fib', zakres=2, automatyczny zespolona [][]pktWe=null}
                lea eax, [ebp-20];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;alokacja16:14
;załadowanie lwartości:16 niederef:null false
;symbol:Symbol{nr=5, identyfikator='WYSOKOSC', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-8];@B
;koniec ładowania lwartosci
                imul eax,4
                push eax
                call _malloc
                push dword 0
                push eax
                call _memset
                add esp, 12
;koniec alokacji16:40
                pop edx
                mov [edx], eax
;koniec przypisania16:40
;wypisanie w linii17
;wypisanie wyrazenia
;typ wyrazenia:stały automatyczny całk 
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:17 niederef:null false
;symbol:Symbol{nr=9, identyfikator='null', zakres=2, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_9__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii17
;przypisanie19:4
;załadowanie lwartości:19 niederef:true true
;symbol:Symbol{nr=6, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania19:8
;instrukcja dopoki
start_loop_0:
;porównanie:20
;załadowanie lwartości:20 niederef:null false
;symbol:Symbol{nr=5, identyfikator='WYSOKOSC', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-8];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:20 niederef:null false
;symbol:Symbol{nr=6, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:20
cmp eax, 0
je end_loop_0
;przypisanie22:8
;początek elementu tablicy z linii22:8
;załadowanie lwartości:22 niederef:null false
;symbol:Symbol{nr=6, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:22 niederef:null false
;symbol:Symbol{nr=8, identyfikator='tab_fib', zakres=2, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic0;
                push dword 22;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic0:        ;
                pop ecx;indeks tablicy
;B4
        lea eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:false;4
;koniec elementu tablicy z linii22:17
                push eax;lewa strona przypisania
;alokacja22:21
;załadowanie lwartości:22 niederef:null false
;symbol:Symbol{nr=4, identyfikator='SZEROKOSC', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                imul eax,4
                push eax
                call _malloc
                push dword 0
                push eax
                call _memset
                add esp, 12
;koniec alokacji22:46
                pop edx
                mov [edx], eax
;koniec przypisania22:46
;przypisanie25:8
;załadowanie lwartości:25 niederef:true true
;symbol:Symbol{nr=6, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:25
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:25 niederef:null false
;symbol:Symbol{nr=6, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:25
                pop edx
                mov [edx], eax
;koniec przypisania25:14

jmp start_loop_0
end_loop_0:
; koniec dopoki
;wypisanie w linii27
;wypisanie wyrazenia
;typ wyrazenia:stały automatyczny całk 
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:27 niederef:null false
;symbol:Symbol{nr=10, identyfikator='null', zakres=2, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_10__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii27
;przypisanie29:4
;załadowanie lwartości:29 niederef:true true
;symbol:Symbol{nr=6, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania29:8
;przypisanie30:12
;załadowanie lwartości:30 niederef:true true
;symbol:Symbol{nr=11, identyfikator='w', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-24];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:30
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:30 niederef:null false
;symbol:Symbol{nr=4, identyfikator='SZEROKOSC', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:30
                pop edx
                mov [edx], eax
;koniec przypisania30:24
;wypisanie w linii31
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:31 niederef:null false
;symbol:Symbol{nr=12, identyfikator='null', zakres=2, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_12__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;załadowanie lwartości:31 niederef:null false
;symbol:Symbol{nr=11, identyfikator='w', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-24];@B
;koniec ładowania lwartosci
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:31 niederef:null false
;symbol:Symbol{nr=13, identyfikator='null', zakres=2, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_2_13__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii31
;instrukcja dopoki
start_loop_1:
;porównanie:32
;załadowanie lwartości:32 niederef:null false
;symbol:Symbol{nr=4, identyfikator='SZEROKOSC', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:32 niederef:null false
;symbol:Symbol{nr=6, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:32
cmp eax, 0
je end_loop_1
;wypisanie w linii34
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;załadowanie lwartości:34 niederef:null false
;symbol:Symbol{nr=6, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;koniec wypisania w linii34
;wypisanie w linii34
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:34 niederef:null false
;symbol:Symbol{nr=14, identyfikator='null', zakres=4, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_4_14__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii34
;wypisanie w linii35
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;początek uzyskiwania składowej w linii35:13
;początek elementu tablicy z linii35:13
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;początek elementu tablicy z linii35:13
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:35 niederef:null false
;symbol:Symbol{nr=8, identyfikator='tab_fib', zakres=2, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic1;
                push dword 35;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic1:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii35:22
                cmp eax,0;
                jne .nienic2;
                push dword 35;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic2:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii35:25
                cmp eax,0;
                jne .nienic3;
                push dword 35;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic3:        ;
        mov eax, [eax+0];typ:zespolona.całk(kt:0)
;koniec uzyskiwania składowej w linii35:27
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;koniec wypisania w linii35
;wypisanie w linii36
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:36 niederef:null false
;symbol:Symbol{nr=15, identyfikator='null', zakres=4, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_4_15__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii36
;przypisanie38:8
;załadowanie lwartości:38 niederef:true true
;symbol:Symbol{nr=6, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:38
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:38 niederef:null false
;symbol:Symbol{nr=6, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:38
                pop edx
                mov [edx], eax
;koniec przypisania38:12

jmp start_loop_1
end_loop_1:
; koniec dopoki
;przypisanie42:4
;załadowanie lwartości:42 niederef:true true
;symbol:Symbol{nr=6, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania42:8
;instrukcja dopoki
start_loop_2:
;porównanie:43
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:43 niederef:null false
;symbol:Symbol{nr=6, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:43
cmp eax, 0
je end_loop_2
;dealokacja45:12
;początek elementu tablicy z linii45:21
;załadowanie lwartości:45 niederef:null false
;symbol:Symbol{nr=6, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:45 niederef:null false
;symbol:Symbol{nr=8, identyfikator='tab_fib', zakres=2, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic4;
                push dword 45;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic4:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii45:30
                push eax
                call _free
                add esp, 4
                mov eax, 0
;koniec dealokacji45:31
;przypisanie46:12
;załadowanie lwartości:46 niederef:true true
;symbol:Symbol{nr=6, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:46
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:46 niederef:null false
;symbol:Symbol{nr=6, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:46
                pop edx
                mov [edx], eax
;koniec przypisania46:18

jmp start_loop_2
end_loop_2:
; koniec dopoki
;dealokacja48:4
;załadowanie lwartości:48 niederef:null false
;symbol:Symbol{nr=8, identyfikator='tab_fib', zakres=2, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                push eax
                call _free
                add esp, 4
                mov eax, 0
;koniec dealokacji48:20
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
;PROCEDURA Z LINII 51 - 51
;RAMKA STOSU (i parametry) PROCEDURYPf
;
;{ebp+4, 4B, sym:Symbol{nr=19, identyfikator='adres powrotny', zakres=6, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=20, identyfikator='poprzedni ebp', zakres=6, stały automatyczny ref pktWe=null}}
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
section .text
;PROCEDURA Z LINII 53 - 58
;RAMKA STOSU (i parametry) PROCEDURYPpisz_tablice
;
;{ebp+8, 4B, sym:Symbol{nr=22, identyfikator='t', zakres=7, /*parametr*/ automatyczny całk [][]pktWe=null}}
;{ebp+4, 4B, sym:Symbol{nr=23, identyfikator='adres powrotny', zakres=7, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=24, identyfikator='poprzedni ebp', zakres=7, stały automatyczny ref pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:12
;rozmiar_B_zmiennych_automatycznych:0
;rozmiar_B_parametrow:4
;koniec opisu procedury
Ppisz_tablice_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after_pisz_tablice; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
pisz_tablice:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 0
;^robienie ramki stosu
              call Ppisz_tablice_prolog
              ;tu coś może być
              after_pisz_tablice:
;wypisanie w linii56
;wypisanie wyrazenia
;typ wyrazenia:stały automatyczny znak 
;stała znakowa
                mov eax, 0
                mov byte al, `a`
;koniec stałej znakowej
                sub esp, 1
                mov byte [esp], al
                push dword WYPISZ_ZNAK_FMT
                call _printf
                add esp, byte 5
;koniec wypisania - znak
;koniec wypisania w linii56
;instrukcja zwróć()
                call Ppisz_tablice_epilog
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Ppisz_tablice_epilog:
;coś tu może być(epilog)...
ret
section .rodata
__COMPILER_NAME__:  db`kompilator PL/PL (plplk) 1.0 Spero, aut opera...`
__NULL_DEREFERENCE_FMT__:  db`PRÓBA DEREFERENCJI REFERENCJI O WARTOŚCI NIC, CZYLI ZERO (w linii kodu źródłowego:%d)\n`
