package lab02;

import java.util.Scanner;

public class AnimalDemo {
	
	public static void main(String[] args) {
		
		// First Animal 
		// ------------
		Animal animal1 = new Animal(); // calls the other file with the name animal1
		
		Scanner name = new Scanner(System.in);
		System.out.println("What is the animals name?");
		String newName = name.next(); // asks for the new name
		
		animal1.setName(newName); // sets the new name
		
		Scanner age = new Scanner(System.in);
		System.out.println("What is the animals age?");
		int newAge = age.nextInt(); // asks for the new age
		
		animal1.setAge(newAge); // sets the new age
		
		Scanner species = new Scanner(System.in);
		System.out.println("What is the animals species?");
		String newSpecies = species.next(); // asks for the new species
		
		animal1.setSpecies(newSpecies); // sets the new species
		
		// closes all the Scanners
		name.close();
		age.close();
		species.close();
		
		// Second Animal
		// -------------
		Animal animal2 = new Animal("Jimmy", 3, "Squirrel"); // creates the second animal
		
		// Third Animal
		// ------------
		Animal animal3 = new Animal("Mini", 1, "Mouse"); // creates the third animal

		System.out.println(animal1); // prints the formatted results for animal1
		System.out.println(animal2); // prints the formatted results for animal2
		System.out.println(animal3); // prints the formatted results for animal3
	}

}
