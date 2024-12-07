import java.util.Scanner;
public class ShipNavagator {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String again = "";

		do {
			System.out.println("Enter the name of your ship:");
			String shipName = key.nextLine();
			
			System.out.println("Enter the launch date: (mm/dd/yyyy)");
			String launchDate = key.nextLine();
			
			System.out.println("Is it a cruise ship or a cargo ship?");
			String whichShip = key.nextLine();
			
			if(whichShip.equalsIgnoreCase("Cruise Ship")) {
				System.out.println("Enter the ship's passenger capacity: ");
				int shipCap = key.nextInt();
				
				System.out.println("How many crew members are on this ship?");
				int crewMem = key.nextInt();
				
				CruiseShip crS = new CruiseShip(shipName, launchDate, shipCap, crewMem); // creates object for cruise ship
				System.out.println("Creating a cruise ship... \nPrinting the ship's details: \n" + crS);
				
			}else if(whichShip.equalsIgnoreCase("Cargo Ship")){
				System.out.println("Enter the ship's tonnage (DWT): ");
				int tonnage = key.nextInt();
				
				System.out.println("Enter the maximum speed of the ship (in mph): ");
				int maxSpeed = key.nextInt();
				
				CargoShip caS = new CargoShip(shipName, launchDate, tonnage, maxSpeed); // creates object for cargo ship
				System.out.println("Creating a cruise ship... \nPrinting the ship's details: \n" + caS);
				
			}else {
				System.out.println("This is not a valid option");
			}
			key.nextLine();
	
			System.out.println("Do you want to create another ship object? (Yes or No)");
			again = key.nextLine();
		}while(again.equalsIgnoreCase("Yes"));
		
		System.out.println("Bye");
	}
}
