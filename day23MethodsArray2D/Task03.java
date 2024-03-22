package day23MethodsArray2D;

public class Task03 {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 7, 8, 9, 10 };
		Task03.printArray(arr1);
		Task03.printArray(arr2);

	}

//  Write a method named printArray that takes an integer array as a parameter 
//  and prints each element of the array. 
//  Then, call this method with different integer arrays as arguments.

	public static void printArray(int arr[]) {
		for (int num : arr) {
			System.out.println(num);
		}

	}

}
