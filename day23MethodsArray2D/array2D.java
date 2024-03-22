package day23MethodsArray2D;

import java.util.Arrays;

import day25MethodReturnValue.PrintUtils;

public class array2D {

	public static void main(String[] args) {
//      Array --> data structure in java, can store collection of data with same type.
        
      int numArr1[] = new int[5];
      
      System.out.println(numArr1.length); // returns the size of the array 5
      
      System.out.println(numArr1[0] ); // 0
      
      System.out.println(Arrays.toString(numArr1));//[0, 0, 0, 0, 0]
      
//      10 , 90 , 22, 1, 6
      
      numArr1[0] = 10;
      numArr1[1] = 90;
      numArr1[2] = 22;
      numArr1[3] = 1;
      numArr1[4] = 6;
      
      System.out.println(Arrays.toString(numArr1));//[10, 90, 22, 1, 6]
//                     0 1 2 3 4 5 
      int numArr2[] = {5,3,7,6,5,44};
      
      System.out.println(numArr2[3]);//6
      
//                        0   1   2
      int numArr3[] = {333,888,9999};
      
//---------------------------------2D Array----------------------------------//
//                          0         1         2         3
      int numbers[][] = {numArr1, numArr2, numArr3,{77,55,33,11}};
//                                                    0   1  2  3
      
      
      
//      where is 90 in numArr1?
      System.out.println(numArr1[1]);
//      where is 90 in numbers?    
      System.out.println(numbers[0][1]);
      
      //888
      System.out.println(numArr3[1]);
      System.out.println(numbers[2][1]);//888
      
      System.out.println(numbers[3][2]);//33
      PrintUtils.printlongline();
      System.out.println(numbers.length);//4
      
      PrintUtils.printlongline();  
      
      for (int i = 0 ; i < numbers.length ; i++) {
//          System.out.println(numbers[i]);//[I@4617c264
//          System.out.println(Arrays.toString(numbers[i]));//iteration 1  [10, 90, 22, 1, 6]
      
          
          for (int j = 0 ; j < numbers[i].length ; j++) {
              System.out.println(numbers[i][j]);
        }
	}
      PrintUtils.printlongline();   
      
      for (int[] arr : numbers) {
          for (int num : arr) {
              System.out.println(num);
          }
      }
           

	}

}
