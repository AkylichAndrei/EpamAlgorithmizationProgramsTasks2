package arraysOfArrays;

import java.util.Random;

public class TaskSixteen {
	int[][] matrixA = new int [100][100];
	int m,n,i,j,k,p,temp,temp2;
	boolean flag;
	void input() {
		//Размерность матрцы, увеличение размера увеличивает время построения!
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
		//проверка всех столбцов
		for (j = 0; j <= m - 1; j++) 
		{
			for (i = 0; i <= m - 1 ; i++) 
				temp2 += matrixA[ i ][ j ];
			if(temp2 != temp)
			flag=false;
			temp2 = 0;
		}
		//проверка всех строк
		for (i = 0; i <= m - 1 ; i++) 
		{
			for (j = 0; j <= m - 1; j++) 
				temp2 += matrixA[ i ][ j ];
			if(temp2 != temp)
			flag=false;
			temp2 = 0;
		}
		//проверка диагонали главной
		for (i = 0; i <= m - 1 ; i++) 
			for (j = 0; j <= m - 1; j++) 
				if( i==j )
					temp2 += matrixA[ i ][ j ];
		if(temp2 != temp)
			flag=false;
		temp2 = 0;
		//проверка диагонали побочной
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
		System.out.println("Ваша матрица: ");
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
		System.out.println("Идёт построение матрицы 3 на 3.... ");
		myTaskSixteen.input();
		myTaskSixteen.output();
	}
}
