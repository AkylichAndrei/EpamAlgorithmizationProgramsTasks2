package Sorting;

import java.util.Scanner;

public class TaskThree {
	int i,m,n,k,j;
	int temp;
	int[ ] dbArray = new int[ 100 ];
	
	void outputOnDisplay() {
		System.out.println(" ����� ������������������ " );
		for( i = 0 ; i <= n - 1 ; i++ ) {
			System.out.print("  " + dbArray[ i ] );
			}
		}
	//���������� �������
	void sort() {
		for( j = 0 ; j < dbArray.length ; j++ ) {
			int maxInd = j;
		//���� ������������ ������� ����� ����
		for( i = j ; i < dbArray.length ; i++ ) {
			if(dbArray[ i ] > dbArray[ maxInd ]) 
				maxInd = i;
		}
		//������ ������� � ������
		temp = dbArray[j];
		dbArray[j]  =dbArray[maxInd];
		dbArray[maxInd] = temp;
		}
		
	
	}
	public static void main(String[] args) {
		TaskThree myTaskThree = new TaskThree();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("������� ������ ������� A[N]: ");
			myTaskThree.n = in.nextInt();
			System.out.println(" ������� ������ " );
			for( myTaskThree.i = 0 ; myTaskThree.i <= myTaskThree.n - 1 ; myTaskThree.i++ ) {
			myTaskThree.dbArray[myTaskThree.i] = in.nextInt();
			}
			in.close();
		}
		myTaskThree.sort(); 
		myTaskThree.outputOnDisplay();

	}

}
