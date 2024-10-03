package animalPackage;

public class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}

	// toString method
	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
}
