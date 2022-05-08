package decomposition;


public class TaskSeven {
	
	int n,i,j,fak,sumFak;
	boolean flag;
	
	void faktorial() {
		fak=1;
		//ищем факториал
		for(i  = 1 ;i <= 9; i = i + 2) {
			for(j = 1; j <= i; j++ )
				fak = fak*j;
		sumFak = sumFak + fak;
		fak=1;
		}
		
		System.out.println(" Сумма факториалов нечётных чисел от 1 до 9 ровна  = " +  sumFak);
	}
	public static void main(String[] args) {
		TaskSeven myTaskSeven = new TaskSeven();
		myTaskSeven.faktorial();
		

	}

}
