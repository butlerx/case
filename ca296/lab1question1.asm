MOV CL,08
LOOP:
DEC CL      ; Decrease AL
JNZ LOOP    ; Go back to the beginning
END         ; Program ends