package decomposition;
import static java.lang.Math.*;
import java.util.Scanner;

public class TaskFourteen {
	int i,j,m,n,k,arrayLength;
	double x;
	boolean flag;
	double[ ] dbArray = new double[ 100 ];

	void decomposition() {
	 for( i = 1 ; i <= k ; i++) {
		 decomposition2();
	     decomposition3();
	     decomposition4();
	    
	 }
		}
	void decomposition2() {
		n = i;
		while(n > 0){
			dbArray[ j ] = n % 10;
			j++;
			arrayLength++;
			n = n / 10;
		}
	}
	void decomposition3() {
		for( j = 0  ; j <= arrayLength - 1  ; j++ ) 
			x = x + pow(dbArray[j],arrayLength);
	}
	void decomposition4() {
		 if(x == i)
	    	 System.out.println("Найдено число Армстронга: " + x);
	     x=0;
	     j=0;
	     arrayLength=0;
	}
	public static void main(String[] args) {
		// число армстронга 153 ( 1*1*1+5*5*5+3*3*3)
		TaskFourteen myTaskFourteen = new TaskFourteen();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число K: ");
		myTaskFourteen.k = in.nextInt();
		in.close();
		myTaskFourteen.decomposition(); 
	}

}
