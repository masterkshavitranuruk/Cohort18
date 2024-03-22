package day30Constructor;

public class EmployeeObject {

	public static void main(String[] args) {
		Employee masterK = new Employee();
		
		Employee masterK2 = new Employee("Master K",123456,"Manager",50000.00);
		
		masterK.displayInfio();
		masterK2.displayInfio();
		
		masterK2.updateSalary(600000);
		masterK2.promote("CEO");
		masterK2.displayInfio();
		
	}

}
