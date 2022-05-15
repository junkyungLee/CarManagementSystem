package Car;

import java.util.Scanner;

import exception.EmailFormatException;

public interface CarInput {


	public int getBrand();

	public void setBrand(int brand);

	public void setName(String name);

	public void setEngine(String engine) throws EmailFormatException;

	public void setTire(String tire);

	public void getUserInput(Scanner input);

	public void printInfo();

	public void setCarBrand( Scanner input );

	public void setCarName(Scanner input );

	public void setCarEngine(Scanner input );

	public void setCarTire(Scanner input );


}
