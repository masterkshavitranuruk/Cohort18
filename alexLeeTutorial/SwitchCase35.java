package alexLeeTutorial;

	public class SwitchCase35 {
	public static void main(String[] args) {

// variable types ----> int /char/String 
// String(variable name){
//		case   :
//			break;
//			default:
//	}
		
		
		
//		Variable name in int
				
		 int day =3;
		 switch(day) {
		 case 1:
			 System.out.println("Sunday");
			 	break;
		 case 2:
			 System.out.println("Monday");
			 	break;	 
		 case 3:
				System.out.println("Tuesday");
				break;	  
		 case 4:
				System.out.println("Wednesday");
				break;	  
		 case 5:
				System.out.println("Thursday");
				break;	  
			 
		 case 6:
				System.out.println("Friday");
				break;	  
			 
		 case 7:
				System.out.println("Saturday");
				break;	  
		 default:
			 	System.out.println("Not valid number");
		 }
		 
// Variable name in String		 
		 String dog = "great dane";
		 switch(dog) {
			case "pomeranian":
				System.out.println("small dog");
				break;
			case "great dane":
				System.out.println("large dog");
				break;
			default:
				System.out.println("try a different dog name");
		 }
		 
		 
	}
}
