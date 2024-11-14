package practices.Clases;

public class Trapecio extends FigurasGeometricas {
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double lado1;
    private double lado2;

    public Trapecio(double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double perimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }

    public double area() {
        return ((baseMayor + baseMenor) / 2) * altura;
    }
}