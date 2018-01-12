ORG C0
DB "HELLO I AM A CAT"
db 2E
ORG 00
MOV AL,c0	;count
checker:
	MOV BL,[AL];location
	CMP BL,41; check for A
    jz change
    MOV BL,[AL];location
	CMP BL,45; check for E
    jz change
    MOV BL,[AL];location
	CMP BL,49; check for I
    jz change
    MOV BL,[AL];location
	CMP BL,4F; check for O
    jz change
    MOV BL,[AL];location
	CMP BL,55; check for U
    jz change
    mov BL, [AL]
    cmp BL, 2E 
    jz endloop
	inc AL
    jmp checker
change:
	mov BL,[AL]
    push BL
    INC CL
    mov BL, 5A
    mov [AL], BL
    inc AL
    JNZ checker
endloop:
	mov BL,00
clearvdu:
	mov [Al],BL
    cmp AL, c0
    jz fillvdu
    dec AL
    jmp clearvdu
fillvdu:
	pop BL
    mov [AL], BL
    inc Al
    dec CL
    cmp Cl, 00
    jz end
    jmp fillvdu
end:
END         ; Program ends