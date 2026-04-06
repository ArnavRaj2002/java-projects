package com.nit.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.service.IProductService;
@Component
public class ProductRunner implements CommandLineRunner {
	Scanner sc = new Scanner(System.in);
	@Autowired
	private IProductService prodService;

	@Override
	public void run(String... args) throws Exception {

		while (true) {
			System.out.println("\n=====> PRODUCT QUERY MENU <=====");
			System.out.println("1. Get products by category");
			System.out.println("2. Get all available products");
			System.out.println("3. Get products costlier than a given price");
			System.out.println("4. Get all products sorted by price descending");
			System.out.println("5. Count total available products");

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Category ");
				String category = sc.next();
				prodService.getProductsByCategory(category).forEach(System.out::println);
				break;
			case 2:
				prodService.getAvailableProducts().forEach(System.out::println);
				break;
			case 3:
				System.out.println("Enter Minimum Price ");
				Double minPrice = sc.nextDouble();
				prodService.getProductsCostlierThan(minPrice).forEach(System.out::println);
				break;
			case 4:
				prodService.getAllProductsSortedByPriceDesc().forEach(System.out::println);
				break;
			case 5:
				Long availableProductCount = prodService.getAvailableProductCount();
				System.out.println("Total Available Products is " + availableProductCount);
				break;
			default:
				System.out.println("Invalid Choice !!");

			}
		}

	}

}
