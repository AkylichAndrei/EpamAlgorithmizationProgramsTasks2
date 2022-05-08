package arraysOfArrays;

import java.util.Scanner;

public class TaskSix {
	int[][] matrixA = new int [100][100];
	int n,i,j,m;
	void input() {
		m = n;
		for (i = 0; i <= (n / 2) -1 ; i++) {
			
        for (j = n - m; j <= m - 1; j++)    
        		matrixA[ i ][ j ] = 1;
        			m--;
		}
		for (i = (n / 2) ; i <= n -1 ; i++) {
	        for (j = n - m; j <= m - 1; j++)    
	        		matrixA[ i ][ j ] = 1;
	        			m++;
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
		TaskSix myTaskSix = new TaskSix();
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите пор€док матрицы n-чЄтное: ");
		myTaskSix.n = in.nextInt();
		in.close();
		myTaskSix.input();
		myTaskSix.output();

	}

}
