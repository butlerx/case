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
    jz end
	inc AL
    jmp checker
change:
	mov BL,[AL]
    push BL
    mov BL, 5A
    mov [AL], BL
    inc AL
    JNZ checker
end:


END         ; Program ends