package OneDimensionalArrays;

import java.util.Scanner;

public class TaskFour {
	int i,m,n,k,z;
	double[ ] dbArray = new double[ 100 ];
	double B,M,N;
	void outputOnDisplay() {
		B = dbArray[ 0 ];
		for( i = 0 ; i <= n - 1 ; i++ ) {
			if(dbArray[ i ] >= B) {
				B = dbArray[ i ];
				k = i;
			} 
		}
		System.out.println(" Наибольший элемент: " + B);
	}
	void outputOnDisplay2() {
		M = dbArray[ 0 ];
		for( i = 0 ; i <= n - 1 ; i++ ) {
			if(dbArray[ i ] <= M) {
				M = dbArray[ i ];
				z = i;
			} 
		}
		System.out.println(" Наименьший элемент: " + M);
	}
	void outputOnDisplay3() {
		N = dbArray[ k ];
		dbArray[ k ] = dbArray[ z ];
		dbArray[ z ] = N;
		System.out.println(" Новая последовательность: ");
		for( i = 0 ; i <= n - 1 ; i++ ) {
			System.out.println(" " + dbArray[ i ]);
		}
		
	}
	public static void main(String[] args) {
		TaskFour myTaskFour = new TaskFour();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" Из скольки чисел будет последовательность?: ");
			myTaskFour.n = in.nextInt();
			System.out.println(" Вводите числа: ");
			for( myTaskFour.i = 0 ; myTaskFour.i <= myTaskFour.n - 1 ; myTaskFour.i++ ) {
			myTaskFour.dbArray[myTaskFour.i] = in.nextDouble();
			}
			
			in.close();
		}
		myTaskFour.outputOnDisplay();  
		myTaskFour.outputOnDisplay2();
		myTaskFour.outputOnDisplay3();

	}

}
