import java.util.ArrayList;
import java.util.Scanner;

public class DVD extends Movie {
	private static Scanner scan;

	public DVD(String title, int runtime, ArrayList<String> scenes) {
		super( title, runtime, title, scenes);
	}

	@Override
	public void play() {
		int scenePick = -1;
		
		do {
			System.out.println("Which scene of the DVD " + getTitle());
			System.out.print("Would you like to watch? Select 0 to " + (getScene().size() - 1) + ": ");
			try {
				scenePick = scan.nextInt();
			}catch(Exception e) {
				scan.next(); 
				System.out.println("Invalid input recieved, try again:");
			}
			
			
		}while(scenePick == -1);
		
		System.out.println("Scene " + scenePick + ": " + getScene().get(scenePick));
	}
		
}




