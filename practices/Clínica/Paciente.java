package practices.Clínica;

public class Paciente extends Persona {
    private int numeroPaciente;
    private String proximaCita;
    private String problemaDental;
    private int edad;
    private double peso;
    private double estatura;
    private String presionArterial;
    private String tratamiento;
    private String estudios;
    private Dentista doctorAsignado;
    private boolean tieneDoctor;

    // Constructor
    public Paciente(String nombre, String direccion, String telefono, int numeroPaciente,
                    String proximaCita, String problemaDental, int edad, double peso,
                    double estatura, String presionArterial, String tratamiento,
                    String estudios) {
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
                        this.tieneDoctor = false;
    }

    public void setDoctorAsignado(Dentista doctorAsignado) {
        this.doctorAsignado = doctorAsignado;
        this.tieneDoctor = true;
    }

    public Dentista getDoctorAsignado() {
        return doctorAsignado;
    }
    
    public String obtenerEstadoAtencion() {
        if (tieneDoctor) {
            return "El paciente " + this.getNombre() + " está siendo atendido por el dentista " +
                   this.getDoctorAsignado().getNombre() + ", especializado en " + this.getDoctorAsignado().getEspecializacion();
        } else {
            return "El paciente " + this.getNombre() + " aún no tiene un doctor asignado.";
        }
    }
}