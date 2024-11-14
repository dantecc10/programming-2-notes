public class Factorial {
	public static int facIter(int n) {
		int fac=1;
		
		for (int i=n; i>=1; i--)
			fac *= i;
		return fac;
	}
	
	public static int facRec(int n) {
		if (n==0 || n==1)
			return 1;
		//return n*facRec(n-1);
		int ant = facRec(n-1);
		return n*ant;
	}
}
