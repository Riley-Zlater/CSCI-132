package hwrk8;

public class Node {
	
	// fields
	private int data;
	private Node next;
	private Node last;
	
	// constructor
	public Node(int data) {
		this.data = data;
				
	}
	
	// methods
	
	public void setLast(Node toLast) {
		this.last = toLast;
	}
	
	public Node getLast() {
		return this.last;
	}
	
	public void setNext(Node toHere) {
		this.next = toHere;
	}
	
	public int getData() {
		return this.data;
	}
	
	public Node getNext() {
		return this.next;
	}

}
