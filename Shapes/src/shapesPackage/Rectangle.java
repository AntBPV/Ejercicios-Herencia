package shapesPackage;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle() {
		super();
		this.width = 1.0;
		this.height = 1.0;
	}
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(String color, boolean filled, double width, double height) {
		super(color,filled);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	// Get area method
	public double getArea() {
		double area = this.width * this.height;
		return area;
	}
	
	// Get perimeter method
	public double getPerimeter() {
		double perimeter = (2*this.width)+(2*this.height);
		return perimeter;
	}

	// toString method
	@Override
	public String toString() {
		return "Rectangle [Shape[color="+this.getColor()+", filled="+this.isFilled()+"], width=" + width + ", height=" + height + "]";
	}
	
}
