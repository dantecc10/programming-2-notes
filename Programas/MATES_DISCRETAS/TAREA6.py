import numpy as np

def producto_matricial_booleano(A, B):
    C = np.dot(A, B)                    # Producto matricial tradicional
    return (C > 0).astype(int)          # Convierte a matriz booleana (0,1)

def comparar_matrices(A, B):
    return np.all(A <= B)               # Compara si todos los elementos de A son <= que B

def es_simetrica(A):
    return np.array_equal(A, A.T)       # Compara la matriz con su transpuesta

def es_transitiva(A):
    return np.all(np.dot(A, A) <= A)    # Verifica si A^2 <= A

def es_antisimetrica(A):
    return np.array_equal(A, -A.T)      # Verifica si A es antisimétrica (A = -A^T)

def transpuesta(A):
    return np.transpose(A)              # Calcula la transpuesta de A

def producto_hadamard(A, B):
    return A * B                        # Producto de Hadamard (elemento a elemento)

def solicitar_matriz(filas, columnas, nombre):
    matriz = np.zeros((filas, columnas), dtype=int)
    print(f"\nIngrese elementos de la matriz {nombre}:")
    for i in range(filas):
        for j in range(columnas):
            matriz[i][j] = int(input(f"{nombre}[{i}][{j}]: "))
    print(f"\nMatriz {nombre} ingresada:")
    print(matriz)
    return matriz

# Menú de operaciones
while True:
    print("\nOperaciones disponibles:")
    print("1. Producto matricial booleano")
    print("2. Comparar A <= B")
    print("3. Verificar si A es simétrica")
    print("4. Verificar si A es transitiva")
    print("5. Verificar si A es antisimétrica")
    print("6. Calcular la transpuesta de A")
    print("7. Producto de Hadamard A * B")
    print("8. Salir")
    
    opcion = input("\nSeleccione una operación (1-8): ")
    
    if opcion == '1':
        # Solicitar dimensiones para producto matricial
        m = int(input("Ingrese número de filas de A (m): "))
        p = int(input("Ingrese número de columnas de A / filas de B (p): "))
        n = int(input("Ingrese número de columnas de B (n): "))
        
        A = solicitar_matriz(m, p, "A")
        B = solicitar_matriz(p, n, "B")
        
        resultado = producto_matricial_booleano(A, B)
        print("\nProducto matricial booleano A×B:")
        print(resultado)
        
    elif opcion == '2':
        # Solicitar dimensiones para comparación (matrices del mismo tamaño)
        m = int(input("Ingrese número de filas (m): "))
        n = int(input("Ingrese número de columnas (n): "))
        
        A = solicitar_matriz(m, n, "A")
        B = solicitar_matriz(m, n, "B")
        
        resultado = comparar_matrices(A, B)
        print("\n¿A <= B?:", resultado)
        
    elif opcion == '3':
        # Solicitar dimensiones para matriz cuadrada
        n = int(input("Ingrese dimensión de la matriz cuadrada (n): "))
        
        A = solicitar_matriz(n, n, "A")
        
        resultado = es_simetrica(A)
        print("\n¿A es simétrica?:", resultado)
        
    elif opcion == '4':
        # Solicitar dimensiones para matriz cuadrada
        n = int(input("Ingrese dimensión de la matriz cuadrada (n): "))
        
        A = solicitar_matriz(n, n, "A")
        
        resultado = es_transitiva(A)
        print("\n¿A es transitiva?:", resultado)
    
    elif opcion == '5':
        # Solicitar dimensiones para matriz cuadrada
        n = int(input("Ingrese dimensión de la matriz cuadrada (n): "))
        
        A = solicitar_matriz(n, n, "A")
        
        resultado = es_antisimetrica(A)
        print("\n¿A es antisimétrica?:", resultado)
        
    elif opcion == '6':
        # Solicitar dimensiones para calcular la transpuesta de A
        m = int(input("Ingrese número de filas (m): "))
        n = int(input("Ingrese número de columnas (n): "))
        
        A = solicitar_matriz(m, n, "A")
        
        resultado = transpuesta(A)
        print("\nTranspuesta de A:")
        print(resultado)
    
    elif opcion == '7':
        # Solicitar dimensiones para el producto de Hadamard (matrices del mismo tamaño)
        m = int(input("Ingrese número de filas (m): "))
        n = int(input("Ingrese número de columnas (n): "))
        
        A = solicitar_matriz(m, n, "A")
        B = solicitar_matriz(m, n, "B")
        
        resultado = producto_hadamard(A, B)
        print("\nProducto de Hadamard A * B:")
        print(resultado)
        
    elif opcion == '8':
        print("Programa finalizado.")
        break
        
    else:
        print("Opción inválida. Por favor, seleccione una opción válida.")
