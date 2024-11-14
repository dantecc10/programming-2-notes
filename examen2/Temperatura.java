package examen2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Temperatura {
    
    // Crea un menu para la opcion
    public Temperatura() {

        Scanner input = new Scanner(System.in);

        System.out.println("""
            -------------| Conversor de temperatura |-------------
            Bienvenido, ingresa un valor con el siguiente formato:
                                  36 C, 36 F                      

                    "Para salir digite la temperatura 999"        
            """);
        
        double tempValue = 0;
        char scale = ' ';
        boolean flag = false;
        boolean exit = false;

        while (!exit) {
            while(!flag) {
                System.out.print("------------------------------------------------------\nTemperatura: ");
            
                String temp = input.nextLine();
                String[] data = temp.split(" ");

                if(isValid(data)) {
                    tempValue = Double.parseDouble(data[0]);
                    scale = data[1].charAt(0);
                    flag = true;
                } else {
                    System.out.println("Temperatura invalida, intente de nuevo");
                }
            }

            if (tempValue != 999.0) {
                Double convertedValue = convert(tempValue, scale);
                String message = "es igual a";
                String[] scaleMessage = {"C", "F"};
                int m1, m2;
                if (scale == 'c' || scale == 'C') {
                    m1 = 0;
                    m2 = 1;
                } else {
                    m1 = 1;
                    m2 = 0;
                }
                String output = String.format("%.1f %s %s %.1f %s ", tempValue, scaleMessage[m1], message, convertedValue, scaleMessage[m2]);
                System.out.println(output + "\n------------------------------------------------------\n");

                flag = false;
            } else {
                exit = true;
            }
        }

    }

    // Comprueba si la entrada corresponde al formato solicitado
    public boolean isValid(String[] data) {
        if (data.length != 2) {
            return false;
        } else {
            try {
                Double.parseDouble(data[0]);
            } catch (NumberFormatException e) {
                return false;
            }

            if (data[1].equalsIgnoreCase("c") || data[1].equalsIgnoreCase("f")) {
                return true;
            }
            return false;
        }
    }

    // Convierte la temperatura
    public Double convert(double temp, char scale) {

        // Dependiendo la escala ingresada se convierte de una forma, u otra
        if (scale == 'c' || scale == 'C') {
            temp *= 9.0;
            temp += 160.0;
            temp /= 5.0;
        } else {
            temp -= 32.0;
            temp *= 5.0;
            temp /= 9.0;
        }

        return temp;
    }
}
