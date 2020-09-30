package program4;
/**
 * Creates a linked list with three methods add first, add last, and get nth.
 * @author Riley
 *
 * @param <E> Uses E to be general.
 */
public class LinkedListDS<E> {
	
	// Simple Node class
	private static class Node<E> {
		
		// fields
		private E element;
		private Node<E> next;
		
		// constructor
		public Node(E e, Node<E> n) {
			this.element = e;
			this.next = n;
		}
		
		// methods
		public E getElement() {
			return this.element;
		}
		public Node<E> getNext() {
			return this.next;
		}
		public void setNext(Node<E> n) {
			this.next = n;
		}
		
	}
	// end Node class
	
	// Fields
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	
	/**
	 * Empty constructor.
	 */
	public LinkedListDS() {}
	
	/**
	 * This methods checks if the linked list is empty or not.
	 * @return Returns a boolean true if empty, false if not.
	 */
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	/**
	 * This method adds an element to the start of the linked list.
	 * @param e The element thats being added.
	 */
	public void addFirst(E e) {
		this.head = new Node<>(e, head);
		if (this.size == 0)
			this.tail = this.head;
		this.size ++;
	}
	
	/**
	 * This method adds an element to the very end of the linked list.
	 * @param e The element thats being added.
	 */
	public void addLast(E e) {
		Node<E> newest = new Node<>(e, null);
		if (this.isEmpty())
			this.head = newest;
		else
			this.tail.setNext(newest);
		this.tail = newest;
		this.size++;
	}
	
	/**
	 * THis method finds an element at a given index within the linked list.
	 * @param index The index that we're looking for.
	 * @return Returns the element at the index that we're looking for.
	 */
	public E getNth(int index) {
		Node<E> item = this.head;
		E output = null;
		int counter = 0;	
		while (item != null) {
			if (counter == index) {
				output = item.getElement();
			}
			counter++;
			item = item.getNext();
		}
		return output;	
	}

}
