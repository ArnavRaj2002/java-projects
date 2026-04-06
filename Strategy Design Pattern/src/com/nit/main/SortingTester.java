package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SortingTester {

	public static void main(String[] args) {
     try(AnnotationConfigApplicationContext ctx=new  AnnotationConfigApplicationContext(AppConfig.class))
     {
    	 SortingContext sortingContext = ctx.getBean(SortingContext.class);
    	 int arr[]= {8,2,9,6,4,1,7};
    	 sortingContext.executeSort(arr);
     }
     catch(Exception e)
     {
    	 e.printStackTrace();
     }
	}

}
