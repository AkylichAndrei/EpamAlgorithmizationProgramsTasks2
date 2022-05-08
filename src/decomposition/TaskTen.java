package decomposition;

import java.util.Scanner;

public class TaskTen {
	int i,m,n,k,arrayLength;
	double[ ] dbArray = new double[ 100 ];
		
	void outputOnDisplay() {
		
		while(n > 0){
			dbArray[ i ] = n % 10;
			i++;
			arrayLength++;
			n = n / 10;
		}
		System.out.println("Массив из цифр введённого числа: ");
		for( i = 0  ; i <= arrayLength - 1  ; i++ ) 
			System.out.print(dbArray[i]+" || ");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskTen myTaskTen = new TaskTen();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите натуральное число N: ");
		myTaskTen.n = in.nextInt();
		in.close();
		myTaskTen.outputOnDisplay();  
	}

}
