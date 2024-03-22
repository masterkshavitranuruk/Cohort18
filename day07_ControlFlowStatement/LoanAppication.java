package day07_ControlFlowStatement;

public class LoanAppication {

	public static void main(String[] args) {
	
	//Nested Statements	
	
	double salary = 40000;
	int jobHistory = 5;
	int creditScore = 780;
		
	if (salary > 30000) {
		if (jobHistory >=2) {
			if (creditScore>=680) {
			}else {
				System.out.println("You must have minimum of 680 credit score to meet a requirement.");		
			}
		}else {
			System.out.println("You must have minimum of 2 years job History to meet a requirement.");	
		}
	}else {
		System.out.println("You must have minimum of 30,000 salary to meet a requirement.");
	}	
	System.out.println("Congratuation !! You are approved for the loan. ");

	}
}
