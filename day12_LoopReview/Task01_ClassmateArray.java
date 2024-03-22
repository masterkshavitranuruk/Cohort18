package day12_LoopReview;

public class Task01_ClassmateArray {

	public static void main(String[] args) {
		
//		ARRAY ,a data structure,stores a fixed-size 
//		sequential collection of elements (variable) of the same type	
		String classMateNames[] = new String[10];
		classMateNames[0] = "Master Shavitranuruk";
		classMateNames[1] = "Yucy Lui";
		classMateNames[2] = "Yucy Lui";
		classMateNames[3] = "Yucy Lui";
		classMateNames[4] = "Yucy Lui";
		classMateNames[5] = "Yucy Lui";
		classMateNames[6] = "Yucy Lui";
		classMateNames[7] = "Yucy Lui";
		classMateNames[8] = "Yucy Lui";
		classMateNames[9] = "Yucy Lui";
		
		for(String names:classMateNames) {
		System.out.println(names.charAt(0)+".");
		}
	
	}

}
