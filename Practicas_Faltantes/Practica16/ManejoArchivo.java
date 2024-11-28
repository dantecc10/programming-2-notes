package Practicas_Faltantes.Practica16;

import java.io.*;
import java.util.Scanner;

import Practicas_Faltantes.Clean;

/*
 * Realizar un programa en Java
 * 
 * Implementar la clase llamada ManejoArchivo, que permita:
 * Mostrar el contenido de un archivo en pantalla, pero cada cadena de manera inversa.
 * Por ejemplo: Si el archivo contiene la cadena "Hola mundo" en pantalla se debe presentar "odnum aloH"
 */

public class ManejoArchivo {

    private static int lineNumber = 1;
    
    private static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }
    
    public static void mostrarArchivoInvertido(String nombreArchivo) {

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("\nContenido del archivo invertido:");
            System.out.println("--------------------------------------------------");
            
            while ((linea = br.readLine()) != null) {
                System.out.println(lineNumber + " " + invertirCadena(linea));
                lineNumber++;
            }
            
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Clean.console();

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del archivo a leer: ");
        String nombreArchivo = scanner.nextLine();
        
        mostrarArchivoInvertido(nombreArchivo);
        scanner.close();
    }
}