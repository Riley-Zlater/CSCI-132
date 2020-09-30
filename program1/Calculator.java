package program1;

import java.util.Scanner;

public class Calculator {

	// FIELDS
	/**
	 * Makes ROUGHLY_PI a constant equal to the fifth decimal place of pi
	 */
	public final double ROUGHLY_PI = 3.1415;
	private double answer;
	private Scanner scannedInput = new Scanner(System.in);
	public final String usageInstructions = "Valid operations are: \n"
			+ " + \t add \n - \t subtract \n * \t multiply \n / \t divide \n"
			+ " c \t clear  \n neg \t negate \n % \t percent \n"
			+ " ^ \t raise to power of next value entered \n inv \t invert the current value \n"
			+ " rand \t radomize current value by a fractional amount \n"
			+ " round \t round to number of places given next \n" + " = \t print answer \n ? \t Help \n q \t Quit \n";

	// CONSTRUCTORS
	Calculator() {
		this.answer = 0;
	};

	// METHODS
	// prompt user for a double and check before returning
	public double getUserNum() {
		boolean validNumber = false;
		double userVal = 0;

		System.out.print("Enter number\n>>> ");

		while (validNumber == false) {
			if (scannedInput.hasNext("pi")) {
				userVal = ROUGHLY_PI;
				scannedInput.next();
				validNumber = true;
			} else if (scannedInput.hasNextDouble()) {
				userVal = scannedInput.nextDouble();
				validNumber = true;
			} else {
				System.out.print("That's not a number. \nEnter a valid number\n>>> ");
				scannedInput.next();
			}
		}
		return userVal;
	}

	// prompt user for operation and check before returning
	public String getUserOp() {
		String op;

		System.out.print("Enter operation\n>>> ");
		op = scannedInput.next();
		while (!(this.checkUserOp(op))) {
			op = scannedInput.next();
		}
		return op;
	}

	// private helper method for getUserInput()
	private boolean checkUserOp(String op) {
		if (op.equals("+") || op.equals("-") || op.equals("=") || op.equals("?") || op.equals("Q") || op.equals("q")
				|| op.equals("*") || op.equals("/") || op.equals("c") || op.equals("C") || op.equals("neg")
				|| op.equals("%") || op.equals("^") || op.equals("inv") || op.equals("rand") || op.equals("round")) {
			return true;
		} else {
			System.out.print("Invalid Entry. Enter '?' for help." + "\nEnter a valid operation \n>>> ");
			return false;
		}
	}

	public double calculateAnswer(String op, double num) {
		switch (op) {
		case "+":
			add(num);
			break;
		case "-":
			subtract(num);
			break;
		case "*":
			multiply(num);
			break;
		case "/":
			divide(num);
			break;
		case "c":
		case "C":
			clear(num);
			break;
		case "neg":
			negative(num);
			break;
		case "%":
			percent(num);
			break;
		case "^":
			toPower(num);
			break;
		case "inv":
			invert(num);
			break;
		case "rand":
			randomize(num);
			break;
		case "round":
			roundTo(num);
			break;
		case "=":
			printAnswer();
			break;
		case "?":
			System.out.println(this.usageInstructions);
			break;
		default:
			System.out.println("Invalid Operator");
		}
		return this.answer;
	}
	
	/**
	 * updates this.answer after adding the input/operand to it
	 * @param double operation
	 * @return double answer
	 */
	public double add(double operand) {
		this.answer += operand;
		return this.answer; 
	}
	
	/**
	 * updates this.answer after subtracting the operand from it
	 * @param double operation
	 * @return double answer
	 */
	public double subtract(double operand) {
		this.answer -= operand;
		return this.answer;
	}
	
	/**
	 * the multiply method updates this.answer after multiplying it by the operand
	 * @param double operation
	 * @return double answer
	 */
	public double multiply(double operand) {
		this.answer = this.answer * operand; 
		return this.answer;
	}
	
	/**
	 * the divide method updates this.answer after dividing it by the operand
	 * @param double operation
	 * @return double answer
	 */
	public double divide(double operand) {
		this.answer = this.answer / operand;
		return this.answer;
	}
	
	/**
	 * the clear method resets this.answer to 0
	 * @param double operation
	 * @return double answer
	 */
	public double clear(double operand) {
		this.answer = 0;
		return this.answer;
	}
	
	/**
	 * the negative method multiplies this.answer by -1 to make it negative
	 * @param double operation
	 * @return double answer 
	 */
	public double negative(double operand) {
		this.answer = this.answer * -1;
		return this.answer;
	}
	
	/**
	 * the percent method divides this.answer by 100 to make a percent
	 * @param double operation
	 * @return double answer
	 */
	public double percent(double operand) {
		this.answer = this.answer / 100;
		return this.answer;
	}
	
	/**
	 * the toPower method uses Math.pow to raise this.answer to the operand
	 * @param double operation
	 * @return double answer
	 */
	public double toPower(double operand) {
		this.answer = Math.pow(this.answer, operand);
		return this.answer;
	}
	
	/**
	 * the invert method does 1 divided by this.answer to make it inverted
	 * @param double operation
	 * @return double answer
	 */
	public double invert(double operand) {
		this.answer = 1 / this.answer;
		return this.answer;
	}
	
	/**
	 * the roundTo method rounds this.answer to the operand/input number many decimal places
	 * raises the check variable to the power of the operand
	 * then multiplies this.answer by check
	 * uses Math.round to round to the nearest integer
	 * divides this.answer by check to get it back to decimal form
	 * @param double operation
	 * @return double answer
	 */
	public double roundTo(double operand) {
		double check = 10;	
		check = Math.pow(check, operand);

		this.answer = this.answer * check;
		this.answer = Math.round(this.answer);
		this.answer = this.answer / check;
		return this.answer;
	}
	
	/**
	 * the randomize method uses Math.random to make a random number
	 * between 0 and 1 if the number is greater than .5 add it to this.answer
	 * otherwise subtract it from this.answer
	 * @param double operation
	 * @return double answer
	 */
	public double randomize(double operand) {
		double rando = Math.random();
		
		if (rando > .5) {
			this.answer += rando;
		} else {
			this.answer -= rando;
		}
		return this.answer;
	}

	public double getAnswer() {
		return this.answer;
	}

	/**
	 * the printAnswer method formats the proper display for the calculator
	 * it uses %24s to first format this.answer to correctly fit inside the box
	 * then %s to display the vertical bar/pipe after this.answer
	 */
	public void printAnswer() {
		System.out.println("\n┌──────────────────────────┐"); 
		System.out.printf("| %24s %s", this.answer, "|");
		System.out.println("\n└──────────────────────────┘");
	}

}
