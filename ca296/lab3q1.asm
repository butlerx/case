mov Al,00
Mov Bl,00
loop:
	Mov CL, [BL]
    mod CL, 02
    add AL, CL
    inc BL
    jz end
    jmp loop
end:
	END         ; Program ends