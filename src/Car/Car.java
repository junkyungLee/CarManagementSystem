package Car;
import java.util.Scanner;
public class Car {
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
	public void setName(String name) {
		this.name = name;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getTire() {
		return tire;
	}
	public void setTire(String tire) {
		this.tire = tire;
	}

   
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case SportsCar:
			skind = "Sports";
			break;
		case Bus:
			skind = "Bus";
			break;
		case Taxi:
			skind = "Taxi";
			break;
		case Bike:
			skind = "Bike";
			break;
		default:
			
		}
		System.out.println("kind:" + skind + "brand:"+ this.brand +  "name:"+ this.name + " engine:" + this.engine + " tire:" + this.tire);

	}
	public void getUserInput(Scanner input) {
		System.out.print("Car Brand");
		int brand = input.nextInt();
		this.setBrand(brand);
		
		System.out.print("Car Name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Car Engine:");
		String engine = input.next();
		this.setEngine(engine);
		
		System.out.print("Car tire:");
		String tire = input.next();
		this.setTire(tire);
	}
	
}