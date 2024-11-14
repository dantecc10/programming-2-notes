public class Ackermann {
	public static int acm(int m, int n) {
		if (m==0)
			return n+1;
		if (m>0 && n==0)
			return acm(m-1,1);
		return acm(m-1,acm(m,n-1));
	}
}
