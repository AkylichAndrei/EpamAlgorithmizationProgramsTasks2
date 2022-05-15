package arraysOfArrays;

import java.util.Random;

public class TaskEleven {
	int[][] matrixA = new int [10][20];
	int[] matrixB = new int [100];
	int n,i,j,k,p,temp;
	void input() {
		for (i = 0; i <= 10 -1 ; i++) 
        for (j = 0; j <= 20 -1; j++) { 
        	Random random = new Random();
        	matrixA[ i ][ j ] = random.nextInt(16);
		}
	}
	void change() {
		temp=0;
		k=0;
		for (i = 0; i <= 10 - 1; i++) {
		for (j = 0; j <= 20 - 1; j++)
		if(matrixA[ i ][ j ] == 5 )  {
			temp++;
		}
		if(temp>=3) {
			matrixB[k] = i + 1;
			k++;
		}
		temp=0;
		}
	}
	void output() {
		System.out.println("Ваша матрица: ");
		for (i = 0; i <= 10 - 1; i++) {
        for (j = 0; j <= 20 - 1; j++) {
        	System.out.print(matrixA[i][j]);
        	System.out.print("\t");
        }
        System.out.println();
		}
		System.out.println("Элементы равные 5 встречаются более трёх раз "
				+ "в строках : ");
		for (i = 0; i <= k - 1; i++) {
			System.out.print(matrixB[i]);
    	    System.out.print("\t");
		}
	}
	public static void main(String[] args) {
		TaskEleven myTaskEleven = new TaskEleven();
		myTaskEleven.input();
		myTaskEleven.change();
		myTaskEleven.output();

	}

}
