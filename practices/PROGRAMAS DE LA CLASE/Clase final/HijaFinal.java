public class HijaFinal extends ClaseFinal{
	private int b;
	
	public HijaFinal() {
		super();
		b = 0;
	}
	public HijaFinal(int a, int b) {
		super(a);
		this.b = b;
	}
	public int miSuma() {
		return a+b;
	}
	//public int suma() {
	// No se puede sobreescribir un método final
	//}
}
