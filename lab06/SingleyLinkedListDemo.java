package lab06;

public class SingleyLinkedListDemo {

	public static void main(String[] args) {
		
		SingleyLinkedList<String> myAirportsList = new SingleyLinkedList<>();
		myAirportsList.addFirst("BZN");
		myAirportsList.addLast("LAX");
		myAirportsList.addLast("SLC");
		myAirportsList.removeFirst();
		
		System.out.println(myAirportsList.toString());
		
		System.out.println(myAirportsList.get(1));
		
		SingleyLinkedList<Movie> myWatchList = new SingleyLinkedList<>();
		
		myWatchList.addFirst(new Movie("Pineapple Express", 2008));
		myWatchList.addFirst(new Movie("My Neighbor Totoro", 1993));
		myWatchList.addLast(new Movie("Howl's Moving castle", 2005));
		
		System.out.println(myWatchList.toString());
		
		System.out.println(myWatchList.get(0));
		System.out.println(myWatchList.get(1));

	}

}
