package decomposition;

import java.util.Scanner;

public class TaskSix {
	int[ ] dbArray = new int[3];
	int n,i,nod,nok,smallNumber;
	boolean flag;
	
	void nod() {
		flag = true;
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
		if(nod==1)
		System.out.println(" ���������� ����� �������� = " +  nod+ " ����� ������� ������� ");
		else
			System.out.println(" ����� �� ������� ������� " );
	}
	public static void main(String[] args) {
		TaskSix myTaskSix = new TaskSix();
		try (Scanner in = new Scanner(System.in)) {
			myTaskSix.n = 3;
			for( myTaskSix.i = 0 ; myTaskSix.i <= myTaskSix.n - 1  ; myTaskSix.i++ ) {
			System.out.println(" ������� ����� " + (myTaskSix.i + 1) );
			myTaskSix.dbArray[myTaskSix.i] = in.nextInt();
			}
			in.close();
		}
		myTaskSix.nod();
		

	}

}
