package shapesPackage;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// ----------------------------------------------------------------------------------------
		// Circle instance
		System.out.println("Escriba el color del circulo: ");
		String circleColor = scanner.next();
		System.out.println("Esta el circulo lleno o no? Solo respuestas de si o no");
		String circleChoice = scanner.next();
		boolean circleFilled;
		if (circleChoice == "si" || circleChoice == "Si" || circleChoice == "SI") {
			circleFilled = true;
		} else {
			circleFilled = false;
		}
		System.out.println("Escriba el radio del circulo: ");
		double circleRadius = scanner.nextDouble();
		scanner.nextLine();
		
		Circle circle = new Circle(circleColor,circleFilled,circleRadius);
		System.out.println(circle);
		System.out.println("Area del circulo "+circle.getArea());
		System.out.println("Perimetro del circulo "+circle.getPerimeter());
		
		// End of circle instance
		// ----------------------------------------------------------------------------------------
		
		// ----------------------------------------------------------------------------------------
		// Rectangle instance
		System.out.println("Escriba el color del rectangulo: ");
		String rectangleColor = scanner.next();
		System.out.println("Esta el rectangulo lleno o no? Solo respuestas de si o no");
		String rectangleChoice = scanner.next();
		boolean rectangleFilled;
		if (rectangleChoice == "si" || rectangleChoice == "Si" || rectangleChoice == "SI") {
			rectangleFilled = true;
		} else {
			rectangleFilled = false;
		}
		System.out.println("Escriba el ancho del rectangulo: ");
		double rectangleWidth = scanner.nextDouble();
		System.out.println("Escriba el largo del rectangulo: ");
		double rectangleHeight = scanner.nextDouble();
		scanner.nextLine();
		
		Rectangle rectangle = new Rectangle(rectangleColor,rectangleFilled,rectangleWidth,rectangleHeight);
		System.out.println(rectangle);
		System.out.println("Area del rectangulo: "+rectangle.getArea());
		System.out.println("Perimetro del rectangulo: "+rectangle.getPerimeter());
		
		// End of rectangle instance
		// ----------------------------------------------------------------------------------------

		// ----------------------------------------------------------------------------------------
		// Square instance
		System.out.println("Escriba el color del cuadrado: ");
		String squareColor = scanner.next();
		System.out.println("Esta el cuadrado lleno o no? Solo respuestas de si o no");
		String squareChoice = scanner.next();
		boolean squareFilled;
		if (squareChoice == "si" || squareChoice == "Si" || squareChoice == "SI") {
			squareFilled = true;
		} else {
			squareFilled = false;
		}
		System.out.println("Escriba el largo del cuadrado: ");
		double squareSide = scanner.nextDouble();
		scanner.nextLine();
		
		Square square = new Square(squareColor,squareFilled,squareSide);
		System.out.println(square);
		System.out.println("Area del cuadrado: "+square.getArea());
		System.out.println("Perimetro del cuadrado: "+square.getPerimeter());
		
		// End of square instance
		// ----------------------------------------------------------------------------------------
		
		scanner.close();
	}

}
