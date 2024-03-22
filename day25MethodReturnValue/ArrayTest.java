package day25MethodReturnValue;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
     
	        int a[] = {1,2,3};
	        int b[] = {1,2,3,-1, -2 , -3};
	        int d[] = {6,7,8,9,8};

	        int c[] = ArrayUtils.merge2IntArray(a, b);
	        
	        System.out.println(Arrays.toString(c));
	        
	        int e[] = ArrayUtils.merge2IntArray(c, d);
	        System.out.println(Arrays.toString(e));
            
	        PrintUtils.printlongline();

	        System.out.println(Arrays.toString(ArrayUtils.merge3IntArray(a, b, d)));

	}

}
