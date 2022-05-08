package OneDimensionalArrays;

import java.util.Scanner;

public class TaskNine {
	int i,n,j,m;
	double[ ] dbArray = new double[ 100 ];
	double minNum,repeatNum, tempMinNum, tempRepeatNum;
	void searchNumber() {
		minNum = 999; 
		repeatNum = 0;
		for( i = 0 ; i <= n - 1 ; i++ ) 
		{
			tempRepeatNum = 0;
		for(j = 0; j <= n - 1; j++ ) 
			if(dbArray[ i ] == dbArray [ j ])
				tempRepeatNum++;
		if((minNum > dbArray[i]) & (tempRepeatNum >= repeatNum )){
			minNum = dbArray[i];
			repeatNum = tempRepeatNum;
		}
		}
	}
	void print() {	
	System.out.println(" Минимальный элемент : " + minNum 
			+ " Количество повторений : " + repeatNum);
	}
	public static void main(String[] args) {
		TaskNine myTaskNine = new TaskNine();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" Из скольки чисел будет последовательность?: ");
			myTaskNine.n = in.nextInt();
			System.out.println(" Вводите числа: ");
			for( myTaskNine.i = 0 ; myTaskNine.i <= myTaskNine.n - 1 ; myTaskNine.i++ ) {
			myTaskNine.dbArray[ myTaskNine.i ] =  in.nextDouble();
			}
			System.out.println(" Массив заполнен ");
			in.close();
		}
		myTaskNine.searchNumber(); 
		myTaskNine.print(); 

	}

}
