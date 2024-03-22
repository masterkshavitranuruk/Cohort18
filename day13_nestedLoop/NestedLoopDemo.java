package day13_nestedLoop;

public class NestedLoopDemo {

	public static void main(String[] args) {
		// Write program to show 
		// 12345678910
		// 12345678910
		// 12345678910
		// 12345678910
		// 12345678910
//      for (int num = 1 ; num <= 10 ; num++) {
//      System.out.print(num+" ");
//  }
//  
//  System.out.println();
//  
//  
//  for (int num = 1 ; num <= 10 ; num++) {
//      System.out.print(num+" ");
//  }
//  System.out.println();
//
//  for (int num = 1 ; num <= 10 ; num++) {
//      System.out.print(num+" ");
//  }
//  System.out.println();
//
//  for (int num = 1 ; num <= 10 ; num++) {
//      System.out.print(num+" ");
//  }
//  System.out.println();
//
//  for (int num = 1 ; num <= 10 ; num++) {
//      System.out.print(num+" ");
//  }
//  System.out.println();

		
		for(int count=1;count <=5;count++) {//outer loop win run one iteration
		     System.out.print("Line num  " +count +"   "); 
			for(int i=1;i<=10;i++) {//inner loop win run full iteration
			 System.out.print(i);	
			}
		      System.out.println();
		}
		
	}

}
