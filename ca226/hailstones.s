;
; Hailstone numbers:
;    http://en.wikipedia.org/wiki/Collatz_conjecture
;
; Start with some positive integer term.
; If term is odd, multiply by 3 and add 1.
; If term is even, divide by 2.
; Repeat until term is 1.
;
; Read the initial term from memory location N.
; Write the largest term encountered back to N.
;
; Note (IMPORTANT):
;    enable forwarding on the simulator
;    enable branch delay slot on the simulator
;
; began:    2097 cycles.
; current:  1779 cycles.

; Algorithm:
;
; int v = N; // N read from memory
;
; while ( true )
; {
;    if ( v % 2 )
;       v = 3 * v + 1; // v was odd
;    else
;       v = v / 2; // v was even
;
;    if ( N < v )
;       N = v; // store new high value back to memory
;
;    if ( v < 2 )
;       break;
; }
;
; // Note: This approach is incorrect if the initial value of N is 1; we'll
; //       just live with this.

.data
N:      .word 27          ; initial term/value

.text
start:
   ld r1,N(r0)       ; r1 = N (r1 is like v)
   andi r3,r1,1      ; is the current term (v, r1) odd or even?
   daddi r2,r0,3     ; r2 = 3
loop:
   beqz r3,even      ; if statement: branch if term is even (r1 % 2 == 0) (v % 2 == 0)
   andi r3,r1,1      ; is the current term (v, r1) odd or even?
; if case
odd:
   dmul r1,r1,r2     ; r1 = r1 * 3
   daddi r1,r1,1     ; r1 = r1 + 1
   j after           ; jump to instruction after "else" branch of the if statement
   ld r4,N(r0)       ; r4 = maximum value encounterd so far
; else case
even:
   dsrl r1,r1,1      ; divide by 2 (r1 = r1 >> 1) (v = v/2)
   ld r4,N(r0)       ; r4 = maximum value encounterd so far
   ; drop through to instruction following the if statement

; after if-then-else
after:
   slt r3,r4,r1      ; compare current term with current maximum
   beqz r3,skip      ; if not new maximum, then skip
   slti r3,r1,2      ; test for finished (r1 < 2) (v < 2)
   sd r1,N(r0)       ; store new maximum

skip:
   beqz r3,loop      ; branch back to loop if not finished (if 2 <= r1, if r3 == 0)
   andi r3,r1,1      ; is the current term (v, r1) odd or even?

   halt              ; done -- maxhail(N) is now in memory location N
                     ; if the initial term (N) was 27, then the hexadecimal value
                     ; in N -- the maximum term encountered -- should
                     ; be 0x2410 (decimal 9232)
