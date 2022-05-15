package Car;

import java.util.Scanner;

public class SportsCar extends CompactCar{

	public SportsCar(Carkind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setCarBrand(input);
		setCarName(input);
		setCarEnginewithYN(input);
		setCarTire(input);
	}



}

