package Sorting;

import java.util.Arrays;

public class TaskFiveTrue {
	
	public static void main(String[] args) {

		int i,j,firstIndex,lastIndex, indexElementToSearch;
		int temp,temp2,stage=0;
		int[] array = {9, 7, 8, 3, 8}; //��������� � �������������� ������
		int[] arraySort = new int[5];
		System.out.println("������ �� ������������:  ");//�������� ������ 
        System.out.println(Arrays.toString(array));//�������� ������ 
        
      //  Arrays.sort(array, 0, 5); //��������� ���� ������ �� �������� �� ��������� �����
       arraySort[0] = array[0];
        for( i = 1 ; i <= 4 ; i++)
        {   
        	stage++;
        	int elementToSearch = array[i];
        	firstIndex=0;
        	lastIndex = i;
        	indexElementToSearch = binarySearch(arraySort, elementToSearch ,firstIndex ,lastIndex);
                       
        	//��������� ��������� ������� � ������
        	temp = arraySort[indexElementToSearch];
        	arraySort[indexElementToSearch]=elementToSearch;
        	
        	//�������� ��� �������� � �����
        		for (j = indexElementToSearch + 1; j <= i; j++) {
        			temp2 = arraySort[ j ];
        			arraySort[ j ] = temp;
        			temp = temp2;
        			}
        		System.out.println("���� ������� � ������ � "+stage);//������� ��������������� ������ �� �����
        		System.out.println(Arrays.toString(arraySort));//������� ��������������� ������ �� �����
        }
        
        
	}
	
	public static int binarySearch(int arrSort[], int elementToSearch, int firstIndex, int lastIndex) {
		int indexElementToSearch=0;
		//(lastIndex - firstIndex) > 1
		
	    while(firstIndex <= lastIndex) {
		
	    int middleIndex = (firstIndex + lastIndex) / 2;
	    
	    //��� �������� ����������� 
	    if ((firstIndex==lastIndex)&&(elementToSearch > arrSort[middleIndex])) {
	    	indexElementToSearch = middleIndex + 1;
	    	break;
	    }
	    if ((firstIndex==lastIndex)&&(elementToSearch < arrSort[middleIndex])) {
	    	indexElementToSearch = middleIndex;
	    	break;
	    }
	    //���� �� ����� ������� ����������
	    if (elementToSearch == arrSort[middleIndex]) {
	    	indexElementToSearch = middleIndex;
	    	break;
	    }
	    
	 // ���� ������� ������� ������
        // ���������� ��� ������ � middle-1, ������ ������ ����� �� ������������
	   else if (elementToSearch < arrSort[middleIndex]  ) 
            lastIndex = middleIndex - 1;
        
	 // ���� ������� ������� ������
        // ���������� ��� ������ � middle+1, ������ ������ ����� �� ������������
        else if (elementToSearch > arrSort[middleIndex]  ) 
            firstIndex = middleIndex + 1;

	    indexElementToSearch=middleIndex;
	    }
	    System.out.println(" ����������� �������"+indexElementToSearch);
	return indexElementToSearch ;
	}
}
