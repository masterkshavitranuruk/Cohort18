package day14_String;

public class LengthOfString {

	public static void main(String[] args) {
  // Returns number of character in the string
        
        String str = ""; // 0
        String str2 = "JAVA"; // 4
        String str3 = "TechCircle";//10
        
        System.out.println(str.length()); // 0
        System.out.println(str2.length());// 4
        System.out.println(str3.length());// 10
        
        
        String longString = "TestTestTestTestTestTestTestTestTestTestTestTestTest";
        
        System.out.println(longString.length());//52		

	}

}
