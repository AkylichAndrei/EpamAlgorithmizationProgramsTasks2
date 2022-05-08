package decomposition;

import java.util.Scanner;
import static java.lang.Math.*;

public class TaskThree {
	int a,arrayLength,x;
	double s;
	double[ ] dbArray = new double[ 100 ];

	void s2() {
		
		 s = (( pow( a , 2) * sqrt( 3 ) ) / 4 ) * 6;
		 System.out.print(" Площадь правильного шестиугольника : " + s);
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskThree myTaskThree = new TaskThree();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите длинну стороны A: ");
		myTaskThree.a = in.nextInt();
		in.close();
		myTaskThree.s2(); 
	}

}
