package day24_ArrayReview;

import java.util.Arrays;

import day25MethodReturnValue.PrintUtils;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// initialize
	    int[][] nums = {
	    //j=   0  1  2  3    //i=  
	          {1, 2, 3},     // 0
	          {4, 5, 6},     // 1
	          {7, 8, 9, 0}   // 2
	    };

	    System.out.println(nums[1][2]);//6
	    nums[1][2] = 16;

	    System.out.println(Arrays.deepToString(nums));//[[1, 2, 3], [4, 5, 16], [7, 8, 9, 0]]

	    //                   [row][column]
	    int[][] nums2 = new int[3][4];
	    System.out.println(Arrays.deepToString(nums2));//[[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

	  // to loop / access all members inside the 2D array
	    for (int i = 0; i < nums.length; i++) {
	      System.out.println(Arrays.toString(nums[i]));//iteration 1 [1, 2, 3] iteration 2 [4, 5, 16]
//	      PrintUtils.printlongline();   				// iteration 3 [7, 8, 9, 0]
	      for (int j = 0; j < nums[i].length; j++) {
	        System.out.print(nums[i][j] + ".");//1.2.3.4.5.16.7.8.9.0.
	      }
	    }




	}

}
