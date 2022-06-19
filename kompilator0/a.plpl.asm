global _main
extern _printf
extern _pow
extern _malloc
extern _free
extern _exit

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `%d`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .data
Scak_3_14__P_main:   dd    0;i
Sznak_4_16__P_main:   db    `\t`, 0  ;z linii 53
Sznak_4_17__P_main:   db    `\n`, 0  ;z linii 55
section .text
;PROCEDURA Z LINII 15 - 62
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=18, identyfikator='adres powrotny', zakres=3, stały ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=19, identyfikator='poprzedni ebp', zakres=3, stały ref pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=10, identyfikator='a', zakres=3, automatyczny całk pktWe=null}}
;{ebp-8, 4B, sym:Symbol{nr=11, identyfikator='t', zakres=3, automatyczny całk []pktWe=null}}
;{ebp-12, 4B, sym:Symbol{nr=12, identyfikator='k', zakres=3, automatyczny kot pktWe=null}}
;{ebp-16, 4B, sym:Symbol{nr=13, identyfikator='m', zakres=3, automatyczny kot pktWe=null}}
;{ebp-20, 4B, sym:Symbol{nr=15, identyfikator='j', zakres=3, automatyczny całk pktWe=null}}
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
;przypisanie18:4
;załadowanie lwartości:18 niederef:true true
                lea eax, [ebp-4]
;koniec ładowania lwartosci
                push eax
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania18:6
;alokacja23:4
                mov eax,1
                imul eax,15
                push eax
                call _malloc
                add esp, 4
;koniec alokacji23:12
;alokacja24:4
                mov eax,1
push eax
call _exit
                mov eax,1
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji24:22
;alokacja25:4
                mov eax,1
push eax
call _exit
                mov eax,1
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji25:14
;alokacja26:4
;załadowanie lwartości:26 niederef:null false
                mov eax, [ebp-4]
;koniec ładowania lwartosci
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji26:15
;alokacja27:4
                mov eax,1
push eax
call _exit
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji27:13
;alokacja28:4
                mov eax,1
push eax
call _exit
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji28:15
;alokacja29:4
;załadowanie lwartości:29 niederef:null false
                mov eax, [ebp-4]
;koniec ładowania lwartosci
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji29:16
;alokacja30:4
;stała całkowita
                mov eax,128
;koniec stałej całkowitej
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji30:18
;alokacja31:4
;stała całkowita
                mov eax,256
;koniec stałej całkowitej
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji31:20
;alokacja32:4
                mov eax,1
push eax
call _exit
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji32:19
;alokacja33:4
;dodawanie/odejmowanie:33
              call f.noargshuffle;wywołanie procedury
              add esp, 0;sprzątanie stosu po wywołaniu
                push eax
;dodawanie/odejmowanie:33
;załadowanie lwartości:33 niederef:null false
                mov eax, [ebp-4]
;koniec ładowania lwartosci
                push eax
;stała całkowita
                mov eax,345
;koniec stałej całkowitej
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:33
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:33
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji33:30
;przypisanie34:4
;załadowanie lwartości:34 niederef:true true
                lea eax, [ebp-12]
;koniec ładowania lwartosci
                push eax
;alokacja34:7
                mov eax,1
                imul eax,15
                push eax
                call _malloc
                add esp, 4
;koniec alokacji34:15
                pop edx
                mov [edx], eax
;koniec przypisania34:15
;przypisanie34:18
;załadowanie lwartości:34 niederef:true true
                lea eax, [ebp-16]
;koniec ładowania lwartosci
                push eax
;alokacja34:20
                mov eax,1
                imul eax,15
                push eax
                call _malloc
                add esp, 4
;koniec alokacji34:28
                pop edx
                mov [edx], eax
;koniec przypisania34:28
;przypisanie35:4
;początek elementu tablicy z linii35:4
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
                mov eax,1
push eax
call _exit
                push eax
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania35:11
;przypisanie36:4
;początek uzyskiwania składowej w linii36:4
;załadowanie lwartości:36 niederef:null false
                mov eax, [ebp-12]
;koniec ładowania lwartosci
        lea eax, [eax+1];typ:kot.całk(kt:0)
;koniec uzyskiwania składowej w linii36:6
                push eax
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania36:13
;przypisanie37:4
;początek uzyskiwania składowej w linii37:4
;załadowanie lwartości:37 niederef:null false
                mov eax, [ebp-12]
;koniec ładowania lwartosci
        lea eax, [eax+11];typ:kot.kot(kt:0)
;koniec uzyskiwania składowej w linii37:6
                push eax
;załadowanie lwartości:37 niederef:null false
                mov eax, [ebp-16]
;koniec ładowania lwartosci
                pop edx
                mov [edx], eax
;koniec przypisania37:15
;przypisanie38:4
;początek uzyskiwania składowej w linii38:4
;załadowanie lwartości:38 niederef:null false
                mov eax, [ebp-16]
;koniec ładowania lwartosci
        lea eax, [eax+11];typ:kot.kot(kt:0)
;koniec uzyskiwania składowej w linii38:6
                push eax
;załadowanie lwartości:38 niederef:null false
                mov eax, [ebp-12]
;koniec ładowania lwartosci
                pop edx
                mov [edx], eax
;koniec przypisania38:15
;początek uzyskiwania składowej w linii39:4
                mov eax,1
push eax
call _exit
;przypisanie40:4
;załadowanie lwartości:40 niederef:true true
                lea eax, [ebp-8]
;koniec ładowania lwartosci
                push eax
;alokacja40:8
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
                imul eax,4
                push eax
                call _malloc
                add esp, 4
;koniec alokacji40:21
                pop edx
                mov [edx], eax
;koniec przypisania40:21
;początek elementu tablicy z linii41:4
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:41 niederef:null false
                mov eax, [ebp-8]
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk  dereferencja_na_końcu:true
;koniec elementu tablicy z linii41:7
;przypisanie42:4
;początek elementu tablicy z linii42:4
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:42 niederef:null false
                mov eax, [ebp-8]
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
        lea eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk  dereferencja_na_końcu:false
;koniec elementu tablicy z linii42:7
                push eax
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania42:11
;przypisanie43:4
;początek elementu tablicy z linii43:4
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:43 niederef:null false
                mov eax, [ebp-8]
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
        lea eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk  dereferencja_na_końcu:false
;koniec elementu tablicy z linii43:7
                push eax
;załadowanie lwartości:43 niederef:null false
                mov eax, [ebp-4]
;koniec ładowania lwartosci
                pop edx
                mov [edx], eax
;koniec przypisania43:11
;przypisanie44:4
;początek elementu tablicy z linii44:4
;dodawanie/odejmowanie:44
;stała całkowita
                mov eax,3
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:44 niederef:null false
                mov eax, [ebp-4]
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:44
                push eax
;załadowanie lwartości:44 niederef:null false
                mov eax, [ebp-8]
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
        lea eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk  dereferencja_na_końcu:false
;koniec elementu tablicy z linii44:9
                push eax
;mnożenie/dzielenie/modulo:44
;dodawanie/odejmowanie:44
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:44 niederef:null false
                mov eax, [ebp-4]
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:44
                push eax
;załadowanie lwartości:44 niederef:null false
                mov eax, [ebp-4]
;koniec ładowania lwartosci
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:44
                pop edx
                mov [edx], eax
;koniec przypisania44:19
;instrukcja dopoki
start_loop_0:
;porównanie:47
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:47 niederef:null false
                mov edx, Scak_3_14__P_main
                mov eax, [edx]
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:47
cmp eax, 0
je end_loop_0
;przypisanie51:8
;załadowanie lwartości:51 niederef:true true
                lea eax, [ebp-20]
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii51:12
;załadowanie lwartości:51 niederef:null false
                mov edx, Scak_3_14__P_main
                mov eax, [edx]
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:51 niederef:null false
                mov eax, [ebp-8]
;koniec ładowania lwartosci
                pop ecx;indeks tablicy
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk  dereferencja_na_końcu:true
;koniec elementu tablicy z linii51:15
                pop edx
                mov [edx], eax
;koniec przypisania51:15
;wypisanie całk
                sub esp, 4
                mov dword eax, [Scak_3_14__P_main]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania
;wypisanie
                push dword Sznak_4_16__P_main
                call _printf
                add esp, byte 4
;koniec wypisania
;wypisanie całk
                sub esp, 4
                mov dword eax, [ebp-20]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania
;wypisanie
                push dword Sznak_4_17__P_main
                call _printf
                add esp, byte 4
;koniec wypisania
;przypisanie56:8
;załadowanie lwartości:56 niederef:true true
                lea eax, [Scak_3_14__P_main]
;koniec ładowania lwartosci
                push eax
;dodawanie/odejmowanie:56
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:56 niederef:null false
                mov edx, Scak_3_14__P_main
                mov eax, [edx]
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:56
                pop edx
                mov [edx], eax
;koniec przypisania56:12

jmp start_loop_0
end_loop_0:
; koniec dopoki
;dealokacja59:4
;załadowanie lwartości:59 niederef:null false
                mov eax, [ebp-8]
;koniec ładowania lwartosci
                push eax
                call _free
                add esp, 4
                mov eax, 0
;koniec dealokacji59:14
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
;PROCEDURA Z LINII 63 - 63
;RAMKA STOSU (i parametry) PROCEDURYPf
;
;{ebp+4, 4B, sym:Symbol{nr=21, identyfikator='adres powrotny', zakres=5, stały ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=22, identyfikator='poprzedni ebp', zakres=5, stały ref pktWe=null}}
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
