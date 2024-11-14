import java.util.InputMismatchException;
import java.util.Scanner;

public class AplicaExcepcion {
	public static void main(String[] st) throws NegativoException, SobregiroException {
		Scanner ent = new Scanner(System.in);
		int opc;
		//char op;
		Cuenta c001 = new Cuenta();
		
		System.out.println("1. Depositar \n2. Retirar \n3. Saldo");
		System.out.print("4. Salir \n  Opcion: ");
		opc = ent.nextInt();
		do {
			try {
				switch(opc) {
					case 1: System.out.print("Cuanto vas a depositar? ");
							double cant = ent.nextDouble();
							c001.ingresa(cant);
							break;
					case 2:	System.out.print("Cuanto vas a retirar? ");
							cant = ent.nextDouble();
							c001.retiro(cant);
							break;
					case 3: System.out.println("Tu saldo es: "+c001.getSaldo());
							break;
					case 4: break;
					default: System.out.println("Opcion incorrecta! ");
							 break;
				}
			}
			catch(NegativoException e) {
				System.out.println("Error: El valor debe ser positivo");
			}
			catch(SobregiroException e) {
				System.out.println("Dinero insuficiente en la cuenta");
			}
			catch(InputMismatchException e) {
				System.out.println("Debe ser un valor numerico!");
				ent.nextLine();
			}
			finally {
				/*System.out.print("Desea continuar (s/n): ");
				op = ent.next().charAt(0);*/
				try {
					System.out.println("1. Depositar \n2. Retirar \n3. Saldo");
					System.out.print("4. Salir \n  Opcion: ");
					opc = ent.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("Debe ser un valor numerico!");
					ent.nextLine();
				}
			}
		//}while(op == 's' || op == 'S');
		}while(opc != 4);
		
		ent.close();
	}
}
