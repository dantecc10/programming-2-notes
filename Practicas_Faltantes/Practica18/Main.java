package Practicas_Faltantes.Practica18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.print("\n¿Desea calcular la suma de los primeros n números pares (1) o impares (2)? ");
            choice = scanner.nextInt();
            if (choice != 1 && choice != 2) {
                System.out.println("Opción inválida. Por favor, ingrese 1 para pares o 2 para impares.");
            }
        } while (choice != 1 && choice != 2);

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        if (choice == 1) {
            System.out.println("\nLa suma de los primeros " + n + " números pares es: ");
            System.out.println(ParesImpares.sumaSecuenciaPares(n));
        } else {
            System.out.println("\nLa suma de los primeros " + n + " números impares es: ");
            System.out.println(ParesImpares.sumaSecuenciaImpares(n));
        }

        scanner.close();
    }
}
