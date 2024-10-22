import java.util.InputMismatchException;
import java.util.Scanner;

public class DivPorCero {
	public static void main(String st[]) {
		Scanner ent = new Scanner(System.in);
		int opc;
		
		do {
			try {
				System.out.print("Dame un número: ");
				int a = ent.nextInt();
				System.out.print("Dame otro número: ");
				int b = ent.nextInt();
				int c = a/b;
				System.out.println("La division es: "+c);
			}
			catch(ArithmeticException e) {
				System.out.println("División entre cero!");
			}
			catch(InputMismatchException e) {
				System.out.println("Debe ser un valor entero!");
				ent.nextLine();
			}
			finally {
				System.out.print("Desea continuar (1.Si 2.No): ");
				opc = ent.nextInt();
			}
		}while(opc == 1);
		
		ent.close();
	}
}
