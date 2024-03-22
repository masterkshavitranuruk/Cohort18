package day25MethodReturnValue;

public class MethodTest {

	public static void main(String[] args) {

//      MethodReview.sayHello();
//      
//      MethodReview.sayHelloToSomeone("Almira");

		int sum = MethodReturnValue.addition(4, 8);

		System.out.println(sum);

		System.out.println(MethodReturnValue.addition(100, 999));
//		PrintUtils.printLongLine();
		int arr[] = { 3, 1, 500, 3, 9, 7, 4, 3, 122, 3, 4 };
//      MethodReturnValue.intArraySort(arr);
//      
//      System.out.println(Arrays.toString(arr));
//      
//      System.out.println(arr[arr.length-1]);

		System.out.println(MethodReturnValue.getMaxValueFromAnIntArray(arr));

		System.out.println(MethodReturnValue.getFullName("gulfire", "cuskun"));

		System.out.println(MethodReturnValue.getFullName("YANCY", "lou"));

	}

}
