package com.nit;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.NumberService;

@SpringBootApplication
public class EvenorOddCheckerApplication {

     
	public static void main(String[] args) {
try(ConfigurableApplicationContext ctx = SpringApplication.run(EvenorOddCheckerApplication.class, args);Scanner sc=new Scanner(System.in))
{
	System.out.println("Enter number : ");
	int no=sc.nextInt();
	NumberService numberService = ctx.getBean(NumberService.class);
	String checkEvenOdd = numberService.checkEvenOdd(no);
	System.out.println(no+" is "+checkEvenOdd);
	
}
catch(Exception e)
{
	e.printStackTrace();
}
}

}
