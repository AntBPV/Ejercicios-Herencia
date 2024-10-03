package animalPackage;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// -----------------------------------------------------------------------------
		// Cat instance
		System.out.println("Escriba el nombre del gato: ");
		String catName = scanner.next();
		
		Cat cat = new Cat(catName);
		System.out.println(cat);
		cat.greets();
		
		// End of cat instance
		// -----------------------------------------------------------------------------
		
		// -----------------------------------------------------------------------------
		// Dog instances
		System.out.println("Escriba el nombre del primer perro: ");
		String dogName1 = scanner.next();
		Dog dog1 = new Dog(dogName1);
		dog1.greet();
		
		System.out.println("Escriba el nombre del otro perro: ");
		String dogName2 = scanner.next();
		Dog dog2 = new Dog(dogName2);
		dog1.greet(dog2);
		
		// End of dog instances
		// -----------------------------------------------------------------------------
		
		scanner.close();
	}

}
