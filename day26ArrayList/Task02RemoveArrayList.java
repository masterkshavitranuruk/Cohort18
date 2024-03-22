package day26ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

import day25MethodReturnValue.PrintUtils;

public class Task02RemoveArrayList {

	public static void main(String[] args) {

//      Task: Remove Element from ArrayList
//      Input: 5 10 15 20 
//      Element to remove is 15
//      output: 5 10 20

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList(5, 10, 15, 20));
		list1.remove(2);
		System.out.println(list1);//[5, 10, 20]

		
		
//       Task: Search Element in ArrayList
//       Input: 10
//       output: found

		PrintUtils.printlongline();
		for (Integer num : list1) {
			if (num == 10) {
				System.out.println("Found");
			}

		}

	}

}
