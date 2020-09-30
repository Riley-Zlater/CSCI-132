package program5;

public class ArrayStack<E> implements Stack<E>{

	// Fields
	public static final int CAPACITY = 1000;
	private E[] data;
	private int t = -1;
	
	// Constructors
	
	/**
	 * This constructs an array stack if the capacity is left empty.
	 */
	public ArrayStack() { this(CAPACITY);}
	
	/**
	 * This constructs an array stack with a given capacity.
	 * @param capacity This parameter is the size, int, of the array for the array stack.
	 */
	public ArrayStack(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	// Methods
	
	/**
	 * This method gives us the size of the filled slots in the array.
	 * @return This method returns the size filled as an int.
	 */
	public int size() { return (t + 1); }
	
	/**
	 * This method checks to see if the array is empty.
	 * @return This method returns a boolean.
	 */
	public boolean isEmpty() { return (t == -1); }
	
	/**
	 * This method adds elements to the end of the array.
	 */
	public void push(E e) throws IllegalStateException {
		if (size() == data.length) throw new IllegalStateException("Stack is full.");
		data[++t] = e;
	}
	
	/**
	 * This method looks at the last element in the array stack.
	 * @return This method returns the last Element in the array stack.
	 */
	public E peek() {
		if (isEmpty()) return null;
		return data[t];
	}
	
	/**
	 * This method removes elements from the end of the array stack.
	 * @return This method returns the Element being removed.
	 */
	public E pop() {
		if (isEmpty()) return null;
		E answer = data[t];
		data[t] = null;
		t--;
		return answer;
	}
	
	/**
	 * This method overrides the default toString method to format the array stack.
	 * @return This method returns the formatted array stack as a String.
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("(");
		int walk = 0;
		while (data[walk] != null) {
			sb.append(data[walk]);
			if (data[walk + 1] != null)
				sb.append(", ");
			walk++;
		}
		sb.append(")");
		return sb.toString();
	}
}
