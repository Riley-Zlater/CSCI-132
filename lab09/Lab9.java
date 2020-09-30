package lab09;

import java.util.Arrays;
import java.util.Random;

public class Lab9 {

	public static int check = 0;

	public static void main(String[] args) {
		
		int n = 1000;
		int target = 7;
		int[] myArray = new int[n];
		Random rand = new Random();
		
		for (int i = 0; i < n; i++) {
			myArray[i] = rand.nextInt(n);
		}
		
		long startIter = System.nanoTime();
		int iterativeTest = iterativeLinearSearch(myArray, target, n - 1);
		long endIter = System.nanoTime();
		long iterTime = (endIter - startIter) / 1000;
		System.out.println("***Iterative Linear Search***");
		System.out.println(Lab9.toString(target, iterativeTest, check, n, iterTime));
		check = 0;
		
		long startRec = System.nanoTime();
		int recursiveTest = recursiveLinearSearch(myArray, target, n - 1);
		long endRec = System.nanoTime();
		long recTime = (endRec - startRec) / 1000;
		System.out.println("***Recursive Linear Search***");
		System.out.println(Lab9.toString(target, recursiveTest, check, n, recTime));
		check = 0;
		
		long startSort = System.nanoTime();
		Arrays.sort(myArray);
		long endSort = System.nanoTime();
		long sortTime = (endSort - startSort) / 1000;
		System.out.println("***Java Array Sort***");
		System.out.println(sortTime + " microseconds to sort\n");
		
		long startBin = System.nanoTime();
		int binaryTest = binarySearch(myArray, target, 0, n - 1);
		long endBin = System.nanoTime();
		long binTime = (endBin - startBin) / 1000;
		System.out.println("***Binary Search***");
		System.out.println(Lab9.toString(target, binaryTest, check, n, binTime));
		
		long totalTime = sortTime + binTime;
		System.out.println(totalTime + " microseconds for Sort + Search");
	}
	
	public static int binarySearch(int[] data, int target, int low, int high) {
		check++;
		if (low > high)
			return -1;
		else {
			int mid = (low + high) / 2;
			if (target == data[mid])
				return mid;
			else if (target < data[mid]) 
				return binarySearch(data, target, low, mid - 1);
			else
				return binarySearch(data, target, mid + 1, high);
		}
	}
	
	public static int iterativeLinearSearch(int[] data, int target, int size) {
		for(int i = 0; i < size; i++) {
			check++;
			if (data[i] == target)
				return i;
			
		}
		return -1;
	}
	
	public static int recursiveLinearSearch(int[] data, int target, int size) {
		check++;
		if (size < 0)
			return -1;
		else if (data[size] == target)
			return size;
		return recursiveLinearSearch(data, target, size - 1);
	}
	
	public static String toString(int target, int index, int checker, int size, long time) {
		String results;
		results = "Target " + target + " found at index " + index + "\n";
		results += checker + " searches required for input size of " + size + "\n";
		results += time + " microseconds to search\n";
		return results;
	}
}