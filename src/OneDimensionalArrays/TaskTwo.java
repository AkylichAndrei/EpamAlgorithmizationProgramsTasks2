package OneDimensionalArrays;

import java.util.Scanner;

public class TaskTwo {
	int i,m,n,k,z;
	double[ ] dbArray = new double[ 100 ];
		
	void outputOnDisplay() {
		for( i = 0 ; i <= n - 1 ; i++ ) {
			if(dbArray[ i ] > z) {
				dbArray[ i ] = z;
				k++;
			} 
		}
	}
	void outputOnDisplay2() {
		System.out.println(" Новая последовательность: ");
		for( i = 0 ; i <= n - 1 ; i++ ) {
		System.out.print(" "+dbArray[ i ]);			
		}
	}
	
	public static void main(String[] args) {
		TaskTwo myTaskTwo = new TaskTwo();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" Из скольки чисел будет последовательность?: ");
			myTaskTwo.n = in.nextInt();
			System.out.println(" Вводите числа: ");
			for( myTaskTwo.i = 0 ; myTaskTwo.i <= myTaskTwo.n - 1 ; myTaskTwo.i++ ) {
			myTaskTwo.dbArray[myTaskTwo.i] = in.nextDouble();
			}
			System.out.println("Введите число Z: ");
			myTaskTwo.z = in.nextInt();
			in.close();
		}
		myTaskTwo.outputOnDisplay();  
		myTaskTwo.outputOnDisplay2();
		System.out.println(" Количество замен: " + myTaskTwo.k);
		
	}

}
