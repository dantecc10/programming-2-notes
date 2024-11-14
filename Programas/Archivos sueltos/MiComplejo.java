public class MiComplejo {
    private float r, i;

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getI() {
        return i;
    }

    public void setI(float i) {
        this.i = i;
    }

    public void suma(MiComplejo c1, MiComplejo c2) {
        r = c1.r + c2.r;
        i = c1.i + c2.i;
    }

    public void muestra() {
        if (i < 0) {
            System.out.println(r + " - " + (-i) + "i");
        } else {
            System.out.println(r + " + " + i + "i");
        }
    }
}