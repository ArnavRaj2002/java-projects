package com.nit.service;

import java.util.Optional;

import com.nit.entity.Vehicle;

public interface IVehicleService {
	void addVehicle(Vehicle vehicle);
	Iterable<Vehicle> getAllVehicles();
	Optional<Vehicle> findVehicleById(Long id);
	Iterable<Vehicle> findVehiclesByIds(Iterable<Long> ids);
	boolean existsById(Long id);
	long count();
	void deleteVehicleById(Long id);
	void deleteVehicle(Vehicle vehicle);
	void deleteAllVehicles(Iterable<Vehicle> vehicles);
	void deleteAllVehicles();

}
