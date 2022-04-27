global _main
extern _printf
extern _pow

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `liczba:%d\n`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .data
Scak_1_0:   dd    3;z
Sznak_1_2:   db    `H`, 0  ;z linii 5
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
              sub esp, 4
;^robienie ramki stosu
              call P_main_prolog
              ;tu coś może być
              after_main:
;wypisanie
                push dword Sznak_1_2
                call _printf
                add esp, byte 4
;koniec wypisania
;stała całkowita
                mov eax,7
;koniec stałej całkowitej
;wpisywanie wyrażenia do jakiegoś ID:6
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
;mnożenie/dzielenie/modulo:8
;załadowanie lwartości:8
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                push eax
;mnożenie/dzielenie/modulo:8
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                push eax
;dodawanie/odejmowanie:8
;stała całkowita
                mov eax,3
;koniec stałej całkowitej
                push eax
;dodawanie/odejmowanie:8
;stała całkowita
                mov eax,2
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:8
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:8
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:8
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:8
                pop ebx
                imul ebx
;koniec mnożenia/dzielenia/modulo:8
;wpisywanie wyrażenia do jakiegoś ID:8
                mov edx, Scak_1_0
                mov [edx], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;wypisanie całk
                sub esp, 4
                mov dword eax, [Scak_1_0]
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
