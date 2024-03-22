package day24_ArrayReview;

import java.util.Arrays;

public class CodingBat1 {

	public static void main(String[] args) {
// Given an int array length 2, return true if it contains a 2 or a 3.
//has23([2, 5]) → true
//has23([4, 3]) → true
//has23([4, 5]) → false
//	

		int arr[] = { 240, 35 };
		System.out.println(Arrays.toString(arr));// Be aware of string conversion
		System.out.println(arr[1]);

		if (arr[0] == 2 || arr[0] == 3) {
			System.out.println("true");
		} else if (arr[1] == 2 || arr[1] == 3) {
			System.out.println("true");
		} else {

			System.out.println("false");
		}
//----------------------------------Leng--------------------------------------
	    // test data
//	    int[] arr1 = {2, 5};
//	        int[] arr1 = {4, 3};
	    int[] arr1 = {24, 35};
	    boolean result = false;

	    // logic
	    int first = arr1[0];
	    int second = arr1[1];

	    if ((first == 2 || first == 3) || (second == 2 || second == 3)) {
	      result = true;
	    }
	    // result

	    System.out.println(result);	
//---------------------------------Leng Better Code----------------------		
	    /**
	     *     Given an int array ,
	     *     return true if it contains a 2 or a 3.
	     *     has23([2, 5]) → true
	     *     has23([4, 3, 50, 100]) → true
	     *     has23([4, 5, 6, 300, -6]) → false
	     */
	    boolean results = false;

	    int[] arr2 = {4, 6, 50, 100, 0 , -89 ,3 ,30};
	    for (int n : arr2) {
	      if (n == 2 || n == 3) {
	        results = true;
	        break;
	      }
	    }

	    System.out.println(results);
	    
	    
	    
	    
	    
		
	}

}
