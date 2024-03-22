package day27ArrayListAndMethodTasks;
import java.util.Arrays;
public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Task15 Write a program that can reverse a two dimensional array (return new array)
//
//      Example:
//
//      input: array = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12,13}};
//
//      output: reverse = {{13,12,11,10,9,8}, {7,6,5,4}, {3,2,1}};
      
//      int arr[] = {1,2,3};
//      int arr2[] = new int[arr.length];
//      
//      System.out.println(Arrays.toString(arr));
//      System.out.println(Arrays.toString(arr2));
//      
//      System.out.println(arr[2]);
//      System.out.println(arr2[0]);
//      
//      arr2[0] = arr[2];
//      System.out.println(arr2[0]);
//
//      
//      arr2[1] = arr[1];
//      System.out.println(Arrays.toString(arr2));
//
//      arr2[2] = arr[0];
//      System.out.println(Arrays.toString(arr2));
      
      
      
//      int arr[] = {8,9,10,11,12,13};
//      int arr2[] = new int[arr.length];
//      
//      System.out.println(Arrays.toString(arr));
//      System.out.println(Arrays.toString(arr2));
//      
//      int index = 0;
//      
//      for (int i = arr.length -1 ; i >= 0 ; i--) {
//          arr2[index] = arr[i];
//          index++;
//      }
//      
//      System.out.println(Arrays.toString(arr));
//      System.out.println(Arrays.toString(arr2));
      
      
//      System.out.println(Arrays.toString(reverseIntArr(arr)));
      
      
//                       0          1          2
      int arr[][] = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12,13}};
      int arr2[][]  = new int[arr.length][];
      int index = 0;
      for (int i = arr.length -1; i >= 0 ; i--) {
          arr2[index] = reverseIntArr(arr[i]);
          index++;
      }    
      
      
      
//      for (int[] a : arr2) {
//          System.out.println(Arrays.toString(a));
//      }
      
//      System.out.println(Arrays.deepToString(arr2));
      
      String output = Arrays.deepToString(arr2);
          output = output.replace("[", "{");
          output = output.replace("]", "}");
          System.out.println(output);
          
  }
  
  
//  syntax of method:
//      AccessModifier returnType methodName (parameters) {
//          method body
//      }
  
  public static int[] reverseIntArr(int arr[]) {
      int arr2[] = new int[arr.length];

      int index = 0;
      
      for (int i = arr.length -1 ; i >= 0 ; i--) {
          arr2[index] = arr[i];
          index++;
      }
      return arr2;
  }
}
  
  
  

	


