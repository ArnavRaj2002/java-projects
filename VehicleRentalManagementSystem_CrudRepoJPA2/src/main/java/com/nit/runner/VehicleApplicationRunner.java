package com.nit.runner;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nit.entity.Vehicle;
import com.nit.service.VehicleService;

public class VehicleApplicationRunner implements CommandLineRunner{
	@Autowired
	private VehicleService vehicleService;

	@Override
	public void run(String... args) throws Exception {
		
		while(true)
		{
			 
			
			 System.out.println("1. Add a new travel booking.");
			 System.out.println("2. Retrieve all travel bookings.");
			 System.out.println("3. Find a travel booking by ID.");
			 System.out.println("4. Delete a travel booking by ID.");
			 System.out.println("5. Check if a travel booking exists.");
			 System.out.println("6. Count total travel bookings.");
			 System.out.println("7. Delete a specific travel booking.");
			 System.out.println("8. Delete all travel bookings.");
			 System.out.println("9. Exit.");
			 System.out.println("=================================");
			 System.out.println("Enter Choice :- ");
			 Scanner sc=new Scanner(System.in);
			 int choice=sc.nextInt();
			 switch(choice)
			 {
			 case 1:
			 {
				   
					System.out.println("Record Inserted Successfully !!");
				break; 
			 }
			 case 2:
			 {
				break;  
			 }
			 case 3:
			 {
				 System.out.println("Enter ID :- ");
				 Long id=sc.nextLong();
				 sc.nextLine();
				  vehicleService.findVehicleById(id);  
 				 break;
			 }
			 case 4:
			 {
 				 System.out.println("Enter ID :- ");
				 Long id=sc.nextLong(); 
  
			 }
			 case 5:
			 {
				 System.out.println("Enter ID :- ");
				 Long id=sc.nextLong();
				 sc.nextLine();
				 vehicleService.deleteVehicleById(id);
				 break; 
			 }
			
			 case 6:
			 {
				 
				vehicleService.deleteVehicle(null);
				 break; 
			 }
			 case 7:
			 {
                   vehicleService.deleteAllVehicles(List.of(new Vehicle(), new Vehicle()));
				 break; 
			 }
			 case 8:
			 {
				vehicleService.deleteAllVehicles();;
				System.out.println("All records deleted sucessfully from DB!!");
				 break; 
			 }
			 case 9:
			 {
				 sc.close();
				 System.exit(0);
			 }
			 default: System.out.println("Invalid Choice");
			 }
		}
		 
		 
	}

}
