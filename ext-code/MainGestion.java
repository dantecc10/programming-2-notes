interface Evaluable {
    void evaluarDesempeño();
}

// Clase Abstracta Empleado
abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salarioBase = salario;
    }

    public abstract double calcularSalario(); // Método abstracto

    public abstract double devolverDetalles(); // Método abstracto
}

class Gerente extends Empleado implements Evaluable {
    private double bono;

    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }

    public double evaluarDesempeño() {
        System.out.println("Evaluando desemepeño del gerente " + nombre + ".");
    }

    @Override
    public String getDetalles() {
        return "Desarrollador: " + nombre + ", Salario: " + calcularSalario() + ", Bono: " + bono;
    }
}

// Clase Desarollador
class Desarollador extends Empleado implements Evaluable {
    private String lenguajeProgramacion;

    public Desarollador(String nombre, double salario, String lenguaje) {
        super(nombre, salario);
        this.lenguajeProgramacion = lenguaje;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public double evaluarDesempeño() {
        System.out.println("Evaluando desemepeño del desarrollador " + nombre + ".");
    }

    @Override
    public String getDetalles() {
        return "Desarrollador: " + nombre + ", Salario: " + calcularSalario() + ", Lenguaje: " + lenguajeProgramacion;
    }
}

// Clase Principal para ejecutar el programa
public class MainGestion {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Fanny", 800000, 15000);
        Desarollador desarrollador = new Desarollador("Alejandro", 60000, "Java");

        gerente.evaluarDesempeño();
        System.out.println(gerente.getDetalles());

        desarrollador.evaluarDesempeño();
        System.out.println(desarrollador.getDetalles());
    }
}