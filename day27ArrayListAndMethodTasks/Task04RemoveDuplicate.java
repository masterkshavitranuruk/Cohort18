package day27ArrayListAndMethodTasks;

import java.util.Arrays;

public class Task04RemoveDuplicate {

	public static void main(String[] args) {
//	    Task: Remove Duplicates from ArrayList
//	    Write a method that removes duplicate elements from an ArrayList while preserving the original order.

//	    Input:
//	    ArrayList: //    Task: Remove Duplicates from ArrayList
//	    Write a method that removes duplicate elements from an ArrayList while preserving the original order.
		//
//		    Input:
//		    ArrayList: [1, 2, 3, 2, 4, 5, 3, 6, 7, 7]
		//
//		    Output:
//		    ArrayList after removing duplicates: [1, 2, 3, 4, 5, 6, 7]
	//
//	    Output:
//	    ArrayList after removing duplicates: [1, 2, 3, 4, 5, 6, 7]
	
//1.sort
//
	
	
	int input[] = {1, 2, 3, 2, 4, 5, 3, 6, 7, 7};
	Arrays.sort(input);                        
											//    0  1  2  3  4  5  6  7  8  9
	System.out.println(Arrays.toString(input));//[1, 2, 2, 3, 3, 4, 5, 6, 7, 7]
	
	for(int i=0;i<input.length;i++) {
		if (input[i]==input[i+1]) {
									// remove input
		}else if(input[i]==input[i+1]) {
			
		}
		
		
	}
	
	
	}

}
