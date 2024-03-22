package alexLeeTutorial;

//import java.util.Iterator;

public class ForLoops_23 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			System.out.println("I love cats!");
		}

		int count = 0;
		while (count < 4) {
			System.out.println("I love dogs!");
			count++;
		}

//		for (int i = 0; i <= 15; i++) {
//			System.out.println(i);
//		}
//
//		int[] grades = { 98, 100, 83, 90, 93 };
//
//		for (int i = 0; i < grades.length; i++) {
//			System.out.println(grades[i]);
//		}
		String[] colors = { "Red", "Blue", "Green" };
		for (int i = 0; i < 3; i++) {
			System.out.println(colors[i]);// String Array [i]
		}

		String[][] fancycolors = { { "Red", "Blue", "Green" }, { "Cyan", "Magenta", "Turqiouse" } };

		for (int row = 0; row < 2; row++) {// row for loops
			for (int column = 0; column < 3; column++) { // column for loops
				System.out.println(fancycolors[row][column]);
			}

		}

		for(int i =0; i<5; i++) {
			for(int j =0;j<10;j++) {
				System.out.println("i" +i +"j" +j);
			}
		}
		
//		Stop the loop if i is 5.	
		for (int i = 0; i < 10; i++) {
			  if (i == 5) { 
			break;
			  }
			  System.out.println(i);
			}
		
//		In the loop, when the value is "4", jump directly to the next value.
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}
		
		
		
		
		
		
		
	}

}
