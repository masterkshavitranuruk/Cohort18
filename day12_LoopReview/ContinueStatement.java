package day12_LoopReview;

public class ContinueStatement {

	public static void main(String[] args) {
/*Java Continue
The continue statement breaks one iteration (in the loop), 
if a specified condition occurs, and continues with the next iteration in the loop.

This example skips the value of 2:*/
	
		for(int i =0; i<10;i++) {
			if (i ==2)
				continue; // will jump to counter modification : Exception cases : None of No 2 and 7 to run  
			System.out.println(i);
		}

	}

}
