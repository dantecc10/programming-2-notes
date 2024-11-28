package Practicas_Faltantes.Practica20;

public class Operaciones {

    public static double MultiRecursiva(double n, double m) {
        if (m == 1) {
            return n;
        } else {
            return n + MultiRecursiva(n, m - 1);
        }
    }

    public static double PoteRecursiva(double n, double m) {
        if (m == 1) {
            return n;
        }

        //if(n == 0 && m < 0) {
        //    return null; // Error fatal
        //}

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