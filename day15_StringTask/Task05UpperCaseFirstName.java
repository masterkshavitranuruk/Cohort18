package day15_StringTask;

public class Task05UpperCaseFirstName {

	public static void main(String[] args) {
//      Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)
//
//      input:
//          firstName = "tecHCIrcle"
//          lastName = "SCHOOL";
//
//      output:
//          Techcircle School

		String firstName = "tecHCIrcle";
        String lastName = "SCHOOL";
		
		String firstName2 = firstName.toLowerCase();
		String lastName2 =lastName.toLowerCase();
		
		
		System.out.println(firstName.substring(0,1).toUpperCase()+firstName2.substring(1)+ "  " + 
		lastName.substring(0,1).toUpperCase()+lastName2.substring(1) );//Techcircle  School

	System.out.println("__________________________________________");	
	
//Another Version
    
    String lowerCaseFirstName = firstName.toLowerCase();
    String upperCaseFirstName = firstName.toUpperCase();
    
    String lowerCaseLastName = lastName.toLowerCase();
    String upperCaseLastName = lastName.toUpperCase();
    
    String fullName = upperCaseFirstName.charAt(0)+lowerCaseFirstName.substring(1)
                       + " " + upperCaseLastName.charAt(0) + lowerCaseLastName.substring(1);
    
    System.out.println(fullName);//Techcircle  School	
		
		
	}

}
