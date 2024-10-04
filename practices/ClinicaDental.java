package practices;

// Clase base Persona
class Persona {
    protected String nombre;
    protected String direccion;
    protected String telefono;

    // Constructor
    public Persona(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}

// Clase Dentista que hereda de Persona
class Dentista extends Persona {
    private String cedulaProfesional;
    private String horario;
    private String especializacion;
    private String consultorio;

    // Constructor
    public Dentista(String nombre, String direccion, 
                    String telefono, String cedulaProfesional, 
                    String horario, String especializacion, String consultorio) {
        super(nombre, direccion, telefono);
        this.cedulaProfesional = cedulaProfesional;
        this.horario = horario;
        this.especializacion = especializacion;
        this.consultorio = consultorio;
    }

    // Método para mostrar información del dentista
    public void mostrarInformacion() {
        System.out.println("Dentista: " + nombre + ", Cédula: " + cedulaProfesional);
    }
}

// Clase Paciente que hereda de Persona
class Paciente extends Persona {
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

    // Constructor
    public Paciente(String nombre, String direccion, String telefono, 
                    int numeroPaciente, String proximaCita, String problemaDental, 
                    int edad, double peso, double estatura, String presionArterial, 
                    String tratamiento, String estudios, Dentista doctorAsignado) {
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
        this.doctorAsignado = doctorAsignado;
    }

    // Método para verificar si el doctor asignado existe
    public void verificarDoctorAsignado() {
        if (this.doctorAsignado != null) {
            System.out.println("Paciente: " + nombre + " es atendido por: " + doctorAsignado.nombre);
        } else {
            System.out.println("Paciente: " + nombre + " no tiene doctor asignado.");
        }
    }
}

// Clase principal para probar el programa
public class ClinicaDental {
    public static void main(String[] args) {
        // Creación del dentista
        Dentista dentista1 = new Dentista("Dr. Carlos Pérez", "Av. Siempre Viva 123", "2221887054", "1234567", "9am - 6pm", "Endodoncia", "Consultorio 101");

        // Creación del paciente con un doctor asignado
        Paciente paciente1 = new Paciente("Ana López", "Calle 456", "2228048348", 101, "10/10/2024", "Caries", 25, 65.5, 1.65, "120/80", "Tratamiento de conducto", "Radiografía", dentista1);

        // Verificar que el paciente está atendido por un doctor
        paciente1.verificarDoctorAsignado();

        // Creación del paciente sin doctor asignado
        Paciente paciente2 = new Paciente("Juan Pérez", "Calle 789", "2023283364", 102, "15/10/2024", "Dolor de muelas", 30, 70.0, 1.75, "130/85", "Análisis", "Ninguno", null);

        // Verificar que el paciente no tiene doctor asignado
        paciente2.verificarDoctorAsignado();

    }
}
