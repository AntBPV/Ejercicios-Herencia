package cilindroPackage;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el radio del circulo: ");
		double circuloRadio = scanner.nextDouble();
		Circulo circulo = new Circulo(circuloRadio);
		System.out.println("Area : "+circulo.getArea());
		System.out.println("Circunferencia : "+circulo.getCircunferencia());
		System.out.println("");
		
		System.out.println("Por favor ingrese el radio del cilindro: ");
		double cilindroRadio = scanner.nextDouble();
		System.out.println("Por favor ingrese la altura del cilindro: ");
		double cilindroAltura = scanner.nextDouble();
		Cilindro cilindro = new Cilindro(cilindroRadio,cilindroAltura);
		System.out.println("Area : "+cilindro.getArea());
		System.out.println("Volumen : "+cilindro.getVolumen());
		System.out.println("");
		
		System.out.println("Por favor ingrese el radio del cilindro hueco:");
		double huecoRadio = scanner.nextDouble();
		System.out.println("Por favor ingrese la altura del cilindro hueco:");
		double huecoAltura = scanner.nextDouble();
		System.out.println("Por favor ingrese el grosor del cilindro hueco:");
		double huecoGrosor = scanner.nextDouble();
		CilindroHueco hueco = new CilindroHueco(huecoRadio,huecoAltura,huecoGrosor);
		System.out.println("Circunferencia : "+hueco.getCircunferencia());
		System.out.println("Volumen : "+hueco.getVolumen());
		
		
		scanner.close();
	}

}
