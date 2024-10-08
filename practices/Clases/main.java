package practices.Clases;

import java.util.Scanner;

// Las clases FigurasGeometricas, Circulo, Cuadrado y Trapecio permanecen sin cambios

public class main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nElija una figura geométrica para calcular:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Trapecio");
            System.out.println("4. Salir");
            System.out.print("Ingrese su elección (1-4): ");
            
            int opcion = scanner.nextInt();
            
            if (opcion == 4) {
                System.out.println("Gracias por usar el programa. ¡Hasta luego!");
                break;
            }
            
            switch (opcion) {
                case 1:
                    calcularCirculo();
                    break;
                case 2:
                    calcularCuadrado();
                    break;
                case 3:
                    calcularTrapecio();
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
        
        scanner.close();
    }
    
    private static void calcularCirculo() {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        Circulo circulo = new Circulo(radio);
        System.out.println("Círculo - Perímetro: " + circulo.perimetro() + ", Área: " + circulo.area());
    }
    
    private static void calcularCuadrado() {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        Cuadrado cuadrado = new Cuadrado(lado);
        System.out.println("Cuadrado - Perímetro: " + cuadrado.perimetro() + ", Área: " + cuadrado.area());
    }
    
    private static void calcularTrapecio() {
        System.out.print("Ingrese la base mayor del trapecio: ");
        double baseMayor = scanner.nextDouble();
        System.out.print("Ingrese la base menor del trapecio: ");
        double baseMenor = scanner.nextDouble();
        System.out.print("Ingrese la altura del trapecio: ");
        double altura = scanner.nextDouble();
        System.out.print("Ingrese el primer lado no paralelo del trapecio: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo lado no paralelo del trapecio: ");
        double lado2 = scanner.nextDouble();
        
        Trapecio trapecio = new Trapecio(baseMayor, baseMenor, altura, lado1, lado2);
        System.out.println("Trapecio - Perímetro: " + trapecio.perimetro() + ", Área: " + trapecio.area());
    }
}