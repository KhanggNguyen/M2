package MainPackage;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonHautDroit extends Button implements MouseListener  {
	
	//attribut
	private JFrame frame;
	
	//constructeur
	public ButtonHautDroit(String str, JFrame frame) {
		super(str);
		this.frame = frame;
		this.addMouseListener(this);
	}
	
	//place fenetre  haut droite
	public void mouseClicked(MouseEvent arg0) {
		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int ScreenWidth  = (int)dimension.getWidth();
		int ScreenHeight = (int)dimension.getHeight();
		int height = 200;
		int width = (int) (height*1.618);
		frame.setSize(width, height);
		frame.setLocation(ScreenWidth-width, 0);
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
}