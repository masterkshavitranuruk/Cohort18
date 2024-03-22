package day21_Array;

import java.util.Arrays;

public class ReadArrayElement {

	public static void main(String[] args) {
//                           0           1         2         3		
		String[] months = {"January", "February", "March", "April"};
		System.out.println(Arrays.toString(months));// read all elements
		System.out.println(months);// read position [Ljava.lang.String;@5acf9800
		System.out.println(months[1]);//January
		
		months[1]= "August";// Replace element[2] by new element
		System.out.println(months[1]);//August
		
				
		int [] nums = {1, 2,3,4,5};
		System.out.println(nums[1]+nums[3]);// 6
		
		boolean arr[] = {true, false, true};
		char chars[] = {'a', 'b', 'c', 'd'};
		double prices[] = {9.99, 10.6, 2.31};	
		System.out.println(Arrays.toString(months));
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(chars));
		System.out.println(Arrays.toString(prices));
		
		
		
		
		
		

	}

}
