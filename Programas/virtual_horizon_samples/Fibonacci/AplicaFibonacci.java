package virtual_horizon_samples.Fibonacci;
import java.util.Scanner;

public class AplicaFibonacci {
    public static void main(String[] args) {
        Scanner ent  = new Scanner(System.in);

        System.out.println("Dame el valor de n: ");
        int n = ent.nextInt();
        
        System.out.println("De manera iterativa: ");
        Fibonacci.fiboIter(n);

        System.out.println("\n\nDe manera iterativa con arreglos: ");
        Fibonacci.fiboArray(n);

        System.out.println("\n\nDe manera recursiva: ");
        System.out.println("La serie es: " + Fibonacci.fiboRec(n));

        ent.close();
    }
}
