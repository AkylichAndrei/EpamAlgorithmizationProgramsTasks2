package decomposition;

import java.util.Scanner;

public class TaskeEleven {
	int i,j,m,n,k,arrayLengthN,arrayLengthM,n1,m1;
	double[ ] dbArray = new double[ 100 ];
	double[ ] dbArray2 = new double[ 100 ];
	void outputOnDisplay() {
		n1 = n;
		m1 = m;
		while(n > 0){
			dbArray[ i ] = n % 10;
			i++;
			arrayLengthN++;
			n = n / 10;
		}
		while(m > 0){
			dbArray2[ j ] = m % 10;
			j++;
			arrayLengthM++;
			m = m / 10;
		}
		if( arrayLengthN > arrayLengthM )
			System.out.print("Количество цифр в числе " + n1 +" больше ");
		else if( arrayLengthN < arrayLengthM )
			System.out.print("Количество цифр в числе " + m1 +" больше ");
		else System.out.println("Количество цифр одинаковое: ");
		}
	public static void main(String[] args) {
		TaskeEleven myTaskeEleven = new TaskeEleven();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите первое натуральнвое число для сравнения: ");
		myTaskeEleven.n = in.nextInt();
		System.out.println("Введите торое натуральнвое число для сравнения: ");
		myTaskeEleven.m = in.nextInt();
		in.close();
		myTaskeEleven.outputOnDisplay(); 
	}

}
