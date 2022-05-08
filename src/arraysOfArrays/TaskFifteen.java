package arraysOfArrays;

import java.util.Random;

public class TaskFifteen {
	int[][] matrixA = new int [5][5];
	int n,i,j,k,p,temp;
	void input() {
		for (i = 0; i <= 5 -1 ; i++) 
        for (j = 0; j <= 5 -1; j++) { 
        	Random random = new Random();
        	matrixA[ i ][ j ] = random.nextInt(50);
		}
	}
	void search() {
		for (j = 0; j <= 5 - 1; j++)
		for (i = 0; i <= 5 - 1; i++) 
		if(matrixA[ i ][ j ] > temp )  
		temp = matrixA[ i ][ j ];
		System.out.println(temp);
	}
	void insert() {
		for (j = 0; j <= 5 - 1; j++)
		for (i = 0; i <= 5 - 1; i++) 
		if(matrixA[ i ][ j ] % 2 != 0 )  {
			 matrixA[ i ][ j ] = temp  ;
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
		TaskFifteen myTaskFifteen = new TaskFifteen();
		myTaskFifteen.input();
		myTaskFifteen.output();
		System.out.println("Наибольший элемент матрицы ");
		myTaskFifteen.search();
		System.out.println("Все нечётные элементы заменены! ");
		myTaskFifteen.insert();
		myTaskFifteen.output();

	}

}
