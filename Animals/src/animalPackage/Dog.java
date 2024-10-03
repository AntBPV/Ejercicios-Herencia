package animalPackage;

public class Dog extends Mammal{
	public Dog(String name) {
		super(name);
	}
	
	public void greet() {
		System.out.println(this+" ha ladrado");
	}
	
	public void greet(Dog anotherDog) {
		System.out.println(this+" le ladra a "+anotherDog);
	}

	// toString Method
	@Override
	public String toString() {
		return "Dog [" + super.toString() + "]";
	}
	
}
