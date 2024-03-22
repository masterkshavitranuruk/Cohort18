package day04;

public class PrimitiveDataReview {

	public static void main(String[] args) {
		
		/*
		 * DataType > Primitive
		 * 
		 * -Number
		 * 	byte, short, int, long
		 * -Floating Number (Decimal)
		 * 	float, double
		 * -Character (single)
		 * -Boolean true, false
		 * 	boolean
		 */
		
		byte age = 80;
		short dayInYear = 365;
		int housePrice = 300_000;
		long youtubeView = 5_000_000_000L;
		float milkPrice = 2.65F;
		double myBalance = 456_674.35246145;
		char letter = '6';
		boolean isEliglble = true;
		
		
		System.out.println(age);
		System.out.println(dayInYear);
		System.out.println(housePrice);
		System.out.println(youtubeView);
		System.out.println(milkPrice);
		System.out.println(myBalance);
		System.out.println(letter);
		System.out.println(isEliglble);
		
		// Concatenate the string
		System.out.println("Max of byte is" + Byte.MAX_VALUE  + "..!!");
		System.out.println("Min of byte is" + Byte.MIN_VALUE + "..!!");


	
	
	
	}

}
