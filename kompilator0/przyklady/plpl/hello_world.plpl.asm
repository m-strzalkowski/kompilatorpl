global _main
extern _printf

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `liczba:%d\n`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .text
P_main_prolog:
;coś tu może być...
ret
;mid
;punkt wejsciowy program
              jmp after_main; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
_main:
;robienie ramki
              push ebp;
              mov ebp, esp;
              sub esp, 8
;^robienie ramki stosu
              call P_main_prolog
              ;tu coś może być
              after_main:
;stała znakowa
                mov eax, 0
                mov al,`a`
;koniec stałej znakowej
;wpisywanie wyrażenia do jakiegoś ID:6
                mov [ebp-4], al
;koniec wpisywanie wyrażenia do jakiegoś ID
;wypisanie całk
                sub esp, 4
                mov dword eax, [ebp-4]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania
;dodawanie/odejmowanie:8
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:8
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:8
;wpisywanie wyrażenia do jakiegoś ID:8
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;wypisanie całk
                sub esp, 4
                mov dword eax, [ebp-4]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania
;dodawanie/odejmowanie:10
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:10
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:10
;wpisywanie wyrażenia do jakiegoś ID:10
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;wypisanie całk
                sub esp, 4
                mov dword eax, [ebp-4]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania
;dodawanie/odejmowanie:13
;załadowanie lwartości:13
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                push eax
;stała całkowita
                mov eax,8
;koniec stałej całkowitej
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:13
;wpisywanie wyrażenia do jakiegoś ID:13
                mov [ebp-8], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;wypisanie całk
                sub esp, 4
                mov dword eax, [ebp-8]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania
;dodawanie/odejmowanie:15
;stała całkowita
                mov eax,8
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:15
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                sub eax, ebx
;koniec dodawania/odejmowania:15
;wpisywanie wyrażenia do jakiegoś ID:15
                mov [ebp-8], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;wypisanie całk
                sub esp, 4
                mov dword eax, [ebp-8]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania
;instrukcja zwróć() w globalnej procedurze
              call P_main_epilog
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
P_main_epilog:
;coś tu może być...
ret
section .text
Pf_prolog:
;coś tu może być...
ret
;mid
;instrukcja zwróć() w globalnej procedurze
              call Pf_epilog
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Pf_epilog:
;coś tu może być...
ret
section .text
Pg_prolog:
;coś tu może być...
ret
;mid
;instrukcja zwróć() w globalnej procedurze
              call Pg_epilog
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Pg_epilog:
;coś tu może być...
ret
section .text
Ph_prolog:
;coś tu może być...
ret
;mid
;instrukcja zwróć() w globalnej procedurze
              call Ph_epilog
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Ph_epilog:
;coś tu może być...
ret
