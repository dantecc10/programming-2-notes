public class AplicaAckermann {
	public static void main(String cad[]) {
		for (int i=0; i<=4; i++)
			for(int j=0; j<=6; j++)
				System.out.println("Ackermann("+i+","+j+")="+Ackermann.acm(i,j));
	}
}
