import javax.swing.*;
import java.awt.*;

public class MarcoFlow extends JFrame
{
	private static final long serialVersionUID = 1L;
	static final int ANCHO=375;
    static final int ALTO=100;

    public MarcoFlow() {
    	super("Programacion II");

    	setLayout(new FlowLayout());
        add(new JButton("Primera"));
        add(new JLabel("Segunda"));
        add(new JButton("Tercera"));
        add(new JLabel("Cuarta"));
        add(new JButton("Quinta"));
        add(new JLabel("Sexta")); 
        setSize(ANCHO, ALTO);
        setVisible(true);
	} 

	public static void main(String[] at) {
		MarcoFlow marco = new MarcoFlow();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
