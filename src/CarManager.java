import java.util.ArrayList;
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
		while (kind != 1 && kind != 2) {
			System.out.println("1 for Bus");
			System.out.println("2 for SportsCar");
			System.out.println("3 Bike");
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
		}
		

	}
	public void deleteCar() {
		System.out.print("Car Brand:");
		int carbrand = input.nextInt();
		int index = -1; // array에서 인덱스를 못찾았다.
		for (int i = 0; i<cars.size(); i++) {
			if (cars.get(i).getBrand() == carbrand) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			cars.remove(index);
			System.out.println("the car" + carbrand + "is deleted");
		}
		else {
			System.out.println("the car has not been registered");
			return;
		}

	}
	public void editCar() {
		System.out.print("Car Brand:");
		int carbrand = input.nextInt();
		for (int i = 0; i<cars.size(); i++) {
			CarInput carInput = cars.get(i);
			if (carInput.getBrand() == carbrand) {
				int num = -1;
				while(num !=5) {
					System.out.println("*** Car Management System Menu ***");
					System.out.println("1. Car Brand");
					System.out.println("2. Car name");
					System.out.println("3. Car Engine");
					System.out.println("4. Car Tire");
					System.out.println("5. Exit");
					System.out.println("Select one number between 1-6");
					num = input.nextInt();
					if (num==1) {
						System.out.print("Car Brand");
						int brand = input.nextInt();
						carInput.setBrand(brand);
					}
					else if (num==2) {
						System.out.print("Car Name");
						String name = input.next();
						carInput.setName(name);



					}
					else if (num==3) {
						System.out.print("Car Engine");
						String engine = input.next();
						carInput.setEngine(engine);
					}
					else if (num==4) {
						System.out.print("Car Tire");
						String tire = input.next();
						carInput.setTire(tire);
					}
					else {
						continue;
					} // if
				}//while
				break;
			}//if
		}//for 	
	}


	public void viewCars() {
		//		System.out.print("Car Brand:");
		//		int carbrand = input.nextInt();
		System.out.println("# of registered cars:" + cars.size() );
		for (int i =0; i<cars.size(); i++) {
			cars.get(i).printInfo();
		}


	}

}



