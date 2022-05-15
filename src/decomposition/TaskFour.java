package decomposition;
import static java.lang.Math.*;
import java.util.Scanner;

public class TaskFour {
	double [][] coordinates = new double [2][100];
	double a,b,n,x,y,x2,y2,interval;
	int i,j;
	double maxDistance;
	boolean flag;
	
	void distance() {
	for( i = 0 ; i <= n - 2; i++ )
		for( j = i + 1 ; j <= n - 1; j++ )
	{
		interval = sqrt( pow( (coordinates[ 0 ][ j ] - coordinates[ 0 ][ i ]), n) + 
				pow( coordinates[ 1 ][ j] - coordinates[ 1 ][ i ], n));
		if(interval > maxDistance)
		{
			maxDistance = interval;
			x = coordinates[0][i];
			x2 = coordinates[0][j];
			y = coordinates[ 1 ][ i ];
			y2 = coordinates[ 1 ][ j];
		}
	}
	}
	void print() {
		System.out.println(" Максиммальное расстояние между точками равно  : " + maxDistance);
		System.out.println(" Координаты точки 1  : X = " + x + " Y =  " + y);
		System.out.println(" Координаты точки 2  : X = " + x2 + " Y =  " + y2);
	}
	
	public static void main(String[] args) {
		TaskFour myTaskFour = new TaskFour();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" Сколько точек будете вводить? ");
			myTaskFour.n = in.nextInt();
			for( myTaskFour.i = 0 ; myTaskFour.i <= myTaskFour.n - 1  ; myTaskFour.i++ ) {
			System.out.println(" Введите координаты точки  " + (myTaskFour.i + 1) +" �� X" );
			myTaskFour.coordinates[0][ myTaskFour.i] = in.nextDouble();
			System.out.println(" Введите координаты точки " + (myTaskFour.i + 1) +" �� Y" );
			myTaskFour.coordinates[1][myTaskFour.i] = in.nextDouble();
			}
			in.close();
		}
		
		myTaskFour.distance();
		myTaskFour.print();
		
	}

}
