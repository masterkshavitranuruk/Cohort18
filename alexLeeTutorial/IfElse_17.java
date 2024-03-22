package alexLeeTutorial;

import java.util.Scanner;

public class IfElse_17 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("entera grade");

			int n = scan.nextInt();

			if (n > 90 && n <= 100) {
				System.out.println("Grade A");
			}
			else if (n >= 80 && n < 90) {
				System.out.println("Grade B");
			}
			else if (n >= 70 && n < 80) {
				System.out.println("Grade C");
			}
			else if (n >= 60 && n < 70) {
				System.out.println("Grade D");
			}
			else if (n >= 0 && n < 60) {
				System.out.println("Grade F");
			} else {
				System.out.println("The number you entered is not in the range");
			}
		}

	}

}
