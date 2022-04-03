	.file	"ackerman.c"
	.intel_syntax noprefix
 # GNU C11 (tdm-1) version 5.1.0 (mingw32)
 #	compiled by GNU C version 5.1.0, GMP version 4.3.2, MPFR version 2.4.2, MPC version 0.8.2
 # GGC heuristics: --param ggc-min-expand=100 --param ggc-min-heapsize=131072
 # options passed:  -iprefix C:/TDM-GCC-32/bin/../lib/gcc/mingw32/5.1.0/
 # -D_REENTRANT ackerman.c -masm=intel -mtune=generic -march=pentiumpro -Og
 # -fverbose-asm
 # options enabled:  -faggressive-loop-optimizations
 # -fasynchronous-unwind-tables -fauto-inc-dec -fchkp-check-incomplete-type
 # -fchkp-check-read -fchkp-check-write -fchkp-instrument-calls
 # -fchkp-narrow-bounds -fchkp-optimize -fchkp-store-bounds
 # -fchkp-use-static-bounds -fchkp-use-static-const-bounds
 # -fchkp-use-wrappers -fcombine-stack-adjustments -fcommon -fcompare-elim
 # -fcprop-registers -fdefer-pop -fdelete-null-pointer-checks
 # -fdwarf2-cfi-asm -fearly-inlining -feliminate-unused-debug-types
 # -fforward-propagate -ffunction-cse -fgcse-lm -fgnu-runtime -fgnu-unique
 # -fguess-branch-probability -fident -finline -finline-atomics
 # -fipa-profile -fipa-pure-const -fipa-reference -fira-hoist-pressure
 # -fira-share-save-slots -fira-share-spill-slots -fivopts
 # -fkeep-inline-dllexport -fkeep-static-consts -fleading-underscore
 # -flifetime-dse -flto-odr-type-merging -fmath-errno -fmerge-constants
 # -fmerge-debug-strings -fomit-frame-pointer -fpeephole
 # -fprefetch-loop-arrays -freg-struct-return
 # -fsched-critical-path-heuristic -fsched-dep-count-heuristic
 # -fsched-group-heuristic -fsched-interblock -fsched-last-insn-heuristic
 # -fsched-rank-heuristic -fsched-spec -fsched-spec-insn-heuristic
 # -fsched-stalled-insns-dep -fschedule-fusion -fsemantic-interposition
 # -fset-stack-executable -fshow-column -fshrink-wrap -fsigned-zeros
 # -fsplit-ivs-in-unroller -fsplit-wide-types -fstdarg-opt
 # -fstrict-volatile-bitfields -fsync-libcalls -ftoplevel-reorder
 # -ftrapping-math -ftree-ccp -ftree-ch -ftree-coalesce-vars
 # -ftree-copy-prop -ftree-copyrename -ftree-cselim -ftree-dce
 # -ftree-dominator-opts -ftree-dse -ftree-forwprop -ftree-fre
 # -ftree-loop-if-convert -ftree-loop-im -ftree-loop-ivcanon
 # -ftree-loop-optimize -ftree-parallelize-loops= -ftree-phiprop
 # -ftree-reassoc -ftree-scev-cprop -ftree-sink -ftree-slsr -ftree-ter
 # -funit-at-a-time -funwind-tables -fverbose-asm -fzero-initialized-in-bss
 # -m32 -m80387 -m96bit-long-double -maccumulate-outgoing-args
 # -malign-double -malign-stringops -mavx256-split-unaligned-load
 # -mavx256-split-unaligned-store -mfancy-math-387 -mfp-ret-in-387
 # -mieee-fp -mlong-double-80 -mms-bitfields -mno-red-zone -mno-sse4
 # -mpush-args -msahf -mstack-arg-probe -mvzeroupper

	.text
	.globl	_ack
	.def	_ack;	.scl	2;	.type	32;	.endef
_ack:
	push	ebx	 #
	sub	esp, 24	 #,
	mov	ebx, DWORD PTR [esp+32]	 # m, m
	mov	eax, DWORD PTR [esp+36]	 # n, n
	test	ebx, ebx	 # m
	jne	L2	 #,
	add	eax, 1	 # ans,
	jmp	L3	 #
L2:
	test	eax, eax	 # n
	jne	L4	 #,
	sub	ebx, 1	 # D.1965,
	mov	DWORD PTR [esp+4], 1	 #,
	mov	DWORD PTR [esp], ebx	 #, D.1965
	call	_ack	 #
	jmp	L3	 #
L4:
	sub	eax, 1	 # D.1965,
	mov	DWORD PTR [esp+4], eax	 #, D.1965
	mov	DWORD PTR [esp], ebx	 #, m
	call	_ack	 #
	sub	ebx, 1	 # D.1965,
	mov	DWORD PTR [esp+4], eax	 #, D.1965
	mov	DWORD PTR [esp], ebx	 #, D.1965
	call	_ack	 #
L3:
	add	esp, 24	 #,
	pop	ebx	 #
	ret
	.def	___main;	.scl	2;	.type	32;	.endef
	.section .rdata,"dr"
LC0:
	.ascii "ackerman(%d %d) is %d\12\0"
	.text
	.globl	_main
	.def	_main;	.scl	2;	.type	32;	.endef
_main:
	push	ebp	 #
	mov	ebp, esp	 #,
	push	esi	 #
	push	ebx	 #
	and	esp, -16	 #,
	sub	esp, 16	 #,
	call	___main	 #
	mov	esi, 0	 # i,
	jmp	L7	 #
L8:
	mov	DWORD PTR [esp+4], ebx	 #, j
	mov	DWORD PTR [esp], esi	 #, i
	call	_ack	 #
	mov	DWORD PTR [esp+12], eax	 #, D.1966
	mov	DWORD PTR [esp+8], ebx	 #, j
	mov	DWORD PTR [esp+4], esi	 #, i
	mov	DWORD PTR [esp], OFFSET FLAT:LC0	 #,
	call	_printf	 #
	add	ebx, 1	 # j,
	jmp	L9	 #
L10:
	mov	ebx, 0	 # j,
L9:
	cmp	ebx, 2	 # j,
	jle	L8	 #,
	add	esi, 1	 # i,
L7:
	cmp	esi, 2	 # i,
	jle	L10	 #,
	mov	eax, 0	 #,
	lea	esp, [ebp-8]	 #,
	pop	ebx	 #
	pop	esi	 #
	pop	ebp	 #
	ret
	.ident	"GCC: (tdm-1) 5.1.0"
	.def	_printf;	.scl	2;	.type	32;	.endef
