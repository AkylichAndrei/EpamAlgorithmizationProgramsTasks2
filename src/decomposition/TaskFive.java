package decomposition;

import java.util.Scanner;

public class TaskFive {
	int[ ] dbArray = new int[100];
	int n,i,theLargestNumber,secondLargestNumber,temp;
	boolean flag;
	
	void print() {
		
		//���� ��������� �����
		theLargestNumber=dbArray[0];
		for(i  = 1 ;i <= n - 1; i++) 
		if(  theLargestNumber < dbArray[i]  )  
			theLargestNumber=dbArray[i];

	   //���� ������ �� ��������
		for(i  = 1 ;i <= n - 1; i++) 
			if(dbArray[i]<theLargestNumber&secondLargestNumber<dbArray[i])
				 secondLargestNumber=dbArray[i];
		
		System.out.println(" ������ �� �������� ����� = " +  theLargestNumber);
		System.out.println(" ������ �� �������� ����� = " +  secondLargestNumber);
	}
	public static void main(String[] args) {
		TaskFive myTaskFive = new TaskFive();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" ������� ��������� ������� �� ������ ������?");
			myTaskFive.n = in.nextInt();
			for( myTaskFive.i = 0 ; myTaskFive.i <= myTaskFive.n - 1  ; myTaskFive.i++ ) {
			System.out.println(" ������� ����� " + (myTaskFive.i + 1) );
			myTaskFive.dbArray[myTaskFive.i] = in.nextInt();
			}
			in.close();
		}
		myTaskFive.print();

	}

}
