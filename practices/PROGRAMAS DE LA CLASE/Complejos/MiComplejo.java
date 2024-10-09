public class MiComplejo {
	private float r, i;

	// Constructores
	public MiComplejo() { // Default
		r = i = 0;
	}
	public MiComplejo(float r) {
		this.r = r;  // this hace referencia a las variables de la clase
		i = 0;
	}
	public MiComplejo(float x, float y) {
		r = x;
		i = y;
	}
	
	// Métodos
	public float getR() {
		return r;
	}
	public void setR(float r) {
		this.r = r;
	}
	public float getI() {
		return i;
	}
	public void setI(float i) {
		this.i = i;
	}
	public void suma (MiComplejo c1, MiComplejo c2) {
		r = c1.r+c2.r;
		i = c1.i+c2.i;
	}
	public MiComplejo suma(MiComplejo c2) {  // Polimorfismo
		/*MiComplejo c3 = new MiComplejo();
		c3.r = r+c2.r;
		c3.i = i+c2.i;
		return c3;*/
		return (new MiComplejo(r+c2.r,i+c2.i));
	}
	public void muestra() {
		if (i>=0)
			System.out.println(r+"+"+i+"i");
		else
			System.out.println(r+"-"+(-i)+"i");
	}
	public String toString() { // Sobreescribiendo el metodo de la clase Object
		return("("+r+","+i+")");
		/*if (i>=0)
			return(r+"+"+i+"i");
		return(r+"-"+(-i)+"i");*/
	}
}
