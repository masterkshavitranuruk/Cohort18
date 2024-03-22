package day34_Inheritance.Shape;

public class Rectangle extends Shape {
		Rectangle (){}
		double sideA;
	    double sideB;
	        
	    public Rectangle(String color, boolean isFilled , double sideA, double sideB) {
	        super(color, isFilled);
	        this.sideA = sideA;
	        this.sideB = sideB;
	    }
	    
	    public double getArea() {
	        System.out.println("Area of Rectangle");
	        return sideA * sideB;
	    }
	    
}
