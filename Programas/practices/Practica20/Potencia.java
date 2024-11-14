package Programas.practices.Practica20;

public class Potencia {
    public static int PoteRecursiva(int n, int m) {
        if (m == 1) {
            return n;
        } else {
            return n * PoteRecursiva(n, m - 1);
        }
    }
}