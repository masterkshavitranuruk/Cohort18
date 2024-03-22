package day26ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

import day25MethodReturnValue.PrintUtils;

public class NumberList {

	public static void main(String[] args) {
		
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.addAll(Arrays.asList(4,6,8,10));
        
        System.out.println(list1);//[2, 4, 6, 8, 10]
        
        
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        
        System.out.println(list2);//[1, 3, 5, 7, 9]
        
        
        list1.addAll(list2);// ADD Array1 and Array2
        
        System.out.println(list1);//[2, 4, 6, 8, 10, 1, 3, 5, 7, 9]
        
        System.out.println(list2);//[1, 3, 5, 7, 9]
 
        System.out.println(list1.size());//10
        
        // read value by index position
//                    0  1  2  3  4   5  6  7  8  9
        // list1 = [2, 4, 6, 8, 10, 1, 3, 5, 7, 19]
        
        
        System.out.println(list1.get(0)); // 2
        System.out.println(list1.get(4));
        System.out.println(list1.get(9));
        
     
        for(int i=0;i<list1.size();i++ ){
        	System.out.println(list1.get(i));
             }
        PrintUtils.printlongline();
        
        for (Integer n : list1) {
            System.out.println(n);
        }

	}

}
