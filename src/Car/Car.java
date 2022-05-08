package Car;
import java.util.Scanner;
public abstract class Car {
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

   
	public abstract void printInfo();
	
	
}