package lab11;

import java.util.Comparator;

public class MergeSort {
	
	public static <E> void merge(E[] S1, E[] S2, E[] S, Comparator<E> comp) {
		
		int i = 0, j = 0;
		
		while (i + j < S.length) {
			if (j == S2.length || (i < S1.length && comp.compare(S1[i], S2[j]) < 0))
				S[i+j] = S1[i++];
			else
				S[i+j] = S2[j++];
		}
	}

	public void merge(String[] myArray1, String[] myArray2, String[] myArray, Comparator<String> comp) {
		
		int split1 = 0, split2 = 82;
		
		while (split1 + split2 < myArray.length) {
			if (split2 == myArray2.length || (split1 < myArray1.length) && comp.compare(myArray[split1], myArray2[split2]) < 0)
				myArray[split1 + split2] = myArray1[split1++];
			else
				myArray[split1 + split2] = myArray2[split2++];
		}
		
	}
}