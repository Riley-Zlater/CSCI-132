package lab03;

import java.time.LocalDate;
import java.time.Period;

public abstract class Pet {
	
	// Fields
	private String name;
	private LocalDate dob;
	
	// Constructor
    public Pet (String n, int y, int m, int d) {
        this.name = n;
        this.dob = LocalDate.of(y, m, d);
    }
    
    // Methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDob(int y, int m, int d) {
    	this.dob = LocalDate.of(y, m, d);
    }
    
    /**
     * First gets the current date then uses the Period.between to  find the difference 
     * between the Pets date of birth and the current date
     */
    public int getAge() {
    	LocalDate currentDay = LocalDate.now();
    	Period age = Period.between(this.dob, currentDay);
    	return age.getYears();
    }
    abstract public int getAgeInHumanYears();
    	// TODO: provide concrete methods by creating Cat and Dog classes to extend Pet.
    	// https://www.akc.org/expert-advice/health/how-to-calculate-dog-years-to-human-years/
    	// https://www.purina.co.uk/cats/key-life-stages/ageing/cats-age-in-human-years
    	
}
