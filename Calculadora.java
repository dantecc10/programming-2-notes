import java.util.Scanner;

public class Calculadora {
    public static void main(String cad[]) {
        Scanner ent=new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = ent.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = ent.nextInt();

        System.out.println("\nResultados: ");
        System.out.println("Suma: "+(num1+num2));
        System.out.println("Resta: "+(num1-num2));
        System.out.println("Multiplicación: "+(num1*num2));
        
        if (num2 == 0)
            System.out.println("Division: indefinido");
        else {
            float c = (float) num1/num2;
            System.out.println("Division: "+c);
        }

        ent.close();

    }
}