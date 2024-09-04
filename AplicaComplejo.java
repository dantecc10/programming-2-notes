import java.util.Scanner;

public class AplicaComplejo {
    public static void main(String[] x) {
        Scanner en = new Scanner(System.in);
        System.out.print("Dame un valor: ");
        float a = en.nextFloat();
        System.out.print("Dame otro valor: ");
        float b = en.nextFloat();
        MiComplejo c1 = new MiComplejo();
        c1.muestra();
        c1.setR(a);
        c1.setI(b);
        c1.muestra();
        en.close();
    }
}
