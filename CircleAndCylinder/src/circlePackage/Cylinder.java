package circlePackage;

public class Cylinder extends Circle {
	private double height;
	
	// Constructors
	public Cylinder() {
		this.height = 1.0;
	}
	
	public Cylinder(double height) {
		this.height = height;
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double radius, double height, String color) {
		super(radius,color);
		this.height = height;
	}
	
	// Getters and Setters
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	// Method Get Volume
	public double getVolume() {
		double area = this.getArea();
		return area * this.height;
	}
}
