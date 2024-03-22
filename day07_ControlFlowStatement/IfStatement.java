package day07_ControlFlowStatement;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		
		int num1 = 20;

		if (num1 % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		
		int a = 5;
		int b = 7;
		if (a > b) {
			System.out.println(a + " is bigger !");
		} else {
			System.out.println(b + " is bigger !");
		}

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("What's your age ? ");
			int voteAge = scan.nextInt();

			if (voteAge >= 18) {
				System.out.println(" Voter is eligible to vote");

			} else {

				System.out.println("Voter is not eligible to vote");
			}
		}

	}

}
