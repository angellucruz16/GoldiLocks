package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

import vista.PanelImagen;

public class Movimiento implements MouseListener , MouseMotionListener {
	private int x; 
	private int y; 
	
	public Movimiento (PanelImagen pns ) {
			pns.addMouseListener(this);
			pns.addMouseMotionListener(this);
		
	} //MOVIMIENTO
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
	} 
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) 
	{	
		x = arg0.getX(); 
		y= arg0.getY(); 
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		
		
	}
	@Override
	public void mouseDragged(MouseEvent arg0)
	{
		arg0.getComponent().setLocation((arg0.getX() + arg0.getComponent().getX() -x), (arg0.getY() + arg0.getComponent().getY() -y) );
		
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
	
		
	}

	public void Movimiento(PanelImagen panelImagen) {
		// TODO Auto-generated method stub
		
	}


} //PUBLIC CLASS MOVIMIENTO