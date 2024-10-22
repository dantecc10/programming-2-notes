import javax.swing.*;
import java.awt.*;

public class MarcoGrid extends JFrame
{
	private static final long serialVersionUID = 1L;
	static final int ANCHO=275;
    static final int ALTO=200;

    public MarcoGrid() {
    	super("Mi marco");
    	setLayout(new GridLayout(3,5,15,15));
        add(new JLabel("Primera"));
        add(new JLabel("Segunda"));
        add(new JLabel("Tercera"));
        add(new JLabel("Cuarta"));
        add(new JLabel("Quinta"));
        add(new JLabel("Sexta")); 
        add(new JLabel("Septima"));
        add(new JLabel("Octava"));
        add(new JLabel("Novena"));
        //add(new JLabel("Décima"));
        //add(new JLabel("Décima Primera")); 
        //add(new JLabel("Doceava"));
        //add(new JLabel("Treceava"));
        //add(new JLabel("Décima Cuarta"));
        //add(new JLabel("Décima Quinta"));
        //add(new JLabel("Décima Sexta"));
        
        setSize(ANCHO, ALTO);
        setVisible(true);
    } 


	public static void main(String[] at) {
		MarcoGrid marco = new MarcoGrid();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

