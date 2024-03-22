package day09_controlFlowStatement;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Select a snack!!!");
		System.out.println("1. Chip =$1.50");
		System.out.println("2. Chocolate $2.50");
		System.out.println("3. Cookie $1.25");
		System.out.println("4. Soda $1.50");
		System.out.println("5. Exit");

		int choice = scan.nextInt();

		switch (choice) {
		case 1:
			System.out.println("You selected Chip $1.50");
			break;

		case 2:
			System.out.println("You selected Chocolate $2.50");
			break;
		case 3:
			System.out.println("You selected Cookie $1.25");
			break;
		case 4:
			System.out.println("You selected Soda $1.50");
			break;
		case 5:
			System.out.println("Exitting   Thank You.");
			break;
		default:
			System.out.println("Invalid Selection !!");
		}

		scan.close();

	}

}
