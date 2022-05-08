package decomposition;

import java.util.Scanner;

public class TaskSeventeen {
	int i,j,m,arrayLength;
	int x,summ,k,n;
	boolean flag;
	int[ ] dbArray = new int[ 100 ];

	void decomposition() {
		x = k;
	 while( k > 0 ) {
		 decomposition2();
	     decomposition3();
	     decomposition4();
	     
	 }
	 System.out.println("Для числа: " + x + " нужно произвести: " + m + " действий, чтобы получить 0 ");
		}
	void decomposition2() {
		n = k;
		while(n > 0){
			dbArray[ j ] = n % 10;
			j++;
			arrayLength++;
			n = n / 10;
		}
	}
	void decomposition3() {
		for( j = 0  ; j <= arrayLength - 1  ; j++ ) 
			summ = summ + dbArray[ j ]; //в массиве цифры стоят задом наперёд :)
	}
	void decomposition4() {
		 k = k - summ;
	     j=0;
	     arrayLength=0;  
	     m++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskSeventeen myTaskSeventeen = new TaskSeventeen();
		Scanner in = new Scanner(System.in);
		System.out.println("Задайте число: ");
		myTaskSeventeen.k = in.nextInt();
		in.close();
		myTaskSeventeen.decomposition(); 
	}

}
