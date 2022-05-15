package OneDimensionalArrays;

import java.util.Scanner;

public class TaskSix {
	int i,m,n,k,z,j;
	double[ ] dbArray = new double[ 100 ];
	double B,M,N;
	void func1() {
		for( i = 2 ; i <= n - 1 ; i++ ) {
			k = 0;
			for(j = 1;j <= i ; j++ )
			if(i % j == 0) {
				k++;
			} 
			if( k == 2 ) {
				System.out.println(" Найдено простое число  = " + i);
				M = M + i;
			}
		}
		System.out.println(" Сумма элементов  = " + M);
	}
	public static void main(String[] args) {
		TaskSix myTaskSix = new TaskSix();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" Из скольки чисел будет последовательность?: ");
			myTaskSix.n = in.nextInt();
			for( myTaskSix.i = 0 ; myTaskSix.i <= myTaskSix.n - 1 ; myTaskSix.i++ ) {
			myTaskSix.dbArray[ myTaskSix.i ] = 1;
			}
			System.out.println(" Массив заполнен ");
			in.close();
		}
		myTaskSix.func1(); 

	}

}
