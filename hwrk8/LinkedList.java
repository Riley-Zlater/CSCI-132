package hwrk8;

public class LinkedList {
	
	// fields
	private Node first;
	
	// constructor
	public LinkedList() {}
	
	// methods
	public void add(int number) {
		Node n = new Node(number);
		if(this.first==null) {
			this.first=n;
			this.first.setNext(this.first);
			this.first.setLast(this.first);
			return;
		}
		first.setNext(n);
		n.setLast(first);
		this.first = n;
	}
	
	@Override
	public String toString() {
		Node hop = this.first;
		String output = "";
		if(first != null) {
			output+=hop.getData()+" -> ";
			hop = hop.getNext();
		}
		else {
			System.out.println("y");
			return "you messed up";
		}
		while (hop != first) {
			output += hop.getData() + " -> ";
			hop = hop.getNext();
			System.out.println(hop.getNext().getData());
		}
		return output;
	}

}
