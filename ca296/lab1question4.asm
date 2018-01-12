MOV CL,40
LOOP:
MOV [CL],CL	;
INC AL		;
INC CL      ; INcrease AL
CMP AL, 0a	; 
JNZ LOOP    ; Go back to the beginning
END         ; Program ends