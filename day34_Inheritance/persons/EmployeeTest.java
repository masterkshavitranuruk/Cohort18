package day34_Inheritance.persons;

public class EmployeeTest {

	public static void main(String[] args) {
		
		UberDriver driver = new UberDriver() ;
//		driver.age = 35;
		driver.setAge(35);
//		driver.name = "Alex";
		driver.setName( "Alex");
//		driver.gender = 'M';
		driver.setGender('M');
		driver.job_title = "UberDriver";
		driver.salary = 40000;
//		driver.ssn = "123,12,1234";
		driver.setSsn("123-12-1234");
		driver.employee_id = "1234";
		
		
		driver.sleep(); // person class
		driver.eat(); // person class
		
		driver.work(); // employee class
		
		driver.displayEmployeeDetails();
		driver.drivingUber();
		
		
		Developer dev = new Developer("Malak",19,"213-12-3232",'F',150000,"Java Developer","8979890" );
		
		SDET tester = new SDET("Nareerah",18,"N/A",'F',140000,"SDET","1092342");
		
		
		dev.sleep();
		dev.eat();
		dev.fixBug();
		dev.codeAndCode();
		
		
		tester.createBugReport();
		tester.work();
		tester.runRegressionTest();
		tester.runSmokeTest();
		tester.sleep();
		tester.eat();
		
		System.out.println(tester.toString());
		
				
	}

}
