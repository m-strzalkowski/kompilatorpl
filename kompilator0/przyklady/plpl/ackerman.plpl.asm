global _main
extern _printf

section .text
Pack_prolog:
;coś tu może być...
ret
;mid
null;instrukcja zwróć() w globalnej procedurze
              call Pack_epilog
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret; wyjście z procedury
;/mid
Pack_epilog:
;coś tu może być...
ret
section .data
Sznak_5_5:   db    `Jestem strasznie szybkim komputerem.`, 0  ;z linii 27
section .text
P_main_prolog:
;coś tu może być...
ret
;mid
nullnull;punkt wejsciowy program
              jmp after_main; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
_main:
;robienie ramki
              push ebp;
              mov ebp, esp;
              ;sub esp, 0
;^robienie ramki stosu
              call P_main_prolog
              ;tu coś może być
              after_main:
;wypisanie
                push dword Sznak_5_5
                call _printf
                add esp, byte 4
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
