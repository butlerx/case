.data
n: .word 20      ; There are 20 elements in array "a".
a: .word 23      ; a[0]
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

  CONTROL: .word 0x10000
  DATA:    .word 0x10008

.text
main:
   ; load memory-mapped IO addresses
   ld r20,CONTROL(r0)
   ld r21,DATA(r0)
   daddi r2,r0,0 ; i
   ld r1, n(r0)
loopAdd:
   l.d f1,a(r2)
   add.d f2, f2, f1
   daddi r2, r2, 1 ;
   beq r2, r1, done
   j loopAdd
done:
   l.d f3, n(r0)
   div.d f2, f2, f3
   s.d f2,0(r21)     ; set DATA to output value (address of string, here)
   daddi r1,r0,3
   sd r1,0(r20)     ; write CONTROL
   halt
