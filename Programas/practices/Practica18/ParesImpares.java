package Programas.practices.Practica18;

public class ParesImpares {
    public static String sumaSecuenciaPares(int n) {
        return calcularSumaPares(n, 1, 0, new StringBuilder());
    }

    private static String calcularSumaPares(int n, int contador, int suma, StringBuilder secuencia) {
        if (contador > n) {
            secuencia.append(" = ").append(suma);
            return secuencia.toString();
        }

        int numeroPar = 2 * contador;
        suma += numeroPar;
        secuencia.append(numeroPar);
        if (contador < n) {
            secuencia.append(" + ");
        }
        
        return calcularSumaPares(n, contador + 1, suma, secuencia);
    }

    public static String sumaSecuenciaImpares(int n) {
        return calcularSumaImpares(n, 1, 0, new StringBuilder());
    }

    private static String calcularSumaImpares(int n, int contador, int suma, StringBuilder secuencia) {
        if (contador > n) {
            secuencia.append(" = ").append(suma);
            return secuencia.toString();
        }

        int numeroImpar = 2 * contador - 1;
        suma += numeroImpar;
        secuencia.append(numeroImpar);
        if (contador < n) {
            secuencia.append(" + ");
        }
        
        return calcularSumaImpares(n, contador + 1, suma, secuencia);
    }
}
