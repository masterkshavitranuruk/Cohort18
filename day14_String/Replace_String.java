package day14_String;

public class Replace_String {

	public static void main(String[] args) {
		
// The replace() method searches a string for a specified character, 
// and returns a new string where the specified character(s) are replaced.
		
//Syntax: public String replace(char searchChar, char newChar)
//Parameter Values
//searchChar	A char, representing the character that will be replaced by the new character
//newChar	A char, representing the character to replace the searchChar with
		
		
		String str = "Car";
        String str2 = str.replace('r', 't');
        System.out.println(str2);//Cat
        
        
        String str3 = "Former Democratic National Committee chair Donna Brazile conceded that Fulton County DA Fani Willis showed bad judgment";
        
        System.out.println(str3);
        
        str3 = str3.replace('s', '$');
        
        System.out.println(str3);
        
        str3 = str3.replace("Donna Brazile", "Shafkat Ali");
        
        System.out.println(str3);
	}

}
