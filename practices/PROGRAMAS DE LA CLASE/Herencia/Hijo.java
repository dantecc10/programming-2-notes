public class Hijo extends Padre{
	// Clase que hereda de Padre
	protected int z;
	
	// Constructores
	public Hijo() {
		nombre = "";
		a = b = z = 0;
		// x = 0; // No se puede acceder porque la variable es privada
	}
	public Hijo(String nombre) {
		super(nombre);
		z = 0;
	}
	public Hijo(String n, int a, int b, int z) {
		super(n,a,b); // invoca al constructor del padre
		this.z = z;
	}
	public Hijo(String n, int a, int b, int z, float x) {
		super(n,a,b,x);
		this.z = z;
	}
	
	// Métodos
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int miSuma() {
		return a+b+z;
	}
}
