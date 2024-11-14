
package practices.AbstractTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(
            "\n -----| Figuras Geometricas |-----\n" +
            "\n Circulo" +
            "\n Radio: ");
        Circle circulo = new Circle(input.nextFloat());

        System.out.print(
            "\n Cuadrado" +
            "\n Lado: ");
        Square cuadrado = new Square(input.nextFloat());

        System.out.print(
            "\n Trapecio" +
            "\n Base 1: ");
        float b1 = input.nextFloat();
        System.out.print(" Base 2: ");
        float b2 = input.nextFloat();
        System.out.print(" Altura: ");
        float h = input.nextFloat();
        Trapezoid trapecio = new Trapezoid(b1, b2, h);

        System.out.println(
            "\n -----| Resultados obtenidos |-----\n" +
            "\n Circulo" +
            "\n Area: " + circulo.area() + " u²" +
            "\n Perimetro: " + circulo.perimeter() + " u\n" +
            "\n Cuadrado" +
            "\n Area: " + cuadrado.area() + " u²" +
            "\n Perimetro: " + cuadrado.perimeter() + " u\n" +
            "\n Trapecio" +
            "\n Area: " + trapecio.area() + " u²" +
            "\n Perimetro: " + trapecio.perimeter() + " u");

        input.close();
    }
}
