import numpy as np

# Función para solicitar una matriz del tamaño indicado
def solicitar_matriz(filas, columnas, nombre="matriz"):
    print(f"Ingrese los elementos de la {nombre}:")
    return np.array([[int(input(f"Elemento ({i},{j}): ")) for j in range(columnas)] for i in range(filas)])

# Solicitar dimensiones y matriz principal
filas = int(input("Ingresa el número de filas: "))
columnas = int(input("Ingresa el número de columnas: "))
matriz_A = solicitar_matriz(filas, columnas, "matriz A")
print("\nMatriz A en NumPy:\n", matriz_A)

# Operaciones con matrices
def producto_matricial_booleano(A, B):
    return (np.dot(A, B) > 0).astype(int)

def comparar_matrices(A, B):
    return np.all(A <= B)

def es_simetrica(A):
    return np.array_equal(A, A.T)

def es_transitiva(A):
    return np.all(np.dot(A, A) <= A)

def es_antisimetrica(A):
    return np.all((A == 0) | (A * A.T == 0))

# Menú de opciones
def menu():
    while True:
        print("\nMenú:")
        print("1. Producto matricial booleano")
        print("2. Comparar A ≤ B")
        print("3. Verificar si A es simétrica")
        print("4. Verificar si A es transitiva")
        print("5. Verificar si A es antisimétrica")
        print("6. Traspuesta de A")
        print("7. Producto de Hadamard (elemento a elemento)")
        print("8. Salir")
        
        opcion = input("Selecciona una opción: ")
        
        if opcion in ['1', '2', '7']:  # Opciones que requieren otra matriz B
            matriz_B = solicitar_matriz(filas, columnas, "matriz B")
        
        if opcion == '1':
            print("Producto matricial booleano:\n", producto_matricial_booleano(matriz_A, matriz_B))
        elif opcion == '2':
            print("¿A ≤ B?:", comparar_matrices(matriz_A, matriz_B))
        elif opcion == '3':
            print("¿La matriz A es simétrica?:", es_simetrica(matriz_A))
        elif opcion == '4':
            print("¿La matriz A es transitiva?:", es_transitiva(matriz_A))
        elif opcion == '5':
            print("¿La matriz A es antisimétrica?:", es_antisimetrica(matriz_A))
        elif opcion == '6':
            print("Traspuesta de A:\n", matriz_A.T)
        elif opcion == '7':
            print("Producto de Hadamard:\n", matriz_A * matriz_B)
        elif opcion == '8':
            print("Saliendo del programa...")
            break
        else:
            print("Opción inválida. Intenta de nuevo.")

# Ejecutar el menú
menu()
