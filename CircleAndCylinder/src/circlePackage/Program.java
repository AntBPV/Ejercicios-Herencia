package circlePackage;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// ----------------------------------------------------------------------
		// Circle instance
		System.out.println("Cual es el radio del circulo: ");
		double circleRadius = scanner.nextDouble();
		System.out.println("Cual es el color del circulo: ");
		String circleColor = scanner.next();
		
		Circle circle = new Circle(circleRadius,circleColor);
		System.out.println(circle);
		System.out.println("Area del circulo: ");
		System.out.println(circle.getArea());
		
		// End of circle instance
		// ----------------------------------------------------------------------

		// ----------------------------------------------------------------------
		// Cylinder instance, we will use the same attributes for circle and cylinder
		System.out.println("Cual es la altura para convertir el circulo en cilindro: ");
		double cylinderHeight = scanner.nextDouble();		
		Cylinder cylinder = new Cylinder(circleRadius, cylinderHeight, circleColor);
		System.out.println(cylinder);
		System.out.println(cylinder.getVolume());
		
		// End of cylinder instance
		// ----------------------------------------------------------------------
		
		scanner.close();
	}

}
