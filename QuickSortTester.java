public class QuickSortTester {

    public static void main(String[] args){
	
	//array size increases exponentially (10, 10^2, 10^3 ... 10^6). 
	//retTime is run 100 times on each and the average time is used.

	System.out.println("Averages taken from 100 run samples.");

	for(int i = 1; i < 7; i++){
	    double k = 0.0;
	    for (int p = 0; p < 100; p++){
		k += retTime((int)Math.pow(10, i));
	    }
	    System.out.println(" avg for n = 10^" + i + " is " + (k / 100.0));
	}
    }


    // FXN returns milliseconds it takes for an n-element array to be sorted with QS.
    public static long retTime(int n){
    int[] testArr = QuickSort.buildArray(n, n);
    QuickSort.shuffle(testArr);

    long startTime = System.currentTimeMillis();
    QuickSort.qsort(testArr);
    long endTime = System.currentTimeMillis();
    long elapsed = endTime - startTime;

    return elapsed;
    
    }
}
