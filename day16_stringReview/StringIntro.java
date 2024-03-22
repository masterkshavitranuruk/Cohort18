package day16_stringReview;

public class StringIntro {

	public static void main(String[] args) {
		//string literal ="hi"
		//reference data type (non-primitive)

	    String s1 = "hello world"; // string pool //Primitive
	    String s2 = new String("hello world");//Non Primitive
	    System.out.println(s1);//hello world
	    System.out.println(s2);//hello world
	    
	    System.out.println("is they equals : " + (s1 == s2));//false
	    System.out.println("Are they have the same value : " + s1.equals(s2));//true
		
		
//------------------------------------------------------------		
		// reference vs primitive
	    // primitive type
	    int a = 1;
	    int b = a; // copy by value
	    b++;

	    System.out.println("a = " + a);//1
	    System.out.println("b = " + b);//2

	    // reference type ( cannot be compare by == )
	    
	    int[] arr1 = {1};
	    int[] arr2 = arr1; // copy by reference
	    System.out.println(arr2[0]); // 1
	    arr2[0]++; // 1++

	    System.out.println("arr1 : " + arr1[0]);//2
	    System.out.println("arr2 : " + arr2[0]);//2

	    System.out.println(arr1);//[I@63961c42
	    System.out.println(arr2);//[I@63961c42

	}

}
