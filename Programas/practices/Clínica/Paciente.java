package Programas.practices.Clínica;

public class Paciente extends Persona {
    
    private int numeroPaciente;
    private int edad;
    private double peso;
    private double estatura;
    private String proximaCita;
    private String problemaDental;
    private String presionArterial;
    private String tratamiento;
    private String estudios;
    private Dentista doctorAsignado;
    private boolean tieneDoctor;

    // Constructor
    public Paciente(
        String nombre,
        String direccion,
        String telefono,
        int numeroPaciente,
        int edad,
        double peso,
        double estatura,
        String proximaCita,
        String problemaDental,
        String presionArterial,
        String tratamiento,
        String estudios
        ) {
        super(nombre, direccion, telefono);
        this.numeroPaciente = numeroPaciente;
        this.proximaCita = proximaCita;
        this.problemaDental = problemaDental;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.presionArterial = presionArterial;
        this.tratamiento = tratamiento;
        this.estudios = estudios;
        doctorAsignado = null;
        tieneDoctor = false;
    }

    public void setDoctor(Dentista doctorAsignado) {
        this.doctorAsignado = doctorAsignado;
        this.tieneDoctor = true;
    }

    public Dentista getDoctor() {
        if (tieneDoctor) {
            return doctorAsignado;
        } else {
            System.out.println("Doctor no asignado!");
            return null;
        }
    }
    
    public String getEstado() {
        if (tieneDoctor) {
            return "El paciente " + getNombre() + " está siendo atendido por el dentista " +
                   getDoctor().getNombre() + ", especializado en " + getDoctor().getEspecializacion();
        } else {
            return "El paciente " + getNombre() + " aún no tiene un doctor asignado.";
        }
    }
}