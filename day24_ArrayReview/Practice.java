package day24_ArrayReview;

import java.util.Arrays;
import java.util.Random;

public class Practice {

	public static void main(String[] args) {
		/**
		 *
		 * Given 2 int arrays, a and b, each length 3, return a new array length 2
		 * containing their middle elements.
		 * 
		 * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5] middleWay([7, 7, 7], [3, 8, 0]) →
		 * [7, 8] middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
		 */

		int[][] nums = {
				// j= 0 1 2 //i=
				{ 7, 3, 7 }, // 0
				{ 1, 4, 5 }, // 1
		};

		int first = nums[0][1];
		int second = nums[1][1];
		int[] numbers = new int[2];
		numbers[0] = first;
		numbers[1] = second;
		System.out.println(Arrays.toString(numbers));

	

	int[] arr1 = createRandomArray(3, 10);
	int[] arr2 = createRandomArray(3, 10);

	System.out.println("Array 1: "+Arrays.toString(arr1));System.out.println("Array 2: "+Arrays.toString(arr2));
//	    int[] resultArr = new int[2];
//	    resultArr[0] = arr1[1];
//	    resultArr[1] = arr2[1];
	int[] resultArr = { arr1[1], arr2[1] };System.out.println("Result: "+Arrays.toString(resultArr));
	}

// write Method to create random int array

	public static int[] createRandomArray(int size, int bound) {
		Random rd = new Random();
		int[] arr1 = new int[size];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = rd.nextInt(bound);
		}
		return arr1;

	}

}
