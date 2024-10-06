
package practices.AbstractTwo;

public class Square extends FigureGeometric {

    // -----| Constructors |-----
    public Square() {
        super();
    }

    public Square(float length) { // Consideramos length como los lados
        super(length > 0 ? length : 1.0f);
        if (length <= 0)
            System.err.println(" Lado invalido, se creo un cuadrado de lado 1 en su lugar");
    }

    // -----| Methods |-----
    public float area() {
        return (float) Math.pow(length, 2);
    }

    public float perimeter() {
        return length * 4;
    }
}
