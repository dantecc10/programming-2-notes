import java.util.Scanner;

public class AplicaEstatica {
	public static void main(String[] cad) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Dame el primer dato: ");
		int a = ent.nextInt();
		ClaseEstatica ob1 = new ClaseEstatica(a);
		ob1.operacion();
		System.out.println("Numero de objetos creados: "+ClaseEstatica.b);
		ClaseEstatica ob2 = new ClaseEstatica();
		System.out.println("Numero de objetos creados: "+ClaseEstatica.b);
		// ob1.suma(a,a); // No puede ser accedido porque suma es un método de clase
		ob2.operacion();
		
		System.out.print("Dame el un dato: ");
		float x = ent.nextFloat();
		System.out.print("Dame el un dato: ");
		float y = ent.nextFloat();
		System.out.print("Suma: "+ClaseEstatica.suma(x, y));
		
		ent.close();
	}
}
