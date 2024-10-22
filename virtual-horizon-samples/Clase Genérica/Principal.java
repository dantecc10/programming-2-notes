public class Principal {
	public static void main(String x[]) {
	    // Creamos una instancia de ClaseGenerica para Integer.
	    ClaseGenerica<Integer, Float> intObj = new ClaseGenerica<>(88,5f);
	    intObj.classType();
	    intObj.opera(-4.5f);
	 
	    // Creamos una instancia de ClaseGenerica para String.
	    ClaseGenerica<Float, String> strObj = new ClaseGenerica<>(34f, "Hola");
	    strObj.classType();
	    strObj.opera("Hola");
	  }
}
