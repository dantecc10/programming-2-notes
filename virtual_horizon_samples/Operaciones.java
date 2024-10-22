import java.util.Scanner;

public class Operaciones {
	public static void main(String cad[]) {
		//Scanner ent;	// Definir la variable
		//ent = new Scanner(System.in);	// Instanciar la variable
		Scanner ent = new Scanner(System.in);
		System.out.print("Dame un valor: ");
		int a = ent.nextInt();	// Lee desde el tecla un entero
		System.out.print("Dame otro valor: ");
		int b = ent.nextInt();
		double x = Math.sqrt(a);	// Método de clase
		float c = (float)a/b; // cast
				
		System.out.println("La suma es: " + (a+b));
		System.out.println("La raiz cuadrada de "+a+" es: "+x);
		System.out.println("La división es: " + c);
		ent.close();
	}
}
