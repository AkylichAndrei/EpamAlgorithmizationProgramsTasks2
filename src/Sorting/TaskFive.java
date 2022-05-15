package Sorting;
import java.util.Scanner;

// Правильно выполненное задание в TaskFiveTrue. Тут просто сортировка вставками.

public class TaskFive {
	int i,m,n,k,j,firstIndex,lastIndex,middleIndex;
	int temp;
	int[ ] dbArray = new int[ 100 ];
	void outputOnDisplay() {
		System.out.println(" Новая последовательность" );
		for( i = 0 ; i <= n - 1 ; i++ ) {
			System.out.print("  " + dbArray[ i ] );
			}
		}
	//Сортировка вставками
	void sort() {
		for( i = 1 ; i < n  ; i++ ) {
			  // Вытаскиваем значение элемента
  			int value = dbArray[i];
  			int j = i - 1;
  			for (; j >= 0; j--) {
  			// Если вытащили значение меньше передвигаем больший элемент дальше
  				if ( dbArray[j] > value) {
  					dbArray[j + 1] = dbArray[j];
  				} else {
  					// Если вытащенный элемент больше - стоп
  					break;
  				}
  			}
  			// В освободившееся место вставляем вытащ. элемент
  			dbArray[j + 1] = value;
		}	    		
	}

	public static void main(String[] args) {
		TaskFive myTaskFive = new TaskFive();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" Введите длинну массива A[N]: ");
			myTaskFive.n = in.nextInt();
			System.out.println(" Введите массив" );
			for( myTaskFive.i = 0 ; myTaskFive.i <= myTaskFive.n - 1 ; myTaskFive.i++ ) {
			myTaskFive.dbArray[myTaskFive.i] = in.nextInt();
			}
			in.close();
		}
		myTaskFive.sort(); 
		myTaskFive.outputOnDisplay();
	}

}
