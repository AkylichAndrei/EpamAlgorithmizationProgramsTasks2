package OneDimensionalArrays;

import java.util.Scanner;

public class TaskEight {
	int i,n,j,m;
	double[ ] dbArray = new double[ 100 ];
	double[ ] newDbArray = new double[ 100 ];
	double min;
	void min() {		
		min = dbArray[ 0 ];
		for( i = 1 ; i <= n - 1 ; i++ ) 
		if(dbArray [ i ] < min) 
		min = dbArray [ i ] ;
		System.out.println("Минимальный элемент = " + min);
	}
	void newArray() {
		j = 0;
		for( i = 0 ; i <= n - 1 ; i++ ) 
		if(dbArray [ i ] != min) {
		newDbArray[ j ] = dbArray [ i ] ;
		j++;
		}
		m = j;
	}
	void newArrayPrint() {	
	System.out.println(" Новая последовательность : ");
	for( j = 0 ; j <= m - 1 ; j++ ) 
		System.out.print(" | "+ newDbArray[ j ]);
	}
	public static void main(String[] args) {
		TaskEight myTaskEight = new TaskEight();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" Из скольки чисел будет последовательность?: ");
			myTaskEight.n = in.nextInt();
			System.out.println(" Вводите числа: ");
			for( myTaskEight.i = 0 ; myTaskEight.i <= myTaskEight.n - 1 ; myTaskEight.i++ ) {
			myTaskEight.dbArray[ myTaskEight.i ] =  in.nextDouble();
			}
			System.out.println(" Массив заполнен ");
			in.close();
		}
		myTaskEight.min(); 
		myTaskEight.newArray(); 
		myTaskEight.newArrayPrint(); 

	}

}
