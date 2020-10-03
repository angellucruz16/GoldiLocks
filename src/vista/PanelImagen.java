package vista;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import controlador.Movimiento;

public class PanelImagen extends JPanel {

private BufferedImage cargarimagen ;

Movimiento movewindow;

public PanelImagen () {
	try {
		cargarimagen = ImageIO.read(new File ("images/WINDOW.png"));
	}
	
	catch (IOException exepcion) {
		
		
		
	}//CATCH
	movewindow.Movimiento(this);
} //PANELIMAGE

} //BUFFEREDIMAGE