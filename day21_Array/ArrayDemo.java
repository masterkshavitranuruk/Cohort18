package day21_Array;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
//		dataType variableName = value; 
// Syntax dataType[] arrayRefVar; // preferred way
//	or  dataType arrayRefVar[];   // works but not preferred     

		int num1 =5;
		int num2 =45;
		int num3 =50;
		int num4 =15;
		int num5 =-5;
	
		int[] arr1 = new int[5] ;
//		int arr2[];
		System.out.println(Arrays.toString(arr1));//[0, 0, 0, 0, 0]		
		arr1[0]= num5;
		arr1[1]= num4;
		arr1[2]= num2;
		arr1[3]= num1;
		arr1[4]= num3;
		System.out.println(Arrays.toString(arr1));//[-5, 15, 45, 5, 50]
//--------------------------------------------------------
		
		String fruits[] = new String[6];//             0		1   2    3      4    5
		System.out.println(Arrays.toString(fruits));//[null, null, null, null, null, null]
//                                                  //[null, null, mango, null, null, null]            		
		fruits[2] = "mango";
//		System.out.println(Arrays.toString(fruits));
		fruits[3] ="orange";
		fruits[4] ="apples";
		fruits[5] ="kiwis";
		fruits[0] = "grapes";
		fruits[1] = "bananas";
		System.out.println(Arrays.toString(fruits));
		
// Declaring and initializing arrays in one line		
		
		String[] months = {"January", "February", "March"};
		
		int [] nums = {1, 2,3,4,5};
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
