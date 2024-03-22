package alexLeeTutorial;

import java.util.Scanner;

public class MultipleChoice31 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String[] answers = {"c", "a", "c"};
		String[] responses = {"","", ""};
		
		
		System.out.println("What is 2+2 ?");
		System.out.println("a)   2");
		System.out.println("b)   3");
		System.out.println("c)   4");
		System.out.println("d)   5");
		System.out.println("Please answer question1.");
		responses[0] = scan.next();
		
		System.out.println("What is capitalof North Carolina ?");
		System.out.println("a)   Raleigh");
		System.out.println("b)   Durham");
		System.out.println("c)   Cary");
		System.out.println("d)   Winston-Salem");
		System.out.println("Please answer question2.");
		responses[1] = scan.next();
		
		
		System.out.println("What fastest animal ?");
		System.out.println("a)   Tiger");
		System.out.println("b)   Cheetah");
		System.out.println("c)   Girafe");
		System.out.println("d)   Wolf");
		System.out.println("Please answer question3.");
		responses[2] = scan.next();
		
//		System.out.println(responses[0]);
//		System.out.println(responses[1]);
//		System.out.println(responses[2]);

		
		
		int score =0; // add the score when is correct in if(true) loop
		for(int i=0; i<3; i++) {
	
			if (responses[i].equalsIgnoreCase(answers[i])) {
				score++;// add the score when is correct in if(true) loop
			}
			System.out.println("Score is "+score +" /3");
			}
		
		scan.close();	
	}
		
				
		
}

