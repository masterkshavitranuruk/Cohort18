package day29ClassAndObject;

public class BankAccount {

	    /*
	     * Define a class named BankAccount with the following instance variables:
	     * accountNumber (int) balance (double) ownerName (String) Include an instance
	     * method named deposit(double amount) that increases the balance by the
	     * specified amount. Include another instance method named withdraw(double
	     * amount) that decreases the balance by the specified amount. Test the class by
	     * creating an object of BankAccount, performing some deposits and withdrawals,
	     * and printing the final balance.
	     */
	 public BankAccount() {
	    	System.out.println("This is no argument constructor of Calculator class");
	    	
	    	int accountNumber = 000000;
	 	    double balance = 0;
	 	    String ownerName = "Unknown";
	    }
	 
	 
	    int accountNumber;
	    double balance;
	    String ownerName;

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Your current account balance is: " + (balance ));
	    }

	    public void withdraw(double amount) {
	        balance -= amount;
	        System.out.println("Your current account balance is: " + (balance - amount));
	    }
	    
	    public void displayInfo() {
	        System.out.println("----------------------");
	        System.out.println("AccountNumber : "+ accountNumber);
	        System.out.println("OwnerName : " + ownerName);
	        System.out.println("Account Balance : "+ balance);
	        System.out.println("----------------------");

	    }
}
	    
//	//instance variables:
//	int accountNumber;
//	double	balance;
//	String	ownerName;
//
//
//	//instance method named
//	public void deposit(double amount) {
//		balance+=balance+amount;
//
//        System.out.println("Final Balance: "+(balance+amount));
//        
//    }
//	
//	public void withdraw(double amount) {
//		balance-=balance+amount;
//        System.out.println("Final Balance: "+ (balance-amount));
//
//    }
//	
//	public void displayinf() {
//		System.out.println("---------------------------- ");
//        System.out.println("Bank Account Class ");
//        System.out.println("Owner Name : "+ownerName);
//        System.out.println("Account Number : "+accountNumber);
//        System.out.println("Acoount Balance"+balance);
//    	System.out.println("---------------------------- ");
//		
//	}
//	


