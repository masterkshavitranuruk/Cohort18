package day31accessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class Task09UniqueName {

	public static void main(String[] args) {
//		Write a program that find the unique names from an arraylist of string
//		input:[Liam,Olivia,Emma,Sophia,James,Henry,Olivia,Emma,Sophia,James,Henry]
//		output =[Liam,Olivia,Emma,Sophia,James,Henry]

		ArrayList<String> name = new ArrayList<>(Arrays.asList("Liam", "Olivia", "Emma", "Sophia", "James", "Henry",
				"Olivia", "Emma", "Sophia", "James", "Henry"));

		
		
		System.out.println(uniqueName(name));
			
		
	

	}
		
	public static ArrayList<String> uniqueName(ArrayList<String> name) {
		
		ArrayList<String> arr2 = new ArrayList<>();
	
		for (String input : name) {
			System.out.println(input);
			
			System.out.println("_______________");
			
			for(int i=0; i< arr2.size();i++) {
		
				if(input.equals(name.get(i))){
				arr2.add(input);
//
			}
//		}
		
		
		
    }
	
	
		
		}
		return arr2;
		
	}
	
}
			
	

