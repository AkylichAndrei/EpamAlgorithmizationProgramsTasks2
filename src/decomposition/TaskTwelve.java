package decomposition;

import java.util.Scanner;

public class TaskTwelve {
	int i,j,m,n,k,arrayLength,x;
	double[ ] dbArray = new double[ 100 ];

	void outputOnDisplay() {
		x = n;
	 do
	 {
			x--;
			arrayLength++;
	 }while( k % x != 0);
	 arrayLength = k / x;
	 for( i = 0 ; i <= arrayLength - 1 ; i++)
		 dbArray[ i ] = x;
	 System.out.println("¬аш массив: ");
	 for( i = 0 ; i <= arrayLength - 1 ; i++)
		 System.out.print(" || " + dbArray[ i ]);
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskTwelve myTaskTwelve = new TaskTwelve();
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите число K: ");
		myTaskTwelve.k = in.nextInt();
		System.out.println("¬ведите число N: ");
		myTaskTwelve.n = in.nextInt();
		in.close();
		myTaskTwelve.outputOnDisplay(); 
	}

}
