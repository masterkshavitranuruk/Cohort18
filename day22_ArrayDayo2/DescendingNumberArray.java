package day22_ArrayDayo2;

import java.util.Arrays;

public class DescendingNumberArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		System.out.println(Arrays.toString(arr));

		int arr1[] = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			arr1[i] = arr[arr.length - i - 1];
		}
		System.out.println(Arrays.toString(arr1));

//--------------------------------   IRFAN   ----------------------------------//

		/*
		 * Write a program that sort the array of integer in descending order
		 * 
		 * 
		 * example: array[] = {1,2,3,4,5}; output: array[] = {5,4,3,2,1}
		 */

		int array[] = { 2, 1, 4, 5, 6, 0 };
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

//        int arr2[] = new int[6];
		int arr2[] = new int[array.length];

//                    0  1  2  3  4  5  --> index
//            array     = [0, 1, 2, 4, 5, 6]
//            arr2 = [0, 0, 0, 0, 0, 0]

		System.out.println(Arrays.toString(arr2));
		
		int index = 0;
		for (int i = 5; i >= 0; i--) {
			arr2[index] = array[i];
			index++;

		}

//        arr2[0] = array[6-1];
//        
//        System.out.println(arr2[0]);
		System.out.println(Arrays.toString(arr2));
//
//        
//        arr2[1] = array[6-2];
//        
//        System.out.println(arr2[1]);
//        System.out.println(Arrays.toString(arr2));
//        

	}

}
