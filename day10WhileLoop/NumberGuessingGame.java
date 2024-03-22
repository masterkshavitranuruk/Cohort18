package day10WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int secretNumber = random.nextInt(10);

		
//		int count =1;
//		while(count <=3) {
		
//		count++;
//		}
		int count = 1;
		while (count <=3) {

			System.out.println("Please guess the number between 1 and 10");
			int guessingNumber;
			guessingNumber = scan.nextInt();

			if (guessingNumber == secretNumber) {
				System.out.println("Your guessing is coreect");
			} else if (guessingNumber < secretNumber) {
				System.out.println("Your guessing is too low");
			} else {
				System.out.println("Your guessing is too high");
			}

			count++;
		}

		scan.close();

	}

}
