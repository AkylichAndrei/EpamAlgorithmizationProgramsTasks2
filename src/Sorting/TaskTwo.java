package Sorting;

import java.util.Scanner;

public class TaskTwo {
	int i,m,n,k,j,j2;
	double temp;
	double[ ] dbArray = new double[ 100 ];
	double[ ] dbArray2 = new double[ 100 ];
	void insert() {
		j = 0;
		for( i = n ; i <=  n + m - 1 ; i++ ) {
		 dbArray[ i ] = dbArray2[ j ];
		 j++;
		}
	}
	void outputOnDisplay() {
		System.out.println(" Новая последовательность " );
		for( i = 0 ; i <= n + m - 1 ; i++ ) {
			System.out.print("  " + dbArray[ i ] );
			}
		}
	void sort() {
		for( j = 0 ; j <= n + m - 1 ; j++ )
		for( i = 0 ; i <= n + m - 2 ; i++ ) {
			if(dbArray[ i ] > dbArray[ i + 1 ]) {
				temp = dbArray[ i ];
				dbArray[ i ]=dbArray[ i + 1 ];
				dbArray[ i + 1 ] = temp;
			}
			}
	}
	public static void main(String[] args) {
		TaskTwo myTaskTwo = new TaskTwo();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" Введите длинну массива A[N]: ");
			myTaskTwo.n = in.nextInt();
			System.out.println(" Введите массив " );
			for( myTaskTwo.i = 0 ; myTaskTwo.i <= myTaskTwo.n - 1 ; myTaskTwo.i++ ) {
			myTaskTwo.dbArray[myTaskTwo.i] = in.nextDouble();
			}
			System.out.println(" Введите длинну массива B[M]: ");
			myTaskTwo.m = in.nextInt();
			System.out.println(" Введите массив " );
			for( myTaskTwo.i = 0 ; myTaskTwo.i <= myTaskTwo.m - 1 ; myTaskTwo.i++ ) {
			myTaskTwo.dbArray2[myTaskTwo.i] = in.nextDouble();
			}
			in.close();
		}
		myTaskTwo.insert();
		myTaskTwo.sort(); 
		myTaskTwo.outputOnDisplay();

	}

}
