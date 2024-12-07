import java.util.Scanner;

public class CoffeeTester {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		String again = "";
		
		do {
			String coffInput;
			double caffInput;
			String coffInput2;
			double caffInput2;
			Boolean coffSame;
			
			System.out.println("Welcome to the Coffee Hour!!! \nWhat's the name of your first coffee?");
			coffInput = key.nextLine();
			
			System.out.println("How much Caffeine does it have?");
			caffInput = key.nextDouble();
			key.nextLine(); //This creates a buffer to make the key.next line to work for the next input
			
			Coffee c1 = new Coffee(coffInput, caffInput);
			System.out.println(c1.toString());
			
			System.out.println("It would take " + c1.cupsAmount() + " cups of " + coffInput + " before it is dangerous to drink more.");
			
			System.out.println("What's the name of your Second coffee?");
			coffInput2 = key.nextLine();
			
			System.out.println("How much Caffeine does it have?");
			caffInput2 = key.nextDouble();
			key.nextLine();
			
			Coffee c2 = new Coffee(coffInput2, caffInput2);
			System.out.println(c2.toString());
			
			System.out.println("It would take " + c2.cupsAmount() + " cups of " + coffInput2 + " before it is dangerous to drink more.\n\n\n");
			
			if (caffInput == caffInput2) {
				coffSame = true;
			}else {
				coffSame = false;
			}
			
			System.out.println("Are both coffees the same? " + coffSame);
			
			System.out.println("Do you want to create more coffee objects? (Yes or No)");
			again = key.nextLine();
		}while(again.equalsIgnoreCase("Yes"));
	}
}
