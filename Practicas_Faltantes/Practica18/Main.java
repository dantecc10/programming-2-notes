package Practicas_Faltantes.Practica18;

import java.util.InputMismatchException;
import java.util.Scanner;

import Practicas_Faltantes.Clean;
import Practicas_Faltantes.CustomExeption;

/*
 * Realizar un programa en Java con métodos de clase que obtenga de manera recursiva:
 * 
 * 1. La suma de los primeros n números pares.
 * Por ejemplo: si n=5 obtener 2+4+6+8+10
 * 
 * 2. La suma de los primero n números impares.
 * Por ejemplo: si n=5 obtener 1+3+5+7+9
 */

public class Main {
    public static void main(String[] args) {

        Clean.console();

        try (Scanner scanner = new Scanner(System.in)) {

            int opc = 0;
            int n = 0;
            boolean flag = false;

            while (!flag) {

                try {

                    System.out.print("\n¿Desea calcular la suma de los primeros n números pares (1) o impares (2)?\nOpcion: ");
                    opc = scanner.nextInt();

                    if (opc != 1 && opc != 2) {
                        System.out.println("Opción inválida, intentelo nuevamente");
                    }

                    flag = true;

                } catch (InputMismatchException e) {

                    System.err.println("Entrada invalida, reintentando");
                    scanner.nextLine();

                }
            }

            flag = false;
            while (!flag) {
                try {

                    System.out.print("\nIngrese la cantidad n de números a sumar: ");
                    n = scanner.nextInt();
                    CustomExeption.NegativeIntInput.launchException(n);
                    flag = true;

                } catch (InputMismatchException e) {

                    System.err.println("Entrada invalida, reintentando");
                    scanner.nextLine();

                } catch (CustomExeption.NegativeIntInput e) {

                    System.err.println("Ingrese un valor positivo");

                }
            }

            if (opc == 1) {

                System.out.println("\nLa suma de los primeros " + n + " números pares es: ");
                System.out.println(ParesImpares.sumaSecuenciaPares(n));

            } else {

                System.out.println("\nLa suma de los primeros " + n + " números impares es: ");
                System.out.println(ParesImpares.sumaSecuenciaImpares(n));

            }

        }
    }
}
