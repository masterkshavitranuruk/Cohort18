package alexLeeTutorial;

public class ReturnStatements27 {

	public static void main(String[] args) {
		printAMessage();
		
		int sum = add(5,4);
		System.out.println(sum);
		
		
		String shouting = caps(" why are you reading my diary mom?!!");
		System.out.println(shouting);
		
		
		
		int[] awesomeArray = gimmeArrayFromInts(3,7,1);
		System.out.println(awesomeArray[0]);
		System.out.println(awesomeArray[1]);
		System.out.println(awesomeArray[2]);
	}
	
	
	// return statement when we want to store value back to Main Method
	
	public static void printAMessage() {
		System.out.println("This is our first method");
	}
	
	
	public static int add(int a, int b) {//change return type void --> int
//		System.out.println(a+b);           
		return a+b;  //return int number of a+b --> add(a,b) in main method
	}
	
	
	public static String caps(String s) {
		return s.toUpperCase() ;//return String s to caps()in main method
	}
	

	public static int[]gimmeArrayFromInts(int a, int b, int c){
		int[] array = new int[3];
		array[0] = a;		
		array[1] = b;
		array[2] = c;
		return array;
	}
	
}
