package decomposition;

import java.util.Scanner;

public class TaskSixteen {
	int i,j,m,n,k,arrayLength,allSumm,ink;
	double x;
	boolean flag;
	double[ ] dbArray = new double[ 100 ];

	void decomposition() {
	 for( i = 1 ; i <= k ; i++) {
		 decomposition2();
	     decomposition3();
	     decomposition4();
	     
	 }
	 System.out.println("����� ���� ��������� �������� �����: " + allSumm);
	 i=allSumm;
	 decomposition2();
	 decomposition5();
	 decomposition6();
		}
	void decomposition2() {
		n = i;
		while(n > 0){
			dbArray[ j ] = n % 10;
			j++;
			arrayLength++;
			n = n / 10;
		}
	}
	void decomposition3() {
		for( j = 0  ; j <= arrayLength - 1  ; j++ ) 
			if((dbArray[j]%2) == 0 ) //� ������� ����� ����� ����� ������ :)
				flag = true;
		
	}
	void decomposition4() {
		 if(flag != true) {
	    	 System.out.println("������� ����� ���������� ������ �������� �����: " + i);
	    	 allSumm=allSumm+i;
		 }
	     x=0;
	     j=0;
	     arrayLength=0;
	     flag=false;
	}
	void decomposition5() {
		for( j = 0  ; j <= arrayLength - 1  ; j++ ) 
			if((dbArray[j]%2) == 0 ) //� ������� ����� ����� ����� ������ :)
				ink++;
		
	}
	void decomposition6() {
		 System.out.println("׸���� ���� � �����: " + ink);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskSixteen myTaskSixteen = new TaskSixteen();
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� �� �������� ����� ������: ");
		myTaskSixteen.k = in.nextInt();
		in.close();
		myTaskSixteen.decomposition(); 
	}

}
