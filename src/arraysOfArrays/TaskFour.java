package arraysOfArrays;
import java.util.Scanner;

public class TaskFour {
	int[][] matrixA = new int [100][100];
	int n,i,j;
	void input() {
		for (i = 0; i <= n - 1; i++) 
        for (j = 0; j <= n - 1; j++) {   
        	if( i % 2 == 0)
        		matrixA[ i ][ j ] = j + 1;
        	if( i % 2 != 0)
        		matrixA[ i ][ j ] = n - j;
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
		TaskFour myTaskFour = new TaskFour();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите порядок матрицы n-чётное: ");
		myTaskFour.n = in.nextInt();
		in.close();
		myTaskFour.input();
		myTaskFour.output();
	}
}
