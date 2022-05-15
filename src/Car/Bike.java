package Car;

import java.util.Scanner;

import exception.EmailFormatException;

public class Bike extends CompactCar {

	protected String Specialengine;
	protected String Specialtire;

	public Bike(Carkind kind) {
		super(kind);
	}



	public void getUserInput(Scanner input) {
		setCarBrand(input);
		setCarName(input);
		setCarEnginewithYN(input);
		setParentCarEnginewithYN(input);
		setCarTire(input);
	}
	public void setParentCarEnginewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n'&& answer != 'N' 	) {	
			System.out.print("Do you have a Special Engine? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					setCarEngine(input);
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






	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + "brand:"+ brand +  "name:"+ name + " engine:" + engine + " tire:" + tire + "Specialengine:" + engine + " Special tire:" + tire);

	}

}



