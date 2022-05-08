global _main
extern _printf
extern _pow

;dodatki dla wypisz
section .rodata
WYPISZ_CALK_FMT:   db    `liczba:%d\n`, 0  ;
WYPISZ_ZNAK_FMT:   db    `znak:%c\n`, 0  ;
;koniec dodatków
section .data
Sznak_2_1:   db    `JESTEM W JESLI`, 0  ;z linii 4
Sznak_3_3:   db    `JESTEM W DOPOKI`, 0  ;z linii 7
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

;instrukcja jesli
;stała całkowita
                mov eax,1
;koniec stałej całkowitej
cmp eax, 0
je inaczej0

inaczej0:
; koniec instrukcji warunkowej
;instrukcja dopoki
petla0:
;załadowanie lwartości:7
                mov eax, [ebp-4]
;koniec ładowania lwartosc
cmp eax, 0
je po_petli0

jmp petla0
po_petli0:
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
