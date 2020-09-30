package lab11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordSortDemo {

	public static void main(String[] args) throws IOException {
		
		ArrayList<String> text = new ArrayList<String>();
		StringLengthComparator comp = new StringLengthComparator();
		MergeSort merger = new MergeSort();
		
		File file = new File("Housman.txt");
		Scanner input = new Scanner(file);
		
		while (input.hasNext()) {
			text.add(input.next().toLowerCase().replaceAll("[^-a-z]", ""));
			
		}
		
		String[] myArray = new String[text.size()];
		for (int i = 0; i < text.size(); i++) {
			myArray[i] = text.get(i);
		}
		
		Collections.sort(text, comp);
		
		merger.merge(myArray, myArray, myArray, comp);
		System.out.println((myArray.length));
		
		PrintWriter writer = new PrintWriter (new FileWriter ("SortedByLength.txt"));
		PrintWriter writer2 = new PrintWriter (new FileWriter ("SortedByAlpha.txt"));
		
		for (String word:text)
			writer.println(word);
		for (String word2:myArray)
			writer2.println(word2);
		
		input.close();
		writer.close();
		writer2.close();
	}
}	
