import javax.swing.JFrame;

public class MarcoSencillo extends JFrame
{
	private static final long serialVersionUID = 1L;
	private static final int ANCHO=500, ALTO=500;

    public MarcoSencillo() {
    	setTitle("Mi primer frame");
        setSize(ANCHO, ALTO);
        setLocation(ANCHO, ALTO/2); // Coloca la ventana en la posicion dada
        setResizable(false); // Evita que se modifique el tamaño de la ventana
    } 

	public static void main(String[] at) {
		MarcoSencillo marco;
        marco = new MarcoSencillo();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        System.out.println ("\nHola...");
	}
}
