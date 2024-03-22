package day11_ForLoop;

public class ForLopDemo {

	public static void main(String[] args) {
        //When you know exactly how many times you want to loop through a block of code, 
//      use the for loop instead of a while loop:
      
//      syntax:
//          for (variable ; condition ; increment or decrement) {
//              // code block
//          }
      
      
      
//      for (statement 1; statement 2; statement 3) {
//            // code block to be executed
//          }
      
      
//      Statement 1 is executed (one time) before the execution of the code block.
//
//      Statement 2 defines the condition for executing the code block.
//
//      Statement 3 is executed (every time) after the code block has been executed.
      
//      count 1 to 5
      
      for (int num = 1; num <= 5 ; num++) {
          System.out.println(num);
      }
      
      int count = 1;
      
      while(count <= 5) {
          System.out.println(count);
          count++;
      }
      
      // fr loop
      System.out.println("------------------------");
		for(int num =20; num<=30; num++) {
			System.out.println(num);
		}
		
		//while loop
		int counts = 20;
		while(counts <=30) {
			System.out.println(counts);
			counts++;
		}
		
		// do while loop
		int i = 20;
		do {
			System.out.println(i);
			i++;
		}while (i<31);
		
		
		
	}

}
