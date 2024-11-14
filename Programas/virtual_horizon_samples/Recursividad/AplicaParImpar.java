package virtual_horizon_samples.Recursividad;
import java.util.Scanner;
public class AplicaParImpar {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int a = ent.nextInt();
        if (ParImpar.par(a) == 1) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
