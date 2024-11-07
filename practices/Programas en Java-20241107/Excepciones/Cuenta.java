public class Cuenta {
	private double saldo;
	
	public Cuenta() {
		saldo = 0;
	}
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}
	
	// Métodos
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void ingresa(double c)throws NegativoException {
		// Este método va a lanzar una excepción
		if (c<0) // Se lanza la excepción cuando c sea negativo
			throw new NegativoException();
		else
			saldo += c;
	}
	
	public void retiro(double c)throws NegativoException, SobregiroException {
		if (c<0)// Se lanza la excepción cuando c sea negativo
			throw new NegativoException();
		else
			if (saldo<c)
				throw new SobregiroException();
			else
				saldo -= c;
	}
}
