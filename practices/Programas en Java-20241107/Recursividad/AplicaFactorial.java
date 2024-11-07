import java.util.Scanner;

public class AplicaFactorial {
	public static void main(String[] cad) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Dame el valor de n: ");
		int n = ent.nextInt();
		System.out.println("Iterativa: "+Factorial.facIter(n));
		System.out.println("Recursiva: "+Factorial.facRec(n));
		
		ent.close();
	}
}
