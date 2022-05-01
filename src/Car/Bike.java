package Car;

import java.util.Scanner;

public class Bike extends Car {
	
	protected String Specialengine;
	protected String Specialtire;
	
	public Bike(Carkind kind) {
		this.kind = kind;
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Car Brand");
		int brand = input.nextInt();
		this.setBrand(brand);

		System.out.print("Car Name:");
		String name = input.next();
		this.setName(name);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n'&& answer != 'N' 	) {	


			System.out.print("Do you have an Engine? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Car Engine:");
				String engine = input.next();
				this.setEngine(engine);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setEngine("");
				break;
			}
			else {
			}
		}
		
		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n'&& answer != 'N' 	) {	


			System.out.print("Do you have a Special Engine? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Special Car Engine:");
				String engine = input.next();
				this.setEngine(engine);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setEngine("");
				break;
			}
			else {
			}
		}



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
		System.out.println("kind:" + skind + "brand:"+ this.brand +  "name:"+ this.name + " engine:" + this.engine + " tire:" + this.tire + "Specialengine:" + this.engine + " Special tire:" + this.tire);

	}
}



