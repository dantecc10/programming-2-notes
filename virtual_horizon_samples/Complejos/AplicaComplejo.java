import java.util.Scanner;

public class AplicaComplejo {
	public static void main(String[] x) {
		Scanner en = new Scanner(System.in);
		System.out.print("Parte real: ");
		float a = en.nextFloat();	// Lee desde el tecla un entero
		System.out.print("Parte imaginaria: ");
		float b = en.nextFloat();
		MiComplejo c1 = new MiComplejo(a,b);
		c1.muestra();
		//c1.r = a;  // Existe un error debido a que la variable r es privada
		
		System.out.print("Parte real: ");
		a = en.nextFloat();	// Lee desde el tecla un entero
		System.out.print("Parte imaginaria: ");
		b = en.nextFloat();
		MiComplejo c2 = new MiComplejo(a,b);
		//c2.setR(a);
		//c2.setI(b);
		//c2.muestra();
		
		MiComplejo c3 = new MiComplejo();
		//c3.suma(c1, c2);
		c3 = c1.suma(c2);
		//c3.muestra();
		System.out.println("Primer objeto: "+c1);
		System.out.println("Segundo objeto: "+c2);
		System.out.println("La suma es: "+c3);
		
		en.close();
	}
}
