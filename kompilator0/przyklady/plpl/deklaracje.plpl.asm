global _main
extern _printf

section .data
Scak_0_0:   dd    2567;R
section .bss
Scak_0_1:   resb    4;b
Scak_0_2:   resb    4;ztrupa
Scak_0_3:   resb    4;dziwność
section .data
Sznak_1_5:   db    `ala ma kota`, 0  ;z linii 17
Sznak_1_12:   db    'z';z
Srzeczyw_1_14:   dd    3.0;x
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
                push dword Sznak_1_5
                call _printf
                add esp, byte 4
;koniec wypisania
nullnullnullnullnullnullnullnullnull;instrukcja zwróć() w globalnej procedurze
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
