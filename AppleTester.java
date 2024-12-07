import java.util.Scanner;
public class AppleTester {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		Apple A1 = new Apple();
		
		System.out.println("Welcome to Apple Tester! \nCreating your first apple! \nDefault values of the first apple object:\n" + A1.writeOutput());
		
		System.out.println("Enter the type of your second apple object:");
		String appleType = key.nextLine();
		
		System.out.println("Enter the weight of the second apple object:");
		double appleWeight = key.nextDouble();
		key.nextLine();
		
		System.out.println("Enter the price of the second apple object:");
		double applePrice = key.nextDouble();
		
		Apple A2 = new Apple(appleType, appleWeight, applePrice);
		System.out.println("Creating Second Apple object! \nValues of Second Object: " + A2.writeOutput());
	}
	
}
