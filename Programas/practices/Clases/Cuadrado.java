package practices.Clases;

public class Cuadrado extends FigurasGeometricas {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double perimetro() {
        return 4 * lado;
    }

    public double area() {
        return lado * lado;
    }
}
