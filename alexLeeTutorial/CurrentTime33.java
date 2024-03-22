package alexLeeTutorial;

import java.text.SimpleDateFormat;
import java.util.Date;
//https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
public class CurrentTime33 {

	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println(currentDate);
		// hh:mm:ss  mm Lower case 
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		System.out.println(timeFormat.format(currentDate));
		// MM Upper case Month 
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(dateFormat.format(currentDate));
		
		
		SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
		System.out.println(dayOfTheWeekFormat.format(currentDate));

		SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
		System.out.println(clockFormat.format(currentDate));
	}

}
