package Car;
import java.io.Serializable;
import java.util.Scanner;

import exception.EmailFormatException;
public abstract class Car implements CarInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4841862900652837547L;

	protected Carkind kind = Carkind.SportsCar;
	protected int brand;
	protected String name;
	protected String engine;
	protected String tire;




	public Car() {
	}
	public Car(Carkind kind) {
		this.kind = kind;
	}
	public Car(int brand, String name) {
		this.brand = brand;
		this.name = name;

	}

	public Car(int brand, String name, String engine, String tire) {
		this.brand = brand;
		this.name = name;
		this.engine = engine;
		this.tire = tire;

	}

	public Car(Carkind kind, int brand, String name, String engine, String tire) {
		this.kind = kind;
		this.brand = brand;
		this.name = name;
		this.engine = engine;
		this.tire = tire;

	}

	public Carkind getKind() {
		return kind;
	}
	public void setKind(Carkind kind) {
		this.kind = kind;
	}
	public int getBrand() {
		return brand;
	}
	public void setBrand(int brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name)  {
		this.name = name;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) throws EmailFormatException{
		if (!engine.contains("@") && !engine.equals("")) {
			throw new EmailFormatException();
		}

		this.engine = engine;
	}
	public String getTire() {
		return tire;
	}
	public void setTire(String tire) {
		this.tire = tire;
	}


	public abstract void printInfo();

	public void setCarBrand(Scanner input) {
		System.out.print("Car Brand:");
		int brand = input.nextInt();
		this.setBrand(brand);
	}

	public void setCarName(Scanner input) {
		System.out.print("Car Name");
		String name = input.next();
		this.setName(name);
	}

	public void setCarEngine(Scanner input) {
		String engine = "";
		while (!engine.contains("@")) {
			System.out.print("Car Engine");
			engine = input.next();
			try {
				this.setEngine(engine);
			} catch (EmailFormatException e) {
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
			}
		}
	}
	public void setCarTire(Scanner input) {
		System.out.print("Car Tire");
		String tire = input.next();
		this.setTire(tire);
	}

	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Bus:
			skind = "bus.";
			break;
		case SportsCar:
			skind = "SportsCar.";
			break;
		case Bike:
			skind = "Bike.";
			break;
		case Taxi:
			skind = "Taxi.";
			break;
		default:

		}
		return skind;

	}
}