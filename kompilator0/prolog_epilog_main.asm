;nasm -f win32 main.asm -o main.o
;gcc -o main main.o
global _main

extern _printf

section .data
                napis db `Ala ma kota\n\0`
                napis2 db `Prolog\n`,0
                napis3 db `Epilog\n`,0
                msg db "Testing %i...", 0x0a, 0x00

section .text
Pmain_prolog:
                push dword napis2
                call _printf
                add esp, byte 4
                ;sub esp, <rozmiar zmiennych lokalnych>
                ;^robienie ramki stosu
                ret;na tej samej ramce...
;początek instrukcji w procedurze
;
;punkt wejsciowy program
jmp after_main; jeśli sterowanie trafia na wkroczenie, ma go przeskoczyć
_main:
                ;robienie ramki
                push ebp;
                mov ebp, esp;
                ;sub esp, <rozmiar zmiennych lokalnych>
                ;^robienie ramki stosu          
                call Pmain_prolog;
;tu coś może być
after_main:
;zwykły kod

;instrukcja wypisz
                push dword napis
                call _printf
                add esp, byte 4
;zwykły kod
;instrukcja zwróć() w globalnej procedurze
                call Pmain_epilog
                ;niszczenie ramki
                mov esp, ebp
                pop ebp
                ;^niszczenie ramki stosu procedury
                ret
;koniec normalnego kodu
;epilog procedury
Pmain_epilog:
                push dword napis3
                call _printf
                add esp, byte 4
                ;niszczenie ramki stosu procedury
                ret
;nie ma main_argshuffle