package alexLeeTutorial;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator34 {

	public static void main(String[] args) {
//		LocalDate today = new LocalDate();
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(1996, 8, 8);
		int years = Period.between(birthDate,today).getYears();
		int days = Period.between(birthDate,today).getDays();
	    
		System.out.println(today);
	    System.out.println(birthDate); 
		System.out.println(years);
		System.out.println(days);
		
	    
	
	}

}
