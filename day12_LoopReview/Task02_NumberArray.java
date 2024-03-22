package day12_LoopReview;

import java.util.ArrayList;

public class Task02_NumberArray {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			int number = i;
			numList.add(number);
		}

		System.out.println(numList);
	}

}
