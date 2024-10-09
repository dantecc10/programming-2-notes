package practices.Clínica;

import java.util.Scanner;

public class ClinicaDental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un dentista
        System.out.println("Ingrese los datos del dentista:");
        System.out.print("Nombre: ");
        String nombreDentista = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionDentista = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoDentista = scanner.nextLine();
        System.out.print("Cédula Profesional: ");
        String cedulaProfesional = scanner.nextLine();
        System.out.print("Horario: ");
        String horario = scanner.nextLine();
        System.out.print("Especialización: ");
        String especializacion = scanner.nextLine();
        System.out.print("Consultorio: ");
        String consultorio = scanner.nextLine();

        Dentista dentista = new Dentista(nombreDentista, direccionDentista, telefonoDentista,
                cedulaProfesional, horario, especializacion, consultorio);

        // Crear un paciente
        System.out.println("\nIngrese los datos del paciente:");
        System.out.print("Nombre: ");
        String nombrePaciente = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionPaciente = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoPaciente = scanner.nextLine();
        System.out.print("Número de Paciente: ");
        int numeroPaciente = Integer.parseInt(scanner.nextLine());
        System.out.print("Próxima Cita: ");
        String proximaCita = scanner.nextLine();
        System.out.print("Problema Dental: ");
        String problemaDental = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Peso: ");
        double peso = Double.parseDouble(scanner.nextLine());
        System.out.print("Estatura: ");
        double estatura = Double.parseDouble(scanner.nextLine());
        System.out.print("Presión Arterial: ");
        String presionArterial = scanner.nextLine();
        System.out.print("Tratamiento: ");
        String tratamiento = scanner.nextLine();
        System.out.print("Estudios: ");
        String estudios = scanner.nextLine();

        Paciente paciente = new Paciente(nombrePaciente, direccionPaciente, telefonoPaciente,
                numeroPaciente, proximaCita, problemaDental, edad, peso, estatura,
                presionArterial, tratamiento, estudios);

        // Asignar el dentista al paciente
        paciente.setDoctorAsignado(dentista);

        // Mostrar la información
        System.out.println("\nEl paciente " + paciente.getNombre() + " está siendo atendido por el dentista " +
                paciente.getDoctorAsignado().getNombre() + ", especializado en " + dentista.getEspecializacion());

        scanner.close();
    }
}