package Sorting;

import java.util.Scanner;


public class TaskOne {
	int i,m,n,k,j,j2;
	double temp;
	double[ ] dbArray = new double[ 100 ];
	double[ ] dbArray2 = new double[ 100 ];
	void outputOnDisplay() {
		j = 0;
		for( i = k - 1 ; i <=  n - 1 ; i++ ) {
		 temp = dbArray[ i ] ;
		 dbArray[ i ] = dbArray2[ j ];
		 dbArray2[ j ] = temp;
		 j++;
		}
		j2 = 0;
		for( i = n - 2  ; i <= n + j - 1 ; i++ ) {
			dbArray[ i ] = dbArray2[ j2 ];
			 j2++;
			}
		System.out.println(" Новая последовательность " );
		for( i = 0 ; i <= n + m - 1 ; i++ ) {
			System.out.print("  " + dbArray[ i ] );
			}
		
		}
	public static void main(String[] args) {
		TaskOne myTaskOne = new TaskOne();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" Введите длинну массива A[N]: ");
			myTaskOne.n = in.nextInt();
			System.out.println(" Введите массив " );
			for( myTaskOne.i = 0 ; myTaskOne.i <= myTaskOne.n - 1 ; myTaskOne.i++ ) {
			myTaskOne.dbArray[myTaskOne.i] = in.nextDouble();
			}
			System.out.println(" Введите длинну массива B[M]: ");
			myTaskOne.m = in.nextInt();
			System.out.println(" Введите массив " );
			for( myTaskOne.i = 0 ; myTaskOne.i <= myTaskOne.m - 1 ; myTaskOne.i++ ) {
			myTaskOne.dbArray2[myTaskOne.i] = in.nextDouble();
			}
			System.out.println(" Введите число K: ");
			myTaskOne.k = in.nextInt();
			in.close();
		}
		myTaskOne.outputOnDisplay(); 

	}

}
