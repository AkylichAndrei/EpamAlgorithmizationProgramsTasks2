package decomposition;

import java.util.Scanner;


public class TaskEight {
	int i,m,n,k,summ;
	double[ ] dbArray = new double[ 100 ];
		
	void outputOnDisplay() {
		for( i = k - 1  ; i <= m - 1 ; i++ ) 
			summ+=dbArray[i];
		System.out.println("����� ��� ���������������� ���������: �� � �� � ����� = "+summ);
		}
	public static void main(String[] args) {
		
		TaskEight myTaskEight = new TaskEight();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("������� ������ ������� A[N]: ");
			myTaskEight.n = in.nextInt();
			System.out.println("������� ������: ");
			for( myTaskEight.i = 0 ; myTaskEight.i <= myTaskEight.n - 1 ; myTaskEight.i++ ) {
			myTaskEight.dbArray[myTaskEight.i] = in.nextDouble();
			}
			System.out.println("������� ����� �������� K (�� ��������): ");
			myTaskEight.k = in.nextInt();
			System.out.println("������� ����� �������� M (�� ��������): ");
			myTaskEight.m = in.nextInt();
			in.close();
		}
		myTaskEight.outputOnDisplay();  
	}

}
