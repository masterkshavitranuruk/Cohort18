package alexLeeTutorial;

public class StringMethod29 {

	public static void main(String[] args) {
// String method is a specific code doing something to Strings	

		String name = "Billy Bob Joe";
		System.out.println("Name" +name);
		System.out.println(name.toUpperCase());// String Method UpperCAse
		System.out.println(name.toLowerCase());// String Method LowerCAse
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		System.out.println(name.charAt(12));
		System.out.println(name.substring(10, 13));
		
		
		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName + lastName);
		System.out.println(firstName.concat(lastName));
		
//		Return the index (position) of the first occurrence of "e" in the following string:
		String txt = "Hello Everybody";
		System.out.println(txt.indexOf("l"));
		
		
		
		
	}

}
