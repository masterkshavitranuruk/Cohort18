package day07_ControlFlowStatement;

public class Calculator {

	public static void main(String[] args) {

		int a = 8;
		int b = 3;
		double total =0;
		String operator = "+";

		if (operator == "*") {
			total = a*b;
			System.out.println(" The result of a and b is " +total);
			}if (operator == "+") {
				total = a+b;
				System.out.println(" The result of a and b is " +total);
				}if (operator == "-") {
					total = a-b;
					System.out.println(" The result of a and b is " +total);
					}if (operator == "/") {
						total = a/b;
						System.out.println(" The result of a and b is " +total);
						
					}
	
	}

}
