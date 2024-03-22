package day24_ArrayReview;

import java.util.Arrays;

public class StringMethodReturnArray {

	public static void main(String[] args) {
		// .toCharArray()
	    String name = "I am at techcircle";
	    char[] letters = name.toCharArray();

	    System.out.println(Arrays.toString(letters));

	    // .split()
	    String[] words = name.split(" ");
	    System.out.println(Arrays.toString(words));

	    String phoneNumber = "703.456.7890";
//	    System.out.println(Arrays.toString(phoneNumber.split("\\.")));
	    //                                     .
	    String areaCode = phoneNumber.split("\\.")[0];
	    System.out.println(
	        "Area code of " + phoneNumber + " is: " + areaCode);

	}

}
