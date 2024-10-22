package virtual_horizon_samples.Recursividad;

public class Infinita {
    public static void inf(int x) {
        System.out.println("Valor: " + x);
        inf(++x);
    }
}
