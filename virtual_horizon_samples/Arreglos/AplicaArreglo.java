import java.util.Scanner;

public class AplicaArreglo {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		
		System.out.print("Da la dimension del arreglo: ");
		int n = intro.nextInt();
		Arreglo A1 = new Arreglo(n);
		A1.leerA('A');
		System.out.println("El promedio es: "+A1.promedio());
		Arreglo A2 = new Arreglo(n);
		A2.leerA('B');
		System.out.println("El promedio es: "+A2.promedio());
		A2.mostrar('B');
		
		
		intro.close();
	}
}
