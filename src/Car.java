public class Car {

	int brand;
	String name;
	String engine;
	String tire;


	public Car() {

	}
	public Car(int 
			brand, String name) {
		this.brand = brand;
		this.name = name;
	}

	public Car(int brand, String name, String engine, String tire) {
		this.brand = brand;
		this.name = name;
		this.engine = engine;
		this.tire = tire;
	}

	public void printInfo() {
		System.out.println("brand:"+ this.brand + " name:"+ this.name + " engine:" + this.engine + " tire:" + this.tire);

	}
}