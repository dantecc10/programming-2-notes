package Fracciones;

import java.util.Scanner;

public class CalFrac {
    public static void main(String args[]) {

        Scanner entry = new Scanner(System.in);

        System.out.println("PRIMERA FRACCION");

        System.out.println("Dame el numerador: ");
        int num = entry.nextInt();

        System.out.println("Dame el denomidaor: ");
        int den = entry.nextInt();

        Fraccion c1 = new Fraccion(num, den);


        System.out.println("SEGUNDA FRACCION");

        ystem.out.println("Dame el numerador: ");
        int num = entry.nextInt();

        System.out.println("Dame el denomidaor: ");
        int den = entry.nextInt();

        System.out.println("\nResultados: ");
        System.out.println("Suma: "+(num1+num2));
        System.out.println("Resta: "+(num1-num2));
        System.out.println("Multiplicación: "+(num1*num2));
    }
}
