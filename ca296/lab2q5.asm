ORG C0
DB "IOU MONEY A"
db 2E
DB "A: E: I: O: U: "
ORG 00
MOV AL,c0	;count
MOV DL,01 
MOV Cl,30
MOV [b1], Cl
MOV [b2], Cl
MOV [b3], Cl
MOV [b4], Cl
MOV [b5], Cl
checker:
	MOV BL,[AL];location
	CMP BL,41; check for A
    jz changea
	CMP BL,45; check for E
    jz changee
	CMP BL,49; check for I
    jz changei
	CMP BL,4F; check for O
    jz changeo
	CMP BL,55; check for U
    jz changeu
    cmp BL, 2E 
    jz clearvdu
	inc AL
    jmp checker
change:
	mov BL,[AL]
    mov BL, 5A
    mov [AL], BL
    inc AL
    JNZ checker
changea:
	mov CL,[b1]
	add CL, DL
    mov [b1], CL
    jmp change
changee:
	mov CL,[b2]
	add CL, DL
    mov [b2], CL
    jmp change
changei:
	mov CL,[b3]
	add CL, DL
    mov [b3], CL
    jmp change
changeo:
	mov CL,[b4]
	add CL, DL
    mov [b4], CL
    jmp change
changeu:
	mov CL,[b5]
	add CL, DL
    mov [b5], CL
    jmp change
clearvdu:
	mov BL,00
	mov [Al],BL
    cmp AL, c0
    jz fillvdu
    dec AL
    jmp clearvdu
fillvdu:
	mov CL,[b1]
    mov [ce],CL
    mov CL,[b2]
    mov [d2], Cl
    mov CL,[b3]
    mov [d4], CL
    mov CL,[b4]
    mov [d7], CL
    mov CL,[b5]
    mov [da], CL
    end