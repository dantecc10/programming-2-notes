
package practices.AbstractTwo;

public abstract class FigureGeometric {
    
    protected float length;

    // -----| Constructors |-----
    public FigureGeometric() {
        length = 1.0f;
    }

    public FigureGeometric(float length) {
        this.length = length;
    }

    // -----| Methods |-----
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public abstract float area();

    public abstract float perimeter();
}
