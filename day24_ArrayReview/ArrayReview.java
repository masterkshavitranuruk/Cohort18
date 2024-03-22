package day24_ArrayReview;

import java.util.Arrays;

public class ArrayReview {

	public static void main(String[] args) {
		 // index 0 base    0    1    2
	    char[] letters = {'A', 'B', 'C' /* can have as many as you'd like*/};

	    // to read array , access
	    char bLetter = letters[1];

	    System.out.println("Index 1 of letters array is: " + bLetter);//B

	    // java array - fixed size
	    int[] numbers = new int[10];
//	    numbers = new int[100]; // but you can reassign it with new data

	    // to write to array
	    numbers[2] = 345;
	    numbers[8] = 34;

	    System.out.println(numbers);//[I@63961c42
	    // Static method from Arrays class
	    // .toString() to convert all the data in array to string
	    System.out.println(Arrays.toString(numbers));//[0, 0, 345, 0, 0, 0, 0, 0, 34, 0]

	    // array property
	    // length - return how many member in the array
	    System.out.println("Size of 'numbers' array: " + numbers.length);//Size of 'numbers' array: 10

	    // to loop thru array
	    for (int i = 0; i < numbers.length; i++) {
	      System.out.println(i + " element = " + numbers[i]);
	    }
	    System.out.println("======");

	    // loop array backward
	    for (int i = numbers.length - 1; i >= 0; i--) {
	      System.out.println(i + " element = " + numbers[i]);
	    }

	    // for each loop, cannot access the index
	    // it only goes forward
	    System.out.println("== for each loop ==");
	    for (int num: numbers) {
//	      if (/*index == 5*/)
	      System.out.println(num);
	    }


	}

}
