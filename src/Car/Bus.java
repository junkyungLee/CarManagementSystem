package Car;

import java.util.Scanner;

public class Bus extends Car implements CarInput {
	
	public Bus(Carkind kind) {
		super(kind);
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

}
