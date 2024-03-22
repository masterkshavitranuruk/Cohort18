package day34_Inheritance.Shape;

public class Shape {
	
	private String color;
	private boolean isFilled = false;
	
	public Shape() {}
	
	public Shape(String color, boolean isFilled) {
		this.color = color;
		this.isFilled = isFilled;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return isFilled;
	}
	public void setFilled(boolean isFilled) {
		if(isFilled = true) {
		this.isFilled = isFilled;
		}else {
			
		System.out.println("this Shape is not filled with color.");	
		}
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + ", isFilled=" + isFilled + "]";
	}
	
	 
    public double getArea() {
        System.out.println("Area of a Shape");
        return 0;
    }
    

}
