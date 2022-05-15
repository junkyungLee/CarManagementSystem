import java.util.InputMismatchException;
import java.util.Scanner;
public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CarManager carManager = new CarManager(input);

		selectMenu(input, carManager);
	}
	public static void selectMenu(Scanner input, CarManager carManager) {
		int num = -1;
		while(num !=5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					carManager.addCar();
					break;
				case 2:
					carManager.deleteCar();
					break;
				case 3:
					carManager.editCar();
					break;
				case 4:	
					carManager.viewCars();
					break;
				default:
					continue;

				}
			}
			catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("*** Car Management System Menu ***");
		System.out.println("1. add Car");
		System.out.println("2. delete Car");
		System.out.println("3. edit Car");
		System.out.println("4. view Car");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-6");

	}
}
