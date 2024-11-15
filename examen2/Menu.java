package examen2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) throws OutBoundsException {

        Scanner input = new Scanner(System.in);
        int opc = 0;

        Monedero monedero = new Monedero();

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
            
            opc = Input.verifyOpc(1, 5, "-----------------------------------------");

            clean();
            switch (opc) {
                case 1:
                    // Temperatura
                    new Temperatura();
                    break;
                case 2:
                    // Herencia
                    Animal.menu();
                    break;
                case 3:
                    // Abstraccion
                    SoundPlayer.main(args);
                    break;
                case 4:
                    // Monedero
                    monedero.menu();
                    break;
                case 5:
                    // Salir
                    clean();
                    System.out.print("""
                        \n-----------------------------------------
                        Saliendo...
                        -----------------------------------------""");
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
