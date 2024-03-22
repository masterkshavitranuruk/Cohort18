package day33_Encapsulation;

public class Student {
    

    /*
     * Encapsulation simply means binding object state(fields) and behavior(methods)
     * together.
     * 
     * 1) Make the instance variables private so that they cannot be accessed
     * directly from outside the class. You can only set and get values of these
     * variables through the methods of the class. 2) Have getter and setter methods
     * in the class to set and get the values of the fields.
     */
    
    
    

    // Instance Variables
    private String name;
    private String ssn;
    // make this class fully encapsulated by adding private and getter, setter for
    // each instance variables
    private String dob;
    private int age;
    private char gender;
    private String phoneNumber;

    public Student() {}
    
    public Student(String name, String ssn , String dob , int age , char gender, String phoneNumber) {
        this.name = name;
        this.ssn = ssn;
        setDob(dob);
        setAge(age);
        setGender(gender);
        setPhoneNumber(phoneNumber);
        
    }
    
    
    
    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

//    Read name
    public String getName() {
        return name;
    }

//    Set Name
    public void setName(String name) {
        this.name = name;
    }

    public void study(String subject) {
        System.out.println(name + " is learning " + subject + ".");
    }

    // reading ssn --> getter method
    public String getSsn() {
        return ssn;
    }

    // assigning value to ssn ---> setter method
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

//  Read gender 

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

// Read age 

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//  Read phoneNumber 

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

	@Override
	public String toString() {
		return "Student [name=" + name + ", ssn=" + ssn + ", dob=" + dob + ", age=" + age + ", gender=" + gender
				+ ", phoneNumber=" + phoneNumber + "]";
	}

    
    
    
    
    
    
}