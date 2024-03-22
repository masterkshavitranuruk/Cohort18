package day06_Operators;

public class Arithmetic {

	public static void main(String[] args) {
//      Arithmetic operators: + , - , * , / , % , ++ , -- 
        
      int numA = 5; 
      int numB = 3;
      int numC = 2;
//                           5     3
      System.out.println(numA + numB); // 8
      
      System.out.println(numA + numB + numC); // 
      
      System.out.println(40 + 90 + numA); // 135
      
      
      // subtraction - 
      System.out.println(numA - numB); // 2
      
      
      
      System.out.println(numA * numB); // 15
      
//                          5   /  2
      System.out.println(numA / numC); // 
      
      
      double result = numA / 2.0;
      
      System.out.println(result);
      
      
      System.out.println(10.0 / 3);
      
      System.out.println(10 % 3); // (3 + 3 + 3 + 1)
      
      System.out.println(10 % 2);
      
      System.out.println(10.0 / 4); // (4 + 4 + 2)
      System.out.println(10 % 4);
      
      
      // even number 2, 4, 6, 8, 10 .....90
      // odd number 1,3,5,7,9,11,........91
      
      System.out.println(6 % 2);
      
      System.out.println(7 % 2);
      
      
      // increment ++
      
      numA = 10;
      System.out.println(numA);
      
      numA = numA + 1;
      
      System.out.println(numA);
      
      numA++; // numA = numA + 1;
      
      System.out.println(numA); //12
      
      numA++;
      numA++;
      numA++;
      
      System.out.println(numA); // 15
      
      numB = 5;
      
      numB++;
      System.out.println(numB);
      numB++;
      numB++;
      numB++;
      numB++;
      System.out.println(numB);//10
      
      // decrement operator --
      
      numB = numB -1; 
      System.out.println(numB); //9
      
      numB--;
      System.out.println(numB); // 8
      
      numB--;
      numB--;
      numB--;
      numB--;
      
      System.out.println(numB); // 4
      
      numB--;
      numB--;
      numB--;
      numB--;
      
      System.out.println(numB);
      
      numB--;
      numB--;
      numB--;
      numB--;
      
      System.out.println(numB);
      
  


	}

}
