import java.util.Scanner;

public class AplicaFibo {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Dame el valor de n: ");
		int n = ent.nextInt();
		System.out.println("De manera iterativa: ");
		Fibonacci.fiboIter(n);
		System.out.println("\nDe manera iterativa con arreglos: ");
		Fibonacci.fiboArray(n);
		System.out.println("\nDe manera recursiva: ");
		//System.out.println("La serie es: "+Fibonacci.fiboRec(n));
		System.out.print("La serie es: 1 1 ");
		Fibonacci.fiboRec(n, true);
		
		ent.close();
	}
}
