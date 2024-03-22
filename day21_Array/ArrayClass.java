package day21_Array;

import java.util.*;

public class ArrayClass {

	public static void main(String[] args) {
		
 // Syntax equals(array1, array2)    // checks if both the arrays are equal or not
		
		int intArr[] = {1,2,3,4};
		int intArr1[] = {1,2,3};
		int intArr2[] = {1,3,2};
		System.out.println(Arrays.equals(intArr, intArr1));// false
		System.out.println(Arrays.equals(intArr1, intArr2));// false
		
		Arrays.sort(intArr1);
		Arrays.sort(intArr2);
		System.out.println(Arrays.equals(intArr1, intArr2));// true
		
// Syntax Arrays.sort(name);
		
		int [] nums = {3, 2,1,5,4};
		System.out.println(Arrays.toString(nums));// converting location to string
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));//{1,2,3,4,5}
		
		
		
		String fruits[] = new String[6];
                                            
		fruits[0] = "grapes";
		fruits[1] = "bananas";
		fruits[2] = "mango";
		fruits[3] ="orange";
		fruits[4] ="apples";
		fruits[5] ="kiwis";
		System.out.println(Arrays.toString(fruits));//[grapes, bananas, mango, orange, apples, kiwis]
		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));//[apples, bananas, grapes, kiwis, mango, orange]
		

		
	}

}
