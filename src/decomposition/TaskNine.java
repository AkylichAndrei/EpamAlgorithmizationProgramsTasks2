package decomposition;

import java.util.Scanner;

public class TaskNine {
	double p,x,y,z,t,s;

	void outputOnDisplay() {
		p=(x+y+z+t)/2;
	 System.out.println(" Полупериметр четырёх угольника равен: " + p);
	 s= Math.cbrt((p - x) * (p - y) * (p - z) * (p - t));
	 System.out.println(" Площадь четырёх угольника ровна: " + s);
		}
	public static void main(String[] args) {
		TaskNine myTaskNine = new TaskNine();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите длинну стороны X: ");
		myTaskNine.x = in.nextDouble();
		System.out.println("Введите длинну стороны Y: ");
		myTaskNine.y = in.nextDouble();
		System.out.println("Введите длинну стороны Z: ");
		myTaskNine.z = in.nextDouble();
		System.out.println("Введите длинну стороны T: ");
		myTaskNine.t = in.nextDouble();
		in.close();
		myTaskNine.outputOnDisplay(); 
	}

}
