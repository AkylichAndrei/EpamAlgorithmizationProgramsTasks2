package decomposition;

import java.util.Scanner;

public class TaskOne {
	int[ ] dbArray = new int[2];
	int n,i,nod,nok,smallNumber;
	boolean flag;
	
	void nod() {
		flag = true;
		nod = 2;
		//���� ��������� �����
		nod=dbArray[0];
		for(i  = 1 ;i <= n - 1; i++) 
		if(  nod < dbArray[i]  )  
			nod=dbArray[i];
	   //���� ���������� ����� �������
		while(flag==true) {
			flag = false;
		for(i  = 0 ;i <= n - 1; i++) 
			if(( dbArray[i] % nod  ) != 0 ) {
				flag = true;
		}
		nod--;
		}
		
		nod++;
		System.out.println(" ���������� ����� �������� = " +  nod);
	}
	void nok() {
		flag = true;
		nok = 2;
		//���� ���������� �����
		smallNumber=dbArray[0];
		for(i  = 1 ;i <= n - 1; i++) 
		if(  smallNumber > dbArray[i]  )  
			smallNumber = dbArray[i];
		
		while(flag==true) {
			flag = false;
		for(i  = 0 ;i <= n - 1; i++) 
			if((  dbArray[i] % nok  ) != 0 ) {
				flag = true;
		}
		
		//���� ����� �� ������� ������ ���������� �����
		if(nok >= smallNumber) {
			flag = false;
			nok=1;
		}
		nok++;
		}
		
		nok--;
		System.out.println(" ���������� ����� ������� = " +  nok);
	}
	public static void main(String[] args) {
		TaskOne myTaskOne = new TaskOne();
		try (Scanner in = new Scanner(System.in)) {
			myTaskOne.n = 2;
			for( myTaskOne.i = 0 ; myTaskOne.i <= myTaskOne.n - 1  ; myTaskOne.i++ ) {
			System.out.println(" ������� ����� " + (myTaskOne.i + 1) );
			myTaskOne.dbArray[myTaskOne.i] = in.nextInt();
			}
			in.close();
		}
		myTaskOne.nod();
		myTaskOne.nok();

	}

}
