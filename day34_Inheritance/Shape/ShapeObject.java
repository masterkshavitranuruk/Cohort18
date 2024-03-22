package day34_Inheritance.Shape;

public class ShapeObject {

	public static void main(String[] args) {
		
	    Shape s = new Shape("Blue", true);
	    System.out.println(s.getColor());
	    System.out.println(s.isFilled());
	    System.out.println("---------------");
		
		Circle c = new Circle("red",true,2.2);
		System.out.println(c.getColor());
	    System.out.println(c.isFilled());
	    System.out.println("---------------");
	      
	    Rectangle r = new Rectangle("",true,1,5);
		System.out.println(r.getColor());
	    System.out.println(r.isFilled());
	    System.out.println("---------------");  
	      
	      
	      
	}

}
 	