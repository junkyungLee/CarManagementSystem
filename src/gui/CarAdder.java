package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.CarAdderCancelListener;
import event.CarAdderListener;
import manager.CarManager;

public class CarAdder extends JPanel{
	
	WindowFrame frame;
	CarManager carManager;
	
	public CarAdder(WindowFrame frame, CarManager carManager) {
		this.frame = frame;
		this.carManager = carManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel labelBrand = new JLabel("Brand: ", JLabel.TRAILING);
		JTextField fieldBrand = new JTextField(10);
		labelBrand.setLabelFor(fieldBrand);
		panel.add(labelBrand);
		panel.add(fieldBrand);

		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);

		JLabel labelEngine = new JLabel("Engine: ", JLabel.TRAILING);
		JTextField fieldEngine  = new JTextField(10);
		labelEngine.setLabelFor(fieldEngine);
		panel.add(labelEngine);
		panel.add(fieldEngine);

		JLabel labelTire = new JLabel("Tire: ", JLabel.TRAILING);
		JTextField fieldTire  = new JTextField(10);
		labelTire.setLabelFor(fieldTire);
		
		
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new CarAdderListener(fieldBrand, fieldName, fieldEngine, fieldTire, carManager));
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new CarAdderCancelListener(frame));
		
		
		panel.add(labelTire);
		panel.add(fieldTire);
		

		panel.add(saveButton);
		panel.add(cancelButton);

		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);

		

		this.add(panel);
		this.setVisible(true);
	}

}
