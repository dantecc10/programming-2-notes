public class Padre {
	protected String nombre;
	protected int a,b;
	private float x;
	
	// Constructores
	public Padre() {
		nombre = "";
		a = b = 0;
		x = 0;
	}
	public Padre(String nom) {
		nombre = nom;
		a = b = 0;
		x = 0;
	}
	public Padre(String nombre, int a, int b) {
		this.nombre = nombre;
		this.a = a;
		this.b = b;
		this.x = 0;
	}
	public Padre(String nombre, int a, int b, float x) {
		this.nombre = nombre;
		this.a = a;
		this.b = b;
		this.x = x;
	}
	
	// Métodos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
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
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public int suma() {
		return a+b;
	}
}
