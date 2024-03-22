package day30Constructor;

public class Calculator {
//  Define a class named Calculator with the following instance variables:
//  operand1 (double)
//  operand2 (double)
//  Include instance methods for basic arithmetic operations like addition, subtraction, multiplication, and division.
//  Test the class by creating an object of Calculator, setting values for operands, performing operations, and printing the results.

//Create no argument constructor for calculator class and assign default value for both operand1 and operand2	

// No-argument constructor with default values
    public Calculator() {
    	System.out.println("This is no argument constructor of Calculator class");
    	
        this.operand1 = 1; // Default value for operand1
        this.operand2 = 1; // Default value for operand2
	
    }
	
//instance variables:
	
double operand1;
double operand2;
	
//instance methods
public double addition() {
    return operand1 + operand2;
}

public double subtraction() {
    return operand1 - operand2;
}

public double multiplication() {
    return operand1 * operand2;
}

public double division() {
    return operand1 /operand2;
}

public void printResult() {
	System.out.println( " --------------------------------------------");
	System.out.println( " Operand1 is " +operand1);
	System.out.println( " Operand2 is"+ operand2);
//	System.out.println( " Addition is "+ addition(operand1, operand1));
	
	System.out.println( " --------------------------------------------");
	
	
}		
	
	
	
	
	
	
}
