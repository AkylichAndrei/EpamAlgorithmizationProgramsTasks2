package arraysOfArrays;


public class TaskOne {
	  int[][] matrixA = new int [5][5];
	void print() {
		   System.out.println(" Дана матрица: ");
		 //заполнение 1 строки 
	matrixA[0][0] = 1; matrixA[0][1] = 8; matrixA[0][2] = 3; matrixA[0][3] = 9;
		matrixA[0][4] = 9;
	//заполнение 2 строки
	 matrixA[1][1] = 1; matrixA[1][0] = 4; matrixA[1][2] = 7; matrixA[1][3] = 7;
		 matrixA[1][4] = 7;	
		//заполнение 3 строки
		 matrixA[2][1] = 5; matrixA[2][0] = 4; matrixA[2][2] = 7; matrixA[2][3] = 7;
			 matrixA[2][4] = 7;
			//заполнение 4 строки
			 matrixA[3][1] = 1; matrixA[3][0] = 4; matrixA[3][2] = 7; matrixA[3][3] = 7;
				 matrixA[3][4] = 7;
				//заполнение 5 строки
				 matrixA[4][1] = 1; matrixA[4][0] = 4; matrixA[4][2] = 7; matrixA[4][3] = 8;
					 matrixA[4][4] = 7;
	for (int i = 0; i <= 4; i++) {
                for (int j = 0; j <= 4; j++) {
        	        System.out.print(matrixA[i][j] + "\t");
                }
                System.out.println();
	}
	}
	void print2() {
		 System.out.println(" Нечётные столбцы в которых первый элемент больше последнего: ");
		 for (int i = 1; i <= 4; i+=2) {
             for (int j = 0; j <= 4; j++) {
            	if(matrixA[0][i]>matrixA[4][i])
     	        System.out.print(matrixA[j][i] + "\t");
             }
             System.out.println();
	}
	}
	
	public static void main(String[] args) {
		TaskOne myTaskOne = new TaskOne();
		myTaskOne.print();
		myTaskOne.print2();        
	}

}
