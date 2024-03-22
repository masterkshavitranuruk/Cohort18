package day15_StringTask;

public class PalindromeCheck {

	public static void main(String[] args) {
/*Task2:
Check Palindrome: Implement a method to check if a given string 
is a palindrome without using arrays or collections.
01234
level, civic, hannah
*/

		String letters ="hannah";
		String output ="";
		for(int i=letters.length()-1;i>=0;i--) {
			output +=letters.charAt(i);
		}
		System.out.println(output);
		System.out.println(letters);
		if(output .equals(letters))// String1 ==String2 error 
		{System.out.println("Palindrome");
		}else {
			System.out.println("The input is not Palindrome");
		}
		
	}
}


