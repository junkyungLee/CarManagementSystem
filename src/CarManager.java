import java.util.Scanner;

public class CarManager {
	Car car;
	Scanner input;
	CarManager(Scanner input) {
		this.input = input;
	}

	public void addCar() {
		car = new Car();
		System.out.print("Car Brand:");
		car.brand = input.nextInt();
		System.out.print("Car Name:");
		car.name = input.next();
		System.out.print("Car Engine:");
		car.engine = input.next();
		System.out.print("Car tire:");
		car.tire = input.next();

	}
	public void deleteCar() {
		System.out.print("Car Brand:");
		int carbrand = input.nextInt();
		if (car == null) {
			System.out.println("the car has not been registered");
			return;
		}
		if (car.brand == carbrand) {
			car = null;
			System.out.println("the car is deleted");
		}
	}
	public void editCar() {
		System.out.print("Car Brand:");
		int carbrand = input.nextInt();
		if (car.brand == carbrand) {
			car = null;
			System.out.println("the car to be edited is " + carbrand);
		}

	}
	public void viewCar() {
		System.out.print("Car Brand:");
		int carbrand = input.nextInt();
		if (car.brand == carbrand) {
			car.printInfo();
		}


	}

}



