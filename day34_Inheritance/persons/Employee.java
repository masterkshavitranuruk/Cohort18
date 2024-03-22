package day34_Inheritance.persons;

public class Employee extends Person{
	public Employee() {}
	public Employee(String name, int age, String ssn, char gender, double salary, String job_title
			,String employee_id) {
		super(name, age, ssn, gender);
		this.employee_id = employee_id;
		this.salary = salary;
		this.job_title = job_title;
	}

	double salary;
	String job_title;
	String employee_id;
	
	public void work() {
		System.out.println(getName() + " is working.");
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", job_title=" + job_title + ", employee_id=" + employee_id + "]";
	}
			
}
