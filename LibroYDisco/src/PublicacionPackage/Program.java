package PublicacionPackage;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor escriba el titulo del libro: ");
		String titulo = scanner.next();
		System.out.println("Por favor digite el precio del libro: ");
		float precio = scanner.nextFloat();
		System.out.println("Por favor digite la cantidad de paginas que tiene el libro: ");
		int numPaginas = scanner.nextInt();
		System.out.println("Por favor digite el año de publicacion del libro");
		int yrPublicacion = scanner.nextInt();
		
		Libro libro = new Libro(titulo,precio,numPaginas,yrPublicacion);
		
		System.out.println("Mostrando libro...");
		libro.mostrar();
		
		String discoTitulo = "Cancioncillas";
		float discoPrecio = 10500;
		float duracionMin = (float) 30.2;
		Disco disco = new Disco(discoTitulo, discoPrecio, duracionMin);
		
		System.out.println("Mostrando disco...");
		disco.mostrar();
		
		scanner.close();
	}

}
