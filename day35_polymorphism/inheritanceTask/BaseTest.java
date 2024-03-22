package day35_polymorphism.inheritanceTask;

public class BaseTest {
	//    Define a base test class called BaseTest that 
    //initializes the WebDriver and contains common setup and teardown methods (e.g., setUp() and tearDown()).

    public void setup() {
        System.out.println("Open chrome browser");
        System.out.println("Navigate OrangeHRM website");
    }
    
    
    public void login(String userName, String password) {
        System.out.println("Do login");
        System.out.println("enter username "+userName);
        System.out.println("Enter Password "+ password);
        System.out.println("Click on login button");
    }
    
    public void teardown() {
        System.out.println("Quit browser");
        System.out.println("Colose database connection");
        System.out.println("CleanUp your test data");
    }
}
