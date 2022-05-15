package arraysOfArrays;

import java.util.Scanner;

public class TaskNine {
	int[][] matrixA = new int [100][100];
	int[] matrixB = new int [100];
	int n,i,j,k,p,temp;
	void input() {
		for (i = 0; i <= n -1 ; i++) {
        for (j = 0; j <= n -1; j++)    
        	matrixA[ j ][ i ] = i;		
		}
	}
	void change() {
		
		for (i = 0; i <= n - 1; i++) 
		for (j = 0; j <= n - 1; j++)
		{
			matrixB[ i ] = matrixA[ j ][ i ] + matrixB[ i ] ;
			
		}
	}
	void output() {
		System.out.println("Ваша матрица: ");
		for (i = 0; i <= n - 1; i++) {
        for (j = 0; j <= n - 1; j++) {
        	System.out.print(matrixA[i][j]);
        	System.out.print("\t");
        }
        System.out.println();
		}
		System.out.println("Сумма столбцов: ");
		for (i = 0; i <= n - 1; i++) {
			System.out.print(matrixB[i]);
    	    System.out.print("\t");
		}
	}
	public static void main(String[] args) {
		TaskNine myTaskNine = new TaskNine();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите порядок матрицы n: ");
		myTaskNine.n = in.nextInt();
		myTaskNine.input();
		myTaskNine.change();
		myTaskNine.output();
		in.close();
	}

}
