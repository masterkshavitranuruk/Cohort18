package day33_Encapsulation;

import java.util.ArrayList;

public class PersonObject {

	   public static void main(String[] args) {
	        Person sharifa = new Person("Sharifa", 18, "103 Florida");
	        Person eleonora = new Person("Eleonora", 18, "203 Florida");
	        Person masterK = new Person("Master K", 18, "303 Florida");

	        int arr[] = { 1, 2, 3 };

	        Person arr1[] = { sharifa, eleonora, masterK };

	        for (int i = 0; i < arr1.length; i++) {
//	            System.out.println(arr1[i].toString());

	            if (arr1[i].getName().equals("Sharifa")) {
	                arr1[i].setAddress("123 Willard Rd, Chantilly VA");
	            }

	            if (arr1[i].getName().equals("Eleonora")) {
	                arr1[i].setAddress("123 Duke St, Alexandria VA");
	            }

	        }

	        for (int i = 0; i < arr1.length; i++) {
	            System.out.println(arr1[i].toString());
	        }

	    }

	}
