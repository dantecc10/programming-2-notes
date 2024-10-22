import java.awt.*; 
import javax.swing.*; 
               
class EventFrame extends JFrame { 
	private static final long serialVersionUID = 1L;

	public EventFrame() { 
		setTitle("Demostración del uso de eventos..."); 
		setSize(300,200); 
		addWindowListener(new MainWindowListener()); 
		
		Container contenido = getContentPane(); 
		contenido.add(new ButtonPanel()); 
	} 
}
