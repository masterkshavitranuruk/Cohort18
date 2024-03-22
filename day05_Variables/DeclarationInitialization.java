package day05_Variables;

public class DeclarationInitialization {

	public static void main(String[] args) {
// 		Declaring and initialazaing value at the same line

//      DataType variableName = value
		String make = "Tesla";
		int age = 20;
		boolean result = true;
		char letter = 'c';

		System.out.println(make); // Tesla
		System.out.println(age); // 20
		System.out.println(result); // true
		System.out.println(letter); // c

//      String firstName = "TechCirlce";
//      String lastName = "School";
//      String job_title = "SDET";

		String firstName = "TechCircle", lastName = "School", job_title = "SDET";

		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(job_title);

		// Declaring Variables
		int age1, distance, pageNumber;

		// assigning value to variables
		age1 = 18;
		distance = 1000;
		pageNumber = 76;

		// printing value to console
		System.out.println(age1);
		System.out.println(distance);
		System.out.println(pageNumber);

	}

}
