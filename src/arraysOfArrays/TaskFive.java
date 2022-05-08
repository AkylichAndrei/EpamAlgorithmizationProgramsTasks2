package arraysOfArrays;

import java.util.Scanner;

public class TaskFive {
	int[][] matrixA = new int [100][100];
	int n,i,j,m;
	void input() {
		m = n;
		for (i = 0; i <= n - 1; i++) {
			m--;
        for (j = 0; j <= m; j++)    
        		matrixA[ i ][ j ] = i + 1;
		}
	}
	void output() {
		for (i = 0; i <= n - 1; i++) {
        for (j = 0; j <= n - 1; j++) {
        	System.out.print(matrixA[i][j] + "\t");
        }
        System.out.println();
		}
	}
	public static void main(String[] args) {
		TaskFive myTaskFive = new TaskFive();
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите пор€док матрицы n-чЄтное: ");
		myTaskFive.n = in.nextInt();
		in.close();
		myTaskFive.input();
		myTaskFive.output();

	}

}
