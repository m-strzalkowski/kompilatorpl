global _main
extern _printf
extern _pow

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `liczba:%d\n`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .data
Scak_0_2:   dd    0;t_globalne
section .bss
Srzeczyw_0_0:   resb    4;cz_rzeczywista
Srzeczyw_0_1:   resb    4;cz_urojona
section .data
Scak_1_3:   dd    0;t
section .text
Pf_prolog:
;coś tu może być...
ret
;mid
;stała całkowita
                mov eax,0
;koniec stałej całkowitej
;wpisywanie wyrażenia do jakiegoś ID:13
                mov [ebp+8], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
;dodawanie/odejmowanie:15
;załadowanie lwartości:15
                mov edx, Scak_1_3
                mov eax, [edx]
;koniec ładowania lwartosc
                push eax
;załadowanie lwartości:15
                mov edx, Scak_0_2
                mov eax, [edx]
;koniec ładowania lwartosc
                pop ebx
                add eax, ebx
;koniec dodawania/odejmowania:15
;wpisywanie wyrażenia do jakiegoś ID:15
                mov [ebp-4], eax
;koniec wpisywanie wyrażenia do jakiegoś ID
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
              sub esp, 0
;^robienie ramki stosu
              call P_main_prolog
              ;tu coś może być
              after_main:
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
