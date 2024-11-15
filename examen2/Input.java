package examen2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static Scanner input;

    static {
        input = new Scanner(System.in);
    }

    public static int verifyOpc(int low, int high, String line) throws InputMismatchException, OutBoundsException {

        boolean flag = false;
        int opc = 0;

        while(!flag) {
            
            try {

                System.out.print(line + "\nOpcion: ");
                opc = input.nextInt();
                if (opc < low || opc > high) {
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

        return opc;

    }

    public static double verifyDouble(String message) {

        boolean flag = false;
        double value = 0.0;

        while(!flag) {

            System.out.print(message);
            try {

                value = input.nextDouble();
                flag = true;

            } catch (InputMismatchException e) {

                System.err.println("Valor no decimal");
                System.out.println("---------------------------------");

            } finally {
                
                input.nextLine();

            }
            
        }

        return value;

    }
}

class OutBoundsException extends Exception {

    public OutBoundsException() {
        super("Opcion fuera de limites");
    }

}
