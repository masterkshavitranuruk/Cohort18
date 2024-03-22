package day23MethodsArray2D;

public class Methods {

	public static void main(String[] args) {
		/*
		 * syntax:
		 * 
		 * accessModifier returnType methodName(Parameters) { Method body }
		 */

		addition(10, 20);
		addition(9, 4);

		sayHello();
		sayHello();


		sayHelloToSomeone("Yancy");
		sayHelloToSomeone("Almira");

		addition(999, 1);
		multiplicaion(5,6);
		subtraction(10,2);
		division(8,4);
	
	}

	
//------------------Methods---------------------------------------//	
	
	static void sayHello() {
		System.out.println("Hello");
	}

	public static void sayHelloToSomeone(String name) {
		System.out.println("Hello " + name);
	}


	public static void addition(int a, int b) {
		// method body
		int result = a + b;
		System.out.println(result);
	}

	public static void multiplicaion(int a, int b) {
		// method body
		int result = a * b;
		System.out.println(result);
	}

	public static void subtraction(int a, int b) {
		// method body
		int result = a - b;
		System.out.println(result);

	}

	public static void division(int a, int b) {
		// method body
		int result = a / b;
		System.out.println(result);

	}
}
