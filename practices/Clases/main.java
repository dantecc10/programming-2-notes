package practices.Clases;

import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Elija una figura geométrica para calcular:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Trapecio");
            System.out.println("4. Salir");
            System.out.print("Ingrese su elección (1-4): ");
            
            int opcion = scanner.nextInt();
            
            if (opcion == 4) {
                System.out.println("\nGracias por usar el programa. ¡Hasta luego!");
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
                    System.out.println("\nOpción no válida. Por favor, intente de nuevo.\n");
            }
        }
        
        scanner.close();
    }
    
    private static void calcularCirculo() {
        System.out.print("\nIngrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        Circulo circulo = new Circulo(radio);
        System.out.println("\nCírculo - Perímetro: " + circulo.perimetro() + ", Área: " + circulo.area());
    }
    
    private static void calcularCuadrado() {
        System.out.print("\nIngrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        Cuadrado cuadrado = new Cuadrado(lado);
        System.out.println("\nCuadrado - Perímetro: " + cuadrado.perimetro() + ", Área: " + cuadrado.area());
    }
    
    private static void calcularTrapecio() {
        System.out.print("\nIngrese la base mayor del trapecio: ");
        double baseMayor = scanner.nextDouble();
        System.out.print("Ingrese la base menor del trapecio: ");
        double baseMenor = scanner.nextDouble();
        System.out.print("Ingrese la altura del trapecio: ");
        double altura = scanner.nextDouble();
        System.out.print("Ingrese el primer lado del trapecio: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo lado del trapecio: ");
        double lado2 = scanner.nextDouble();
        
        Trapecio trapecio = new Trapecio(baseMayor, baseMenor, altura, lado1, lado2);
        System.out.println("\nTrapecio - Perímetro: " + trapecio.perimetro() + ", Área: " + trapecio.area());
    }
}