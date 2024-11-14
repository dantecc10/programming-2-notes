package Programas.practices.Practica15;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Ingrese el número de calificaciones que desea registrar: ");
                n = scanner.nextInt();
                
                if (n <= 0) {
                    throw new NegativeArraySizeException("Error: El número de calificaciones debe ser positivo");
                }
                entradaValida = true;  // Si llegamos aquí, la entrada es válida

                double[] calificaciones = new double[n];
                for (int i = 0; i < n; i++) {
                    try {
                        System.out.print("Ingrese la calificación del alumno " + (i + 1) + " (0-10): ");
                        double calificacion = scanner.nextDouble();
                        if (calificacion < 0 || calificacion > 10) {
                            throw new Exception("Calificación fuera de rango. Debe estar entre 0 y 10.");
                        }
                        calificaciones[i] = calificacion;
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Debe ingresar un número válido para la calificación.");
                        scanner.next();
                        i--;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        i--;
                    }
                }
                System.out.println("Calificaciones registradas exitosamente:");
                for (double calificacion : calificaciones) {
                    System.out.println(calificacion);
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero para la cantidad de calificaciones.");
                scanner.next(); // Limpiar el buffer
            } catch (NegativeArraySizeException e) {
                System.out.println(e.getMessage());
            }
        }
        
        scanner.close();
    }
}