package arraysOfArrays;

import java.util.Random;
import java.util.Scanner;

public class TaskFourteen {
	int[][] matrixA = new int [100][100];
	int m,n,i,j,k,p,temp;
	boolean flag;
	void input() {
		
		for (j = 0; j <= n - 1; j++) {
			flag = false;
			while( flag == false) {
		for (i = 0; i <= m - 1 ; i++) { 
        	Random random = new Random();
        	matrixA[ i ][ j ] = random.nextInt(2);
		}
        for(k = 0 ; k <= n - 1 ; k++) {
        		temp+=matrixA[ k ][ j ]; 
        }
        if( temp == j + 1 )
        	flag = true;
        temp = 0;
		}
		}
	}
	void output() {
		System.out.println("Ваша матрица: ");
		for (i = 0; i <= m - 1; i++) {
        for (j = 0; j <= n - 1; j++) {
        	System.out.print(matrixA[i][j]);
        	System.out.print("\t");
        }
        System.out.println();
		}
	}
	public static void main(String[] args) {
		TaskFourteen myTaskFourteen = new TaskFourteen();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите порядок матрицы m: ");
		myTaskFourteen.m = in.nextInt();
		System.out.println("Введите порядок матрицы n: ");
		myTaskFourteen.n = in.nextInt();
		in.close();
		myTaskFourteen.input();
		myTaskFourteen.output();
	}

}
