package practices.Conjuntos;

import java.util.Scanner;

public class Conjunto {
    
    protected String items[];
    protected int id = 0;

    // -----| Constructors |-----
    public Conjunto(int n) {
        if (n > 0)
            items = new String[n];
        else
            items = new String[0];
    }

    // -----| Methods |-----
    public void fill() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < items.length; i++) { // LLena el arreglo
            System.out.print(" ["+(i+1)+"]: ");
            items[i] = input.nextLine();
        }
        input.close();
    }

    public void print() {
        for (int i = 0; i < items.length; i++)
            System.out.println(items[i]);
    }

    public void add(String obj) {

        String other[] = new String[items.length + 1]; // Genera un arreglo con +1 indices

        for (int i = 0; i < items.length; i++) // Copia todos los valores al nuevo arreglo
            other[i] = items[i];

        other[other.length - 1] = obj; // Agrega el item deseado

        items = other; // Sustituimos el anterior conjunto por el nuevo
    }

    public static Conjunto create(int num) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Conjunto " + num);
        System.out.print(" Tamaño: ");
        Conjunto set = new Conjunto(input.nextInt());
        set.fill();

        input.close();

        return set;
    }
}