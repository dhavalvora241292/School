data segment
msg1 db 0dh, "Enter the original string :  $"
msg2 db 0dh, "Enter the substring to be searched for : $"
msg3 db 0dh, "Substring match found! $"
msg4 db 0dh, "No substring match. $"
data ends

code segment
assume ds:data, cs:code

start:
    
    mov ax, data
    mov ds, ax
    mov dx, offset msg1
    mov ah, 09h
    int 21h
    mov si, 6000h
    mov di, 2000h
    mov cl, 00h

l1:     mov ah, 01h
          int 21h
          inc cl
          mov [si], al
          inc si
          cmp al, 0dh
          jnz l1
          mov dx, offset msg2
          mov ah, 09h
          int 21h
          mov ch, 00h

l2:     mov ah, 01h
          int 21h
          inc ch
          mov [di], al
          inc di
          cmp al, 0dh
          jnz l2
          mov si, 6000h
          mov di, 2000h
          mov dl, ch

l3:      mov al, [si]
           cmp al, [di]
           jnz l4
           inc si
           dec cl
           inc di
           dec dl
           cmp dl, 01h
           je out1
           cmp cl, 00h
           jnz l3
           cmp cl, 00h
           jz out2

l4:      inc si
           dec cl
           mov dl, ch
           mov di, 2000h
           cmp cl, 00h
           jnz l3
           cmp cl, 00h
           jz out2

out1:      mov dx, offset msg3
                mov ah, 09h
                int 21h
                jmp e

out2:      mov dx, offset msg4
                mov ah, 09h
                int 21h
                jmp e

e:    mov ah, 4ch
        int 21h

code ends
end start  