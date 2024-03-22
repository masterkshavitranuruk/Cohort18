package day22_ArrayDayo2;

public class ReverseNamesArray {

	public static void main(String[] args) {
	      /*
        Create string array, and store the names of your  class mates (10) reverse each students names and print them in separate lines
                        ex:
                            arr = {java, python, c#}
                        output:
                            avaJ
                            nohtyp
                            #c
        */
        
 //----------------------------------------------Irfan--------------------------------------------------------------------//
		
		
        String classmates[] = { "Bilal Khalid", "Bryan Chavez", "Eleonora Sheldon", "Arad Misaghi", "Malak Alselmi",
                "Flora Zurki", "Nursen Kasgarli", "Almire Abdurxit", "Khemmanij Stinebaugh", "Nazeerah Naadim" };
        
//        str = "abc"
//        reverse = "cba"
        
//        String input = "Bilal Khalid";
    
        
        
        for (String name : classmates) {
//            System.out.println(name);
            String input = name;
            String output = "";

            for (int i = input.length()-1 ; i >= 0; i--) {
                output += input.charAt(i);
            }
            System.out.println(output);
        }
 //_________________________________________MasterK Version____________________________________________________________//       

	String names[] = { "Keira","Bilal Khalid", "MasterK", "Gulfire", "Bilal", "Nazeerah", "Yancy", "Malk", "Khemmanij",
			"Almire", "Flora", "Sharifa" };

	for (int j = 0; j <= names.length - 1; j++) {
		String firstName = names[j];
		for (int i = firstName.length() - 1; i >= 0; i--) {
			char reverseName = firstName.charAt(i);
			System.out.print(reverseName);
		}
		System.out.println();
}
        
        
        
        
        
        

	}

}
