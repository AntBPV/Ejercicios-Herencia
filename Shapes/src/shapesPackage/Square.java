package shapesPackage;

public class Square extends Rectangle{
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side,side);
	}
	
	public Square(String color, boolean filled, double side) {
		super(color,filled,side,side);
	}
	
	public double getSide() {
		return this.getWidth();
	}
	
	public void setSide(double side) {
		this.setWidth(side);
		this.setHeight(side);
	}

	@Override
	public String toString() {
		return "Square [" + super.toString() + "]";
	}
	
}
