public class Padre{
    protected String nombre;
    protected int a, b;
    private float x;

    public Padre(){
        nombre = "";
        a = b = 0;
        x = 0;
    }

    public Padre(String nom){
        nombre = nom;
        a = b = 0;
        x = 0;
    }

    public Padre(String nombre, int a, int b, float x) {
        this.nombre = nombre;
        this.a = a;
        this.b = b;
        this.x = x;
    }
}
