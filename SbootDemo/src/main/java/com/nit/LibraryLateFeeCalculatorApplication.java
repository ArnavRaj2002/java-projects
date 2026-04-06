package com.nit;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.sbeans.BookModel;

@SpringBootApplication
public class LibraryLateFeeCalculatorApplication {

    

 	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(LibraryLateFeeCalculatorApplication.class, args);
		
		BookModel bookModel = ctx.getBean(BookModel.class);
			System.out.println(bookModel);
			
//			FineService fineService = ctx.getBean(FineService.class);
//			double calculateFine = fineService.calculateFine(bookModel.getDaysLate(), bookModel.getFinePerDay());
//			System.out.println("Total Fine: "+calculateFine);
			
			
		

	}
//	@Bean
//public BookModel getBookModel()
//{
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter Book Title: ");
//	String title=sc.nextLine();
//	
//	System.out.println("Enter Days Late: ");
//	int dayLate=Integer.parseInt(sc.nextLine());
//	
//	System.out.println("Enter Fine per Day: ");
//	Double finePerDay=Double.parseDouble(sc.nextLine());
//	BookModel bookModel =new BookModel(title, dayLate, finePerDay);
//	return bookModel;
//}
}
