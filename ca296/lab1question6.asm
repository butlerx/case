MOV AL,41
MOV BL,c0
LOOP:
	MOV [BL],AL
	INC AL
    INC BL
    CMP AL, 5B
    JNZ LOOP
END         ; Program ends