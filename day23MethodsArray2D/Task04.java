package day23MethodsArray2D;

import java.util.Arrays;

public class Task04 {

	public static void main(String[] args) {
		String email = "test@yahoo.com";
		DomainName(email);
	}
	
	public static void DomainName(String email) {	

	String arr[] = email.split("@");
	System.out.println(Arrays.toString(arr));
	String email2 = arr[1];
	System.out.println(email2);
	String arr1[] = email2.split("\\.");
	System.out.println(Arrays.toString(arr1));
	System.out.println("Your domain Name is   " +arr1[0]);
	}

}
