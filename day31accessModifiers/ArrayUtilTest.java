package day31accessModifiers;

import java.util.Arrays;

//import java.util.Arrays;

public class ArrayUtilTest {

//	public static void main(String[] args) {
//	int input[]= {1,2,3,4,5};
//	System.out.println(ArrayUtils.findMax(input));
//	System.out.println(ArrayUtils.findMin(input));
	
//	
//	int arr2[] = ArrayUtils.findReverseArray(input);
//	System.out.println(Arrays.toString(arr));
//    System.out.println(Arrays.toString(arr2));


    public static void main(String[] args) {
        
        int arr[] = {5,3,2,5,1,23,3,4};
        
        System.out.println(ArrayUtils1.maxValueFromIntArr(arr));
        
        System.out.println(ArrayUtils1.minValueFromIntArr(arr));
        
        int arr2[] = ArrayUtils1.reverseArr(arr);
        
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
	}

}
