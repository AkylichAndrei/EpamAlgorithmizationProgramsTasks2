package decomposition;

import java.util.Scanner;

public class TaskThirteen {
	int i,j,m,n,k,arrayLength,x;
	double[ ] dbArray = new double[ 100 ];

	void decomposition() {
	 for( i = n ; i <= ( n * 2 ) - 1 ; i++)
		 decomposition2();
		}
	void decomposition2() {
		for( j = i + 1 ; j <= ( n * 2 )  ; j++)
			 if(( j - i ) == 2 ){
				 System.out.println("Числа: " + i + " и " + j + " Близнецы");
		 }
	}
	public static void main(String[] args) {
		TaskThirteen myTaskThirteen = new TaskThirteen();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число N: ");
		myTaskThirteen.n = in.nextInt();
		in.close();
		myTaskThirteen.decomposition(); 
	}

}
