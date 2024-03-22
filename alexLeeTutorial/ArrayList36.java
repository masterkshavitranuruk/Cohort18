package alexLeeTutorial;

import java.util.ArrayList;

public class ArrayList36 {

	public static void main(String[] args) {
		String[] fruits = new String[4];
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Strawberry";
		fruits[3] = "Watermelon";
		System.out.println(fruits[1]);
		System.out.println(fruits);//[Ljava.lang.String;@4617c264
// Array list is flexible to grow and shrink w/ change the array size & know the exact array size
		ArrayList fruitList = new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Watermelon");// Easy to add the elements w/o changing array size 

		fruitList.remove("Strawberry");//Easy to remove the elements
//		fruitList.clear();
		System.out.println(fruitList.contains("Raspberry"));//false

		System.out.println(fruitList);
		System.out.println(fruitList);
              
	}    

}
