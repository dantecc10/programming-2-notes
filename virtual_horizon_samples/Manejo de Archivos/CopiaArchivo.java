import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.io.*;

public final class CopiaArchivo extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField origen, copia;
	private JButton copiar, salir;
	
	public CopiaArchivo() { // Constructor
		super( "Copia un archivo" );
		creaComponente();
	}
	
	private void creaComponente() {	
		setSize(600, 180);
		
		origen = new JTextField();
		copia = new JTextField();
		
		copiar = new JButton("Copiar");
		salir = new JButton("Salir");
		Box caja = Box.createHorizontalBox();
		caja.add(Box.createRigidArea(new Dimension(5,5)));
		caja.add(copiar);
		caja.add(Box.createHorizontalStrut(30));
		caja.add(salir);
		
		JPanel p1 = new JPanel(new GridLayout(1,2,15,15));
		JPanel p2 = new JPanel(new GridLayout(1,2,15,15));
		JPanel p3 = new JPanel(new GridLayout(2,1,15,15));
		p1.add(new JLabel("Archivo Origen"));
		p1.add(origen);
		p2.add(new JLabel("Copia"));
		p2.add(copia);
		p3.add(caja);
		setLayout(new BorderLayout(10,15));
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		
		setVisible(true);
		
		copiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoAccion) {
				procesoUsuario(eventoAccion);
			}
		});
		
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoAccion) {
				System.exit(0);
			}
		});
	} // creaComponente
	
	private void procesoUsuario(ActionEvent evt) {
		String a = origen.getText();
		String b = copia.getText();
		FileInputStream entrada = null;
		FileOutputStream salida = null;
		
		try {
			File f1 = new File(a);
			entrada = new FileInputStream(f1);
			File f2 = new File(b);
			salida = new FileOutputStream(f2);
			int c;
			
			while((c = entrada.read())!=-1) {
				salida.write((byte)c);
				System.out.print((char)c);
			}	
			JOptionPane.showMessageDialog(null, "Copiando archivo", 
					"Copia", JOptionPane.INFORMATION_MESSAGE);
		}
		catch (IOException er) {
			JOptionPane.showMessageDialog(null, "Error de archivo!", 
					"Error", JOptionPane.ERROR_MESSAGE);
		}
		finally {
			try {
				entrada.close();
				salida.close();
			}
			catch(IOException er) {
				//er.printStackTrace();
				System.out.println("Error");
			}
			catch(NullPointerException er) {
				//er.printStackTrace();
				System.out.println("Error, no se puede escribir");
			}			
		}
	}
}
