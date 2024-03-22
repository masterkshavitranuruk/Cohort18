package day35_polymorphism.inheritanceTask;

public class LoginTest extends BaseTest{
    
//  @Test
  public void loginWithInvalidUserName() {
      setup();
      login("adminxxx","admin123");
//      AssertEquals("Expected Error message", "Invalid credentials");
      System.out.println("Add asserssion to validate the error message.");
      teardown();
  }
  
//  @Test
  public void loginWithvalidUserName() {
      setup();
      login("admin","admin123");
//      AssertEquals("Expected Error message", "Invalid credentials");
      System.out.println("Validate that you are at the homepage");
      teardown();
  }
  
  
}