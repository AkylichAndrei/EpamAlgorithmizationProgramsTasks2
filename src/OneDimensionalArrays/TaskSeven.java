package OneDimensionalArrays;

import java.util.Scanner;

public class TaskSeven {
	int i,n,j;
	double[ ] dbArray = new double[ 100 ];
	double max;
	void func1() {		
		for( i = 0 ; i <= n - 1 ; i++ ) {
		if((dbArray [ i ] + dbArray [ 2 * n - i - 1 ]) > max) 
		max = dbArray [ i ] + dbArray [ 2 * n - i - 1];
		System.out.println(" Индекс элемента  (i = " + i + ") и (2 * n - i - 1 = "
				+ ( 2 * n - i - 1 ) + ") Максимальная сумма = " + max);
	    }
		System.out.println(" Результат: " + max);
	}

	public static void main(String[] args) {
		TaskSeven myTaskSeven = new TaskSeven();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Из скольки чисел будет последовательность 2*n?: ");
			myTaskSeven.n = in.nextInt();
			for( myTaskSeven.i = 0 ; myTaskSeven.i <= 2 * myTaskSeven.n - 1 ; myTaskSeven.i++ ) {
			myTaskSeven.dbArray[ myTaskSeven.i ] =  in.nextDouble();
			}
			System.out.println(" Массив заполнен ");
			in.close();
		}
		myTaskSeven.func1(); 

	}

}
