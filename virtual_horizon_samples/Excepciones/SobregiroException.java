public class SobregiroException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public String getMessage() {
		return "Cuenta sobregirada!";
	}
}
