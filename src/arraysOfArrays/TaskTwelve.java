package arraysOfArrays;

import java.util.Random;

public class TaskTwelve {
	int[][] matrixA = new int [5][5];
	int n,i,j,k,p,temp;
	void input() {
		for (i = 0; i <= 5 -1 ; i++) 
        for (j = 0; j <= 5 -1; j++) { 
        	Random random = new Random();
        	matrixA[ i ][ j ] = random.nextInt(16);		
		}
	}
	void sortY() {
	
		for (i = 0; i <= 5 - 1; i++) 
		for (k = 0; k <= 5 - 1; k++)
		for (j = 0; j <= 5 - 2; j++)
		if(matrixA[ i ][ j ] > matrixA[ i ][ j + 1 ] )  {
			temp = matrixA[ i ][ j ] ;
			matrixA[ i ][ j ] = matrixA[ i ][ j + 1 ] ;
			matrixA[ i ][ j + 1 ] = temp;
		}
	}
	void sortX() {
		for (i = 0; i <= 5 - 1; i++) 
		for (k = 0; k <= 5 - 1; k++)
		for (j = 0; j <= 5 - 2; j++)
		if(matrixA[ i ][ j ] < matrixA[ i ][ j + 1 ] )  {
			temp = matrixA[ i ][ j ] ;
			matrixA[ i ][ j ] = matrixA[ i ][ j + 1 ] ;
			matrixA[ i ][ j + 1 ] = temp;
		}
	}
	void output() {
		System.out.println("Ваша матрица: ");
		for (i = 0; i <= 5 - 1; i++) {
        for (j = 0; j <= 5 - 1; j++) {
        	System.out.print(matrixA[i][j]);
        	System.out.print("\t");
        }
        System.out.println();
		}
	}
	public static void main(String[] args) {
		TaskTwelve myTaskTwelve = new TaskTwelve();
		myTaskTwelve.input();
		myTaskTwelve.output();
		System.out.println("Сортировка по возрастанию: ");
		myTaskTwelve.sortY();
		myTaskTwelve.output();
		System.out.println("Сортировка по убыванию: ");
		myTaskTwelve.sortX();
		myTaskTwelve.output();

	}

}
