package shapesPackage;

public class Circle extends Shape{
	private double radius;
	
	// Constructors
	public Circle() {
		super();
		this.radius=1.0;
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(String color, boolean filled, double radius) {
		super(color,filled);
		this.radius = radius;
	}
	
	// Getters and Setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Get area Method
	public double getArea() {
		double area = Math.PI * Math.pow(this.radius, 2);
		return area;
	}
	
	// Get perimeter method
	public double getPerimeter() {
		double perimeter = 2.0 * Math.PI * this.radius;
		return perimeter;
	}

	@Override
	public String toString() {
		return "Circle [Shape[color="+this.getColor()+", filled="+this.isFilled()+"], radius=" + radius + "]";
	}	
}
