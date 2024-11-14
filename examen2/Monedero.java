package examen2;
import java.util.Scanner;

// Clase Datos
class Datos {
    private double saldo;
    
    // Constructor con cantidad inicial
    public Datos(double cantidadInicial) {
        this.saldo = cantidadInicial;
    }
    
    // Constructor sin dinero
    public Datos() {
        this.saldo = 0;
    }
    
    // Método para meter dinero
    public void meterDinero(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Se agregaron $" + cantidad + " al monedero.");
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }
    }
    
    // Método para sacar dinero
    public boolean sacarDinero(double cantidad) {
        if (cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
            System.out.println("Se retiraron $" + cantidad + " del monedero.");
            return true;
        } else {
            System.out.println("No hay suficiente saldo o la cantidad es inválida.");
            return false;
        }
    }
    
    // Método para consultar saldo
    public double consultarSaldo() {
        return this.saldo;
    }
}

// Clase principal Monedero
public class Monedero {

    Datos miMonedero;

    public Monedero() {
        // Inicia sin saldo, usando la clase Datos
        miMonedero = new Datos();
    }

    public void menu() {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n=== MENÚ MONEDERO ===");
            System.out.println("1. Meter dinero");
            System.out.println("2. Sacar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a meter: $");
                    miMonedero.meterDinero(scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a sacar: $");
                    miMonedero.sacarDinero(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Saldo actual: $" + miMonedero.consultarSaldo());
                    break;
                case 4:
                    System.out.println("¡Gracias por usar el monedero!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 4);
    }
}
