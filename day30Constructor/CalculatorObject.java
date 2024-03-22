package day30Constructor;

public class CalculatorObject {

	public static void main(String[] args) {
		
		Calculator result = new Calculator();//Create calculator object
		result.operand1=3.0;
		result.operand2=1.5;
		result.printResult();
		
		System.out.println(result.addition());
		System.out.println(result.subtraction());
		System.out.println(result.multiplication());
		System.out.println(result.division());
		
		
		Calculator myCalculator = new Calculator();// We have assign any values so use the default value
		System.out.println("Operand 1: " + myCalculator.operand1);
	    System.out.println("Operand 2: " + myCalculator.operand2);
	    System.out.println(myCalculator.addition());
		System.out.println(myCalculator.subtraction());
		System.out.println(myCalculator.multiplication());
		System.out.println(myCalculator.division());

	}

}
