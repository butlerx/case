.data
a: .word 48
b: .word 18 ; The GCD is 6.

CONTROL: .word 0x10000
DATA:    .word 0x10008

.text
main:
   ld r20,CONTROL(r0) ; load CONTROL address
   ld r21,DATA(r0)    ; load DATA address
   ld r1, a(r0)
   ld r2, b(r0)
   slt r3,r2,r1   ; set r3 if b < a
   bnez r3, less ; stop if r1 < r2
   j great
great:
   ddiv r3, r1, r2 ;a mod b
   dmul r3, r3, r2
   dsub r3, r1, r3
   daddi r1, r2, 0
   daddi r2, r3, 0
   bnez r2, great
   j done
less:
   ddiv r3, r2, r1 ;b mod a
   dmul r3, r3, r1
   dsub r3, r2, r3
   daddi r2, r1, 0
   daddi r1, r3, 0
   bnez r1, less
   j ldone
ldone:
   daddi r1, r2, 0
   j done
done:
   sd r1,0(r21)       ; set DATA to output value
   daddi r1,r0,2
   sd r1,0(r20)
   halt
