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
		
		switch(num) {
			case 1:
				System.out.print("Car Brand:");
				String CarBrand = input.next();
				System.out.print("Car name:");
				String Carname = input.next();
				System.out.print("Car Engine:");
				String CarEngine = input.next();
				System.out.print("Car tire:");
				String Cartire = input.next();
		    	break;
		    case 2:
		    	System.out.print("Car Brand:");
				String CarBrand1 = input.next();
		    	break;
		    case 3:
		    	System.out.print("Car Brand:");
				String CarBrand2 = input.next();
		    	break;
		    case 4:
		    	System.out.print("Car Brand:");
				String CarBrand3 = input.next();
		    	break;
			
		
		
			
			}
	    }
	}
}