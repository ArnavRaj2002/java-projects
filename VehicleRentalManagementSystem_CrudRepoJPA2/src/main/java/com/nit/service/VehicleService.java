package com.nit.service;

import java.util.Optional;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;

import com.nit.entity.Vehicle;
import com.nit.repo.IVehicleRepository;

public class VehicleService implements IVehicleService {
	@Autowired
	private IVehicleRepository vehicleRepo;

	@Override
	public void addVehicle(Vehicle vehicle) {
		Vehicle save = vehicleRepo.save(vehicle);
		if (vehicle != null)
			System.out.println("one record Inserted !!");
		else
			System.out.println("record not inserted Sucessfully !!");
	}

	@Override
	public Iterable<Vehicle> getAllVehicles() {
 		return null;
	}

	@Override
	public Optional<Vehicle> findVehicleById(Long id) {

		if (vehicleRepo.existsById(id)) {
			Optional<Vehicle> byId = vehicleRepo.findById(id);
			System.out.println(byId);
			return byId;
		} else {
			System.out.println(id + " not exist");
			return Optional.empty();
		}
	}
	// ?? OR
//	@Override
//	public Optional<Vehicle> findVehicleById(Long id) {
//		Optional<Vehicle> byId = vehicleRepo.findById(id);
//		if(byId.isPresent()) 
//			{
//			 System.out.println(byId);
//			 System.out.println(byId.get());
//			 System.out.println("Record having ID : " + id +" Found !!");
//			   
//			}
//		   else System.out.println(id+" not exist");
//		    return byId;
//	}

	@Override
	public Iterable<Vehicle> findVehiclesByIds(Iterable<Long> ids) {
 		return null;
	}

	@Override
	public boolean existsById(Long id) {
		boolean existsById = vehicleRepo.existsById(id);
		if (existsById) {
			System.out.println("is ID :: " + id + " exist in DB ?? " + existsById);
			return true;
		} else {
			System.out.println("is ID :: " + id + " exist in DB ?? " + existsById);
			return false;
		}

	}

	@Override
	public long count() {
 		return 0;
	}

	@Override
	public void deleteVehicleById(Long id) {
		if (vehicleRepo.existsById(id)) {
			vehicleRepo.deleteById(id);
			System.out.println("id:: " + id + " is deleted sucessfully !!");
		} else
			System.out.println(id + " not exist");
	}

	@Override
	public void deleteVehicle(Vehicle vehicle) {
		if (vehicleRepo.existsById(vehicle.getId())) {
			vehicleRepo.delete(vehicle);
			System.out.println("one record is deleted sucessfully !!");
		} else
			System.out.println("Record  doesnot exist");
	}

	@Override
	public void deleteAllVehicles(Iterable<Vehicle> vehicles) {
		if (vehicles != null) {
			vehicleRepo.deleteAll(vehicles); //Deletes all given vehicles from DB
			vehicles.forEach(System.out::println);// Just prints the deleted ones
			//StreamSupport.stream(vehicles.spliterator(), false).forEach(System.out::println);
		}
	}

	@Override
	public void deleteAllVehicles() {
		long count = vehicleRepo.count();
		if(count>0)
		{
			vehicleRepo.deleteAll();
			System.out.println(count+" no. of records deleted sucessfully !!");
		}
		else System.out.println("No record found to delete!!");
	}

}
