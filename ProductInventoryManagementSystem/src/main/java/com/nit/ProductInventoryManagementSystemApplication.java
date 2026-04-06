package com.nit;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.controller.ProductController;
import com.nit.model.Product;

@SpringBootApplication
public class ProductInventoryManagementSystemApplication {

   

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ProductInventoryManagementSystemApplication.class, args);
		ProductController productController = ctx.getBean(ProductController.class);
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n1.-> Increase stock by a given amount");
			System.out.println("2.-> Decrease stock if enough quantity is available");
			System.out.println("3.-> Check product availability by ID");
			System.out.println("4.-> List products below a stock threshold.\n");
			System.out.println("Enter Choice <<==============>>");
			int choice = Integer.parseInt(sc.nextLine());
			
			try
			{
				switch (choice) {
				case 1:
				{
					System.out.println("Enter id : ");
					int id = sc.nextInt();
					System.out.println("Enter Quantity : ");
					int qty =sc.nextInt();
					sc.nextLine();
					String increaseStock = productController.IncreaseStock(qty, id);
					System.out.println(increaseStock);
				break;	
				}
				case 2:
				{
					System.out.println("Enter id : ");
					int id = sc.nextInt();
					System.out.println("Enter Quantity : ");
					int qty =sc.nextInt();
					sc.nextLine();
					String decreaseStock = productController.decreaseStock(qty,id);
					System.out.println(decreaseStock);
				break;	
				}
				case 3:
				{
					System.out.println("Enter id : ");
					int id = sc.nextInt();
					sc.nextLine();
					Boolean islistOfProductByID = productController.getListOfProductByID(id);
					System.out.println("is product with "+ id +" present in DB ?? --> "+islistOfProductByID);
				break;	
				}
				case 4:
				{
					System.out.println("Enter Quantity : ");
					int qty =sc.nextInt();
					sc.nextLine();
					List<Product> productBelowThreshold = productController.productBelowThreshold(qty);
					System.out.println(productBelowThreshold);
				break;	
				}
				default :
				{
					System.out.println("Invalid Choice !!!");

				}
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
