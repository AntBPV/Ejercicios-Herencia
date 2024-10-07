package NombrePackage;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor digite su primer nombre: ");
		String nombre = scanner.next();
		System.out.println("Por favor digite su primer apellido: ");
		String primer_Apellido = scanner.next();
		System.out.println("Por favor digite su segundo apellido: ");
		String segundo_Apellido = scanner.next();
		Nombre nombreCompleto = new Nombre(nombre,primer_Apellido,segundo_Apellido);
		
		System.out.println("");
		System.out.println("Por favor digite la calle de su direccion: ");
		String calle = scanner.next();
		System.out.println("Por favor digite su ciudad: ");
		String ciudad = scanner.next();
		System.out.println("Por favor digite su provincia: ");
		String provincia = scanner.next();
		System.out.println("Por favor digite su codigo Postal: ");
		int codigo_postal = scanner.nextInt();
		
		Direccion direccion = new Direccion(nombre,primer_Apellido,segundo_Apellido,
											calle,ciudad,provincia,codigo_postal);
		
		direccion.mostrar();
		
		scanner.close();
	}

}
