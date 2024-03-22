package day14_String;

public class EqualityString {

	public static void main(String[] args) {
		
//Compares two strings. Returns true if the strings are equal, and false if not		
//Syntax:  public boolean equals(Object anotherObject) 
		
		
		String str = "Hello";
        String str2 = "hellO";
        
        System.out.println(str.equals(str2));//false
        
        System.out.println(str.equalsIgnoreCase(str2));//true
        
        System.out.println(str.toUpperCase()); // HELLO
        System.out.println(str2.toUpperCase());// HELLO
        
        System.out.println(str.toUpperCase().equals(str2.toUpperCase()));//true

	}

}
