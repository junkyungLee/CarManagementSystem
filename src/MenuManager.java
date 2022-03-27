import java.util.Scanner;
public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);

		while(num !=6) {

			System.out.println("1. add kind of Car");
			System.out.println("2. delete kind of Car");
			System.out.println("3. edit kind of Car");
			System.out.println("4. view kind of Car");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6");
			num = input.nextInt();
			if (num==1) {
				addkindofCar();
			}
			else if (num==2) {
				deletekindofCar();
			}
			else if (num==3) {
				editkindofCar();
			}
			else if (num==4) {
				viewkindofCar();
			}
			else {
				continue;
			}

		}

	}
	public static void addkindofCar() {
		Scanner input = new Scanner(System.in);
		System.out.print("Car Brand:");
		String carBrand = input.next();
		System.out.print("Car Name:");
		String carName = input.next();
		System.out.print("Car Engine:");
		String carEngine = input.next();
		System.out.println(carEngine);
		System.out.print("Car tire:");
		String cartire = input.next();

	}
	public static void deletekindofCar() {
		Scanner input = new Scanner(System.in);
		System.out.print("Car Brand:");
		String carBrand = input.next();
		
	}
	public static void editkindofCar() {
		Scanner input = new Scanner(System.in);
		System.out.print("Car Brand:");
		String carBrand = input.next();
		
	}
	public static void viewkindofCar() {
		Scanner input = new Scanner(System.in);
		System.out.print("Car Brand:");
		String carBrand = input.next();
		
	}
	
}
