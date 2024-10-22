import java.util.Scanner;

public class AplicaOperaciones {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int opc, a, b;
		do {
			System.out.println("\n1. Complejos \n2. Fracciones");
			System.out.print("3. Salida \n Da tu opcion: ");
			opc = ent.nextInt();
			switch (opc) {
				case 1: System.out.printf("Parte real: ");
						a = ent.nextInt();
						System.out.printf("Parte imaginaria: ");
						b = ent.nextInt();
						Complejo c1 = new Complejo(a,b);
						System.out.printf("Parte real: ");
						a = ent.nextInt();
						System.out.printf("Parte imaginaria: ");
						b = ent.nextInt();
						Complejo c2 = new Complejo(a,b);
						Complejo c3 = new Complejo();
						c3.suma(c1, c2);
						System.out.println("La suma es: "+c3);
						c3.resta(c1, c2);
						System.out.println("La resta es: "+c3);
						break;
				case 2: System.out.printf("Numerador: ");
						a = ent.nextInt();
						System.out.printf("Denominador: ");
						b = ent.nextInt();
						Fraccion f1 = new Fraccion(a,b);
						System.out.printf("Numerador: ");
						a = ent.nextInt();
						System.out.printf("Denominador: ");
						b = ent.nextInt();
						Fraccion f2 = new Fraccion(a,b);
						Fraccion f3 = new Fraccion();
						f3.suma(f1, f2);
						if (f3.getB() != 0)
							System.out.println("La suma es: "+f3);
						else
							System.out.println("Error!");
						f3.resta(f1, f2);
						if (f3.getB() != 0)
							System.out.println("La resta es: "+f3);
						else
							System.out.println("Error!");
						break;
				case 3: System.out.println("Saliendo...");
						break;
				default: System.out.println("Error opcion incorrecta");
			}
			
		}while (opc != 3);
		//Operaciones o1 = new Operaciones();
		// No se pueden crear hijos de una clase abstracta
		
		ent.close();
	}
}
