package day11_ForLoop;

import java.util.Scanner;

public class Task08_SumTriangleAngle {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter first angle in degree. ");
	int a = scan.nextInt();
	System.out.println("Please enter second angle in degree. ");
	int b = scan.nextInt();
	System.out.println("Please enter third angle in degree. ");
	int c = scan.nextInt();
	
	if(a+b+c ==180) {
		System.out.println("This is valid triangle because of sum of all three angles equal to 180 degrees");
		
	}else {
	System.out.println("This is invalid triangle ");
	}
	scan.close();

	}

}
