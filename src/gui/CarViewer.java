package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Car.CarInput;
import manager.CarManager;

public class CarViewer extends JPanel{

	WindowFrame frame;

	CarManager carManager;

	public CarManager getCarManager() {
		return carManager;
	}

	public void setCarManager(CarManager carManager) {
		this.carManager = carManager;
		this.removeAll();

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Brand");
		model.addColumn("Name");
		model.addColumn("Engine");
		model.addColumn("Contact Info.");


		for(int i=0; i<carManager.size(); i++) {
			Vector row = new Vector();
			CarInput si = carManager.get(i);
			row.add(si.getBrand());
			row.add(si.getName());
			row.add(si.getEngine());
			row.add(si.getTire());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);

	}
	public CarViewer(WindowFrame frame, CarManager carManager) {
		this.frame = frame;
		this.carManager = carManager;

		System.out.println("***"+carManager.size()+"***");
	}

}
