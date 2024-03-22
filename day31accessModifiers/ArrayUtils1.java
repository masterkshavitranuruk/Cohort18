package day31accessModifiers;

public class ArrayUtils1 {

//	public static  int findMax(int arr[]) {
//		int max = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//			int max = 0;
//			for (int i = 0; i < arr.length-1; i++) {
//				if (arr[i] > max) {
//					max = arr[i];
//				}
//		}return max;
//	}
//
//	public static  int findMin(int arr[]) {
//		int min = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] < min) {
//				min = arr[i];
//			}
//
//		}return min;
//	}
//
//
//	public static int[] findReverseArray(int arr[]) {
//		
//		int[] reverseArr = new int [arr.length];
//		int index =0;
//		for (int i = arr.length-1; i >=0; i--) {
//			 reverseArr[index] = arr[i];
//			 index++;
//			}
//
//	 }return reverseArr;
//	
//}
//}
//  1. return max value from an integer array
    
//  public static int maxValueFromIntArr(int arr[]) {
//      Arrays.sort(arr);
//      return arr[arr.length -1];
//  }
  
  public static int maxValueFromIntArr(int arr[]) {
      int max = arr[0];
      for (int num : arr) {
          if (num > max) {
              max = num;
          }
      }
      return max;
  }
  
  
  
  
//  2. Return min from an integer array
  
//  public static int minValueFromIntArr(int arr[]) {
//      Arrays.sort(arr);
//      return arr[0];
//  }
  
  public static int minValueFromIntArr(int arr[]) {
      int min = arr[0];
      
      for (int num : arr) {
          if (num < min) {
              min = num;
          }
      }
      return min;
  }
  
  
  
  
//  3. Reverse an array
  public static int[] reverseArr(int[] arr) {
      int[] reverseArr = new int[arr.length];
      int index = 0;
      for (int i = arr.length -1; i >= 0 ; i--) {
          reverseArr[index] = arr[i];
          index++;
      }
      return reverseArr;
  }
  
  
}