package practices.Clínica;

public class Persona {
    protected String nombre;
    protected String direccion;
    protected String telefono;

    public Persona(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }
}