public class Infinita {
	public static void inf(int x) {
		System.out.println("Valor: "+x);
		inf(++x);
	}
}
