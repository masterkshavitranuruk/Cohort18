package day33_Encapsulation;

public class Person {
    /*
    1, Create a class called Person with the following attributes:
    
    name (String)
    age (int)
    address (String)
    
    1.5, Implement encapsulation by making the name, age, and address attributes private.
    
    2, Create public getter and setter methods for each attribute.
    
    3, Implement validation in the setter methods to ensure that the age attribute 
       is between 0 and 120, and that the name and address attributes are not empty.
    
    4, Create a constructor for the Person class that accepts values for the name, 
       age, and address attributes and initializes them using the setter methods.
    
     */
    
	// instance variables
		private String name;
		private int age;
		private String ssn;
		private char gender;
		public Person() {};
		// instance methods
		public void eat() {
			System.out.println("Person can eat");
		}
		
		public void sleep() {
			System.out.println("Person is sleeping");
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getSsn() {
			return ssn;
		}

		public void setSsn(String ssn) {
			this.ssn = ssn;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", ssn=" + ssn + ", gender=" + gender + "]";
		}

		public Person(String name, int age, String ssn, char gender) {
			this.name = name;
			this.age = age;
			this.ssn = ssn;
			this.gender = gender;
		}
		
		
		
		
    
}