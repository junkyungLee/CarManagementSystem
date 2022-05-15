package Car;

import java.util.Scanner;

public class Bus extends Car {

	public Bus(Carkind kind) {
		super(kind);
	}


	public void getUserInput(Scanner input) {
		setCarBrand(input);
		setCarName(input);
		setCarEngine(input);
		setCarTire(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + "brand:"+brand +  "name:"+name + " engine:" + engine + " tire:" + tire);

	}

}
