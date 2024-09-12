package practices.arreglo;

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
			System.out.print(c+"["+i+"]: ");
			A[i] = lec.nextInt();
		}
		//lec.close();
	}

	public float promedio() {
		float prom = 0;

		for (int i = 0; i < n; i++)
			prom += A[i];
		prom /= n;
		return prom;
	}

	public void mostrar(char c) {
		for (int i = 0; i < n; i++)
			System.out.println(c + "[" + i + "] = " + A[i]);
	}

	public void sumar(int B[]) {
		for (int i = 0; i < n; i++) {
			int temp = A[i] + B[i];
			System.out.print("A [" + i + "] + B [" + i + "] = " + temp + "\n");
		}
	}

	public void restar(int B[]) {
		for (int i = 0; i < n; i++) {
			int temp = A[i] - B[i];
			System.out.print("A [" + i + "] - B [" + i + "] = " + temp + "\n");
		}
	}

	public int productoPunto(int B[]) {
		int point_product = 0;
		for (int i = 0; i < n; i++) {
			point_product += A[i] * B[i];
		}
		return point_product;
	}
}
