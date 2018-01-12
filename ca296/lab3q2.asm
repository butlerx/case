mov Al,ff
Mov Bl,Bf
loop:
	Mov [BL],AL
    Dec BL
    jmp loop
end:
	END         ; Program ends