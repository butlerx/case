.data
N:      .word 27
.text

# 1134 -> 1024 cycles.

start:  ld r1,N(r0)
        ld r10,N(r0)

        andi r3,r1,1 ; Move this BEFORE loop.
                     ; But add it in the delay slot of *every* jump to "loop", below.

loop:   bnez r3,odd  ; Note: this ALWAYS results in a branch RAW stall.
        slti r5,r1,3 ; Use r5, instead of r3 (not significant here).

even:
        andi r3,r1,2
        beqz r5,loop ; Use r5, instead of r3 (not significant here).
        dsrl r1,r1,1


done:   sd r10,N(r0)
        halt

odd:    dadd r2,r1,r1
        daddi r3,r1,1
        dadd r1,r2,r3

        slt r6,r10,r1
        dsrl r1,r1,1
        beqz r6,loop
        andi r3,r1,1 ; Make good use of delay slot, was nop.

max:    daddi r10,r1,0 ; This is now wrong, because we've already divided by 2!
        j loop
        dsll r10,r10,1 ; So compensate by multiplying by 2.
