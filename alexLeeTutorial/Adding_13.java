package alexLeeTutorial;

import java.util.Scanner;

public class Adding_13 {

	public static void main(String[] args) {
//		int a = scan.nextInt();
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int a = scan.nextInt();
			
			System.out.println("Enter another number: ");
			int b = scan.nextInt();
			
			System.out.println("Sum is " + (a + b));
		} 

	}

}
