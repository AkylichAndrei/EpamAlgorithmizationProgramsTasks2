package OneDimensionalArrays;

import java.util.Scanner;

public class TaskFive {
	int i,m,n,k,z;
	double[ ] dbArray = new double[ 100 ];
	double B,M,N;
	void outputOnDisplay() {
		for( i = 0 ; i <= n - 1 ; i++ ) {
			if(dbArray[ i ] > i) {
				System.out.println(" Значение элемента " + dbArray[ i ] + " больше индекса "+ i );
			} 
		}
		
	}
	public static void main(String[] args) {
		TaskFive myTaskFive = new TaskFive();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" Из скольки чисел будет последовательность?: ");
			myTaskFive.n = in.nextInt();
			System.out.println(" Вводите числа: ");
			for( myTaskFive.i = 0 ; myTaskFive.i <= myTaskFive.n - 1 ; myTaskFive.i++ ) {
			myTaskFive.dbArray[myTaskFive.i] = in.nextDouble();
			}
			in.close();
		}
		myTaskFive.outputOnDisplay();  
	}
}
