package arraysOfArrays;
import static java.lang.Math.*;

import java.util.Scanner;

public class TaskSeven {
	double[][] matrixA = new double [100][100];
	int n,i,j,m;
	void input() {
		for (i = 0; i <= n -1 ; i++) {
        for (j = 0; j <= n -1; j++)    
        	matrixA[ i ][ j ] = sin( (pow ( i , 2 ) - pow( j , 2 )) / n);		
		}
	}
	void search() {
		for (i = 0; i <= n -1 ; i++) {
        for (j = 0; j <= n -1; j++)    
        		if(matrixA[ i ][ j ] >= 0)
        			m++;
		}
	}
	void output() {
		System.out.println("Ваша матрица: ");
		for (i = 0; i <= n - 1; i++) {
        for (j = 0; j <= n - 1; j++) {
        	System.out.printf("%.2f",matrixA[i][j]);
        	System.out.print("\t");
        }
        System.out.println();
		}
		System.out.println("Количество положительных элементов: "+ m);
	}
	public static void main(String[] args) {
		TaskSeven myTaskSeven = new TaskSeven();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите порядок матрицы n: ");
		myTaskSeven.n = in.nextInt();
		in.close();
		myTaskSeven.input();
		myTaskSeven.search();
		myTaskSeven.output();

	}

}
