package lab02;

public class Animal {
	
	
	// Data Fields
	// -----------
	private int age;
	private String name;
	private String species;
	
	public Animal() {
		name = "Unnamed";
		age = -1;
		species = "Unknown";
	}
	
	public Animal(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
	}
	
	// Get Methods
	// -----------
	public String getName() { // returns animal name
		return name;
	}
	
	public int getAge() { // returns the animals age
		return age;
	}
	
	public String getSpecies() { // returns the animals species
		return species;
	}
	
	// Set Methods
	// -----------
	public void setName(String newName) { // sets the new animal name
		name = newName;
	}
	
	public void setAge(int newAge) { // sets the new animal age
		age = newAge;
	}
	

	public void setSpecies(String newSpecies) { // sets the animals species
		species = newSpecies;
	}
	
	// Formats output
	public String toString() {
		String result = "Name: " + name + ". Age: " + age + ". Species: " + species + ".";
		return result;
	}

}
