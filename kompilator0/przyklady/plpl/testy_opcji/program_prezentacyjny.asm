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
Sznak_6_8__P_main:   db    ` `, 0  ;z linii 41
Sznak_6_9__P_main:   db    ` `, 0  ;z linii 44
Sznak_6_10__P_main:   db    `\n`, 0  ;z linii 44
section .text
;PROCEDURA Z LINII 6 - 57
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=11, identyfikator='adres powrotny', zakres=2, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=12, identyfikator='poprzedni ebp', zakres=2, stały automatyczny ref pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=3, identyfikator='SZEROKOSC', zakres=2, automatyczny całk pktWe=null}}
;{ebp-8, 4B, sym:Symbol{nr=4, identyfikator='WYSOKOSC', zakres=2, automatyczny całk pktWe=null}}
;{ebp-12, 4B, sym:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}}
;{ebp-16, 4B, sym:Symbol{nr=6, identyfikator='tab_fib', zakres=2, automatyczny zespolona [][]pktWe=null}}
;{ebp-20, 4B, sym:Symbol{nr=7, identyfikator='j', zakres=2, automatyczny całk pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:28
;rozmiar_B_zmiennych_automatycznych:20
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
              sub esp, 20
;^robienie ramki stosu
              call P_main_prolog
              ;tu coś może być
              after__main:
;przypisanie10:4
;załadowanie lwartości:10 niederef:true true
;symbol:Symbol{nr=3, identyfikator='SZEROKOSC', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania10:16
;przypisanie11:4
;załadowanie lwartości:11 niederef:true true
;symbol:Symbol{nr=4, identyfikator='WYSOKOSC', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-8];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania11:15
;przypisanie15:4
;załadowanie lwartości:15 niederef:true true
;symbol:Symbol{nr=6, identyfikator='tab_fib', zakres=2, automatyczny zespolona [][]pktWe=null}
                lea eax, [ebp-16];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;alokacja15:14
;załadowanie lwartości:15 niederef:null false
;symbol:Symbol{nr=4, identyfikator='WYSOKOSC', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-8];@B
;koniec ładowania lwartosci
                imul eax,4
                push eax
                call _malloc
                push dword 0
                push eax
                call _memset
                add esp, 12
;koniec alokacji15:40
                pop edx
                mov [edx], eax
;koniec przypisania15:40
;przypisanie17:4
;załadowanie lwartości:17 niederef:true true
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania17:8
;instrukcja dopoki
start_loop_0:
;porównanie:18
;załadowanie lwartości:18 niederef:null false
;symbol:Symbol{nr=4, identyfikator='WYSOKOSC', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-8];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:18 niederef:null false
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:18
cmp eax, 0
je end_loop_0
;przypisanie20:8
;początek elementu tablicy z linii20:8
;załadowanie lwartości:20 niederef:null false
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:20 niederef:null false
;symbol:Symbol{nr=6, identyfikator='tab_fib', zakres=2, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic0;
                push dword 20;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic0:        ;
                pop ecx;indeks tablicy
;B4
        lea eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:false;4
;koniec elementu tablicy z linii20:17
                push eax;lewa strona przypisania
;alokacja20:21
;załadowanie lwartości:20 niederef:null false
;symbol:Symbol{nr=3, identyfikator='SZEROKOSC', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                imul eax,4
                push eax
                call _malloc
                push dword 0
                push eax
                call _memset
                add esp, 12
;koniec alokacji20:46
                pop edx
                mov [edx], eax
;koniec przypisania20:46
;przypisanie21:8
;załadowanie lwartości:21 niederef:true true
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:21
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:21 niederef:null false
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:21
                pop edx
                mov [edx], eax
;koniec przypisania21:14

jmp start_loop_0
end_loop_0:
; koniec dopoki
;przypisanie25:4
;załadowanie lwartości:25 niederef:true true
;symbol:Symbol{nr=7, identyfikator='j', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-20];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania25:8
;instrukcja dopoki
start_loop_1:
;porównanie:26
;załadowanie lwartości:26 niederef:null false
;symbol:Symbol{nr=4, identyfikator='WYSOKOSC', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-8];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:26 niederef:null false
;symbol:Symbol{nr=7, identyfikator='j', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:26
cmp eax, 0
je end_loop_1
;przypisanie28:8
;załadowanie lwartości:28 niederef:true true
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania28:12
;instrukcja dopoki
start_loop_2:
;porównanie:29
;załadowanie lwartości:29 niederef:null false
;symbol:Symbol{nr=3, identyfikator='SZEROKOSC', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:29 niederef:null false
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:29
cmp eax, 0
je end_loop_2
;przypisanie31:12
;początek elementu tablicy z linii31:12
;załadowanie lwartości:31 niederef:null false
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii31:12
;załadowanie lwartości:31 niederef:null false
;symbol:Symbol{nr=7, identyfikator='j', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:31 niederef:null false
;symbol:Symbol{nr=6, identyfikator='tab_fib', zakres=2, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic1;
                push dword 31;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic1:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii31:21
                cmp eax,0;
                jne .nienic2;
                push dword 31;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic2:        ;
                pop ecx;indeks tablicy
;B4
        lea eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona  dereferencja_na_końcu:false;4
;koniec elementu tablicy z linii31:24
                push eax;lewa strona przypisania
;alokacja31:28
                mov eax,1
                imul eax,8
                push eax
                call _malloc
                push dword 0
                push eax
                call _memset
                add esp, 12
;koniec alokacji31:42
                pop edx
                mov [edx], eax
;koniec przypisania31:42
;przypisanie32:12
;załadowanie lwartości:32 niederef:true true
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:32
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:32 niederef:null false
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:32
                pop edx
                mov [edx], eax
;koniec przypisania32:18

jmp start_loop_2
end_loop_2:
; koniec dopoki
;przypisanie34:8
;załadowanie lwartości:34 niederef:true true
;symbol:Symbol{nr=7, identyfikator='j', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-20];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:34
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:34 niederef:null false
;symbol:Symbol{nr=7, identyfikator='j', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:34
                pop edx
                mov [edx], eax
;koniec przypisania34:14

jmp start_loop_1
end_loop_1:
; koniec dopoki
;przypisanie38:4
;załadowanie lwartości:38 niederef:true true
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania38:8
;instrukcja dopoki
start_loop_3:
;porównanie:39
;załadowanie lwartości:39 niederef:null false
;symbol:Symbol{nr=3, identyfikator='SZEROKOSC', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:39 niederef:null false
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:39
cmp eax, 0
je end_loop_3
;wypisanie w linii41
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;załadowanie lwartości:41 niederef:null false
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;koniec wypisania w linii41
;wypisanie w linii41
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:41 niederef:null false
;symbol:Symbol{nr=8, identyfikator='null', zakres=6, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_6_8__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii41
;przypisanie42:8
;początek uzyskiwania składowej w linii42:8
;początek elementu tablicy z linii42:8
;załadowanie lwartości:42 niederef:null false
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii42:8
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:42 niederef:null false
;symbol:Symbol{nr=6, identyfikator='tab_fib', zakres=2, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic3;
                push dword 42;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic3:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii42:17
                cmp eax,0;
                jne .nienic4;
                push dword 42;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic4:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii42:20
                cmp eax,0;
                jne .nienic5;
                push dword 42;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic5:        ;
        lea eax, [eax+0];typ:zespolona.całk(kt:0)
;koniec uzyskiwania składowej w linii42:22
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania42:26
;przypisanie43:8
;początek uzyskiwania składowej w linii43:8
;początek elementu tablicy z linii43:8
;załadowanie lwartości:43 niederef:null false
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii43:8
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:43 niederef:null false
;symbol:Symbol{nr=6, identyfikator='tab_fib', zakres=2, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic6;
                push dword 43;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic6:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii43:17
                cmp eax,0;
                jne .nienic7;
                push dword 43;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic7:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii43:20
                cmp eax,0;
                jne .nienic8;
                push dword 43;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic8:        ;
        lea eax, [eax+4];typ:zespolona.całk(kt:0)
;koniec uzyskiwania składowej w linii43:22
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania43:26
;wypisanie w linii44
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;początek uzyskiwania składowej w linii44:13
;początek elementu tablicy z linii44:13
;załadowanie lwartości:44 niederef:null false
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii44:13
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:44 niederef:null false
;symbol:Symbol{nr=6, identyfikator='tab_fib', zakres=2, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic9;
                push dword 44;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic9:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii44:22
                cmp eax,0;
                jne .nienic10;
                push dword 44;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic10:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii44:25
                cmp eax,0;
                jne .nienic11;
                push dword 44;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic11:        ;
        mov eax, [eax+0];typ:zespolona.całk(kt:0)
;koniec uzyskiwania składowej w linii44:27
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;koniec wypisania w linii44
;wypisanie w linii44
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:44 niederef:null false
;symbol:Symbol{nr=9, identyfikator='null', zakres=6, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_6_9__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii44
;wypisanie w linii44
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;początek uzyskiwania składowej w linii44:47
;początek elementu tablicy z linii44:47
;załadowanie lwartości:44 niederef:null false
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii44:47
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:44 niederef:null false
;symbol:Symbol{nr=6, identyfikator='tab_fib', zakres=2, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic12;
                push dword 44;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic12:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii44:56
                cmp eax,0;
                jne .nienic13;
                push dword 44;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic13:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii44:59
                cmp eax,0;
                jne .nienic14;
                push dword 44;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic14:        ;
        mov eax, [eax+4];typ:zespolona.całk(kt:0)
;koniec uzyskiwania składowej w linii44:61
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;koniec wypisania w linii44
;wypisanie w linii44
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:44 niederef:null false
;symbol:Symbol{nr=10, identyfikator='null', zakres=6, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_6_10__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii44
;przypisanie45:8
;załadowanie lwartości:45 niederef:true true
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:45
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:45 niederef:null false
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:45
                pop edx
                mov [edx], eax
;koniec przypisania45:12

jmp start_loop_3
end_loop_3:
; koniec dopoki
;przypisanie49:4
;załadowanie lwartości:49 niederef:true true
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania49:8
;instrukcja dopoki
start_loop_4:
;porównanie:50
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:50 niederef:null false
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:50
cmp eax, 0
je end_loop_4
;dealokacja52:12
;początek elementu tablicy z linii52:21
;załadowanie lwartości:52 niederef:null false
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:52 niederef:null false
;symbol:Symbol{nr=6, identyfikator='tab_fib', zakres=2, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic15;
                push dword 52;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic15:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii52:30
                push eax
                call _free
                add esp, 4
                mov eax, 0
;koniec dealokacji52:31
;przypisanie53:12
;załadowanie lwartości:53 niederef:true true
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:53
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:53 niederef:null false
;symbol:Symbol{nr=5, identyfikator='i', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:53
                pop edx
                mov [edx], eax
;koniec przypisania53:18

jmp start_loop_4
end_loop_4:
; koniec dopoki
;dealokacja55:4
;załadowanie lwartości:55 niederef:null false
;symbol:Symbol{nr=6, identyfikator='tab_fib', zakres=2, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                push eax
                call _free
                add esp, 4
                mov eax, 0
;koniec dealokacji55:20
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
;PROCEDURA Z LINII 58 - 58
;RAMKA STOSU (i parametry) PROCEDURYPf
;
;{ebp+4, 4B, sym:Symbol{nr=14, identyfikator='adres powrotny', zakres=8, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=15, identyfikator='poprzedni ebp', zakres=8, stały automatyczny ref pktWe=null}}
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
;PROCEDURA Z LINII 60 - 65
;RAMKA STOSU (i parametry) PROCEDURYPpisz_tablice
;
;{ebp+8, 4B, sym:Symbol{nr=17, identyfikator='t', zakres=9, /*parametr*/ automatyczny całk [][]pktWe=null}}
;{ebp+4, 4B, sym:Symbol{nr=18, identyfikator='adres powrotny', zakres=9, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=19, identyfikator='poprzedni ebp', zakres=9, stały automatyczny ref pktWe=null}}
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
;wypisanie w linii63
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
;koniec wypisania w linii63
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
__NULL_DEREFERENCE_FMT__:  db`\nPRÓBA DEREFERENCJI REFERENCJI O WARTOŚCI NIC, CZYLI ZERO (w linii kodu źródłowego:%d)\n`
