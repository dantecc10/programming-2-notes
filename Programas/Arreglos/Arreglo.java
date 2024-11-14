import java.util.Scanner;

public class Arreglo {
	private int n;
	private int A[];
	
	// Constructores
	public Arreglo() {
		n = 2;
		A = new int[n]; // Se reserva la memoria de tamaño n
	}
	public Arreglo(int n) {
		this.n = n;
		A = new int[n]; 
	}
	
	// Métodos
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int[] getA() {
		return A;
	}
	public void setA(int[] a) {
		A = a;
	}
	public void leerA(char c) {
		Scanner lec = new Scanner(System.in);
		
		for (int i=0; i<n; i++) {
			System.out.print(c+"["+i+"]: ")
			A[i] = lec.nextInt();
		}
		//lec.close();
	}
	public float promedio() {
		float prom=0;
		
		for (int i=0; i<n; i++)
			prom += A[i];
		prom /= n;
		return prom;
	}
	public void mostrar(char c) {
		for (int i=0; i<n; i++)
			System.out.println(c+"["+i+"] = "+A[i]);
	}
}
