public class ClaseEstatica {
	private int a;
	public static int b;
	
	// Constructores
	public ClaseEstatica() {
		a = 0;
		b++;
	}
	public ClaseEstatica(int a) {
		this.a = a;
		b++;
	}

	// Métodos
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void operacion() {
		System.out.println("El cuadrado es: "+(a*a));
	}
	// Método de clase
	public static float suma(float x, float y) {
		return (x+y);
	}
}
