package day12_LoopReview;

import java.util.Scanner;

public class TrueWhileLoop {

	public static void main(String[] args) {

		// true while loop
		// loop that always true
		// need condition check inside the loop
		// - if , break

		int counter = 0;
		while (true) {
			if (counter == 4) {
				break; // will jump out the loop, to line 19
			}
			System.out.println("code in the loop");
			counter++;
		}

		System.out.println("the loop has stopped");
		
//------------------------------------------------------------		
		//Java Break
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println("code in the loop");
			  System.out.println(i);
			}
		System.out.println("the loop has stopped");

// ___________________________________________________________________________		

//		write program to accept prompt from user

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("enter any word , type 'exit' to stop");
			String input = scan.next();

			if (input.equals("exit")) {
				System.out.println("exit the program");
				System.out.println("Good Bye");
				break;
			}
			System.out.println(input + "~!!!");
		}

		scan.close();

	}

}
