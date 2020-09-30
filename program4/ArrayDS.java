package program4;
/**
 * This class creates an array data structure that can add an int to the front,
 * the end, and find a value at a given index.
 * @author Riley
 *
 */
public class ArrayDS {
	
	// Fields
	private int[] result;
	private int arrayLength = 0;
	
	/**
	 * Constructs the result array data structure with a given number of slots.
	 * @param amount The number of slots the array will be able to hold.
	 */
	public ArrayDS(int amount) {
		result = new int[amount];
	}
	
	/**
	 * This method adds a number to the from of the array (index 0).
	 * @param newNumber The number that's being added.
	 */
	public void addFirst(int newNumber) {
		
		if (arrayLength < result.length) 
			arrayLength++;
		
		int hold = arrayLength - 1;
		while (hold > 0) {
			result[hold] = result[hold - 1];
			hold--;
		}
		
		result[hold] = newNumber;
	}
	
	/**
	 * This method adds a number to the very end of the array.
	 * @param newNumber The number that's being added.
	 */
	public void addLast(int newNumber) {
		result[arrayLength] = newNumber;
	}
	
	/**
	 * Finds the value at a given index.
	 * @param index The index supplied by the user through a scanner input in the driver.
	 * @return Returns the int at a specified index of the result array.
	 */
	public int getNth(int index) {	
		return result[index];
	}

}
