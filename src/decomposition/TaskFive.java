package decomposition;

import java.util.Scanner;

public class TaskFive {
	int[ ] dbArray = new int[100];
	int n,i,theLargestNumber,secondLargestNumber,temp;
	boolean flag;
	
	void print() {
		
		//ищем наиболшее число
		theLargestNumber=dbArray[0];
		for(i  = 1 ;i <= n - 1; i++) 
		if(  theLargestNumber < dbArray[i]  )  
			theLargestNumber=dbArray[i];

	   //ищем второе по величине
		for(i  = 1 ;i <= n - 1; i++) 
			if(dbArray[i]<theLargestNumber&secondLargestNumber<dbArray[i])
				 secondLargestNumber=dbArray[i];
		
		System.out.println(" Первое по величине число = " +  theLargestNumber);
		System.out.println(" Второе по величине число = " +  secondLargestNumber);
	}
	public static void main(String[] args) {
		TaskFive myTaskFive = new TaskFive();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" Сколько элементов массива вы хотите ввести?");
			myTaskFive.n = in.nextInt();
			for( myTaskFive.i = 0 ; myTaskFive.i <= myTaskFive.n - 1  ; myTaskFive.i++ ) {
			System.out.println(" Введите число " + (myTaskFive.i + 1) );
			myTaskFive.dbArray[myTaskFive.i] = in.nextInt();
			}
			in.close();
		}
		myTaskFive.print();

	}

}
