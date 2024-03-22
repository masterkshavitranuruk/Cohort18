package day26ArrayList;

import java.util.Arrays;

public class PasswordValidation {

	public static void main(String[] args) {
 /*
	    Write a program that can verify if a password is a strong password. 
	    Characteristics of strong passwords are: 
	    1.1 Password must be at least have 8 characters long and should not contain space 
	    1.2 PassWord should at least contain one upper case letter 
	    1.3 PassWord should at least contain one lower case letter 
	    1.4 Password should at least contain one special characters 
	    1.5 Password should at least contain a digit
*/
	   	        
	        String password = "Abcd1234!"; 
	        boolean has8charNoSpace = password.length() >= 8 && !password.contains(" ");
	        boolean hasUpperCase = false;
	        boolean hasLowerCase = false;
	        boolean hasSpecialChar = false;
	        boolean hasDigit = false;
	        boolean isStrongPassword = false;

	        for (char c : password.toCharArray()) {
	            if (Character.isUpperCase(c)) {
	                hasUpperCase = true;
	            }
	            if (Character.isLowerCase(c)) {
	                hasLowerCase = true;
	            }
	            if (!Character.isLetter(c) && !Character.isDigit(c)) {
	                hasSpecialChar = true;
	            }
	            if (Character.isDigit(c)) {
	                hasDigit = true;
	            }
	        }

	        isStrongPassword = has8charNoSpace && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

	        if (isStrongPassword) {
	            System.out.println("Strong password");
	        } else {
	            System.out.println("Weak password");
	        }



	        
//	 	    int passwordLength = password.length();
//	        char letter = password.charAt(7);
//	             
//	        for(int i =0; i <passwordLength;i++) {
//	        	
//	        	if(password.length() >= 8) {
//	        	
//	        }
	        
//	        System.out.println(Character.isUpperCase(letter));
//	        System.out.println(Character.isLowerCase(letter));
//	        System.out.println(Character.isDigit(password.charAt(5)));
//	        System.out.println(!password.contains(" "));
//	        System.out.println(password.length() >= 8);
//	        System.out.println(!Character.isLetter(letter) && !Character.isDigit(letter));	        
	        
	        
	        
//	        char chars[] = password.toCharArray();
//	        System.out.println(Arrays.toString(chars));
//	        int passwordLength = password.length();
//	       
//	        for(char test1:chars) {
//	        	if(test1 ==' ' || passwordLength >=8) {
//	        		System.out.println("pass condition 1");
////	        		}else if () {
//	        		System.out.println(test1.contains(" "));
//	        	}
//	        	
//	        }


	}

}
