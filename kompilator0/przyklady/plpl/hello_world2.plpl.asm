global _main
extern _printf
extern _pow
extern _malloc
extern _free

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `%d`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .data
Sznak_1_1__P_main:   db    `Hello world!\n`, 0  ;z linii 6
Sznak_1_2__P_main:   db    `Witaj świecie!\n`, 0  ;z linii 7
Sznak_1_3__P_main:   db    `Salve orbi!\n`, 0  ;z linii 8
Scak_1_4__P_main:   dd    1;a
section .text
;PROCEDURA Z LINII 1 - 22
;RAMKA STOSU (i parametry) PROCEDURYP_main
;
;{ebp+4, 4B, sym:Symbol{nr=8, identyfikator='adres powrotny', zakres=1, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=9, identyfikator='poprzedni ebp', zakres=1, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-4, 4B, sym:Symbol{nr=5, identyfikator='b', zakres=1, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-8, 4B, sym:Symbol{nr=6, identyfikator='c', zakres=1, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp-12, 4B, sym:Symbol{nr=7, identyfikator='d', zakres=1, PelnyTyp{typ=Typ{nazwa='całk', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=ZMIENNA, krotnosc_tablicowa=0}pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:20
;rozmiar_B_zmiennych_automatycznych:12
;rozmiar_B_parametrow:0
;koniec opisu procedury
P_main_prolog:
;coś tu może być(prolog)...
ret
;mid
;przypisanie
;załadowanie lwartości:3 niederef:true true
                lea eax, [ebp-4]
;koniec ładowania lwartosc
                push eax
;stała całkowita
                mov eax,33
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;przypisanie
;załadowanie lwartości:4 niederef:true true
                lea eax, [ebp-8]
;koniec ładowania lwartosc
                push eax
;załadowanie lwartości:4 niederef:null false
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop edx
                mov [edx], eax
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
;wypisanie
                push dword Sznak_1_1__P_main
                call _printf
                add esp, byte 4
;koniec wypisania
;wypisanie
                push dword Sznak_1_2__P_main
                call _printf
                add esp, byte 4
;koniec wypisania
;wypisanie
                push dword Sznak_1_3__P_main
                call _printf
                add esp, byte 4
;koniec wypisania
;przypisanie
;załadowanie lwartości:11 niederef:true true
                lea eax, [Scak_1_4__P_main]
;koniec ładowania lwartosc
                push eax
;dodawanie/odejmowanie:11
;stała całkowita
                mov eax,3
;koniec stałej całkowitej
                push eax
;stała całkowita
                mov eax,11
;koniec stałej całkowitej
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:11
                pop edx
                mov [edx], eax
;przypisanie
;załadowanie lwartości:12 niederef:true true
                lea eax, [ebp-4]
;koniec ładowania lwartosc
                push eax
;stała całkowita
                mov eax,22
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;przypisanie
;załadowanie lwartości:13 niederef:true true
                lea eax, [ebp-8]
;koniec ładowania lwartosc
                push eax
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;przypisanie
;załadowanie lwartości:14 niederef:true true
                lea eax, [ebp-12]
;koniec ładowania lwartosc
                push eax
;stała całkowita
                mov eax,44
;koniec stałej całkowitej
                pop edx
                mov [edx], eax
;wypisanie całk
                sub esp, 4
                mov dword eax, [Scak_1_4__P_main]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania
;wypisanie całk
                sub esp, 4
                mov dword eax, [ebp-4]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania
;wypisanie całk
                sub esp, 4
                mov dword eax, [ebp-8]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania
;wypisanie całk
                sub esp, 4
                mov dword eax, [ebp-12]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania
;przypisanie
;załadowanie lwartości:19 niederef:true true
                lea eax, [ebp-12]
;koniec ładowania lwartosc
                push eax
;dodawanie/odejmowanie:19
;stała całkowita
                mov eax,4
;koniec stałej całkowitej
                push eax
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:19
                pop edx
                mov [edx], eax
;wypisanie całk
                sub esp, 4
                mov dword eax, [ebp-12]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania
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
;PROCEDURA Z LINII 23 - 23
;RAMKA STOSU (i parametry) PROCEDURYPf
;
;{ebp+4, 4B, sym:Symbol{nr=11, identyfikator='adres powrotny', zakres=2, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=12, identyfikator='poprzedni ebp', zakres=2, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
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
;PROCEDURA Z LINII 24 - 24
;RAMKA STOSU (i parametry) PROCEDURYPg
;
;{ebp+4, 4B, sym:Symbol{nr=14, identyfikator='adres powrotny', zakres=3, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=15, identyfikator='poprzedni ebp', zakres=3, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:8
;rozmiar_B_zmiennych_automatycznych:0
;rozmiar_B_parametrow:0
;koniec opisu procedury
Pg_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after_g; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
g:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 0
;^robienie ramki stosu
              call Pg_prolog
              ;tu coś może być
              after_g:
;instrukcja zwróć()
                call Pg_epilog
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Pg_epilog:
;coś tu może być(epilog)...
ret
section .text
;PROCEDURA Z LINII 25 - 25
;RAMKA STOSU (i parametry) PROCEDURYPh
;
;{ebp+4, 4B, sym:Symbol{nr=17, identyfikator='adres powrotny', zakres=4, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;{ebp+0, 4B, sym:Symbol{nr=18, identyfikator='poprzedni ebp', zakres=4, PelnyTyp{typ=Typ{nazwa='ref', dlugosc_B=4, atomiczny=true, struktura=null}, rodzaj_pamieci=AUTOMATYCZNA, inicjalizowana=false, parametr_formalny=false, modyfikowalonosc=STALA, krotnosc_tablicowa=0}pktWe=null}}
;rozmiar_B_calej_pamieci_lokalnej:8
;rozmiar_B_zmiennych_automatycznych:0
;rozmiar_B_parametrow:0
;koniec opisu procedury
Ph_prolog:
;coś tu może być(prolog)...
ret
;mid
;punkt wejsciowy
              jmp after_h; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
h:
              nop;tutaj konstrukcja ramki na parametry
.noargshuffle:; punkt wejscia, jesli ma sie nie wykonywac kod konstruujący ramke
;robienie miejsca na zmienne lokalne w ramce
              push ebp;
              mov ebp, esp;
              sub esp, 0
;^robienie ramki stosu
              call Ph_prolog
              ;tu coś może być
              after_h:
;instrukcja zwróć()
                call Ph_epilog
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Ph_epilog:
;coś tu może być(epilog)...
ret
