package examen2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) throws OutBoundsException {

        Scanner input = new Scanner(System.in);
        int opc = 0;

        while (opc != 5) {
            clean();
            System.out.print("""
                --------------| Examen #2 |--------------
                        Por favor elija una opcion

                1.               Conversor de temperatura
                2.     Descripcion de animales (Herencia)
                3.      Sonidos de animales (Abstraccion)
                4.                      Manejo de activos
                5.                                  Salir
                """);

            boolean flag = false;
            
            while(!flag) {
                try {

                    System.out.print("-----------------------------------------\nOpcion: ");
                    opc = input.nextInt();
                    if (opc < 1 || opc > 5) {
                        throw new OutBoundsException();
                    }
                    flag = true;
                    
                } catch (InputMismatchException e) {
                    System.err.print("Opcion no numerica");
                } catch (OutBoundsException e) {
                    System.err.print(e.getMessage());
                } finally {
                    input.nextLine();
                    if (!flag) {
                        System.out.println(", intente de nuevo");
                    }
                }
            }

            clean();
            switch (opc) {
                case 1:
                    new Temperatura();
                    break;
                case 2:
                    // Herencia
                    break;
                case 3:
                    // Abstraccion
                    break;
                case 4:
                    new Monedero();
                    break;
                case 5:
                    clean();
                    System.out.print("\nSaliendo...");
                    break;
            }
        }
    }

    public static void clean() {
        
        // Robado de por ahi
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class OutBoundsException extends Exception {

    public OutBoundsException() {
        super("Opcion fuera de limites");
    }

}
