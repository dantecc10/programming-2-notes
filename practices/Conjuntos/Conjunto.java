
package practices.conjuntos;

import java.util.Scanner;

public class Conjunto {

    protected String items[];
    private static int quantity = 1;
    private Scanner input = new Scanner(System.in);

    // -----| Constructors |-----
    public Conjunto() {
        items = new String[0];
    }

    public Conjunto(int n) {

        System.out.println("\n Conjunto " + quantity);

        if (n > 0) { // Genera un conjunto con tamaño n, o vacio en caso de ser igual o menor a 0
            items = new String[n];

            for (int i = 0; i < n; i++) { // Llena cada indice del conjunto
                System.out.print(" [" + (i + 1) + "]: ");
                items[i] = input.nextLine();
            }
            duplicates();
        } else {
            items = new String[0];
            System.out.println(" Conjunto vacio creado");
        }

        quantity++;
    }

    // -----| Methods |-----
    public static int getQuantity() {
        return quantity;
    }

    public static Conjunto join(Conjunto set1, Conjunto set2) { // Une 2 conjuntos

        String newItems[] = new String[set1.items.length + set2.items.length];
        int id = 0;

        for (int i = 0; i < set1.items.length; i++) { // Agrega los items del 1er conjunto
            newItems[id] = set1.items[i];
            id++;
        }
        for (int i = 0; i < set2.items.length; i++) { // Agrega los items del 2do conjunto
            newItems[id] = set2.items[i];
            id++;
        }

        Conjunto output = new Conjunto(); // Genera el conjunto de salida
        output.items = newItems;
        output.duplicates();
        return output; // Retorna la union
    }

    public static Conjunto difference(Conjunto set1, Conjunto set2) { // Encuentra la diferencia de 2 conjuntos

        Conjunto output = new Conjunto();

        if (set1.items.length < set2.items.length) { // Empezando desde el conjunto menor se busca la diferencia de ambos

            for (int a = 0; a < set1.items.length; a++) {
                for (int b = 0; b < set2.items.length; b++) {
                    if (set1.items[a].equals(set2.items[b]))
                        output.add(set1.items[a]);
                }
            }
        } else {
            for (int a = 0; a < set2.items.length; a++) {
                for (int b = 0; b < set1.items.length; b++) {
                    if (set2.items[a].equals(set1.items[b]))
                        output.add(set2.items[a]);
                }
            }
        }

        return output;
    }

    public void add(String obj) { // Añade un item mas al conjunto

        int size = items.length;
        String newArr[] = new String[size + 1];

        for (int i = 0; i < size; i++) // Copia todos los items
            newArr[i] = items[i];

        newArr[size] = obj; // Agrega el nuevo item

        items = newArr; // Sustitulle el conjunto
    }

    public void delete() { // Elimina el ultimo indice

        int size = items.length - 1;
        String newArr[] = new String[size];

        for (int i = 0; i < size; i++) // Copia todos los items
            newArr[i] = items[i];

        items = newArr; // Sustitulle el conjunto
    }

    public void duplicates() { // Elimina los items duplicados

        int size = items.length;

        for (int a = 0; a < size; a++) {
            for (int b = (a == size - 1) ? size : a + 1; b < size; b++) {
                if (items[a].equals(items[b])) {
                    for (int c = (b == size - 1) ? size : b + 1; c < size; c++) {
                        int x = b;
                        items[x] = items[c];
                        x++;
                    }
                    delete();
                    size--;
                    b--;
                }
            }
        }
    }

    public void print() { // Imprime el conjunto

        System.out.print(" {");

        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i]);

            if (i != items.length - 1) // Agrega una coma entre items que no sean el ultimo
                System.out.print(",");
        }

        System.out.print("}\n");
    }
}