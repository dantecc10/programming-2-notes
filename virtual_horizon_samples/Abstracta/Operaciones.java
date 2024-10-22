public abstract class Operaciones {
	protected int a,b;
	
	public Operaciones() {
		a = b = 0;
	}
	public Operaciones(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// Métodos
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public abstract void suma(Operaciones o1, Operaciones o2);
	public abstract void resta(Operaciones o1, Operaciones o2);
}
