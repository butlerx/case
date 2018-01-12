.data
a: .asciiz "Hello"
b: .asciiz " World"
c: .asciiz "XXXXXXXXXXX" ; Space for the concatenated string.

CONTROL: .word 0x10000
DATA:    .word 0x10008

.text
main:

  ; load memory-mapped IO addresses
  ld r20,CONTROL(r0)
  ld r21,DATA(r0)

  daddi r1,r0,0 ; i
  daddi r2,r0,0 ; j
loop1:
  lb r3,a(r1)
  beqz r3,reset ; we're done if the byte we read is zero
  sb r3,c(r2)
  daddi r1,r1,1 ; i++
  daddi r2,r2,1 ; j++
  j loop1
reset:
  daddi r1,r0,0 ; i = 0
  j loop2
loop2:
  lb r3,b(r1)
  beqz r3,done ; we're done if the byte we read is zero
  sb r3,c(r2)
  daddi r1,r1,1 ; i++
  daddi r2,r2,1 ; j++
  j loop2
done:
  daddi r1,r0,c
  sd r1,0(r21)     ; set DATA to output value (address of string, here)
  daddi r1,r0,4
  sd r1,0(r20)     ; write CONTROL
  halt
