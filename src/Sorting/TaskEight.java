package Sorting;

import java.util.Scanner;

public class TaskEight {
	int i,m,n,k,j;
	int noz;
	int temp;
	int[ ] dbArray = new int[ 100 ];
	int[ ] dbArray2 = new int[ 100 ];
	boolean flag;
	
	
	void output() {
		System.out.println("���� �����= ");
		for( i = 0 ; i <= n - 1  ; i++ ) {
			System.out.println( dbArray[i] + " / "+dbArray2[i] );
			}
		
	}
	void noz() {
		flag = true;
		noz = 2;
		//���� ����� �����������
		while(flag==true) {
			flag = false;
		for(i  = 0 ;i <= n - 1; i++) 
			if(( noz % dbArray2[i]  ) != 0 ) {
				flag = true;
		}
		noz++;
		}
		
		noz--;
		System.out.println(" ����� ����������� = " +  noz);
		
		//��������� ��������� �� ����� �����������
		for(i  = 0 ;i <= n - 1; i++) {
			 dbArray[i] = dbArray[i] * (noz / dbArray2[i]); 
		}
		//� ����������� ���������� ���������� ����� �����������
		for(i  = 0 ;i <= n - 1; i++) {
			 dbArray2[i] = noz; 
		}
		sort();
	}
	void sort() {
		System.out.println(" ���������� � ������� �����������  " );
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
  					// ���� ���������� ������� ������ � ���������������
  					break;
  				}
  			}
  			// � �������������� ����� ��������� ���������� ��������
  			
  			dbArray[j + 1] = value;
			
		}
	}
	public static void main(String[] args) {
		TaskEight myTaskEight = new TaskEight();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("������� ������ p/q �� ������ ������? : ");
			myTaskEight.n = in.nextInt();
			for( myTaskEight.i = 0 ; myTaskEight.i <= myTaskEight.n - 1  ; myTaskEight.i++ ) {
			System.out.println(" ������� ��������� ����� " + (myTaskEight.i+1) + "  p = ");
			myTaskEight.dbArray[myTaskEight.i] = in.nextInt();
			System.out.println(" ������� ����������� ����� " + (myTaskEight.i+1) + "  q = ");
			myTaskEight.dbArray2[myTaskEight.i] = in.nextInt();
			}
			in.close();
		}
		myTaskEight.output(); 
		myTaskEight.noz(); 
		myTaskEight.output();
	}


}
