package arraysOfArrays;

import java.util.Scanner;

public class TaskThree {
	int[][] matrixA = new int [5][5];
	int k,p;
	void print() {
		   System.out.println(" ���� �������: ");
		 //���������� 1 ������ 
		matrixA[0][0] = 1; matrixA[0][1] = 8; matrixA[0][2] = 3; matrixA[0][3] = 9;
		matrixA[0][4] = 9;
	//���������� 2 ������
	matrixA[1][1] = 1; matrixA[1][0] = 4; matrixA[1][2] = 7; matrixA[1][3] = 7;
		matrixA[1][4] = 7;	
		//���������� 3 ������
		matrixA[2][1] = 5; matrixA[2][0] = 4; matrixA[2][2] = 7; matrixA[2][3] = 7;
			matrixA[2][4] = 7;
			//���������� 4 ������
			matrixA[3][1] = 1; matrixA[3][0] = 4; matrixA[3][2] = 7; matrixA[3][3] = 7;
				matrixA[3][4] = 7;
				//���������� 5 ������
				matrixA[4][1] = 1; matrixA[4][0] = 4; matrixA[4][2] = 7; matrixA[4][3] = 8;
					matrixA[4][4] = 7;
	for (int i = 0; i <= 4; i++) {
                for (int j = 0; j <= 4; j++) {
        	        System.out.print(matrixA[i][j] + "\t");
                }
                System.out.println();
	}
	}
	void printK() {
		 System.out.println("��������� ������:");
		 int i  = k - 1;
         for (int j = 0; j <= 4; j++) {
 	        System.out.print(matrixA[i][j] + "\t");
         }
         System.out.println();
	
	}
	void printP() {
		 System.out.println("��������� �������:");
		 int j  = p - 1;
         for (int i = 0; i <= 4; i++) {
 	        System.out.print(matrixA[i][j] + "\t");
         }
         System.out.println();
	}
	public static void main(String[] args) {
		TaskThree myTaskThree = new TaskThree();
		myTaskThree.print();
		Scanner in = new Scanner(System.in);
		System.out.println(" ����� ������ �������?: ");
		myTaskThree.k = in.nextInt();
		myTaskThree.printK();
		System.out.println(" ����� ������� �������?: ");
		myTaskThree.p = in.nextInt();
		myTaskThree.printP();
		in.close();
	}

}
