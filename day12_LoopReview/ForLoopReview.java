package day12_LoopReview;

public class ForLoopReview {

	public static void main(String[] args) {
		// initialize counter variable
		// check boolean expression (true/false)
		// block of code will be executed
		// increment / decrement counter
		// if expression is false
		// the loop is ended

		/*
		 * for (counter_initialize; boolean_expression; counter modification (++/--) ) {
		 * // code to be executed. }
		 */

		// A ; B ; C
		for (int i = 0; i < 5; i++) {
			// D
			System.out.println("Hi");
			System.out.println("Five");

		}
		// E
		System.out.println("loop stopped");
		
		
		

		// The for loop that move i = 0 and i++ still running same code as above

		int i = 0;

		for (; i < 5;) {
			// D
			System.out.println("Hi");
			System.out.println("Five");

			i++;
		}
		// E
		System.out.println("loop stopped");

		// A -> B (true) -> D -> C -> B (true) -> D -> C -> B (false) -> E
		
// ___________________________________________________________________________		
		
		

// 			Let 's use loop to print A to Z in the same line

// 			ACSII table---> char have their own int number

		char firstletter = 'z';
		int a = firstletter;
		System.out.println(a);

		int bNumber = 66;
		char secondLetter = (char) bNumber;
		System.out.println("66 = " + secondLetter);

// 		char = int

		for (char letter = 'A'; letter <= 'Z'; letter++) {
			System.out.print(letter + "");
		}

	}

}
