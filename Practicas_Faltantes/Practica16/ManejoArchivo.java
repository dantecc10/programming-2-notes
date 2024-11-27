package Practicas_Faltantes.Practica16;

import java.io.*;
import java.util.Scanner;

public class ManejoArchivo {
    
    private static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }
    
    public void mostrarArchivoInvertido(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("\nContenido del archivo invertido:");
            System.out.println("------------------------------");
            
            while ((linea = br.readLine()) != null) {
                System.out.println("Original  : " + linea);
                System.out.println("Invertido : " + invertirCadena(linea));
                System.out.println("------------------------------");
            }
            
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManejoArchivo manejador = new ManejoArchivo();
        
        System.out.print("Ingrese el nombre del archivo a leer: ");
        String nombreArchivo = scanner.nextLine();
        
        manejador.mostrarArchivoInvertido(nombreArchivo);
        
        scanner.close();
    }
}