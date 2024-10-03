package animalPackage;

public class Mammal extends Animal{
	public Mammal(String name) {
		super(name);
	}
	
	// toString Method
	@Override
	public String toString() {
		return "Mammal [" + super.toString() + "]";
	}
	
}
