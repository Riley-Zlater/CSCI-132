package hwrk9;

import java.util.Arrays;

public class CloningTester {

	public static void main(String[] args) {
		
		int[] data = {2, 3, 4, 5, 7, 11, 13, 17, 19};
		int[] backup;
		
		backup = data.clone();
		
		data[3] = 100;
		
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.toString(backup));


	}

}
