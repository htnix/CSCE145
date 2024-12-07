import java.util.Scanner;

public class PokemonBattle {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		String starter = "none";
		String additionalMoves = "none";
		String baseMoves = "none";
		String path = "none";
		String fightRun1 = "none";
		String fightRun2 = "none";
		Boolean win1 = false;
		Boolean win2 = false;
		int hitPoints = 0;

			System.out.println("Your journey starts in the region of Kanto!");
			System.out.println("Please pick your Starter Pokemon to begin your journey! \n(Squirtle, Charmander, or Bulbasaur)");
			starter = key.nextLine();
			
			if(starter.equalsIgnoreCase("Squirtle")) { //Squirt gets Aqua jet as basic 
				hitPoints = 44;
				baseMoves = "Aqua Jet";
				System.out.println("Please Select an additonal move for your Pokemon! (Icy Winds, Body Slam, or Brick Break)");
				additionalMoves = key.nextLine();
				
				if(additionalMoves.equalsIgnoreCase("Icy Winds") || additionalMoves.equalsIgnoreCase("Body Slam") || additionalMoves.equalsIgnoreCase("Brick Break")) {
					System.out.println("You have chose " + starter + " as your starter! It has the moves of Aqua Jet and " + additionalMoves + "!");
				}else {
					System.out.println("Please put a vaild move! Exiting game!");
					System.exit(0);
				}
				
			}else if(starter.equalsIgnoreCase("Charmander")) { //Char base attack is ember
				hitPoints = 39;
				baseMoves = "Ember";
				System.out.println("Please Select an additonal move for your Pokemon! (Dragon Tail, Take Down, or Metal Claw)");
				additionalMoves = key.nextLine();
				
				if(additionalMoves.equalsIgnoreCase("Dragon Tail") || additionalMoves.equalsIgnoreCase("Take Down") || additionalMoves.equalsIgnoreCase("Metal Claw")) {
					System.out.println("You have chose " + starter + " as your starter! It has the moves of Ember and " + additionalMoves + "!");
				}else {
					System.out.println("Please put a vaild move! Exiting game!");
					System.exit(0);
				}
				
			}else if(starter.equalsIgnoreCase("Bulbasaur")) { //Razor leaf
				hitPoints = 45;
				baseMoves = "Razor Leaf";
				System.out.println("Please Select an additonal move for your Pokemon! (Acid Spray, Tackle, or Rest)");
				additionalMoves = key.nextLine();
				
				if(additionalMoves.equalsIgnoreCase("Acid Spray") || additionalMoves.equalsIgnoreCase("Tackle") || additionalMoves.equalsIgnoreCase("Rest")) {
					System.out.println("You have chose " + starter + " as your starter! It has the moves of Razor Leaf and " + additionalMoves + "!");
				}else {
					System.out.println("Please put a vaild move! Exiting game!");
					System.exit(0);
				}
				
			}else {
				System.out.println("Please enter a proper starter! Exiting game!");
				System.exit(0);
			}
			
		System.out.println("Please pick your path: (Flame Path, Normal Path, or Water Path)");
		path = key.nextLine();
	
		if(path.equalsIgnoreCase("Flame Path")) {
			System.out.println("You have picked The Flame Path! On this path you must defeat 2 other Pokemon to win your badge!");
			System.out.println("While on your path you encountered a Ponyta! Would you like to run or fight?");
			fightRun1 = key.nextLine();
			
			if(fightRun1.equalsIgnoreCase("fight")) {
				System.out.println("You have picked Fight! Entering fight with a Ponyta!");
				
				if(starter.equalsIgnoreCase("Squirtle")) {
					System.out.println("The Ponyta used Flame Wheel! It was not effective!");
					System.out.println("What move will you do? (" + baseMoves + " or " + additionalMoves +")");
					String ponyAttack = key.nextLine();
					if (ponyAttack.equalsIgnoreCase(baseMoves)) {
						System.out.println("You're attack was super effective! Ponyta has fainted");
						win1 = true;
					}else {
						System.out.println("Your attack was not very effctive! Running overtime protocol!");
						if(hitPoints >= 50) {
							System.out.println("You're Pokemon had more HP you have won!");
							win1 = true;
						}else {
							System.out.println("You're Pokemon had less HP you have loss!");
							win1 = false;
						}
					}	
				}else if (starter.equalsIgnoreCase("Charmander")) {
					System.out.println("The Ponyta used Flame Wheel! It was not very effective!");
					System.out.println("What move will you do? (" + baseMoves + " or " + additionalMoves +")");
					String ponyAttack = key.nextLine();
					System.out.println("Your attack was not very effective! Running overtime protocol!");
					
					if(hitPoints >= 50) {
						System.out.println("You're Pokemon had more HP you have won!");
						win1 = true;
					}else {
						System.out.println("You're Pokemon had less HP you have loss!");
						win1 = false;
					}
					
				}else if (starter.equalsIgnoreCase("Bulbasaur")) {
					System.out.println("The Ponyta used Flame Wheel! It was very effective!");
					System.out.println("You're pokemon fainted!");
					win1 = false;
				}
			} else{
				System.out.println("You have chosen to flee!");
				win1 = false;
			}
			
			System.out.println("After encountering the Ponyta you find another Pokemon! It is a Flareon! Would you like to run or fight?");
			fightRun2 = key.nextLine();
			
			if(fightRun2.equalsIgnoreCase("Fight")) {
				if(starter.equalsIgnoreCase("Squirtle")) {
					System.out.println("The Flareon used Flare Blitz! It was not effective!");
					System.out.println("What move will you do? (" + baseMoves + " or " + additionalMoves +")");
					String ponyAttack = key.nextLine();
					if (ponyAttack.equalsIgnoreCase(baseMoves)) {
						System.out.println("You're attack was super effective! Ponyta has fainted");
						win2 = true;
					}else {
						System.out.println("Your attack was not very effctive! Running overtime protocol!");
						if(hitPoints >= 65) {
							System.out.println("You're Pokemon had more HP you have won!");
							win2 = true;
						}else {
							System.out.println("You're Pokemon had less HP you have loss!");
							win2 = false;
						}
					}	
				}else if (starter.equalsIgnoreCase("Charmander")) {
					System.out.println("The Flareon used Flare Blitz! It was not very effective!");
					System.out.println("What move will you do? (" + baseMoves + " or " + additionalMoves +")");
					String ponyAttack = key.nextLine();
					System.out.println("Your attack was not very effective! Running overtime protocol!");
					
					if(hitPoints >= 65) {
						System.out.println("You're Pokemon had more HP you have won!");
						win2 = true;
					}else {
						System.out.println("You're Pokemon had less HP you have loss!");
						win2 = false;
					}
				}else if (starter.equalsIgnoreCase("Bulbasaur")) {
					System.out.println("The Flareon used Flare Blitz! It was very effective!");
					System.out.println("You're pokemon fainted!");
					win2 = false;
				}
			}else {
				System.out.println("You have chosen flee!");
				win2 = false;
			}
		
			
			System.out.println("You have completed the flame path!");
			if(win1 && win2) {
				System.out.println("You won both of your battles! You are a truly great trainner! For your efforts you have won the Flame Badge! \n Congratulations on completing your Journey!");
				System.exit(0);
			}else if(!win1 && win2) {
				System.out.println("You lost your battle againt the Ponyta. Your single win was not enough to prove your strength. \n However, you defeated a stronger enemy! For that you have won potions to heal your " + starter + "\n Good job on your Journey!");
				System.exit(0);
			}else if(win1 && !win2) {
				System.out.println("You lost your battle against the Flareon. Your single win was not enough to prove your strenth. \n You lost to a stronger enemy! Keep training and maybe you can defeat it next time!");
				System.exit(0);
			}else if(!win1 && !win2) {
				System.out.println("You lost both of your battles! Maybe try a different job then Pokemon training?");
				System.exit(0);
			}
				
		}else if(path.equalsIgnoreCase("Normal Path")) {
			System.out.println("You have picked The Normal Path! On this path you must defeat 2 other Pokemon to win your badge!");
			System.out.println("While on your path you encountered a Farfetch'd! Would you like to run or fight?");
			fightRun1 = key.nextLine();
			
			if(fightRun1.equalsIgnoreCase("fight")) {
				System.out.println("You have picked Fight! Entering fight with a Farfetch'd!");
				
				if(starter.equalsIgnoreCase("Squirtle")) {
					System.out.println("The Farfetch'd used Fury Attack! It was not effective!");
					System.out.println("What move will you do? (" + baseMoves + " or " + additionalMoves +")");
					String ponyAttack = key.nextLine();
					if (ponyAttack.equalsIgnoreCase(baseMoves)) {
						System.out.println("You're attack was not effective!  Running overtime protocol!");
						if(hitPoints >= 52) {
							System.out.println("You're Pokemon had more HP you have won!");
							win1 = true;
						}else {
							System.out.println("You're Pokemon had less HP you have loss!");
							win1 = false;
						}
					}else if(ponyAttack.equalsIgnoreCase(additionalMoves)) {
						System.out.println("Your attack was super effective! Farfetch'd has fainted!");
						win1 = true;
					}	
				}else if (starter.equalsIgnoreCase("Charmander")) {
					System.out.println("The Farfetch'd used Fury Attack! It was not effective!");
					System.out.println("What move will you do? (" + baseMoves + " or " + additionalMoves +")");
					String ponyAttack = key.nextLine();
					
					if(ponyAttack.equalsIgnoreCase(baseMoves)) {
						System.out.println("Your attack was not very effective! Running overtime protocol!");
						if(hitPoints >= 52) {
							System.out.println("You're Pokemon had more HP you have won!");
							win1 = true;
						}else {
							System.out.println("You're Pokemon had less HP you have loss!");
							win1 = false;
						}
					}else if (ponyAttack.equalsIgnoreCase(additionalMoves)) {
						if(additionalMoves.equalsIgnoreCase("Take Down")) {
							System.out.println("Your attack was super effective! Farfetch'd has fainted!");
							win1 = true;
						}else {
							System.out.println("Your attack was not very effective! Running overtime protocol!");
							if(hitPoints >= 50) {
								System.out.println("You're Pokemon had more HP you have won!");
								win1 = true;
							}else {
								System.out.println("You're Pokemon had less HP you have loss!");
								win1 = false;
							}
						}
					}
					
				}else if (starter.equalsIgnoreCase("Bulbasaur")) {
					System.out.println("The Farfetch'd used Fury Attack! It was not effective!");
					System.out.println("What move will you do? (" + baseMoves + " or " + additionalMoves +")");
					String ponyAttack = key.nextLine();
					
					if(ponyAttack.equalsIgnoreCase(baseMoves)) {
						System.out.println("Your attack was not very effective! Running overtime protocol!");
						if(hitPoints >= 52) {
							System.out.println("You're Pokemon had more HP you have won!");
							win1 = true;
						}else {
							System.out.println("You're Pokemon had less HP you have loss!");
							win1 = false;
						}
					}else if (ponyAttack.equalsIgnoreCase(additionalMoves)) {
						if(additionalMoves.equalsIgnoreCase("Tackle")) {
							System.out.println("Your attack was super effective! Farfetch'd has fainted!");
							win1 = true;
						}else {
							System.out.println("Your attack was not very effective! Running overtime protocol!");
							if(hitPoints >= 52) {
								System.out.println("You're Pokemon had more HP you have won!");
								win1 = true;
							}else {
								System.out.println("You're Pokemon had less HP you have loss!");
								win1 = false;
							}
						}
					}
				}
			}else {
				System.out.println("You have chosen flee!");
				win1 = false;
			}
			System.out.println("After encountering the Farfetch'd"
					+ " you find another Pokemon! It is a Persian! Would you like to run or fight?");
			fightRun2 = key.nextLine();
			if(fightRun1.equalsIgnoreCase("fight")) {
				System.out.println("You have picked Fight! Entering fight with a Farfetch'd!");
				
				if(starter.equalsIgnoreCase("Squirtle")) {
					System.out.println("The Persian used Scratch! It was not effective!");
					System.out.println("What move will you do? (" + baseMoves + " or " + additionalMoves +")");
					String ponyAttack = key.nextLine();
					if (ponyAttack.equalsIgnoreCase(baseMoves)) {
						System.out.println("You're attack was not effective!  Running overtime protocol!");
						if(hitPoints >= 65) {
							System.out.println("You're Pokemon had more HP you have won!");
							win2 = true;
						}else {
							System.out.println("You're Pokemon had less HP you have loss!");
							win2 = false;
						}
					}else if(ponyAttack.equalsIgnoreCase(additionalMoves)) {
						System.out.println("Your attack was super effective! Persian has fainted!");
						win2 = true;
					}	
				}else if (starter.equalsIgnoreCase("Charmander")) {
					System.out.println("The Persian used Scratch! It was not effective!");
					System.out.println("What move will you do? (" + baseMoves + " or " + additionalMoves +")");
					String ponyAttack = key.nextLine();
					
					if(ponyAttack.equalsIgnoreCase(baseMoves)) {
						System.out.println("Your attack was not very effective! Running overtime protocol!");
						if(hitPoints >= 65) {
							System.out.println("You're Pokemon had more HP you have won!");
							win2 = true;
						}else {
							System.out.println("You're Pokemon had less HP you have loss!");
							win2 = false;
						}
					}else if (ponyAttack.equalsIgnoreCase(additionalMoves)) {
						if(additionalMoves.equalsIgnoreCase("Take Down")) {
							System.out.println("Your attack was super effective! Persian has fainted!");
							win2 = true;
						}else {
							System.out.println("Your attack was not very effective! Running overtime protocol!");
							if(hitPoints >= 65) {
								System.out.println("You're Pokemon had more HP you have won!");
								win2 = true;
							}else {
								System.out.println("You're Pokemon had less HP you have loss!");
								win2 = false;
							}
						}
					}
					
				}else if (starter.equalsIgnoreCase("Bulbasaur")) {
					System.out.println("The Persian used Scratch! It was not effective!");
					System.out.println("What move will you do? (" + baseMoves + " or " + additionalMoves +")");
					String ponyAttack = key.nextLine();
					
					if(ponyAttack.equalsIgnoreCase(baseMoves)) {
						System.out.println("Your attack was not very effective! Running overtime protocol!");
						if(hitPoints >= 65) {
							System.out.println("You're Pokemon had more HP you have won!");
							win2 = true;
						}else {
							System.out.println("You're Pokemon had less HP you have loss!");
							win2 = false;
						}
					}else if (ponyAttack.equalsIgnoreCase(additionalMoves)) {
						if(additionalMoves.equalsIgnoreCase("Tackle")) {
							System.out.println("Your attack was super effective! Persian has fainted!");
							win2 = true;
						}else {
							System.out.println("Your attack was not very effective! Running overtime protocol!");
							if(hitPoints >= 65) {
								System.out.println("You're Pokemon had more HP you have won!");
								win2 = true;
							}else {
								System.out.println("You're Pokemon had less HP you have loss!");
								win2 = false;
							}
						}
					}
				}
			}else {
				System.out.println("You have chosen flee!");
				win2 = false;
			}
			
			System.out.println("You have completed the Normal path!");
			if(win1 && win2) {
				System.out.println("You won both of your battles! You are a truly great trainner! For your efforts you have won the Normal Badge! \n Congratulations on completing your Journey!");
				System.exit(0);
			}else if(!win1 && win2) {
				System.out.println("You lost your battle againt the Farfetch'd. Your single win was not enough to prove your strength. \n However, you defeated a stronger enemy! For that you have won potions to heal your " + starter + "\n Good job on your Journey!");
				System.exit(0);
			}else if(win1 && !win2) {
				System.out.println("You lost your battle against the Persian. Your single win was not enough to prove your strenth. \n You lost to a stronger enemy! Keep training and maybe you can defeat it next time!");
				System.exit(0);
			}else if(!win1 && !win2) {
				System.out.println("You lost both of your battles! Maybe try a different job then Pokemon training?");
				System.exit(0);
			}
			
		}else if(path.equalsIgnoreCase("Water Path")) {
			System.out.println("You have picked The Water Path! On this path you must defeat 2 other Pokemon to win your badge!");
			System.out.println("While on your path you encountered a Shellder! Would you like to run or fight?");
			fightRun1 = key.nextLine();
			
			if(fightRun1.equalsIgnoreCase("fight")) {
				System.out.println("You have picked Fight! Entering fight with a Shellder!");
				
				if(starter.equalsIgnoreCase("Squirtle")) {
					System.out.println("The Shellder used Water Pulse! It was not effective!");
					System.out.println("What move will you do? (" + baseMoves + " or " + additionalMoves +")");
					String ponyAttack = key.nextLine();
					if (ponyAttack.equalsIgnoreCase(baseMoves)) {
						System.out.println("You're attack was not effective!  Running overtime protocol!");
						if(hitPoints >= 40) {
							System.out.println("You're Pokemon had more HP you have won!");
							win1 = true;
						}else {
							System.out.println("You're Pokemon had less HP you have loss!");
							win1 = false;
						}
					}else if(ponyAttack.equalsIgnoreCase(additionalMoves)) {
						System.out.println("You're attack was not effective!  Running overtime protocol!");
						if(hitPoints >= 40) {
							System.out.println("You're Pokemon had more HP you have won!");
							win1 = true;
						}else {
							System.out.println("You're Pokemon had less HP you have loss!");
							win1 = false;
						}
					}	
				}else if (starter.equalsIgnoreCase("Charmander")) {
					System.out.println("The Shellder used Water Pulse! It was very effective!");
					System.out.println("Your Charmander has fainted");
					win1 = false;
					
				}else if (starter.equalsIgnoreCase("Bulbasaur")) {
					System.out.println("The Shellder used Water Pulse! It was not very effective!");
					System.out.println("What move will you do? (" + baseMoves + " or " + additionalMoves +")");
					String ponyAttack = key.nextLine();
					
					if(ponyAttack.equalsIgnoreCase(baseMoves)) {
						System.out.println("Your attack was very effective!");
						System.out.println("Shellder has fainted!");
						win1 = true;
					}else if (ponyAttack.equalsIgnoreCase(additionalMoves)) {
						System.out.println("Your attack was not effective! Running overtime protocol!");
						System.out.println("You're attack was not effective!  Running overtime protocol!");
						if(hitPoints >= 40) {
							System.out.println("You're Pokemon had more HP you have won!");
							win1 = true;
						}else {
							System.out.println("You're Pokemon had less HP you have loss!");
							win1 = false;
						}
					}
				}
			}else {
				System.out.println("You have chosen flee!");
				win1 = false;
			}
			System.out.println("After encountering the Shellder"
					+ " you find another Pokemon! It is a Golduck! Would you like to run or fight?");
			fightRun2 = key.nextLine();
			
			if(fightRun2.equalsIgnoreCase("fight")) {
				System.out.println("You have picked Fight! Entering fight with a Golduck!");
				
				if(starter.equalsIgnoreCase("Squirtle")) {
					System.out.println("The Golduck used Water Gun! It was not effective!");
					System.out.println("What move will you do? (" + baseMoves + " or " + additionalMoves +")");
					String ponyAttack = key.nextLine();
					if (ponyAttack.equalsIgnoreCase(baseMoves)) {
						System.out.println("You're attack was not effective!  Running overtime protocol!");
						if(hitPoints >= 80) {
							System.out.println("You're Pokemon had more HP you have won!");
							win2 = true;
						}else {
							System.out.println("You're Pokemon had less HP you have loss!");
							win2 = false;
						}
					}else if(ponyAttack.equalsIgnoreCase(additionalMoves)) {
						System.out.println("You're attack was not effective!  Running overtime protocol!");
						if(hitPoints >= 80) {
							System.out.println("You're Pokemon had more HP you have won!");
							win2 = true;
						}else {
							System.out.println("You're Pokemon had less HP you have loss!");
							win2 = false;
						}
					}	
				}else if (starter.equalsIgnoreCase("Charmander")) {
					System.out.println("The Golduck used Water Gun! It was very effective!");
					System.out.println("Your Charmander has fainted");
					win2 = false;
					
				}else if (starter.equalsIgnoreCase("Bulbasaur")) {
					System.out.println("The Golduck used Water Gun! It was not very effective!");
					System.out.println("What move will you do? (" + baseMoves + " or " + additionalMoves +")");
					String ponyAttack = key.nextLine();
					
					if(ponyAttack.equalsIgnoreCase(baseMoves)) {
						System.out.println("Your attack was very effective!");
						System.out.println("Golduck has fainted!");
						win2 = true;
					}else if (ponyAttack.equalsIgnoreCase(additionalMoves)) {
						System.out.println("Your attack was not effective! Running overtime protocol!");
						System.out.println("You're attack was not effective!  Running overtime protocol!");
						if(hitPoints >= 80) {
							System.out.println("You're Pokemon had more HP you have won!");
							win2 = true;
						}else {
							System.out.println("You're Pokemon had less HP you have loss!");
							win2 = false;
						}
					}
				}
			}else {
				System.out.println("You have chosen flee!");
				win2 = false;
			}
			System.out.println("You have completed the Water path!");
			if(win1 && win2) {
				System.out.println("You won both of your battles! You are a truly great trainner! For your efforts you have won the Water Badge! \n Congratulations on completing your Journey!");
				System.exit(0);
			}else if(!win1 && win2) {
				System.out.println("You lost your battle againt the Shellder. Your single win was not enough to prove your strength. \n However, you defeated a stronger enemy! For that you have won potions to heal your " + starter + "\n Good job on your Journey!");
				System.exit(0);
			}else if(win1 && !win2) {
				System.out.println("You lost your battle against the Golduck. Your single win was not enough to prove your strenth. \n You lost to a stronger enemy! Keep training and maybe you can defeat it next time!");
				System.exit(0);
			}else if(!win1 && !win2) {
				System.out.println("You lost both of your battles! Maybe try a different job then Pokemon training?");
				System.exit(0);
			}
			
		}else {
			System.out.println("Please enter a vaild Path! Exiting game!");
			System.exit(0);
		}
			
	}
		
}

