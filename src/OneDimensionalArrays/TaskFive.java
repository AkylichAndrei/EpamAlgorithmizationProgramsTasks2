package OneDimensionalArrays;

import java.util.Scanner;

public class TaskFive {
	int i,m,n,k,z;
	double[ ] dbArray = new double[ 100 ];
	double B,M,N;
	void outputOnDisplay() {
		for( i = 0 ; i <= n - 1 ; i++ ) {
			if(dbArray[ i ] > i) {
				System.out.println(" �������� �������� " + dbArray[ i ] + " ������ ������� "+ i );
			} 
		}
		
	}
	public static void main(String[] args) {
		TaskFive myTaskFive = new TaskFive();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" �� ������� ����� ����� ������������������?: ");
			myTaskFive.n = in.nextInt();
			System.out.println(" ������� �����: ");
			for( myTaskFive.i = 0 ; myTaskFive.i <= myTaskFive.n - 1 ; myTaskFive.i++ ) {
			myTaskFive.dbArray[myTaskFive.i] = in.nextDouble();
			}
			in.close();
		}
		myTaskFive.outputOnDisplay();  
	}
}
