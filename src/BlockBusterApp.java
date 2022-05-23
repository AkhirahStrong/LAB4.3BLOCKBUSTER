import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BlockBusterApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int userChoice;
		String yesNo;
		
		
		//Movie scene arrays
		ArrayList<String> FightClubSences = new ArrayList<>
		(Arrays.asList("Edward is in his office", "Edward meets Tyler", 
		"Edward moved in with Tyler", "Edward and Tyler starts fight club", 
		"Edward is Tyler"));
		
		ArrayList<String> castleScenes = new ArrayList<>(Arrays.asList
		("Sophie in the hat shop", "Sofie meets the Whitch of the waist",
		"Sofie gets a curse", "Sophie moves in with Howel"));
		
		ArrayList<String> stormSences = new ArrayList<>(Arrays.asList
		("Storm begans", "Stranger shows up", "Village meets at church", 
		"Stranger takes child"));
		
		ArrayList<String> goldenScenes = new ArrayList<>
		(Arrays.asList("Detective gets a case", "Detective goes to China Town", 
		"Detective saves child"));
		
		ArrayList<String> purpleScenes = new ArrayList<>(Arrays.asList
		("Price meet girl", "Price performs", "Girl runs out of club"));
		
		ArrayList<String>theyLiveScenes = new ArrayList<>(Arrays.asList
		("Nada looking for a job", "Noada finds job", "Nata find glasses"));
		
		
		//Arrays for user choice
		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(new DVD("Fight Club", 219, FightClubSences));
		movies.add(new DVD("Howel's Moving Castle", 159, castleScenes));
		movies.add(new DVD("The Storm of the Centery", 417, stormSences));
		movies.add(new VHS("The Golden Child", 134, goldenScenes));
		movies.add(new VHS("Purple Rain", 151, purpleScenes));
		movies.add(new VHS("They Live", 134, theyLiveScenes));
		
		
		//Getting user's input
		do {
			
			displayMenu();
			userChoice = scan.nextInt();
			
			
			try {
			
			if(userChoice == 1) {
				movies.get(userChoice - 1).play();
			}else if(userChoice == 2) {
				movies.get(userChoice - 1).play();
			}else if(userChoice == 3) {
				movies.get(userChoice - 1).play();
			}else if(userChoice == 4) {
				movies.get(userChoice - 1).play();
			}else if(userChoice == 5) {
				movies.get(userChoice - 1).play();
			}else if(userChoice == 6) {
				movies.get(userChoice - 1).play();
			}
		}catch(Exception e) {
			scan.nextLine();
			System.out.println("Movie selection does not exist");
		}
			
			if(userChoice > 0 && userChoice <= 3) {
				System.out.println("You've selected a DVD. ");
			} else {
				System.out.println("You've also selected a VHS. ");
			}
			
			System.out.println("Would you like to choose another movie? (Y/N)");
			yesNo = scan.nextLine();
			
			
		}while(yesNo.equalsIgnoreCase("y"));
		
		System.out.println("Thank you for choosing Blockbuster even though we're no longer in business! ");
		
		scan.close();
      }
	
		//Menu Display
		public static void displayMenu() {
			
			System.out.println("Hello! Please select a movie below to play!");
			System.out.println("1. Fight Club");
			System.out.println("2. Howel's Moving Castle");
			System.out.println("3. The Storm of the Centery");
			System.out.println("4. The Golden Child");
			System.out.println("5. Purple Rain");
			System.out.println("6. They Live");
			System.out.print("Which movie would you like? (1-6): ");
			
		}

	}


