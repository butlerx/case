.data
n: .word 1000
str: .asciiz "/n"

CONTROL: .word 0x10000
DATA:    .word 0x10008

.text
main:
   ld r20,CONTROL(r0) ; load CONTROL address
   ld r21,DATA(r0)    ; load DATA address
   ld r19,str(r0)
   ld r1, n(r0)   ; int n = 1000
   daddi r2, r0, 1 ; int i = 1
   daddi r4, r0, 2
   j loop
loop:
   daddi r2, r2, 1
   slt r3, r2, r1
   bnez r3, done
   j maths
maths:
   slt r3, r4, r2
   bnez r3, out
   ddiv r3, r4, r2 ;b mod a
   dmul r3, r3, r2
   dsub r3, r4, r3
   bnez r3, loop
   daddi r4, r4, 1
   j maths
out:
   sd r2,0(r21)       ; set DATA to output value
   daddi r2,r0,2
   sd r2,0(r20)
   sd r19,0(r21)       ; set DATA to output value
   daddi r19,r0,4
   sd r19,0(r20)
   j loop
done:
   halt
