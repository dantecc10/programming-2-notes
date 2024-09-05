import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        System.out.println("Resultados: ");
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+multiplicacion);
        if (num2 !=0){
            System.out.println("Division: "+division);
        } else {
            System.out.println("No se puede dividir entre cero");
        }
        sc.close();        
    }
}