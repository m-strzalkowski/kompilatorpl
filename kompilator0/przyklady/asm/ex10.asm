global _main

extern _printf

section .data
    msg db "Testing %i...", 0x0a, 0x00

_main:
    push ebp
    mov ebp, esp
    push 123
    push msg
    call _printf
    mov eax, 0
    mov esp, ebp
    pop ebp
    ret