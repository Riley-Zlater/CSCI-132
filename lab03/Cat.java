package lab03;

public class Cat extends Pet{
	
	public Cat (String catName, int year, int month, int day) {
		super(catName, year, month, day);
	}
	
	public int getAgeInHumanYears() {
		int age = super.getAge();
		int catAge = 0;
		
		if (age == 1) { // The first two years of the cats life are worth 25 human years
			catAge += 15;
		} else if (age == 2) {
			catAge += 25;
		} else { // Everything after that is multiplied by 4
			catAge += 40 + (age - 2) * 4;
		}
		return catAge;
	}

}
