package practices.Clínica;

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

    // Método para mostrar información básica
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }
}

// Clase Dentista que hereda de Persona
class Dentista extends Persona {
    private String cedulaProfesional;
    private String horario;
    private String especializacion;
    private String consultorio;

    // Constructor
    public Dentista(String nombre, String direccion, String telefono, 
                    String cedulaProfesional, String horario, 
                    String especializacion, String consultorio) {
        super(nombre, direccion, telefono);
        this.cedulaProfesional = cedulaProfesional;
        this.horario = horario;
        this.especializacion = especializacion;
        this.consultorio = consultorio;
    }

    // Método para mostrar información del dentista
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cédula Profesional: " + cedulaProfesional);
        System.out.println("Horario: " + horario);
        System.out.println("Especialización: " + especializacion);
        System.out.println("Consultorio: " + consultorio);
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

    // Método para mostrar información del paciente
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de Paciente: " + numeroPaciente);
        System.out.println("Próxima Cita: " + proximaCita);
        System.out.println("Problema Dental: " + problemaDental);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Estatura: " + estatura);
        System.out.println("Presión Arterial: " + presionArterial);
        System.out.println("Tratamiento: " + tratamiento);
        System.out.println("Estudios: " + estudios);
        System.out.println("Doctor Asignado: " + doctorAsignado.nombre);
    }

    // Método para verificar si el doctor asignado existe
    public boolean verificarDoctorAsignado() {
        if (this.doctorAsignado != null) {
            System.out.println("Paciente: " + nombre + " es atendido por: " + doctorAsignado.nombre);
            return true;
        } else {
            System.out.println("Paciente: " + nombre + " no tiene doctor asignado.");
            return false;
        }
    }
}

// Clase principal para probar el programa
public class ClinicaDental {
    public static void main(String[] args) {
        // Creación del dentista
        Dentista dentista1 = new Dentista("Dr. Carlos Pérez", "Av. Siempre Viva 123", "2228048348", "1234567", "Lunes a Viernes 8am - 8pm", "Endodoncia", "Consultorio 117");

        // Creación del paciente con un doctor asignado
        Paciente paciente1 = new Paciente("Oswaldo Huertero", "123 Oriente", "2221887054", 101, "17/06/2024", "Caries", 19, 65.5, 1.82, "120/80", "Tratamiento de ortodoncia", "Eliminación de Caries", dentista1);

        // Creación del paciente sin doctor asignado
        Paciente paciente2 = new Paciente("Juan Pérez", "Calle Ejemplo 789", "555-6789", 102, "15/10/2024", "Dolor de muelas", 30, 70.0, 1.75, "130/85", "Análisis", "Ninguno", null);

        // Mostrar información del paciente y verificar doctor asignado
        paciente1.mostrarInformacion();
        paciente1.verificarDoctorAsignado();

        // Verificar que el paciente no tiene doctor asignado
        paciente2.verificarDoctorAsignado();
    }
}
