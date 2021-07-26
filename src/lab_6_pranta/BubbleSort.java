package lab_6_pranta;

import java.util.Arrays;

public class BubbleSort implements Strategy{

	@Override
	public void SortAlgorithm(int[] number) {
		// TODO Auto-generated method stub
		int n = number.length;
		int temp = 0;
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                     if(number[j-1] > number[j]){  
                            //swap elements  
                            temp = number[j-1];  
                            number[j-1] = number[j];  
                            number[j] = temp;  
                    }  
                     
            }  
        }
		System.out.println("BubbleSort");
		System.out.println(Arrays.toString(number));
		System.out.println();
	}

}
