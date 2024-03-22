package day34_Inheritance.persons;

public class SDET extends Employee{

    public SDET(String name, int age, String ssn, char gender, double salary, String job_title, String employee_id) {
		super(name, age, ssn, gender, salary, job_title, employee_id);
	}

	public void createTestCase() {
        System.out.println(getName() + " has created a Test Case.");
    }

    public void runSmokeTest() {
        System.out.println(getName() + " is running a Smoke Test.");
    }

    public void runRegressionTest() {
        System.out.println(getName() + " is running a Regression Test.");
    }

    public void createBugReport() {
        System.out.println(getName() + " has created a Bug Report.");
    }

    public void displayEmployeeDetails() {
        System.out.println("My name is " + getName() + ".");
        System.out.println("I'm an SDET");
        System.out.println(toString());
    }

}
