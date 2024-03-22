package day11_ForLoop;

import java.util.Scanner;

public class Task06_ {
	public static void main(String[] args) {
		/*
		●valid browsers: chrome, firefox, opera, safari, edge, ie
		String str = "chrome"
		Output: CHROME BROWSER IS SELECTED
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your browser in lower case");
		String str = scan.next();
	    if(str.equals("chrome")) {
	    	System.out.println("CHORME BROSER IS SELECTED.");
	    }else if(str.equals("firefox")) {
	    	System.out.println("FIREFOX BROSER IS SELECTED.");
	    }else if(str.equals("opera")) {
	    	System.out.println("OPERA BROSER IS SELECTED.");
	    }else if(str.equals("safari")) {
		    System.out.println("SAFARI BROSER IS SELECTED.");
	    }else if(str.equals("edge")) {
		    System.out.println("EDGE BROSER IS SELECTED.");
	    }else if(str.equals("ie")) {
		    System.out.println("IE BROSER IS SELECTED.");
	    }else {
	    	 System.out.println("Not Valid BROSER IS SELECTED.");
	    }
	    scan.close();
	}
}

//////////Better CODE
//String txt = "chrome";
//
//switch (txt) {
//    case "chrome":
//        System.out.println("Chrome is Selected");
//        break;
//    case "firefox":
//        System.out.println("Firefox is Selected");
//        break;
//    case "opera":
//        System.out.println("Opera is Selected");
//        break;
//    case "safari":
//        System.out.println("Safari is Selected");
//        break;
//    case "edge":
//        System.out.println("Edge is Selected");
//        break;
//    case "ie":
//        System.out.println("Ie is Selected");
//        break;
//        default:
//            System.out.println("Invlaid");
//        
//}
//
