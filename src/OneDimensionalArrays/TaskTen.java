package OneDimensionalArrays;

import java.util.Scanner;

public class TaskTen {
	int i,n,j,m;
	double[ ] dbArray = new double[ 100 ];
	void sorting() {		
		j = 2;
		m = n / 2;
		for( i = 1 ; i <= m ; i++ ) {
			dbArray [ i ] = dbArray [ j ];
			j = j + 2;
		}
		for( i = m +1 ; i <= n ; i++ ) {
			dbArray [ i ] = 0;
		}
	}
	void newArrayPrint() {	
	System.out.println(" Массив заполнен  : ");
	for( i = 0 ; i <= n - 1; i++ ) 
		System.out.print(" | "+ dbArray[ i ]);
	}
	public static void main(String[] args) {
		TaskTen myTaskTen = new TaskTen();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" Из скольки чисел будет последовательность?: ");
			myTaskTen.n = in.nextInt();
			System.out.println(" Вводите числа: ");
			for( myTaskTen.i = 0 ; myTaskTen.i <= myTaskTen.n - 1 ; myTaskTen.i++ ) {
			myTaskTen.dbArray[ myTaskTen.i ] =  in.nextDouble();
			}
			System.out.println(" Массив заполнен  ");
			in.close();
		}
		myTaskTen.sorting(); 
		myTaskTen.newArrayPrint(); 

	}

}
