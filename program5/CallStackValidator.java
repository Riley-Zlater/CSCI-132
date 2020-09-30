package program5;

import java.util.Scanner;

public class CallStackValidator {

	/**
	 * This constructs the call stack validator.
	 */
	public CallStackValidator() {}
	
	/**
	 * This method check to see if the inputed string matches the parameters of a stack data structure.
	 * @param calls This parameter is the inputed string being tested.
	 * @return This method returns a boolean.
	 */
	public static boolean isValid(String calls) {
		
		Scanner callString = new Scanner(calls);
		DLLStack<String> buffer = new DLLStack<>();
		String nextToken = "";

		if (callString.hasNext())
			buffer.push(callString.next());

		while (callString.hasNext()) {
			nextToken = callString.next();
			if (nextToken.equals("calls")) {
				buffer.push(callString.next());
			}
			else if (nextToken.equals("halts")) {
				buffer.pop();
			}
			else {
				if (buffer.isEmpty())
					return false;
				if (!nextToken.equals(buffer.peek()))
					return false;
			}
		}
		return buffer.isEmpty();
	}
}
