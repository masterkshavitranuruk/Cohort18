package day16_stringReview;

public class FindInitial {

	public static void main(String[] args) {
	//Leng Bob ---> LB
	// Martha Johns --> MJ
		
		//first char
		//the one after the space
		
		String s1 = "Tech Circle";
		char firstChar = s1.charAt(0);
		char secondChar = s1.charAt(s1.indexOf(" ")+1);
		System.out.println(s1+ "initial is: " + firstChar +secondChar); 
		
		
		
	}

}
