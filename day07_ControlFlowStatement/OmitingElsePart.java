package day07_ControlFlowStatement;

public class OmitingElsePart {

	public static void main(String[] args) {
		
		int num = -4;
		
		if (num >0) {
			System.out.println("Positive");
		}// Omitting else [more clean code]
		if (num == 0) {
			System.out.println("Num is zero");
		}
		if (num <0) {
			System.out.println("Negative");
			
		}
		
		
		
	}

}
