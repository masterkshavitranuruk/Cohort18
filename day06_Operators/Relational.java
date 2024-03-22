package day06_Operators;

public class Relational {

	public static void main(String[] args) {

	      int a = 3;
	      int b = 5;
	      int c = 10;
	      
	      // ==  (equal) , > (greater than) , < (less than) , >= (greater than equal), <= (less than equal)
	      // != (not equal)
	      
	      System.out.println(a == b); // false
	      System.out.println(c/2 == b);// true
	      
	      char letter = 'a';
	      char letter2 = 'b';
	      char letter3 = 'a';
	      
	      System.out.println(letter == letter2);//false
	      System.out.println(letter == letter3);//true
	      
	      
	      // greater than >
	      
	      System.out.println(a > b); // false
	      
	      System.out.println(a * b  > c);
	      
	      
	      // less than < 
	      
	      System.out.println(a < b);
	      
	      boolean result = a * b < c;
	      
	      System.out.println(result);
	      
	      a = 1;
	      b = 2; 
	      c = 3;
	      
	      
	      System.out.println(c- a == b);
	      
	      System.out.println(a * b < c);
	      
	      
	      
//	      greater than equal  >=, less than equal <=
	      
	      a = 10;
	      b = 5; 
	      c = 3;
//	                          
	      System.out.println(a/b <= c);
	      
	      System.out.println(a <= 10); // less than or equal
	      
	      System.out.println(a -b >= c);
	      
	      
	      // not equal !=
	      System.out.println(a != b);
	      System.out.println(a != 10);

	}

}
