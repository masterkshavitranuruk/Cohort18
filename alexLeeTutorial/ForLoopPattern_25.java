package alexLeeTutorial;

import java.util.Scanner;

public class ForLoopPattern_25 {

	public static void main(String[] args) {
		
//		for(int i =0; i<3; i++) {  
//			for(int j=0; j<2; j++) {
//				System.out.print("*");
				
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		
		System.out.println("How many stars would you like?");
		Scanner scan = new Scanner(System.in);
		int numOfStar = scan.nextInt();
		
		
		for(int i =1; i<=numOfStar; i++) {//row  
			for(int j=0; j<i; j++) {//column
			System.out.print("*");// print ---> print same line
			}				
			System.out.println();// println---> print in new line
		}
	
		for(int i =numOfStar-1; i>0; i--) {  
			for(int j=0; j<i; j++) {
			System.out.print("*");
			}				
			System.out.println();
		}
		
		scan.close();
	
	}

}
