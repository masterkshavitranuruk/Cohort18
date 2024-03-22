package day33_Encapsulation;

import java.util.Scanner;

public class LoginPage {
	private String userName;
    private String enterPassword;
    private String clickLogin;
    
    public String getEnterUsername() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println(" Please Enter userName ");
    	String username = scan.next();
		return username;
    	
    }
    
    public void setEnterUsername(String userName) {
        this.userName = userName;
    }
    
    public String getenterPassword() {
    	Scanner scan1 = new Scanner(System.in);
    	System.out.println(" Please Enter enterPassword ");
    	String enterPassword = scan1.next();
		return enterPassword;
    	
    }
    
    public void setenterPassword(String enterPassword) {
        this.enterPassword = enterPassword;
    }
    
    public String getClickLogin() {
    	Scanner scan2 = new Scanner(System.in);
    	System.out.println(" Please Enter clickLogin");
    	String clickLogin = scan2.next();
		return clickLogin;
    	
    }
    
    public void setClickLogin(String clickLogin) {
        this.clickLogin = clickLogin;
    }
    
    
    
	
}
