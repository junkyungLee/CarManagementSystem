package Listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.CarViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		CarViewer viewer = frame.getCarviewer();
		frame.setupPanel(viewer);


	}

}
