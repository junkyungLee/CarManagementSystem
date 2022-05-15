import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Car.Bike;
import Car.Bus;
import Car.Car;
import Car.CarInput;
import Car.Carkind;
import Car.SportsCar;

public class CarManager {
	ArrayList<CarInput> cars = new ArrayList<CarInput>();
	Scanner input;
	CarManager(Scanner input) {
		this.input = input;
	}

	public void addCar() {
		int kind = 0;
		CarInput carInput;
		while (kind < 1 || kind > 3) {
			try {

				System.out.println("1 for Bus");
				System.out.println("2 for SportsCar");
				System.out.println("3 for Bike");
				System.out.print("Slect num 1, 2 or 3 for Car kind:");
				kind = input.nextInt();
				if (kind == 1) {
					carInput = new Bus(Carkind.Bus);
					carInput.getUserInput(input);
					cars.add(carInput);
					break;

				}
				else if (kind == 2) {
					carInput = new SportsCar(Carkind.SportsCar);
					carInput.getUserInput(input);
					cars.add(carInput);
					break;

				}
				else if (kind == 3) {
					carInput = new Bike(Carkind.Bike);
					carInput.getUserInput(input);
					cars.add(carInput);
					break;

				}
				else {
					System.out.print("Slect num for Car kind between 1 and 2:");
				}
			}catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	public void deleteCar() {
		System.out.print("Car Brand:");
		int carBrand = input.nextInt();
		int index = findIndex(carBrand); // array에서 인덱스를 못찾았다.
		removefromCars(index, carBrand);
	}



	public int findIndex(int carBrand) {
		int index = -1; // array에서 인덱스를 못찾았다.
		for (int i = 0; i<cars.size(); i++) {
			if (cars.get(i).getBrand() == carBrand) {
				index = i;
				break;
			}
		}
		return index;

	}

	public int removefromCars(int index, int carBrand) {
		if (index >= 0) {
			cars.remove(index);
			System.out.println("the car" + carBrand + "is deleted");
			return 1;
		}
		else {
			System.out.println("the car has not been registered");
			return -1;
		}
	}
	public void editCar() {
		System.out.print("Car Brand:");
		int carbrand = input.nextInt();
		for (int i = 0; i<cars.size(); i++) {
			CarInput car = cars.get(i);
			if (car.getBrand() == carbrand) {
				int num = -1;
				while(num !=5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						car.setCarBrand(input);
						break;
					case 2:
						car.setCarName(input);
						break;
					case 3:
						car.setCarEngine(input);
						break;
					case 4:
						car.setCarTire(input);
						break;
					default:
						continue;


					} // if
				}//while
				break;
			}//if
		}//for 	
	}


	public void viewCars() {
		System.out.println("# of registered cars:" + cars.size() );
		for (int i =0; i<cars.size(); i++) {
			cars.get(i).printInfo();
		}
	}






	public void showEditMenu() {
		System.out.println("*** Car Management System Menu ***");
		System.out.println("1. Car Brand");
		System.out.println("2. Car name");
		System.out.println("3. Car Engine");
		System.out.println("4. Car Tire");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-6");
	}
}


