package Car;

import java.util.Scanner;

public interface CarInput {
	
	public void getUserInput(Scanner input);
	public int getBrand();
	public void setBrand(int brand);
	public void setName(String name);
	public void setEngine(String engine);
	public void setTire(String tire);
	public void printInfo();
	

}
