MOV CL,08
LOOP:
MOV AL,[CL]	;
ADD BL,AL	;
DEC CL      ; Decrease AL
JNS LOOP    ; Go back to the beginning
END         ; Program ends