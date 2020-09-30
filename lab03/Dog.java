package lab03;

public class Dog extends Pet{
	
	public Dog (String dogName, int year, int month, int day) {
		super(dogName, year, month, day);
	}
	
	public int getAgeInHumanYears() {
		int age = super.getAge();
		int dogAge = 0;
		
		if (age == 1) { // The first year is worth 15 human years
			dogAge += 15;
		} else if (age == 2) { // The second year is worth 9 human years
			dogAge += 24;
		} else if (age > 2) { // Everything past year 2 is multiplied by 5 to get the human years
			dogAge += 24 + (age - 2) * 5;
		}
		return dogAge;
	}
}
