package day09_controlFlowStatement;

public class MultiBranchIfElse {

	public static void main(String[] args) {
/*	synstax:
		if(condition1) {
			statement1
		}else if(condition2) {
			statement2
		}else if condition3) {
			statement3
		}else {
			default value
		}
*/		

//		int age = 1;
//		if (age == 1) {
//            System.out.println("Monage");
//        }else if (age == 2) {
//            System.out.println("Tuesage");
//        }else if (age == 3) {
//            System.out.println("Wednesage");
//        }else if (age == 4) {
//            System.out.println("Thursage");
//        }else if (age == 5) {
//            System.out.println("Friage");
//        }else if (age == 6) {
//            System.out.println("Saturage");
//        }else if (age == 7) {
//            System.out.println("Sunage");
//        }else {
//            System.out.println("Invalid age of the week");
		
		int age = 75;
		if (age < 2 && age>=0) {
            System.out.println("Infancy");
        }else if (age >=2 && age <5 ) {
            System.out.println("Toddler");
        }else if (age >=5 && age < 10) {
            System.out.println("Kid");
        }else if (age >=10 && age < 13) {
            System.out.println("Pre-Teen");
        }else if (age >=13 && age < 18) {
            System.out.println("Teenager");
        }else if (age >=18 && age < 20) {
            System.out.println("Young Adult");
        }else if (age >=20 && age < 40) {
            System.out.println("Adulthood");
        }else if (age >=40 && age < 50) {
            System.out.println("Middle Adulthood");
        }else if (age >=50 && age < 55) {
            System.out.println("Middle-Aged Adulthood");   
        }else if (age >=55 && age < 65) {
            System.out.println("Very Young Senior Citizen");   
        }else if (age >=65 && age < 75) {
            System.out.println("Young Senior Citizen");    
        }else if (age >=75 && age < 85) {
            System.out.println("Senior Citizen");     
        }else if (age >=85 ) {
            System.out.println("Old Senior Citizen");    
        }else {
            System.out.println("Invalid Age");                 
        }
	
	}

}
