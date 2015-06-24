import java.util.Scanner;

public class AdventureGame {
	

	/*  switch statement 
	switch(productID){
	case 1:
		productDescription = "Hammer";
		break;
	case 2: 
		productDescription = "Box of Nails"
		break:
	default:
		productDescription = "Product Not Found"
	}
*/	
			
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String weapon = "";
		int dragonHeads = 1;
		String dragonEyeColor = "";
		String decision = "";
		String name = "";
		System.out.print("Welcome! What is your name? (enter your name):  ");
		name = sc.nextLine();
		String choice = "y";
		System.out.print("Would you like to play a game? (y/n):   ");
		choice = sc.nextLine();
		System.out.println();
		
		while(choice.equalsIgnoreCase("y")){
			System.out.print("Excellent! You are walking across a field and your encounter "
					+ "a fire-breathing dragon!" + "\n What would you do? (enter \"face the beast\" or \"run away\"): ");
			
				decision = sc.nextLine();
			
			switch(decision){
			case "face the beast":
				System.out.println("You approach the dragon you see it has _ heads. (enter \"1\", \"2\", or \"3\"):");
				dragonHeads = sc.nextInt();
				
				switch (dragonHeads){
				case 1:
					System.out.println("You see he has 1 head");
					break;
				case 2:
					System.out.println("You see he has 2 heads");
					break;
				case 3:
					System.out.println("You see he has 3 heads");
					break;
				default: System.out.println("You see he has 1 head");
				}
				break;
			case "run away":
				System.out.println("You are a coward!! GAME OVER!");
				System.exit(0);
				break;
			default: System.out.println("try again");
			}
			if (dragonHeads == 1){
				System.out.print("You now have to face the deadly dragon.");
						
			}else{
				System.out.print("No one has faced a " + dragonHeads +"-headed dragon before! ");
				
				
			}
			System.out.print("Choose your weapon. (Enter \"sling shot\", \"sword\", or \"bow and arrow\"); ");
			sc.nextLine();
			weapon = sc.nextLine();
			System.out.println("Armed with your " + weapon + ", you approach the dragon.  You can feel its fiery breath as you get closer.  "
					+ "It stares at you with it's _ eyes. (enter \"red\" or \"blue\"):  ");
			dragonEyeColor = sc.nextLine();
			
			switch(dragonEyeColor){
				case "red":
					System.out.println("Oh thank goodness! Red-eyed dragons are friendly.  You pet it and become friends"
							+ " you fly off in the sunset with your new friend");
					System.exit(0);
					break;
				
				case "blue":
					System.out.println("Lord Jesus it's a fire! Blue-eyed dragons are dangerous.  It breaths fire"
							+ " on you and burns you to a crisp.");
					System.exit(0);
					break;
					
			}
					 
						 
			
		}//end while loop
		sc.close();
	}//end main method

}
