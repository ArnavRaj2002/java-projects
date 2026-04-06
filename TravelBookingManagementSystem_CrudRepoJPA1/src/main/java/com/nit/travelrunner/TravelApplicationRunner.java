package com.nit.travelrunner;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nit.TravelBookingManagementSystemJpaApplication;
import com.nit.entity.TravelEntity;
import com.nit.repository.TravelRepository;
import com.nit.travelcontroller.TravelController;

@Component
public class TravelApplicationRunner implements CommandLineRunner
{

    
	@Autowired
private TravelController travelController;

   
	@Override
	public void run(String... args) throws Exception 
	{
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
				  TravelEntity travel=new TravelEntity("Bus",150.00);
				  travelController.addTravel(travel);
					System.out.println("Record Inserted Successfully !!");
				break; 
			 }
			 case 2:
			 {
				 Iterable<TravelEntity> allTravels = travelController.retrieveAllTravels();
				 //System.out.println(allTravels);
				 allTravels.forEach(System.out::println);
				 break;
			 }
			 case 3:
			 {
				 System.out.println("Enter ID :- ");
				 Long id=sc.nextLong();
				 sc.nextLine();
				  travelController.findTravelById(id);  
 				 break;
			 }
			 case 4:
			 {
 				 System.out.println("Enter ID :- ");
				 Long id=sc.nextLong(); 
				 travelController.deleteTravelById(id);
				 break; 
			 }
			 case 5:
			 {
				 System.out.println("Enter ID :- ");
				 Long id=sc.nextLong();
				 sc.nextLine();
				  travelController.existsById(id);
				
				 break; 
			 }
			 case 6:
			 {
				long count = travelController.count();
				System.out.println("Total no.s of travel bookings :- "+count);
				 break; 
			 }
			 case 7:
			 {
				TravelEntity travel=new TravelEntity("Bus",150.00);
				travel.setId(1L);
				travelController.delete(travel);
				 break; 
			 }
			 case 8:
			 {
				travelController.deleteAll();
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
