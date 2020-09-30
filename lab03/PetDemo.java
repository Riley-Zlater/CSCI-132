package lab03;

public class PetDemo {

	public static void main(String[] args) {
		
		// You will fix this by creating Cat and Dog classes.
		// No need to modify this file.
		
		Pet pet1 = new Dog("Chuki", 2016, 03, 03);
		Pet pet2 = new Cat("Aspen", 2009, 11, 20);
		
		System.out.println(pet1.getName() + " is " + pet1.getAgeInHumanYears() + " in human years.");
		System.out.println(pet2.getName() + " is " + pet2.getAgeInHumanYears() + " in human years.");
		
		pet2.setName("Old Aspy");
		System.out.println(pet2.getName() + " is actually " + pet2.getAge() + " years old.");
	}

}