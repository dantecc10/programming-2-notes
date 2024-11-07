import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

class FontPanel extends JPanel { 
	private static final long serialVersionUID = 1L;
	private Font font; 
	
	public void setFont (String font, int style, int size) {
		this.font = new Font ( font, style, size);
	}
	
	public void paintComponent (Graphics g) { 
		if (font!=null)
			g.setFont(font); 
		
		g.drawString("Programación II Otoño 2024", 50,50);
	} 
} 