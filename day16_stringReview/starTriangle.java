package day16_stringReview;

public class starTriangle {

	    public static void main(String[] args) {
	    	/*
	        
	        *
	       ***
	      *****
	     *******
	    
	*/
		String shape = "*";
	    String space = " ";
	    int row = 9;

	    // create 4 row
	    for (int i = 0; i < row; i++) { // 0, 1, 2, 3

//	      space:
	      for (int j = 0; j < (row-1)-i; j++) {
	        System.out.print(space); // ___, __, _,
	      }

//	      star:
	      for (int j = 0; j < 1 + (i * 2); j++) { // 1, 3, 5, 7
	        System.out.print(shape);
	      }

	      System.out.println();
	      
//	      int n = 4;
//	        for (int i = 1; i <= n; i++) {
//	          for (int j = 1; j <= n - i; j++) {
//	            System.out.print(" ");
//	          }
//	          for (int k = 1; k <= 2 * i - 1; k++) {
//	            System.out.print("*");
//	          }
//	          System.out.println();
//	        }	      
	      
//__________________________________________________________
	      
//	      int line = 5;
//
//	        
//	        for (int i = 0; i < line; i++) {
//	          
//	            for (int j = 0; j <line - i - 1; j++) {
//	                System.out.print(" ");
//	            }
//	        
//	            for (int k = 0; k < 2 * i + 1; k++) {
//	                System.out.print("*");
//	            }
//	            
//	            System.out.println();
	        	      
	      
	      
	      

	    }

	}

}
