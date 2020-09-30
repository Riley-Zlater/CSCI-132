package program4;

import java.util.*;
/**
 * This is the driver class that compares the time for running each method in microseconds.
 * Then categorizes them into the proper algorithm timing.
 * @author Riley
 *
 */
public class LinkedListVsArrayDemo {

	public static void main(String[] args) {
		
		// random to fill the data structures with random integers
		// scanner to get the index for getNth
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please choose an index less than 50000(Array): ");
		int ANth = input.nextInt();
		
		// Array Tests (55k slots)
		ArrayDS myArray = new ArrayDS(55000);
		
		// fill the array up to index 49999 with random integers
		for (int i = 0; i < 50000; i++) {
			myArray.addFirst(rand.nextInt(100));
		}
		
		// start the timer, add 15 to the front, end the timer
		long startArrayAddFirst = System.nanoTime();
		myArray.addFirst(15);
		long endArrayAddFirst = System.nanoTime();
		
		// start the timer, add 15 to the end, end the timer
		long startArrayAddLast = System.nanoTime();
		myArray.addLast(15);;
		long endArrayAddLast = System.nanoTime();

		// start the timer, find the integer at the inputed index, end the timer
		long startArrayGetNth = System.nanoTime();
		myArray.getNth(ANth);
		long endArrayGetNth = System.nanoTime();
		
		// subtract end timer from start timer to get time taken in nanoseconds
		// divide by 1000 to make microseconds
		long arrayAddFirstTime = (endArrayAddFirst - startArrayAddFirst) / 1000;
		long arrayAddLastTime = (endArrayAddLast - startArrayAddLast) / 1000;
		long arrayGetNthTime = (endArrayGetNth - startArrayGetNth) / 1000;
		
		// // timings of each test for array
		System.out.println("addFirst -- Array: " + arrayAddFirstTime + " microseconds");
		System.out.println("addLast -- Array: " + arrayAddLastTime + " microseconds");
		System.out.println("getNth -- Array: " + arrayGetNthTime + " microseconds\n");
		
		
		// Linked List Tests
		LinkedListDS<Integer> myList = new LinkedListDS<Integer>();
		
		System.out.println("Please choose a number less than 50000(LL): ");
		int LNth = input.nextInt();
		
		// makes the linked list hold 50000 random integers 
		for (int i = 0; i < 50000; i++) {
			myList.addFirst(rand.nextInt(100));
		}
		
		// start the timer, add 15 to the front, end the timer 
		long startListAddFirst = System.nanoTime();
		myList.addFirst(15);
		long endListAddFirst = System.nanoTime();
		
		// start the timer, add 15 to the end, end the timer
		long startListAddLast = System.nanoTime();
		myList.addLast(15);
		long endListAddLast = System.nanoTime();
		
		// start the timer, get the item at the inputed index, end the timer
		long startListGetNth = System.nanoTime();
		myList.getNth(LNth);
		long endListGetNth = System.nanoTime();
		
		// subtract end timer from start timer to get time taken in nanoseconds
		// divide by 1000 to make microseconds
		long listAddFirstTime = (endListAddFirst - startListAddFirst) / 1000;
		long listAddLastTime = (endListAddLast - startListAddLast) / 1000;
		long listGetNthTime = (endListGetNth - startListGetNth) / 1000;
		
		// timings of each test for linked list
		System.out.println("addFirst -- List: " + listAddFirstTime + " microseconds");
		System.out.println("addLast -- List: " + listAddLastTime + " microseconds");
		System.out.println("getNth -- List: " + listGetNthTime + " microseconds\n");
		
		// end results
		System.out.println("RESULTS:");
		System.out.println("ArrayDS.addFirst(): Linear Time");
		System.out.println("ArrayDS.addLast(): Constant Time");
		System.out.println("ArrayDS.GetNth(): Constant Time");
		System.out.println("-----");
		System.out.println("LListDS.addFirst(): Constant Time");
		System.out.println("LListDS.addLast(): Constant Time");
		System.out.println("LListDS.GetNth(): Quadratic Time");
		
		input.close();
	}
}
