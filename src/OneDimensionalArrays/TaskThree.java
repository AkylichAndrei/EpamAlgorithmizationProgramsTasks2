package OneDimensionalArrays;

import java.util.Scanner;

public class TaskThree {
	int i,m,n,k,z;
	double[ ] dbArray = new double[ 100 ];
		
	void outputOnDisplay() {
		for( i = 0 ; i <= n - 1 ; i++ ) {
			if(dbArray[ i ] > 0) {
				k++;
			} 
		}
		System.out.println(" Количество положительных элемнтов: " + k);
	}
	void outputOnDisplay2() {
		for( i = 0 ; i <= n - 1 ; i++ ) {
			if(dbArray[ i ] < 0) {
				m++;
			} 
		}
		System.out.println(" Количество отрицательных элемнтов: " + m);
	}
	void outputOnDisplay3() {
		for( i = 0 ; i <= n - 1 ; i++ ) {
			if(dbArray[ i ] == 0) {
				z++;
			} 
		}
		System.out.println(" Количество нулевых элемнтов: " + z);
	}
	public static void main(String[] args) {
		TaskThree myTaskThree = new TaskThree();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" Из скольки чисел будет последовательность?: ");
			myTaskThree.n = in.nextInt();
			System.out.println(" Вводите числа: ");
			for( myTaskThree.i = 0 ; myTaskThree.i <= myTaskThree.n - 1 ; myTaskThree.i++ ) {
			myTaskThree.dbArray[myTaskThree.i] = in.nextDouble();
			}
			
			in.close();
		}
		myTaskThree.outputOnDisplay();  
		myTaskThree.outputOnDisplay2();
		myTaskThree.outputOnDisplay3();

	}

}
