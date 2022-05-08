package Sorting;

import java.util.Scanner;

public class TaskSeven {
	int i,m,n,k,j;
	int temp;
	int[ ] dbArray = new int[ 100 ];
	int[ ] dbArray2 = new int[ 100 ];
	
	
	
	void output() {

		for( i = 0 ; i < n    ; i++ ) 
		for( j = 0 ; j < m    ; j++ ) {
			if(dbArray[ i ] <= dbArray[ j ]) {
				System.out.println(" Ёлемент A[ "+ dbArray2[ i ] + "] ћесто дл€ вставки между "
						+ " индексами массива B [ "+ j 
						+"] и B[ "+ (j + 1) +" ] " );
			break;
			}
		}
	}
	public static void main(String[] args) {
		TaskSeven myTaskSeven = new TaskSeven();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("¬ведите длинну массива A[N]: ");
			myTaskSeven.n = in.nextInt();
			System.out.println(" ¬ведите массив " );
			for( myTaskSeven.i = 0 ; myTaskSeven.i <= myTaskSeven.n - 1  ; myTaskSeven.i++ ) {
			myTaskSeven.dbArray[myTaskSeven.i] = in.nextInt();
			}
			System.out.println("¬ведите длинну массива B[N]: ");
			myTaskSeven.m = in.nextInt();
			System.out.println(" ¬ведите массив " );
			for( myTaskSeven.i = 0 ; myTaskSeven.i <= myTaskSeven.m - 1  ; myTaskSeven.i++ ) {
			myTaskSeven.dbArray2[myTaskSeven.i] = in.nextInt();
			}
			in.close();
		}
		myTaskSeven.output(); 
	

	}

}
