import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

class ButtonPanel extends JPanel implements ActionListener {   
	private static final long serialVersionUID = 1L;
	private JButton redButton; 
	private JButton greenButton; 
	private JButton blueButton; 
	private JButton yellowButton;
	private JButton blackButton;
	private JButton pinkButton;
	
	public ButtonPanel() { 
		redButton = new JButton("Rojo"); 
		greenButton = new JButton("Verde"); 
		blueButton = new JButton("Azul");
		yellowButton = new JButton("Amarillo");
		blackButton = new JButton("Negro");
		pinkButton = new JButton("Rosa");
		 
		this.add(greenButton); 
		this.add(redButton);
		this.add(blueButton);
		this.add(yellowButton);
		this.add(blackButton);
		this.add(pinkButton);
		
		redButton.addActionListener(this); 
		greenButton.addActionListener(this); 
		blueButton.addActionListener(this);
		yellowButton.addActionListener(this);
		blackButton.addActionListener(this);
		pinkButton.addActionListener(this);
	} 
	
	public void actionPerformed (ActionEvent event) { 
		Object source = event.getSource(); 
		Color color = getBackground(); 
		
		if (source == redButton)  
			color = Color.RED; 
		else if (source == greenButton)  
				color = Color.GREEN; 
			 else if (source == blueButton) 
				 	color = Color.BLUE;
			 	  else if (source == yellowButton)
			 		  	color = Color.YELLOW;
			 	  	   else if (source == blackButton)
			 	  		   	 color = Color.BLACK;
			 	  	   		else if (source == pinkButton)
			 	  	   			color = Color.PINK;
		
		setBackground(color); 
		repaint();
	} 
} 
