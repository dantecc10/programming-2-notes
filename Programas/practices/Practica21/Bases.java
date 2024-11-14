package Programas.practices.Practica21;

import java.util.Scanner;

public class Bases {
    public static String BasesRecursivas(int decimal, int base) {
        if (decimal == 0) {
            return "";
        }
        int remainder = decimal % base;
        return BasesRecursivas(decimal / base, base) + (remainder < 10 ? remainder : (char)(remainder + 'A' - 10));
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce tu número positivo escrito en base 10 (Decimal): ");
            int decimal = scanner.nextInt();
            while (decimal < 0) {
                System.out.print("\nEl número debe ser positivo. Ingrese un número escrito en base 10: ");
                decimal = scanner.nextInt();
            }

            System.out.print("Ingrese la base a la que desea convertir (2-16): ");
            int base = scanner.nextInt();
            while (base < 2 || base > 16) {
                System.out.print("\nLa base debe estar entre 2 y 16. Ingrese la base a la que desea convertir: ");
                base = scanner.nextInt();
            }

            String result = BasesRecursivas(decimal, base);
            System.out.println(decimal + " en base " + base + " es: " + result);
        }
    }
}