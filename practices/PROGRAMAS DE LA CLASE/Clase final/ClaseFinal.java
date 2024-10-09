// Si la clase es final no puede ser heredada
//public final class ClaseFinal {
public class ClaseFinal {
	public final int MAX=10; // Se convierte en constante
	protected int a;
	
	// Constructores
	public ClaseFinal() {
		a = 0;
		//MAX = 0;
	}
	public ClaseFinal(int a) {
		this.a = a;
	}
	
	// Métodos
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getMAX() {
		return MAX;
	}
	public final int suma() {
		int sum=0;
		for (int i=1; i<=MAX; i++)
			sum += a*i;
		return sum;
	}
}
