package event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.CarAdder;
import gui.CarViewer;
import gui.WindowFrame;

public class CarAdderCancelListener implements ActionListener {

	WindowFrame frame;

	public CarAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}

}
