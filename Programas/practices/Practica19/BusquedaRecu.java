package Programas.practices.Practica19;

import java.util.Scanner;

public class BusquedaRecu {
    public static boolean BuscarRecursiva(int[] arr, int objetivo, int indice) {
        if (indice >= arr.length) {
            return false;
        }
        if (arr[indice] == objetivo) {
            return true;
        }
        return BuscarRecursiva(arr, objetivo, indice + 1);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int tamaño;
            // Validación para asegurarse de que el tamaño del arreglo sea positivo
            do {
                System.out.print("\nIngrese la cantidad de elementos en el arreglo: ");
                tamaño = scanner.nextInt();
                if (tamaño <= 0) {
                    System.out.println("El tamaño del arreglo debe ser un número positivo. Intente nuevamente.");
                }
            } while (tamaño <= 0);
            
            int[] miArreglo = new int[tamaño];

            System.out.println("\nIngrese los elementos del arreglo:");
            for (int i = 0; i < tamaño; i++) {
                miArreglo[i] = scanner.nextInt();
            }

            System.out.print("\nIngrese el elemento a buscar: ");
            int objetivo = scanner.nextInt();

            boolean encontrado = BuscarRecursiva(miArreglo, objetivo, 0);
            if (encontrado) {
                System.out.println("El elemento " + objetivo + " se encontró en el arreglo.");
            } else {
                System.out.println("El elemento " + objetivo + " no se encontró en el arreglo.");
            }
        }
    }
}
