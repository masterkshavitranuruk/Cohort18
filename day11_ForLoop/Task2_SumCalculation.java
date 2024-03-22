package day11_ForLoop;

public class Task2_SumCalculation {

	public static void main(String[] args) {
		
//Write a program to calculate the sum of all the number between 1 to 100.
//		Output = 5050		
		
		int sum = 0;
		for(int i =1; i<=100;i++) {
		sum +=i; 
		}
        System.out.println(sum);
	}
}
