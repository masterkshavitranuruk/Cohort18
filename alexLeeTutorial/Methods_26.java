package alexLeeTutorial;

public class Methods_26 {

	public static void main(String[] args) {// Main Method
//		int a =5;
//		int b = 10;
//		System.out.println(a*b);
//		int c =2;
//		int d = 3;
//		System.out.println(c*d);

		welcome();
		multiply(5, 100);
		multiply(2, 3);
		multiply(6, 8);
		divide(20, 5);
		divide(100, 10);
		divide(66, 11);
		
//		Insert the missing part to print the number 8 in main, 
//		by using a specific keyword inside myMethod:		
		System.out.println(myMethod(3));

//		Add a fname parameter of type String to myMethod, and output "John Doe".
		myMethod("John");
	}

// Methods in Java  

	public static void myMethod(String fname) {
		System.out.println(fname + " Doe");
	}

	
	static int myMethod(int x) {
		return 5 + x;
	}	
	
	
	public static void welcome() { // SubMethod1
		System.out.println("Welcome to our calculator!");
	}

	public static void multiply(int a, int b) {// SubMethod2
		System.out.println(a * b);
	}

	public static void divide(int a, int b) {// SubMethod3
		System.out.println(a / b);
	}

}
