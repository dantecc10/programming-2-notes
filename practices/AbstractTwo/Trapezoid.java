
package practices.AbstractTwo;

public class Trapezoid extends FigureGeometric {

    private float base1, base2;

    // -----| Constructors |-----
    public Trapezoid() {
        super();
        base1 = 1.5f;
        base2 = 1.0f;
    }

    public Trapezoid(float base1, float base2, float heigth) {
        super(heigth > 0 ? heigth : 1.0f);
        this.base1 = (base1 > 0) ? base1 : 1.0f;
        this.base2 = (base2 > 0) ? base2 : 1.0f;

        if (base1 <= 0 || base1 <= 0 || heigth <= 0)
            System.err.println(" Uno o varios de los valores es invalido, se les asigna 1 unidad por defecto");
    }

    // -----| Methods |-----
    public float area() {
        return ((base1 + base2) * length) / 2;
    }

    public float perimeter() {
        float c;

        if (base1 > base2)
            c = (base1 - base2) / 2;
        else
            c = (base2 - base1) / 2;

        float sides = (float) Math.sqrt(Math.pow(c, 2) + Math.pow(length, 2));

        return base1 + base2 + sides * 2;
    }
}
