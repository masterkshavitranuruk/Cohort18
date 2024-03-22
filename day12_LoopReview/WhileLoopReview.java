package day12_LoopReview;

public class WhileLoopReview {

	public static void main(String[] args) {
		  // While Loop

	    /*
	    while (boolean_condition) { // if condition true
	      // code that repeated
	      // until the condition return false
	    }
	    */

	    int counter = 0;
	    //         A
	    while (counter < 10) {
	      // B
	      System.out.println("Hi");
	      System.out.println("Hello World");
	      System.out.println("Counter is: " + counter);
	      counter = counter + 1;  // same as counter++;
	    }
	    // C
	    System.out.println("loop has stopped");
	    System.out.println("Counter is finished at: " + counter);

	    // A (true) -> B -> A (true) -> B -> A (true) -> B -> A (false) -> C


	    System.out.println("========");


	    // if loop have 1 line of code
	    int i =0;
	    while (i < 3) {
	      System.out.println("Hey !! " + (i++));
	    }
	    System.out.println("end~~@!");

	}

}
