
package practices.AbstractTwo;

public class Circle extends FigureGeometric {

    // -----| Constructors |-----
    public Circle() {
        super();
    }

    public Circle(float radius) { // Consideramos length como radius
        super(radius > 0 ? radius : 1.0f);
        if (radius <= 0)
            System.err.println(" Radio invalido, se creo un circulo unitario en su lugar");
    }

    // -----| Methods |-----
    public float area() {
        return (float) (Math.PI * Math.pow(length, 2));
    }

    public float perimeter() {
        return (float) (Math.PI * length * 2);
    }
}
