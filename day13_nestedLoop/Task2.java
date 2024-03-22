package day13_nestedLoop;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        System.out.println("Star count:");
        int starCount = scan.nextInt();
        for (int j = 1 ; j <= starCount ; j++) {
            for (int i = 1 ; i <= j ; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        scan.close();
	}

}
