import java.awt.*;

class Dialogo extends Dialog
{
	private static final long serialVersionUID = 1L;
	
	Dialogo(boolean moda) {
		/* Establecemos el dialogo como modal */
		super(new Frame(),"Cuadro de dialogo",moda);
		setLayout(new BorderLayout(0,50));
		Label error = new Label ("ERROR", Label.CENTER);
		Label tipo = new Label ("Error de Sintaxis", Label.LEFT);
		Button boton = new Button ("Continuar");
		
		add("North",error);
		add("Center",tipo);
		add("South",boton);
		pack();
		setVisible(true);
	}
}

