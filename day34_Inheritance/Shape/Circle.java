package day34_Inheritance.Shape;

public class Circle extends Shape {
	
	double radius;
	Circle() {
	}
	public Circle(String color, boolean isFilled, double radius) {
		super(color, isFilled);
		this.radius = radius;
	}

	public double getArea() {
		System.out.println("PI * radius * radius");
		return Math.PI * radius * radius;
	}
}
