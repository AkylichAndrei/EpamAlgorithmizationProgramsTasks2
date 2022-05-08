package decomposition;

import java.util.Scanner;

public class TaskFifteen {
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
		for( j = 0  ; j <= arrayLength - 2  ; j++ ) 
			if((dbArray[j]-dbArray[j+1]) != 1 ) //в массиве цифры стоят задом наперёд :)
				flag = true;
	}
	void decomposition4() {
		 if(flag != true)
	    	 System.out.println("Найдена строго возрастающая последовательность: " + i);
	     x=0;
	     j=0;
	     arrayLength=0;
	     flag=false;
	}
	public static void main(String[] args) {
		
		TaskFifteen myTaskFifteen = new TaskFifteen();
				Scanner in = new Scanner(System.in);
				System.out.println("Введите число до которого будем искать: ");
				myTaskFifteen.k = in.nextInt();
				in.close();
				myTaskFifteen.decomposition(); 
	}

}
