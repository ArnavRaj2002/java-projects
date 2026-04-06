package com.nit.main;

import java.util.Arrays;

import org.springframework.stereotype.Component;
@Component("bs")
public class BubbleSort implements SortingStrategy {

	@Override
	public void sort(int[] numbers) {
     int n=numbers.length;
     for(int i=0;i<n;i++) {//no. of rounds
    	 for(int j=0;j<n-1-i;j++) {
    		 if(numbers[j]>numbers[j+1]) 
    		 {
    			int temp=numbers[j];
    			numbers[j]=numbers[j+1];
    			numbers[j+1]=temp;
    		 }
    	 }
     }
     System.out.println("Sorted numbers by BubbleSort :- "+Arrays.toString(numbers));
	}

}
