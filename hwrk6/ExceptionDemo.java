package hwrk6;

import java.util.*;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		String[] book = new String[300];
		
		Scanner input = new Scanner(System.in);
		System.out.println("What page do you want? ");
		
		String userInput = input.next();
		
		int n = 0;
		String page = null;
		try {
			n = Integer.parseInt(userInput);
			ensurePositive(n);
			page = book[n];
		} catch (NumberFormatException thisException) {
			n = 1;
			//n = Math.round(Integer.parseInt(userInput));
			System.out.println("Setting to 1.");
			System.out.println(thisException.toString());
		} catch (IllegalArgumentException e) {
			n = Math.abs(n);
			System.out.println("Making it positive.");
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			n = book.length;
			page = book[-1];
			System.out.println("Using the last page.");
			System.out.println(e);
		}
		
		System.out.println("Here's page " + n);
		input.close();

	}
	
	public static void ensurePositive(int n) throws IllegalArgumentException{
		if (n < 0) {
			throw new IllegalArgumentException("Not a positive number." + n);
		}
	}

}
