extern _free
extern _pow
extern _exit
extern _printf
extern _malloc
global _main

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `%d`, 0  ;
WYPISZ_REF_FMT:   db    `%p`, 0  ;
WYPISZ_NAPIS_FMT:   db    `%s`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .text
;PROCEDURA Z LINII 2 - 15
;RAMKA STOSU (i parametry) PROCEDURYPrek
;
;{ebp+8, 4B, sym:Symbol{nr=1, identyfikator='n', zakres=1, /*parametr*/ automatyczny całk pktWe=null}}
;{ebp+4, 4B, sym:Symbol{nr=4, identyfikator='adres powrotny', zakres=1, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=5, identyfikator='poprzedni ebp', zakres=1, stały automatyczny ref pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=3, identyfikator='wynik', zakres=1, automatyczny całk pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:16
;rozmiar_B_zmiennych_automatycznych:4
;rozmiar_B_parametrow:4
;koniec opisu procedury
Prek_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after_rek; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
rek:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 4
;^robienie ramki stosu
              call Prek_prolog
              ;tu coś może być
              after_rek:

;instrukcja warunkowa w liniach:4-4
;porównanie:4
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:4 niederef:null false
;symbol:Symbol{nr=1, identyfikator='n', zakres=1, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setle al
;koniec porównania:4
cmp eax, 0
je failed_condition_0
;instrukcja zwróć()
                call Prek_epilog
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
                call Prek_epilog
;mnożenie/dzielenie/modulo:5
;załadowanie lwartości:5 niederef:null false
;symbol:Symbol{nr=1, identyfikator='n', zakres=1, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                push eax
;parametr n 
;dodawanie/odejmowanie:5
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:5 niederef:null false
;symbol:Symbol{nr=1, identyfikator='n', zakres=1, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:5
;koniec obliczania parametru n 
              push eax; złożenie na stos parametru n
              call rek.noargshuffle;wywołanie procedury
              add esp, 4;sprzątanie stosu po wywołaniu
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:5
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;punkt wejsciowy
              jmp after_iter; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
iter:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 4
;^robienie ramki stosu
              call Prek_prolog
              ;tu coś może być
              after_iter:
;przypisanie8:16
;załadowanie lwartości:8 niederef:true true
;symbol:Symbol{nr=3, identyfikator='wynik', zakres=1, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania8:22
;instrukcja dopoki
start_loop_0:
;porównanie:9
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:9 niederef:null false
;symbol:Symbol{nr=1, identyfikator='n', zakres=1, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setg al
;koniec porównania:9
cmp eax, 0
je end_loop_0
;przypisanie11:8
;załadowanie lwartości:11 niederef:true true
;symbol:Symbol{nr=3, identyfikator='wynik', zakres=1, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;mnożenie/dzielenie/modulo:11
;załadowanie lwartości:11 niederef:null false
;symbol:Symbol{nr=1, identyfikator='n', zakres=1, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:11 niederef:null false
;symbol:Symbol{nr=3, identyfikator='wynik', zakres=1, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:11
                pop edx
                mov [edx], eax
;koniec przypisania11:24
;przypisanie12:8
;załadowanie lwartości:12 niederef:true true
;symbol:Symbol{nr=1, identyfikator='n', zakres=1, /*parametr*/ automatyczny całk pktWe=null}
                lea eax, [ebp+8];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:12
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:12 niederef:null false
;symbol:Symbol{nr=1, identyfikator='n', zakres=1, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:12
                pop edx
                mov [edx], eax
;koniec przypisania12:16

jmp start_loop_0
end_loop_0:
; koniec dopoki
;instrukcja zwróć()
                call Prek_epilog
;załadowanie lwartości:14 niederef:null false
;symbol:Symbol{nr=3, identyfikator='wynik', zakres=1, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Prek_epilog:
;coś tu może być(epilog)...
ret
section .data
Sznak_5_10__P_main:   db    `\n`, 0  ;z linii 21
Sznak_5_11__P_main:   db    `:`, 0  ;z linii 21
Sznak_5_12__P_main:   db    ` : `, 0  ;z linii 21
section .text
;PROCEDURA Z LINII 16 - 25
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=13, identyfikator='adres powrotny', zakres=4, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=14, identyfikator='poprzedni ebp', zakres=4, stały automatyczny ref pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=7, identyfikator='i', zakres=4, automatyczny całk pktWe=null}}
;{ebp-8, 4B, sym:Symbol{nr=8, identyfikator='wr', zakres=4, automatyczny całk pktWe=null}}
;{ebp-12, 4B, sym:Symbol{nr=9, identyfikator='wi', zakres=4, automatyczny całk pktWe=null}}
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
;przypisanie18:18
;załadowanie lwartości:18 niederef:true true
;symbol:Symbol{nr=7, identyfikator='i', zakres=4, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania18:20
;instrukcja dopoki
start_loop_1:
;porównanie:19
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:19 niederef:null false
;symbol:Symbol{nr=7, identyfikator='i', zakres=4, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:19
cmp eax, 0
je end_loop_1
;wypisanie w linii21
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:21 niederef:null false
;symbol:Symbol{nr=10, identyfikator='null', zakres=5, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_5_10__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;załadowanie lwartości:21 niederef:null false
;symbol:Symbol{nr=7, identyfikator='i', zakres=4, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:21 niederef:null false
;symbol:Symbol{nr=11, identyfikator='null', zakres=5, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_5_11__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;parametr n 
;załadowanie lwartości:21 niederef:null false
;symbol:Symbol{nr=7, identyfikator='i', zakres=4, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
;koniec obliczania parametru n 
              push eax; złożenie na stos parametru n
              call rek.noargshuffle;wywołanie procedury
              add esp, 4;sprzątanie stosu po wywołaniu
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;wypisanie wyrazenia
;typ wyrazenia:stały statyczny znak [] /*inicjalizowany*/ 
;załadowanie lwartości:21 niederef:null false
;symbol:Symbol{nr=12, identyfikator='null', zakres=5, stały statyczny znak [] /*inicjalizowany*/ pktWe=null}
                lea eax, [Sznak_5_12__P_main];@C
;koniec ładowania lwartosci
                push eax;wartosc na stos
                push dword WYPISZ_NAPIS_FMT
                call _printf
                add esp, byte 8
;koniec wypisania wyrazenia - string ograniczony do 64 znaków
;wypisanie wyrazenia
;typ wyrazenia:automatyczny całk 
;parametr n 
;załadowanie lwartości:21 niederef:null false
;symbol:Symbol{nr=7, identyfikator='i', zakres=4, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
;koniec obliczania parametru n 
              push eax; złożenie na stos parametru n
              call iter.noargshuffle;wywołanie procedury
              add esp, 4;sprzątanie stosu po wywołaniu
                sub esp, 4
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania - całk
;koniec wypisania w linii21
;przypisanie22:8
;załadowanie lwartości:22 niederef:true true
;symbol:Symbol{nr=7, identyfikator='i', zakres=4, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:22
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:22 niederef:null false
;symbol:Symbol{nr=7, identyfikator='i', zakres=4, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:22
                pop edx
                mov [edx], eax
;koniec przypisania22:12

jmp start_loop_1
end_loop_1:
; koniec dopoki
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
;PROCEDURA Z LINII 27 - 38
;RAMKA STOSU (i parametry) PROCEDURYPsilnia_it
;
;{ebp+8, 4B, sym:Symbol{nr=16, identyfikator='n', zakres=6, /*parametr*/ automatyczny całk pktWe=null}}
;{ebp+4, 4B, sym:Symbol{nr=18, identyfikator='adres powrotny', zakres=6, stały automatyczny ref pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=19, identyfikator='poprzedni ebp', zakres=6, stały automatyczny ref pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=17, identyfikator='wynik', zakres=6, automatyczny całk pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:16
;rozmiar_B_zmiennych_automatycznych:4
;rozmiar_B_parametrow:4
;koniec opisu procedury
Psilnia_it_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after_silnia_it; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
silnia_it:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 4
;^robienie ramki stosu
              call Psilnia_it_prolog
              ;tu coś może być
              after_silnia_it:
;przypisanie31:16
;załadowanie lwartości:31 niederef:true true
;symbol:Symbol{nr=17, identyfikator='wynik', zakres=6, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;koniec przypisania31:22
;instrukcja dopoki
start_loop_2:
;porównanie:32
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:32 niederef:null false
;symbol:Symbol{nr=16, identyfikator='n', zakres=6, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setg al
;koniec porównania:32
cmp eax, 0
je end_loop_2
;przypisanie34:8
;załadowanie lwartości:34 niederef:true true
;symbol:Symbol{nr=17, identyfikator='wynik', zakres=6, automatyczny całk pktWe=null}
                lea eax, [ebp-4];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;mnożenie/dzielenie/modulo:34
;załadowanie lwartości:34 niederef:null false
;symbol:Symbol{nr=16, identyfikator='n', zakres=6, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                push eax
;załadowanie lwartości:34 niederef:null false
;symbol:Symbol{nr=17, identyfikator='wynik', zakres=6, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:34
                pop edx
                mov [edx], eax
;koniec przypisania34:24
;przypisanie35:8
;załadowanie lwartości:35 niederef:true true
;symbol:Symbol{nr=16, identyfikator='n', zakres=6, /*parametr*/ automatyczny całk pktWe=null}
                lea eax, [ebp+8];@A
;koniec ładowania lwartosci
                push eax;lewa strona przypisania
;dodawanie/odejmowanie:35
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:35 niederef:null false
;symbol:Symbol{nr=16, identyfikator='n', zakres=6, /*parametr*/ automatyczny całk pktWe=null}
                mov eax,  [ebp+8];@B
;koniec ładowania lwartosci
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:35
                pop edx
                mov [edx], eax
;koniec przypisania35:16

jmp start_loop_2
end_loop_2:
; koniec dopoki
;instrukcja zwróć()
                call Psilnia_it_epilog
;załadowanie lwartości:37 niederef:null false
;symbol:Symbol{nr=17, identyfikator='wynik', zakres=6, automatyczny całk pktWe=null}
                mov eax,  [ebp-4];@B
;koniec ładowania lwartosci
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Psilnia_it_epilog:
;coś tu może być(epilog)...
ret
section .rodata
__COMPILER_NAME__:  db`kompilator PL/PL (plplk) 1.0 Spero, aut opera...`
