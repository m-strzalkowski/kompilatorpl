Pf_prolog:
ret
;koniec prologu

;początek instrukcji w procedurze
;punkt wejściowy
jmp after_f; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
f:
                nop;tutaj konstrukcja ramki na parametry
.noargshuffle:;
                ;robienie ramki
                push ebp;
                mov ebp, esp;
                ;sub esp, <rozmiar zmiennych lokalnych>
                ;^robienie ramki stosu
                call Pmain_prolog;
;tu coś może być
after_main:

;instrukcja wypisz
                push dword napis
                call _printf
                add esp, byte 4
;zwykły kod

;instrukcja zwróć() w zwykłej procedurze
                call Pmain_epilog
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret
;koniec normalnego kodu



;koniec instrukcji w procedurze

Pf_epilog:
ret
;koniec epilogu