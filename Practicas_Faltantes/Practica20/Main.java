package Practicas_Faltantes.Practica20;

import java.util.Scanner;
import Practicas_Faltantes.Clean;

/*
 * Realizar un programa en Java con métodos de clase que obtenga de manera recursiva:
 * 
 * 1. La multiplicación de dos números mediante sumas sucesivas.
 * Por ejemplo: si n=5 y m=3 obtener 5+5+5=15
 * 
 * 2. La potencia de dos números mediante multiplicaciones sucesivas.
 * Por ejemplo: si n=5 y m=3 obtener 5*5*5=125
 */

public class Main {
    public static void main(String[] args) {

        Clean.console();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número: ");
            double n;
            n = scanner.nextDouble();
            // while (n <= 0) {
            // System.out.print("El número debe ser positivo. Ingrese el primer número: ");
            // n = scanner.nextInt();
            // }

            System.out.print("Ingrese el segundo número: ");
            double m;
            m = scanner.nextDouble();
            // while (m <= 0) {
            // System.out.print("El número debe ser positivo. Ingrese el segundo número: ");
            // m = scanner.nextInt();
            // }
            // Cómo paso un double a int?


            System.out.print("\n¿Desea realizar una multiplicación (1) o una potencia (2)? ");
            int operacion = scanner.nextInt();
            while (operacion != 1 && operacion != 2) {
                System.out.print("Opción inválida. Ingrese 1 para multiplicación o 2 para potencia: ");
                operacion = scanner.nextInt();
            }

            if (operacion == 1) {
                // Define una variable con el valor absoluto de n y m
                m = (int) m;

                double resultado = ((n > 0 && m > 0) || (n < 0 && m < 0))
                        ? Operaciones.MultiRecursiva(Math.abs(n), Math.abs(m))
                        : -Operaciones.MultiRecursiva(Math.abs(n), Math.abs(m));
                System.out.println("\nLa multiplicación de " + n + " y " + m + " es: " + resultado);
            } else {
                if (n == 0 && m < 0) {
                    System.out.println("Operación inválida: tal exponente implicaría divisiones entre 0.");
                    return;
                }
                double resultado = Operaciones.PoteRecursiva(n, m);
                System.out.println("\nLa potencia de " + n + " elevado a " + m + " es: " + resultado);
            }
        }
    }
}