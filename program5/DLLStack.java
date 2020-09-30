package program5;

public class DLLStack<E> implements Stack<E> {
	
	// Fields
	private DoublyLinkedList<E> list = new DoublyLinkedList<E>();
	
	// Constructors
	
	/**
	 * This constructs the doubly linked list stack.
	 */
	public DLLStack() {}
	
	// Methods
	
	/**
	 * This method gives the size of the list.
	 * @return This method returns the size of the list as an int.
	 */
	public int size() { return list.size(); }
	
	/**
	 * This method checks to see if the list is empty.
	 * @return This method returns the answer as a boolean.
	 */
	public boolean isEmpty() { return list.isEmpty(); }
	
	/**
	 * This method adds elements to the beginning of the list.
	 */
	public void push (E element) { list.addFirst(element); }
	
	/**
	 * This method looks at the the first element in the list.
	 * @return This method returns the first element in the list.
	 */
	public E peek () { return list.first(); }
	
	/**
	 * This method removes the first element in the list.
	 * @return This method returns the Element thats removed.
	 */
	public E pop() { return list.removeFirst(); }
	
	/**
	 * This method overrides the default toString method and formats the output.
	 * @return This method returns the formatted list as a String.
	 */
	@Override
	public String toString() { return list.toString(); }

}
