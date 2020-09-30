package lab08;
import java.util.Random;
public class PrefixAverages {
	
	/** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
	public static double[] prefixAverage1 (double[] x) {
		int n = x.length; // n is the length of the input array
		double[] a = new double[n]; // new array, a, that is the length n
		for (int j = 0; j < n; j++) { // loop
			double total = 0; // resets total to 0
			for (int i = 0; i <= j; i++)
				total += x[i]; // total adds up the values inside the input array
			a[j] = total / (j + 1);

		}
		return a;
	}
	
	/** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
	public static double[] prefixAverage2(double[] x) {
		int n = x.length;
		double[] a = new double[n];
		double total = 0;
		for (int j = 0; j < n; j++) {
			total += x[j];
			a[j] = total / (j + 1);
		}
		return a;
	}

	public static void main(String[] args) {
		
		Random rando = new Random();
		double[] test1 = new double[10];
		double[] test2 = new double[100];
		double[] test3 = new double[1000];
		double[] test4 = new double[10000];
		double[] test5 = new double[100000];
		
		
		for (int k = 0; k < test1.length; k++) {
			test1[k] = rando.nextInt(100) + rando.nextDouble();
		}
		
		for (int k = 0; k < test2.length; k++) {
			test2[k] = rando.nextInt(100) + rando.nextDouble();
		}
		
		for (int k = 0; k < test3.length; k++) {
			test3[k] = rando.nextInt(100) + rando.nextDouble();
		}
		
		for (int k = 0; k < test4.length; k++) {
			test4[k] = rando.nextInt(100) + rando.nextDouble();
		}
		
		for (int k = 0; k < test5.length; k++) {
			test5[k] = rando.nextInt(100) + rando.nextDouble();
		}
		
		
		long startTime1 = System.nanoTime();
		prefixAverage1(test1);
		long endTime1 = System.nanoTime();
		
		long startTime2 = System.nanoTime();
		prefixAverage1(test2);
		long endTime2 = System.nanoTime();
		
		long startTime3 = System.nanoTime();
		prefixAverage1(test3);
		long endTime3 = System.nanoTime();
		
		long startTime4 = System.nanoTime();
		prefixAverage1(test4);
		long endTime4 = System.nanoTime();
		
		long startTime5 = System.nanoTime();
		prefixAverage1(test5);
		long endTime5 = System.nanoTime();
		
		
		long time1 = endTime1 - startTime1;
		long time2 = endTime2 - startTime2;
		long time3 = endTime3 - startTime3;
		long time4 = endTime4 - startTime4;
		long time5 = endTime5 - startTime5;
		
		
		System.out.println("n = 10   alg1 time: " + time1 + " ns");
		System.out.println("n = 100   alg1 time: " + time2 + " ns");
		System.out.println("n = 1000   alg1 time: " + time3 + " ns");
		System.out.println("n = 10000   alg1 time: " + time4 + " ns");
		System.out.println("n = 100000   alg1 time: " + time5 + " ns\n");
		
		
		
		startTime1 = System.nanoTime();
		prefixAverage2(test1);
		endTime1 = System.nanoTime();
		
		startTime2 = System.nanoTime();
		prefixAverage2(test2);
		endTime2 = System.nanoTime();
		
		startTime3 = System.nanoTime();
		prefixAverage2(test3);
		endTime3 = System.nanoTime();
		
		startTime4 = System.nanoTime();
		prefixAverage2(test4);
		endTime4 = System.nanoTime();
		
		startTime5 = System.nanoTime();
		prefixAverage2(test5);
		endTime5 = System.nanoTime();
		
		
		time1 = endTime1 - startTime1;
		time2 = endTime2 - startTime2;
		time3 = endTime3 - startTime3;
		time4 = endTime4 - startTime4;
		time5 = endTime5 - startTime5;
		
		
		System.out.println("n = 10   alg2 time: " + time1 + " ns");
		System.out.println("n = 100   alg2 time: " + time2 + " ns");
		System.out.println("n = 1000   alg2 time: " + time3 + " ns");
		System.out.println("n = 10000   alg2 time: " + time4 + " ns");
		System.out.println("n = 100000   alg2 time: " + time5 + " ns\n");
		
		System.out.println("These results indicate the growth function of first algorithm is n^2 or quadratic, and second algorithm is n or linear.");
	}

}


