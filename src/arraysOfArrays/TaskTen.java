package arraysOfArrays;

import java.util.Scanner;

public class TaskTen {
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
		temp=0;
		for (i = 0; i <= n - 1; i++) 
		for (j = 0; j <= n - 1; j++)
		if((matrixA[ i ][ j ] > 0 ) && (i == j) ) {
			matrixB[ temp ] = matrixA[ i ][ j ];
			temp++;
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
		System.out.println("Положительные элементы в главной диагонали: ");
		for (i = 0; i <= temp - 1; i++) {
			System.out.print(matrixB[i]);
    	    System.out.print("\t");
		}
	}
	public static void main(String[] args) {
		TaskTen myTaskTen = new TaskTen();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите порядок матрицы n: ");
		myTaskTen.n = in.nextInt();
		myTaskTen.input();
		myTaskTen.change();
		myTaskTen.output();
		in.close();

	}

}
