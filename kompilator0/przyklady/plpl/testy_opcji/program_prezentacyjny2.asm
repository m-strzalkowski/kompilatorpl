extern _free
extern _pow
extern _exit
extern _printf
extern _malloc
extern _memset
global _main

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `%d`, 0  ;
WYPISZ_REF_FMT:   db    `%p`, 0  ;
WYPISZ_NAPIS_FMT:   db    `%s`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .text
;PROCEDURA Z LINII 6 - 19
;RAMKA STOSU (i parametry) PROCEDURYPsilnia_rek
;
;{ebp+8, 4B, sym:Symbol{nr=3, identyfikator='n', zakres=2, /*parametr*/ automatyczny całk pktWe=null}}
;{ebp+4, 4B, sym:Symbol{nr=6, identyfikator='adres powrotny', zakres=2, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=7, identyfikator='poprzedni ebp', zakres=2, stały automatyczny ref pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=5, identyfikator='wynik', zakres=2, automatyczny całk pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:16
;rozmiar_B_zmiennych_automatycznych:4
;rozmiar_B_parametrow:4
;koniec opisu procedury
Psilnia_rek_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after_silnia_rek; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
silnia_rek:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 4
;^robienie ramki stosu
              call Psilnia_rek_prolog
              ;tu coś może być
              after_silnia_rek:

;instrukcja warunkowa w liniach:8-8
;porównanie:8
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:8 niederef:null false
;symbol:Symbol{nr=3, identyfikator='n', zakres=2, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setle al
;koniec porównania:8
cmp eax, 0
je failed_condition_0
;instrukcja zwróć()
                call Psilnia_rek_epilog
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury

failed_condition_0:
; koniec instrukcji warunkowej
;instrukcja zwróć()
                call Psilnia_rek_epilog
;mnożenie/dzielenie/modulo:9
;załadowanie lwartości:9 niederef:null false
;symbol:Symbol{nr=3, identyfikator='n', zakres=2, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                push eax
;parametr n 
;dodawanie/odejmowanie:9
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:9 niederef:null false
;symbol:Symbol{nr=3, identyfikator='n', zakres=2, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:9
;koniec obliczania parametru n 
              push eax; złożenie na stos parametru n
              call silnia_rek.noargshuffle;wywołanie procedury
              add esp, 4;sprzątanie stosu po wywołaniu
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:9
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;punkt wejsciowy
              jmp after_silnia_iter; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
silnia_iter:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 4
;^robienie ramki stosu
              call Psilnia_rek_prolog
              ;tu coś może być
              after_silnia_iter:
;przypisanie12:16
;załadowanie lwartości:12 niederef:true true
;symbol:Symbol{nr=5, identyfikator='wynik', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania12:22
;instrukcja dopoki
start_loop_0:
;porównanie:13
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:13 niederef:null false
;symbol:Symbol{nr=3, identyfikator='n', zakres=2, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setg al
;koniec porównania:13
cmp eax, 0
je end_loop_0
;przypisanie15:8
;załadowanie lwartości:15 niederef:true true
;symbol:Symbol{nr=5, identyfikator='wynik', zakres=2, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;mnożenie/dzielenie/modulo:15
;załadowanie lwartości:15 niederef:null false
;symbol:Symbol{nr=3, identyfikator='n', zakres=2, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:15 niederef:null false
;symbol:Symbol{nr=5, identyfikator='wynik', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:15
                pop edx
                mov [edx], eax
;koniec przypisania15:24
;przypisanie16:8
;załadowanie lwartości:16 niederef:true true
;symbol:Symbol{nr=3, identyfikator='n', zakres=2, /*parametr*/ automatyczny całk pktWe=null}
                lea eax, [ebp+8];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:16
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:16 niederef:null false
;symbol:Symbol{nr=3, identyfikator='n', zakres=2, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:16
                pop edx
                mov [edx], eax
;koniec przypisania16:16

jmp start_loop_0
end_loop_0:
; koniec dopoki
;instrukcja zwróć()
                call Psilnia_rek_epilog
;załadowanie lwartości:18 niederef:null false
;symbol:Symbol{nr=5, identyfikator='wynik', zakres=2, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Psilnia_rek_epilog:
;coś tu może być(epilog)...
ret
section .text
;PROCEDURA Z LINII 21 - 25
;RAMKA STOSU (i parametry) PROCEDURYPwarunek
;
;{ebp+8, 4B, sym:Symbol{nr=9, identyfikator='a', zakres=5, /*parametr*/ automatyczny całk pktWe=null}}
;{ebp+4, 4B, sym:Symbol{nr=10, identyfikator='adres powrotny', zakres=5, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=11, identyfikator='poprzedni ebp', zakres=5, stały automatyczny ref pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:12
;rozmiar_B_zmiennych_automatycznych:0
;rozmiar_B_parametrow:4
;koniec opisu procedury
Pwarunek_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after_warunek; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
warunek:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 0
;^robienie ramki stosu
              call Pwarunek_prolog
              ;tu coś może być
              after_warunek:
;instrukcja zwróć()
                call Pwarunek_epilog
;porównanie:24
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;mnożenie/dzielenie/modulo:24
;stała całkowita
                mov eax,3
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:24 niederef:null false
;symbol:Symbol{nr=9, identyfikator='a', zakres=5, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                pop ebx
                xor edx, edx
                idiv ebx
                mov eax, edx
;koniec mnożenia/dzielenia/modulo:24
                pop ebx
                cmp eax, ebx
                mov eax, 0
                sete al
;koniec porównania:24
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Pwarunek_epilog:
;coś tu może być(epilog)...
ret
section .text
;PROCEDURA Z LINII 27 - 47
;RAMKA STOSU (i parametry) PROCEDURYPwyszukiwanie_binarne
;
;{ebp+20, 4B, sym:Symbol{nr=16, identyfikator='szukana', zakres=6, /*parametr*/ automatyczny całk pktWe=null}}
;{ebp+16, 4B, sym:Symbol{nr=15, identyfikator='kon', zakres=6, /*parametr*/ automatyczny całk pktWe=null}}
;{ebp+12, 4B, sym:Symbol{nr=14, identyfikator='pocz', zakres=6, /*parametr*/ automatyczny całk pktWe=null}}
;{ebp+8, 4B, sym:Symbol{nr=13, identyfikator='t', zakres=6, /*parametr*/ automatyczny całk []pktWe=null}}
;{ebp+4, 4B, sym:Symbol{nr=18, identyfikator='adres powrotny', zakres=6, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=19, identyfikator='poprzedni ebp', zakres=6, stały automatyczny ref pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=17, identyfikator='srodek', zakres=6, automatyczny całk pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:28
;rozmiar_B_zmiennych_automatycznych:4
;rozmiar_B_parametrow:16
;koniec opisu procedury
Pwyszukiwanie_binarne_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after_wyszukiwanie_binarne; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
wyszukiwanie_binarne:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 4
;^robienie ramki stosu
              call Pwyszukiwanie_binarne_prolog
              ;tu coś może być
              after_wyszukiwanie_binarne:

;instrukcja warunkowa w liniach:30-30
;porównanie:30
;załadowanie lwartości:30 niederef:null false
;symbol:Symbol{nr=15, identyfikator='kon', zakres=6, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+16];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:30 niederef:null false
;symbol:Symbol{nr=14, identyfikator='pocz', zakres=6, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+12];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setg al
;koniec porównania:30
cmp eax, 0
je failed_condition_1
;instrukcja zwróć()
                call Pwyszukiwanie_binarne_epilog
;znak:30
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
                neg eax
;koniec znaku:30
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury

failed_condition_1:
; koniec instrukcji warunkowej
;przypisanie33:4
;załadowanie lwartości:33 niederef:true true
;symbol:Symbol{nr=17, identyfikator='srodek', zakres=6, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;mnożenie/dzielenie/modulo:33
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                push eax
;dodawanie/odejmowanie:33
;załadowanie lwartości:33 niederef:null false
;symbol:Symbol{nr=14, identyfikator='pocz', zakres=6, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+12];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:33 niederef:null false
;symbol:Symbol{nr=15, identyfikator='kon', zakres=6, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+16];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:33
                pop ebx
                xor edx, edx
                idiv ebx
;koniec mnożenia/dzielenia/modulo:33
                pop edx
                mov [edx], eax
;koniec przypisania33:28

;instrukcja warunkowa w liniach:34-45
;porównanie:34
;załadowanie lwartości:34 niederef:null false
;symbol:Symbol{nr=16, identyfikator='szukana', zakres=6, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+20];@B
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii34:10
;załadowanie lwartości:34 niederef:null false
;symbol:Symbol{nr=17, identyfikator='srodek', zakres=6, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:34 niederef:null false
;symbol:Symbol{nr=13, identyfikator='t', zakres=6, /*parametr*/ automatyczny całk []pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic0;
                push dword 34;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic0:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:/*parametr*/ automatyczny całk  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii34:18
                pop ebx
                cmp eax, ebx
                mov eax, 0
                sete al
;koniec porównania:34
cmp eax, 0
je failed_condition_2
;instrukcja zwróć()
                call Pwyszukiwanie_binarne_epilog
;załadowanie lwartości:34 niederef:null false
;symbol:Symbol{nr=17, identyfikator='srodek', zakres=6, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury

jmp after_else_2
failed_condition_2:

;instrukcja warunkowa w liniach:37-44
;porównanie:37
;załadowanie lwartości:37 niederef:null false
;symbol:Symbol{nr=16, identyfikator='szukana', zakres=6, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+20];@B
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii37:14
;załadowanie lwartości:37 niederef:null false
;symbol:Symbol{nr=17, identyfikator='srodek', zakres=6, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:37 niederef:null false
;symbol:Symbol{nr=13, identyfikator='t', zakres=6, /*parametr*/ automatyczny całk []pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic1;
                push dword 37;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic1:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:/*parametr*/ automatyczny całk  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii37:22
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setg al
;koniec porównania:37
cmp eax, 0
je failed_condition_3
;instrukcja zwróć()
                call Pwyszukiwanie_binarne_epilog
;parametr szukana 
;załadowanie lwartości:39 niederef:null false
;symbol:Symbol{nr=16, identyfikator='szukana', zakres=6, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+20];@B
;koniec ładowania lwartosci
;koniec obliczania parametru szukana 
              push eax; złożenie na stos parametru szukana
;parametr kon 
;dodawanie/odejmowanie:39
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:39 niederef:null false
;symbol:Symbol{nr=17, identyfikator='srodek', zakres=6, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:39
;koniec obliczania parametru kon 
              push eax; złożenie na stos parametru kon
;parametr pocz 
;załadowanie lwartości:39 niederef:null false
;symbol:Symbol{nr=14, identyfikator='pocz', zakres=6, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+12];@B
;koniec ładowania lwartosci
;koniec obliczania parametru pocz 
              push eax; złożenie na stos parametru pocz
;parametr t 
;załadowanie lwartości:39 niederef:null false
;symbol:Symbol{nr=13, identyfikator='t', zakres=6, /*parametr*/ automatyczny całk []pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
;koniec obliczania parametru t 
              push eax; złożenie na stos parametru t
              call wyszukiwanie_binarne.noargshuffle;wywołanie procedury
              add esp, 16;sprzątanie stosu po wywołaniu
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury

jmp after_else_3
failed_condition_3:
;instrukcja zwróć()
                call Pwyszukiwanie_binarne_epilog
;parametr szukana 
;załadowanie lwartości:43 niederef:null false
;symbol:Symbol{nr=16, identyfikator='szukana', zakres=6, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+20];@B
;koniec ładowania lwartosci
;koniec obliczania parametru szukana 
              push eax; złożenie na stos parametru szukana
;parametr kon 
;załadowanie lwartości:43 niederef:null false
;symbol:Symbol{nr=15, identyfikator='kon', zakres=6, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+16];@B
;koniec ładowania lwartosci
;koniec obliczania parametru kon 
              push eax; złożenie na stos parametru kon
;parametr pocz 
;dodawanie/odejmowanie:43
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:43 niederef:null false
;symbol:Symbol{nr=17, identyfikator='srodek', zakres=6, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:43
;koniec obliczania parametru pocz 
              push eax; złożenie na stos parametru pocz
;parametr t 
;załadowanie lwartości:43 niederef:null false
;symbol:Symbol{nr=13, identyfikator='t', zakres=6, /*parametr*/ automatyczny całk []pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
;koniec obliczania parametru t 
              push eax; złożenie na stos parametru t
              call wyszukiwanie_binarne.noargshuffle;wywołanie procedury
              add esp, 16;sprzątanie stosu po wywołaniu
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury

after_else_3:
; koniec instrukcji warunkowej

after_else_2:
; koniec instrukcji warunkowej
;instrukcja zwróć()
                call Pwyszukiwanie_binarne_epilog
;znak:46
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
                neg eax
;koniec znaku:46
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Pwyszukiwanie_binarne_epilog:
;coś tu może być(epilog)...
ret
section .data
Sznak_17_26__P_main:   db    ` `, 0  ;z linii 110
Sznak_16_27__P_main:   db    `\n`, 0  ;z linii 113
Sznak_12_30__P_main:   db    `Wyniki wyszukiwania binarnego\n`, 0  ;z linii 128
Sznak_25_31__P_main:   db    `szukana w wierszu 0: `, 0  ;z linii 131
Sznak_25_32__P_main:   db    ` jest na pozycji: `, 0  ;z linii 131
Sznak_25_33__P_main:   db    `\n`, 0  ;z linii 132
section .text
;PROCEDURA Z LINII 49 - 144
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=34, identyfikator='adres powrotny', zakres=12, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=35, identyfikator='poprzedni ebp', zakres=12, stały automatyczny ref pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=21, identyfikator='SZEROKOSC', zakres=12, automatyczny całk pktWe=null}}
;{ebp-8, 4B, sym:Symbol{nr=22, identyfikator='WYSOKOSC', zakres=12, automatyczny całk pktWe=null}}
;{ebp-12, 4B, sym:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}}
;{ebp-16, 4B, sym:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}}
;{ebp-20, 4B, sym:Symbol{nr=25, identyfikator='tab_fib', zakres=12, automatyczny zespolona [][]pktWe=null}}
;{ebp-24, 4B, sym:Symbol{nr=28, identyfikator='bufor', zakres=12, automatyczny całk []pktWe=null}}
;{ebp-28, 4B, sym:Symbol{nr=29, identyfikator='szukana', zakres=12, automatyczny całk pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:36
;rozmiar_B_zmiennych_automatycznych:28
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
              sub esp, 28
;^robienie ramki stosu
              call P_main_prolog
              ;tu coś może być
              after__main:
;przypisanie53:4
;załadowanie lwartości:53 niederef:true true
;symbol:Symbol{nr=21, identyfikator='SZEROKOSC', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania53:16
;przypisanie54:4
;załadowanie lwartości:54 niederef:true true
;symbol:Symbol{nr=22, identyfikator='WYSOKOSC', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-8];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania54:15
;przypisanie58:4
;załadowanie lwartości:58 niederef:true true
;symbol:Symbol{nr=25, identyfikator='tab_fib', zakres=12, automatyczny zespolona [][]pktWe=null}
                lea eax, [ebp-20];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;alokacja58:14
;załadowanie lwartości:58 niederef:null false
;symbol:Symbol{nr=22, identyfikator='WYSOKOSC', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-8];@B
;koniec ładowania lwartosci
                imul eax,4
                push eax
                call _malloc
                push dword 0
                push eax
                call _memset
                add esp, 12
;koniec alokacji58:40
                pop edx
                mov [edx], eax
;koniec przypisania58:40
;przypisanie60:4
;załadowanie lwartości:60 niederef:true true
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania60:8
;instrukcja dopoki
start_loop_1:
;porównanie:61
;załadowanie lwartości:61 niederef:null false
;symbol:Symbol{nr=22, identyfikator='WYSOKOSC', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-8];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:61 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:61
cmp eax, 0
je end_loop_1
;przypisanie63:8
;początek elementu tablicy z linii63:8
;załadowanie lwartości:63 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:63 niederef:null false
;symbol:Symbol{nr=25, identyfikator='tab_fib', zakres=12, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic2;
                push dword 63;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic2:        ;
                pop ecx;indeks tablicy
;B4
        lea eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:false;4
;koniec elementu tablicy z linii63:17
                push eax;lewa strona przypisania
;alokacja63:21
;załadowanie lwartości:63 niederef:null false
;symbol:Symbol{nr=21, identyfikator='SZEROKOSC', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                imul eax,4
                push eax
                call _malloc
                push dword 0
                push eax
                call _memset
                add esp, 12
;koniec alokacji63:46
                pop edx
                mov [edx], eax
;koniec przypisania63:46
;przypisanie64:8
;załadowanie lwartości:64 niederef:true true
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:64
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:64 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:64
                pop edx
                mov [edx], eax
;koniec przypisania64:14

jmp start_loop_1
end_loop_1:
; koniec dopoki
;przypisanie67:4
;załadowanie lwartości:67 niederef:true true
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-16];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania67:8
;instrukcja dopoki
start_loop_2:
;porównanie:68
;załadowanie lwartości:68 niederef:null false
;symbol:Symbol{nr=22, identyfikator='WYSOKOSC', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-8];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:68 niederef:null false
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:68
cmp eax, 0
je end_loop_2
;przypisanie70:8
;załadowanie lwartości:70 niederef:true true
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania70:12
;instrukcja dopoki
start_loop_3:
;porównanie:71
;załadowanie lwartości:71 niederef:null false
;symbol:Symbol{nr=21, identyfikator='SZEROKOSC', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:71 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:71
cmp eax, 0
je end_loop_3
;przypisanie73:12
;początek elementu tablicy z linii73:12
;załadowanie lwartości:73 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii73:12
;załadowanie lwartości:73 niederef:null false
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:73 niederef:null false
;symbol:Symbol{nr=25, identyfikator='tab_fib', zakres=12, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic3;
                push dword 73;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic3:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii73:21
                cmp eax,0;
                jne .nienic4;
                push dword 73;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic4:        ;
                pop ecx;indeks tablicy
;B4
        lea eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona  dereferencja_na_końcu:false;4
;koniec elementu tablicy z linii73:24
                push eax;lewa strona przypisania
;alokacja73:28
                mov eax,1
                imul eax,8
                push eax
                call _malloc
                push dword 0
                push eax
                call _memset
                add esp, 12
;koniec alokacji73:42
                pop edx
                mov [edx], eax
;koniec przypisania73:42
;przypisanie74:12
;załadowanie lwartości:74 niederef:true true
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:74
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:74 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:74
                pop edx
                mov [edx], eax
;koniec przypisania74:18

jmp start_loop_3
end_loop_3:
; koniec dopoki
;przypisanie76:8
;załadowanie lwartości:76 niederef:true true
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-16];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:76
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:76 niederef:null false
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:76
                pop edx
                mov [edx], eax
;koniec przypisania76:14

jmp start_loop_2
end_loop_2:
; koniec dopoki
;przypisanie79:4
;załadowanie lwartości:79 niederef:true true
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania79:8
;przypisanie80:4
;załadowanie lwartości:80 niederef:true true
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-16];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania80:6
;instrukcja dopoki
start_loop_4:
;porównanie:81
;załadowanie lwartości:81 niederef:null false
;symbol:Symbol{nr=22, identyfikator='WYSOKOSC', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-8];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:81 niederef:null false
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:81
cmp eax, 0
je end_loop_4
;przypisanie83:8
;załadowanie lwartości:83 niederef:true true
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania83:10
;instrukcja dopoki
start_loop_5:
;porównanie:84
;załadowanie lwartości:84 niederef:null false
;symbol:Symbol{nr=21, identyfikator='SZEROKOSC', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:84 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:84
cmp eax, 0
je end_loop_5

;instrukcja warunkowa w liniach:86-108
;parametr a 
;załadowanie lwartości:86 niederef:null false
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
;koniec obliczania parametru a 
              push eax; złożenie na stos parametru a
              call warunek.noargshuffle;wywołanie procedury
              add esp, 4;sprzątanie stosu po wywołaniu
cmp eax, 0
je failed_condition_4
;przypisanie88:16
;początek uzyskiwania składowej w linii88:16
;początek elementu tablicy z linii88:16
;załadowanie lwartości:88 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii88:16
;załadowanie lwartości:88 niederef:null false
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:88 niederef:null false
;symbol:Symbol{nr=25, identyfikator='tab_fib', zakres=12, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic5;
                push dword 88;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic5:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii88:25
                cmp eax,0;
                jne .nienic6;
                push dword 88;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic6:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii88:28
                cmp eax,0;
                jne .nienic7;
                push dword 88;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic7:        ;
        lea eax, [eax+0];typ:zespolona.całk(kt:0)
;koniec uzyskiwania składowej w linii88:30
                push eax;lewa strona przypisania
;parametr n 
;załadowanie lwartości:88 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
;koniec obliczania parametru n 
              push eax; złożenie na stos parametru n
              call silnia_iter.noargshuffle;wywołanie procedury
              add esp, 4;sprzątanie stosu po wywołaniu
                pop edx
                mov [edx], eax
;koniec przypisania88:47

jmp after_else_4
failed_condition_4:

;instrukcja warunkowa w liniach:92-106
;porównanie:92
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;mnożenie/dzielenie/modulo:92
;stała całkowita
                mov eax,3
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:92 niederef:null false
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                pop ebx
                xor edx, edx
                idiv ebx
                mov eax, edx
;koniec mnożenia/dzielenia/modulo:92
                pop ebx
                cmp eax, ebx
                mov eax, 0
                sete al
;koniec porównania:92
cmp eax, 0
je failed_condition_5
;przypisanie94:20
;początek uzyskiwania składowej w linii94:20
;początek elementu tablicy z linii94:20
;załadowanie lwartości:94 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii94:20
;załadowanie lwartości:94 niederef:null false
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:94 niederef:null false
;symbol:Symbol{nr=25, identyfikator='tab_fib', zakres=12, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic8;
                push dword 94;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic8:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii94:29
                cmp eax,0;
                jne .nienic9;
                push dword 94;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic9:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii94:32
                cmp eax,0;
                jne .nienic10;
                push dword 94;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic10:        ;
        lea eax, [eax+0];typ:zespolona.całk(kt:0)
;koniec uzyskiwania składowej w linii94:34
                push eax;lewa strona przypisania
;parametr n 
;dodawanie/odejmowanie:94
;załadowanie lwartości:94 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:94 niederef:null false
;symbol:Symbol{nr=21, identyfikator='SZEROKOSC', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:94
;koniec obliczania parametru n 
              push eax; złożenie na stos parametru n
              call silnia_rek.noargshuffle;wywołanie procedury
              add esp, 4;sprzątanie stosu po wywołaniu
                pop edx
                mov [edx], eax
;koniec przypisania94:62

jmp after_else_5
failed_condition_5:

;instrukcja warunkowa w liniach:98-105
;porównanie:98
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:98 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:98
cmp eax, 0
je failed_condition_6
;przypisanie100:24
;początek uzyskiwania składowej w linii100:24
;początek elementu tablicy z linii100:24
;załadowanie lwartości:100 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii100:24
;załadowanie lwartości:100 niederef:null false
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:100 niederef:null false
;symbol:Symbol{nr=25, identyfikator='tab_fib', zakres=12, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic11;
                push dword 100;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic11:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii100:33
                cmp eax,0;
                jne .nienic12;
                push dword 100;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic12:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii100:36
                cmp eax,0;
                jne .nienic13;
                push dword 100;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic13:        ;
        lea eax, [eax+0];typ:zespolona.całk(kt:0)
;koniec uzyskiwania składowej w linii100:38
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania100:42

jmp after_else_6
failed_condition_6:
;przypisanie104:24
;początek uzyskiwania składowej w linii104:24
;początek elementu tablicy z linii104:24
;załadowanie lwartości:104 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii104:24
;załadowanie lwartości:104 niederef:null false
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:104 niederef:null false
;symbol:Symbol{nr=25, identyfikator='tab_fib', zakres=12, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic14;
                push dword 104;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic14:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii104:33
                cmp eax,0;
                jne .nienic15;
                push dword 104;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic15:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii104:36
                cmp eax,0;
                jne .nienic16;
                push dword 104;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic16:        ;
        lea eax, [eax+0];typ:zespolona.całk(kt:0)
;koniec uzyskiwania składowej w linii104:38
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:104
;początek uzyskiwania składowej w linii104:62
;początek elementu tablicy z linii104:62
;dodawanie/odejmowanie:104
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:104 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:104
                push eax
;początek elementu tablicy z linii104:62
;załadowanie lwartości:104 niederef:null false
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:104 niederef:null false
;symbol:Symbol{nr=25, identyfikator='tab_fib', zakres=12, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic17;
                push dword 104;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic17:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii104:71
                cmp eax,0;
                jne .nienic18;
                push dword 104;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic18:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii104:76
                cmp eax,0;
                jne .nienic19;
                push dword 104;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic19:        ;
        mov eax, [eax+0];typ:zespolona.całk(kt:0)
;koniec uzyskiwania składowej w linii104:78
                push eax
;początek uzyskiwania składowej w linii104:42
;początek elementu tablicy z linii104:42
;dodawanie/odejmowanie:104
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:104 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:104
                push eax
;początek elementu tablicy z linii104:42
;załadowanie lwartości:104 niederef:null false
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:104 niederef:null false
;symbol:Symbol{nr=25, identyfikator='tab_fib', zakres=12, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic20;
                push dword 104;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic20:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii104:51
                cmp eax,0;
                jne .nienic21;
                push dword 104;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic21:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii104:56
                cmp eax,0;
                jne .nienic22;
                push dword 104;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic22:        ;
        mov eax, [eax+0];typ:zespolona.całk(kt:0)
;koniec uzyskiwania składowej w linii104:58
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:104
                pop edx
                mov [edx], eax
;koniec przypisania104:78

after_else_6:
; koniec instrukcji warunkowej

after_else_5:
; koniec instrukcji warunkowej

after_else_4:
; koniec instrukcji warunkowej
;wypisanie w linii110
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;początek uzyskiwania składowej w linii110:17
;początek elementu tablicy z linii110:17
;załadowanie lwartości:110 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii110:17
;załadowanie lwartości:110 niederef:null false
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:110 niederef:null false
;symbol:Symbol{nr=25, identyfikator='tab_fib', zakres=12, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic23;
                push dword 110;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic23:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii110:26
                cmp eax,0;
                jne .nienic24;
                push dword 110;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic24:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii110:29
                cmp eax,0;
                jne .nienic25;
                push dword 110;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic25:        ;
        mov eax, [eax+0];typ:zespolona.całk(kt:0)
;koniec uzyskiwania składowej w linii110:31
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;koniec wypisania w linii110
;wypisanie w linii110
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:110 niederef:null false
;symbol:Symbol{nr=26, identyfikator='null', zakres=17, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_17_26__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii110
;przypisanie111:12
;załadowanie lwartości:111 niederef:true true
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:111
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:111 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:111
                pop edx
                mov [edx], eax
;koniec przypisania111:16

jmp start_loop_5
end_loop_5:
; koniec dopoki
;wypisanie w linii113
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:113 niederef:null false
;symbol:Symbol{nr=27, identyfikator='null', zakres=16, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_16_27__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii113
;przypisanie114:8
;załadowanie lwartości:114 niederef:true true
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-16];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:114
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:114 niederef:null false
;symbol:Symbol{nr=24, identyfikator='j', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-16];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:114
                pop edx
                mov [edx], eax
;koniec przypisania114:12

jmp start_loop_4
end_loop_4:
; koniec dopoki
;przypisanie117:4
;załadowanie lwartości:117 niederef:true true
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania117:6
;przypisanie119:4
;załadowanie lwartości:119 niederef:true true
;symbol:Symbol{nr=28, identyfikator='bufor', zakres=12, automatyczny całk []pktWe=null}
                lea eax, [ebp-24];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;alokacja119:12
;załadowanie lwartości:119 niederef:null false
;symbol:Symbol{nr=21, identyfikator='SZEROKOSC', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                imul eax,4
                push eax
                call _malloc
                push dword 0
                push eax
                call _memset
                add esp, 12
;koniec alokacji119:32
                pop edx
                mov [edx], eax
;koniec przypisania119:32
;instrukcja dopoki
start_loop_6:
;porównanie:120
;załadowanie lwartości:120 niederef:null false
;symbol:Symbol{nr=21, identyfikator='SZEROKOSC', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:120 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:120
cmp eax, 0
je end_loop_6
;przypisanie122:8
;początek elementu tablicy z linii122:8
;załadowanie lwartości:122 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:122 niederef:null false
;symbol:Symbol{nr=28, identyfikator='bufor', zakres=12, automatyczny całk []pktWe=null}
                mov eax,  [ebp-24];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic26;
                push dword 122;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic26:        ;
                pop ecx;indeks tablicy
;B4
        lea eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny całk  dereferencja_na_końcu:false;4
;koniec elementu tablicy z linii122:15
                push eax;lewa strona przypisania
;początek uzyskiwania składowej w linii122:19
;początek elementu tablicy z linii122:19
;załadowanie lwartości:122 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;początek elementu tablicy z linii122:19
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:122 niederef:null false
;symbol:Symbol{nr=25, identyfikator='tab_fib', zakres=12, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic27;
                push dword 122;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic27:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii122:28
                cmp eax,0;
                jne .nienic28;
                push dword 122;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic28:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona  dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii122:31
                cmp eax,0;
                jne .nienic29;
                push dword 122;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic29:        ;
        mov eax, [eax+0];typ:zespolona.całk(kt:0)
;koniec uzyskiwania składowej w linii122:33
                pop edx
                mov [edx], eax
;koniec przypisania122:33
;przypisanie123:8
;załadowanie lwartości:123 niederef:true true
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:123
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:123 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:123
                pop edx
                mov [edx], eax
;koniec przypisania123:12

jmp start_loop_6
end_loop_6:
; koniec dopoki
;przypisanie127:4
;załadowanie lwartości:127 niederef:true true
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania127:6
;wypisanie w linii128
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:128 niederef:null false
;symbol:Symbol{nr=30, identyfikator='null', zakres=12, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_12_30__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii128
;instrukcja dopoki
start_loop_7:
;porównanie:129
;stała całkowita
                mov eax,7
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:129 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:129
cmp eax, 0
je end_loop_7
;wypisanie w linii131
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:131 niederef:null false
;symbol:Symbol{nr=31, identyfikator='null', zakres=25, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_25_31__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii131
;wypisanie w linii131
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;mnożenie/dzielenie/modulo:131
;stała całkowita
                mov eax,120
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:131 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:131
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;koniec wypisania w linii131
;wypisanie w linii131
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:131 niederef:null false
;symbol:Symbol{nr=32, identyfikator='null', zakres=25, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_25_32__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii131
;wypisanie w linii132
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;parametr szukana 
;mnożenie/dzielenie/modulo:132
;stała całkowita
                mov eax,120
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:132 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:132
;koniec obliczania parametru szukana 
              push eax; złożenie na stos parametru szukana
;parametr kon 
;załadowanie lwartości:132 niederef:null false
;symbol:Symbol{nr=21, identyfikator='SZEROKOSC', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
;koniec obliczania parametru kon 
              push eax; złożenie na stos parametru kon
;parametr pocz 
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
;koniec obliczania parametru pocz 
              push eax; złożenie na stos parametru pocz
;parametr t 
;załadowanie lwartości:132 niederef:null false
;symbol:Symbol{nr=28, identyfikator='bufor', zakres=12, automatyczny całk []pktWe=null}
                mov eax,  [ebp-24];@B
;koniec ładowania lwartosci
;koniec obliczania parametru t 
              push eax; złożenie na stos parametru t
              call wyszukiwanie_binarne.noargshuffle;wywołanie procedury
              add esp, 16;sprzątanie stosu po wywołaniu
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;koniec wypisania w linii132
;wypisanie w linii132
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:132 niederef:null false
;symbol:Symbol{nr=33, identyfikator='null', zakres=25, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_25_33__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;koniec wypisania w linii132
;przypisanie133:8
;załadowanie lwartości:133 niederef:true true
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:133
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:133 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:133
                pop edx
                mov [edx], eax
;koniec przypisania133:12

jmp start_loop_7
end_loop_7:
; koniec dopoki
;przypisanie136:4
;załadowanie lwartości:136 niederef:true true
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania136:8
;instrukcja dopoki
start_loop_8:
;porównanie:137
;załadowanie lwartości:137 niederef:null false
;symbol:Symbol{nr=22, identyfikator='WYSOKOSC', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-8];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:137 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:137
cmp eax, 0
je end_loop_8
;dealokacja139:8
;początek elementu tablicy z linii139:17
;załadowanie lwartości:139 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:139 niederef:null false
;symbol:Symbol{nr=25, identyfikator='tab_fib', zakres=12, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                cmp eax,0;
                jne .nienic30;
                push dword 139;
                push dword __NULL_DEREFERENCE_FMT__
                call _printf
                add esp, byte 8;6*4=24
                push dword 1;
                call _exit;
.nienic30:        ;
                pop ecx;indeks tablicy
;B4
        mov eax, [eax+ecx*4+0];indeksowanie tablicy, typ elementu:automatyczny zespolona [] dereferencja_na_końcu:true;4
;koniec elementu tablicy z linii139:26
                push eax
                call _free
                add esp, 4
                mov eax, 0
;koniec dealokacji139:27
;przypisanie140:8
;załadowanie lwartości:140 niederef:true true
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                lea eax, [ebp-12];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:140
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:140 niederef:null false
;symbol:Symbol{nr=23, identyfikator='i', zakres=12, automatyczny całk pktWe=null}
                mov eax,  [ebp-12];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:140
                pop edx
                mov [edx], eax
;koniec przypisania140:14

jmp start_loop_8
end_loop_8:
; koniec dopoki
;dealokacja142:4
;załadowanie lwartości:142 niederef:null false
;symbol:Symbol{nr=25, identyfikator='tab_fib', zakres=12, automatyczny zespolona [][]pktWe=null}
                mov eax,  [ebp-20];@B
;koniec ładowania lwartosci
                push eax
                call _free
                add esp, 4
                mov eax, 0
;koniec dealokacji142:20
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
;PROCEDURA Z LINII 145 - 145
;RAMKA STOSU (i parametry) PROCEDURYPf
;
;{ebp+4, 4B, sym:Symbol{nr=37, identyfikator='adres powrotny', zakres=27, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=38, identyfikator='poprzedni ebp', zakres=27, stały automatyczny ref pktWe=null}}
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
__NULL_DEREFERENCE_FMT__:  db`\nPRÓBA DEREFERENCJI REFERENCJI O WARTOŚCI NIC, CZYLI ZERO (w linii kodu źródłowego:%d)\n`
