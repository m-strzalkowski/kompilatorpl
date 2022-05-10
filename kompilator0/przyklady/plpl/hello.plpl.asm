global _main
extern _printf
extern _pow

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `liczba:%d\n`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .data
Sznak_2_1:   db    `JESTEM W JEŚLI`, 0  ;z linii 4
Sznak_3_3:   db    `JESTEM W DOPÓKI`, 0  ;z linii 9
Sznak_4_4:   db    `ALE TO JESZCZE DALEKO\n`, 0  ;z linii 11
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

;instrukcja warunkowa w liniach:4-4
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
cmp eax, 0
je failed_condition_0
;wypisanie
                push dword Sznak_2_1
                call _printf
                add esp, byte 4
;koniec wypisania

failed_condition_0:
; koniec instrukcji warunkowej
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
;wpisywanie wyrażenia do jakiegoś ID:6
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;instrukcja dopoki
start_loop_0:
;porównanie:7
;stała całkowita
                mov eax,10
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:7
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setle al
;koniec porównania:7
cmp eax, 0
je end_loop_0
;wypisanie
                push dword Sznak_3_3
                call _printf
                add esp, byte 4
;koniec wypisania
;wypisanie całk
                sub esp, 4
                mov dword eax, [ebp-4]
                mov dword [esp], eax
                push dword WYPISZ_CALK_FMT
                call _printf
                add esp, byte 8
;koniec wypisania

;instrukcja warunkowa w liniach:11-11
;porównanie:11
;stała całkowita
                mov eax,3
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:11
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                cmp eax, ebx
                mov eax, 0
                setl al
;koniec porównania:11
cmp eax, 0
je failed_condition_1
;wypisanie
                push dword Sznak_4_4
                call _printf
                add esp, byte 4
;koniec wypisania

failed_condition_1:
; koniec instrukcji warunkowej
;dodawanie/odejmowanie:12
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
                push eax
;załadowanie lwartości:12
                mov eax, [ebp-4]
;koniec ładowania lwartosc
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:12
;wpisywanie wyrażenia do jakiegoś ID:12
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID

jmp start_loop_0
end_loop_0:
; koniec dopoki
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
