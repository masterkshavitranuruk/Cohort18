package day22_ArrayDayo2;

import java.util.Arrays;

public class EmailDomainName {

	public static void main(String[] args) {
		String email = "techcircle@techcirclesolutions.org";
//      email = "techcircle@github.com";
		email = "abc@aws.com";
//      Find the domain of the given email address using string split method.

		String arr[] = email.split("@");
		System.out.println(Arrays.toString(arr));//[abc, aws.com]
		String email2 = arr[1];
		System.out.println(email2);//		aws.com
		String arr1[] = email2.split("\\.");
		System.out.println(Arrays.toString(arr1));//[aws, com]
//-----------------------------------------------------------------------------------//
		
		String text1 = "BUY EURO SELL USD";
		String arr3[] = text1.split(" ");
		System.out.println(Arrays.toString(arr3));//[BUY, EURO, SELL, USD]
		System.out.println(arr3[2] + " " + arr3[1] + "  " + arr3[0] + " " + arr3[3]);
		
		
//--------------------------------------------MasterK Version--------------------------------------------------------------------------------------//
 /*Create an array named classmates, and store 10 of your classmates' full names
   print the initials of each classmates in separate lines
 */
		
		String names[] = { "MasterK Shavitranuruk", "Gulfire Coskun", "Bilal Khalid", "Nazeerah Nadim", "Yancy Lou",
				"Malk Alselmi", "Khemmanij Stinebaugh", "Almire Almire", "Flora Zurki", "Sharifa Mustafa" };
//		System.out.println(Arrays.toString(names));
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			String nameArr[] = name.split(" ");
			String firstName = nameArr[0];
			String lastName = nameArr[1];
			System.out.println(firstName.charAt(0) +"."+  lastName.charAt(0));
		}

//-------------------------------------------MasterK Revised Version----------------------------------------//
		
		
		for(String classNames : names) {
						
			String nameArr[] =classNames.split(" ");
			String firstName = nameArr[0];
			String lastName = nameArr[1];
			System.out.println(firstName.charAt(0) +".."+  lastName.charAt(0));//M..S
		
					
		}
		
		
		
		
		
//----------------------------------------------Irfan Version-----------------------------------------------------------------------//
        String classmates[] = { "Bilal Khalid", "Bryan Chavez", "Eleonora Sheldon", "Arad Misaghi", "Malak Alselmi",
                "Flora Zurki", "Nursen Kasgarli", "Almire Abdurxit", "Khemmanij Stinebaugh", "Nazeerah Naadim" };
        
        System.out.println(classmates.length);
        
        for (int i = 0 ; i < classmates.length ; i++) {
            System.out.println(classmates[i]);// Bilal Khalid
//            String name = "Arad Misaghi";
            String name = classmates[i];
            String nameArr[] = name.split(" ");
            String firstNanme = nameArr[0];
            String lastName = nameArr[1];
            System.out.println(firstNanme.charAt(0)+"."+lastName.charAt(0));//B.K
        }		
		
		
		
		
//----------------------------------------------------------------------------------//		
		 
/*Create an array that has the numbers 1 to 100
*/
			
		
			int nums[] = new int[100];
			for (int j = 0; j < 100; j++) {
				nums[j] = j + 1;

			}
			System.out.print(Arrays.toString(nums));

		
	}

}
