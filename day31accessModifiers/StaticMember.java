package day31accessModifiers;

public class StaticMember {
	   // non static
    String name;
    
    
    static String subject = "Java";
    
    // non static
    public void printName() {
        System.out.println(name);
    }
    
    public static void printSubject() {
        System.out.println(subject);
    }
}
