.data

;
; Sort values a[0] though a[N-1] (inclusive) using selection sort.  Run the
; program and observe that the array (beginning at a0) is sorted.
;
; 1248 cycles, no stalls.

N:      .word 20

a0:     .word 23      ; a[0]
        .word 12      ; a[1]
        .word 19      ; a[2]
        .word 9       ; .
        .word 98      ; .
        .word 4       ; .
        .word 7
        .word 9
        .word 30405
        .word 21
        .word 16288
        .word 26483
        .word 9982
        .word 261
        .word 5025
        .word 18825
        .word 30405
        .word 9575
        .word 9575
        .word 25247   ; a[19]

.text
      ; r1 is the address of the i-th element (like main loop counter, address of a[i])
      ; r2 is the address after the last element in array (address of a[N], after end of array)
      ; r3 is the address of a candidate minimum value during the inner loop (address of a[mi])
      ; r4 is the address of the j-th element (like inner loop counter, address of a[j])
      ; r5 is the address of the second last element in array (address of a[N-2])
      ; r6 is current largest value (a[mi]) during and after inner loop

start:                    ; set up r1 (like i = 0)
      daddi r1,r0,a0      ; r1 = address of a[0]

                          ; set up r2
      ld r8,N(r0)         ; r8 = N
      daddi r2,r0,a0      ; r2 = address of a[0]
      dsll r8,r8,3        ; r8 = r8 * 8 (because there are 8 bytes per word)
      dadd r2,r2,r8       ; r2 = r2 + r8, address of a[N]
      daddi r5,r2,-16     ; address of second last element in array

main:                     ; start of the outer loop
      daddi r3,r1,0       ; r3 = r1 (position of minimum element), like mi = i
      daddi r4,r1,8       ; r4 = r1, like j = i+1
      ld r6,0(r3)
      ld r10,0(r4)        ; r10 = a[j]

loop:                     ; start of the inner loop
      beq r4,r2,done_loop ; done if j == N

      slt r12,r10,r6      ; set r12 if a[j] < a[mi]; set r12 if found new minimum
      daddi r4,r4,8       ; like j = j + 1
      beqz r12,loop       ; next iteration of inner loop unless found new minimum
      ld r10,0(r4)        ; r10 = a[j]

      daddi r3,r4,-8      ; r3 = r4-8, like mi = j
      j loop              ; next iteration of inner loop
      ld r6,0(r3)         ; reload this, allows r10 to be preloaded earlier

done_loop:                ; done inner loop, swap elements, swap a[i] with a[mi]
      ld r10,0(r1)        ; r10   = a[i]
      sd r10,0(r3)        ; a[mi] = r10, which is old a[i]
      sd r6,0(r1)         ; a[i]  = r6,  which is old a[mi]

next_main:                ; move on to the next iteration of the outer loop
      bne r1,r5,main      ; loop back to the main loop unless i == N-2
      daddi r1,r1,8       ; r1 = r1 + 8, like i = i + 1

done:                     ; done
      halt                ; halt
