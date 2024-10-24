package practices.Clínica;

public class Dentista extends Persona {

    private String cedulaProfesional;
    private String horario;
    private String especializacion;
    private int consultorio;

    public Dentista(
        String nombre,
        String direccion,
        String telefono,
        String cedulaProfesional,
        String horario,
        String especializacion,
        int consultorio
        ) {
        super(nombre, direccion, telefono);
        this.cedulaProfesional = cedulaProfesional;
        this.horario = horario;
        this.especializacion = especializacion;
        this.consultorio = consultorio;
    }

    public String getEspecializacion() {
        return especializacion;
    }
}