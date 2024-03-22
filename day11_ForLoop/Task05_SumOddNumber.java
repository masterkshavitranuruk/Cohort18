package day11_ForLoop;

public class Task05_SumOddNumber {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			int num = i;
			if (num % 2 != 0) {
				sum += num;
			}
		}
		System.out.println(sum);
	}

}
