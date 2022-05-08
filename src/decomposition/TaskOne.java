package decomposition;

import java.util.Scanner;

public class TaskOne {
	int[ ] dbArray = new int[2];
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
		System.out.println(" Ќаибольший общий делитель = " +  nod);
	}
	void nok() {
		flag = true;
		nok = 2;
		//ищем наименьшее число
		smallNumber=dbArray[0];
		for(i  = 1 ;i <= n - 1; i++) 
		if(  smallNumber > dbArray[i]  )  
			smallNumber = dbArray[i];
		
		while(flag==true) {
			flag = false;
		for(i  = 0 ;i <= n - 1; i++) 
			if((  dbArray[i] % nok  ) != 0 ) {
				flag = true;
		}
		
		//если вышли за пределы самого маленького числа
		if(nok >= smallNumber) {
			flag = false;
			nok=1;
		}
		nok++;
		}
		
		nok--;
		System.out.println(" Ќаименьшее общее кратное = " +  nok);
	}
	public static void main(String[] args) {
		TaskOne myTaskOne = new TaskOne();
		try (Scanner in = new Scanner(System.in)) {
			myTaskOne.n = 2;
			for( myTaskOne.i = 0 ; myTaskOne.i <= myTaskOne.n - 1  ; myTaskOne.i++ ) {
			System.out.println(" ¬ведите число " + (myTaskOne.i + 1) );
			myTaskOne.dbArray[myTaskOne.i] = in.nextInt();
			}
			in.close();
		}
		myTaskOne.nod();
		myTaskOne.nok();

	}

}
