package day29ClassAndObject;

public class BankAccountObject {

	public static void main(String[] args) {

//
//		        BankAccount account = new BankAccount();
//		        
//		        account.accountNumber = 123456;
//		        account.balance = 1000;
//		        account.ownerName = "Gulfire";
//		        
//		        System.out.println(account.balance);
//		        
//		        account.deposit(5000);
//		        
//		        System.out.println(account.balance);
//		        
//		        account.displayInfo();
//		        
//		        account.withdraw(350);
//		        account.withdraw(900);
//		        account.withdraw(200);
//		        account.withdraw(250);
//		        account.withdraw(150);
//		        
//		        
//		        System.out.println(account.balance);
//		        account.displayInfo();
//		        account.deposit(5000);
//		        account.withdraw(350);
//		        account.withdraw(900);
//		        account.withdraw(200);
//		        account.withdraw(250);
//		        account.withdraw(150);
//		        
//		        
//		        System.out.println(account.balance);
//		        account.displayInfo();
		        
		       
		
				BankAccount account2 = new BankAccount();// No argument constructor
		        System.out.println(account2.accountNumber); 
		        System.out.println(account2.balance); 
		        System.out.println(account2.ownerName);
		        
		
		        account2.displayInfo();
		        account2.deposit(5000);
		        account2.withdraw(350);
		        account2.withdraw(900);
		        account2.withdraw(200);
		        account2.withdraw(250);
		        account2.withdraw(150);
		        System.out.println(account2.balance);
		   
			

	}

}


