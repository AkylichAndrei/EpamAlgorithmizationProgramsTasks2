package decomposition;

import java.util.Scanner;

public class TaskNine {
	int p,x,y,z,t,s;

	void outputOnDisplay() {
	
	//http://mozgan.ru/Geometry/ArearQuadrangle
	 System.out.println("площадь четырЄх угольника ровна: " + p);
		}
	public static void main(String[] args) {
		TaskNine myTaskNine = new TaskNine();
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите длинну стороны X: ");
		myTaskNine.x = in.nextInt();
		System.out.println("¬ведите длинну стороны Y: ");
		myTaskNine.y = in.nextInt();
		System.out.println("¬ведите длинну стороны Z: ");
		myTaskNine.z = in.nextInt();
		System.out.println("¬ведите длинну стороны T: ");
		myTaskNine.t = in.nextInt();
		in.close();
		myTaskNine.outputOnDisplay(); 
	}

}
