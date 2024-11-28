package Practicas_Faltantes.Practica20;

public class Operations {

    public static int MultiRecursiva(int n, int m) {
        if (m == 1) {
            return n;
        } else {
            return n + MultiRecursiva(n, m - 1);
        }
    }

    public static int PoteRecursiva(int n, int m) {
        if (m == 1) {
            return n;
        } else {
            return n * PoteRecursiva(n, m - 1);
        }
    }
}