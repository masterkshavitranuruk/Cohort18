package alexLeeTutorial;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoop37 {

	public static void main(String[] args) {
		
		
//		while(true) {
//			System.out.println("a");
//
//		}
		
//		int a =0;
//		while(a<10) {
//		System.out.println("a is less than 10. " +a);
//		a++;
//		} 
//		
//   The same function as for loop
//			for(int i =0; i<10;i++) {
//				System.out.println("a is less than 10. " +a);
//			}		
		
		
		
//		do {                      // do this first  a=0 --->no matter what
//			System.out.println("a");
//		}while(a<10);{             // check this if it true keep while loop
//									a= 1 ---> a=10
//		a++;
//		}
		
		String sentence = "flapjacks are awesome!";
		Scanner scan = new Scanner(sentence);
		ArrayList<String> words = new ArrayList<String>();

		while (scan.hasNext()) {// find EACH WORDS IN WHILE LOOP
			words.add(scan.next()); //STORE EACH WORD TO ARRAY 
		}

		System.out.println(words);

		
		
		
		
	}
}
