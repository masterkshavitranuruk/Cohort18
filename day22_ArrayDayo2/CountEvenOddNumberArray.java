package day22_ArrayDayo2;

public class CountEvenOddNumberArray {

	public static void main(String[] args) {
		
		
//-------------------------------------MasterK Version---------------------------------------//
		
		int nums[] = {2,3,4,5,6,7,5};
		int count = 0;
		for (int i = 0; i <= nums.length-1; i++) {
			int num = nums[i];
			if (num % 2 == 0) {
				count++;
				
			}
		}
		
		int oddNums = nums.length-count;
		System.out.println("the even number from array is counted as "+ count);
		System.out.println("the odd number from array is counted as "+ oddNums) ;
//________________________________________________________________________________________//
		
		
	       int arr[] = {10, 1, 2, 4, 5, 6, 1,2,3,4,3,3,3,3,3,3,3};
	        
	        int evenNumCount = 0;
	        int oddNumCount = 0;
	                
	        
	        for (int a : arr) {
//	            System.out.println(a);
	            
	            if (a % 2 == 0) {
	                evenNumCount++;
	            }else {
	                oddNumCount++;
	            }
	            
	        }
	        
	        
	        System.out.println("Even number count is "+ evenNumCount);
	        System.out.println("Odd number count is "+ oddNumCount);
	}

}
