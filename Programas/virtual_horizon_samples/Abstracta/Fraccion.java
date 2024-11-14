public class Fraccion extends Operaciones{
	Fraccion() {
		super();
	}
	Fraccion(int a, int b) {
		super(a,b);
	}
	
	public void suma(Operaciones o1, Operaciones o2) {
		a = o1.a*o2.b + o2.a*o1.b;
		b = o1.b * o2.b;
	}
	public void resta(Operaciones o1, Operaciones o2) {
		a = o1.a*o2.b - o2.a*o1.b;
		b = o1.b * o2.b;
	}
	public String toString() {
		return a+"/"+b;
	}
}
