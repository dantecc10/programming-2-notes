MOV CX,0000

INICIO:
CMP CL,0F
JNB ETIQUETA1
JL ETIQUETA2

ETIQUETA2:
JMP ETIQUETA3

ETIQUETA1:
PUSH CX
MOV DL,CL
MOV CX,0004

ETIQUETA4:
SHR DL,1
DEC CX
CMP CX,+00
JNZ ETIQUETA4
CMP DL,09
JLE ETIQUETA5
JG ETIQUETA6

ETIQUETA5:
ADD DL,30
MOV AH,02
INT 21
JMP ETIQUETA7

ETIQUETA6:
ADD DL,37
MOV AH,02
INT 21

ETIQUETA7:
POP CX
MOV DL,CL
AND DL,0F

ETIQUETA15:
CMP DL,09
JLE ETIQUETA8
JG ETIQUETA9

ETIQUETA8:
ADD DL,30
MOV AH,02
INT 21
JMP ETIQUETA10

ETIQUETA9:
ADD DL,37
MOV AH,02
INT 21

ETIQUETA10:
MOV AH,02
MOV DX,003A
INT 21
MOV AH,02
MOV DL,CL
INT 21
PUSH CX
MOV AH,02
MOV DX,003A
INT 21
XOR AH,AH
MOV [0250],AH
MOV [0252],AH
MOV [0254],AH
MOV AL,CL

ETIQUETA11:
CMP AL,0A
JB ETIQUETA16
SUB AL,0A
MOV [0252],AH
ADD AH,01
MOV [0252],AH
CMP AH,0A
JL ETIQUETA11
MOV AH,[0250]
ADD AH,01
MOV [0250],AH
MOV AH,[0252]
XOR AH,AH
MOV [0252],AH
JMP ETIQUETA11

ETIQUETA16:
MOV [0254],AL
MOV SI,0030
ADD [0250],SI
ADD [0252],SI
ADD [0254],SI
MOV DL,[0250]
MOV AH,02
INT 21
MOV DL,[0252]
MOV AH,02
INT 21
MOV DL,[0254]
MOV AH,02
INT 21
MOV AH,02
MOV DL,0D
INT 21
MOV AH,02
MOV DL,0A
INT 21
POP CX
INC CX
XOR DX,DX
XOR AX,AX
MOV AL,CL
MOV BX,000A
DIV BX
CMP DX,+00
JNZ ETIQUETA12
MOV AH,01
INT 21

ETIQUETA12:
CMP CX,00FF
JLE ETIQUETA13
JG FIN

ETIQUETA13:
JMP INICIO

ETIQUETA3:
MOV AH,02
MOV DL,30
INT 21
MOV DL,CL
JMP ETIQUETA15
NOP
FIN:


----------------------------------------------------------------------


MOV CX,0000      ; Inicializa el contador CX a 0

INICIO:          ; Punto de inicio del bucle principal
CMP CL,0F        ; Compara el byte bajo de CX con 15 (0F en hex)
JNB PROCESAR_NUM_MAYOR_15  ; Si CL >= 15, salta a procesar números mayores
JL PROCESAR_NUM_MENOR_15   ; Si CL < 15, salta a procesar números menores

PROCESAR_NUM_MENOR_15:     ; Maneja números menores a 15
JMP IMPRIMIR_CERO_Y_VALOR ; Salta directamente a imprimir un cero seguido del valor

PROCESAR_NUM_MAYOR_15:    ; Maneja números mayores o iguales a 15
PUSH CX         ; Guarda CX en la pila
MOV DL,CL       ; Copia CL a DL para procesarlo
MOV CX,0004     ; Prepara contador para 4 iteraciones

CONVERTIR_HEX_ALTO:       ; Convierte el dígito hexadecimal alto
SHR DL,1        ; Desplaza DL a la derecha 1 bit
DEC CX          ; Decrementa el contador
CMP CX,+00      ; Compara CX con 0
JNZ CONVERTIR_HEX_ALTO  ; Si CX != 0, continúa desplazando
CMP DL,09       ; Compara DL con 9
JLE CONVERTIR_NUM_ASCII ; Si DL <= 9, convertir a número ASCII
JG CONVERTIR_LETRA_ASCII  ; Si DL > 9, convertir a letra ASCII

CONVERTIR_NUM_ASCII:      ; Convierte números 0-9 a ASCII
ADD DL,30       ; Añade 30h para convertir a ASCII (0 -> '0')
MOV AH,02       ; Prepara para imprimir carácter
INT 21          ; Llama interrupción para imprimir
JMP CONTINUAR_SEGUNDO_DIGITO ; Salta a procesar segundo dígito

CONVERTIR_LETRA_ASCII:    ; Convierte letras A-F a ASCII
ADD DL,37       ; Añade 37h para convertir a ASCII (10 -> 'A')
MOV AH,02       ; Prepara para imprimir carácter
INT 21          ; Llama interrupción para imprimir

CONTINUAR_SEGUNDO_DIGITO:
POP CX          ; Recupera valor original de CX
MOV DL,CL       ; Copia CL a DL
AND DL,0F       ; Mascara para obtener solo los 4 bits bajos

PROCESAR_SEGUNDO_DIGITO:
CMP DL,09       ; Compara DL con 9
JLE IMPRIMIR_SEGUNDO_DIGITO_NUM  ; Si DL <= 9, imprime como número
JG IMPRIMIR_SEGUNDO_DIGITO_LETRA ; Si DL > 9, imprime como letra

IMPRIMIR_SEGUNDO_DIGITO_NUM:
ADD DL,30       ; Convierte a ASCII número
MOV AH,02       ; Prepara para imprimir
INT 21          ; Imprime carácter
JMP IMPRIMIR_DOS_PUNTOS ; Salta a imprimir dos puntos

IMPRIMIR_SEGUNDO_DIGITO_LETRA:
ADD DL,37       ; Convierte a ASCII letra
MOV AH,02       ; Prepara para imprimir
INT 21          ; Imprime carácter

IMPRIMIR_DOS_PUNTOS:
MOV AH,02       ; Prepara para imprimir
MOV DX,003A     ; Carga ':' en DX
INT 21          ; Imprime dos puntos
MOV AH,02       ; Prepara para imprimir
MOV DL,CL       ; Carga valor original
INT 21          ; Imprime carácter ASCII
PUSH CX         ; Guarda CX
MOV AH,02       ; Prepara para imprimir
MOV DX,003A     ; Carga ':' en DX
INT 21          ; Imprime dos puntos
XOR AH,AH       ; Limpia AH
MOV [0250],AH   ; Inicializa memoria para centenas
MOV [0252],AH   ; Inicializa memoria para decenas
MOV [0254],AH   ; Inicializa memoria para unidades
MOV AL,CL       ; Copia valor a convertir en AL

CONVERTIR_DECIMAL:      ; Convierte a decimal
CMP AL,0A       ; Compara con 10
JB GUARDAR_ULTIMO_DIGITO ; Si es menor que 10, guarda último dígito
SUB AL,0A       ; Resta 10
MOV [0252],AH   ; Guarda decenas
ADD AH,01       ; Incrementa contador de decenas
MOV [0252],AH   ; Actualiza decenas
CMP AH,0A       ; Compara con 10
JL CONVERTIR_DECIMAL  ; Si es menor que 10, continúa conversión
MOV AH,[0250]   ; Carga centenas
ADD AH,01       ; Incrementa centenas
MOV [0250],AH   ; Guarda centenas
MOV AH,[0252]   ; Carga decenas
XOR AH,AH       ; Limpia contador de decenas
MOV [0252],AH   ; Reinicia decenas
JMP CONVERTIR_DECIMAL ; Continúa conversión

GUARDAR_ULTIMO_DIGITO:
MOV [0254],AL    ; Guarda el último dígito (unidades)
MOV SI,0030      ; Carga 30h (para convertir a ASCII)
ADD [0250],SI    ; Convierte centenas a ASCII
ADD [0252],SI    ; Convierte decenas a ASCII
ADD [0254],SI    ; Convierte unidades a ASCII
MOV DL,[0250]    ; Carga centenas
MOV AH,02        ; Prepara para imprimir
INT 21           ; Imprime centenas
MOV DL,[0252]    ; Carga decenas
MOV AH,02        ; Prepara para imprimir
INT 21           ; Imprime decenas
MOV DL,[0254]    ; Carga unidades
MOV AH,02        ; Prepara para imprimir
INT 21           ; Imprime unidades

; Imprime salto de línea (CR+LF)
MOV AH,02        ; Prepara para imprimir
MOV DL,0D        ; Retorno de carro (CR)
INT 21           ; Imprime CR
MOV AH,02        ; Prepara para imprimir
MOV DL,0A        ; Salto de línea (LF)
INT 21           ; Imprime LF

POP CX           ; Recupera valor del contador
INC CX           ; Incrementa el contador
XOR DX,DX        ; Limpia DX para división
XOR AX,AX        ; Limpia AX
MOV AL,CL        ; Mueve el contador a AL
MOV BX,000A      ; Prepara para dividir por 10
DIV BX           ; Divide AX por 10
CMP DX,+00       ; Comprueba si hay residuo
JNZ CONTINUAR_BUCLE  ; Si hay residuo, continúa
MOV AH,01        ; Prepara para leer carácter
INT 21           ; Lee carácter (pausa cada 10 números)

CONTINUAR_BUCLE:
CMP CX,00FF      ; Compara contador con 255
JLE SIGUIENTE_ITERACION  ; Si es menor o igual, continúa
JG FIN           ; Si es mayor, termina

SIGUIENTE_ITERACION:
JMP INICIO       ; Vuelve al inicio del bucle

IMPRIMIR_CERO_Y_VALOR:
MOV AH,02        ; Prepara para imprimir
MOV DL,30        ; Carga '0' en DL
INT 21           ; Imprime '0'
MOV DL,CL        ; Carga valor original
JMP PROCESAR_SEGUNDO_DIGITO  ; Procesa segundo dígito

NOP              ; No operación (relleno)
FIN:             ; Fin del programa