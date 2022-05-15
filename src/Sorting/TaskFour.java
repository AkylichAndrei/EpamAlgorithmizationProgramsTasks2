package Sorting;

import java.util.Scanner;

public class TaskFour {
	int i,m,n,k,j;
	int temp;
	boolean bol;
	int[ ] dbArray = new int[ 100 ];
	
	void outputOnDisplay() {
		System.out.println(" Новая последовательность " );
		for( i = 0 ; i <= n - 1 ; i++ ) {
			System.out.print("  " + dbArray[ i ] );
			}
		System.out.println(" Количество перестановок " + j );
		}
	// Сортировка обменами
	void sort() {
		while( bol == false ) {
		bol = true;
		for( i = 0 ; i <= n - 2 ; i++ ) {
			if(dbArray[ i ] > dbArray[ i + 1 ]) 
			{
				temp = dbArray[ i ];
				dbArray[ i ]  = dbArray[ i + 1 ];
				dbArray[ i + 1 ] = temp;
				j++;
				bol = false;
			}
		}
		}	
	}
	public static void main(String[] args) {
		TaskFour myTaskFour = new TaskFour();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" Введите длинну массива A[N]: ");
			myTaskFour.n = in.nextInt();
			System.out.println(" Введите массив " );
			for( myTaskFour.i = 0 ; myTaskFour.i <= myTaskFour.n - 1 ; myTaskFour.i++ ) {
			myTaskFour.dbArray[myTaskFour.i] = in.nextInt();
			}
			in.close();
		}
		myTaskFour.sort(); 
		myTaskFour.outputOnDisplay();

	}

}
