package lab07;


public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		
		DoublyLinkedList<Integer> myList = new DoublyLinkedList<>();
		

		
		myList.addFirst(10);
		myList.addFirst(9);
		myList.addLast(11);
		
		System.out.println(myList);
		
		myList.add(1, 33);
		
		System.out.println(myList);
		
		myList.add(69);
		
		System.out.println(myList);
		
		//System.out.println(myList.set(2, 420));
		
		System.out.println(myList);
		
		//myList.clear();
		myList.add(34);
		
		System.out.println(myList);
		
	}

}
