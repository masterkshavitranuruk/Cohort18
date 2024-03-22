package day27ArrayListAndMethodTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task01 {

	public static void main(String[] args) {

		int arr[] = {5,105,3,8,15,33,54};
		System.out.println(Max(arr));
		ArrayList<String> fruits = new ArrayList<> (Arrays.asList("apple", "banana", "orange", "grape"));
//		System.out.println(search(fruits));

		String sentence = "Hello world! This is a test.";
		
		 String text = sentence;
         String arr1[] = text.split(" ");
	     System.out.println(Arrays.toString(arr1));
	     String arr3[]= new String[arr1.length]; 
	         
	     for(int i =0;i<arr1.length-1;i++) {
	    	 arr3[i]= Reverse(arr1[i]);
	     }System.out.println(Arrays.toString(arr3));
	    	 
	     }
	     
	
	


	
	
	
	
//  Create a method that accepts an integer array and returns max value from the given array.

//  Input: Array of integers: {5, 10, 3, 8, 15}
//  Output: Maximum element: 15
	
	
	  public static int Max(int input[]) {  
		 
		  Arrays.sort(input);
		  int lastIndex =input.length-1;
		  int output =input[lastIndex];
		  return output;
     }
	

//    Create a method that accepts an arraylist of string, and a word to search 
//    if the word exists return the index position of the word.
//            
//    Input: ArrayList: ["apple", "banana", "orange", "grape"], Element to search: "orange"
//    Output: Index of "orange": 2
//	  
//	  public static int search(ArrayList<String> fruits) {
//		  int index  =0;
//		  for(String search:fruits) {
//					  if(search.equals("orange")) {
//						  index = fruits.indexOf("orange"); 
//		}
//					  
//	}
//		return index;
	
//	    Task: Reverse Words in a Sentence
//	    Write a method that reverses each word in a sentence while keeping the order of words the same.
	//
//	    Input:
//	    Sentence: "Hello world! This is a test."
	//
//	    Output:
//	    Reversed Sentence: "olleH dlrow! sihT si a tset."
//	    	
//		public static String ReverseSentence(String sentence) {
//	         String text = sentence;
//	         String arr[] = text.split(" ");
//		     System.out.println(Arrays.toString(arr));
//			
//			
//	         
//	         return output;
//	     }		
//		
//		
		public static String Reverse(String str) {		
		
		String output ="";
		for(int i=str.length()-1;i>=0;i--) {// reverse order for loop 
			output +=str.charAt(i);
				}
		System.out.println(output);
		return output;
		}			
		
		
		
		
		
		
		
		
		
		 
	  }
	
}
