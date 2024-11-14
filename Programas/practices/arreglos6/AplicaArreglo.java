package practices.arreglos6;

import java.util.Scanner;

public class AplicaArreglo {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);

        System.out.print("Da la dimension del arreglo: ");
        int n = intro.nextInt();
        Arreglo A1 = new Arreglo(n);
        A1.leerA('A');
        System.out.println("El promedio es: " + A1.promedio());
        Arreglo A2 = new Arreglo(n);
        A2.leerA('B');
        System.out.println("El promedio es: " + A2.promedio());
        A2.mostrar('B');

        /*
         * // Sumar
         * for (int i = 0; i < n; i++) {
         * int temp = A1.getA()[i] + A2.getA()[i];
         * System.out.print("A [" + i + "] + B [" + i + "] = " + temp + "\n");
         * }
         * 
         * // Restar
         * for (int i = 0; i < n; i++) {
         * int temp = A1.getA()[i] - A2.getA()[i];
         * System.out.print("A [" + i + "] - B [" + i + "] = " + temp + "\n");
         * }
         * 
         * // Producto punto
         * int point_product = 0;
         * for (int i = 0; i < n; i++) {
         * point_product += A1.getA()[i] * A2.getA()[i];
         * }
         * System.out.print("El producto punto de los arreglos es: " + point_product +
         * "\n");
         */
        System.out.print("La suma de los arreglos es: \n");
        A1.sumar(A2.getA());
        System.out.print("La resta de los arreglos es: \n");
        A1.restar(A2.getA());
        System.out.print("El producto punto de los arreglos es: " + A1.productoPunto(A2.getA()) + "\n");

        intro.close();
    }
}
