package day14_String;

public class TrimString {

	public static void main(String[] args) {
		
// The trim() method removes white space at both ends
// does not affect whited space in the middle
// Syntax:public String trim()		
		
		
//		               012345678910
		 String str = "   hello    ";
	        System.out.println(str.length());//12
	        System.out.println(str);//   hello    
	        str = str.trim();
	        System.out.println(str.length());//5 after trim
	        System.out.println(str);//hello
	        
	        
	        String str2 = "   Hi bob    ";
	        System.out.println(str2);
	        
	        str2 = str2.trim();
	        System.out.println(str2);//Hi bob
	}
}
