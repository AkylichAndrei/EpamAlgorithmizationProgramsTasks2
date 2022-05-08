package OneDimensionalArrays;

import java.util.Scanner;


public class TaskOne {
	
	int i,m,n,k;
	double[ ] dbArray = new double[ 100 ];
		
	void outputOnDisplay() {
		for( i = 0 ; i <= n - 1 ; i++ ) {
			if( (dbArray[ i ] % k ) == 0) {
				System.out.println(" ратное число : "+ dbArray[ i ]);
			} 
			}
		}

	public static void main(String[] args) {
		
		TaskOne myTaskOne = new TaskOne();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("¬ведите длинну массива A[N]: ");
			myTaskOne.n = in.nextInt();
			for( myTaskOne.i = 0 ; myTaskOne.i <= myTaskOne.n - 1 ; myTaskOne.i++ ) {
			myTaskOne.dbArray[myTaskOne.i] = in.nextDouble();
			}
			System.out.println("¬ведите число K: ");
			myTaskOne.k = in.nextInt();
			in.close();
		}
		myTaskOne.outputOnDisplay();   	 
		
	}

}
