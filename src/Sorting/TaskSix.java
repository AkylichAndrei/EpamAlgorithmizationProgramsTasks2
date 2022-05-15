package Sorting;

import java.util.Scanner;

public class TaskSix {
	int i,m,n,k,j,firstIndex,lastIndex,middleIndex;
	int temp;
	int[ ] dbArray = new int[ 100 ];
	void outputOnDisplay() {
		System.out.println(" Новая последовательность " );
		for( i = 0 ; i <= n - 1 ; i++ ) {
			System.out.print("  " + dbArray[ i ] );
			}
		}
	// Сортировка шелла
	public void sort() {
        int h = 1;
        while (h*3 <n)
            h = h * 3 + 1;
        while(h >= 1) {
            hSort(dbArray, h);
            h = h/3;
        }
    }

    private void hSort(int[] dbArray, int h) {
        int length = n ;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (dbArray[j] < dbArray[j - h])
                    swap(dbArray, j, j - h);
                else
                    break;
            }
        }
    }
    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
	public static void main(String[] args) {
		TaskSix myTaskSix = new TaskSix();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" Введите длинну массива A[N]: ");
			myTaskSix.n = in.nextInt();
			System.out.println(" Введите массив " );
			for( myTaskSix.i = 0 ; myTaskSix.i <= myTaskSix.n - 1 ; myTaskSix.i++ ) {
			myTaskSix.dbArray[myTaskSix.i] = in.nextInt();
			}
			in.close();
		}
		myTaskSix.sort(); 
		myTaskSix.outputOnDisplay();
	}

}
