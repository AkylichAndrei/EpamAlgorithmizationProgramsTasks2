package Sorting;

import java.util.Scanner;

public class TaskFive {
	int i,m,n,k,j,firstIndex,lastIndex,middleIndex;
	int temp;
	int[ ] dbArray = new int[ 100 ];
	void outputOnDisplay() {
		System.out.println(" ����� ������������������ " );
		for( i = 0 ; i <= n - 1 ; i++ ) {
			System.out.print("  " + dbArray[ i ] );
			}
		}
	//���������� �c�������
	void sort() {
		for( i = 1 ; i < n  ; i++ ) {
			//binarySearch();
			  // ����������� �������� ��������
  			int value = dbArray[i];
  			int j = i - 1;
  			for (; j >= 0; j--) {
  			// ���� �������� �������� ������� � ����������� ������� ������� ������
  				if ( dbArray[j] > value) {
  					dbArray[j + 1] = dbArray[j];
  				} else {
  					// ���� ������� ������ � ���������������
  					break;
  				}
  			}
  			// � �������������� ����� ��������� ��������
  			
  			dbArray[j + 1] = value;
			
		}	    		
	}

	public static void main(String[] args) {
		TaskFive myTaskFive = new TaskFive();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("������� ������ ������� A[N]: ");
			myTaskFive.n = in.nextInt();
			System.out.println(" ������� ������ " );
			for( myTaskFive.i = 0 ; myTaskFive.i <= myTaskFive.n - 1 ; myTaskFive.i++ ) {
			myTaskFive.dbArray[myTaskFive.i] = in.nextInt();
			}
			in.close();
		}
		myTaskFive.sort(); 
		myTaskFive.outputOnDisplay();
	}

}
