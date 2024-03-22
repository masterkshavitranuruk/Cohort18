package day14_String;

public class SubStringString {

	public static void main(String[] args) {
		
// substring
//String subs =word.substring(i,k);
//    returns the substring of chars in positions from i to k-1 !!!		
//String subs =word.substring(i);	
//    returns the substring of chars in positions from i to the end
		
				   //0123456789
		String str ="television";
		System.out.println(str.substring(2,5));//lev
		System.out.println(str.substring(4));//vision
//		                0123456789
		String email = "test@gmail.com;";
		String domainName = email.substring(5,10);//gmail
		System.out.println(domainName);//
// Find the correct domain name more dynamic using the following code	
//		email = "technicle@techcirclesolutions.org";
//		email = "techcircle@github.com";

//               012345678910
		email = "abc@aws.com";
        
        int indexOfAt = email.indexOf('@');
        System.out.println(indexOfAt);//3
        
        int indexOfDot = email.indexOf('.');
        System.out.println(indexOfDot);//7
        
        domainName = email.substring(indexOfAt + 1, indexOfDot);//substring(begin , end)
        
        System.out.println(domainName);//aws
		
		
	}

}


