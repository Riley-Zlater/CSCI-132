package lab03;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class LocalDateDemo {
	
	// check out the Java API to see more about how to use the Period and LocalDate classes
	// https://docs.oracle.com/en/java/javase/11/docs/api/index.html

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();                  // Date today
		LocalDate bday = LocalDate.of(1972, Month.MAY, 3);  // Birth date (using enum type for month)
		Period difference = Period.between(bday, today);	// Amount of time

		System.out.println(difference.getDays());
		System.out.println(difference.getMonths());
		System.out.println(difference.getYears());
		System.out.println(bday.toString());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Month: ");
		int month = input.nextInt();
		
		System.out.print("Day: ");
		int day = input.nextInt();
		
		System.out.print("Year: ");
		int year = input.nextInt();
		
		LocalDate bornOn = LocalDate.of(year, month, day);
		Period age = Period.between(bornOn, today);
		System.out.println("Age is " + age.getYears() + " years.");

		input.close();
	}

}
