package day14_String;

public class EmptyString {

	public static void main(String[] args) {

		String str = "";
		System.out.println(str.length());//0

		
		// Scanner scan = new Scanner(System.in);
		String str2 = new String(); // calling no argument constructor of string class
		System.out.println(str2.length());//0

		
		String str3 = " ";
		System.out.println(str3.length());//1

	}

}
