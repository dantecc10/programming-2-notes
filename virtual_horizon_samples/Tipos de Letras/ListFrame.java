import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
             
class ListFrame extends JFrame implements ActionListener { 
	private static final long serialVersionUID = 1L;
	JPanel    tools; 
	JComboBox<String> font; 
	JComboBox<String> fontsize; 
	JCheckBox bold; 
	JCheckBox italic; 
	FontPanel panel; 
	
	public ListFrame() { 
		setTitle("Demostración del uso de eventos..."); 
		setSize(600,150);
		addWindowListener(new MainWindowListener()); 
		
		// Barra de herramientas 
		tools = new JPanel(); 
		tools.add(new JLabel("Fuente ")); 
             
		font = new JComboBox<String>(); 
		font.setEditable(false); 
		font.addItem("Serif"); 
		font.addItem("SansSerif"); 
		font.addItem("Monospaced");
		font.addItem("Times New Roman");
		font.addItem("Arial");
		font.addItem("Algerian");
		//font.addItem("Otro");
		font.addActionListener(this); 
		tools.add(font);
		
		tools.add(new JLabel("Tamaño ")); 
		fontsize = new JComboBox<String>(); 
		fontsize.setEditable(true); 
		fontsize.addItem("12"); 
		fontsize.addItem("16"); 
		fontsize.addItem("24"); 
		fontsize.addActionListener(this); 
		tools.add(fontsize); 
		
		bold = new JCheckBox("Negrita"); 
		bold.addActionListener(this); 
		tools.add(bold); 

		italic= new JCheckBox("Cursiva"); 
		italic.addActionListener(this); 
		tools.add(italic); 

		getContentPane().add(tools, "South"); 
            
		panel = new FontPanel(); 
		getContentPane().add(panel, "Center"); 
	}
	
	public void actionPerformed(ActionEvent event) {
		String tipo   = (String)font.getSelectedItem(); 
		String str    = (String)fontsize.getSelectedItem(); 
		int    dim    = Integer.valueOf(str).intValue(); 
		int    estilo = (bold.isSelected()? Font.BOLD: 0) 
					+ (italic.isSelected()? Font.ITALIC: 0); 
		
		/* int estilo = 0;
		 * if (bold.isSelected()) estilo=Font.BOLD;
		 * else estilo=0;
		 * if (italic.isSelected()) estilo+=Font.ITALIC;
		 * else estilo+=0;  */
		
		panel.setFont(tipo, estilo, dim); 
		repaint(); 
	} 
} 