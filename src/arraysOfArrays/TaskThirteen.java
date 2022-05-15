package arraysOfArrays;

import java.util.Random;

public class TaskThirteen {
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
		for (j = 0; j <= 5 - 1; j++)
		for (k = 0; k <= 5 - 1; k++)
		for (i = 0; i <= 5 - 2; i++)
		if(matrixA[ i ][ j ] > matrixA[ i + 1 ][ j ] )  {
			temp = matrixA[ i ][ j ] ;
			matrixA[ i ][ j ] = matrixA[ i + 1 ][ j ] ;
			matrixA[ i + 1 ][ j  ] = temp;
		}
	}
	void sortX() {
		for (j = 0; j <= 5 - 1; j++)
		for (k = 0; k <= 5 - 1; k++)
		for (i = 0; i <= 5 - 2; i++) 
		if(matrixA[ i ][ j ] < matrixA[ i + 1 ][ j  ] )  {
			temp = matrixA[ i ][ j ] ;
			matrixA[ i ][ j ] = matrixA[ i + 1 ][ j ] ;
			matrixA[ i + 1 ][ j ] = temp;
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
		TaskThirteen myTaskThirteen = new TaskThirteen();
		myTaskThirteen.input();
		myTaskThirteen.output();
		System.out.println("Сортировка по возрастанию: ");
		myTaskThirteen.sortY();
		myTaskThirteen.output();
		System.out.println("Сортировка по убыванию: ");
		myTaskThirteen.sortX();
		myTaskThirteen.output();

	}

}
