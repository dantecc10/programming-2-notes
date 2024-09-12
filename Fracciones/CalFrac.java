package Fracciones;

import java.util.Scanner;

public class CalFrac {
    public static void main(String args[]) {

        Scanner entry = new Scanner(System.in);

        System.out.println("PRIMERA FRACCION: ");
        int num = entry.nextInt();

        System.out.println("-");
        int den = entry.nextInt();

        Fraccion c1 = new Fraccion(num, den);

        System.out.println("\nSEGUNDA FRACCION: ");
        num = entry.nextInt();

        System.out.println("-");
        den = entry.nextInt();

        Fraccion c2 = new Fraccion(num, den);
        Fraccion c3 = new Fraccion();
        System.out.println("\nRESULTADOS: ");
        c3.suma(c1, c2);
        System.out.println("Suma: " + c3);
        c3.resta(c1, c2);
        System.out.println("Resta: " + c3);
        c3.multiplica(c1, c2);
        System.out.println("Multi: " + c3);
        c3.divide(c1, c2);
        System.out.println("Divide: " + c3);
    }
}
