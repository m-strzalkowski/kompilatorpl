global _main
extern _printf

section .text
P_main_prolog:
;coś tu może być...
ret
;mid
null;punkt wejsciowy program
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
