package program5;

public class DLLQueue<E> implements Queue<E> {
	
	// Fields
	private DoublyLinkedList<E> list = new DoublyLinkedList<>();
	
	// Constructors
	
	/**
	 * This constructs the doubly linked list queue.
	 */
	public DLLQueue() {}
	
	// Methods
	
	/**
	 * This method checks the size of the list.
	 * @return This method returns the size of the list as an int.
	 */
	public int size() { return list.size(); }
	
	/**
	 * This method checks to see if the list is empty or not.
	 * @return This method returns a boolean depending on the list.
	 */
	public boolean isEmpty() { return list.isEmpty(); }
	
	/**
	 * This method adds elements to the end of the list.
	 */
	public void enqueue(E element) { list.addLast(element); }
	
	/**
	 * This method shows the first element in the list.
	 * @return This method returns the first element as an Element.
	 */
	public E first() { return list.first(); }
	
	/**
	 * This method removes elements from the start of the list.
	 * @return This method returns the Element removed.
	 */
	public E dequeue() { return list.removeFirst(); }
	
	/**
	 * This method overrides the default toString() method to format the list.
	 * @return This method returns the list formatted as a String.
	 */
	@Override
	public String toString() { return list.toString(); }

}
