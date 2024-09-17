package practices.fracciones8;

public class Fraccion {
    int n, d;

    //constructor

    public Fraccion() {
        n = 0;
        d = 1;
    }
    
    public Fraccion(int n) {
        this.n = n;
        d = 1;
    }

    public Fraccion(int n, int d) {
        this.n = n;
        this.d = d;
    }

    public void suma(Fraccion f1, Fraccion f2) {
        n = f1.n*f2.d + f1.d*f2.n;
        d = f1.d * f2.d;
    }

    public void resta(Fraccion f1, Fraccion f2) {
        n = f1.n*f2.d - f1.d*f2.n;
        d = f1.d * f2.d;
    }

    public void multiplica(Fraccion f1, Fraccion f2) {
        n = f1.n * f2.n;
        d = f1.d * f2.d;
    }

    public void divide(Fraccion f1, Fraccion f2) {
        n = f1.n * f2.d;
        d = f1.d * f2.n;
    }

    public String toString() {
        if (d == 0)
            return ("Indefinido");
        return (n + " / " + d);
    }
}
