public class Fibonacci {
	public static void fiboIter(int n) {
		int a, b, c;
		
		a = b = 1;
		if (n<2)
			System.out.println("El valor debe ser mayor a 2");
		else {
			System.out.print("La serie es: "+a+" "+b+" ");
			for (int i=3; i<=n; i++) {
				c = a+b;
				System.out.print(c+" ");
				a = b;
				b = c;
			} // for
		} // else
	}
	
	public static void fiboArray(int n) {
		int A[] = new int[n];
		
		if (n<2)
			System.out.println("El valor debe ser mayor a 2");
		else {
			A[0] = A[1] = 1;
			System.out.print("La serie es: ");
			for (int i=2; i<n; i++)
				A[i] = A[i-1]+A[i-2];
			for (int i=0; i<n; i++)
				System.out.print(A[i]+" ");
		} // else
	}
	
	public static int fiboRec(int n) {
		if (n==1 || n==2)
			return 1;
		return fiboRec(n-1)+fiboRec(n-2);
	}
	
	public static int fiboRec(int n, boolean band) {
		if (n==1 || n==2)
			return 1;
		int a = fiboRec(n-1,band)+fiboRec(n-2,false);
		if (band)
			System.out.print(a+" ");
		return a;
	}
}
