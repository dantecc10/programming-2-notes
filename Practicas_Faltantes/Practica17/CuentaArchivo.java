package Practicas_Faltantes.Practica17;

import java.io.*;
import java.util.Scanner;

public class CuentaArchivo {
    private int palabras;
    private int caracteres;
    private int lineas;

    // Constructor
    public CuentaArchivo() {
        this.palabras = 0;
        this.caracteres = 0;
        this.lineas = 0;
    }

    // Método para analizar el archivo
    public void analizarArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // Contar líneas
                lineas++;

                // Contar caracteres (incluyendo espacios)
                caracteres += linea.length();

                // Contar palabras
                if (!linea.trim().isEmpty()) {
                    // Dividir la línea en palabras y contar
                    String[] palabrasEnLinea = linea.trim().split("\\s+");
                    palabras += palabrasEnLinea.length;
                }
            }

            // Mostrar resultados
            mostrarResultados();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    // Método para mostrar resultados
    public void mostrarResultados() {
        System.out.println("\n=== Resultados del análisis ===");
        System.out.println("Número de líneas: " + lineas);
        System.out.println("Número de palabras: " + palabras);
        System.out.println("Número de caracteres: " + caracteres);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaArchivo contador = new CuentaArchivo();

        System.out.print("Ingrese el nombre del archivo a analizar: ");
        String nombreArchivo = scanner.nextLine();

        contador.analizarArchivo(nombreArchivo);
        
        scanner.close();
    }
}
