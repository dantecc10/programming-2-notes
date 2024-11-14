
package practices.FigGeometrica;

import java.util.Scanner;

public class FigGeometrica {

    private int side;
    private float size;

    // -----| Constructors |-----
    public FigGeometrica() {
        side = 3;
        size = 1.0f;
    }
    
    public FigGeometrica(int side) {
        if (side >= 3)
            this.side = side;
        else {
            this.side = 3;
            System.out.println("\n* Cantidad de lados invalida *\nSe genero un triangulo por defecto");
        }
        size = 1.0f;
    }

    public FigGeometrica(float size) {
        side = 3;
        if (size > 0)
            this.size = size;
        else {
            this.size = 1;
            System.out.println("\n* Longitud de lados invalida *\nSe define con 1 por defecto");
        }
    }

    public FigGeometrica(int side, float size) {

        boolean s = false;
        boolean l = false;

        if (side >= 3)
            this.side = side;
        else {
            this.side = 3;
            s = true;
        }

        if (size > 0)
            this.size = size;
        else {
            this.size = 1;
            l = true;
        }

        if (s && l)
            System.out.println("\n* Parametros invalidos *\nSe genero un triangulo con lados de 1 unidad");
        else if (s)
            System.out.println("\n* Cantidad de lados invalida *\nSe genero un triangulo por defecto");
        else if (l)
            System.out.println("\n* Longitud de lados invalida *\nSe define con 1 por defecto");
    }

    // -----| Methods |-----
    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public float getSize() {
        return size;
    }

    public float perimeter() {
        float pe = side * size;
        return pe;
    }

    // -----| Main |-----
    public static void main(String args[]) {

        Scanner entry = new Scanner(System.in);

        System.out.print("\n-----| Generador de figuras |-----\n\nNúmero de lados: ");
        int sides = entry.nextInt();
        System.out.print("Longitud de los lados: ");
        float length = entry.nextFloat();

        FigGeometrica geo = new FigGeometrica(sides, length);
        System.out.println("\nPerimetro de la figura: " + geo.perimeter());

        entry.close();
    }
}
