package lab1;


public class Circle {
	private double radius;
	   
    public Circle(double r) {
    	radius=r;
    }
    
    public double getRadius() {
    	return radius;
    }
    public void setRadius(double ra) {
    	radius=ra;
    }
    public double getArea() {
    	return radius*radius*Math.PI;
    }
    
    public void displayObject() {
    	System.out.println("Circle has radius " + getRadius() + "it's area is " + getArea());
    }
    
    
}
