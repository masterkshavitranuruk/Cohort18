package day09_controlFlowStatement;

public class Task1 {

	public static void main(String[] args) {
		double n1 = -1, n2 = 4.5, n3 = -5.3;

		if (n1 > n2 && n1 > n3) {
			System.out.println("n1 is the largest");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("n2 is the largest");
		} else if (n3 > n1 && n3 > n2) {
			System.out.println("n3 is the largest");
		}
	}

	}


