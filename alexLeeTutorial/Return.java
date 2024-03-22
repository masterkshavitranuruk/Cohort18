package alexLeeTutorial;

public class Return {

	public static void main(String[] args) {
		
		String exclaim = addExclamationPoint("hot dogs");
		System.out.println(exclaim);
	}
	public static String addExclamationPoint(String s) {
		return s +"!";

	}

}
