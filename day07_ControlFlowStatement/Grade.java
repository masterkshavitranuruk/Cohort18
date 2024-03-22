package day07_ControlFlowStatement;

public class Grade {

	public static void main(String[] args) {
		int score = 79;
		char grade = ' ';
		boolean isValidScore = false;
//		Compound Boolean Expression
		if (score > 0 && score < 100) {
			isValidScore = true;

//		Nested Statements
			if (score >= 90 && score <= 100) {
				grade = 'A';

			}
			if (score >= 80 && score < 90) {
				grade = 'B';

			}
			if (score >= 70 && score < 80) {
				grade = 'C';
			}

			if (score >= 60 && score < 70) {
				grade = 'D';
			}
			if (score < 60) {
				grade = 'F';
			}

		} else {
			System.out.println("Invalid Score");
		}
		if (isValidScore) {
			System.out.println("Your score of " + score + " is " + grade);
		}

	}

}
