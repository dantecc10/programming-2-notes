package homework.complejos4;

import java.util.Scanner;

public class Calculadora {
    public static void main(String args[]) {
    
        float a, b;
        Complejo c3 = new Complejo();
        Scanner entry = new Scanner(System.in);

        System.out.print("Primer complejo:\nr = ");
        a = entry.nextFloat();
        System.out.print("i = ");
        b = entry.nextFloat();
        Complejo c1 = new Complejo(a, b);
        System.out.println(c1 + "\n");

        System.out.print("Segundo complejo:\nr = ");
        a = entry.nextFloat();
        System.out.print("i = ");
        b = entry.nextFloat();
        Complejo c2 = new Complejo(a, b);
        System.out.println(c2 + "\n");

        System.out.println("Los resultados obtenidos son:\n");
        c3.suma(c1, c2);
        System.out.println("+: " + c3);
        c3.resta(c1, c2);
        System.out.println("-: " + c3);
        c3.multiplica(c1, c2);
        System.out.println("*: " + c3);
        c3.divide(c1, c2);
        System.out.println("/: " + c3);

        entry.close();
    }
}