package day30Constructor;

public class Employee {
//  Class: Employee
//  add no argument and 
//  one parameterized constructor of employee class to set value to all instance variables
//  Attributes: employeeID, name, position, salary
//  Methods: updateSalary(newSalary), promote(newPosition)
//  Usage: This class models an employee, including the ability to update their salary and position within a company.
	
	// instance variables 
	String name ;
	long employeeID ; 
    String position ;
    double salary;
	 
	
	
	public Employee() {
	        System.out.println("no argument constructor of student class");
	        String name ="Unknown"; 
	        long employeeID =00000; 
	      	String position ="Unknow";
	        double salary =0000000;
	 	 
	 }	

	//Parameterized Constructor for setting value to all of the instance variables
	 public Employee (String name1, long id1, String  position1, double salary1) {
	        name = name1;
	        employeeID = id1;
	        position = position1;
	        salary = salary1;
	    }
	 
//   instance methods	 
	 
//	 updateSalary(newSalary), promote(newPosition) 
	 
	 public void updateSalary(double amount) {
	         salary= amount;
	        System.out.println("Your update salary is: " + salary);
	    }
	 
	 public void promote(String position2) {
		 position = position2;
        System.out.println("Your update salary is: " + position);
    }
	 
	 public void displayInfio() {
	        System.out.println("------------------");
	        
	        System.out.println("Employee:{");                   
	        System.out.println("name:"+name);
	        System.out.println("id:"+employeeID);
	        System.out.println("position"+position);
	        System.out.println("salary:"+salary);
	        System.out.println("}");
	        System.out.println("------------------");

	    } 
	 
	 
	
}
