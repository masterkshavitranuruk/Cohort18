package alexLeeTutorial;

public class Params28 {

	public static void main(String[] args) {
		sayHi();
		
		saySomething("Microphone"); // "Microphone" is called argument in the METHOD
		saySomething("Master K");
		saySomething("Golf ");
		
		printInfo("Master K ", 23);
		
		int result1 = add(2,4);
		int result2 = add(3,4);
		int result3 = add(4,4);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}

	public static void sayHi() {
		System.out.println("hi");
	}
//   METHOD PARAMETER made program clean and effective
	
	public static void saySomething(String s) {// inside Method () called parameters
		System.out.println(s);
	}

	public static void printInfo(String name, int age) {
		System.out.println(name +" is " +age +" years old" );
	}
	
//   Return the value back to Main method !!!! Calculation in each method	
	public static int add(int x, int y) {
		return x+y;
		
	}
	
	
}
