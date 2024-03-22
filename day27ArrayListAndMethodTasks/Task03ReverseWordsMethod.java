package day27ArrayListAndMethodTasks;

public class Task03ReverseWordsMethod {

	public static void main(String[] args) {
//	    Task: Reverse Words in a Sentence
//	    Write a method that reverses each word in a sentence while keeping the order of words the same.
//	    Input:
//	    Sentence: "Hello world! This is a test."
//	    Output:
//	    Reversed Sentence: "olleH dlrow! sihT si a tset.		// TODO Auto-generated method stub

//	    Logic
//	    1. Split by space
//	    2. reverse each element of the array
//	    3. concat each word with space.
	    

	        String input = "Hello world! This is a test";

	        System.out.println(reverseSentence(input));
	        
	        input = "Write a method that reverses each word in a sentence while keeping the order of words the same";
	        System.out.println(reverseSentence(input));

	    }
	    
	    
	    
	    
	    
	    
	    public static String reverse(String str) {
	        StringBuilder sb = new StringBuilder(str);
	        return sb.reverse().toString();
	    }
	    
	    
	    public static String reverseSentence(String input) {
	        String output = "";
//	        Logic
//	        1. Split by space
	        String arr[] = input.split(" ");
//	        2. reverse each element of the array
	        for (String word : arr) {
//	            System.out.println(word);
//	            3. concat each word with space.
//	            System.out.println(reverse(word));
	            output = output + reverse(word)+" ";
	        }
	        //System.out.println(output.trim());
	        return output.trim();
	    
	    
	    
	    

		
	
	
	
	
	}

}
