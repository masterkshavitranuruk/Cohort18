package day33_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {

	public static void main(String[] args) {
		
//		 Student almira = new Student();
//	        almira.setAge (18);
//	        almira.setDob ("01012000");
//	        almira.setGender ('F');
//	        almira.setName("Almira");
//	        almira.setPhoneNumber ("7031231234");
//	        almira.setSsn("123121234");
//	        
//	        
//	        almira.study("java");
//	        
//	        System.out.println(almira.getAge());
//	        System.out.println(almira.getDob());
//	        System.out.println(almira.getGender());
//	        System.out.println(almira.getName());
//	        System.out.println(almira.getPhoneNumber());
//	        System.out.println(almira.getSsn());
//	        

		        Student almira = new Student();
		        //almira.age = 18;
		        almira.setAge( 18);
//		        almira.dob = "01012000";
		        almira.setDob( "01012000");
//		        almira.gender = 'F';
		        almira.setGender('F');
//		        almira.name = "Almira";
		        almira.setName("Almira");
//		        almira.phoneNumber = "7031231234";
		        almira.setPhoneNumber("7031231234");
//		        almira.ssn = "123121234";
		        almira.setSsn("123121234");
		        
		        
		        almira.study("java");
		        
//		        System.out.println(almira.age);
//		        System.out.println(almira.dob);
//		        System.out.println(almira.gender);
//		        System.out.println(almira.name);
//		        System.out.println(almira.phoneNumber);
		        System.out.println(almira.getName());
		        System.out.println(almira.getAge());
		        System.out.println(almira.getDob());
		        System.out.println(almira.getGender());
		        System.out.println(almira.getSsn());
		        System.out.println(almira.getPhoneNumber());
		        
		        
		        // Create 4 more students, and add them to a Student list.
//		        ArrayList<dataType> nameOftheList = new ArrayList<>()
		        
		        Student sharifa = new Student("Sharifa","123121230","01012000",18,'F',"1031231234");
		        Student eleonora = new Student("Eleonora","123121231","01012000",18,'F',"2031231236");
		        Student masterK = new Student("Master K","1231212342","01012000",18,'M',"3031231234");
		        Student bryan = new Student("Bryan","1231212343","01012000",18,'M',"4031231234");

		        
		        ArrayList<String> names =new ArrayList<>();
		        names.add(sharifa.getName());
		        
		        ArrayList<Student> studentList =new ArrayList<>();

		        studentList.add(masterK);
		        studentList.add(eleonora);
		        studentList.addAll(Arrays.asList(almira,bryan,sharifa));
		        
		        System.out.println(studentList.size());
		        
		        
		        for (int i = 0 ; i < studentList.size() ; i++) {
		            studentList.get(i).study("Java");
		            System.out.println(studentList.get(i).getName());
		        }
		        
		        System.out.println("----------------------------");
		        for (Student s : studentList) {
		            if (s.getGender() == 'F') {
		                System.out.println(s.getName());
		                System.out.println(s.getAge());
		            }
		        }
		        
	        
		    }
 	       
	}        	
		



