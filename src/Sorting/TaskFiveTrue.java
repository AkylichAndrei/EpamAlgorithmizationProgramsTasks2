package Sorting;

import java.util.Arrays;

public class TaskFiveTrue {
	
	public static void main(String[] args) {

		int i,j,firstIndex,lastIndex, indexElementToSearch;
		int temp,temp2,stage=0;
		int[] array = {9, 7, 8, 3, 8}; //объ€вл€ем и инициализируем массив
		int[] arraySort = new int[5];
		System.out.println("ћассив не отсортирован:  ");//печатаем массив 
        System.out.println(Arrays.toString(array));//печатаем массив 
        
      //  Arrays.sort(array, 0, 5); //сортируем весь массив от нулевого до четвЄртого члена
       arraySort[0] = array[0];
        for( i = 1 ; i <= 4 ; i++)
        {   
        	stage++;
        	int elementToSearch = array[i];
        	firstIndex=0;
        	lastIndex = i;
        	indexElementToSearch = binarySearch(arraySort, elementToSearch ,firstIndex ,lastIndex);
                       
        	//вставл€ем найденный елемент в массив
        	temp = arraySort[indexElementToSearch];
        	arraySort[indexElementToSearch]=elementToSearch;
        	
        	//сдвигаем все элементы в право
        		for (j = indexElementToSearch + 1; j <= i; j++) {
        			temp2 = arraySort[ j ];
        			arraySort[ j ] = temp;
        			temp = temp2;
        			}
        		System.out.println("Ётап вставки в массив є "+stage);//выводим отсортированный массив на экран
        		System.out.println(Arrays.toString(arraySort));//выводим отсортированный массив на экран
        }
        
        
	}
	
	public static int binarySearch(int arrSort[], int elementToSearch, int firstIndex, int lastIndex) {
		int indexElementToSearch=0;
		//(lastIndex - firstIndex) > 1
		
	    while(firstIndex <= lastIndex) {
		
	    int middleIndex = (firstIndex + lastIndex) / 2;
	    
	    //сли интервал минимальный 
	    if ((firstIndex==lastIndex)&&(elementToSearch > arrSort[middleIndex])) {
	    	indexElementToSearch = middleIndex + 1;
	    	break;
	    }
	    if ((firstIndex==lastIndex)&&(elementToSearch < arrSort[middleIndex])) {
	    	indexElementToSearch = middleIndex;
	    	break;
	    }
	    //если мы нашли элемент одинаковый
	    if (elementToSearch == arrSort[middleIndex]) {
	    	indexElementToSearch = middleIndex;
	    	break;
	    }
	    
	 // если средний элемент больше
        // направл€ем наш индекс в middle-1, убира€ вторую часть из рассмотрени€
	   else if (elementToSearch < arrSort[middleIndex]  ) 
            lastIndex = middleIndex - 1;
        
	 // если средний элемент меньше
        // направл€ем наш индекс в middle+1, убира€ первую часть из рассмотрени€
        else if (elementToSearch > arrSort[middleIndex]  ) 
            firstIndex = middleIndex + 1;

	    indexElementToSearch=middleIndex;
	    }
	    System.out.println(" центральный элемент"+indexElementToSearch);
	return indexElementToSearch ;
	}
}
