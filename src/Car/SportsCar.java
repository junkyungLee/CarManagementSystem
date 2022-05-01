package Car;

import java.util.Scanner;

public class SportsCar extends Car {
	
	public SportsCar(Carkind kind) {
		super(kind);
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


			System.out.print("Do you have a Engine? (Y/N)");
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


		
		System.out.print("Car tire:");
		String tire = input.next();
		this.setTire(tire);
	}
}

