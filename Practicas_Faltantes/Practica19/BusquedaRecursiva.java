package Practicas_Faltantes.Practica19;

import java.util.InputMismatchException;
import java.util.Scanner;

import Practicas_Faltantes.Clean;
import Practicas_Faltantes.CustomExeption;

/*
 * Realizar un programa en Java
 * Que busque dentro de un arreglo un dato de manera recursiva.
 */

public class BusquedaRecursiva {

    private static int indice = 0;
    
    public static boolean Buscar(String[] arr, String objetivo) {

        if (indice >= arr.length) {
            return false;
        } else if (arr[indice].equals(objetivo)) {
            return true;
        } else {
            indice++;
        }

        return Buscar(arr, objetivo);
    }

    public static void main(String[] args) {

        Clean.console();

        try (Scanner scanner = new Scanner(System.in)) {

            int tamaño = 0;

            // Validación para asegurarse de que el tamaño del arreglo sea positivo
            while (tamaño <= 0) {

                try {

                    System.out.print("\nIngrese la dimension del arreglo: ");
                    tamaño = scanner.nextInt();
                    CustomExeption.NegativeIntInput.launchException(tamaño);

                } catch (InputMismatchException e) {

                    System.err.println("Entrada invalida, intente nuevamente");

                } catch (CustomExeption.NegativeIntInput e) {

                    System.err.println("La dimension debe ser positiva, intente nuevamente");

                } finally {

                    scanner.nextLine();

                }

            }
            
            String[] miArreglo = new String[tamaño];

            System.out.println("\nIngrese los elementos del arreglo:");

            for (int i = 0; i < tamaño; i++) {
                System.out.print("[" + (i+1) + "]: ");
                miArreglo[i] = scanner.nextLine();
            }

            System.out.print("\nIngrese el elemento a buscar: ");
            String objetivo = scanner.nextLine();

            boolean encontrado = Buscar(miArreglo, objetivo);

            if (encontrado) {
                System.out.println("El elemento \"" + objetivo + "\" se encontró en el indice [" + indice + "].");
            } else {
                System.out.println("El elemento \"" + objetivo + "\" no se encontró en el arreglo.");
            }
            
        }
    }
}
