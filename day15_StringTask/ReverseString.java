package day15_StringTask;

public class ReverseString {

	public static void main(String[] args) {
//      Task1:
//		Write a Java function to reverse 
//		a given string without using any additional data structures.
//
	String input= "abcde";
	String output ="";
	for(int i=input.length()-1;i>=0;i--) {// reverse order for loop 
//		System.out.print(input.charAt(i));
		output +=input.charAt(i);

		
	}
	System.out.println(output);
		
		
		
		
		
		
		
	}

}
