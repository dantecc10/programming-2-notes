package Practicas_Faltantes.Practica20;

public class Operaciones {

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
        }

        if (m == 0) {
            return 1;
        }

        // return (n > 0) ? n * PoteRecursiva(n, m - 1) : -n * PoteRecursiva(n, m - 1);

        if (n > 0) {
            return (m > 0) ? n * PoteRecursiva(n, m - 1) : 1 / (n * PoteRecursiva(n, -m - 1));
        } else {
            return (m > 0) ? -n * PoteRecursiva(n, m - 1) : 1 / (-n * PoteRecursiva(n, -m - 1));
        }

    }

}