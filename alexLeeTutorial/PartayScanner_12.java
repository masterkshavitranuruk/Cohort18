package alexLeeTutorial;

import java.util.Scanner;

public class PartayScanner_12 {

	public static void main(String[] args) {
		
//		Here is the code for how to get string from a user in java! I walk through an 
//		example of how to get string user input in java by asking for pokemon.
//      import java.util.Scanner;		
//      Scanner scan = new Scanner(System.in);	
//		String pokemon1 = scan.nextLine();
		
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter pokemon 1:");
			String pokemon1 = scan.nextLine();


			System.out.println("Enter pokemon 2:");
			String pokemon2 = scan.nextLine();
			//System.out.println(pokemon2);

			System.out.println("Enter pokemon 3:");
			String pokemon3 = scan.nextLine();
			//System.out.println(pokemon3);

			System.out.println("Enter pokemon 4:");
			String pokemon4 = scan.nextLine();
			//System.out.println(pokemon4);

			System.out.println("Enter pokemon 5:");
			String pokemon5 = scan.nextLine();
			//System.out.println(pokemon5);

			System.out.println("Enter pokemon 6:");
			String pokemon6 = scan.nextLine();
			//System.out.println(pokemon6);

			System.out.println("Here are your pokemon !");
			System.out.println(pokemon1);
			System.out.println(pokemon2);
			System.out.println(pokemon3);
			System.out.println(pokemon4);
			System.out.println(pokemon5);
			System.out.println(pokemon6);
		}
	
	
	
	
	}

}
