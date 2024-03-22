package day12_LoopReview;

public class Array {

	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford"};
//		Change the value from "Volvo" to "Opel", in the cars array.
		cars[0]= "Opel";
	
/*		Loop through the items in the cars array with For-Each.
 * 		There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:
		for (type variable : arrayname) {
			  ...
			}					
*/		
		
		
		for (String i : cars) {
			System.out.println(i);
		}
		
/*Multidimensional Arrays
A multidimensional array is an array of arrays.

Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

To create a two-dimensional array, add each array within its own set of curly braces:
		
 
 */

		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
	
		System.out.println(myNumbers[1][2]); // Outputs 7
		
//Insert the missing parts to create a two-dimensional array.			
		myNumbers[1][2] = 9;
		System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7
	
/*Loop Through a Multi-Dimensional Array
We can also use a for loop inside another for loop to get the elements of a two-dimensional array 
(we still have to point to the two indexes):	

*/
System.out.println("----------------------------------------------------------------------------");		

		for (int i = 0; i < myNumbers.length; ++i) {
		      for(int j = 0; j < myNumbers[i].length; ++j) {
		        System.out.println(myNumbers[i][j]);
		      }
		    }
	
	}

}
