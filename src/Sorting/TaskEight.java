package Sorting;

import java.util.Scanner;

public class TaskEight {
	int i,m,n,k,j;
	int noz;
	int temp;
	int[ ] dbArray = new int[ 100 ];
	int[ ] dbArray2 = new int[ 100 ];
	boolean flag;
	
	
	void output() {
		System.out.println("Ваши дроби= ");
		for( i = 0 ; i <= n - 1  ; i++ ) {
			System.out.println( dbArray[i] + " / "+dbArray2[i] );
			}
		
	}
	void noz() {
		flag = true;
		noz = 2;
		//ищем общий знаменатель
		while(flag==true) {
			flag = false;
		for(i  = 0 ;i <= n - 1; i++) 
			if(( noz % dbArray2[i]  ) != 0 ) {
				flag = true;
		}
		noz++;
		}
		
		noz--;
		System.out.println(" Общий знаменатель = " +  noz);
		
		//домножаем чеслители на общий знаменатель
		for(i  = 0 ;i <= n - 1; i++) {
			 dbArray[i] = dbArray[i] * (noz / dbArray2[i]); 
		}
		//в знаменатели записываем наименьший общий знаменатель
		for(i  = 0 ;i <= n - 1; i++) {
			 dbArray2[i] = noz; 
		}
		sort();
	}
	void sort() {
		System.out.println(" Соритируем в порядке возрастания  " );
		for( i = 1 ; i < n  ; i++ ) {
			//binarySearch();
			  // Вытаскиваем значение элемента
  			int value = dbArray[i];
  			int j = i - 1;
  			for (; j >= 0; j--) {
  			// Если вытащили значение меньшее — передвигаем больший элемент дальше
  				if ( dbArray[j] > value) {
  					dbArray[j + 1] = dbArray[j];
  				} else {
  					// Если вытащенный элемент больше — останавливаемся
  					break;
  				}
  			}
  			// В освободившееся место вставляем вытащенное значение
  			
  			dbArray[j + 1] = value;
			
		}
	}
	public static void main(String[] args) {
		TaskEight myTaskEight = new TaskEight();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Сколько дробей p/q вы хотите ввести? : ");
			myTaskEight.n = in.nextInt();
			for( myTaskEight.i = 0 ; myTaskEight.i <= myTaskEight.n - 1  ; myTaskEight.i++ ) {
			System.out.println(" Введите числитель дроби " + (myTaskEight.i+1) + "  p = ");
			myTaskEight.dbArray[myTaskEight.i] = in.nextInt();
			System.out.println(" Введите Знаменатель дроби " + (myTaskEight.i+1) + "  q = ");
			myTaskEight.dbArray2[myTaskEight.i] = in.nextInt();
			}
			in.close();
		}
		myTaskEight.output(); 
		myTaskEight.noz(); 
		myTaskEight.output();
	}


}
