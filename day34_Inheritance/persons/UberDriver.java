package day34_Inheritance.persons;

public class UberDriver extends Employee{
	public UberDriver() {}
	public UberDriver(String name, int age, String ssn, char gender, double salary, String job_title,
			String employee_id) {
		super(name, age, ssn, gender, salary, job_title, employee_id);
	}

	public void drivingUber() {
		System.out.println(getName() +" is driving uber.");
	}
	
	public void displayEmployeeDetails() {
		System.out.println("My name is "+ getName());
		System.out.println("I'm an Uber Driver");
		System.out.println(toString());
		
	}
}
