package hwrk1;

import java.util.Scanner;

public class ForLoopArrayDemo {

	public static void main(String[] args) {
		
		
		// Makes list of strings
		String[] myGroceries = {"bread", "milk", "eggs", "bacon", "cheese"};
		
		//System.out.println(myGroceries[1]);
		
		// Uses length operand and a for loop to loop through the list
		for (int i = 0; i < myGroceries.length; i++) {
			System.out.println(myGroceries[i]);
		}
		
		// Another method to loop through a list of Strings
		for (String foods : myGroceries) {
			System.out.println(foods);
		}
		
		// Another example of for loop to loop through numbers
		for (int number = 1; number < 10; number += 2) {
			System.out.println(number);
		}
		
		// Uses scanner to ask an input
		Scanner input = new Scanner(System.in);
		System.out.println("What's your name?");
		String yourName = input.next();
		
		System.out.println("Hi, " + yourName + ". You're a half-wit.");
		
		input.close();
		
		//--------------------------------------------
		
		// Casting a float/double to an integer
		double myDouble = 3.14;
		System.out.println(myDouble);
		System.out.println((int)myDouble);
		
		// Casting a integer to a float/double
		int myInt = 2;
		System.out.println(myInt);
		System.out.println((double)myInt);
		
	}

}
