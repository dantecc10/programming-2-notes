
package practices.conjuntos;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);

        System.out.print(
            "\n -----| Operaciones con conjuntos |-----\n" +
            "\n Tamaño conjunto " + Conjunto.getQuantity() + ": ");
        Conjunto set1 = new Conjunto(input.nextInt());
        set1.print();
        System.out.print("\n Tamaño conjunto " + Conjunto.getQuantity() + ": ");
        Conjunto set2 = new Conjunto(input.nextInt());
        set2.print();

        System.out.print(
            "\n -----| Resultados |-----\n" +
            "\n Union: ");
        Conjunto resultados = Conjunto.join(set1, set2);
        resultados.print();
        System.out.print("\n Diferencia: ");
        resultados = Conjunto.difference(set1, set2);
        resultados.print();

        input.close();
    }
}