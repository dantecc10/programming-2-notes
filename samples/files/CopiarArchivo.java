import java.awt.*;
import java.awt.event;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public final class CopiarArchivo {
    private static final long serialVersionUID = 1L;
    private JTextField origen, copia;
    private JButton copiar, salir;

    public CopiarArchivo() {
    super("Copia")
    }

    private void creaComponente(){
        setSize(600, 100);

        origen = new JTextField();
        copia = new JTextField();
    }
}
