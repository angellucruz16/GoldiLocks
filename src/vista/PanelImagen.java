package vista;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanelImagen extends JPanel {

private BufferedImage cargarimagen ;


public PanelImagen () {
	try {
		cargarimagen = ImageIO.read(new File ("images/WINDOW.png"));
	}
	
	catch (IOException exepcion) {
		
		
		
	}//CATCH
	
} //PANELIMAGE

} //BUFFEREDIMAGE