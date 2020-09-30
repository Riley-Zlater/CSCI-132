package lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BikeReservations {

	// Fields

	final static int NUMBIKES = 5;

	// Constructor

	public BikeReservations() {

		Scanner input = new Scanner(System.in);
		String menuChoice = "";
		String firstName, lastName;
		double hoursRented;
		int bikeIndex;
		BikeRental newBike;
		ArrayList<BikeRental> bikeListing = new ArrayList<>();

		// Initialize the ArrayList by adding all NUMBIKES bikes
		this.addBikes(bikeListing);

		// Introductory Message
		System.out.println("*** Welcome Valued Employee! ***\n");
		System.out.println("We currently have " + NUMBIKES + " bikes available for rent.");
		System.out.println("Remember, bikes are numbered begining with zero.");
		System.out.println("Please wash hands after every transaction.");
		System.out.println("Safty is everyone's responsibility. --Mgmt");

		// User Menu
		while (!menuChoice.equals("Q")) {
			System.out.println();
			System.out.print("(A)vailability, (L)isting, (R)eserve Bike, (C)heck In, or (Q)uit > ");
			menuChoice = input.next().toUpperCase();

			if (menuChoice.equals("A"))
				this.bikeSelection(bikeListing);
			else if (menuChoice.equals("L")) {
				printBikeListing(bikeListing);
			} 
			else if (menuChoice.equals("R")) {
				System.out.print("Bike Number: ");

				while (!input.hasNextInt()) {
					input.next();
					System.out.println("Enter a valid Integer: ");
				}
				
				bikeIndex = input.nextInt();

				if (bikeIndex > (NUMBIKES - 1)) {
					try {
						bikeListing.get(bikeIndex);
					} catch (IndexOutOfBoundsException e) {
						System.out.println("Enter a number between 0 and " + (NUMBIKES - 1));
					}
				}
				else if (!bikeListing.get(bikeIndex).isAvailable()) {
					System.out.println("Sorry, that bike is already checked out.");
				}
				else {

					System.out.print("First name: ");
					firstName = input.next();
					System.out.print("Last name: ");
					lastName = input.next();
					System.out.print("Hours rented: ");
					
					// Ensure user enters an double
					while (!input.hasNextDouble()) { 
						input.next();
						System.out.println("Enter hours");
					}
					hoursRented = input.nextDouble();
	
					newBike = new BikeRental();
					newBike.checkBikeOut(firstName, lastName, hoursRented);
					bikeListing.set(bikeIndex, newBike);
					System.out.println("Reservation Complete.");
				}

			} else if (menuChoice.equals("C")) {
				System.out.println("Bikes rented: " + BikeRental.getNumRented());
				

				if (BikeRental.getNumRented() == 0) {
					System.out.println("No bikes are checked out.");
				}
				else {
					System.out.print("Which bike is being returned?\n");

					while (!input.hasNextInt()) {
						input.next();
						System.out.println("Enter a valid Integer: ");
					}
					
					bikeIndex = input.nextInt();
					
					if (bikeIndex > (NUMBIKES - 1)) {
						try {
							bikeListing.get(bikeIndex);
						} catch (IndexOutOfBoundsException e) {
							System.out.println("Enter a number between 0 and " + (NUMBIKES - 1));
						}
					}
					else if (bikeListing.get(bikeIndex).isAvailable()) {
						System.out.println("That bike is already in.");
					}
					else {
						bikeListing.get(bikeIndex).checkBikeIn();
					}
				}
			} 
			else if (menuChoice.equals("Q")) {
				System.out.println("<end>");
			} 
			else {
				System.out.println("Choose P, C, R, or Q");
			}
		}
		input.close();

	}

	// Methods

	public void addBikes(ArrayList<BikeRental> bikes) {
		for (int i = 0; i < NUMBIKES; ++i) {
			bikes.add(new BikeRental());
		}
	}

	public void bikeSelection(ArrayList<BikeRental> bikes) {
		for (int i = 0; i < bikes.size(); ++i) {
			if (bikes.get(i).isAvailable())
				System.out.println("Bike " + i + " is available for rent.");
		}
	}

	public void printBikeListing(ArrayList<BikeRental> bikes) {
		System.out.println("Bike	First	Last	Hours");
		for (int i = 0; i < bikes.size(); i++) {
			System.out.print(i + "	");
			bikes.get(i).printReservation();
		}
	}

	public static void main(String[] args) {

		new BikeReservations();
	}

}
