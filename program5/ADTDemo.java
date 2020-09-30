package program5;

public class ADTDemo {

	public static void main(String[] args) {
		
		// Test Array Stack
		// ----------------
		ArrayStack<Object> testArrayStack = new ArrayStack<>();
		
		// five pushes of a variety of objects
		testArrayStack.push("one");
		testArrayStack.push(2.2);
		testArrayStack.push("three");
		testArrayStack.push(4);
		testArrayStack.push("five");
		
		// display
		System.out.println("Array Stack Testing");
		System.out.println("-------------------");
		System.out.println("Testing the array stack after pushing 5 objects: " + testArrayStack.toString());
		System.out.println("The size of the array stack: " + testArrayStack.size());
		System.out.println("Peek into the array stack: " + testArrayStack.peek());
		
		// pop/remove the last two objects pushed
		testArrayStack.pop();
		testArrayStack.pop();
		
		// display
		System.out.println("Testing the array stack after poping 2 objects: " + testArrayStack.toString());
		System.out.println("The size of the array stack: " + testArrayStack.size() + "\n");
		
		// Test Stack
		// ----------
		DLLStack<Object> dllTestStack = new DLLStack<>();
		
		// five pushes of a variety of objects
		dllTestStack.push("one");
		dllTestStack.push(2.2);
		dllTestStack.push("three");
		dllTestStack.push(4);
		dllTestStack.push("five");
		
		// display
		System.out.println("Doubly Linked List Stack Testing");
		System.out.println("--------------------------------");
		System.out.println("Testing the stack after pushing 5 objects: " + dllTestStack.toString());
		System.out.println("The size of the stack: " + dllTestStack.size());
		System.out.println("Peek into the stack: " + dllTestStack.peek());
		
		// pop/remove the last two objects pushed
		dllTestStack.pop();
		dllTestStack.pop();
		
		// display
		System.out.println("Testing the stack after poping 2 objects: " + dllTestStack.toString());
		System.out.println("The size of the stack: " + dllTestStack.size() + "\n");

		
		// Test Queue
		// ----------
		DLLQueue<Object> dllTestQueue = new DLLQueue<>();
		
		// five pushes of a variety of objects
		dllTestQueue.enqueue("one");
		dllTestQueue.enqueue(2.2);
		dllTestQueue.enqueue("three");
		dllTestQueue.enqueue(4);
		dllTestQueue.enqueue("five");
		
		// display
		System.out.println("Doubly Linked List Queue Testing");
		System.out.println("--------------------------------");
		System.out.println("Testing the queue after enqueueing 5 objects: " + dllTestQueue.toString());
		System.out.println("The Size of the queue: " + dllTestQueue.size());
		System.out.println("First in the queue: " + dllTestQueue.first());
		
		// pop/remove the first two objects pushed
		dllTestQueue.dequeue();
		dllTestQueue.dequeue();
		
		// display
		System.out.println("Testing the queue after dequeueing 2 objects: " + dllTestQueue.toString());
		System.out.println("The Size of the queue: " + dllTestQueue.size() + "\n");
		
		// Test Call Stack Validator
		CallStackValidator test = new CallStackValidator();	
		String input;
		System.out.println("Call Stack Validator Testing");
		System.out.println("----------------------------");
		System.out.println("Valid input results: ");
		
		// Valid Inputs
		input = "A calls B"
		+ "           B calls C"
		+ "               C halts"
		+ "           B halts"
		+ "      A halts";
		System.out.println(test.isValid(input));
		
		input = "A calls B B calls C C calls D D halts C calls E E halts C halts B halts A halts";
		System.out.println(test.isValid(input));
		
		input = "A calls A A halts A halts";
		System.out.println(test.isValid(input));
		
		input = "main calls functionA functionA calls testMe testMe halts functionA calls runRun runRun halts functionA halts main halts";
		System.out.println(test.isValid(input) + "\n");
		
		System.out.println("Invalid input results: ");
		
		// Invalid Inputs
		input = "main calls A A calls B A calls C B halts C halts A halts main halts";
		System.out.println(test.isValid(input));
		
		input = "A calls A A halts";
		System.out.println(test.isValid(input));
		
	}

}
