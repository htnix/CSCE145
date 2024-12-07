//Hayes Nix
import java.util.Scanner;
import java.util.Random; //these import random and scanner packages


public class RockPaperSis {

	public static final int MAX = 3;
	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner key = new Scanner(System.in);
		
		Boolean again;
		String playAgain;
	
		do {
			int cpuWin = 0;
			int playerWin = 0;
			int playerChoice = 0;
			int cpuChoice;
			int roundCount = 0; // declaring variables in the loop allows for them to reset
			System.out.println("Welcome to Rock Paper Scissors! You have to win two out of three to be the victor!");
			do {
				cpuChoice = r.nextInt(MAX); //this creates a random number to use a pc choice
				System.out.println("What is your move?");
				String playerInput = key.nextLine();
			
				if(playerInput.equalsIgnoreCase("Rock")) { // this is change the strings to int so I can compare to random
					playerChoice = 0;
				}else if(playerInput.equalsIgnoreCase("Paper")) {
					playerChoice = 1;
				}else if(playerInput.equalsIgnoreCase("Scissors")) {
					playerChoice = 2;
				}else {
					cpuWin++;
					System.out.println("Please enter a vaild input! PC get a point! You have " + playerWin + " wins and the CPU has " + cpuWin + " wins!");
					playerChoice = 3;
				}
			
				if(playerChoice == 0 && cpuChoice == 0) {
					System.out.println("It is a tie! You have " + playerWin + " wins and the CPU has " + cpuWin + " wins!");
				}else if(playerChoice == 1 && cpuChoice == 1) {
					System.out.println("It is a tie! You have " + playerWin + " wins and the CPU has " + cpuWin + " wins!");
				}else if(playerChoice == 2 && cpuChoice == 2) {
					System.out.println("It is a tie! You have " + playerWin + " wins and the CPU has " + cpuWin + " wins!");
				}else if (playerChoice == 0 && cpuChoice == 2) {
					playerWin++;
					System.out.println("The PC picked scissors you have won! You have " + playerWin + " wins and the CPU has " + cpuWin + " wins!");
				}else if (playerChoice == 1 && cpuChoice == 0) {
					playerWin++;
					System.out.println("The PC picked rock you have won!! You have " + playerWin + " wins and the CPU has " + cpuWin + " wins!");
				}else if (playerChoice == 2 && cpuChoice == 1) {
					playerWin++;
					System.out.println("The PC picked paper you have won! You have " + playerWin + " wins and the CPU has " + cpuWin + " wins!");
				}else if (playerChoice == 0 && cpuChoice == 1) {
					cpuWin++;
					System.out.println("The PC picked paper you have loss! You have " + playerWin + " wins and the CPU has " + cpuWin + " wins!");
				}else if (playerChoice == 1 && cpuChoice == 2) {
					cpuWin++;
					System.out.println("The PC picked scissors you have loss! You have " + playerWin + " wins and the CPU has " + cpuWin + " wins!");
				}else if (playerChoice == 2 && cpuChoice == 0) {
					cpuWin++;
					System.out.println("The PC picked rock you have loss! You have " + playerWin + " wins and the CPU has " + cpuWin + " wins!");
				}//this whole if block compares the random and player input
				
				roundCount++;
			}while (playerWin < 2 && cpuWin < 2 && roundCount < 3);
			
			if(playerWin == 2) {
				System.out.println("\n You have won the best two out of three!");
			}else if (cpuWin == 2) {
				System.out.println("\n You have loss the best two out of three!");
			}else if (roundCount == 3) {
				System.out.println("\n No one got two wins! No one wins its a tie!");
			}
		
			System.out.println("\n Do you want to play again? (Yes or No)");
			playAgain = key.nextLine();
			if (playAgain.equalsIgnoreCase("Yes")) {
				again = true;
			}else {
				again = false;
			}
			
		}while(again == true); // this loop is so they can play again
		
	}

}
