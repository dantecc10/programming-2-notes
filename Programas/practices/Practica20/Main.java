package Programas.practices.Practica20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número: ");
            int n = scanner.nextInt();
            while (n <= 0) {
                System.out.print("El número debe ser positivo. Ingrese el primer número: ");
                n = scanner.nextInt();
            }

            System.out.print("Ingrese el segundo número: ");
            int m = scanner.nextInt();
            while (m <= 0) {
                System.out.print("El número debe ser positivo. Ingrese el segundo número: ");
                m = scanner.nextInt();
            }

            System.out.print("\n¿Desea realizar una multiplicación (1) o una potencia (2)? ");
            int operacion = scanner.nextInt();
            while (operacion != 1 && operacion != 2) {
                System.out.print("Opción inválida. Ingrese 1 para multiplicación o 2 para potencia: ");
                operacion = scanner.nextInt();
            }

            if (operacion == 1) {
                int resultado = Multiplicacion.MultiRecursiva(n, m);
                System.out.println("\nLa multiplicación de " + n + " y " + m + " es: " + resultado);
            } else {
                int resultado = Potencia.PoteRecursiva(n, m);
                System.out.println("\nLa potencia de " + n + " elevado a " + m + " es: " + resultado);
            }
        }
    }
}