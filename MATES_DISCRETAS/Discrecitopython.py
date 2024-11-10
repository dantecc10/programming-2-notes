import numpy as np

filas = int(input("Ingresa el número de filas: "))
columnas = int(input("Ingresa el número de columnas: "))

matriz = []
for i in range(filas):
    fila = [int(input(f"Ingresa el elemento para la posición ({i},{j}): ")) for j in range(columnas)]
    matriz.append(fila)

# Convertir a un array de NumPy
matriz_np = np.array(matriz)
print("\nLa matriz en NumPy es:")
print(matriz_np)

# Producto matricial booleano AB
def boolean_productomatricial(A, B):
    return (np.dot(A, B) > 0).astype(int)

# Comparación A ≤ B
def menorOigual(A, B):
    return np.all(A <= B)

# Verificar si A es simétrica
def simetrica(A):
    return np.array_equal(A, A.T)

# Verificar si A es transitiva
def transitiva(A):
    return np.array_equal(np.dot(A, A) > 0, A > 0)

# Verificar si A es antisimétrica
def antisimetrica(A):
    return np.all((A == 0) | (A * A.T == 0))

# Traspuesta de una matriz
def traspuesta(A):
    return np.transpose(A)

# Producto de Hadamard
def hammer(A, B):
    return A * B

# Menú de opciones
def menu():
    while True:
        print("\nMenú:")
        print("1. Producto matricial booleano")
        print("2. Comparación A ≤ B")
        print("3. Verificar si A es simétrica")
        print("4. Verificar si A es transitiva")
        print("5. Verificar si A es antisimétrica")
        print("6. Traspuesta")
        print("7. Producto de Hadamard")
        print("8. Salir")

        opcion = input("Selecciona una opción: ")

        if opcion == '1':
            B = np.array([[int(input(f"Ingrese el elemento para la posición ({i},{j}): ")) for j in range(columnas)] for i in range(filas)])
            print("\nEl producto matricial booleano es:")
            print(boolean_productomatricial(matriz_np, B))

        elif opcion == '2':
            B = np.array([[int(input(f"Ingrese el elemento para la posición ({i},{j}): ")) for j in range(columnas)] for i in range(filas)])
            print("¿A ≤ B?:", menorOigual(matriz_np, B))

        elif opcion == '3':
            print("¿La matriz A es simétrica?:", simetrica(matriz_np))

        elif opcion == '4':
            print("¿La matriz A es transitiva?:", transitiva(matriz_np))

        elif opcion == '5':
            print("¿La matriz A es antisimétrica?:", antisimetrica(matriz_np))

        elif opcion == '6':
            print("La traspuesta de A es:")
            print(traspuesta(matriz_np))

        elif opcion == '7':
            B = np.array([[int(input(f"Ingrese el elemento para la posición ({i},{j}): ")) for j in range(columnas)] for i in range(filas)])
            print("El producto de Hadamard es:")
            print(hammer(matriz_np, B))

        elif opcion == '8':
            print("Saliendo del programa...")
            break

        else:
            print("Opción inválida. Intenta de nuevo.")

# Ejecutar el menú
menu()
