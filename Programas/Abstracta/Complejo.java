public class Complejo extends Operaciones{
	public Complejo() {
		super();
	}
	public Complejo(int a, int b) {
		super(a,b);
	}
	
	public void suma(Operaciones o1, Operaciones o2) {
		a = o1.a + o2.a;
		b = o1.b + o2.b;
	}
	public void resta(Operaciones o1, Operaciones o2) {
		a = o1.a - o2.a;
		b = o1.b - o2.b;
	}
	public String toString() {
		if (b<0)
			return a+"-"+(-b)+"i";
		return a+"+"+b+"i";
	}
}
