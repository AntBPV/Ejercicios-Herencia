package personPackage;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// ----------------------------------------------------------------------
		// Person instance
		System.out.println("Por favor digite su nombre: ");
		String personName = scanner.next();
		System.out.println("Por favor digite su direccion: ");
		String personAddress = scanner.next();
		scanner.nextLine();
		
		Person person = new Person(personName,personAddress);
		System.out.println(person);
		
		// End of person instance
		// ----------------------------------------------------------------------
		
		// ----------------------------------------------------------------------
		// Student instance
		System.out.println("");
		System.out.println("Por favor digite el nombre del estudiante: ");
		String studentName = scanner.next();
		System.out.println("Por favor digite la direccion: ");
		String studentAddress = scanner.next();
		System.out.println("Por favor digite el programa del estudiante: ");
		String program = scanner.next();
		System.out.println("Por favor ingrese el año cursado: ");
		int year = scanner.nextInt();
		System.out.println("Por favor ingrese la matricula: ");
		double fee = scanner.nextDouble();
		scanner.nextLine();

		
		Student student = new Student(studentName,studentAddress,program,year,fee);
		System.out.println(student);
		
		// End of person instance
		// ----------------------------------------------------------------------

		// ----------------------------------------------------------------------
		// Staff instance
		System.out.println("");
		System.out.println("Por favor digite el nombre del staff: ");
		String staffName = scanner.next();
		System.out.println("Por favor digite la direccion: ");
		String staffAddress = scanner.next();
		System.out.println("Por favor digite la institucion del staff: ");
		String school = scanner.next();
		System.out.println("Por favor digite su paga: ");
		double pay = scanner.nextDouble();
		scanner.nextLine();

		
		Staff staff = new Staff(staffName,staffAddress,school,pay);
		System.out.println(staff);
		
		// End of staff instance
		// ----------------------------------------------------------------------
		
		scanner.close();
	}
}
