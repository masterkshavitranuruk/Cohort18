package day26ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

import day25MethodReturnValue.PrintUtils;

public class Task01AddElementArrayList {

	public static void main(String[] args) {
//      Task: Add Elements to ArrayList
//      Input: 5 10 15 20
//      Output: [5, 10, 15, 20]

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList(5, 10, 15, 20));
		System.out.println(list1);//[5, 10, 15, 20]
//-------------------------------------------------------------------------
		
	    PrintUtils.printlongline();
	    
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 10, 15, 20));// The most simple 
		System.out.println(list2);//[5, 10, 15, 20]
//--------------------------------------------------------------------------------		
	    
		PrintUtils.printlongline();
	    
		ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        System.out.println(list);//[5, 10, 15, 20]
		

	}

}
