package day21_Array;

import java.util.Arrays;

public class ArrayForLoopCharArray {

	public static void main(String[] args) {

		String fruits[] = new String[6];
		fruits[0] = "grapes";
		fruits[1] = "bananas";
		fruits[2] = "mango";
		fruits[3] ="orange";
		fruits[4] ="apples";
		fruits[5] ="kiwis";
		System.out.println(Arrays.toString(fruits));//[grapes, bananas, mango, orange, apples, kiwis]
	
		System.out.println(fruits[0]);//grapes
		System.out.println(fruits[1]);//bananas
		System.out.println(fruits[2]);//mango
		System.out.println(fruits[3]);//orange
		System.out.println(fruits[4]);//apples
		System.out.println(fruits[5]);//kiwis
		
		System.out.println(fruits.length);//size of fruits array : 6
//-------------------------------------------------------------------------
			
		for(int i =0; i<fruits.length; i++) {
		//System.out.println(fruits);// unreadable code ---> memory location	
		System.out.println(fruits[i]);// output the same like above		}
		}
/*grapes
bananas
mango
orange
apples
kiwis*/
//-------------------------While  Loop ----------------------------------------
		
		int indexPosition =0;
//		System.out.println(fruits[indexPosition]);
//		indexPosition++;
//		System.out.println(fruits[indexPosition]);
//		indexPosition++;
		
		
		while (indexPosition < fruits.length) {
			System.out.println(fruits[indexPosition]);	
			indexPosition++;
		}
		
//---------------------------Do While Loop---------------------------------------		
		
		indexPosition = 0;
		do {
			System.out.println(fruits[indexPosition]);
			indexPosition++;
		} while (indexPosition < fruits.length);
//------------------------  FOr Loop Array--------------------------	
		
		
// Syntax   for(dataType element: arrayName){
//		 Your statement.	
//		}	
		String fruit[] = new String[6];// declare the number of elements in the array
		fruit[0] = "grapes";
		fruit[1] = "bananas";
		fruit[2] = "mango";
		fruit[3] ="orange";
		fruit[4] ="apples";
		fruit[5] ="kiwis";
		for(String element :fruit) {
			System.out.println(element);
		}
			
//--------------------------------------------			
		int  nums[] = {1, 2,3,4,5};
		for(int flora : nums) {
			System.out.println(flora);
		}
//-----------------------------------------------
	String name = "TechCircle";
	char chars[] = name.toCharArray();
	System.out.println(Arrays.toString(chars));//[T, e, c, h, C, i, r, c, l, e]
	for(char letter: chars) {
		System.out.println(letter);
	}

/*	T
	e
	c
	h
	C
	i
	r
	c
	l
	e
*/
	

	

	}

}
