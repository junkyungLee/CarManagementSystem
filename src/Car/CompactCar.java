package Car;

import java.util.Scanner;

import exception.EmailFormatException;

public abstract class CompactCar extends Car {
	public CompactCar(Carkind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);
	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + "brand:"+ brand +  "name:"+ name + " engine:" + engine + " tire:" + tire);
	}
	public void setCarEnginewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n'&& answer != 'N' 	) {	
			System.out.print("Do you have a Engine? (Y/N)");
			answer = input.next().charAt(0);
			try {


				if (answer == 'y' || answer == 'Y') {
					System.out.print("Engine:");
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
			catch(EmailFormatException e) {
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");

			}

		}
	}

}
