package practices.Clínica;

import java.util.Scanner;

public class ClinicaDental {

    private static Scanner input = new Scanner(System.in);
    private static Paciente pacientes[] = new Paciente[10];
    private static int pacienteID = 0;
    private static Dentista dentistas[] = new Dentista[10];
    private static int dentistaID = 0;

    public static void main(String[] args) {


        input.close();
    }

    public static void fillPaciente() {
        System.out.println("\nDatos del paciente:");
        System.out.print("Nombre: ");
        String nombrePaciente = input.nextLine();
        System.out.print("Dirección: ");
        String direccionPaciente = input.nextLine();
        System.out.print("Teléfono: ");
        String telefonoPaciente = input.nextLine();
        System.out.print("Número de Paciente: ");
        int numeroPaciente = input.nextInt();
        System.out.print("Próxima Cita: ");
        String proximaCita = input.nextLine();
        System.out.print("Problema Dental: ");
        String problemaDental = input.nextLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(input.nextLine());
        System.out.print("Peso: ");
        double peso = Double.parseDouble(input.nextLine());
        System.out.print("Estatura: ");
        double estatura = Double.parseDouble(input.nextLine());
        System.out.print("Presión Arterial: ");
        String presionArterial = input.nextLine();
        System.out.print("Tratamiento: ");
        String tratamiento = input.nextLine();
        System.out.print("Estudios: ");
        String estudios = input.nextLine();

        pacientes[pacienteID] = new Paciente(nombrePaciente, direccionPaciente, telefonoPaciente, numeroPaciente, edad, peso, estatura, proximaCita, problemaDental, presionArterial, tratamiento, estudios);
        pacienteID++;
    }

    public static void fillDentista() {
        System.out.println("Datos del dentista:");
        System.out.print("Nombre: ");
        String nombreDentista = input.nextLine();
        System.out.print("Dirección: ");
        String direccionDentista = input.nextLine();
        System.out.print("Teléfono: ");
        String telefonoDentista = input.nextLine();
        System.out.print("Cédula Profesional: ");
        String cedulaProfesional = input.nextLine();
        System.out.print("Horario: ");
        String horario = input.nextLine();
        System.out.print("Especialización: ");
        String especializacion = input.nextLine();
        System.out.print("Consultorio: ");
        int consultorio = input.nextInt();

        dentistas[dentistaID] = new Dentista(nombreDentista, direccionDentista, telefonoDentista, cedulaProfesional, horario, especializacion, consultorio);
        dentistaID++;
    }

    public static void menu() {

        int opc;

        System.out.println("-------| Menu |-------");
        System.out.println("1.     Añadir paciente");
        System.out.println("2.     Añadir dentista");
        System.out.println("3.    Asignar dentista");
        System.out.println("4.  Estado de paciente");
        System.out.println("----------------------");
        System.out.println("Opcion: ");
        opc = input.nextInt();

        switch (opc) {
            case 1:
                fillPaciente();
                break;
            case 2:
                fillDentista();
                break;
            case 3:
                Paciente.setDoctor();
                break;
            case 4:
                Paciente.getEstado();
                break;
            default:
                System.out.println("Opcion invalida, reiniciando...");
                break;
        }
    }
}