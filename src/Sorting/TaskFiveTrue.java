package Sorting;
import java.util.Arrays;

// Это правильно выполненное задание 5. В TaskFive просто сортировка.

public class TaskFiveTrue {
	
	public static void main(String[] args) {

		int i,j,firstIndex,lastIndex, indexElementToSearch;
		int temp,temp2,stage=0;
		int[] array = {9, 7, 8, 3, 8}; //объявляем и инициализируем массив
		int[] arraySort = new int[5];
		System.out.println(" Массив не отсортирован:  ");
        System.out.println(Arrays.toString(array));//печатаем массив 
        
       arraySort[0] = array[0];
        for( i = 1 ; i <= 4 ; i++)
        {   
        	stage++;
        	int elementToSearch = array[i];
        	firstIndex=0;
        	lastIndex = i;
        	indexElementToSearch = binarySearch(arraySort, elementToSearch ,firstIndex ,lastIndex);
                       
        	// вставляем найденный элемент в массив
        	temp = arraySort[indexElementToSearch];
        	arraySort[indexElementToSearch]=elementToSearch;
        	
        	//сдвигаем все элементы в право
        		for (j = indexElementToSearch + 1; j <= i; j++) {
        			temp2 = arraySort[ j ];
        			arraySort[ j ] = temp;
        			temp = temp2;
        			}
        		System.out.println(" Этап вставки в массив № " + stage);
        		System.out.println(Arrays.toString(arraySort));//выводим отсортированный массив на экран
        }
	}
	
	public static int binarySearch(int arrSort[], int elementToSearch, int firstIndex, int lastIndex) {
		int indexElementToSearch=0;
	    while(firstIndex <= lastIndex) {
	    int middleIndex = (firstIndex + lastIndex) / 2;
	    
	    // Если интервал минимальный
	    if ((firstIndex==lastIndex)&&(elementToSearch > arrSort[middleIndex])) {
	    	indexElementToSearch = middleIndex + 1;
	    	break;
	    }
	    if ((firstIndex==lastIndex)&&(elementToSearch < arrSort[middleIndex])) {
	    	indexElementToSearch = middleIndex;
	    	break;
	    }
	    //Если мы нашли элемент одинаковый
	    if (elementToSearch == arrSort[middleIndex]) {
	    	indexElementToSearch = middleIndex;
	    	break;
	    }
	    
	 // если средний элемент больше
        // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
	   else if (elementToSearch < arrSort[middleIndex]  ) 
            lastIndex = middleIndex - 1;
        
	 // если средний элемент меньше
        // направляем наш индекс в middle+1, убирая первую часть из расмотрения
        else if (elementToSearch > arrSort[middleIndex]  ) 
            firstIndex = middleIndex + 1;
	    indexElementToSearch=middleIndex;
	    }
	    System.out.println("  центральный элемент "+indexElementToSearch);
	return indexElementToSearch ;
	}
}
