package day34_Inheritance.persons;

public class Developer extends Employee{
    public Developer(String name, int age, String ssn, char gender, double salary, String job_title,
			String employee_id) {
		super(name, age, ssn, gender, salary, job_title, employee_id);
	}

	public void fixBug() {
        System.out.println(getName() + " has fixed the bug.");
    }

    public void codeAndCode() {
        System.out.println("All what " + getName() + " do is code and code.");
    }

    public void displayEmployeeDetails() {
        System.out.println("My name is " + getName() + ".");
        System.out.println("I'm a Developer.");
        System.out.println(toString());
    }
}
