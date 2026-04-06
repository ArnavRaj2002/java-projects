package com.nit.main;

import java.util.Arrays;

import org.springframework.stereotype.Component;
@Component("ss")
public class SelectionSort implements SortingStrategy {

	@Override
	public void sort(int[] numbers) {
		int n=numbers.length;
      for(int i=0;i<=n-1;i++) {
    	  for(int j=i+1;j<=n-2;j++) {
    		  if(numbers[i]>numbers[j])
    		  {
    			  int temp=numbers[i];
    			  numbers[i]=numbers[j];
    			  numbers[j]=temp;
    		  }
    	  }
      }
      System.out.println("Sorted numbers by SelectionSort :- "+Arrays.toString(numbers));
	}

}
