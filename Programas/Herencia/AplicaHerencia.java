public class AplicaHerencia {
	public static void main(String[] args) {
		Padre papa = new Padre("Juan",4,6,1.2f);
		Hijo jr = new Hijo("Juanito",3,4,3,1.3f);
		
		System.out.println("La suma en "+papa.getNombre()+" es: "+papa.suma());
		System.out.println("La suma en "+jr.getNombre()+" es: "+jr.suma());
		System.out.println("La suma es: "+jr.miSuma());
	}
}
