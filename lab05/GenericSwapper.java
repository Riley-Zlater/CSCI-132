package lab05;

import java.util.Arrays;

public class GenericSwapper {
	
	public static void swap(Object[] data, int a, int b) {
		
		// Tests to make sure swap index is within the proper range
		try {
			// Swaps the object at index a with the object at index b
			Object temp = data[a];
			data[a] = data[b];
			data[b] = temp;
			// Catches index out of bounds exception
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No swap happened because a requested index does not exist.");
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		
		// Creates Array of Integers
		Integer[] myIntegers = new Integer[10];
		for (int i = 0; i < myIntegers.length; i++) {
			myIntegers[i] = (i + 1) * 5;
		}
		
		// Displays Array of Integers
		System.out.println(Arrays.toString(myIntegers));
		// Swaps first and last elements of the Array of Integers
		GenericSwapper.swap(myIntegers,  0 ,  9);
		System.out.println(Arrays.toString(myIntegers));
		
		// Creates Array of Strings
		String[] myStrings = new String[5];
		myStrings[0] = "zero";
		myStrings[1] = "one";
		myStrings[2] = "two";
		myStrings[3] = "three";
		myStrings[4] = "four";
		
		// Displays Array of Strings
		System.out.println(Arrays.toString(myStrings));
		// Swaps first and last elements of the Array of Strings
		GenericSwapper.swap(myStrings, 0, 4);
		System.out.println(Arrays.toString(myStrings));
		
		// Creates an Array of Movies
		Movie[] myMovies = new Movie[5];
		myMovies[0] = new Movie("Free Solo", 2019);
		myMovies[1] = new Movie("The Godfather", 1972);
		myMovies[2] = new Movie("Zombieland", 2009);
		myMovies[3] = new Movie("Jojo rabbit", 2019);
		myMovies[4] = new Movie("Groundhog Day", 1993);

		// Displays Array of Movies
		System.out.println(Arrays.toString(myMovies));
		// Swaps first and last elements of the Array of Movies
		GenericSwapper.swap(myMovies, 0, 4);
		System.out.println(Arrays.toString(myMovies));
	}
}
