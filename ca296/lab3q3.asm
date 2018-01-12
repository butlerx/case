mov Al,17
mov bl,al
dec bl
loop:
	cmp al, 00
    jz clear
    cmp al, 01
    jz clear
	Mov CL, AL
    mod CL, BL
    jz clear
    dec BL
    cmp BL, 01
    jz end
    jmp loop
clear: 
	mov al,00
    jmp end
end:
	END         ; Program ends