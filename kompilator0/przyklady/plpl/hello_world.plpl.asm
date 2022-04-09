global _main
extern _printf

section .data
Sznak_1_1:   db    `Hello world!\n`, 0  ;z linii 4
Sznak_1_2:   db    `Witaj świecie!\n`, 0  ;z linii 5
Sznak_1_3:   db    `Salve orbi!\n`, 0  ;z linii 6
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
              ;sub esp, 0
;^robienie ramki stosu
              call P_main_prolog
              ;tu coś może być
              after_main:
;wypisanie
                push dword Sznak_1_1
                call _printf
                add esp, byte 4
;koniec wypisania
;wypisanie
                push dword Sznak_1_2
                call _printf
                add esp, byte 4
;koniec wypisania
;wypisanie
                push dword Sznak_1_3
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
