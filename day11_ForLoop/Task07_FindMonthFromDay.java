package day11_ForLoop;

import java.util.Scanner;

public class Task07_FindMonthFromDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter Month ");
		String str = scan.next();
		
		switch(str) {
		case "January":
		System.out.println("31 days in January.");
		break;
		default:
		}
		
		if (str.equals("January")) {
            System.out.println("This month has 31 days");
        }
        	
		
//	   	if(str.equals("January")) {
//	    	System.out.println("31 days in January.");
//	    }else if(str.equals("Febuary")) {
//	    	System.out.println("28/29 days in Febuary. ");
//	    }else if(str.equals("March")) {
//	    	System.out.println("31 days in March.");
//	    }else if(str.equals("April")) {
//		    System.out.println("30 days in April.");
//	    }else if(str.equals("May")) {
//		    System.out.println("31 days in May.");
//	    }else if(str.equals("June")) {
//		    System.out.println("30 days in June.");
//	    }else if(str.equals("July")) {
//		    System.out.println("31 days in July.");
//	    }else if(str.equals("August")) {
//		    System.out.println("31 days in August.");
//	    }else if(str.equals("September")) {
//		    System.out.println("30 days in September.");
//	    }else if(str.equals("October")) {
//		    System.out.println("31 days in October.");
//	    }else if(str.equals("November")) {
//		    System.out.println("30 days in November.");
//	    }else if(str.equals("December")) {
//		    System.out.println("31 days in December.");
//	    
//	    }else {
//	    	 System.out.println("Not Valid Month is inputed.");
//	    }
	    scan.close();

	}

}
