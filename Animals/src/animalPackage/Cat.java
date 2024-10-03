package animalPackage;

public class Cat extends Mammal{
	public Cat(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println(this+ " ha maullado");
	}

	
	// toString Method
	@Override
	public String toString() {
		return "Cat [" + super.toString() + "]";
	}
	
}
