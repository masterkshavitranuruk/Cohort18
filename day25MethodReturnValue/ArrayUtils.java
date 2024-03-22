package day25MethodReturnValue;
import java.util.Arrays;
public class ArrayUtils {
	public static int[] merge2IntArray(int arr1[], int arr2[]) {

//      int arr1[] = {3,2,5};
//      int arr2[] = {5,2,7,5,3,1,90};
      // {3,2,5,5,2,7,5,3,1}

//      int arr3[] = new int [9];
      int arr3[] = new int[arr1.length + arr2.length];

//      System.out.println(arr3.length);
//      
//      System.out.println(Arrays.toString(arr3));
//      
//      arr3[0] = arr1[0];
//      arr3[1] = arr1[1];
//      arr3[2] = arr1[2];
//      System.out.println(Arrays.toString(arr3));
//      arr3[3]  = arr2[0];
//      arr3[4]  = arr2[1];
//      System.out.println(Arrays.toString(arr3));
//		
//---------------------------------------------------------------------------------
//      int arr3[] = new int [arr1.length+arr2.length];
//      
//      for(int i =0; i<arr1.length;i++ ) {
//      	arr3[i]=arr1[i];}
//      	for(int j =arr1.length; j<arr2.length+arr1.length;j++ ) {
//      		arr3[j]=arr2[j-arr1.length];}
//      	
//		
//      System.out.println(Arrays.toString(arr3));
      int index = 0;

      for (int num : arr1) {
          arr3[index] = num;
          index++;
      }

      for (int num : arr2) {
          arr3[index] = num;
          index++;
      }
//      System.out.println(Arrays.toString(arr3));

      return arr3;

  }

  public static int[] merge3IntArray(int arr1[], int arr2[], int arr4[]) {
      int arr3[] = new int[arr1.length + arr2.length + arr4.length];
      int index = 0;

      for (int num : arr1) {
          arr3[index] = num;
          index++;
      }

      for (int num : arr2) {
          arr3[index] = num;
          index++;
      }

      for (int num : arr4) {
          arr3[index] = num;
          index++;
      }

      return arr3;
  }

}
