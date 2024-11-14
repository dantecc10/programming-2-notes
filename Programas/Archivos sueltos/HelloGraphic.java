import javax.swing.*;

public class HelloGraphic {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hola Mundo!", "Nuestra segundo programa", JOptionPane.INFORMATION_MESSAGE);
        String cad = JOptionPane.showInputDialog(null, "Valor: ");
        int a = Integer.parseInt(cad);
        cad = JOptionPane.showInputDialog(null, "Otro valor: ");
        int b = Integer.parseInt(cad);
        int c = a + b;
        JOptionPane.showMessageDialog(null, "La suma es: " + c, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}