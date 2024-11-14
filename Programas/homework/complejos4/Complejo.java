// Lee 2 complejos, luego ejecuta las 4 operaciones basicas con ellos
package homework.complejos4;

public class Complejo {

    // Variables
    protected float r, i;

    // Constructores
    public Complejo() {
        r = 0;
        i = 0;
    }

    public Complejo(float r) {
        this.r = r;
        i = 0;
    }

    public Complejo(float r, float i) {
        this.r = r;
        this.i = i;
    }

    // Metodos

    public void suma(Complejo c1, Complejo c2) {
        r = c1.r + c2.r;
        i = c1.i + c2.i;    
    }

    public void resta(Complejo c1, Complejo c2) {
        r = c1.r - c2.r;
        i = c1.i - c2.i;    
    }

    public void multiplica(Complejo c1, Complejo c2) {
        r = c1.r * c2.r - c1.i * c2.i;
        i = c1.r * c2.i + c1.i * c2.r;
    }

    public void divide(Complejo c1, Complejo c2) {
        r = (c1.r * c2.r + c1.i * c2.i)/(c2.r*c2.r + c2.i*c2.i);
        i = (c1.i * c2.r - c1.r * c2.i)/(c2.r*c2.r + c2.i*c2.i);
    }

    // Sobreescribimos "toString"
    public String toString() {
        if (i == 0)
            return (r + "");
        else if (i > 0)
            return (r + " + " + i + "i");
        return (r + " - " + (-i) + "i");
    }
}