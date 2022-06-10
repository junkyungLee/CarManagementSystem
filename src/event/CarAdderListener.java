package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Car.Bus;
import Car.CarInput;
import Car.Carkind;
import exception.EmailFormatException;
import manager.CarManager;

public class CarAdderListener implements ActionListener {
	JTextField fieldBrand;
	JTextField fieldName;
	JTextField fieldEngine;
	JTextField fieldTire;
	
	CarManager carManager;


	public CarAdderListener(
			JTextField fieldBrand,
			JTextField fieldName,
			JTextField fieldEngine,
			JTextField fieldTire, CarManager carManager) {

		this.fieldBrand = fieldBrand;
		this.fieldName = fieldName;
		this.fieldEngine = fieldEngine;
		this.fieldTire = fieldTire;
		this.carManager = carManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(fieldBrand.getText());
		System.out.println(fieldName.getText());
		System.out.println(fieldEngine.getText());
		System.out.println(fieldTire.getText());
		
		CarInput car = new Bus(Carkind.Bus);
		
		try {
			car.setBrand(Integer.parseInt(fieldBrand.getText()));
			car.setName(fieldName.getText());
			car.setEngine(fieldEngine.getText());
			car.setTire(fieldEngine.getText());
			carManager.addCar(car);
			putObject(carManager, "carmanager.ser");
			car.printInfo();
		} catch (EmailFormatException e1) {
			e1.printStackTrace();
		}

	}
	public static void putObject(CarManager carManager, String filename) {

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(carManager);

			out.close();
			file.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
