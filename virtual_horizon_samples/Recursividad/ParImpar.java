package virtual_horizon_samples.Recursividad;

public class ParImpar {
    public static int par(int nump) {
        if (nump == 0) {
            return 1;
        } else {
            return impar(nump - 1);
        }
    }

    public static int impar(int numi) {
        if (numi == 0) {
            return 0;
        } else {
            return par(numi - 1);
        }
    }
}