package decomposition;

import java.util.Scanner;

public class TaskNine {
	int p,x,y,z,t,s;

	void outputOnDisplay() {
	
	//http://mozgan.ru/Geometry/ArearQuadrangle
	 System.out.println("������� ������ ��������� �����: " + p);
		}
	public static void main(String[] args) {
		TaskNine myTaskNine = new TaskNine();
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������ ������� X: ");
		myTaskNine.x = in.nextInt();
		System.out.println("������� ������ ������� Y: ");
		myTaskNine.y = in.nextInt();
		System.out.println("������� ������ ������� Z: ");
		myTaskNine.z = in.nextInt();
		System.out.println("������� ������ ������� T: ");
		myTaskNine.t = in.nextInt();
		in.close();
		myTaskNine.outputOnDisplay(); 
	}

}
