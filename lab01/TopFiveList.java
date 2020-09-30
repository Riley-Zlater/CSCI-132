package lab01;

import java.util.Scanner;

public class TopFiveList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Makes the topFive list of foods
		String[] topFive = {"Pie", "Cheese", "Carrots", "Pineapple", "Cake"};
		
		// Displays the list using a for loop
		int number = 1;
		System.out.println("Top Five Foods");
		System.out.println("--------------");
		for (String foods : topFive) {
			System.out.println(number + ". " + foods);
			number += 1;
		}
		
		// Formatting gap
		System.out.println();
		
		// Uses Scanner to get an input and assigns the input to newPosition
		Scanner position = new Scanner(System.in);
		System.out.println("What position would you like to replace?");
		String newPosition = position.next();
		
		// Makes the string, newPosition, an integer and renames it to newSpot
		int newSpot = Integer.parseInt(newPosition);
		
		// Formatting gap
		System.out.println();
		
		// Uses Scanner to get an input and assigns the input to newFood
		Scanner input = new Scanner(System.in);
		System.out.println("What food should replace #"+newSpot+"?");
		String newFood = input.next();
		
		// Replaces the newSpot value in the topFive list with newFood
		topFive[newSpot-1] = newFood;
		
		// Closes input and position scanners
		input.close();
		position.close();
		
		//Formatting gap
		System.out.println();
		
		// Displays the updated topFive list
		number = 1;
		System.out.println("New Top Five Foods");
		System.out.println("------------------");
		for (String foods : topFive) {
			System.out.println(number + ". " + foods);
			number += 1;
		}

	}

}
