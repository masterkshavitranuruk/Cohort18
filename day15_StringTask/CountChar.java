package day15_StringTask;

public class CountChar {

	public static void main(String[] args) {
//Count Characters: Create a function to count the occurrences of a specific character in a string without using arrays or collections.
 
		String str  ="apple";
		int count =0;
		for(int i=0;i<str.length();i++) {
		
			if(str.charAt(i)=='p'){
				count++;
			}
			
		}
		System.out.println(count);	
	}

}
