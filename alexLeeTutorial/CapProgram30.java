package alexLeeTutorial;

public class CapProgram30 {

	public static void main(String[] args) {
		String s = "happy birthday";
		System.out.println(s.length()); //14
		
//		s.substring(1) appy birthday		
		System.out.println(s.substring(1));
		
//		happy
		System.out.println(s.substring(0,5));
//	Happy birthday	
		String result = s.substring(0,1).toUpperCase()+s.substring(1);
		System.out.println(result);

	}

}
