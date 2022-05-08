package decomposition;

import java.util.Scanner;

public class TaskTwo {
	int[ ] dbArray = new int[4];
	int n,i,nod,nok,smallNumber;
	boolean flag;
	
	void nod() {
		flag = true;
		nod = 2;
		//ищем наиболшее число
		nod=dbArray[0];
		for(i  = 1 ;i <= n - 1; i++) 
		if(  nod < dbArray[i]  )  
			nod=dbArray[i];
	   //ищем наибольшее общее кратное
		while(flag==true) {
			flag = false;
		for(i  = 0 ;i <= n - 1; i++) 
			if(( dbArray[i] % nod  ) != 0 ) {
				flag = true;
		}
		nod--;
		}
		
		nod++;
		System.out.println(" Наибольший общий делитель = " +  nod);
	}
	public static void main(String[] args) {
		TaskTwo myTaskTwo = new TaskTwo();
		try (Scanner in = new Scanner(System.in)) {
			myTaskTwo.n = 4;
			for( myTaskTwo.i = 0 ; myTaskTwo.i <= myTaskTwo.n - 1  ; myTaskTwo.i++ ) {
			System.out.println(" Введите число " + (myTaskTwo.i + 1) );
			myTaskTwo.dbArray[myTaskTwo.i] = in.nextInt();
			}
			in.close();
		}
		myTaskTwo.nod();
		

	}

}
