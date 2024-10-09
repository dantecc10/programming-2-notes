public class AplicaFinal {
	public static void main(String[] args) {
		ClaseFinal o1 = new ClaseFinal(5);
		System.out.println("La suma es: "+o1.suma());
		HijaFinal o2 = new HijaFinal(4,5);
		System.out.println("La suma es: "+o2.suma());
		System.out.println("La suma es: "+o2.miSuma());
	}

}
