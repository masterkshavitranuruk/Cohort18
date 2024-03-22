package day06_Operators;

public class Ternary {

	public static void main(String[] args) {
//      syntax:
//      variable = (condition) ? trueBlock : falseBlock;
  
  int a , b;
  a = 10;
  b = (a == 1) ? 20 : 30;
  System.out.println("Value of b is ");
  System.out.println("Value of b is " + b);

  b = (a == 10) ? 50 : 100;
  
  System.out.println(b);
  
  
  
  // Even or odd
  
  int num = 8;
  
  System.out.println(num % 2); // 
  
  String evenOrOdd = (num % 2 == 0) ? "Even" : "Odd";
  
  System.out.println(evenOrOdd);	
	}

}
