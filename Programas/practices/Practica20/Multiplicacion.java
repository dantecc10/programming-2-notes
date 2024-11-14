package Programas.practices.Practica20;

public class Multiplicacion {
    public static int MultiRecursiva(int n, int m) {
        if (m == 1) {
            return n;
        } else {
            return n + MultiRecursiva(n, m - 1);
        }
    }
}