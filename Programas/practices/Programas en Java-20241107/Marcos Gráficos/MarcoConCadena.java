import javax.swing.*;
import java.awt.*;

public class MarcoConCadena extends JFrame
{
	private static final long serialVersionUID = 1L;
	private static final int ANCHO=500, ALTO=200;

    public MarcoConCadena(String c) {
    	super(c);
        setSize(ANCHO, ALTO);
        setResizable(false);
        setForeground(Color.MAGENTA);
        //setBackground(Color.BLACK);
        setVisible(true);
        
	} 

    public void paint(Graphics g) {
    	Font tipoLetra = new Font("Courier",Font.BOLD,14);
    	
    	g.setFont(tipoLetra);
        g.drawString("Bienvenidos al mundo gráfico!",ANCHO/10,70);
        g.drawLine(ANCHO/10,80,ANCHO/10+225,80);
       
	}
    
    

    public static void main(String[] at) {
    	MarcoConCadena marco = new MarcoConCadena("Otro Marco con cadena");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
