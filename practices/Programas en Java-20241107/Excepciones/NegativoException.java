public class NegativoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public String getMessage() {
		return "No se pueden tener valores negativos";
	}
}
