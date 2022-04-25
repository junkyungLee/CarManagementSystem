import java.util.Scanner;
public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CarManager carManager = new CarManager(input);

		int num = -1;

		while(num !=5) {
			System.out.println("*** Car Management System Menu ***");
			System.out.println("1. add Car");
			System.out.println("2. delete Car");
			System.out.println("3. edit Car");
			System.out.println("4. view Car");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-6");
			num = input.nextInt();
			if (num==1) {
				carManager.addCar();
			}
			else if (num==2) {
				carManager.deleteCar();
			}
			else if (num==3) {
				carManager.editCar();
			}
			else if (num==4) {
				carManager.viewCars();
			}
			else {
				continue;
			}

		}

	}
}
