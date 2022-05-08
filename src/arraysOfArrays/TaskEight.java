package arraysOfArrays;


import java.util.Scanner;

public class TaskEight {
	int[][] matrixA = new int [100][100];
	int n,i,j,k,p,temp;
	void input() {
		for (i = 0; i <= n -1 ; i++) {
        for (j = 0; j <= n -1; j++)    
        	matrixA[ j ][ i ] = i;		
		}
	}
	void change() {
		for (i = 0; i <= n -1; i++)  {
			temp = matrixA[ i ][ k ] ;
			matrixA[ i ][ k ] = matrixA[ i ][ p ] ;
			matrixA[ i ][ p ] = temp;
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
		
	}
	public static void main(String[] args) {
		TaskEight myTaskEight = new TaskEight();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите порядок матрицы n: ");
		myTaskEight.n = in.nextInt();
		myTaskEight.input();
		myTaskEight.output();
		System.out.println("Введите номер первого столбца: ");
		myTaskEight.k = in.nextInt();
		System.out.println("Введите номер второго столбца: ");
		myTaskEight.p = in.nextInt();
		myTaskEight.change();
		myTaskEight.output();
		in.close();
	}

}
