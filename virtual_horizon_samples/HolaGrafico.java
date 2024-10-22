import javax.swing.*;

public class HolaGrafico {
	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null,"Hola Mundo!!","Mi primer programa",JOptionPane.INFORMATION_MESSAGE);
		String cad = JOptionPane.showInputDialog(null, "Valor: ");
		//JOptionPane.showMessageDialog(null,"Valor: "+cad,"Mi primer programa",JOptionPane.INFORMATION_MESSAGE);
		int a = Integer.parseInt(cad);
		cad = JOptionPane.showInputDialog(null, "Otro valor: ");
		int b = Integer.parseInt(cad);
		int c =a+b;
		JOptionPane.showMessageDialog(null,"Resultado: "+c,"Suma",JOptionPane.PLAIN_MESSAGE);
		
	}
}
