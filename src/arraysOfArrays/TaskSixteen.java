package arraysOfArrays;

import java.util.Random;

public class TaskSixteen {
	int[][] matrixA = new int [100][100];
	int m,n,i,j,k,p,temp,temp2;
	boolean flag;
	void input() {
		//����������� ������, ���������� ������� ����������� ����� ����������!
		m = 3; 
		while( flag == false) {
		flag = true;
		
		for (i = 0; i <= m - 1 ; i++)
		for (j = 0; j <= m - 1; j++) 
			 { 
	        	Random random = new Random();
	        	matrixA[ i ][ j ] = random.nextInt(10);
			}
		
		for(k = 0 ; k <= m - 1 ; k++) 
 		temp += matrixA[ k ][ 0 ]; 
		//�������� ���� ��������
		for (j = 0; j <= m - 1; j++) 
		{
			for (i = 0; i <= m - 1 ; i++) 
				temp2 += matrixA[ i ][ j ];
			if(temp2 != temp)
			flag=false;
			temp2 = 0;
		}
		//�������� ���� �����
		for (i = 0; i <= m - 1 ; i++) 
		{
			for (j = 0; j <= m - 1; j++) 
				temp2 += matrixA[ i ][ j ];
			if(temp2 != temp)
			flag=false;
			temp2 = 0;
		}
		//�������� ��������� �������
		for (i = 0; i <= m - 1 ; i++) 
			for (j = 0; j <= m - 1; j++) 
				if( i==j )
					temp2 += matrixA[ i ][ j ];
		if(temp2 != temp)
			flag=false;
		temp2 = 0;
		//�������� ��������� ��������
		j=0;
		for (i = m - 1; i >= 0 ; i--)  {
				temp2 += matrixA[ i ][ j ];
				j++;
		}
		if(temp2 != temp)
		flag=false;
		temp2 = 0;
		
		temp = 0;
		}
		
	}

	void output() {
		System.out.println("���� �������: ");
		for (i = 0; i <= m - 1; i++) {
        for (j = 0; j <= m - 1; j++) {
        	System.out.print(matrixA[i][j]);
        	System.out.print("\t");
        }
        System.out.println();
		}
	}
	public static void main(String[] args) {
		TaskSixteen myTaskSixteen = new TaskSixteen();
		System.out.println("��� ���������� ������� 3 �� 3.... ");
		myTaskSixteen.input();
		myTaskSixteen.output();

	}

}
