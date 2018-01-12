;
; Background
; ==========

; Below is an array (a0) of 50 values, each value in the range [0,50).
; So the smallest possible value is 0, and the largest is 49.
;
; The mode of a data set is the most frequently occurring value:
;    - http://en.wikipedia.org/wiki/Mode_(statistics)#Mode_of_a_sample
;
; Task
; ====

; Set memory location M to the mode of the values in array a0.
;    - You may assume that a unique mode exists.
;    - You may assume that the values are in exactly the range [0,50).
;    - You may assume that N (50, here) is even.
;      *** THIS IS SIGNIFICANT! ***
;
; With the sample data (below), the mode is 10, hexadecimal "a".
;
; Currently:
;    - 773 cycles including 201 stalls.
;    - Known to be possible with 424 cycles and no stalls.
;
; Rough Approach
; ==============
;
; Because the range of possible values is relatively small, we count the number
; of times each value occurs (keeping track of the value with the highest count).
; This allows us to find the mode in a single pass.
;
; {
;    int a[50];   // initialised in memory
;    int CNT[50]; // initialised in memory to zeros
;                 // CNT[v] is the number of times v occurs in the data set
;
;    int i;
;    int c = 0;   // r2, count of most frequently occurring value so far
;    int m = 0;   // r3, most frequently occurring value so far
;
;    for (i=0; i<N; i+=1)
;    {
;       int v = a[i];
;       CNT[v] += 1;
;
;       if ( c < CNT[v] )
;       {
;          c = CNT[v];
;          m = v;
;       }
;    }
;
;    return m; // or write m to memory location M
; }
;
; Registers
; =========
;     r1: memory address of array elements, like i
;     r2: count of most frequently occurring value encountered so far, like c
;     r3: most frequently occurring value encountered so far, like v
;     r4: address of a[N], after the end of the array
;

.text
      ld    r4,N(r0)   ; r4 = N
      dsll  r4,r4,3    ; r4 = N*8 = 400 (8 bytes per word)
      daddi r4,r4,a0   ; r4 = address of a[N], after end of array

      daddi r1,r0,a0   ; r1 = address of a[0]
      daddi r2,r0,0    ; r2 = count of most frequently occurring value so far
      daddi r3,r0,0    ; r3 = most frequently occurring value so far
      ld    r6,0(r1)   ; load new value from array

loop:
      ld    r9,8(r1)   ; load new value from array
      dsll  r6,r6,3    ; r6 = 8 * new value (so r6 can be used as an offset/index into CNT)

      daddi r7,r7,1    ; add one, like CNT[v] += 1
      dsll  r9,r9,3    ; r6 = 8 * new value (so r6 can be used as an offset/index into CNT)
      sd    r7,CNT(r6) ; store new count back to memory
      daddi r10,r10,1    ; add one, like CNT[v] += 1

      slt   r8,r2,r7   ; set r8 if new count (r7) exceeds count of most frequently occurring value so far (r2)
      sd    r10,CNT(r9) ; store new count back to memory
      bnez  r8,next1    ; branch if we have a new maximum count
      slt   r11,r2,r10   ; set r8 if new count (r7) exceeds count of most frequently occurring value so far (r2)
      bnez  r11,next2    ; branch if we don't have a new maximum count

next:
      daddi r1,r1,8    ; move on to the next element in the array
      bne   r1,r4,loop ; branch back to top if we're not yet done
      ld    r6,0(r1)   ; load new value from array

next1:
                        ; we have a new maximum count!
      daddi r2,r7,0     ; keep a copy of the new maximum count, like c = CNT[v]
      dsrl  r3,r6,3     ; keep a copy of the new maximum value, like m = v
                        ; (but recalling that r6 was previously multiplied by 8,
                        ;  so compensate by dividing by 8 here)
      j next
next2:
                        ;we have a new maximum count!
      daddi r2,r10,0    ; keep a copy of the new maximum count, like c = CNT[v]
      dsrl  r3,r9,3    ; keep a copy of the new maximum value, like m = v
                       ; (but recalling that r6 was previously multiplied by 8,
                       ;  so compensate by dividing by 8 here)
      j next
done:
      sd    r3,M(r0)   ; store mode to memory
      halt             ; done

.data

N:    .word 50
M:    .word 0          ; result, the mode of the values in array a

a0:   .word 36         ; a[0]
      .word 42         ; a[1]
      .word 45         ; a[2]
      .word 20         ; .
      .word 10         ; .
      .word 18         ; .
      .word 23
      .word 6
      .word 20
      .word 19
      .word 33
      .word 23
      .word 42
      .word 13
      .word 30
      .word 46
      .word 32
      .word 2
      .word 5
      .word 3
      .word 46
      .word 48
      .word 4
      .word 33
      .word 22
      .word 27
      .word 13
      .word 48
      .word 28
      .word 6
      .word 32
      .word 14
      .word 48
      .word 10
      .word 16
      .word 0
      .word 10
      .word 21
      .word 39
      .word 10
      .word 40
      .word 4
      .word 3
      .word 33
      .word 17
      .word 15
      .word 10
      .word 0
      .word 1
      .word 16         ; a[49]

CNT:  .space 400       ; space for an array for 50 64-bit values
                       ; 50 * 8 == 400
