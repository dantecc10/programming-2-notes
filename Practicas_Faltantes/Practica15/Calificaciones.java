package Practicas_Faltantes.Practica15;

import java.util.InputMismatchException;
import java.util.Scanner;

import Practicas_Faltantes.Clean;

/*
 * Realizar un programa en Java que:
 * 
 * Implemente la obtención de n calificaciones de alumnos
 * La excepción que se genere deberá ser cuando la calificación esté fuera del rango (0-10)
 * Se debe tener excepciones por el tipo de dato introducido
 * Se debe dar el manejo adecuado de las excepciones 
 */

public class Calificaciones {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;
        int n = 0;

        Clean.console();

        while (!entradaValida) {

            try {
                System.out.print("\nIngrese el número de calificaciones que desea registrar: ");
                n = scanner.nextInt();
                
                if (n <= 0) {
                    throw new NegativeArraySizeException("Error: El número de calificaciones debe ser positivo");
                }
                entradaValida = true;  // Si llegamos aquí, la entrada es válida

                double[] calificaciones = new double[n];
                System.out.println();
                for (int i = 0; i < n; i++) {
                    try {
                        System.out.print("Ingrese la calificación del alumno " + (i + 1) + " (0-10): ");
                        double calificacion = scanner.nextDouble();
                        if (calificacion < 0 || calificacion > 10) {
                            throw new Exception("Calificación fuera de rango. Debe estar entre 0 y 10.\n");
                        }
                        calificaciones[i] = calificacion;
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Debe ingresar un número válido para la calificación.\n");
                        scanner.next();
                        i--;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        i--;
                    }
                }
                System.out.println("\nCalificaciones registradas exitosamente:\n----------------------------------------");

                int alumnoID = 1;
                for (double calificacion : calificaciones) {

                    System.out.println("Alumno " + alumnoID + ": " + calificacion);
                    alumnoID++;

                }

            } catch (InputMismatchException e) {

                System.out.println("Error: Debe ingresar un número entero para la cantidad de calificaciones.");
                scanner.nextLine(); // Limpiar el buffer

            } catch (NegativeArraySizeException e) {

                System.out.println(e.getMessage());

            }
        }
        scanner.close();
    }
}