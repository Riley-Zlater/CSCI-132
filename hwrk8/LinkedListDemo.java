package hwrk8;

import java.util.Arrays;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		LinkedList myIntsList = new LinkedList();
		
		int myIntsArray[] = new int [15];
		
		for (int i = 0; i < 15; i++) {
			myIntsArray[i] = (i * 20);
		}
		
		System.out.println(Arrays.toString(myIntsArray));
		
		for (int i = 0; i < 15; i++) {
			myIntsList.add(i * 20);
		}
		
		System.out.println(myIntsList.toString());

	}

}
